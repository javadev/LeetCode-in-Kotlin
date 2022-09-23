package g0001_0100.s0067_add_binary

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun addBinary() {
        assertThat(Solution().addBinary("11", "1"), equalTo("100"))
    }

    @Test
    fun addBinary2() {
        assertThat(Solution().addBinary("1010", "1011"), equalTo("10101"))
    }
}
