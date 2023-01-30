import java.lang.Exception
import kotlin.math.pow
fun main()
{
    /*Zad1()
    Zad2()
    Zad3()*/
    Zad4()
    Zad5()
    Zad6()
}
fun Zad1()
{
    try
    {
        println("Введите 1 чесло: ")
        var a = readLine()!!.toDouble()
        println("введите 2 число: ")
        var b = readLine()!!.toDouble()
        if (a > b)
        {
            a += 1
            print(a)
        }
        else if(a < b)
        {
            b += 1
            print(b)
        }
        else if(a == b)
        {
            a = Math.pow(a ,3.0)
            println(a)
        }
    }
    catch (e: Exception)
    {
        println("Возникла ошибка!")
    }
}
fun Zad2()
{
    try {
        println("Введите число от 0 до 9: ")
        var num = readLine()!!.toInt()
        if (num < 0 || num > 9)
        {
            println("Введите число от 0 до 9: ")
            num = readLine()!!.toInt()
        }
        when(num) {
            0 -> print("Ноль")
            1 -> print("Один")
            2 -> print("Два")
            3 -> print("Три")
            4 -> print("Четыре")
            5 -> print("Пять")
            6 -> print("Шесть")
            7 -> print("Семь")
            8 -> print("Восемь")
            9 -> print("Девять")
        }
    }
    catch (e: Exception)
    {
        println("Возникла ошибка!")
    }
}
fun Zad3()
{
    try {
        println()
        println("Введите ваш возраст от 0 до 99: ")
        var num1 = readLine()!!.toInt()
        if (num1 < 0 || num1 > 99)
        {
            println("Введите ваш возраст от 0 до 99: ")
            num1 = readLine()!!.toInt()
        }
        when(num1) {
            in 0..3 -> print("Младанец")
            in 4..13 -> print("Ребёнок")
            in 14..18 -> print("Подросток")
            in 18..99 -> print("Взрослый")
        }
    }
    catch (e: Exception)
    {
        println("Возникла ошибка!")
    }
}
fun Zad4()
{
    try {
        println("Введите значение х: ")
        var x = readLine()!!.toDouble()
        if ( x < 0)
        {
            println("Введите значение х: ")
            x = readLine()!!.toDouble()
        }
        if (0 <= x && x <= 3)
        {
            x = Math.pow(x, 2.0)
            println(x)
        }
        else if(x < 0 || x > 3)
        {
            x = 4.0
            println(x)
        }
        else
            println("Нет корей")
    }
    catch (e: Exception)
    {
        println("Возникла ошибка!")
    }
}
fun Zad5()
{
    try {
        println("Введите 3 числа: ")
        var num1 = readLine()!!.toInt()
        var num2 = readLine()!!.toInt()
        var num3 = readLine()!!.toInt()
        var sum = 0
        if(num1 < num2 && num1 < num3)
        {
            sum = num2 + num3
            println("Сумма 2 и 3 числа " + sum)
        }
        else if(num2 < num1 && num2 < num3)
        {
            sum = num1 + num3
            println("Сумма 1 и 3 числа " + sum)

        }
        else
        {
            sum = num1 + num2
            print("Сумма 1 и 2 числа " + sum)
        }
    }
    catch (e: Exception)
    {
        println("Возникла ошибка!")
    }

}
fun Zad6()
{
    try {
        println("Введите кол-во пятёрок: ")
        var p = readLine()!!.toDouble()
        if(p < 0)
        {
            println("Введите кол-во пятёрок: ")
            p = readLine()!!.toDouble()
        }
        println("Введиет кол-во четвёрок: ")
        var ch = readLine()!!.toDouble()
        if (ch < 0)
        {
            println("Введиет кол-во четвёрок: ")
            ch = readLine()!!.toDouble()
        }
        println("Введиет кол-во троек: ")
        var tr = readLine()!!.toDouble()
        if(tr < 0)
        {
            println("Введиет кол-во троек: ")
            tr = readLine()!!.toDouble()
        }
        println("Введиет кол-во двоек: ")
        var dv = readLine()!!.toDouble()
        if (dv < 0)
        {
            println("Введиет кол-во двоек: ")
            dv = readLine()!!.toDouble()
        }
        var ychen = p + ch + tr + dv

        var sred: Double = ((p * 5) + (ch * 4) + (tr * 3) + (dv * 2)) / ychen
        var bol_sred: Double = 0.0
        println("Средняя оценка " +  sred)
        when(sred)
        {
            in 0.0..2.0 -> bol_sred = p + ch + tr + dv
            in 2.0..3.0 -> bol_sred = p + ch + tr
            in 3.0..4.0-> bol_sred = p + ch
            in 4.0..5.0 -> bol_sred = p
            5.0 -> bol_sred = 0.0
        }
        println("Учеников получивших оценку выше среднего балла " + bol_sred)
    }
    catch (e:Exception)
    {
        println("Возникла ошибка!")
    }
}
