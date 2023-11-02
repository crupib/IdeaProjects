fun main(args: Array<String>) {
    println("Hello World!")
    val a = 4
    when(a){
         1 -> println("1")
         2 -> println("2")
         3 -> println("3")
         4 -> println("4")
         else -> println("Other")
    }

    println("Program arguments: ${args.joinToString()}")
}