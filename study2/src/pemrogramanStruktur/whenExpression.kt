package pemrogramanStruktur

fun main () {
    /**
     * bentuk lain dari struktur switch case pada java
     */
    println("tebak umur saya")
    val jawaban: Int = readln().toInt()
    when (jawaban) {
        19 -> print("anda salah")
        20 -> print("kurang benar")
        21 -> print("sepertinya masih kurang benar")
        27 -> print("yaudah deh benar")
        else -> {
            print("sorry salah semua bro")
        }
    }
}