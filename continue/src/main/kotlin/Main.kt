fun main(args: Array<String>) {
    println("Hello World!")
    goover@ for(x in 1..4){
        if (x == 3)
            continue@goover
            println("x = $x")
    }
    var num = 0
    while (num < 10) {
        num++
        if(num == 5) continue
        print(num)

    }
    println("")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}