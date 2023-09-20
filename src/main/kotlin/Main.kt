
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import screens.*

@Preview
@Composable
fun App() {
    // Create a mutable state to keep track of the current screen
    var currentScreen by remember { mutableStateOf(Screen.Home) }
    // A Box composable containing my app's content
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(123, 168, 202)),
    ) {
        // Depending on the currentScreen value, display either the HomeScreen or FirstScreen
        // I tried to use this navigation approach because I don't find more information about navigation in Compose Desktop
        when (currentScreen) {
            Screen.Home -> HomeScreen(
                onNavigate = { newScreen ->
                    currentScreen = newScreen
                },
            )
            Screen.First -> FirstScreen(
                onNavigate = { newScreen ->
                    currentScreen = newScreen
                }
            )
            Screen.Second -> SecondScreen(
                onNavigate = { newScreen ->
                    currentScreen = newScreen
                },
            )
            Screen.GameScreen -> GameScreen(
                onNavigate = { newScreen ->
                    currentScreen = newScreen
                },
            )
        }
    }
}

fun main() = application {
    // Define the initial window state, maximized in this case
    // Because I want my app to be displayed in full screen once you open it
    val windowState = rememberWindowState(placement = WindowPlacement.Maximized)
    // Create the main application window
    Window(
        onCloseRequest = ::exitApplication,
        title = "InstantMemory",
        state = windowState,
        resizable = true,
        icon = painterResource("logo.svg")
    ) {
        App() // Call the App() Composable function to build and display the app content
    }
}






