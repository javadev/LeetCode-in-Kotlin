package g1501_1600.s1520_maximum_number_of_non_overlapping_substrings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxNumOfSubstrings() {
        assertThat(
            Solution().maxNumOfSubstrings("adefaddaccc"),
            equalTo(mutableListOf("e", "f", "ccc")),
        )
    }

    @Test
    fun maxNumOfSubstrings2() {
        assertThat(
            Solution().maxNumOfSubstrings("abbaccd"),
            equalTo(mutableListOf("bb", "cc", "d")),
        )
    }

    @Test
    fun maxNumOfSubstrings3() {
        val result = Solution().maxNumOfSubstrings("a")
        assertThat(result, equalTo(listOf("a")))
    }

    @Test
    fun maxNumOfSubstrings4() {
        val result = Solution().maxNumOfSubstrings("abc")
        assertThat(result, equalTo(listOf("a", "b", "c")))
    }

    @Test
    fun maxNumOfSubstrings5() {
        val result = Solution().maxNumOfSubstrings("abac")
        assertThat(result, equalTo(listOf("b", "c")))
    }

    @Test
    fun maxNumOfSubstrings6() {
        val result = Solution().maxNumOfSubstrings("bba")
        assertThat(result, equalTo(listOf("bb", "a")))
    }

    @Test
    fun maxNumOfSubstrings7() {
        val result = Solution().maxNumOfSubstrings("abcabc")
        assertThat(result, equalTo(listOf("abcabc")))
    }

    @Test
    fun maxNumOfSubstrings8() {
        val result = Solution().maxNumOfSubstrings("aaaa")
        assertThat(result, equalTo(listOf("aaaa")))
    }

    @Test
    fun maxNumOfSubstrings9() {
        val result = Solution().maxNumOfSubstrings("")
        assertThat(result, equalTo(emptyList<String>()))
    }

    @Test
    fun maxNumOfSubstrings10() {
        val result = Solution().maxNumOfSubstrings("cabcccbaa")
        assertThat(result, equalTo(listOf("cabcccbaa")))
    }
}
