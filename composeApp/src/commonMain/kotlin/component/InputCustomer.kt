package component

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun Input() {
    val value = remember { mutableStateOf("") }
    Column {
        Text("Autre texte ...")

    }
}