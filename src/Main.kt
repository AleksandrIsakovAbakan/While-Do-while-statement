fun main() {
    println("Введите число: ")
    val input = readln().toInt()
    println(factorialOfNumber(input))
    val priceOf1KgOfSweets = 5.44
    displayCostOfKgOfCandy(priceOf1KgOfSweets)
    val A = 7
    val B = 15
    inAscendingOrderAllIntegersLocatedBetweenAAndB(A, B)
    val N = 510
    printAllItsDigitsOfNumberStartingWithRightmostOne(N)
    numbersFromToInclusiveAreDisplayedOnScreenWithConditions()
    val percent = 7.0
    val summa = 350.0
    val period = 9
    println(String.format("%.2f",
        calculationOfFinalDepositAmountTakingIntoAccountInterestAccrualForEachMonth(percent, summa, period)))
}

/*
Пользователь вводит с клавиатуры число.
Требуется посчитать факториал числа.
Например, если введено 3, факториал числа 1*2*3 = 6.
*/
fun factorialOfNumber(input: Int): Int {
    return if (input < 0) {
        println("Факториал отрицательных чисел не определен")
        0
    } else {
        var count = 1
        var temp = 1
        while (count in 1..input) temp *= count++
        temp
    }
}

/*
Дано вещественное число — цена 1 кг конфет.
Вывести стоимость 1, 2, …, 10 кг конфет.
*/
fun displayCostOfKgOfCandy(a: Double) {
    var b = 1
    while (b in 1..10) {
        val temp = a * b
        println("Стоимость $b кг конфет = ${String.format("%.2f", temp)}")
        b++
    }
}

/*
Даны два целых числа A и B (A<B).
Вывести в порядке возрастания все целые числа, расположенные между A и B (включая сами числа A и B),
а также количество Nэтих чисел.
*/
fun inAscendingOrderAllIntegersLocatedBetweenAAndB(A: Int, B: Int) {
    var count = A
    while (count in A..B) {
        println(count)
        count++
    }
    println("Количество чисел равно ${count - A}")
}

/*
Дано целое число N (>0).
Используя операции деления нацело и взятия остатка от деления, вывести все его цифры, начиная с самой правой.
*/
fun printAllItsDigitsOfNumberStartingWithRightmostOne(N: Int) {
    var temp = N
    do {
        println(temp % 10)
        temp /= 10
    } while (temp / 10 > 0)
    if (N > 9) println(temp)
}

/*
Напишите программу, в которой выводятся на экран числа от 1 до 20 включительно со следующими условиями:
если числа нечетные – их не выводить на экран, если делятся на 4 без остатка – умножаем на 2,
если число равно 19 завершаем программу.
*/
fun numbersFromToInclusiveAreDisplayedOnScreenWithConditions() {
    var count = 1
    while (count in 1..20) {
        if (count == 19) return else if (count % 2 == 0) if (count % 4 == 0) println(count * 2) else println(count)
        count++
    }
}

/*
За каждый месяц банк начисляет к сумме вклада 7% от суммы.
Напишите программу, в которой вычисляется конечная сумму вклада с учетом начисления процентов за каждый месяц.
Сумма вклада равна 350, количество месяцев – 9.
*/
fun calculationOfFinalDepositAmountTakingIntoAccountInterestAccrualForEachMonth(percent: Double, summa: Double,
                                                                                period: Int): Double{
    var count = 1
    var result = summa
    while (count in 1..period){
        result += result * percent / 100
        count++
    }
    return result
}

//Примечания:
//- Для вывода значений на экран используйте функцию println().

