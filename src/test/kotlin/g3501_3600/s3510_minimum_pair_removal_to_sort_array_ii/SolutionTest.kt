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
}
