package org.example.superkotlin

import App
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}


@Preview(device = "spec:width=1080px,height=2340px,dpi=440", showSystemUi = true,
    showBackground = true
)
@Composable
fun AppAndroidPreview() {
    var text by remember {
        mutableStateOf("")
    }
    Surface() {
        Column(
//            modifier = Modifier.fillMaxWidth()
//                .padding(16.sp)
        ) {

            Text(text = "hello Word Bienvenu")
            Text(text = "hello Word")
            Text(text = "hello Word")
            Row {
                Icon(imageVector = Icons.Outlined.Person, contentDescription = null )
                Icon(imageVector = Icons.Default.Person, contentDescription = null)
            }
            Text(text = text)
            OutlinedTextField(value = text, onValueChange = {text=it} , )

        }
    }
}