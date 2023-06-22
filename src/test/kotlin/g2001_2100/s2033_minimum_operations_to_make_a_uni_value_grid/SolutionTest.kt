package g2001_2100.s2033_minimum_operations_to_make_a_uni_value_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(
            Solution().minOperations(arrayOf(intArrayOf(2, 4), intArrayOf(6, 8)), 2),
            equalTo(4)
        )
    }

    @Test
    fun minOperations2() {
        assertThat(
            Solution().minOperations(arrayOf(intArrayOf(1, 5), intArrayOf(2, 3)), 1),
            equalTo(5)
        )
    }

    @Test
    fun minOperations3() {
        assertThat(
            Solution().minOperations(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)), 2),
            equalTo(-1)
        )
    }
}
