package g2101_2200.s2111_minimum_operations_to_make_the_array_k_increasing

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kIncreasing() {
        assertThat(Solution().kIncreasing(intArrayOf(5, 4, 3, 2, 1), 1), equalTo(4))
    }

    @Test
    fun kIncreasing2() {
        assertThat(Solution().kIncreasing(intArrayOf(4, 1, 5, 2, 6, 2), 2), equalTo(0))
    }

    @Test
    fun kIncreasing3() {
        assertThat(Solution().kIncreasing(intArrayOf(4, 1, 5, 2, 6, 2), 3), equalTo(2))
    }
}
