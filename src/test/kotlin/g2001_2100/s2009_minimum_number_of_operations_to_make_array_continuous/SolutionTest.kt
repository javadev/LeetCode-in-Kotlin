package g2001_2100.s2009_minimum_number_of_operations_to_make_array_continuous

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        MatcherAssert.assertThat(Solution().minOperations(intArrayOf(4, 2, 5, 3)), CoreMatchers.equalTo(0))
    }

    @Test
    fun minOperations2() {
        MatcherAssert.assertThat(Solution().minOperations(intArrayOf(1, 2, 3, 5, 6)), CoreMatchers.equalTo(1))
    }

    @Test
    fun minOperations3() {
        MatcherAssert.assertThat(Solution().minOperations(intArrayOf(1, 10, 100, 1000)), CoreMatchers.equalTo(3))
    }
}
