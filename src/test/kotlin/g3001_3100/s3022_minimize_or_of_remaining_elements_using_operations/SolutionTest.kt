package g3001_3100.s3022_minimize_or_of_remaining_elements_using_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOrAfterOperations() {
        assertThat(Solution().minOrAfterOperations(intArrayOf(3, 5, 3, 2, 7), 2), equalTo(3))
    }

    @Test
    fun minOrAfterOperations2() {
        assertThat(
            Solution().minOrAfterOperations(intArrayOf(7, 3, 15, 14, 2, 8), 4),
            equalTo(2),
        )
    }

    @Test
    fun minOrAfterOperations3() {
        assertThat(
            Solution().minOrAfterOperations(intArrayOf(10, 7, 10, 3, 9, 14, 9, 4), 1),
            equalTo(15),
        )
    }
}
