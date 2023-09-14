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
import androidx.compose.foundation.layout.Row
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign

@Composable
fun HomeScreen(onNavigate: (Screen) -> Unit) {
    val logoPainter = painterResource("logo.svg")
    // Create a VerticalScrollableList composable in order to make the content scrollable for small screens
    VerticalScrollableList(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 80.dp)
            .aspectRatio(1.7f, matchHeightConstraintsFirst = true),
        content = {
            // Create a Column composable to arrange all the title the description and the buttons for the topics vertically
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Create a Row composable to arrange the title and the logo horizontally
                Row(
                    modifier = Modifier
                        .padding(vertical = 16.dp)
                        .fillMaxWidth()
                        .heightIn(min = 100.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    MaterialTheme {
                        Text(
                            "InstantMemory",
                            fontWeight = FontWeight.Bold,
                            color = Color(207, 227, 242),
                            style = typography.h1,
                        )
                    }
                    Image(
                        painter = logoPainter,
                        contentDescription = "Logo",
                        modifier = Modifier
                            .size(150.dp)
                            .padding(start = 20.dp, top = 30.dp)
                    )
                }
                // Create a Text composable to display the description of the app
                MaterialTheme {
                    Text(
                        "Choose a topic:",
                        modifier = Modifier
                            .padding(top = 40.dp)
                            .fillMaxWidth()
                            .alpha(0.99f),
                        fontWeight = FontWeight.Bold,
                        style = typography.h4,
                        color = Color(207, 227, 242),
                        textAlign = TextAlign.Center
                    )
                }
            }
            // Create a Column composable to arrange the rows of 3 buttons for the topics vertically one below the others
            Column(modifier = Modifier
                .fillMaxSize()
                .padding(40.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
            )
            {
                TopicButtons(
                    topics = listOf("Animals", "Fruits & Vegetables", "School objects"),
                    onNavigate = onNavigate,
                    nameImages = listOf("animals.png", "fruits.png", "school.png"),
                )
                Spacer(modifier = Modifier
                    .aspectRatio(25f, matchHeightConstraintsFirst = true)
                )
                TopicButtons(
                    topics = listOf("Clothes", "Jobs", "Toys"),
                    onNavigate = onNavigate,
                    nameImages = listOf("clothes.png", "jobs.png", "toys.png"),
                )
                Spacer(modifier = Modifier
                    .aspectRatio(25f, matchHeightConstraintsFirst = true)
                )
                TopicButtons(
                    topics = listOf("Foods", "Actions", "Letters & Numbers"),
                    onNavigate = onNavigate,
                    nameImages = listOf("foods.png", "actions.png", "letters.png"),
                )
            }
        }
    )
}

@Composable
// Create a TopicButtons composable to display the buttons for the topics in order to make the code more readable
fun TopicButtons(
    topics: List<String?>,
    onNavigate: (Screen) -> Unit,
    nameImages: List<String>
) {
    // Create a Row composable to arrange the buttons for the topics horizontally and use the space evenly to make it more responsive, but I'm not completely satisfied with the result
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
        topics.filterNotNull().forEach { topic ->
            val imageName = nameImages[topics.indexOf(topic)]
            val multipleAction = {
                onNavigate(Screen.First)
                ChoiceInfo.info.category = topic
            }
                    // Create a Button composable for each topic
                    Button(
                        onClick = { multipleAction() },
                        shape = RoundedCornerShape(20.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .heightIn(min = 80.dp, max = 140.dp)
                            .weight(1.5f)
                            .padding(start = 40.dp, end = 40.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color(207, 227, 242),
                        ),
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(start=20.dp, end=20.dp),
                            horizontalArrangement = Arrangement.SpaceAround,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = topic,
                                fontWeight = FontWeight.Bold,
                                color = Color(0, 0, 0),
                                textAlign = TextAlign.Left,
                                style = typography.h4,
                                modifier = Modifier
                                    .padding(start = 20.dp)
                                    .fillMaxWidth(0.7f)
                            )
                            Image(
                                painter = painterResource(imageName),
                                contentDescription = "",
                                modifier = Modifier
                                    .widthIn(min = 80.dp, max = 150.dp)
                                    .height(80.dp)
                                    .fillMaxHeight()
                                    .padding(8.dp),
                                contentScale = ContentScale.FillWidth,
                                alignment = Alignment.Center
                            )
                        }
                    }
        }
        }
    }

@Composable
// Create a VerticalScrollableList composable in order to make the content scrollable for small screens
fun VerticalScrollableList(
    modifier: Modifier = Modifier.fillMaxSize(),
    content: @Composable () -> Unit,
    layout: Arrangement.Vertical = Arrangement.SpaceEvenly
) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState()),
        verticalArrangement = layout
    ) {
        content()
    }
}
