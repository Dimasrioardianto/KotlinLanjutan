fun main (args :Array<String>){
    //creates
    val asc = Array(5){
        i -> (i * i).toString()
    }
    asc.forEach { println(it)}
}