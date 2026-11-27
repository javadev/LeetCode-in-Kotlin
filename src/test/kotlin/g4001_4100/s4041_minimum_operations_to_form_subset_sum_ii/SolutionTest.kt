package g4001_4100.s4041_minimum_operations_to_form_subset_sum_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat<Int>(Solution().minOperations(intArrayOf(1, 2, 8), 7), equalTo<Int>(1))
    }

    @Test
    fun minOperations2() {
        assertThat<Int>(Solution().minOperations(intArrayOf(1, 2, 4), 7), equalTo<Int>(0))
    }

    @Test
    fun minOperations3() {
        assertThat<Int>(Solution().minOperations(intArrayOf(2, 4), 1), equalTo<Int>(1))
    }

    @Test
    fun minOperations4() {
        assertThat<Int>(Solution().minOperations(intArrayOf(), 1), equalTo<Int>(-1))
    }
}
