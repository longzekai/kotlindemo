package ZeroFoundation

/**
 * Created by Danny on 2018/6/23.
 */

fun checkFace(score: Int){
	if (score > 80) {
		println("你是一个帅哥~")
	} else {
		println("你需要去韩国~~")
	}
}


fun main(args: Array<String>) {
	var score = 99
	checkFace(score)
}