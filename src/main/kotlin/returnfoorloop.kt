fun main (args : Array<String>) {
    returnLoop()
}
fun  returnLoop(){
    var x: Int
    println("Example")
    for(x in 1..10) {
        if(x < 5) {
            print("${x - 1} ")
        }else {
            return
        }
        print("$x ")
    }
    print("Tidak aka pernah dieksekusi")
}