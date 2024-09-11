fun main (args :Array<String>){
    //array methods
    //sort()

    val simponsA = arrayOf("Homer", "Marge", "Bart", "Lisa","Meggie")
    simponsA.sort()
    for (simpon in simponsA){
        print(simpon + ' ')
    }
    print('\n')

    //sorted()
    val simponsB : Array<String> = arrayOf("Homer", "Marge", "Bart", "meggie")
    val simpons_sorted = simponsB.sortedArray()
    for (simpons in simpons_sorted) {
        print(simpons + ' ')
    }
    print('\n')

    //reverse() and reversedArray()
    val simpsonsC : Array<String> = arrayOf("Homer", "Marge", "bart", "Lisa", "Meggie")
    simpsonsC.sort()
    simpsonsC.reverse()
    for (simpson in simpsonsC){
        print(simpson + ' ')
    }
    print('\n')

    //indexOf
    val simpsonsD =arrayOf("Homer", "Marge","Bart", "Lisa", "Meggie")
    val simpson = "Lisa"
    val position = simpsonsD.indexOf(simpson)
    if (position != -1) {
        println("Yeah, that's my number ${position + 1} Simpson!")
    }else {
        println("Hey that's not Simpson!")
    }
    val simponsE = arrayOf("Homer", "Marge", "Bart", "Lisa","Meggie")
    println("simpsons size : "+simponsE.size)
    if(!simponsE.isEmpty())
        println("Array tidak kosong!")
    println("Min = "+simponsE.min())
    println("Max = "+ simponsE.max())
    println("First =" + simponsE.first())
    println("Last = " +simponsE.last())
    println(simponsE.contains("Marge"))
    }
