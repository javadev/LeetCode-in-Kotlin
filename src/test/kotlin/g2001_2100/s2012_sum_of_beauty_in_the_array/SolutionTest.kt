package g2001_2100.s2012_sum_of_beauty_in_the_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfBeauties() {
        assertThat(Solution().sumOfBeauties(intArrayOf(1, 2, 3)), equalTo(2))
    }

    @Test
    fun sumOfBeauties2() {
        assertThat(Solution().sumOfBeauties(intArrayOf(2, 4, 6, 4)), equalTo(1))
    }

    @Test
    fun sumOfBeauties3() {
        assertThat(Solution().sumOfBeauties(intArrayOf(3, 2, 1)), equalTo(0))
    }
}
