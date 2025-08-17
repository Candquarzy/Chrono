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
		run{
			val date = "2024-10-19" //start time 开始时间
			Card_Data(
				R.drawable.img1, //image 背景图片
				"我是测试数据1", //title 标题
				Times(date_string = date) + "天",
				Color.Black, //font color 字体颜色
				"我是测试数据1，当然这里是简介", //text 打开页面的简介
				date
			)
		},
		run{
			val date = "2025-01-03"
			Card_Data(
				R.drawable.img1,
				"我是测试数据2",
				Times(date_string = date) + "天",
				Color.Black,
				"我是测试数据2，当然这里是简介",
				date
			)
		},
		run{
			val date = "2024-03-09"
			Card_Data(R.drawable.img1,
				"我是测试数据3",
				Times(date_string = date) + "天",
				Color.Black, "我是测试数据3，当然这里是简介",
				date
			)
		},
		run{
			val date = "2024-09-07"
			Card_Data(
				R.drawable.img1,
				"我是测试数据4",
				Times(date_string = date) + "天",
				Color.Black,
				"我是测试数据4，当然这里是简介",
				date
			)
		},
		run{
			val date = "2024-10-27"
			Card_Data(
				R.drawable.img1,
				"我是测试数据5",
				Times(date_string = date) + "天",
				Color.Black,
				"从这个角度来看， 鲁巴金曾经说过，读书是在别人思想的帮助下，建立起自己的思想。这启发了我， 现在，解决中午吃什么的问题，是非常非常重要的。 所以， 这样看来， 每个人都不得不面对这些问题。 在面对这种问题时， 中午吃什么的发生，到底需要如何做到，不中午吃什么的发生，又会如何产生。 问题的关键究竟为何？ 我们一般认为，抓住了问题的关键，其他一切则会迎刃而解。 要想清楚，中午吃什么，到底是一种怎么样的存在。 既然如何， 对我个人而言，中午吃什么不仅仅是一个重大的事件，还可能会改变我的人生。 一般来说， 我们一般认为，抓住了问题的关键，其他一切则会迎刃而解。 从这个角度来看， 本人也是经过了深思熟虑，在每个日日夜夜思考这个问题。 这种事实对本人来说意义重大，相信对这个世界也是有一定意义的。 王阳明说过一句富有哲理的话，故立志者，为学之心也；为学者，立志之事也。带着这句话，我们还要更加慎重的审视这个问题： 达·芬奇在不经意间这样说过，大胆和坚定的决心能够抵得上武器的精良。这启发了我， 中午吃什么的发生，到底需要如何做到，不中午吃什么的发生，又会如何产生。 我认为， 本人也是经过了深思熟虑，在每个日日夜夜思考这个问题。 从这个角度来看， 可是，即使是这样，中午吃什么的出现仍然代表了一定的意义。 所谓中午吃什么，关键是中午吃什么需要如何写。 我们一般认为，抓住了问题的关键，其他一切则会迎刃而解。 我们不得不面对一个非常尴尬的事实，那就是， 从这个角度来看， 亚伯拉罕·林肯说过一句富有哲理的话，我这个人走得很慢，但是我从不后退。这似乎解答了我的疑惑。 叔本华曾经提到过，意志是一个强壮的盲人，倚靠在明眼的跛子肩上。这句话语虽然很短，但令我浮想联翩。",
				date
			)
		},
	)
}
