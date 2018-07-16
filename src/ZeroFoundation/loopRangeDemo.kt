package ZeroFoundation

/**
 * Created by Danny on 2018/7/16.
 */
fun main(args: Array<String>) {
	var nums = 1 .. 10	//开区间 （a，b）
	for (num in nums) {
		print("$num ,")
	}
	println()
	println("====================")
	val num2 = 1 until 10 // 开闭区间 （a，b]
	for (num in num2) {
		print("$num ,")
	}
	println()
	println("====================")	//步进
	for (num in nums step 2) {
		print("$num ,")
	}
	println()
	println("====================") //反转，（类似倒叙排列）
	val num3 = num2.reversed()
	for (num in num3) {
		print("$num ,")
	}
	println()
	println("====================")
	println(num3.count()) //类似 list.size()
}