package g1701_1800.s1758_minimum_changes_to_make_alternating_binary_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(Solution().minOperations("0100"), equalTo(1))
    }

    @Test
    fun minOperations2() {
        assertThat(Solution().minOperations("10"), equalTo(0))
    }

    @Test
    fun minOperations3() {
        assertThat(Solution().minOperations("1111"), equalTo(2))
    }
}
