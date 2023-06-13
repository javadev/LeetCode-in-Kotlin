package g1501_1600.s1556_thousand_separator

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun thousandSeparator() {
        assertThat(Solution().thousandSeparator(987), equalTo("987"))
    }

    @Test
    fun thousandSeparator2() {
        assertThat(Solution().thousandSeparator(1234), equalTo("1.234"))
    }
}
