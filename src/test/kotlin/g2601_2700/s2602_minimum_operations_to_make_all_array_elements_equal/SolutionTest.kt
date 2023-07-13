package g2601_2700.s2602_minimum_operations_to_make_all_array_elements_equal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(Solution().minOperations(intArrayOf(3, 1, 6, 8), intArrayOf(1, 5)), equalTo(listOf(14L, 10L)))
    }

    @Test
    fun minOperations2() {
        assertThat(Solution().minOperations(intArrayOf(2, 9, 6, 3), intArrayOf(10)), equalTo(listOf(20L)))
    }
}
