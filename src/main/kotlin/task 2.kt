import kotlin.random.Random

fun main() {
    var number= (0..9).random()
    when(number){
        0-> println("Ноль")
        1-> println("Один")
        2-> println("Два")
        3-> println("Три")
        4-> println("Четыре")
        5-> println("Пять")
        6-> println("Шесть")
        7-> println("Семь")
        8-> println("Восемь")
        9-> println("Девять")

    }
}
