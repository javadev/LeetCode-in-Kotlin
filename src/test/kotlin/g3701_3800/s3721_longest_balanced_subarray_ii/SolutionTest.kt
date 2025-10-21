package g3701_3800.s3721_longest_balanced_subarray_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestBalanced() {
        assertThat<Int>(
            Solution().longestBalanced(intArrayOf(2, 5, 4, 3)),
            equalTo<Int>(4),
        )
    }

    @Test
    fun longestBalanced2() {
        assertThat<Int>(
            Solution().longestBalanced(intArrayOf(3, 2, 2, 5, 4)),
            equalTo<Int>(5),
        )
    }

    @Test
    fun longestBalanced3() {
        assertThat<Int>(
            Solution().longestBalanced(intArrayOf(1, 2, 3, 2)),
            equalTo<Int>(3),
        )
    }
}
