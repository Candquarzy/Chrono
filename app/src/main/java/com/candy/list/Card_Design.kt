package com.candy.list

import android.R.attr.data
import android.R.attr.fontWeight
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.candy.list.data.Card_Data
import com.candy.list.data.Data.card_data
import com.candy.list.font.fz_font
import com.candy.list.ui.theme.ListTheme

@Composable
fun Card_Design(data: Card_Data)
{
	Card(
		shape = RoundedCornerShape(25.dp),
		elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
		onClick = {
			/* TODO */
		},

		modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp)
			.requiredHeight(150.dp)
			.fillMaxWidth()
	)
	{
		Box(

		)
		{
			Image(
				painter = painterResource(data.image),
				contentDescription = "背景图片",
				contentScale = ContentScale.Crop,

				modifier = Modifier.blur(
					radiusX = 5.dp,
					radiusY = 5.dp,
					edgeTreatment = BlurredEdgeTreatment(RoundedCornerShape(3.dp))
				)
			)

			Row(
				modifier = Modifier.padding(16.dp)
			)
			{
				Text(
					text = data.title,
					fontWeight = FontWeight.Bold,
					color = data.color,
					fontSize = 28.sp,

					)
			}
			Row(
				verticalAlignment = Alignment.Bottom,
				modifier = Modifier.fillMaxSize()
					.padding(vertical = 16.dp, horizontal = 24.dp)
			)
			{
				Text(
					text = data.time,
					fontFamily = fz_font,
					fontWeight = FontWeight.SemiBold,
					fontSize = 42.sp,
					color = data.color,
					textAlign = TextAlign.End,

					modifier = Modifier.fillMaxWidth()
				)
			}
		}
	}
}

//@Preview
//@Composable
//fun Card_Design_Preview()
//{
//	ListTheme{
//		Card_Design()
//	}
//}