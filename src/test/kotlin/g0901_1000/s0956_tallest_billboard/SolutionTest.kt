package g0901_1000.s0956_tallest_billboard

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun tallestBillboard() {
        assertThat(Solution().tallestBillboard(intArrayOf(1, 2, 3, 6)), equalTo(6))
    }

    @Test
    fun tallestBillboard2() {
        assertThat(Solution().tallestBillboard(intArrayOf(1, 2, 3, 4, 5, 6)), equalTo(10))
    }

    @Test
    fun tallestBillboard3() {
        assertThat(Solution().tallestBillboard(intArrayOf(1, 2)), equalTo(0))
    }
}
