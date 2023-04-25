package g0001_0100.s0006_zigzag_conversion

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun convert() {
        assertThat(Solution().convert("PAYPALISHIRING", 3), equalTo("PAHNAPLSIIGYIR"))
    }

    @Test
    fun convert2() {
        assertThat(Solution().convert("PAYPALISHIRING", 4), equalTo("PINALSIGYAHRPI"))
    }
}
