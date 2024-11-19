package g2601_2700.s2612_minimum_reverse_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minReverseOperations() {
        assertThat(
            Solution().minReverseOperations(4, 0, intArrayOf(1, 2), 4),
            equalTo(
                intArrayOf(0, -1, -1, 1),
            ),
        )
    }

    @Test
    fun minReverseOperations2() {
        assertThat(
            Solution().minReverseOperations(5, 0, intArrayOf(2, 4), 3),
            equalTo(
                intArrayOf(0, -1, -1, -1, -1),
            ),
        )
    }

    @Test
    fun minReverseOperations3() {
        assertThat(
            Solution().minReverseOperations(4, 2, intArrayOf(0, 1, 3), 1),
            equalTo(
                intArrayOf(-1, -1, 0, -1),
            ),
        )
    }
}
