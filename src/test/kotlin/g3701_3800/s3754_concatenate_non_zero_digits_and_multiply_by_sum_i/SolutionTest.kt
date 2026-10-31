package g3701_3800.s3754_concatenate_non_zero_digits_and_multiply_by_sum_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumAndMultiply() {
        assertThat<Long>(Solution().sumAndMultiply(10203004), equalTo<Long>(12340L))
    }

    @Test
    fun sumAndMultiply2() {
        assertThat<Long>(Solution().sumAndMultiply(1000), equalTo<Long>(1L))
    }
}
