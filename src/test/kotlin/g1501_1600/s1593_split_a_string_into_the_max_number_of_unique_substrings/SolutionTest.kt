package g1501_1600.s1593_split_a_string_into_the_max_number_of_unique_substrings

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxUniqueSplit() {
        MatcherAssert.assertThat(Solution().maxUniqueSplit("ababccc"), CoreMatchers.equalTo(5))
    }

    @Test
    fun maxUniqueSplit2() {
        MatcherAssert.assertThat(Solution().maxUniqueSplit("aba"), CoreMatchers.equalTo(2))
    }

    @Test
    fun maxUniqueSplit3() {
        MatcherAssert.assertThat(Solution().maxUniqueSplit("aa"), CoreMatchers.equalTo(1))
    }
}
