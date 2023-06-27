package g0901_1000.s0941_valid_mountain_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun validMountainArray() {
        assertThat(Solution().validMountainArray(intArrayOf(2, 1)), equalTo(false))
    }

    @Test
    fun validMountainArray2() {
        assertThat(Solution().validMountainArray(intArrayOf(3, 5, 5)), equalTo(false))
    }

    @Test
    fun validMountainArray3() {
        assertThat(Solution().validMountainArray(intArrayOf(0, 3, 2, 1)), equalTo(true))
    }
}
