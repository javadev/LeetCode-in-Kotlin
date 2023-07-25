package g2601_2700.s2661_first_completely_painted_row_or_column

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun firstCompleteIndex() {
        assertThat(
            Solution().firstCompleteIndex(intArrayOf(1, 3, 4, 2), arrayOf(intArrayOf(1, 4), intArrayOf(2, 3))),
            equalTo(2)
        )
    }

    @Test
    fun firstCompleteIndex2() {
        assertThat(
            Solution().firstCompleteIndex(
                intArrayOf(2, 8, 7, 4, 1, 3, 5, 6, 9),
                arrayOf(
                    intArrayOf(3, 2, 5),
                    intArrayOf(1, 4, 6), intArrayOf(8, 7, 9)
                )
            ),
            equalTo(3)
        )
    }
}
