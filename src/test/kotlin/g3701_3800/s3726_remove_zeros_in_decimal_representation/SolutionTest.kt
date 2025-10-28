package g3701_3800.s3726_remove_zeros_in_decimal_representation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeZeros() {
        assertThat<Long>(Solution().removeZeros(1020030L), equalTo<Long>(123L))
    }

    @Test
    fun removeZeros2() {
        assertThat<Long>(Solution().removeZeros(1L), equalTo<Long>(1L))
    }
}
