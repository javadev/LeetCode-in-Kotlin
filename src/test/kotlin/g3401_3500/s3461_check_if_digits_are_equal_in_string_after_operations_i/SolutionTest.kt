package g3401_3500.s3461_check_if_digits_are_equal_in_string_after_operations_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun hasSameDigits() {
        assertThat<Boolean>(Solution().hasSameDigits("3902"), equalTo<Boolean>(true))
    }

    @Test
    fun hasSameDigits2() {
        assertThat<Boolean>(Solution().hasSameDigits("34789"), equalTo<Boolean>(false))
    }
}
