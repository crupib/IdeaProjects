fun main(args: Array<String>) {
    println("Hello World!")
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