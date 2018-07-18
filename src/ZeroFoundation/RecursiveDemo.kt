package ZeroFoundation

/**
 * Created by Danny on 2018/7/17.
 * 递归
 */
fun main(args: Array<String>) {
	println(fact(5))
//	println(fact(100)) //超过int 类型长度
//	println(ollAdd(100000))

	println(ollAdd(7,0))
}

fun fact(num: Int): Int{
	return if(num == 1) {
		1
	} else {
		num * fact(num -1)
	}
}

fun ollAdd(num: Int):Int{
	println("calc $num times")
	return if (num == 1) {
		1
	} else {
		num + ollAdd(num -1)
	}
}
//尾递归优化
tailrec fun ollAdd(num: Int, result: Int):Int{
	println("计算机第 $num 次运算，result = $result")
	return if (num == 0) {
		1
	} else {
		ollAdd(num -1,result + num)
	}
}