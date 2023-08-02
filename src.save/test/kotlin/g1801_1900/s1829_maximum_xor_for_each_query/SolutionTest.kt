package g1801_1900.s1829_maximum_xor_for_each_query

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumXor() {
        assertThat(
            Solution().getMaximumXor(intArrayOf(0, 1, 1, 3), 2),
            equalTo(intArrayOf(0, 3, 2, 3))
        )
    }

    @Test
    fun maximumXor2() {
        assertThat(
            Solution().getMaximumXor(intArrayOf(2, 3, 4, 7), 3),
            equalTo(intArrayOf(5, 2, 6, 5))
        )
    }

    @Test
    fun maximumXor3() {
        assertThat(
            Solution().getMaximumXor(intArrayOf(0, 1, 2, 2, 5, 7), 3),
            equalTo(intArrayOf(4, 3, 6, 4, 6, 7))
        )
    }
}
