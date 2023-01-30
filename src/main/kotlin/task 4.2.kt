fun main() {
    println("Введите число")
    var number= readln().toInt()
    when{
        (number/100==number%10) -> println("Первая и последняя цифра равны")
        else -> println("Первая и последняя цифра не равны")

    }
}
