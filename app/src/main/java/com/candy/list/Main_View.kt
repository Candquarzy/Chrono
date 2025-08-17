package com.candy.list

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.candy.list.data.Data.card_data


@RequiresApi(Build.VERSION_CODES.O)
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
				Row(
					verticalAlignment = Alignment.CenterVertically,
					horizontalArrangement = Arrangement.Center,
					modifier = Modifier.fillMaxSize()
				)
				{
					Text(
						text = "这是我的记录", //h1 title 大标题
						fontSize = 32.sp,
						fontWeight = FontWeight.ExtraBold,
						color = Color.Black,
					)
				}
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