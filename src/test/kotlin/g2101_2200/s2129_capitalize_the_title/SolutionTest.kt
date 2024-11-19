package g2101_2200.s2129_capitalize_the_title

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun capitalizeTitle() {
        assertThat(
            Solution().capitalizeTitle("capiTalIze tHe titLe"),
            equalTo("Capitalize The Title"),
        )
    }

    @Test
    fun capitalizeTitle2() {
        assertThat(
            Solution().capitalizeTitle("First leTTeR of EACH Word"),
            equalTo("First Letter of Each Word"),
        )
    }

    @Test
    fun capitalizeTitle3() {
        assertThat(Solution().capitalizeTitle("i lOve leetcode"), equalTo("i Love Leetcode"))
    }
}
