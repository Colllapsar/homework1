fun main() {
    val numberOfSeconds = 30
    val result1 = timeView(Seconds = numberOfSeconds)
    println("Был в сети $result1")

    val result2 = timeView(Seconds = 130)
    println("Был в сети $result2")

    val result3 = timeView(Seconds = 36_000)
    println("Был в сети $result3")

    val result4 = timeView(Seconds = 600_000)
    println("Был в сети $result4")
}

fun timeView (Seconds: Int): String =
    when (val a = Seconds/60) {
        in 0..1 -> "менее минуты назад"
        in 1..60 -> "$a минут(ы) назад"
        in 60..3_600 -> (a/60).toString() + " час(ов) назад"
        else -> (a/(60*24)).toString() + " дней назад"
    }
