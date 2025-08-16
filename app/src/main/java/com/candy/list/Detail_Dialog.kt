package com.candy.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog

@Composable
fun Detail()
{
	Dialog(
		onDismissRequest = { /*TODO*/ },
	)
	{
		Column(

		)
		{
			//image
			Box(
				modifier = Modifier.fillMaxWidth()
					.height(100.dp)
			)
			{
				Image(
					painter = painterResource(id = R.drawable.img1),
					contentDescription = "背景图片",
					contentScale = ContentScale.Crop,

					modifier = Modifier.blur(
						radiusX = 5.dp,
						radiusY = 5.dp,
						edgeTreatment = BlurredEdgeTreatment(RoundedCornerShape(4.dp))
					)
				)
				Row(
					horizontalArrangement = Arrangement.Center,
					verticalAlignment = Alignment.CenterVertically,

					modifier = Modifier.fillMaxSize()
				)
				{
					Text(
						text = "🍥第一次吃糖",
						fontWeight = FontWeight.Bold,
						fontSize = 24.sp

					)
				}
			}
			Text(
				text = "第一次HRT的时间",

				modifier = Modifier.padding(16.dp)
			)
			Row(
				horizontalArrangement = Arrangement.Center,
				verticalAlignment = Alignment.Bottom,

				modifier = Modifier.fillMaxWidth()
			)
			{
				Text(
					text = "开始于 2024-10-19"
				)
			}
		}
	}
}

@Preview(showBackground = true)
@Composable
fun Detail_Preview()
{
	Detail()
}