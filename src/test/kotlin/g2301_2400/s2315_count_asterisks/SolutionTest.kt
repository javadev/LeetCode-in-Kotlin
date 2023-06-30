package g2301_2400.s2315_count_asterisks

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countAsterisks() {
        assertThat(Solution().countAsterisks("l|*e*et|c**o|*de|"), equalTo(2))
    }

    @Test
    fun countAsterisks2() {
        assertThat(Solution().countAsterisks("iamprogrammer"), equalTo(0))
    }

    @Test
    fun countAsterisks3() {
        assertThat(Solution().countAsterisks("yo|uar|e**|b|e***au|tifu|l"), equalTo(5))
    }
}
