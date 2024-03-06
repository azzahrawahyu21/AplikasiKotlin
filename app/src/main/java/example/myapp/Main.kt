package example.myapp

fun buildAquarium() {
    val aquarium1 = Aquarium()
    aquarium1.printSize()
    // default height and length
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    // default width
    val aquarium3 = Aquarium(height = 31, length = 100)
    aquarium3.printSize()
    // everything custom
    val aquarium4 = Aquarium(width = 25, height = 31, length = 100)
    aquarium4.printSize()

    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} liters")
    aquarium6.volume = 70
    aquarium6.printSize()
}
fun main () {
    buildAquarium()
}