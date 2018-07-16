package ZeroFoundation

/**
 * Created by Danny on 2018/7/16.
 */
fun main(args: Array<String>) {
	getStudentScore(9)
}

fun getStudentScore(score: Int) {
	when (score) {
		10 -> println("nice")
		9 -> println("good")
		else -> println("need hard")
	}
}