package g1501_1600.s1551_minimum_operations_to_make_array_equal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(Solution().minOperations(3), equalTo(2))
    }

    @Test
    fun minOperations2() {
        assertThat(Solution().minOperations(6), equalTo(9))
    }
}
