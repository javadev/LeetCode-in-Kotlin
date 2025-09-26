package g3601_3700.s3690_split_and_merge_array_transformation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSplitMerge() {
        assertThat<Int>(
            Solution().minSplitMerge(intArrayOf(3, 1, 2), intArrayOf(1, 2, 3)),
            equalTo<Int>(1),
        )
    }

    @Test
    fun minSplitMerge2() {
        assertThat<Int>(
            Solution()
                .minSplitMerge(intArrayOf(1, 1, 2, 3, 4, 5), intArrayOf(5, 4, 3, 2, 1, 1)),
            equalTo<Int>(3),
        )
    }
}
