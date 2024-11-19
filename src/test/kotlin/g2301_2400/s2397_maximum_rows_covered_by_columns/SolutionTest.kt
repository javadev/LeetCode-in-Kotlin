package g2301_2400.s2397_maximum_rows_covered_by_columns

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumRows() {
        assertThat(
            Solution()
                .maximumRows(
                    arrayOf(
                        intArrayOf(0, 0, 0),
                        intArrayOf(1, 0, 1),
                        intArrayOf(0, 1, 1),
                        intArrayOf(0, 0, 1),
                    ),
                    2,
                ),
            equalTo(3),
        )
    }

    @Test
    fun maximumRows2() {
        assertThat(
            Solution().maximumRows(arrayOf(intArrayOf(1), intArrayOf(0)), 1),
            equalTo(2),
        )
    }
}
