package g0501_0600.s0518_coin_change_2

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun change() {
        assertThat(Solution().change(5, intArrayOf(1, 2, 5)), equalTo(4))
    }

    @Test
    fun change2() {
        assertThat(Solution().change(3, intArrayOf(2)), equalTo(0))
    }

    @Test
    fun change3() {
        assertThat(Solution().change(10, intArrayOf(10)), equalTo(1))
    }
}
