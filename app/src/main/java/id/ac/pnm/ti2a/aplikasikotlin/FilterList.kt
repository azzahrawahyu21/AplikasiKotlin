package id.ac.pnm.ti2a.aplikasikotlin

fun main () {
    //List Filter
    val books = listOf("nature", "biology", "birds")
    println(books.filter { it[0] == 'b' })

    //Eager Filter
    val instruments = listOf("viola", "cello", "violin")
    val eager = instruments.filter { it [0] == 'v' }
    println("eager:" + eager)

    //Lazy Filter
    val filtered = instruments.asSequence().filter { it [0] == 'v' }
    println("filtered:" + filtered)

    //Sequences List
    val newList = filtered.toList()
    println("new list:" + newList)

    //Other List
    val numbers = setOf(1, 2, 3)
    println(numbers.map { it * 3 })

    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5), setOf(1, 2))
    println(numberSets.flatten())
}