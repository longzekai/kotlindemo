package demo01

/**
 * Created by Danny on 2018/3/9.
 */
fun main(args: Array<String>) {
//    println("Hello")
//    Greeter("world").greet()
//   println( sum(6,3))
//   println( sum2(6,3))
//   println( sum3(6,3))
//    printSum(6,8)
//    printSum2(9,6)
//    vars(1,2,3,4,5,6,6,7)

//    val sumLambda: (Int, Int) -> Int = {x,y -> x+y}
//    println(sumLambda(2,4))

//    var x = 5
//    x += 1
//
//    println(x)
//
//    val a: Int = 1
//    val b = 1
//    val c: Int = 1
//
//    println(a)
//    println(b)
//    println(c)
	println("=======================字符串模板======================")
//    $ 表示一个变量名或者变量值
//    $varName 表示变量值
//    ${varName.fun()} 表示变量的方法返回值

	var a = 1
	val s1 = "a is $a"

	println(s1)

	a = 2

	val s2 = "${s1.replace("is", "was")},but now is $a"

	println(s2)

	println("=======================NULL检查机制======================")
//    Kotlin的空安全设计对于声明可为空的参数，在使用时要进行空判断处理，有两种处理方式，
// 字段后加!!像Java一样抛出空异常，
// 另一种字段后加?可不做处理返回值为 null或配合?:做空判断处理

//类型后面加?表示可为空
	var age: String? = "23"
//抛出空指针异常
	val ages = age!!.toInt()
//不做处理返回 null
	val ages1 = age?.toInt()
//age为空返回-1
	val ages2 = age?.toInt() ?: -1

	println(age)
	println(ages)
	println(ages1)
	println(ages2)


	//	当一个引用可能为 null 值时, 对应的类型声明必须明确地标记为可为 null。
//	当 str 中的字符串内容不是一个整数时, 返回 null:
	fun parseInt(str: String): Int? {
		return  str.toInt()
	}

//	println(parseInt("c"))
	println(parseInt("6"))


	println("=======================类型检测及自动类型转换======================")
	fun getStringLength(obj: Any): Int? {
		if (obj is String) {
			return obj.length
		}
		return  null
	}

	println("Danny length is:"+getStringLength("danny"))
}


fun vars(vararg v: Int) {
	for (vt in v) {
		print(vt)
	}
}

class Greeter(val name: String) {
	fun greet() {
		println("Hello,$name")
	}
}

fun sum(a: Int, b: Int): Int {
	return a + b
}

fun sum2(a: Int, b: Int) = a + b

public fun sum3(a: Int, b: Int): Int = a + b

fun printSum(a: Int, b: Int): Unit {
	println(a + b)
}

public fun printSum2(a: Int, b: Int) {
	println(a + b)
}