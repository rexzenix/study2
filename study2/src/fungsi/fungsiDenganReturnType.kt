package fungsi

fun main(){
    println(perkalian( 3, 4))
    val pembagian = perkalian( 13, 2) / angkaBagi(4)
    println(pembagian)
    HelloWorld()
    Nama()
}

/*membuat fungsi Perkalian dengan return type Integer*/
fun perkalian(angkaPertama:Int, angkaKedua:Int):Int{
    val hasil = angkaPertama * angkaKedua
    return hasil
}
/*membuat fungsi pembagian dengan return type Integer*/
fun angkaBagi(angka_bagi:Int):Int{
    return angka_bagi
}

fun HelloWorld(){
    println("Mari Belajar Kotlin")
}

fun Nama():String{
    val nama = readln()
    return nama.toString()
}