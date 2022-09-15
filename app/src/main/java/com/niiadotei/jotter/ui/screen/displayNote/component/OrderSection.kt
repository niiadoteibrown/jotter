package com.niiadotei.jotter.ui.screen.displayNote.component

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.niiadotei.jotter.domain.util.NoteOrder
import com.niiadotei.jotter.domain.util.OrderType

@Composable
fun OrderSection(
    modifier: Modifier = Modifier,
    noteOrder: NoteOrder = NoteOrder.Date(orderType = OrderType.Descending),
    onOrderChange: (NoteOrder) -> Unit
) {
    Column(
        modifier = modifier
    ) {
        Row(
          modifier = Modifier.fillMaxWidth()
        ) {
            DefaultRadioButton(
                text = "Title",
                selected = noteOrder is NoteOrder.Title
            ) {
                onOrderChange(NoteOrder.Title(noteOrder.orderType))
            }
            
            Spacer(modifier = Modifier.width(width = 8.dp))

            DefaultRadioButton(
                text = "Date",
                selected = noteOrder is NoteOrder.Date
            ) {
                onOrderChange(NoteOrder.Date(noteOrder.orderType))
            }

            Spacer(modifier = Modifier.width(width = 8.dp))

            DefaultRadioButton(
                text = "Color",
                selected = noteOrder is NoteOrder.Color
            ) {
                onOrderChange(NoteOrder.Color(noteOrder.orderType))
            }

        }

        Spacer(modifier = Modifier.height(height = 16.dp))

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            DefaultRadioButton(
                text = "Ascending",
                selected = noteOrder.orderType is OrderType.Ascending
            ) {
                onOrderChange(noteOrder.copy(orderType = OrderType.Ascending))
            }

            Spacer(modifier = Modifier.width(width = 8.dp))

            DefaultRadioButton(
                text = "Descending",
                selected = noteOrder.orderType is OrderType.Descending
            ) {
                onOrderChange(noteOrder.copy(orderType = OrderType.Descending))
            }
        }
    }
}