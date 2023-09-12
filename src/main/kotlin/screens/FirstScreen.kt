package screens

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Preview
@Composable
fun FirstScreen(onNavigate: (Screen) -> Unit) {
    Column {
        Text("First Screen")
        Button(onClick = { onNavigate(Screen.Home) }) {
            Text("Go back to Home")
        }
    }
}