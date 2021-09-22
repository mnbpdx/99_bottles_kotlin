import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import java.io.File

/*
    These tests are my attempt at a 1:1 Kotlin conversion of Sandi Metz's JS tests from the book.
 */

private class BottleTest {

    // TODO: change this String to be a Text type that includes the verse constants as members
    private val text: String = File(ClassLoader.getSystemResource("song.txt").file).readText()
    private lateinit var bottle: Bottle

    @BeforeEach
    private fun setupEach() {
        bottle = Bottle()
    }

    @Test
    fun `GIVEN mark WHEN you ask if he's cool THEN i will tell you hell yeah my dude`() {
        val markIsCool = true

        assert(markIsCool)
    }

    @Test
    fun `GIVEN the the *first* verse WHEN it is read THEN it will match an expected string`() {
        val expectedVerse = "99 bottles of beer on the wall, " +
                "99 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "98 bottles of beer on the wall.\n"

        val actualVerse = bottle.verse(99)

        assertEquals(expectedVerse, actualVerse)
    }


    @Test
    fun `GIVEN the *4th to last* verse WHEN it is read THEN it will match an expected string`() {
        val expectedVerse = "3 bottles of beer on the wall, " +
                "3 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "2 bottles of beer on the wall.\n";


        val actualVerse = bottle.verse(3)

        assertEquals(expectedVerse, actualVerse)
    }

    @Disabled
    @Test
    fun `GIVEN the *3rd to last* verse WHEN it is read THEN it will match an expected string`() {
        val expectedVerse = "2 bottles of beer on the wall, " +
                "2 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "1 bottle of beer on the wall.\n";

        val actualVerse = bottle.verse(2)

        assertEquals(expectedVerse, actualVerse)
    }

    @Disabled
    @Test
    fun `GIVEN the *2nd to last* verse WHEN it is read THEN it will match an expected string`() {
        val expectedVerse = "1 bottle of beer on the wall, " +
                "1 bottle of beer.\n" +
                "Take it down and pass it around, " +
                "no more bottles of beer on the wall.\n"

        val actualVerse = bottle.verse(1)

        assertEquals(expectedVerse, actualVerse)
    }

    @Disabled
    @Test
    fun `GIVEN the *last* verse WHEN it is read THEN it will match an expected string`() {
        val expectedVerse = "No more bottles of beer on the wall, " +
                "no more bottles of beer.\n" +
                "Go to the store and buy some more, " +
                "99 bottles of beer on the wall.\n"

        val actualVerse = bottle.verse(0)

        assertEquals(expectedVerse, actualVerse)
    }

    @Disabled
    @Test
    fun `GIVEN a couple verses WHEN they are read THEN they will match an expected string`() {
        val expectedVerses = "99 bottles of beer on the wall, " +
                "99 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "98 bottles of beer on the wall.\n" +
                "\n" +
                "98 bottles of beer on the wall, " +
                "98 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "97 bottles of beer on the wall.\n"

        val actualVerses = bottle.verses(99, 98)

        assertEquals(expectedVerses, actualVerses)
    }

    @Disabled
    @Test
    fun `GIVEN a few verses WHEN they are read THEN they will match an expected string`() {
        val expectedVerses = "2 bottles of beer on the wall, " +
                "2 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "1 bottle of beer on the wall.\n" +
                "\n" +
                "1 bottle of beer on the wall, " +
                "1 bottle of beer.\n" +
                "Take it down and pass it around, " +
                "no more bottles of beer on the wall.\n" +
                "\n" +
                "No more bottles of beer on the wall, " +
                "no more bottles of beer.\n" +
                "Go to the store and buy some more, " +
                "99 bottles of beer on the wall.\n";


        val actualVerses = bottle.verses(2, 0)

        assertEquals(expectedVerses, actualVerses)
    }

    @Disabled
    @Test
    fun `GIVEN the whole song WHEN it is read THEN they will match an expected string`() {
        val expectedSong = text


        val actualSong = bottle.song()

        assertEquals(expectedSong, actualSong)
    }

}