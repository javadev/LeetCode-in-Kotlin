package g2801_2900.s2869_minimum_operations_to_collect_elements

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        MatcherAssert.assertThat(Solution().minOperations(mutableListOf(3, 1, 5, 4, 2), 2), CoreMatchers.equalTo(4))
    }

    @Test
    fun minOperations2() {
        MatcherAssert.assertThat(Solution().minOperations(mutableListOf(3, 1, 5, 4, 2), 5), CoreMatchers.equalTo(5))
    }

    @Test
    fun minOperations3() {
        MatcherAssert.assertThat(Solution().minOperations(mutableListOf(3, 2, 5, 3, 1), 3), CoreMatchers.equalTo(4))
    }
}
