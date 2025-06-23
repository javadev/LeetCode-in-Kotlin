package g3501_3600.s3593_minimum_increments_to_equalize_leaf_paths

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minIncrease() {
        assertThat<Int>(
            Solution().minIncrease(3, arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(0, 2)), intArrayOf(2, 1, 3)),
            equalTo<Int>(1),
        )
    }

    @Test
    fun minIncrease2() {
        assertThat<Int>(
            Solution().minIncrease(3, arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(1, 2)), intArrayOf(5, 1, 4)),
            equalTo<Int>(0),
        )
    }

    @Test
    fun minIncrease3() {
        assertThat<Int>(
            Solution()
                .minIncrease(
                    5,
                    arrayOf<IntArray>(intArrayOf(0, 4), intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(1, 3)),
                    intArrayOf(3, 4, 1, 1, 7),
                ),
            equalTo<Int>(1),
        )
    }
}
