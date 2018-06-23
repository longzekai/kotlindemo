package ZeroFoundation.SimpleCalc

/**
 * Created by Danny on 2018/6/23.
 * 简易计算器
 */

fun main(args: Array<String>) {
	var a = 8
	var b = 2

	println("a+b="+ plus(a,b))
	println("a-b="+ sub(a,b))
	println("a*b="+ mult(a,b))
	println("a/b="+ devide(a,b))

	println(sayHello("Danny"))
	println(checkAge(28))
}


/**
 * fun 固定写法写法， plus函数名
 * Int 返回值
 */
fun plus(a: Int, b: Int): Int{
	return a + b
}

fun sub(a: Int, b: Int): Int{
	return a - b
}

fun mult(a: Int, b: Int): Int{
	return a * b
}

fun devide(a: Int, b: Int): Int{
	return a / b
}



fun sayHello(name: String): String {
	return "hello $name"
}


fun checkAge(age: Int): Boolean{
	return age > 18
}

fun saveLog(logLevel: Int){
	println(logLevel)
}







