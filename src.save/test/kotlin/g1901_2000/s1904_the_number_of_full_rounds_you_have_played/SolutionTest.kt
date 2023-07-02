package g1901_2000.s1904_the_number_of_full_rounds_you_have_played

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfRounds() {
        assertThat(Solution().numberOfRounds("09:31", "10:14"), equalTo(1))
    }

    @Test
    fun numberOfRounds2() {
        assertThat(Solution().numberOfRounds("21:30", "03:00"), equalTo(22))
    }

    @Test
    fun numberOfRounds3() {
        assertThat(Solution().numberOfRounds("21:30", "21:30"), equalTo(0))
    }
}
