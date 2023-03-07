package g0701_0800.s0753_cracking_the_safe

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun crackSafe() {
        assertThat(Solution().crackSafe(1, 2), equalTo("01"))
    }

    @Test
    fun crackSafe2() {
        assertThat(Solution().crackSafe(2, 2), equalTo("00110"))
    }
}
