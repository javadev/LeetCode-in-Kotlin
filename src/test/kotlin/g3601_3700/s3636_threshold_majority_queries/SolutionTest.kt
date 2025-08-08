package g3601_3700.s3636_threshold_majority_queries

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun subarrayMajority() {
        assertThat<IntArray>(
            Solution()
                .subarrayMajority(
                    intArrayOf(1, 1, 2, 2, 1, 1),
                    arrayOf<IntArray>(intArrayOf(0, 5, 4), intArrayOf(0, 3, 3), intArrayOf(2, 3, 2)),
                ),
            equalTo<IntArray>(intArrayOf(1, -1, 2)),
        )
    }

    @Test
    fun subarrayMajority2() {
        assertThat<IntArray>(
            Solution()
                .subarrayMajority(
                    intArrayOf(3, 2, 3, 2, 3, 2, 3),
                    arrayOf<IntArray>(
                        intArrayOf(0, 6, 4),
                        intArrayOf(1, 5, 2),
                        intArrayOf(2, 4, 1),
                        intArrayOf(3, 3, 1),
                    ),
                ),
            equalTo<IntArray>(intArrayOf(3, 2, 3, 2)),
        )
    }
}
