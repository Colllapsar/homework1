fun main() {
    val weight1: Double = 80.0
    val height1: Double = 1.8
    val verdict1 = bodyMassIndex(weight = weight1,height = height1)
    println("Ваше состояние 1 = $verdict1")

    val verdict2 = bodyMassIndex(weight = 100.0,height = 1.9)
    println("Ваше состояние 2 = $verdict2")

    val verdict3 = bodyMassIndex(weight = 50.0,height = 1.7)
    println("Ваше состояние 3 = $verdict3")

    val verdict4 = bodyMassIndex(weight = 120.0,height = 1.8)
    println("Ваше состояние 4 = $verdict4")
}

fun bodyMassIndex(weight: Double, height: Double): String =
    when(weight / (height * height)) {
        in 0.0..16.0 -> "Выраженный дефицит массы тела"
        in 16.0..18.5 -> "Недостаточная (дефицит) масса тела"
        in 18.5..25.0 -> "Норма"
        in 25.0..30.0 -> "Избыточная масса тела (предожирение)"
        in 30.0..35.0 -> "Ожирение"
        in 35.0..40.0 -> "Ожирение резкое"
        else -> "Очень резкое ожирение"
    }

