package g0501_0600.s0598_range_addition_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxCount() {
        val javaArray: Array<IntArray> = arrayOf(intArrayOf(2, 2), intArrayOf(3, 3))
        assertThat(Solution().maxCount(3, 3, javaArray), equalTo(4))
    }

    @Test
    fun maxCount2() {
        val javaArray: Array<IntArray> = arrayOf(
            intArrayOf(2, 2), intArrayOf(3, 3), intArrayOf(3, 3), intArrayOf(3, 3),
            intArrayOf(2, 2), intArrayOf(3, 3), intArrayOf(3, 3), intArrayOf(3, 3), intArrayOf(2, 2), intArrayOf(3, 3),
            intArrayOf(3, 3), intArrayOf(3, 3)
        )
        assertThat(Solution().maxCount(3, 3, javaArray), equalTo(4))
    }

    @Test
    fun maxCount3() {
        assertThat(Solution().maxCount(3, 3, arrayOf()), equalTo(9))
    }
}
