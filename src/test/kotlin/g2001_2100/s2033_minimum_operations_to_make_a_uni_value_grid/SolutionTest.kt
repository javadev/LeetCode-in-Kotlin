package g2001_2100.s2033_minimum_operations_to_make_a_uni_value_grid

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        MatcherAssert.assertThat(
            Solution().minOperations(arrayOf(intArrayOf(2, 4), intArrayOf(6, 8)), 2),
            CoreMatchers.equalTo(4)
        )
    }

    @Test
    fun minOperations2() {
        MatcherAssert.assertThat(
            Solution().minOperations(arrayOf(intArrayOf(1, 5), intArrayOf(2, 3)), 1),
            CoreMatchers.equalTo(5)
        )
    }

    @Test
    fun minOperations3() {
        MatcherAssert.assertThat(
            Solution().minOperations(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)), 2),
            CoreMatchers.equalTo(-1)
        )
    }
}
