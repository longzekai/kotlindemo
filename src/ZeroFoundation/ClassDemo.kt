package ZeroFoundation

/**
 * Created by Danny on 2018/7/17.
 */
fun main(args: Array<String>) {
	var rect = Rect(20,50)
	println("width is : ${rect.width}")
	println("height is : ${rect.height}")
	rect.area()
}

class Rect(var width: Int, var height: Int){
	fun area(){
		println(width*height)
	}
}
