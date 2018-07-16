package ZeroFoundation

import java.util.*

/**
 * Created by Danny on 2018/7/16.
 */
fun main(args: Array<String>) {
	val  lists = listOf("Danny","Tom","Alan","Alex","Aaron") //create a lsit
	for (name in lists) {
		println(name)
	}
	println("====================")
	for ((i, e) in lists.withIndex()) {  // get the list index (key - value)
		println("$i $e")
	}

	var map = TreeMap<String ,String>()

	map["好"] = "good"
	map["学习"] = "study"
	println(map["好"])

}