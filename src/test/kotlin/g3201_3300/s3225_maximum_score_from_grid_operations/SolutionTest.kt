package g3201_3300.s3225_maximum_score_from_grid_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumScore() {
        assertThat(
            Solution()
                .maximumScore(
                    arrayOf(
                        intArrayOf(0, 0, 0, 0, 0),
                        intArrayOf(0, 0, 3, 0, 0),
                        intArrayOf(0, 1, 0, 0, 0),
                        intArrayOf(5, 0, 0, 3, 0),
                        intArrayOf(0, 0, 0, 0, 2)
                    )
                ),
            equalTo(11L)
        )
    }

    @Test
    fun maximumScore2() {
        assertThat(
            Solution()
                .maximumScore(
                    arrayOf(
                        intArrayOf(10, 9, 0, 0, 15),
                        intArrayOf(7, 1, 0, 8, 0),
                        intArrayOf(5, 20, 0, 11, 0),
                        intArrayOf(0, 0, 0, 1, 2),
                        intArrayOf(8, 12, 1, 10, 3)
                    )
                ),
            equalTo(94L)
        )
    }
}
