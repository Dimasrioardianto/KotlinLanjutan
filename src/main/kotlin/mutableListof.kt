fun main (args : Array <String>){
    //mutable is a list with list-specifik wite operations
    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5)
    numbers.removeAt(1)
    numbers[0] = 0
    numbers.shuffle()
    println(numbers)

    val numbersStr = mutableListOf("One","two","three","four")
    numbersStr.add("five") //this is ok
    //numbersStr = mutableListof("six", "seven")  //compilation error
    println(numbersStr)
}