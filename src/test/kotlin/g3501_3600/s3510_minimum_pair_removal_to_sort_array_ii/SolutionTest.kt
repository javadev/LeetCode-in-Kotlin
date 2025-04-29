package g3501_3600.s3510_minimum_pair_removal_to_sort_array_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumPairRemoval() {
        assertThat<Int>(
            Solution().minimumPairRemoval(intArrayOf(5, 2, 3, 1)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun minimumPairRemoval2() {
        assertThat<Int>(
            Solution().minimumPairRemoval(intArrayOf(1, 2, 2)),
            equalTo<Int>(0),
        )
    }

    @Test
    fun minimumPairRemoval3() {
        assertThat(Solution().minimumPairRemoval(intArrayOf(5, 2, 3, 1)), equalTo(2))
    }

    @Test
    fun minimumPairRemoval4() {
        assertThat(
            Solution().minimumPairRemoval(intArrayOf(2, 2, -1, 3, -2, 2, 1, 1, 1, 0, -1)),
            equalTo(9),
        )
    }

    @Test
    fun minimumPairRemoval5() {
        assertThat(Solution().minimumPairRemoval(intArrayOf(5)), equalTo(0))
    }
}
