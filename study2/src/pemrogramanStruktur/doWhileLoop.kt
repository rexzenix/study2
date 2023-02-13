package pemrogramanStruktur

fun main (){
    /**
     * akan tetap melakukan perulangan minimal 1 kali walaupun tidak masuk kedalam kondisi while
     */
    var perhitungan = 10

    do{
        println("hitung...$perhitungan")
        perhitungan--
    }while (perhitungan >= 5)
    println(" $perhitungan out of range" )
}