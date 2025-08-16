package com.candy.list.unit

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.temporal.ChronoUnit


@RequiresApi(Build.VERSION_CODES.O)
fun Times(date_string: String): String
{
	val now: LocalDate = LocalDate.now()
	val date_time: LocalDate = LocalDate.parse(date_string)

	val last_day = ChronoUnit.DAYS.between(date_time, now)

	return last_day.toString()
}