fun main() {
    val amount = 100
    val total = 100
    val fee1 = calculateFee(amountF = amount, totalF = total, exclusive = true)
    println("Проценты с 1 продажи = $fee1")

    val fee2 = calculateFee(amountF = 200, totalF = 1_100, exclusive = true)
    println("Проценты с 2 продажи = $fee2")

    val fee3 = calculateFee(amountF = 100, totalF = 11_000, exclusive = true)
    println("Проценты с 3 продажи = $fee3")

    val fee4 = calculateFee(amountF = 100, totalF = 11_000, exclusive = false)
    println("Проценты с 4 продажи = $fee4")

    val fee5 = calculateFee(amountF = 100, totalF = 55_000, exclusive = false)
    println("Проценты с 5 продажи = $fee5")
}

fun calculateFee (amountF: Int, totalF: Int, exclusive: Boolean): Int {
    var a = 0
    if (exclusive) a += 5
    return when (totalF) {
        in 0..1_000 -> amountF/100*(30-a)
        in 1_001..10_000 -> amountF/100*(25-a)
        in 10_001..50_000 -> amountF/100*(20-a)
        else -> amountF/100*(15-a)
    }
}