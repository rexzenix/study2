package pemrogramanStruktur

/**
 * if else statement
 * mirip seperti java hanya saja bisa lebih singkat dalam penggunaan if tunggal
 */
fun main () {
    /**
     * AND OR and NOT
     * && || !
     *
     */

    var first = 2
    val second = 3
    val third = 5

    if ((second < third) && (first < third))println(true) else println(false)

    if (second >= third) {
            println("True")
    }else if (third == first) {
            println("True")
    }else println("false")

}