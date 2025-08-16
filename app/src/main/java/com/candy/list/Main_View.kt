package com.candy.list

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import com.candy.list.data.Data.card_data


@Composable
fun Main_View(innerPadding: PaddingValues)
{
	Column(
		modifier = Modifier.padding(innerPadding)
	)
	{
		Row(
			horizontalArrangement = Arrangement.Center,
			modifier = Modifier.padding(16.dp)
				.fillMaxWidth()
		)
		{
			Card(
				shape = RoundedCornerShape(30.dp),
				elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
				colors = CardDefaults.cardColors(White),
				modifier = Modifier.height(55.dp)
					.width(280.dp)
			)
			{
				Text(
					text = "Candy🍥的记录",
					fontSize = 32.sp,
					fontWeight = FontWeight.ExtraBold,
					textAlign = TextAlign.Center,
					color = Color.Black,
					modifier = Modifier.fillMaxSize()
				)
			}
		}

		LazyColumn(

		)
		{
			items(card_data.size) {
				Card_Design(card_data[it])
			}
		}
	}
}

//@Preview(showBackground = true)
//@Composable
//fun Card_View_Preview()
//{
//	ListTheme {
//		Card_View(innerPadding)
//	}
//}