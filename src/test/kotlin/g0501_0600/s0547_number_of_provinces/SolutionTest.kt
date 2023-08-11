package g0501_0600.s0547_number_of_provinces

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findCircleNum() {
        assertThat(
            Solution().findCircleNum(arrayOf(intArrayOf(1, 1, 0), intArrayOf(1, 1, 0), intArrayOf(0, 0, 1))),
            equalTo(2)
        )
    }

    @Test
    fun findCircleNum2() {
        assertThat(
            Solution().findCircleNum(arrayOf(intArrayOf(1, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 1))),
            equalTo(3)
        )
    }
}
