package g1601_1700.s1697_checking_existence_of_edge_length_limited_paths

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distanceLimitedPathsExist() {
        assertThat(
            Solution()
                .distanceLimitedPathsExist(
                    3,
                    arrayOf(
                        intArrayOf(0, 1, 2), intArrayOf(1, 2, 4),
                        intArrayOf(2, 0, 8), intArrayOf(1, 0, 16)
                    ),
                    arrayOf(intArrayOf(0, 1, 2), intArrayOf(0, 2, 5))
                ),
            equalTo(booleanArrayOf(false, true))
        )
    }

    @Test
    fun distanceLimitedPathsExist2() {
        assertThat(
            Solution()
                .distanceLimitedPathsExist(
                    5,
                    arrayOf(
                        intArrayOf(0, 1, 10), intArrayOf(1, 2, 5),
                        intArrayOf(2, 3, 9), intArrayOf(3, 4, 13)
                    ),
                    arrayOf(intArrayOf(0, 4, 14), intArrayOf(1, 4, 13))
                ),
            equalTo(booleanArrayOf(true, false))
        )
    }
}
