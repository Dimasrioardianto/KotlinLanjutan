fun main (args: Array<String>) {
    //while Loop
    var x:Int = 0
    println("Example of while Loop--")
    while(x <= 10) {
        print("$x ")
        x++
    }
    print('\n')

    //do-while Loop
    var y:Int = 0
    do {
        y = y + 10
        println("I am inside Do block---" +y)
    } while (y <= 50)
}