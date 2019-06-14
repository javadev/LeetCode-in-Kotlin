package s0008.string.to.integer.atoi

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

class SolutionTest {
    @Test
    fun myAtoi() {
        assertThat(Solution().myAtoi("42"), equalTo(42))
    }
}
