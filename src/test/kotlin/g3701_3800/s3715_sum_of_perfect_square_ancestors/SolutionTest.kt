package g3701_3800.s3715_sum_of_perfect_square_ancestors

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfAncestors() {
        assertThat<Long>(
            Solution().sumOfAncestors(3, arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(1, 2)), intArrayOf(2, 8, 2)),
            equalTo<Long>(3L)
        )
    }

    @Test
    fun sumOfAncestors2() {
        assertThat<Long>(
            Solution().sumOfAncestors(3, arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(0, 2)), intArrayOf(1, 2, 4)),
            equalTo<Long>(1L)
        )
    }

    @Test
    fun sumOfAncestors3() {
        assertThat<Long>(
            Solution()
                .sumOfAncestors(
                    4, arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(1, 3)), intArrayOf(1, 2, 9, 4)
                ),
            equalTo<Long>(2L)
        )
    }
}
