package g0001_0100.s0049_group_anagrams

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun groupAnagrams() {
        assertThat(
            Solution().groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat")),
            equalTo(
                arrayOf(
                    arrayOf("eat", "tea", "ate").toList(),
                    arrayOf("bat").toList(),
                    arrayOf("tan", "nat").toList(),
                ).toList(),
            ),
        )
    }

    @Test
    fun groupAnagrams2() {
        assertThat(Solution().groupAnagrams(arrayOf("")), equalTo(arrayOf(arrayOf("").toList()).toList()))
    }

    @Test
    fun groupAnagrams3() {
        assertThat(Solution().groupAnagrams(arrayOf("a")), equalTo(arrayOf(arrayOf("a").toList()).toList()))
    }
}
