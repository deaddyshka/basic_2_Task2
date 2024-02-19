fun main() {
    val likes = 11
    val result = when (likes % 10) {
        1 -> "Понравилось $likes человеку"
        11 -> "Понравилось $likes людям"
        else -> "Понравилось $likes людям"
    }
    println(result)
}