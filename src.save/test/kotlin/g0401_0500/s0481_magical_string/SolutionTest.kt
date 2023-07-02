package g0401_0500.s0481_magical_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun magicalString() {
        assertThat(Solution().magicalString(6), equalTo(3))
    }

    @Test
    fun magicalString2() {
        assertThat(Solution().magicalString(1), equalTo(1))
    }
}
