package g3401_3500.s3468_find_the_number_of_copy_arrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countArrays() {
        assertThat<Int>(
            Solution()
                .countArrays(
                    intArrayOf(1, 2, 3, 4),
                    arrayOf<IntArray>(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(4, 5)),
                ),
            equalTo<Int>(2),
        )
    }

    @Test
    fun countArrays2() {
        assertThat<Int>(
            Solution()
                .countArrays(
                    intArrayOf(1, 2, 3, 4),
                    arrayOf<IntArray>(intArrayOf(1, 10), intArrayOf(2, 9), intArrayOf(3, 8), intArrayOf(4, 7)),
                ),
            equalTo<Int>(4),
        )
    }

    @Test
    fun countArrays3() {
        assertThat<Int>(
            Solution()
                .countArrays(
                    intArrayOf(1, 2, 1, 2),
                    arrayOf<IntArray>(intArrayOf(1, 1), intArrayOf(2, 3), intArrayOf(3, 3), intArrayOf(2, 3)),
                ),
            equalTo<Int>(0),
        )
    }
}
