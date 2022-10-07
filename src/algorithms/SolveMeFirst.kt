import java.util.*

// farklı çözüm yöntemleriyle iki sayının toplamını bulan fonksiyonlar:

fun solveMeFirst(a: Int, b: Int): Int {
    return a + b;
}

fun solveMeFirst2(a: Int, b: Int): Int = a + b

fun solveMeFirst3(a: Int, b: Int) = a + b


fun main(args: Array<String>){
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val sum = solveMeFirst(num1,num2)
    val sum2 = solveMeFirst2(num1,num2)
    val sum3 = solveMeFirst3(num1,num2)
    println(sum)
    println(sum2)
    print(sum3)
}

