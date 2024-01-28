package component

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon

import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember

@Composable
fun SegmentButtonExample(){


   /* val checkedList = remember { mutableStateListOf<Int>() }
    val options = listOf("Favorites", "Trending", "Saved")
    val icons = listOf(
        Icons.Filled.StarBorder,
        Icons.AutoMirrored.Filled.TrendingUp,
        Icons.Filled.BookmarkBorder
    )
    MultiChoiceSegmentedButtonRow {
        options.forEachIndexed { index, label ->
            SegmentedButton(
                shape = SegmentedButtonDefaults.itemShape(index = index, count = options.size),
                icon = {
                    SegmentedButtonDefaults.Icon(active = index in checkedList) {
                        Icon(
                            imageVector = icons[index],
                            contentDescription = null,
                            modifier = Modifier.size(SegmentedButtonDefaults.IconSize)
                        )
                    }
                },
                onCheckedChange = {
                    if (index in checkedList) {
                        checkedList.remove(index)
                    } else {
                        checkedList.add(index)
                    }
                },
                checked = index in checkedList
            ) {
                Text(label)
            }
        }
    }*/
}