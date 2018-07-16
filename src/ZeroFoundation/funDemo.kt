package ZeroFoundation

/**
 * Created by Danny on 2018/7/16.
 */
fun main(args: Array<String>) {
	println(add(3,6))

	var i = {x: Int, y: Int -> x+y}
	println(i(5,7))

	var j:(Int,Int)->Int = {x,y -> x+y}
	println(j(8,9))
}

fun add(x: Int, y: Int): Int {
	return x + y
}