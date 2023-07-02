package g1401_1500.s1492_the_kth_factor_of_n

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kthFactor() {
        assertThat(Solution().kthFactor(12, 3), equalTo(3))
    }

    @Test
    fun kthFactor2() {
        assertThat(Solution().kthFactor(7, 2), equalTo(7))
    }

    @Test
    fun kthFactor3() {
        assertThat(Solution().kthFactor(4, 4), equalTo(-1))
    }
}
