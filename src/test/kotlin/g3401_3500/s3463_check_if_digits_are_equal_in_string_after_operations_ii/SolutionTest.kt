package g3401_3500.s3463_check_if_digits_are_equal_in_string_after_operations_ii

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

    @Test
    fun hasSameDigits3() {
        assertThat<Boolean>(Solution().hasSameDigits("3506677"), equalTo<Boolean>(false))
    }
}
