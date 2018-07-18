package ZeroFoundation.Wash

/**
 * Created by Danny on 2018/7/17.
 */
fun main(args: Array<String>) {
	var washMachine = WashMachine("Haier",6)
	washMachine.openDoor()
	washMachine.closeDoor()
	washMachine.start()
}