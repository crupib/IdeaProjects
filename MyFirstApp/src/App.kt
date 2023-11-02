fun main(args: Array<String>) {
    println("Pow!")
    var x = 3
    val name = "Cormoran"
    x = x * 10
    println("x is $x.")
    while (x > 20) {
        x = x - 1
        println(" x is now $x.")
    }
    for (i in 1..10) {
        x = x + 1
        println(" x is now $x.")
    }
    if (x == 20) {
        println(" x must be 20.")
    } else {
        println(" x isn't 20.")
    }
    if (name.equals("Cormoran")){
        println("$name Strike")
    }
    val z = 3
    val y = 1
    println(if (z>y) "z is greater than y" else "z is not greater that y")
    println("This line runs no matter what")

}