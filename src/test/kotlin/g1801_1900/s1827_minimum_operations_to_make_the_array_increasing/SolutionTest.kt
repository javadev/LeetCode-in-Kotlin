package g1801_1900.s1827_minimum_operations_to_make_the_array_increasing

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(Solution().minOperations(intArrayOf(1, 1, 1)), equalTo(3))
    }

    @Test
    fun minOperations2() {
        assertThat(Solution().minOperations(intArrayOf(1, 5, 2, 4, 1)), equalTo(14))
    }

    @Test
    fun minOperations3() {
        assertThat(Solution().minOperations(intArrayOf(8)), equalTo(0))
    }
}
