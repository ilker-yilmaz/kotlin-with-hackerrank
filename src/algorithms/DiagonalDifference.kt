import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.math.abs
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */
val arr = arrayOf(
    arrayOf(1,2,3),
    arrayOf(4,5,6),
    arrayOf(9,8,9),
    )

fun diagonalDifference(a: Array<Array<Int>>): Int {
    // 1. Calculate primary diagonal (d1)
    val n = a.size // matris boyutunu hesaplıyoruz

    // n=3 için a[0][0] + a[1][1] + a[2][2]
    var d1 = 0
    for(i in 0 until n){
        d1 += a[i][i]
    }

    // 2. Calculate secondary diagonal (d2)
    // n=3 için a[0][2] + a[1][1] + a[2][0]
    // n=4 için a[0][3] + a[1][2] + a[2][1] + a[3][0]

    var d2 = 0
    for (i in 0 until n){
        d2 += a[i][n-i-1]
    }

    // 3. Calculate and return |d1-d2|
    return abs(d1-d2)

}

fun diagonalDifference2(a: Array<Array<Int>>): Int {
    val n = a.size // matris boyutunu hesaplıyoruz

    val d1 = (0 until n).sumOf { a[it][it] }

    val d2 = (0 until n).sumOf { a[it][n-it-1] }

    return abs(d1-d2)

}
fun diagonalDifference3(a: Array<Array<Int>>): Int {
    //tek döngü ile çözüm:
    val n = a.size

    var d1 = 0
    var d2 = 0
    for(i in 0 until n){
        d1 += a[i][i]
        d2 += a[i][n-i-1]
    }

    return abs(d1-d2)

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
