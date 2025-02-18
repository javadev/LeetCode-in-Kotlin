package g3401_3500.s3452_sum_of_good_numbers

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfGoodNumbers() {
        MatcherAssert.assertThat<Int>(
            Solution().sumOfGoodNumbers(intArrayOf(1, 3, 2, 1, 5, 4), 2),
            CoreMatchers.equalTo<Int>(12),
        )
    }

    @Test
    fun sumOfGoodNumbers2() {
        MatcherAssert.assertThat<Int>(Solution().sumOfGoodNumbers(intArrayOf(2, 1), 1), CoreMatchers.equalTo<Int>(2))
    }
}
