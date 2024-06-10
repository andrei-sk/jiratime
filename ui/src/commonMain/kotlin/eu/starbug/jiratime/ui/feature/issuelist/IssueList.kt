package eu.starbug.jiratime.ui.feature.issuelist

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun IssueList(
    items: List<IssueItemVo>,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
            .background(
                color = Color.LightGray,
                shape = RoundedCornerShape(size = 16.dp)
            )
            .padding(all = 8.dp)
    ) {
        items(items) {
            IssueItem(
                model = it
            )
        }
    }
}