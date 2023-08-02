package g2501_2600.s2514_count_anagrams

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countAnagrams() {
        assertThat(Solution().countAnagrams("too hot"), equalTo(18))
    }

    @Test
    fun countAnagrams2() {
        assertThat(Solution().countAnagrams("aa"), equalTo(1))
    }
}
