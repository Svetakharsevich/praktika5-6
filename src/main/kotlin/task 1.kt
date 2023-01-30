import kotlin.math.pow

fun main()
{
    println("Введите первое число")
    var firstnumber= readln().toInt()
    println("Введите второе число")
    var secondnumber= readln().toInt()
    if(firstnumber>secondnumber) println(firstnumber+1)
    else if(firstnumber==secondnumber) println(firstnumber.toDouble().pow(3).toInt())
    else println("Второе число больше, чем первое")

}