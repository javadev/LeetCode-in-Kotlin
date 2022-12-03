package g0401_0500.s0405_convert_a_number_to_hexadecimal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun toHex() {
        assertThat(Solution().toHex(26), equalTo("1a"))
    }

    @Test
    fun toHex2() {
        assertThat(Solution().toHex(-1), equalTo("ffffffff"))
    }
}
