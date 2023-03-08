package g0701_0800.s0761_special_binary_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun makeLargestSpecial() {
        assertThat(Solution().makeLargestSpecial("11011000"), equalTo("11100100"))
    }

    @Test
    fun makeLargestSpecial2() {
        assertThat(Solution().makeLargestSpecial("10"), equalTo("10"))
    }
}
