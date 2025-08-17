package g3601_3700.s3644_maximum_k_to_sort_a_permutation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sortPermutation() {
        assertThat<Int>(
            Solution().sortPermutation(intArrayOf(0, 3, 2, 1)),
            equalTo<Int>(1),
        )
    }

    @Test
    fun sortPermutation2() {
        assertThat<Int>(
            Solution().sortPermutation(intArrayOf(0, 1, 3, 2)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun sortPermutation3() {
        assertThat<Int>(
            Solution().sortPermutation(intArrayOf(3, 2, 1, 0)),
            equalTo<Int>(0),
        )
    }

    @Test
    fun sortPermutation4() {
        assertThat<Int>(Solution().sortPermutation(intArrayOf(0, 1)), equalTo<Int>(0))
    }
}
