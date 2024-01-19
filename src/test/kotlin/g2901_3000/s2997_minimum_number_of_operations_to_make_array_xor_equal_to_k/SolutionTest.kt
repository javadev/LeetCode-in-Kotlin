package g2901_3000.s2997_minimum_number_of_operations_to_make_array_xor_equal_to_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(Solution().minOperations(intArrayOf(2, 1, 3, 4), 1), equalTo(2))
    }

    @Test
    fun minOperations2() {
        assertThat(Solution().minOperations(intArrayOf(2, 0, 2, 0), 0), equalTo(0))
    }
}
