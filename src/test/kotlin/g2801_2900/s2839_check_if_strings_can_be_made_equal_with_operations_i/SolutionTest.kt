package g2801_2900.s2839_check_if_strings_can_be_made_equal_with_operations_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canBeEqual() {
        assertThat(Solution().canBeEqual("abcd", "cdab"), equalTo(true))
    }

    @Test
    fun canBeEqual2() {
        assertThat(Solution().canBeEqual("abcd", "cdab"), equalTo(true))
    }

    @Test
    fun canBeEqual3() {
        assertThat(Solution().canBeEqual("abcd", "abcd"), equalTo(true))
    }

    @Test
    fun canBeEqual4() {
        assertThat(Solution().canBeEqual("abcd", "cbad"), equalTo(true))
    }

    @Test
    fun canBeEqual5() {
        assertThat(Solution().canBeEqual("abcd", "adcb"), equalTo(true))
    }

    @Test
    fun canBeEqual6() {
        assertThat(Solution().canBeEqual("abcd", "abdc"), equalTo(false))
    }

    @Test
    fun canBeEqual7() {
        assertThat(Solution().canBeEqual("abcd", "wxyz"), equalTo(false))
    }

    @Test
    fun canBeEqual8() {
        assertThat(Solution().canBeEqual("aabb", "bbaa"), equalTo(true))
    }

    @Test
    fun canBeEqual9() {
        assertThat(Solution().canBeEqual("abcd", "cdab"), equalTo(true))
    }

    @Test
    fun canBeEqual10() {
        assertThat(Solution().canBeEqual("abba", "baab"), equalTo(true))
    }
}
