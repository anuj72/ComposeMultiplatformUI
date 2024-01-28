package component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FilledButtonExample(onClick: () -> Unit) {
    Button(onClick = { onClick() }, modifier = Modifier.fillMaxWidth().height(65.dp)) {
        Text("Filled")
    }
}