package ZeroFoundation

/**
 * Created by Danny on 2018/6/23.
 */

fun diaryGenerater(placeName: String): String{
	var temple = """
				今天天气晴朗，万里无云，我们去$placeName 游玩，
				首先映入眼帘的是，$placeName ${placeName.length}个鎏金大字。
		"""
	return temple
}

fun main(args: Array<String>) {
	var diary = diaryGenerater("白云山")
	println(diary)
}
