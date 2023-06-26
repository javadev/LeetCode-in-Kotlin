package g2101_2200.s2191_sort_the_jumbled_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sortJumbled() {
        assertThat(
            Solution()
                .sortJumbled(intArrayOf(8, 9, 4, 0, 2, 1, 3, 5, 7, 6), intArrayOf(991, 338, 38)),
            equalTo(intArrayOf(338, 38, 991))
        )
    }

    @Test
    fun sortJumbled2() {
        assertThat(
            Solution()
                .sortJumbled(intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9), intArrayOf(789, 456, 123)),
            equalTo(intArrayOf(123, 456, 789))
        )
    }
}
