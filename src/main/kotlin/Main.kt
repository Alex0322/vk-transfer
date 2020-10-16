fun main(args: Array<String>) {
    var amount: Int = 100_00
    var commission: Int = calcVkCommission(amount)
    println("Transfer amount: $amount kopeek, commission: $commission kopeek")
    amount = 5000_00
    commission = calcVkCommission(amount)
    println("Transfer amount: $amount kopeek, commission: $commission kopeek")
}

fun calcVkCommission(amount: Int): Int {
    val commission: Int = amount / 100 * 3 / 4
    return if (commission < 35_00)
        35_00
    else
        commission
}