package screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun SecondScreen(onNavigate: (Screen) -> Unit){
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp, end = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        BackButton(onNavigate = onNavigate, previousScreen = Screen.First)
        VerticalScrollableList(
            layout = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxSize(),
            content = {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(end = 26.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween
                )
                {
                    Text(
                        text = "How many players want to play?",
                        style = typography.h2,
                        fontWeight = FontWeight.Bold,
                        color = Color(207, 227, 242),
                    )
                    Spacer(modifier = Modifier.aspectRatio(10f, matchHeightConstraintsFirst = true))
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        PlayerButton(onNavigate = onNavigate, playerNumber = "1", nextScreen = Screen.GameScreen, buttonColor = colorChoice())
                        PlayerButton(onNavigate = onNavigate, playerNumber = "2", nextScreen = Screen.GameScreen, buttonColor = colorChoice())
                    }
                    Spacer(modifier = Modifier.aspectRatio(10f, matchHeightConstraintsFirst = true))
                }
            }
        )
    }
}
fun colorChoice(): Color {
    return when (ChoiceInfo.info.difficulty.first) {
        "Easy" -> Color(173, 223, 172)
        "Medium" -> Color(255, 216, 142)
        "Hard" -> Color(255, 157, 176)
        else -> Color.Gray // Add a default color in case none of the conditions match
    }
}

@Composable
fun PlayerButton(
    onNavigate: (Screen) -> Unit,
    playerNumber: String,
    nextScreen: Screen,
    buttonColor: Color,
){
    val multipleAction2 = {
        onNavigate(nextScreen)
        ChoiceInfo.info.players = playerNumber
    }
    Button(
        onClick = { multipleAction2() },
        modifier = Modifier
            .width(190.dp)
            .height(190.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = buttonColor,
        ),
        shape = RoundedCornerShape(20),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
        Icon(
            painter = painterResource("player.svg"),
            contentDescription = "",
            modifier = Modifier
                .width(80.dp)
                .height(80.dp)
                .fillMaxHeight()
                .padding(8.dp),
            tint = Color(255, 255, 255),
        )
        Text(
            text = playerNumber,
            color = Color(255, 255, 255),
            style = typography.h4,
            fontWeight = FontWeight.Bold,
        )
        }
    }
}