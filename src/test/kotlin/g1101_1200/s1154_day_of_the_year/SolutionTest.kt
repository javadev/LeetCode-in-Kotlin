package g1101_1200.s1154_day_of_the_year

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun dayOfYear() {
        MatcherAssert.assertThat(Solution().dayOfYear("2019-01-09"), CoreMatchers.equalTo(9))
    }

    @Test
    fun dayOfYear2() {
        MatcherAssert.assertThat(Solution().dayOfYear("2019-02-10"), CoreMatchers.equalTo(41))
    }
}
