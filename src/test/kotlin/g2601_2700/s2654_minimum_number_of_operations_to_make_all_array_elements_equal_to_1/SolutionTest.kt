package g2601_2700.s2654_minimum_number_of_operations_to_make_all_array_elements_equal_to_1

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(
            Solution().minOperations(intArrayOf(2, 6, 3, 4)),
            equalTo(4)
        )
    }

    @Test
    fun minOperations2() {
        assertThat(
            Solution().minOperations(intArrayOf(2, 10, 6, 14)),
            equalTo(-1)
        )
    }

    @Test
    fun minOperations3() {
        assertThat(
            Solution().minOperations(intArrayOf(6,10,15)),
            equalTo(4)
        )
    }
}
