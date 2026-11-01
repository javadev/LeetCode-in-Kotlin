package g3901_4000.s3938_maximum_path_intersection_sum_in_a_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxScore() {
        assertThat<Int>(
            Solution()
                .maxScore(
                    arrayOf<IntArray>(
                        intArrayOf(1, 2, 0, -3),
                        intArrayOf(1, -2, 1, 0),
                        intArrayOf(-4, 2, -1, 3),
                        intArrayOf(3, -3, 3, -2),
                        intArrayOf(-1, -5, 0, 1),
                    ),
                ),
            equalTo<Int>(4),
        )
    }

    @Test
    fun maxScore2() {
        assertThat<Int>(
            Solution().maxScore(
                arrayOf<IntArray>(
                    intArrayOf(4, -2, -3),
                    intArrayOf(-1, -3, -1),
                    intArrayOf(-4, 2, -1),
                ),
            ),
            equalTo<Int>(3),
        )
    }

    @Test
    fun maxScore3() {
        assertThat<Int>(
            Solution().maxScore(arrayOf<IntArray>(intArrayOf(-1, -2), intArrayOf(-3, -4))),
            equalTo<Int>(-3),
        )
    }

    @Test
    fun maxScore4() {
        assertThat<Int>(
            Solution()
                .maxScore(
                    arrayOf<IntArray>(
                        intArrayOf(-100, -100, -100),
                        intArrayOf(-100, -1, -100),
                        intArrayOf(-100, -100, -100),
                    ),
                ),
            equalTo<Int>(-1),
        )
    }

    @Test
    fun maxScore5() {
        assertThat<Int>(
            Solution().maxScore(arrayOf<IntArray>(intArrayOf(1, 2), intArrayOf(3, 4))),
            equalTo<Int>(7),
        )
    }

    @Test
    fun maxScore6() {
        assertThat<Int>(
            Solution().maxScore(arrayOf<IntArray>(intArrayOf(0, 0), intArrayOf(0, 0))),
            equalTo<Int>(0),
        )
    }

    @Test
    fun maxScore7() {
        assertThat<Int>(
            Solution().maxScore(arrayOf<IntArray>(intArrayOf(5, -100), intArrayOf(5, -100), intArrayOf(5, -100))),
            equalTo<Int>(15),
        )
    }
}
