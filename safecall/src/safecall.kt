fun main(args: Array<String>) {
    var mayBeNull : String?
//    mayBeNull = "The quick brown fox jumped over the lazy dog's back"
    mayBeNull = null
    var length = mayBeNull?.length
    if (length == null) {
        println("value of length is "+ length)
    }
    else
        println("value of length is "+ length)
    var message: String? = "The quick brown fox jumped over the lazy dog's back"
//    var message: String? = null
    var len = message?.length ?: 0
    println("value of len is $len")
}