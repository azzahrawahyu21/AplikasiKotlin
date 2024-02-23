package id.ac.pnm.ti2a.aplikasikotlin

fun main() {
    // Memanggil fungsi untuk input biodata
    val biodata = inputBiodata()

    // Memanggil fungsi untuk input hobi
    val hobi = inputHobi()

    // Menampilkan hasil biodata dan hobi
    println("\n========== Biodata ==========")
    println("Nama       : ${biodata.nama}")
    println("NIM        : ${biodata.nim}")
    println("Alamat     : ${biodata.alamat}")
    println("TTL        : ${biodata.ttl}")
    println("Kelas      : ${biodata.kelas}")
    println("Semester   : ${biodata.semester}")

    println("\n========== Hobi ==========")
    println("Hobi       : ${hobi.nama}")
    println("Deskripsi  : ${hobi.deskripsiHobi}")
}

// Fungsi untuk input biodata
fun inputBiodata(): Biodata {
    print("Masukkan Nama: ")
    val nama = readLine()!!
    print("Masukkan NIM: ")
    val nim = readLine()!!.toInt()
    print("Masukkan Alamat: ")
    val alamat = readLine()!!
    print("Masukkan TTL: ")
    val ttl = readLine()!!
    print("Masukkan Kelas: ")
    val kelas = readLine()!!
    print("Masukkan Semester: ")
    val semester = readLine()!!

    return Biodata(nama, nim, alamat, ttl, kelas, semester)
}

// Fungsi untuk input hobi
fun inputHobi(): Hobi {
    print("Masukkan hobi: ")
    val hobi = readLine()!!
    print("Masukkan deskripsi hobi: ")
    val deskripsiHobi = readLine()!!

    return Hobi(hobi, deskripsiHobi)
}

// Data class untuk menyimpan biodata
data class Biodata(val nama: String, val nim: Int, val alamat: String, val ttl: String,
                   val kelas: String, val semester: String)

// Data class untuk menyimpan hobi
data class Hobi(val nama: String, val deskripsiHobi: String)