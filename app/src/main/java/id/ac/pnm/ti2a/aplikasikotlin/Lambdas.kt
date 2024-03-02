package id.ac.pnm.ti2a.aplikasikotlin
fun main() {
    //LAMDAS
    var dirtyLevel = 19
    val waterFilter: (Int) -> Int = {dirty -> dirty / 2}
    println(waterFilter(dirtyLevel))

    //HIGHER ORFER FUNCTION
    fun updateDirty(dirty: Int, operation: (Int) -> Int): Int{
        return operation(dirty) }
    println(updateDirty(dirtyLevel, waterFilter))
    println(updateDirty(30, waterFilter))

    fun increaseDirty(start: Int) = start + 1
    println(updateDirty(15, ::increaseDirty))

    dirtyLevel = updateDirty(dirtyLevel) {dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel)
}