package screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Row
import androidx.compose.material.ButtonDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

@Composable
fun HomeScreen(onNavigate: (Screen) -> Unit) {
    val logoPainter = painterResource("logo.png")
    VerticalScrollableList(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp),
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(80.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .align(Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically
                ){
                Text(
                    "InstantMemory",
                    fontWeight = FontWeight.Bold,
                    fontSize = 104.sp
                )
                Image(
                    painter = logoPainter,
                    contentDescription = "Logo",
                    modifier = Modifier
                        .size(100.dp)
                        .padding(start = 20.dp, top = 20.dp)
                )
                }
                Text(
                    "Choose a topic:",
                    modifier = Modifier
                        .padding(top = 40.dp)
                        .align(Alignment.CenterHorizontally),
                    fontWeight = FontWeight.Bold,
                    fontSize = 34.sp
                )
                Spacer(modifier = Modifier.height(130.dp))
                TopicButtons(
                    topics = listOf("Animals", "Fruits & Vegetables", "School objects"),
                    onNavigate = onNavigate
                )
                Spacer(modifier = Modifier.height(50.dp))
                TopicButtons(
                    topics = listOf("Clothes", "Jobs", "Toys"),
                    onNavigate = onNavigate
                )
                Spacer(modifier = Modifier.height(50.dp))
                TopicButtons(
                    topics = listOf("Foods", "Actions", "Fruits & Vegetables"),
                    onNavigate = onNavigate
                )
            }
        }
    )
}

@Composable
fun TopicButtons(
    topics: List<String?>,
    onNavigate: (Screen) -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        topics.filterNotNull().forEach { topic ->
            Button(
                onClick = { onNavigate(Screen.First) },
                shape = RoundedCornerShape(20.dp),
                modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .heightIn(min = 100.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color(34, 113, 173)
                )
            ) {
                Text(text = topic, fontWeight = FontWeight.Bold, fontSize = 16.sp)
            }
        }
    }
}

@Composable
fun VerticalScrollableList(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
    ) {
        content()
    }
}
