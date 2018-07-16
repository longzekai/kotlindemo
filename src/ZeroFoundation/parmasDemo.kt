package ZeroFoundation

/**
 * Created by Danny on 2018/7/16.
 */
fun main(args: Array<String>) {
	println(getArea(height = 6.0f))  //默认参数传参
}

fun getArea(width: Float = 3.0f, height: Float): Float{
	return width * height
}