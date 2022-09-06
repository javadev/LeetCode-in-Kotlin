package g0201_0300.s0299_bulls_and_cows

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun hint() {
        assertThat(Solution().getHint("1807", "7810"), equalTo("1A3B"))
    }

    @Test
    fun hint2() {
        assertThat(Solution().getHint("1123", "0111"), equalTo("1A1B"))
    }

    @Test
    fun hint3() {
        assertThat(Solution().getHint("1", "0"), equalTo("0A0B"))
    }

    @Test
    fun hint4() {
        assertThat(Solution().getHint("1", "1"), equalTo("1A0B"))
    }
}
