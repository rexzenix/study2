package fungsi

fun main (){
    tambah(3,  5)
    luasSegitiga(5, 2)
}

fun tambah(nomo1:Int, nomor2:Int){
    val sum = nomo1 + nomor2
    println(sum)
}

fun luasSegitiga(tinggi:Int,alas:Int){
    val hitungluas = alas * tinggi /2
    println("luas segitiga adalah alas $alas dikali $tinggi dibagi 2 hasilnya $hitungluas ")
}
