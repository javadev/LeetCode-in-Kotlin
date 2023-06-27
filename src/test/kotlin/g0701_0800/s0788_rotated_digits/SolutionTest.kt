package g0701_0800.s0788_rotated_digits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rotatedDigits() {
        assertThat(Solution().rotatedDigits(10), equalTo(4))
    }

    @Test
    fun rotatedDigits2() {
        assertThat(Solution().rotatedDigits(1), equalTo(0))
    }

    @Test
    fun rotatedDigits3() {
        assertThat(Solution().rotatedDigits(2), equalTo(1))
    }

    @Test
    fun rotatedDigits4() {
        assertThat(Solution().rotatedDigits(857), equalTo(247))
    }

    @Test
    fun rotatedDigits5() {
        assertThat(Solution().rotatedDigits(15), equalTo(6))
    }
}
