package g3401_3500.s3452_sum_of_good_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfGoodNumbers() {
        assertThat<Int>(
            Solution().sumOfGoodNumbers(intArrayOf(1, 3, 2, 1, 5, 4), 2),
            equalTo<Int>(12),
        )
    }

    @Test
    fun sumOfGoodNumbers2() {
        assertThat<Int>(Solution().sumOfGoodNumbers(intArrayOf(2, 1), 1), equalTo<Int>(2))
    }
}
