package g2801_2900.s2869_minimum_operations_to_collect_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(Solution().minOperations(mutableListOf(3, 1, 5, 4, 2), 2), equalTo(4))
    }

    @Test
    fun minOperations2() {
        assertThat(Solution().minOperations(mutableListOf(3, 1, 5, 4, 2), 5), equalTo(5))
    }

    @Test
    fun minOperations3() {
        assertThat(Solution().minOperations(mutableListOf(3, 2, 5, 3, 1), 3), equalTo(4))
    }
}
