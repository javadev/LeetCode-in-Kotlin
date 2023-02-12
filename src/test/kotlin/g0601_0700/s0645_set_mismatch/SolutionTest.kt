package g0601_0700.s0645_set_mismatch

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findErrorNums() {
        assertThat(Solution().findErrorNums(intArrayOf(1, 2, 2, 4)), equalTo(intArrayOf(2, 3)))
    }

    @Test
    fun findErrorNums2() {
        assertThat(Solution().findErrorNums(intArrayOf(1, 1)), equalTo(intArrayOf(1, 2)))
    }

    @Test
    fun findErrorNums3() {
        assertThat(Solution().findErrorNums(intArrayOf(1, 2, 4, 4)), equalTo(intArrayOf(4, 3)))
    }
}
