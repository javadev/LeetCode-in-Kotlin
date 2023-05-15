package g1001_1100.s1006_clumsy_factorial

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun clumsy() {
        assertThat(Solution().clumsy(4), equalTo(7))
    }

    @Test
    fun clumsy2() {
        assertThat(Solution().clumsy(10), equalTo(12))
    }
}
