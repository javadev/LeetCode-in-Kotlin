package g2501_2600.s2553_separate_the_digits_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun separateDigits() {
        assertThat(Solution().separateDigits(intArrayOf(13, 25, 83, 77)), equalTo(intArrayOf(1, 3, 2, 5, 8, 3, 7, 7)))
    }

    @Test
    fun separateDigits2() {
        assertThat(Solution().separateDigits(intArrayOf(7, 1, 3, 9)), equalTo(intArrayOf(7, 1, 3, 9)))
    }
}
