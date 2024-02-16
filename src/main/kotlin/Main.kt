fun main() {
    val likes = 49
    val result = when (likes % 10) {
        1 -> "Понравилось $likes человеку"
        in 2..4 -> "Понравилось $likes людям"
        else -> "Понравилось $likes людям"
    }
    println(result)
}