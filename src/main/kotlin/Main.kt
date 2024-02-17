fun main() {
    val likes = 49
    val result = when (likes % 10) {
        1 -> "Понравилось $likes человеку"
        else -> "Понравилось $likes людям"
    }
    println(result)
}