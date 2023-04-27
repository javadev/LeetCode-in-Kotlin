package g0901_1000.s0935_knight_dialer

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun knightDialer() {
        assertThat(Solution().knightDialer(1), equalTo(10))
    }

    @Test
    fun knightDialer2() {
        assertThat(Solution().knightDialer(2), equalTo(20))
    }

    @Test
    fun knightDialer3() {
        assertThat(Solution().knightDialer(3131), equalTo(136006598))
    }
}
