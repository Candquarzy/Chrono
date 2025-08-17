package com.candy.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.candy.list.data.Card_Data
import com.candy.list.font.fz_font

@Composable
fun Card_Design(data: Card_Data)
{
	var dialog_show by remember { mutableStateOf(false) }

	Card(
		shape = RoundedCornerShape(25.dp),
		elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),

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

				modifier = Modifier.fillMaxSize()
					.clip(RoundedCornerShape(25.dp))
					.blur(
					radiusX = 5.dp,
					radiusY = 5.dp,
					edgeTreatment = BlurredEdgeTreatment(RoundedCornerShape(3.dp))
				)
					.clickable{
						dialog_show = true
				}
			)

			Row(
				modifier = Modifier.padding(16.dp)
			)
			{
				Text(
					text = data.title,
					fontWeight = FontWeight.ExtraBold,
					color = data.color,
					fontSize = 28.sp,
					style = TextStyle(
						shadow = Shadow(
							color = Color.Gray, offset = Offset(3f, 3f), blurRadius = 3f
						)
					)
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

		if(dialog_show)
		{
			Detail(
				show = {
					dialog_show = false
				},
				data
			)
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