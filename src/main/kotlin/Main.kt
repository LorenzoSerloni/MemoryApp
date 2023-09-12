import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.*
import screens.FirstScreen
import screens.HomeScreen
import screens.Screen

@Preview
@Composable
fun App() {
    var currentScreen by remember { mutableStateOf(Screen.Home) }
        Box(
            modifier = Modifier.paint(
                painter = painterResource("background.png"),
                alpha = 1f,
                contentScale = ContentScale.FillBounds
            )
        ) {
            when (currentScreen) {
                Screen.Home -> HomeScreen(
                    onNavigate = { newScreen ->
                        currentScreen = newScreen
                    }
                )
                Screen.First -> FirstScreen(
                    onNavigate = { newScreen ->
                        currentScreen = newScreen
                    }
                )
            }
        }
    }

fun main() = application {
    val windowState = rememberWindowState(placement = WindowPlacement.Maximized)
    Window(
        onCloseRequest = ::exitApplication,
        title = "InstantMemory",
        state = windowState,
        resizable = true, // Allow window resizing
        icon = painterResource("logo.bmp")
    ) {
        App()
    }
}





