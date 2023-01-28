package g0001_0100.s0043_multiply_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun multiply() {
        assertThat(Solution().multiply("2", "3"), equalTo("6"))
    }

    @Test
    fun multiply2() {
        assertThat(Solution().multiply("123", "456"), equalTo("56088"))
    }
}
