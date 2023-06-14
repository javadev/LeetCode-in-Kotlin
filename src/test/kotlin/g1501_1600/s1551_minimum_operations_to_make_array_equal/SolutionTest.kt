package g1501_1600.s1551_minimum_operations_to_make_array_equal

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        MatcherAssert.assertThat(Solution().minOperations(3), CoreMatchers.equalTo(2))
    }

    @Test
    fun minOperations2() {
        MatcherAssert.assertThat(Solution().minOperations(6), CoreMatchers.equalTo(9))
    }
}
