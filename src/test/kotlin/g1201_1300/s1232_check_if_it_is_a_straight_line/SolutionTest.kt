package g1201_1300.s1232_check_if_it_is_a_straight_line

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkStraightLine() {
        assertThat(
            Solution()
                .checkStraightLine(
                    arrayOf(
                        intArrayOf(1, 2),
                        intArrayOf(2, 3),
                        intArrayOf(3, 4),
                        intArrayOf(4, 5),
                        intArrayOf(5, 6),
                        intArrayOf(6, 7),
                    ),
                ),
            equalTo(true),
        )
    }

    @Test
    fun checkStraightLine2() {
        assertThat(
            Solution()
                .checkStraightLine(
                    arrayOf(
                        intArrayOf(1, 1),
                        intArrayOf(2, 2),
                        intArrayOf(3, 4),
                        intArrayOf(4, 5),
                        intArrayOf(5, 6),
                        intArrayOf(7, 7),
                    ),
                ),
            equalTo(false),
        )
    }
}
