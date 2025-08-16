package com.candy.list.data

import androidx.compose.ui.graphics.Color

data class Card_Data(
	val image: Int,
	val title: String,
	val time: String,
	var color: Color = Color.Black,
	var text: String,
	var start: String,
)
