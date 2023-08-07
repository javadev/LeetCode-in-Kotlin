package g2701_2800.s2744_find_maximum_number_of_string_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumNumberOfStringPairs() {
        assertThat(Solution().maximumNumberOfStringPairs(arrayOf("cd", "ac", "dc", "ca", "zz")), equalTo(2))
    }

    @Test
    fun maximumNumberOfStringPairs2() {
        assertThat(Solution().maximumNumberOfStringPairs(arrayOf("ab", "ba", "cc")), equalTo(1))
    }

    @Test
    fun maximumNumberOfStringPairs3() {
        assertThat(Solution().maximumNumberOfStringPairs(arrayOf("aa", "ab")), equalTo(0))
    }
}
