package classdanobject

class rumah (var tipe:String, val harga:Double, val tahunPembangunan: Int, val pemilik:String){
    /**
     *melakukan inisialisasi class rumah
     *
     */
    init{
        this.tipe
        this.harga
        this.tahunPembangunan
        this.pemilik
    }
    /**
     * getter and setter adalah sebuah optional pada kotlin tidak seperti java
     * membuat getter dan setter adalah bad programming di kotlin
     * kotlin menginginkan kita untuk selalu menggunakan properties untuk mengakses dan set class
     */
}

fun main(){
    /**
     *membuat sebuah object rumah
     */
    val rumah = rumah("Mewah", 2000000.0, 2021, "Sanusi")

    print("rumah ${rumah.pemilik} tahun pembangunan ${rumah.tahunPembangunan} dengan harga ${rumah.harga} tipe ${rumah.tipe}")
}