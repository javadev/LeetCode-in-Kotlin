package g2301_2400.s2306_naming_a_company

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distinctNames() {
        assertThat(
            Solution().distinctNames(arrayOf("coffee", "donuts", "time", "toffee")),
            equalTo(6L),
        )
    }

    @Test
    fun distinctNames2() {
        assertThat(Solution().distinctNames(arrayOf("lack", "back")), equalTo(0L))
    }
}
