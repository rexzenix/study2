package Operation

/**
 * Operator aritmatik
 * + - * / %
 */

fun main(){
    // aritmatik dengan input

    val first = readln().toInt()
    val second = readln().toInt()
    val range = first..second
    var res = first * second
    var res2 = first + second
    var res3 = first - second
    var res4 = second % second
    var decrement = res--
    var increment = res++


    println("hasil dari $first dikalikan $second adalah $res")
    println("aritmatik di kotlin dapat juga di lakukan dengan hasil sebagai berikut $res2, $res3, $res4")
    println("Hasil dapat ditingkatkan ataupun dikurangkan secara bertahap seperti hasil $increment dan $decrement")

}