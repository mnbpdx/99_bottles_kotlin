private interface BottleInterface {

    fun verse(bottleNumber: Int): String

    fun verses(startingBottleNumber: Int, endingBottleNumber: Int): String

    fun song(): String
}

internal class Bottle : BottleInterface {
    override fun verse(bottleNumber: Int): String =
        "$bottleNumber bottles of beer on the wall, $bottleNumber bottles of beer.\n" +
                "Take one down and pass it around, ${bottleNumber - 1} bottles of beer on the wall.\n"

    override fun verses(startingBottleNumber: Int, endingBottleNumber: Int): String {
        TODO("Not yet implemented")
    }

    override fun song(): String {
        TODO("Not yet implemented")
    }
}

fun main() {
    val bottle = Bottle()
    println(bottle.verse(84))
}
