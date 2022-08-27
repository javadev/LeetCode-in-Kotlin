package g0001_0100.s0041_first_missing_positive

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun firstMissingPositive() {
        assertThat(Solution().firstMissingPositive(intArrayOf(1, 2, 0)), equalTo(3))
    }

    @Test
    fun firstMissingPositive2() {
        assertThat(Solution().firstMissingPositive(intArrayOf(3, 4, -1, 1)), equalTo(2))
    }

    @Test
    fun firstMissingPositive3() {
        assertThat(Solution().firstMissingPositive(intArrayOf(7, 8, 9, 11, 12)), equalTo(1))
    }
}
