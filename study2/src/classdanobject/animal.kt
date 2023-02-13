package classdanobject

/**
 * membuat class animal dan class Kucing yang merupakan inheritance dari Animal
 * membuat objek dari kelas yang telah dibuat
 */

/**
 * membuat class Animal dengan hak akses open
 */

open class Animal(){
    //deklarasi variabel
    var nama:String? = null
    var color:String? = null
    var jumlahKaki:Int? = null

    //membuat konstruktor
    constructor(nama:String, color:String, jumlahKaki:Int):this(){
        this.color = color
        this.nama = nama
        this.jumlahKaki = jumlahKaki
    //mencetak print object saja
        println("Object " + this.jumlahKaki)
        println("Object " + this.color)
        println("Object " + this.nama)
    }
}

class Kucing():Animal(){

}

fun main (){
    var animal = Animal("Ayam", "Hijau", 20)
    var kucing = Kucing()
    kucing.jumlahKaki = 4
    println("${kucing.jumlahKaki}")
}