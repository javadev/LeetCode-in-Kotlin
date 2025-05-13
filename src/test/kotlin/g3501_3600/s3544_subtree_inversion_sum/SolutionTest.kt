package g3501_3600.s3544_subtree_inversion_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun subtreeInversionSum() {
        assertThat<Long>(
            Solution()
                .subtreeInversionSum(
                    arrayOf<IntArray>(
                        intArrayOf(0, 1),
                        intArrayOf(0, 2),
                        intArrayOf(1, 3),
                        intArrayOf(1, 4),
                        intArrayOf(2, 5),
                        intArrayOf(2, 6),
                    ),
                    intArrayOf(4, -8, -6, 3, 7, -2, 5),
                    2,
                ),
            equalTo<Long>(27L),
        )
    }

    @Test
    fun subtreeInversionSum2() {
        assertThat<Long>(
            Solution()
                .subtreeInversionSum(
                    arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4)),
                    intArrayOf(-1, 3, -2, 4, -5),
                    2,
                ),
            equalTo<Long>(9L),
        )
    }

    @Test
    fun subtreeInversionSum3() {
        assertThat<Long>(
            Solution()
                .subtreeInversionSum(
                    arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(0, 2)),
                    intArrayOf(0, -1, -2),
                    3,
                ),
            equalTo<Long>(3L),
        )
    }
}
