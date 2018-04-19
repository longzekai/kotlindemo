package other

/**
 * Created by Danny on 2018/4/19.
 */
fun main(args: Array<String>) {
	println("-----------------groupingBy()----------------")
//	此 API 可以用于按照键对集合进行分组，并同时折叠每个组。 例如，它可以用于计算文本中
//	字符的频率：
	val words = "one two three four five six seven eight nine ten".split(' ')
	val frequencies = words.groupingBy { it.first() }.eachCount()
	println("Counting first letters: $frequencies.")

	// 另一种方式是使用“groupBy”和“mapValues”创建一个中间的映射，
	// 而“groupingBy”的方式会即时计数。
	val groupBy = words.groupBy { it.first() }.mapValues { (_,list) -> list.size }
	println("Comparing the result with using 'groupBy': ${groupBy == frequencies}.")

	println("-----------------Map.minus(key)----------------")
//	用于删除单个键、键的集合、键的序列和键的数组。
	val map =  mapOf("key" to 42)
//	val emptyMap =  map - "key"
	val emptyMap =  map.minus("key")
	println("map: $map")
	println("emptyMap: $emptyMap")
	println("-----------------minOf() 和 maxOf()----------------")

	val list1 = listOf("a","b")
	val list2 = listOf("x","y","z")
	val minSize = minOf(list1.size,list2.size)
	val longestList = maxOf(list1,list2, compareBy{it.size})
	println("minSize = $minSize")
	println("longestList = $longestList")

	println("-----------------类似数组的列表实例化函数----------------")
//	类似于  Array  构造函数，现在有创建  List  和  MutableList  实例的函数，并通过调用
//	lambda 表达式来初始化每个元素：
	val squares = List(10) { index -> index * index }
	val mutable = MutableList(10) { 0 }
	println("squares: $squares")
	println("mutable: $mutable")

	println("-----------------Map.getValue()----------------")

//	Map  上的这个扩展函数返回一个与给定键相对应的现有值，或者抛出一个异常，提示找不到
//	该键。 如果该映射是用  withDefault  生成的，这个函数将返回默认值，而不是抛异常。
	val map1 = mapOf("key" to 24)
	val value: Int = map1.getValue("key")
	val mapWithDefault = map1.withDefault { k -> k.length }

	val value2 = mapWithDefault.getValue("key2")
	println("value is $value")
	println("value2 is $value2")

	println("-----------------数组处理函数----------------")
//	标准库现在提供了一组用于逐个元素操作数组的函数：比较 （ contentEquals  和
//	contentDeepEquals  ），哈希码计算（ contentHashCode  和  contentDeepHashCode  ）， 以及转
//	换成一个字符串（ contentToString  和  contentDeepToString  ）。它们都支持 JVM （它们作
//	为  java.util.Arrays  中的相应函数的别名）和 JS（在 Kotlin 标准库中提供实现）。
	val array = arrayOf("a","b","c")
	println(array.toString())
	println(array.contentToString())
}