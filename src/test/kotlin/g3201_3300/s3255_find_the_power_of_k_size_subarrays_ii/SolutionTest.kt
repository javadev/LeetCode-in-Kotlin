package g3201_3300.s3255_find_the_power_of_k_size_subarrays_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun resultsArray() {
        assertThat(
            Solution().resultsArray(intArrayOf(1, 2, 3, 4, 3, 2, 5), 3),
            equalTo(intArrayOf(3, 4, -1, -1, -1))
        )
    }

    @Test
    fun resultsArray2() {
        assertThat(
            Solution().resultsArray(intArrayOf(2, 2, 2, 2, 2), 4),
            equalTo(intArrayOf(-1, -1))
        )
    }

    @Test
    fun resultsArray3() {
        assertThat(
            Solution().resultsArray(intArrayOf(3, 2, 3, 2, 3, 2), 2),
            equalTo(intArrayOf(-1, 3, -1, 3, -1))
        )
    }

    @Test
    fun resultsArray4() {
        assertThat(Solution().resultsArray(intArrayOf(1), 1), equalTo(intArrayOf(1)))
    }
}
