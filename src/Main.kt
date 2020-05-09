fun main() {
    val names = listOf("Fiqri", "Kece", "Ganteng", "Sekali")
    checkFirst(names)
}

fun checkFirst(names: List<String>) {
    if (names.firstOrNull() != null) {
        println(names.first())
    } else {
        println("No Names")
    }
}