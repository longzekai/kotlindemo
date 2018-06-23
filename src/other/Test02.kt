package other

import java.io.File

fun main(args: Array<String>) {
    println("-----------------使用集合----------------")
    val fruits = listOf("apple","banana","avocado","kiwi")
    fruits.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
    println("-----------------only read list----------------")
    val list = listOf("a","b","c","d")
    println(list)
    println("-----------------only read map----------------")
    val map = mapOf("a" to 1, "b" to 2,"c" to 3)
    println(map["a"])

    println("-----------------延迟属性----------------")
    val p: String by lazy {
        return@lazy "kotlin"
    }
    println(p)
    println("-----------------扩展函数----------------")
    fun String.spaceToCamelCase(){
        print("扩展函数")
    }
    println("Convert this to camelcase".spaceToCamelCase())

    println("-----------------创建单例----------------")
    println(Resource.toString())
    println(Resource.toString())

    println("-----------------If not null  缩写----------------")
    val files = File("Test").listFiles()
    println(files?.size)

    println("-----------------If not null and else缩写----------------")
    println(files?.size ?: "empty")

    println("-----------------if null  执⾏⼀个语句----------------")
    val d = map["d"] ?: throw IllegalStateException("d is missing!")
    println(d)

}

object Resource {
    val name = "Name"
}