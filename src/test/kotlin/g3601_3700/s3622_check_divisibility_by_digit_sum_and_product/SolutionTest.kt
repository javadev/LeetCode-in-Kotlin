package g3601_3700.s3622_check_divisibility_by_digit_sum_and_product

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkDivisibility() {
        assertThat<Boolean>(Solution().checkDivisibility(99), equalTo<Boolean>(true))
    }

    @Test
    fun checkDivisibility2() {
        assertThat<Boolean>(Solution().checkDivisibility(23), equalTo<Boolean>(false))
    }
}
