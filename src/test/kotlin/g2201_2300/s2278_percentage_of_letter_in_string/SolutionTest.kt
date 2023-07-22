package g2201_2300.s2278_percentage_of_letter_in_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun percentageLetter() {
        assertThat(Solution().percentageLetter("foobar", 'o'), equalTo(33))
    }

    @Test
    fun percentageLetter2() {
        assertThat(Solution().percentageLetter("jjjj", 'k'), equalTo(0))
    }
}
