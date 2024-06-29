package g3101_3200.s3193_count_the_number_of_inversions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfPermutations() {
        assertThat(
            Solution().numberOfPermutations(3, arrayOf(intArrayOf(2, 2), intArrayOf(0, 0))), equalTo(2)
        )
    }

    @Test
    fun numberOfPermutations2() {
        assertThat(
            Solution().numberOfPermutations(3, arrayOf(intArrayOf(2, 2), intArrayOf(1, 1), intArrayOf(0, 0))),
            equalTo(1)
        )
    }

    @Test
    fun numberOfPermutations3() {
        assertThat(
            Solution().numberOfPermutations(2, arrayOf(intArrayOf(0, 0), intArrayOf(1, 0))), equalTo(1)
        )
    }
}
