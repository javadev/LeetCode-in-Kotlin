package g2201_2300.s2273_find_resultant_array_after_removing_anagrams

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeAnagrams() {
        assertThat(
            Solution().removeAnagrams(arrayOf("abba", "baba", "bbaa", "cd", "cd")),
            equalTo(mutableListOf("abba", "cd"))
        )
    }

    @Test
    fun removeAnagrams2() {
        assertThat(
            Solution().removeAnagrams(arrayOf("a", "b", "c", "d", "e")),
            equalTo(mutableListOf("a", "b", "c", "d", "e"))
        )
    }

    @Test
    fun removeAnagrams3() {
        assertThat(
            Solution().removeAnagrams(arrayOf()), equalTo(emptyList<Any>())
        )
    }

    @Test
    fun removeAnagrams4() {
        assertThat(Solution().removeAnagrams(null), equalTo(emptyList<Any>()))
    }
}
