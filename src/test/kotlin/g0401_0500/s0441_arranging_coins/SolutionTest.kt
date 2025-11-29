package g0401_0500.s0441_arranging_coins

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findKthNumber() {
        assertThat(Solution().arrangeCoins(5), equalTo(2))
    }

    @Test
    fun arrangeCoins2() {
        assertThat(Solution().arrangeCoins(8), equalTo(3))
    }

    @Test
    fun arrangeCoins3() {
        assertThat(Solution().arrangeCoins(0), equalTo(0))
    }

    @Test
    fun arrangeCoins4() {
        assertThat(Solution().arrangeCoins(1), equalTo(1))
    }

    @Test
    fun arrangeCoins5() {
        assertThat(Solution().arrangeCoins(2), equalTo(1))
    }

    @Test
    fun arrangeCoins6() {
        assertThat(Solution().arrangeCoins(3), equalTo(2))
    }

    @Test
    fun arrangeCoins7() {
        assertThat(Solution().arrangeCoins(6), equalTo(3))
    }

    @Test
    fun arrangeCoins8() {
        assertThat(Solution().arrangeCoins(2147483647), equalTo(65535))
    }

    @Test
    fun arrangeCoins9() {
        assertThat(Solution().arrangeCoins(7), equalTo(3))
    }
}
