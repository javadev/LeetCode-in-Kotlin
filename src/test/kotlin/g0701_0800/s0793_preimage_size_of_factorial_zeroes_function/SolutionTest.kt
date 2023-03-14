package g0701_0800.s0793_preimage_size_of_factorial_zeroes_function

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun preimageSizeFZF() {
        assertThat(Solution().preimageSizeFZF(0), equalTo(5))
    }

    @Test
    fun preimageSizeFZF2() {
        assertThat(Solution().preimageSizeFZF(5), equalTo(0))
    }

    @Test
    fun preimageSizeFZF3() {
        assertThat(Solution().preimageSizeFZF(3), equalTo(5))
    }
}
