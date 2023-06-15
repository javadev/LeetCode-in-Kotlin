package g1701_1800.s1713_minimum_operations_to_make_a_subsequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(
                Solution().minOperations(intArrayOf(5, 1, 3), intArrayOf(9, 4, 2, 3, 4)),
                equalTo(2))
    }

    @Test
    fun minOperations2() {
        assertThat(
                Solution()
                        .minOperations(intArrayOf(6, 4, 8, 1, 3, 2), intArrayOf(4, 7, 6, 2, 3, 8, 6, 1)),
                equalTo(3))
    }
}
