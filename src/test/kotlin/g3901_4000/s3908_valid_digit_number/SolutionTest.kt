package g3901_4000.s3908_valid_digit_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun validDigit() {
        assertThat<Boolean>(Solution().validDigit(101, 0), equalTo<Boolean>(true))
    }

    @Test
    fun validDigit2() {
        assertThat<Boolean>(Solution().validDigit(232, 2), equalTo<Boolean>(false))
    }

    @Test
    fun validDigit3() {
        assertThat<Boolean>(Solution().validDigit(5, 1), equalTo<Boolean>(false))
    }

    @Test
    fun validDigit4() {
        assertThat<Boolean>(Solution().validDigit(0, 0), equalTo<Boolean>(false))
    }

    @Test
    fun validDigit5() {
        assertThat<Boolean>(Solution().validDigit(0, 1), equalTo<Boolean>(false))
    }

    @Test
    fun validDigit6() {
        assertThat<Boolean>(Solution().validDigit(5, 5), equalTo<Boolean>(false))
    }

    @Test
    fun validDigit7() {
        assertThat<Boolean>(Solution().validDigit(123, 3), equalTo<Boolean>(true))
    }

    @Test
    fun validDigit8() {
        assertThat<Boolean>(Solution().validDigit(100000, 0), equalTo<Boolean>(true))
    }
}
