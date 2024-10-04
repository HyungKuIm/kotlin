fun main() {
    var num = 100
    println(num)
    println(num::class)
    println(num::class.java)

    var num1 = 100L
    var num2 = 100F
    println(num1::class)
    println(num2::class)
}

