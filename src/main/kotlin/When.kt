fun main (args :Array<String>) {
    //use of when
    var x : Int = 5
    when (x) {
        1 -> println("x ==1")
        2 -> println("x ==2")
        else ->{ //note the block
            println("x is neither 1 nor 2")
        }
    }
    x = 2
    when (x) {
        1,2 -> println("Value of Xeither 1,2")
        else -> { //note the blockk
            println("x is neither 1 nor 2")
        }
    }
}