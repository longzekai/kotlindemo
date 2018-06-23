package ZeroFoundation

/**
 * Created by Danny on 2018/6/23.
 */
fun main(args: Array<String>) {
	val result = heat("oil")
	println(result)
	println(heat(null))
}

/**
 * 接受一个参数，
 * 加上问号代表的是参数可以为空。
 */
fun heat(str: String?): String{
	return "hot $str"
}