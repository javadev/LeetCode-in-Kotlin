package g1301_1400.s1397_find_all_good_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findGoodStrings() {
        assertThat(Solution().findGoodStrings(2, "aa", "da", "b"), equalTo(51))
    }

    @Test
    fun findGoodStrings2() {
        assertThat(Solution().findGoodStrings(8, "leetcode", "leetgoes", "leet"), equalTo(0))
    }

    @Test
    fun findGoodStrings3() {
        assertThat(Solution().findGoodStrings(2, "gx", "gz", "x"), equalTo(2))
    }
}
