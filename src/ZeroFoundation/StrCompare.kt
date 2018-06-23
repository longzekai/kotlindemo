package ZeroFoundation

/**
 * Created by Danny on 2018/6/23.
 */
fun main(args: Array<String>) {
	var str1 = "Jerry"
	var str2 = "Tonny"
	println(str1 == str2)

	val str3 = "Danny"
	val str4 = "danny"

	println(str3.equals(str4,true))
}