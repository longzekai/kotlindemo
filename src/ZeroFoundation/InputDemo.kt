package ZeroFoundation

/**
 * Created by Danny on 2018/7/16.
 */
fun main(args: Array<String>) {
	println("please input a num..")
	var num1 = readLine()
	println("please input another num..")
	var num2 = readLine()

	try {
		var num3 = num1!!.toInt()
		var num4 = num2!!.toInt()
		println("${num1} + ${num2} = ${num3 + num4}")
	} catch (e: Exception){
		println("input error!!")
	}

}