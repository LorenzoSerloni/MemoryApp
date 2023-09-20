package screens

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import gamecards.CurrentGameCards
import gamecards.GamingCard

@Composable
fun GameScreen(onNavigate: (Screen) -> Unit) {
    var turn by remember { mutableStateOf(0.90F) }
    var score by remember { mutableStateOf(0) }
    val numCards by remember {
        mutableStateOf(
            when (ChoiceInfo.info.difficulty.second) {
                0 -> 6
                1 -> 8
                2 -> 10
                else -> 6
            }
        )
    }
    TopBar(onNavigate, turn, score)
    playingCard(numCards)
    val gameSessionList = CurrentGameCards.gameSession.toList()
    var duplicatedGameSession = (gameSessionList + gameSessionList).shuffled()
    Box(
        modifier = Modifier
            .fillMaxHeight(0.8f)
            .background(Color.Transparent)
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                for (i in 0 until numCards) {
                    val index = i % duplicatedGameSession.size
                    FlippableCard(duplicatedGameSession[index], onCardClicked = {
                        duplicatedGameSession[index].isFaceUp = !duplicatedGameSession[index].isFaceUp
                    }, ChoiceInfo.info.difficulty.second.toInt())
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                for (i in numCards until numCards * 2) {
                    val index = i % duplicatedGameSession.size
                    FlippableCard(duplicatedGameSession[index], onCardClicked = {
                        duplicatedGameSession[index].isFaceUp = !duplicatedGameSession[index].isFaceUp
                    }, ChoiceInfo.info.difficulty.second.toInt())
                }
            }
        }
    }

    if (ChoiceInfo.info.players.toInt() == 2) {
        BottomBarPlayers2(onNavigate, turn, score)
    } else {
        BottomBar()
    }
}

@Composable
fun FlippableCard(card: GamingCard, onCardClicked: () -> Unit, size : Int) {
    var rotated by remember { mutableStateOf(false) }

    val rotation by animateFloatAsState(
        targetValue = if (rotated) 180f else 0f,
        animationSpec = tween(300)
    )

    val animateFront by animateFloatAsState(
        targetValue = if (!rotated) 1f else 0f,
        animationSpec = tween(300)
    )

    val animateBack by animateFloatAsState(
        targetValue = if (rotated) 1f else 0f,
        animationSpec = tween(300)
    )
    Card(
        when(size){
            0 -> Modifier
                .height(350.dp)
                .width(250.dp)
                .padding(15.dp)
                .graphicsLayer {
                    rotationY = rotation
                    cameraDistance = 8 * density
                }.clickable {
                    rotated = !rotated
                    onCardClicked()
                }
            1 -> Modifier
                .height(300.dp)
                .width(200.dp)
                .padding(8.dp)
                .graphicsLayer {
                    rotationY = rotation
                    cameraDistance = 8 * density
                }
                .clickable {
                    rotated = !rotated
                    onCardClicked()
                }
            2 -> Modifier
                .height(250.dp)
                .width(160.dp)
                .padding(6.dp)
                .graphicsLayer {
                    rotationY = rotation
                    cameraDistance = 8 * density
                }
                .clickable {
                    rotated = !rotated
                    onCardClicked()
                }
            else -> Modifier
                .height(350.dp)
                .width(150.dp)
                .padding(10.dp)
                .graphicsLayer {
                    rotationY = rotation
                    cameraDistance = 8 * density
                }
                .clickable {
                    rotated = !rotated
                    onCardClicked()
                }
        },
        shape = RoundedCornerShape(35.dp),
        elevation = 8.dp,
        border = BorderStroke(16.dp, Color.Black)
    ) {
        if (rotated) {
            Column(
                Modifier.fillMaxSize(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                when (size) {
                    0 -> Image(
                        painter = painterResource(card.fileName),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(250.dp)
                            .background(shape = RoundedCornerShape(8.dp), color = Color.Transparent)
                    )

                    1 -> Image(
                        painter = painterResource(card.fileName),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .background(shape = RoundedCornerShape(8.dp), color = Color.Transparent)
                    )

                    2 -> Image(
                        painter = painterResource(card.fileName),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(170.dp)
                            .background(shape = RoundedCornerShape(8.dp), color = Color.Transparent)
                    )
                }
                Row(
                    Modifier.fillMaxSize(1f),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    when (size) {
                        0 -> Text(
                            text = card.name,
                            modifier = Modifier
                                .graphicsLayer {
                                    alpha = if (rotated) animateBack else animateFront
                                    rotationY = rotation
                                }
                                .padding(bottom = 20.dp),
                            style = MaterialTheme.typography.h4,
                            fontWeight = FontWeight.Bold,
                        )

                        1 -> Text(
                            text = card.name,
                            modifier = Modifier
                                .graphicsLayer {
                                    alpha = if (rotated) animateBack else animateFront
                                    rotationY = rotation
                                }
                                .padding(bottom = 20.dp),
                            style = MaterialTheme.typography.h5,
                            fontWeight = FontWeight.Bold,
                        )

                        2 -> Text(
                            text = card.name,
                            modifier = Modifier
                                .graphicsLayer {
                                    alpha = if (rotated) animateBack else animateFront
                                    rotationY = rotation
                                }
                                .padding(bottom = 20.dp),
                            style = MaterialTheme.typography.h6,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
            }
        } else{
            Image(
                painter = painterResource("backcard.svg"),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxSize()
                    .background(shape = RoundedCornerShape(8.dp), color = Color.Transparent)
            )
        }
    }
}
