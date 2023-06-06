package g1301_1400.s1380_lucky_numbers_in_a_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun luckyNumbers() {
        assertThat(
            Solution().luckyNumbers(arrayOf(intArrayOf(3, 7, 8), intArrayOf(9, 11, 13), intArrayOf(15, 16, 17))),
            equalTo(listOf(15))
        )
    }

    @Test
    fun luckyNumbers2() {
        assertThat(
            Solution()
                .luckyNumbers(arrayOf(intArrayOf(1, 10, 4, 2), intArrayOf(9, 3, 8, 7), intArrayOf(15, 16, 17, 12))),
            equalTo(listOf(12))
        )
    }

    @Test
    fun luckyNumbers3() {
        assertThat(
            Solution().luckyNumbers(arrayOf(intArrayOf(7, 8), intArrayOf(1, 2))),
            equalTo(listOf(7))
        )
    }
}
