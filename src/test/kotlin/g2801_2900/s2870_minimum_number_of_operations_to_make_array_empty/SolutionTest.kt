package g2801_2900.s2870_minimum_number_of_operations_to_make_array_empty

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(
            Solution().minOperations(intArrayOf(2, 3, 3, 2, 2, 4, 2, 3, 4)),
            equalTo(4),
        )
    }

    @Test
    fun minOperations2() {
        assertThat(Solution().minOperations(intArrayOf(2, 1, 2, 2, 3, 3)), equalTo(-1))
    }
}
