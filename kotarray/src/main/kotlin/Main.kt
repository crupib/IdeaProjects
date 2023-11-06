fun main(args: Array<String>) {
    val myArray = arrayOf(0, 1, 2, 3, 4, 5)
    var myArray1 = arrayOf<String>("App", "Boy", "Slut")
    var myArray2 = arrayOf<Int>(1, 2, 3, 4, 5)
    myArray.set(2, 10)
    myArray[4] = 20
    for (element in myArray) {
        print(" " + element)
    }
    println("")
    println("myArray[1] value is " + myArray.get(1))
    println("myArray[3] value is " + myArray[3])
    var myArray3 = arrayOf<Boolean>(true, false, true)
    var myArray4 = arrayOf<Char>('A', 'B', 'C')
    var myArray5 = arrayOf(0, 1, 2, "Andy", "Bake", "Cate")
    for (element in myArray1) {
        print(" " + element)
    }
    println()
    for (element in myArray2) {
        print(" " + element)
    }
    println()
    for (element in myArray3) {
        print(" " + element)
    }
    println()
    for (element in myArray4) {
        print(" " + element)
    }
    println()
    println()
    for (element in myArray5) {
        print(" " + element)
    }
    println()
    print(" "+ myArray1.size)
    print(" "+ myArray2.size)
    print(" "+ myArray3.size)
    print(" "+ myArray4.size)
    print(" "+ myArray5.size)
    println()
}