package ZeroFoundation.Wash

/**
 * Created by Danny on 2018/7/17.
 */
class WashMachine(module: String, size: Int){

	var isDoorOpen = true

	fun openDoor(){
		println("the door is open")
		isDoorOpen = true
	}

	fun closeDoor(){
		println("the door is close")
		isDoorOpen = false
	}
	fun start(){
		if (isDoorOpen) {
			println("please close the door!!")
			return
		}
		println("water...")
		println("water is over.")
		println("washing...")
		println("wahs done.")
	}
}