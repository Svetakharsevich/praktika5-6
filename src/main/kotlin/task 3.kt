fun main() {
    println("Введите возраст")
    var age= readln().toInt()
    when(age){
        in 0..2-> println("Младенец")
        in 2..10-> println("Детство")
        in 10..16 -> println("Подросток")
        in 16..25 -> println("Юноши")
        in 25..50-> println("Зрелость")
        in 50..100 -> println("Старость")
        else -> println("Введите другой возраст")
    }
}
