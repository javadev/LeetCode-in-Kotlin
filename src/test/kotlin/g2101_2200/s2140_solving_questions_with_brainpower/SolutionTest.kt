package g2101_2200.s2140_solving_questions_with_brainpower

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mostPoints() {
        assertThat(
            Solution().mostPoints(arrayOf(intArrayOf(3, 2), intArrayOf(4, 3), intArrayOf(4, 4), intArrayOf(2, 5))),
            equalTo(5L)
        )
    }

    @Test
    fun mostPoints2() {
        assertThat(
            Solution().mostPoints(
                arrayOf(
                    intArrayOf(1, 1),
                    intArrayOf(2, 2),
                    intArrayOf(3, 3),
                    intArrayOf(4, 4),
                    intArrayOf(5, 5)
                )
            ),
            equalTo(7L)
        )
    }
}
