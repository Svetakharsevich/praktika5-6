import kotlin.math.pow

fun main() {
    println("Введите x")
    var x = readln().toDouble()
    var F1 = 45 * (x.pow(2)) + 5
    var F2 = (5 * x) / ((10 * (x.pow(2)) + 1))
    when (x) {
        in 3.6..10.0 -> println(F1)
        in -10.0..3.0 -> println(F2)
        else -> println("Введите другое число")
    }
}
