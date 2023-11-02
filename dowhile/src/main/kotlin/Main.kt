fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    var num = 1
    do {
        print(num)
        num++
    } while (num <= 6)
    println("\n")
    for (num2 in 0..10) {
        if (num2 > 5) {
            break
        }
        print(num2)
    }
    println("\n")
    circulate@ for (x in 1..5) {
        for (y in 1..4) {
            if (x == 2)
                break@circulate
            println("x= $x and y = $y")

        }
    }
}