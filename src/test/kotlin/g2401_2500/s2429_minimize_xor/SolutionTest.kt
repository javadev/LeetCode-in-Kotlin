package g2401_2500.s2429_minimize_xor

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimizeXor() {
        assertThat(Solution().minimizeXor(3, 5), equalTo(3))
    }

    @Test
    fun minimizeXor2() {
        assertThat(Solution().minimizeXor(1, 12), equalTo(3))
    }
}
