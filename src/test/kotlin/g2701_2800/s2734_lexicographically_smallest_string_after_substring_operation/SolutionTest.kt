package g2701_2800.s2734_lexicographically_smallest_string_after_substring_operation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestString() {
        assertThat(Solution().smallestString("cbabc"), equalTo("baabc"))
    }

    @Test
    fun smallestString2() {
        assertThat(Solution().smallestString("acbbc"), equalTo("abaab"))
    }

    @Test
    fun smallestString3() {
        assertThat(Solution().smallestString("leetcode"), equalTo("kddsbncd"))
    }

    @Test
    fun smallestString4() {
        assertThat(Solution().smallestString("a"), equalTo("z"))
    }
}
