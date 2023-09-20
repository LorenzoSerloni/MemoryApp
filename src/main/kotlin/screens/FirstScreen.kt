package screens

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun FirstScreen( onNavigate: (Screen) -> Unit ) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp, end = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        BackButton(onNavigate = onNavigate, previousScreen = Screen.Home)
        VerticalScrollableList(
            layout = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxSize(),
            content = {
                // Create a Column composable to arrange all the title, the description, and the buttons for the topics vertically
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(end = 26.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Choose your difficulty level",
                        style = typography.h2,
                        fontWeight = FontWeight.Bold,
                        color = Color(207, 227, 242),
                    )
                    Spacer(modifier = Modifier.aspectRatio(15f, matchHeightConstraintsFirst = true))
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        CustomButtons(
                            onNavigate = onNavigate,
                            difficultyLevel = Pair("Easy",0),
                            iconNumber = 1,
                            levelColor = Color(173, 223, 172),
                        )
                        Spacer(modifier = Modifier.height(80.dp))
                        CustomButtons(
                            onNavigate = onNavigate,
                            difficultyLevel = Pair("Medium",1),
                            iconNumber = 2,
                            levelColor = Color(255, 216, 142),
                        )
                        Spacer(modifier = Modifier.height(80.dp))
                        CustomButtons(
                            onNavigate = onNavigate,
                            difficultyLevel = Pair("Hard",2),
                            iconNumber = 3,
                            levelColor = Color(255, 157, 176),
                        )
                    }
                }
            }
        )
    }
}

@Composable
fun CustomButtons(
    onNavigate: (Screen) -> Unit,
    difficultyLevel: Pair<String,Int>,
    iconNumber: Int,
    levelColor: Color
){
    val multipleAction1 = {
        onNavigate(Screen.Second)
        ChoiceInfo.info.difficulty = difficultyLevel
    }
    Button(
        onClick = { multipleAction1() },
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .heightIn(min = 150.dp)
            .fillMaxWidth(0.5f)
            .padding(start = 96.dp, end = 96.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = levelColor,
        ),
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(start=50.dp, end=50.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = difficultyLevel.first, style = typography.h2, fontWeight = FontWeight.SemiBold, color = Color(255, 255, 255))
            Spacer(modifier = Modifier.width(80.dp))
            Row(
                modifier = Modifier
            ) {
                repeat(iconNumber) {
                    Icon(
                        painter = painterResource("level.svg"),
                        contentDescription = "Lock",
                        tint = Color(255, 255, 255),
                        modifier = Modifier
                            .size(70.dp)
                            .padding(start = 16.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun BackButton(
    onNavigate: (Screen) -> Unit,
    previousScreen: Screen
){
    OutlinedButton(
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
        border = BorderStroke(0.dp, Color.Transparent),
        onClick = { onNavigate(previousScreen)},
        modifier = Modifier
            .size(90.dp)
            .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp),
        shape = CircleShape,
    ) {
        Icon(
            painter = painterResource("vector.svg"),
            contentDescription = "Back",
            tint = Color(207, 227, 242),
            modifier = Modifier
                .size(90.dp)
        )
    }
}
