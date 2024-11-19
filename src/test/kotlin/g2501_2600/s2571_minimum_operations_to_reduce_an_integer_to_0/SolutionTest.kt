package g2501_2600.s2571_minimum_operations_to_reduce_an_integer_to_0

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(
            Solution().minOperations(39),
            equalTo(3),
        )
    }

    @Test
    fun minOperations2() {
        assertThat(
            Solution().minOperations(54),
            equalTo(3),
        )
    }
}
