package g3401_3500.s3483_unique_3_digit_even_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun totalNumbers() {
        assertThat<Int>(Solution().totalNumbers(intArrayOf(1, 2, 3, 4)), equalTo<Int>(12))
    }

    @Test
    fun totalNumbers2() {
        assertThat<Int>(Solution().totalNumbers(intArrayOf(0, 2, 2)), equalTo<Int>(2))
    }

    @Test
    fun totalNumbers3() {
        assertThat<Int>(Solution().totalNumbers(intArrayOf(6, 6, 6)), equalTo<Int>(1))
    }

    @Test
    fun totalNumbers4() {
        assertThat<Int>(Solution().totalNumbers(intArrayOf(1, 3, 5)), equalTo<Int>(0))
    }
}
