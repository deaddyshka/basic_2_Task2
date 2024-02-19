fun main() {
    val likes = 1111
    val result = when {
        likes % 100 == 11 -> "Понравилось $likes людям"
        likes % 10 == 1 -> "Понравилось $likes человеку"
        else -> "Понравилось $likes людям"
    }
    println(result)
}