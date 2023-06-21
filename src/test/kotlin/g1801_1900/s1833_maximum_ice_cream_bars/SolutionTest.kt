package g1801_1900.s1833_maximum_ice_cream_bars

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxIceCream() {
        assertThat(Solution().maxIceCream(intArrayOf(1, 3, 2, 4, 1), 7), equalTo(4))
    }

    @Test
    fun maxIceCream2() {
        assertThat(Solution().maxIceCream(intArrayOf(10, 6, 8, 7, 7, 8), 5), equalTo(0))
    }

    @Test
    fun maxIceCream3() {
        assertThat(Solution().maxIceCream(intArrayOf(1, 6, 3, 1, 2, 5), 20), equalTo(6))
    }
}
