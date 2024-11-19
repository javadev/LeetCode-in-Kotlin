package g2401_2500.s2435_paths_in_matrix_whose_sum_is_divisible_by_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfPaths() {
        assertThat(
            Solution().numberOfPaths(arrayOf(intArrayOf(5, 2, 4), intArrayOf(3, 0, 5), intArrayOf(0, 7, 2)), 3),
            equalTo(2),
        )
    }

    @Test
    fun numberOfPairs2() {
        assertThat(Solution().numberOfPaths(arrayOf(intArrayOf(0, 0)), 5), equalTo(1))
    }

    @Test
    fun numberOfPairs3() {
        assertThat(
            Solution()
                .numberOfPaths(arrayOf(intArrayOf(7, 3, 4, 9), intArrayOf(2, 3, 6, 2), intArrayOf(2, 3, 7, 0)), 1),
            equalTo(10),
        )
    }
}
