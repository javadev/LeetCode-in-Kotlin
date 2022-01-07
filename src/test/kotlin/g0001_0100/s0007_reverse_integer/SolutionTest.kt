package g0001_0100.s0007_reverse_integer

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun reverse() {
        assertThat(Solution().reverse(123), equalTo(321))
    }
}
