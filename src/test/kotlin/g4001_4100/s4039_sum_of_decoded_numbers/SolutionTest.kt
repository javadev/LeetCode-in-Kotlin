package g4001_4100.s4039_sum_of_decoded_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumDecoded() {
        assertThat<Int>(Solution().sumDecoded(longArrayOf(111)), equalTo<Int>(1))
    }

    @Test
    fun sumDecoded2() {
        assertThat<Int>(Solution().sumDecoded(longArrayOf(111, 112)), equalTo<Int>(2))
    }

    @Test
    fun sumDecoded3() {
        assertThat<Int>(Solution().sumDecoded(longArrayOf()), equalTo<Int>(0))
    }
}
