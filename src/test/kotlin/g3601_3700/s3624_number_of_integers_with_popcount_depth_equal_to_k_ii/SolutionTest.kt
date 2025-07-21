package g3601_3700.s3624_number_of_integers_with_popcount_depth_equal_to_k_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun popcountDepth() {
        assertThat<IntArray>(
            Solution()
                .popcountDepth(
                    longArrayOf(2, 4),
                    arrayOf<LongArray>(longArrayOf(1, 0, 1, 1), longArrayOf(2, 1, 1), longArrayOf(1, 0, 1, 0)),
                ),
            equalTo<IntArray>(intArrayOf(2, 1)),
        )
    }

    @Test
    fun popcountDepth2() {
        assertThat<IntArray>(
            Solution()
                .popcountDepth(
                    longArrayOf(3, 5, 6),
                    arrayOf<LongArray>(
                        longArrayOf(1, 0, 2, 2),
                        longArrayOf(2, 1, 4),
                        longArrayOf(1, 1, 2, 1),
                        longArrayOf(1, 0, 1, 0),
                    ),
                ),
            equalTo<IntArray>(intArrayOf(3, 1, 0)),
        )
    }

    @Test
    fun popcountDepth3() {
        assertThat<IntArray>(
            Solution()
                .popcountDepth(
                    longArrayOf(1, 2),
                    arrayOf<LongArray>(
                        longArrayOf(1, 0, 1, 1),
                        longArrayOf(2, 0, 3),
                        longArrayOf(1, 0, 0, 1),
                        longArrayOf(1, 0, 0, 2),
                    ),
                ),
            equalTo<IntArray>(intArrayOf(1, 0, 1)),
        )
    }
}
