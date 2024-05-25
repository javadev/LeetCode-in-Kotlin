package g3101_3200.s3153_sum_of_digit_differences_of_all_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumDigitDifferences() {
        assertThat(Solution().sumDigitDifferences(intArrayOf(13, 23, 12)), equalTo(4L))
    }

    @Test
    fun sumDigitDifferences2() {
        assertThat(Solution().sumDigitDifferences(intArrayOf(10, 10, 10, 10)), equalTo(0L))
    }
}
