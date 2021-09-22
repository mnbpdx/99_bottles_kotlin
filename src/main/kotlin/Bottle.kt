private interface BottleInterface {

    fun verse(bottleNumber: Int): String

    fun verses(startingBottleNumber: Int, endingBottleNumber: Int): String

    fun song(): String
}

internal class Bottle : BottleInterface {

    override fun verse(bottleNumber: Int): String =
        bottlesOfBeer(bottleNumber)
                .onTheWall()
                .bottlesOfBeer()
                .command()
                .bottlesOfBeer(bottleNumber - 1)
                .onTheWall()

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
