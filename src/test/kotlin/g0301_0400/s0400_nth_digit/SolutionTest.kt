package g0301_0400.s0400_nth_digit

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findNthDigit() {
        assertThat(Solution().findNthDigit(3), equalTo(3))
    }

    @Test
    fun findNthDigit2() {
        assertThat(Solution().findNthDigit(11), equalTo(0))
    }
}
