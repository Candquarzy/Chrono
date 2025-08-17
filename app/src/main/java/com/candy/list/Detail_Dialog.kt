package com.candy.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material3.Card
import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.candy.list.data.Card_Data


@Composable
fun Detail(show:() -> Unit, data: Card_Data)
{
	Dialog(
		onDismissRequest = show
	)
	{
		Column(

		)
		{
			Card(
				shape = RoundedCornerShape(25.dp),

				modifier = Modifier.fillMaxWidth()
					.width(350.dp)
			)
			{
				Column(

				)
				{
					Box(
						modifier = Modifier.fillMaxWidth()
							.height(100.dp)
					)
					{
						Image(
							painter = painterResource(id = data.image),
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
								text = data.title,
								fontWeight = FontWeight.ExtraBold,
								fontSize = 28.sp,
								color = data.color,
								style = TextStyle(
									shadow = Shadow(
										color = Color.Gray, offset = Offset(3f, 3f), blurRadius = 3f
									)
								)
							)
						}
					}

					val scroll = rememberScrollState()
					Column(
						modifier = Modifier.heightIn(min = 150.dp, max = 450.dp)
							.verticalScroll(scroll)
							.padding(horizontal = 16.dp)
					)
					{
						Text(
							text = data.text,
							fontSize = 16.sp,
							modifier = Modifier.padding(top = 8.dp)
						)
					}

					Row(
						horizontalArrangement = Arrangement.Center,
						verticalAlignment = Alignment.Bottom,

						modifier = Modifier.fillMaxWidth()
							.padding(vertical = 16.dp)
					)
					{
						Text(
							text = "开始于 " + data.start,
							fontWeight = FontWeight.SemiBold,
							fontSize = 20.sp
						)
					}
				}
			}

			Row(
				horizontalArrangement = Arrangement.Center,
				verticalAlignment = Alignment.Bottom,

				modifier = Modifier.fillMaxWidth()
					.padding(top = 16.dp)
			)
			{
				FilledTonalIconButton(
					onClick = show,

					)
				{
					Icon(
						painter = rememberVectorPainter(Icons.Rounded.Close),
						contentDescription = "close",
					)
				}
			}
		}
	}
}

//@Preview(showBackground = true)
//@Composable
//fun Detail_Preview()
//{
//	Detail(
//		show = {
//		false
//		}
//	)
//}