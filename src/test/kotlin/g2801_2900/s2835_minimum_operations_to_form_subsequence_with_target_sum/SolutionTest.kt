package g2801_2900.s2835_minimum_operations_to_form_subsequence_with_target_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(Solution().minOperations(mutableListOf(1, 2, 8), 7), equalTo(1))
    }

    @Test
    fun minOperations2() {
        assertThat(Solution().minOperations(mutableListOf(1, 32, 1, 2), 12), equalTo(2))
    }

    @Test
    fun minOperations3() {
        assertThat(Solution().minOperations(mutableListOf(1, 32, 1, 2), 12), equalTo(2))
    }
}
