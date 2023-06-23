
open class cars {   // primary class
    val name = "cars details "
    fun maruti() {
        println(name)
println("maruti car runs fast but.... ")
    }
}
//derive
class BMW: cars() { // secondary class // @override
    fun BMW() {

        println("BMW car can run faster than maruti")
    }
}
fun main(args: Array<String>) {
    val derived = BMW()
    derived.maruti()		 // base class function
    derived.BMW()
}
// identify  the difference between two time periods(24hr) 1> starting date and end date were given 2> inputer by user 24hrs
