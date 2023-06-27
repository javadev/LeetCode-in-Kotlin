package g1601_1700.s1675_minimize_deviation_in_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumDeviation() {
        assertThat(Solution().minimumDeviation(intArrayOf(1, 2, 3, 4)), equalTo(1))
    }

    @Test
    fun minimumDeviation2() {
        assertThat(Solution().minimumDeviation(intArrayOf(4, 1, 5, 20, 3)), equalTo(3))
    }

    @Test
    fun minimumDeviation3() {
        assertThat(Solution().minimumDeviation(intArrayOf(2, 10, 8)), equalTo(3))
    }
}
