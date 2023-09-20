package screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import gamecards.CurrentGameCards

@Composable
fun TopBar(onNavigate: (Screen) -> Unit, turn: Float, score: Int){
    Box(
        modifier = Modifier
            .background(Color(207, 227, 242).copy(alpha = turn))
            .fillMaxWidth()
            .fillMaxHeight(0.16f),
        contentAlignment = Alignment.Center
    )
    {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding( end = 46.dp, start= 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Row(
                modifier = Modifier
                    .padding(start = 16.dp, top = 16.dp, bottom = 16.dp)
                    .fillMaxWidth(0.3f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Box(modifier = Modifier
                    .height(80.dp)
                    .aspectRatio(1f)
                    .background(Color(255, 216, 142), shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Text( text = score.toString(), textAlign = TextAlign.Center, style = MaterialTheme.typography.h3, fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 4.dp))
                }
                Text(text= "Player 1", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.h2)
            }
            ExitButton(onNavigate = onNavigate, previousScreen = Screen.Home)
        }
    }
}

@Composable
fun BottomBarPlayers2( turn: Float, score: Int){
    Box(
        modifier = Modifier
            .background(Color(207, 227, 242).copy(alpha = turn))
            .fillMaxWidth()
            .fillMaxHeight(1f),
        contentAlignment = Alignment.Center
    )
    {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding( end = 16.dp, start= 46.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ){
                Text(text = "InstantMemory", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.h2)
                Image(
                    painter = painterResource("logo.svg"),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .size(100.dp)
                        .padding(start = 20.dp, top = 20.dp)
                )
            }
            Row(
                modifier = Modifier
                    .padding(top = 16.dp, bottom = 16.dp , end = 16.dp)
                    .fillMaxWidth(0.46f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Text(text= "Player 2", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.h2)
                Box(modifier = Modifier
                    .height(80.dp)
                    .aspectRatio(1f)
                    .background(Color(255, 157, 176), shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Text( text = score.toString(), textAlign = TextAlign.Center, style = MaterialTheme.typography.h3, fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 4.dp))
                }
            }
        }
    }
}

@Composable
fun BottomBar(){
    Box(
        modifier = Modifier
            .background(Color(207, 227, 242))
            .fillMaxWidth()
            .fillMaxHeight(1f),
        contentAlignment = Alignment.Center
    )
    {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding( end = 16.dp, start= 46.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ){
                Text(text = "InstantMemory", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.h2)
                Image(
                    painter = painterResource("logo.svg"),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .size(100.dp)
                        .padding(start = 20.dp, top = 20.dp)
                )
            }
        }
    }
}

@Composable
fun ExitButton(
    onNavigate: (Screen) -> Unit,
    previousScreen: Screen
){
    val multipleAction3 = {
        onNavigate(previousScreen)
        CurrentGameCards.gameSession.clear()
    }
    OutlinedButton(
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black),
        border = BorderStroke(0.dp, Color.Transparent),
        onClick = multipleAction3,
        modifier = Modifier
            .size(80.dp),
        shape = CircleShape,
    ) {
        Icon(
            painter = painterResource("exit.svg"),
            contentDescription = "Back",
            tint = Color(207, 227, 242),
            modifier = Modifier
                .size(65.dp)
        )
    }
}