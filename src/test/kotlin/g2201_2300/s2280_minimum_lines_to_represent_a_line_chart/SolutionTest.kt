package g2201_2300.s2280_minimum_lines_to_represent_a_line_chart

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumLines() {
        assertThat(
            Solution()
                .minimumLines(
                    arrayOf(
                        intArrayOf(1, 7),
                        intArrayOf(2, 6),
                        intArrayOf(3, 5),
                        intArrayOf(4, 4),
                        intArrayOf(5, 4),
                        intArrayOf(6, 3),
                        intArrayOf(7, 2),
                        intArrayOf(8, 1),
                    ),
                ),
            equalTo(3),
        )
    }

    @Test
    fun minimumLines2() {
        assertThat(
            Solution().minimumLines(arrayOf(intArrayOf(3, 4), intArrayOf(1, 2), intArrayOf(7, 8), intArrayOf(2, 3))),
            equalTo(1),
        )
    }

    @Test
    fun minimumLines3() {
        assertThat(Solution().minimumLines(arrayOf(intArrayOf(3, 4))), equalTo(0))
    }
}
