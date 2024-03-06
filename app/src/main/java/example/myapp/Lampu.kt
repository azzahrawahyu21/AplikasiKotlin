package example.myapp

class Lampu(var tipe: String, var warna: String = "putih"){
    var lampuWarna: String = warna
    val tipeLampu: String = tipe
    val isForSale: Boolean = false

    fun updateWarna(newWarna: String){
        this.lampuWarna = newWarna
    }

    fun putOnSale(status: Boolean){

    }
}

fun main(){
    val lampu1 = Lampu(tipe = "sediaan", warna = "putih")
    println("Lampu Sediaan berwarna ${lampu1.lampuWarna}")
    println("Lampu Sediaan tipe ${lampu1.tipeLampu}")
    lampu1.updateWarna(newWarna = "hijau")
    println("Lampu Sediaan warna baru ${lampu1.lampuWarna}")
    println("=".repeat(n = 30))

    val lampu2 = Lampu(tipe = "sediaan", warna = "merah")
    println("Lampu Sediaan berwarna ${lampu2.lampuWarna}")
    println("Lampu Sediaan tipe ${lampu2.tipeLampu}")
    lampu2.updateWarna(newWarna = "kuning")
    println("Lampu Sediaan warna baru ${lampu2.lampuWarna}")
    println("=".repeat(n = 30))
}