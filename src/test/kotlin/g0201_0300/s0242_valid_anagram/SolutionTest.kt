package g0201_0300.s0242_valid_anagram

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isAnagram() {
        assertThat(Solution().isAnagram("anagram", "nagaram"), equalTo(true))
    }

    @Test
    fun isAnagram2() {
        assertThat(Solution().isAnagram("rat", "car"), equalTo(false))
    }
}
