package g2301_2400.s2309_greatest_english_letter_in_upper_and_lower_case

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun greatestLetter() {
        assertThat(Solution().greatestLetter("lEeTcOdE"), equalTo("E"))
    }

    @Test
    fun greatestLetter2() {
        assertThat(Solution().greatestLetter("arRAzFif"), equalTo("R"))
    }

    @Test
    fun greatestLetter3() {
        assertThat(Solution().greatestLetter(""), equalTo(""))
    }

    @Test
    fun greatestLetter4() {
        Assertions.assertThrows(
            ArrayIndexOutOfBoundsException::class.java
        ) { Solution().greatestLetter("0|") }
    }
}
