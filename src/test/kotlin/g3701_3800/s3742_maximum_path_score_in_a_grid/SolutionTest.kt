package g3701_3800.s3742_maximum_path_score_in_a_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxPathScore() {
        assertThat<Int>(
            Solution().maxPathScore(
                arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(2, 3)),
                1,
            ),
            equalTo<Int>(-1),
        )
    }

    @Test
    fun maxPathScore2() {
        assertThat<Int>(
            Solution().maxPathScore(
                arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(2, 3)),
                2,
            ),
            equalTo<Int>(5),
        )
    }

    @Test
    fun maxPathScore3() {
        assertThat<Int>(
            Solution().maxPathScore(
                arrayOf<IntArray>(
                    intArrayOf(-1, -2),
                    intArrayOf(-3, -4),
                ),
                0,
            ),
            equalTo<Int>(-1),
        )
    }
}
