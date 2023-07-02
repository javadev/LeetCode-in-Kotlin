package g2201_2300.s2242_maximum_score_of_a_node_sequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumScore() {
        assertThat(
            Solution()
                .maximumScore(
                    intArrayOf(5, 2, 9, 8, 4),
                    arrayOf(
                        intArrayOf(0, 1),
                        intArrayOf(1, 2),
                        intArrayOf(2, 3),
                        intArrayOf(0, 2),
                        intArrayOf(1, 3),
                        intArrayOf(2, 4)
                    )
                ),
            equalTo(24)
        )
    }

    @Test
    fun maximumScore2() {
        assertThat(
            Solution()
                .maximumScore(
                    intArrayOf(9, 20, 6, 4, 11, 12),
                    arrayOf(intArrayOf(0, 3), intArrayOf(5, 3), intArrayOf(2, 4), intArrayOf(1, 3))
                ),
            equalTo(-1)
        )
    }

    @Test
    fun maximumScore3() {
        assertThat(
            Solution()
                .maximumScore(
                    intArrayOf(14, 12, 10, 8, 1, 2, 3, 1),
                    arrayOf(
                        intArrayOf(1, 0),
                        intArrayOf(2, 0),
                        intArrayOf(3, 0),
                        intArrayOf(4, 0),
                        intArrayOf(5, 1),
                        intArrayOf(6, 1),
                        intArrayOf(7, 1),
                        intArrayOf(2, 1)
                    )
                ),
            equalTo(44)
        )
    }

    @Test
    fun maximumScore4() {
        assertThat(
            Solution()
                .maximumScore(
                    intArrayOf(29, 28, 16, 28, 15, 27, 17, 10, 17),
                    arrayOf(
                        intArrayOf(6, 2),
                        intArrayOf(2, 4),
                        intArrayOf(4, 7),
                        intArrayOf(3, 2),
                        intArrayOf(6, 4),
                        intArrayOf(7, 3),
                        intArrayOf(3, 6),
                        intArrayOf(6, 1),
                        intArrayOf(2, 5),
                        intArrayOf(5, 7),
                        intArrayOf(7, 6),
                        intArrayOf(1, 4),
                        intArrayOf(3, 0),
                        intArrayOf(0, 4),
                        intArrayOf(5, 4),
                        intArrayOf(4, 8),
                        intArrayOf(8, 0),
                        intArrayOf(0, 5),
                        intArrayOf(1, 5)
                    )
                ),
            equalTo(112)
        )
    }
}
