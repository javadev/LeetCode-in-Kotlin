package g2601_2700.s2678_number_of_senior_citizens

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSeniors() {
        assertThat(
            Solution().countSeniors(arrayOf("7868190130M7522", "5303914400F9211", "9273338290F4010")),
            equalTo(2),
        )
    }

    @Test
    fun countSeniors2() {
        assertThat(
            Solution().countSeniors(arrayOf("1313579440F2036", "2921522980M5644")),
            equalTo(0),
        )
    }
}
