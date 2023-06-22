package g2001_2100.s2012_sum_of_beauty_in_the_array

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfBeauties() {
        MatcherAssert.assertThat(Solution().sumOfBeauties(intArrayOf(1, 2, 3)), CoreMatchers.equalTo(2))
    }

    @Test
    fun sumOfBeauties2() {
        MatcherAssert.assertThat(Solution().sumOfBeauties(intArrayOf(2, 4, 6, 4)), CoreMatchers.equalTo(1))
    }

    @Test
    fun sumOfBeauties3() {
        MatcherAssert.assertThat(Solution().sumOfBeauties(intArrayOf(3, 2, 1)), CoreMatchers.equalTo(0))
    }
}
