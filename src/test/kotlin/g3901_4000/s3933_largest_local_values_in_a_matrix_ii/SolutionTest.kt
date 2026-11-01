package g3901_4000.s3933_largest_local_values_in_a_matrix_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countLocalMaximums() {
        assertThat<Int>(
            Solution().countLocalMaximums(
                arrayOf<IntArray>(
                    intArrayOf(1, 2),
                    intArrayOf(3, 4),
                ),
            ),
            equalTo<Int>(1),
        )
    }

    @Test
    fun countLocalMaximums2() {
        assertThat<Int>(
            Solution().countLocalMaximums(
                arrayOf<IntArray>(
                    intArrayOf(1, 0, 1),
                    intArrayOf(0, 1, 0),
                    intArrayOf(1, 0, 1),
                ),
            ),
            equalTo<Int>(5),
        )
    }

    @Test
    fun countLocalMaximums3() {
        assertThat<Int>(
            Solution().countLocalMaximums(
                arrayOf<IntArray>(
                    intArrayOf(1, 1),
                    intArrayOf(1, 1),
                ),
            ),
            equalTo<Int>(4),
        )
    }

    @Test
    fun countLocalMaximums4() {
        assertThat<Int>(
            Solution().countLocalMaximums(
                arrayOf<IntArray>(
                    intArrayOf(0, 0),
                    intArrayOf(0, 0),
                ),
            ),
            equalTo<Int>(0),
        )
    }

    @Test
    fun countLocalMaximums5() {
        assertThat<Int>(
            Solution().countLocalMaximums(arrayOf<IntArray>(intArrayOf(200))),
            equalTo<Int>(1),
        )
    }

    @Test
    fun countLocalMaximums6() {
        assertThat<Int>(
            Solution().countLocalMaximums(
                arrayOf<IntArray>(
                    intArrayOf(1, 0),
                    intArrayOf(0, 2),
                ),
            ),
            equalTo<Int>(2),
        )
    }

    @Test
    fun countLocalMaximums7() {
        assertThat<Int>(
            Solution().countLocalMaximums(arrayOf<IntArray>(intArrayOf(1, 2, 0))),
            equalTo<Int>(1),
        )
    }

    @Test
    fun countLocalMaximums8() {
        assertThat<Int>(
            Solution().countLocalMaximums(
                arrayOf<IntArray>(
                    intArrayOf(1),
                    intArrayOf(0),
                    intArrayOf(2),
                ),
            ),
            equalTo<Int>(2),
        )
    }
}
