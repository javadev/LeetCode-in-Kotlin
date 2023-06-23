package g2101_2200.s2133_check_if_every_row_and_column_contains_all_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkValid() {
        assertThat(
            Solution().checkValid(arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 1, 2), intArrayOf(2, 3, 1))),
            equalTo(true)
        )
    }

    @Test
    fun checkValid2() {
        assertThat(
            Solution().checkValid(arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 2, 3), intArrayOf(1, 2, 3))),
            equalTo(false)
        )
    }
}
