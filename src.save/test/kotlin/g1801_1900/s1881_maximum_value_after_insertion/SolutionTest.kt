package g1801_1900.s1881_maximum_value_after_insertion

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxValue() {
        assertThat(Solution().maxValue("99", 9), equalTo("999"))
    }

    @Test
    fun maxValue2() {
        assertThat(Solution().maxValue("-13", 2), equalTo("-123"))
    }
}
