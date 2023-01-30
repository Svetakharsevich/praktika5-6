fun main() {
    println("Введите стоимость первой путевки")
    var N1= readln().toInt()
    println("Введите стоимость второй путевки")
    var N2= readln().toInt()
    println("Введите стоимость третей путевки")
    var N3= readln().toInt()
    println("Введите сколько дней в первой путевке")
    var D1= readln().toInt()
    println("Введите сколько дней во второй путевке")
    var D2= readln().toInt()
    println("Введите сколько дней в третей путевке")
    var D3= readln().toInt()
    println("Введите сколько у туриста денег")
    var X= readln().toInt()
    println("Введите сколько дней в отпуске у туриста")
    var Y= readln().toInt()
    when{
        (X==N1)&&(Y==D1)-> println("Подходит первая путевка")
        (X==N2)&&(Y==D2)-> println("Подходит вторая путевка")
        (X==N3)&&(Y==D3)-> println("Подходит третия путевка")
        else-> println("Ни одна из путевок не подходит")
    }
}

