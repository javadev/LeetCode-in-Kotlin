package g3501_3600.s3525_find_x_value_of_array_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun resultArray() {
        assertThat<IntArray>(
            Solution()
                .resultArray(
                    intArrayOf(1, 2, 3, 4, 5),
                    3,
                    arrayOf<IntArray>(intArrayOf(2, 2, 0, 2), intArrayOf(3, 3, 3, 0), intArrayOf(0, 1, 0, 1)),
                ),
            equalTo<IntArray>(intArrayOf(2, 2, 2)),
        )
    }

    @Test
    fun resultArray2() {
        assertThat<IntArray>(
            Solution()
                .resultArray(
                    intArrayOf(1, 2, 4, 8, 16, 32),
                    4,
                    arrayOf<IntArray>(intArrayOf(0, 2, 0, 2), intArrayOf(0, 2, 0, 1)),
                ),
            equalTo<IntArray>(intArrayOf(1, 0)),
        )
    }

    @Test
    fun resultArray3() {
        assertThat<IntArray>(
            Solution()
                .resultArray(intArrayOf(1, 1, 2, 1, 1), 2, arrayOf<IntArray>(intArrayOf(2, 1, 0, 1))),
            equalTo<IntArray>(intArrayOf(5)),
        )
    }
}
