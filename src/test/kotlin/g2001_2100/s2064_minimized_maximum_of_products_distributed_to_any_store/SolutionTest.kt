package g2001_2100.s2064_minimized_maximum_of_products_distributed_to_any_store

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimizedMaximum() {
        assertThat(Solution().minimizedMaximum(6, intArrayOf(11, 6)), equalTo(3))
    }

    @Test
    fun minimizedMaximum2() {
        assertThat(Solution().minimizedMaximum(7, intArrayOf(15, 10, 10)), equalTo(5))
    }

    @Test
    fun minimizedMaximum3() {
        assertThat(Solution().minimizedMaximum(1, intArrayOf(100000)), equalTo(100000))
    }
}
