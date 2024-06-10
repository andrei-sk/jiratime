package eu.starbug.jiratime.ui.feature.issuelist

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

data class IssueItemVo(
    val id: String,
    val title: String,
)

@Composable
fun IssueItem(
    model: IssueItemVo,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .background(
                color = Color.White,
                shape = RoundedCornerShape(size = 8.dp)
            )
            .padding(all = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = model.id
        )
        Text(
            text = model.title
        )
    }
}

