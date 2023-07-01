package g2301_2400.s2344_minimum_deletions_to_make_array_divisible

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(
            Solution().minOperations(intArrayOf(2, 3, 2, 4, 3), intArrayOf(9, 6, 9, 3, 15)),
            equalTo(2)
        )
    }

    @Test
    fun minOperations2() {
        assertThat(
            Solution().minOperations(intArrayOf(4, 3, 6), intArrayOf(8, 2, 6, 10)),
            equalTo(-1)
        )
    }
}
