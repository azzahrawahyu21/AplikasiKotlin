import kotlin.random.Random

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" -> true
        else -> false
    }
}

fun randomDay(): String {
    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return days[Random.nextInt(days.size)]
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday", "Tuesday", "Thursday", "Friday" -> "flakes"
        "Wednesday" -> "pellets"
        "Saturday" -> "mosquitoes"
        "Sunday" -> "nothing"
        else -> throw IllegalArgumentException("Invalid day: $day")
    }
}

fun foodTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}

fun swim(speed: String = "fast") {
    println("Swimming $speed")
}

fun main() {
    swim()
    swim("slow")
    swim(speed = "turtle-like")
    foodTheFish()
}