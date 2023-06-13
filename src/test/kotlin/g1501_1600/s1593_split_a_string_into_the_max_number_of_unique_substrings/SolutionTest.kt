package g1501_1600.s1593_split_a_string_into_the_max_number_of_unique_substrings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxUniqueSplit() {
        assertThat(Solution().maxUniqueSplit("ababccc"), equalTo(5))
    }

    @Test
    fun maxUniqueSplit2() {
        assertThat(Solution().maxUniqueSplit("aba"), equalTo(2))
    }

    @Test
    fun maxUniqueSplit3() {
        assertThat(Solution().maxUniqueSplit("aa"), equalTo(1))
    }
}
