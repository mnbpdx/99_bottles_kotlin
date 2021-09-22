private interface BottleInterface {

    fun verse(bottleNumber: Int): String

    fun verses(startingBottleNumber: Int, endingBottleNumber: Int): String

    fun song(): String
}

class Bottle : BottleInterface {
    override fun verse(bottleNumber: Int): String {
        TODO("Not yet implemented")
    }

    override fun verses(startingBottleNumber: Int, endingBottleNumber: Int): String {
        TODO("Not yet implemented")
    }

    override fun song(): String {
        TODO("Not yet implemented")
    }

}
