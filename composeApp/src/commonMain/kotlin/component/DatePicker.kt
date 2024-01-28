package component
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DatePicker
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun DatePickerExample(){


            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                // Pre-select a date for January 4, 2020
                val datePickerState = rememberDatePickerState(initialSelectedDateMillis = 1578096000000)
                DatePicker(state = datePickerState, modifier = Modifier.padding(16.dp))

                Text(
                    "Selected date timestamp: ${datePickerState.selectedDateMillis ?: "no selection"}",
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }
}
