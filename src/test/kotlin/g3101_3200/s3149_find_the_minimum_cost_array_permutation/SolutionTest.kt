package g3101_3200.s3149_find_the_minimum_cost_array_permutation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findPermutation() {
        assertThat(
            Solution().findPermutation(intArrayOf(1, 0, 2)), equalTo(intArrayOf(0, 1, 2))
        )
    }

    @Test
    fun findPermutation2() {
        assertThat(
            Solution().findPermutation(intArrayOf(0, 2, 1)), equalTo(intArrayOf(0, 2, 1))
        )
    }
}
