package classdanobject

class Kendaraan() {
    //set properties
    var nama: String? = null
    var roda: String? = null
    var sayap: Int? = null
    var warna: String? = null

    /**
     * membuat constructor dengan 4 parameter
     */

    constructor(nama: String, roda: String, sayap: Int, warna: String):this() {
        this.nama = nama
        this.roda = roda
        this.sayap = sayap
        this.warna = warna

        println("object : " + this.nama)
        println("object : " + this.roda)
        println("object : " + this.sayap)
        println("object : " + this.warna)

    }

    /*
      membuat kontruktor dengan 3 parameter
     */
    constructor(nama: String, warna: String, roda: String):this() {
        this.nama = nama
        this.warna = warna
        this.roda = roda

        println("Object : " + this.nama)
        println("Object : " + this.warna)
        println("Object : " + this.roda)
    }
}

fun main (){
    var becak = Kendaraan("Becak", "Hijau", "Tiga")
    var pesawat = Kendaraan("Boing272", "Tiga", 2,"putih")
}
