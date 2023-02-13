package pemrogramanStruktur

fun main (){
    /**
     * for loop
     * sistem perulangan dalam jarak suatu data tertentu
     */
    val first = readln().toInt()
    val second = readln().toInt()
    val range = first..second
    for (x in range)
        if (x % 2 == 0){
            println("ini adalah angka genap $x")
        }else if (x % 2 != 0){
            println("ini adalah angka ganjil $x")
        }
}