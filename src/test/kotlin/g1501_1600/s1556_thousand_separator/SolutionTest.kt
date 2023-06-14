package g1501_1600.s1556_thousand_separator

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun thousandSeparator() {
        MatcherAssert.assertThat(Solution().thousandSeparator(987), CoreMatchers.equalTo("987"))
    }

    @Test
    fun thousandSeparator2() {
        MatcherAssert.assertThat(Solution().thousandSeparator(1234), CoreMatchers.equalTo("1.234"))
    }
}