import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RegexStatePatternTests {

    @Test
    fun `test valid integers`() {
        val validInputs = listOf("1", "123", "3452342352434534524346")

        for (input in validInputs) {
            val detector = IntegerDetector()
            assertTrue(detector.run(input), "Expected valid integer: $input")
        }
    }

    @Test
    fun `test invalid integers`() {
        val invalidInputs = listOf("", "0123", "132a", "0")

        for (input in invalidInputs) {
            val detector = IntegerDetector() // New instance for each test
            assertFalse(detector.run(input), "Expected invalid integer: $input")
        }
    }

    @Test
    fun `test valid floating point values`() {
        val validInputs = listOf("1.0", "123.34", "0.20000", "12349871234.12340981234098", ".123")

        for (input in validInputs) {
            val detector = FloatingPointDetector() // New instance for each test
            assertTrue(detector.run(input), "Expected valid floating point: $input")
        }
    }

    @Test
    fun `test invalid floating point values`() {
        val invalidInputs = listOf("123", "123.123.", "123.02a", "123.", "012.4")

        for (input in invalidInputs) {
            val detector = FloatingPointDetector() // New instance for each test
            assertFalse(detector.run(input), "Expected invalid floating point: $input")
        }
    }

    @Test
    fun `test valid binary numbers`() {
        val validInputs = listOf("1", "11", "101", "111111", "10011010001")

        for (input in validInputs) {
            val detector = BinaryNumberDetector() // New instance for each test
            assertTrue(detector.run(input), "Expected valid binary number: $input")
        }
    }

    @Test
    fun `test invalid binary numbers`() {
        val invalidInputs = listOf("01", "10", "1000010", "100a01")

        for (input in invalidInputs) {
            val detector = BinaryNumberDetector() // New instance for each test
            assertFalse(detector.run(input), "Expected invalid binary number: $input")
        }
    }

    @Test
    fun `test valid email addresses`() {
        val validInputs = listOf("a@b.c", "joseph.ditton@usu.edu", "{}*$.&$*(@*$%&.*&*")

        for (input in validInputs) {
            val detector = EmailDetector() // New instance for each test
            assertTrue(detector.run(input), "Expected valid email address: $input")
        }
    }

    @Test
    fun `test invalid email addresses`() {
        val invalidInputs = listOf("@b.c", "a@b@c.com", "a.b@b.b.c", "joseph ditton@usu.edu")

        for (input in invalidInputs) {
            val detector = EmailDetector() // New instance for each test
            assertFalse(detector.run(input), "Expected invalid email address: $input")
        }
    }

    @Test
    fun `test valid passwords`() {
        val validInputs = listOf("aaaaH!aa", "1234567*9J", "asdpoihj;loikjasdf;ijp;lij2309jasd;lfkm20ij@aH")

        for (input in validInputs) {
            val detector = PasswordDetector() // New instance for each test
            assertTrue(detector.run(input), "Expected valid password: $input")
        }
    }

    @Test
    fun `test invalid passwords`() {
        val invalidInputs = listOf("a", "aaaaaaa!", "aaaHaaaaa", "Abbbbbbb!")

        for (input in invalidInputs) {
            val detector = PasswordDetector() // New instance for each test
            assertFalse(detector.run(input), "Expected invalid password: $input")
        }
    }
}
