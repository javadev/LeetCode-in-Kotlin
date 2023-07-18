package g2601_2700.s2639_find_the_width_of_columns_of_a_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findColumnWidth() {
        assertThat(
            Solution().findColumnWidth(arrayOf(intArrayOf(1), intArrayOf(22), intArrayOf(333))),
            equalTo(
                intArrayOf(3)
            )
        )
    }

    @Test
    fun findColumnWidth2() {
        assertThat(
            Solution().findColumnWidth(arrayOf(intArrayOf(-15, 1, 3), intArrayOf(15, 7, 12), intArrayOf(5, 6, -2))),
            equalTo(
                intArrayOf(3, 1, 2)
            )
        )
    }
}
