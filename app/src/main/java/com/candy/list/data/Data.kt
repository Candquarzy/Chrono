package com.candy.list.data

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.ui.graphics.Color
import com.candy.list.R
import com.candy.list.unit.Times

object Data
{
	@RequiresApi(Build.VERSION_CODES.O)
	val card_data:List<Card_Data> = listOf(
		Card_Data(R.drawable.img1, "🍥第一次吃糖", Times(date_string = "2024-10-19") + "天", Color.Black),
		Card_Data(R.drawable.img1, "🍥第一次吃糖", Times(date_string = "2024-10-19") + "天", Color.Black),
		Card_Data(R.drawable.img1, "🍥第一次吃糖", Times(date_string = "2024-10-19") + "天", Color.Black),
		Card_Data(R.drawable.img1, "🍥第一次吃糖", Times(date_string = "2024-10-19") + "天", Color.Black),
		Card_Data(R.drawable.img1, "🍥第一次吃糖", Times(date_string = "2024-10-19") + "天", Color.Black),
		Card_Data(R.drawable.img1, "🍥第一次吃糖", Times(date_string = "2024-10-19") + "天", Color.Black),
	)
}
