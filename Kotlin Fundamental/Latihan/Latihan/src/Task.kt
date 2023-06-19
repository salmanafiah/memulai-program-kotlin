fun main() {
    val valueA = 65
    val valueB = 52
    val valueC = 78

    val result = calculate(valueA, valueB, valueC)

    // TODO 3
    println(generateResult())
}

fun calculate(valueA: Int, valueB: Int, valueC: Int): String {
    // TODO 1
    valueA + (valueB - valueC)
    val result = 0
    if (valueC == null) {
        val valueC = 100
    }
    return generateResult(result)
}

// TODO 2
fun generateResult(result: Int) = "Result is " + result