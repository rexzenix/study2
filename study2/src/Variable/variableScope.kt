package Variable

/**
 * Variable scope  adalah cakupan sebuah variable akses
 * cakupan variable dibagi menjadi global dan local
 */

//deklarasi variabel Variable.getNama type global
var Nama:String? = null

fun main (){
    var ayam = "cemani"
    myName() // memanggil fungsi Variable.myName
}

fun myName(){
    Nama = "Raka Isya" // memberi nilai pada variable Variable.getName
    println("Variabel.getName : $Nama")
}