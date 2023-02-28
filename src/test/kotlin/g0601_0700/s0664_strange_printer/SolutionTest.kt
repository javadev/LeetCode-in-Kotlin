package g0601_0700.s0664_strange_printer

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun strangePrinter() {
        assertThat(Solution().strangePrinter("aaabbb"), equalTo(2))
    }

    @Test
    fun strangePrinter2() {
        assertThat(Solution().strangePrinter("aba"), equalTo(2))
    }
}
