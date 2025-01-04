package g3401_3500.s3402_minimum_operations_to_make_columns_strictly_increasing

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumOperations() {
        assertThat<Int>(
            Solution().minimumOperations(
                arrayOf<IntArray>(
                    intArrayOf(3, 2),
                    intArrayOf(1, 3),
                    intArrayOf(3, 4),
                    intArrayOf(0, 1),
                ),
            ),
            equalTo<Int>(15),
        )
    }

    @Test
    fun minimumOperations2() {
        assertThat<Int>(
            Solution().minimumOperations(
                arrayOf<IntArray>(
                    intArrayOf(3, 2, 1),
                    intArrayOf(2, 1, 0),
                    intArrayOf(1, 2, 3),
                ),
            ),
            equalTo<Int>(12),
        )
    }
}
