package g1701_1800.s1759_count_number_of_homogenous_substrings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countHomogenous() {
        assertThat(Solution().countHomogenous("abbcccaa"), equalTo(13))
    }

    @Test
    fun countHomogenous2() {
        assertThat(Solution().countHomogenous("xy"), equalTo(2))
    }

    @Test
    fun countHomogenous3() {
        assertThat(Solution().countHomogenous("zzzzz"), equalTo(15))
    }
}
