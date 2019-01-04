fun func(x : Any) {
    if (x is Float) {
        println("x is Float")
    } else if (x is String) {
        println("x is String")
}

}
fun main(args:Array<String>) {
    var age = 25
    var myChar = 'A'
    var name = "Bill"
    var height = 5.10
    var student = "Bob"
    var myInteger : Int
    val myage = 65
    val pi = 3.14159
    var myByte : Byte = -100
    var x : Float
    var notNull : String = "not null"
//    x is Char
    println("Hello World")
    println(myChar)
    println(age)
    println(name)
    println(height)
    println("Name is $student age is $age and height is $height")
    println(myage)
    myInteger = 25
    println(myInteger)
    println(pi)
    println(myByte)
    println("Max integer "+Integer.MAX_VALUE)
    println("Min integer "+Integer.MIN_VALUE)
    x = 10.2F
    func(x)
    func(name)
    var length = notNull.length
    println("not null length "+length)
    var mayBeNull : String? = null
    var length2 = mayBeNull?.length
    println(length2)
    mayBeNull = "Shit"
    if(mayBeNull != null && mayBeNull?.length > 0){
        println("Not null")
    }
    mayBeNull = null
    var length3 = mayBeNull?.length
    println(mayBeNull)
}