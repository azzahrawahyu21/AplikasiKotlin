package id.ac.pnm.ti2a.aplikasikotlin

fun main () {
    //Compact Function
    val a = double (5)
    val b = double (3)
    println ("a x b = $a x $b = ${a * b}")

    //Lambda Function
    var dirtLevel = 20
    val waterFilter = {level: Int -> level / 5}
    println(waterFilter(dirtLevel))

    //compact bisa dibikin lambda. contoh jika perintah compact double kita lambda
    val number = {x : Int -> x * 2}
    println (number(3)) //3 itu berarti masuk ke x

    //High Order Function
    val upperText: (String) -> String = { input -> input.toUpperCase() }
    println(encodeMsg("tetap semangat", upperText))
    val lowerText: (String) -> String = { input -> input.toLowerCase() }
    println(encodeMsg("tetap semangat", lowerText))

    //Kalkulator
    val c:Int = 4
    val d:Int= 2
    val tambah:(Int,Int) -> Int = {c,d -> c+d}
    val kurang:(Int,Int) -> Int = {c,d -> c-d}
    val kali:(Int,Int) -> Int = {c,d -> c*d}
    val bagi:(Int,Int) -> Int = {c,d -> c/d}
    println(kalkulator(c,d,tambah))
    println(kalkulator(c,d,kurang))
    println(kalkulator(c,d,kali))
    println(kalkulator(c,d,bagi))
}

fun double (x: Int):Int = x * 2 //compact function

fun encodeMsg(msg: String, encode: (String) -> String): String {
    return encode(msg)
} //high order function

fun kalkulator(c: Int, d: Int, operator: (Int, Int) -> Int): Int {
    return operator(c, d)
}