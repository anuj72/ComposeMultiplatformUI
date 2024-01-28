import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import component.CheckBoxExample
import component.DatePickerExample
import component.DialogExamples
import component.DividerExample
import component.FilledButtonExample
import component.FilledCardExample
import component.InputChipExample
import component.MediumTopAppBarExample
import component.ProgressBarExample
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class, ExperimentalMaterial3Api::class)
@Composable
fun App() {
    MaterialTheme {
        val showContent by remember { mutableStateOf(false) }
        val greeting = remember { Greeting().greet() }
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {

            FilledButtonExample(onClick = {})
            CheckBoxExample()
            DialogExamples()
            DividerExample()
            ProgressBarExample()
            DatePickerExample()
            LazyRow {
                items(10){
                    InputChipExample(text = "Input Chip", onDismiss = {})
                }
            }


            FilledCardExample()
            MediumTopAppBarExample()


            AnimatedVisibility(showContent) {
                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painterResource("compose-multiplatform.xml"), null)
                    Text("Compose: $greeting")
                }
            }
        }
    }
}