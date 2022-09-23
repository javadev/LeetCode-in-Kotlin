package g0001_0100.s0066_plus_one

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun plusOne() {
        assertThat(Solution().plusOne(intArrayOf(1, 2, 3)), equalTo(intArrayOf(1, 2, 4)))
    }

    @Test
    fun plusOne2() {
        assertThat(Solution().plusOne(intArrayOf(4, 3, 2, 1)), equalTo(intArrayOf(4, 3, 2, 2)))
    }

    @Test
    fun plusOne3() {
        assertThat(Solution().plusOne(intArrayOf(0)), equalTo(intArrayOf(1)))
    }

    @Test
    fun plusOne4() {
        assertThat(Solution().plusOne(intArrayOf(9)), equalTo(intArrayOf(1, 0)))
    }
}
