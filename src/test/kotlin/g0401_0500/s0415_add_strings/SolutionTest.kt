package g0401_0500.s0415_add_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun addStrings() {
        assertThat(Solution().addStrings("11", "123"), equalTo("134"))
    }

    @Test
    fun addStrings2() {
        assertThat(Solution().addStrings("456", "77"), equalTo("533"))
    }
}
