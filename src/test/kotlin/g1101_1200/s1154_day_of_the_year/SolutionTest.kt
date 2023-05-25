package g1101_1200.s1154_day_of_the_year

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun dayOfYear() {
        assertThat(Solution().dayOfYear("2019-01-09"), equalTo(9))
    }

    @Test
    fun dayOfYear2() {
        assertThat(Solution().dayOfYear("2019-02-10"), equalTo(41))
    }
}
