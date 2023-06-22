package g1801_1900.s1897_redistribute_characters_to_make_all_strings_equal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun makeEqual() {
        assertThat(Solution().makeEqual(arrayOf("abc", "aabc", "bc")), equalTo(true))
    }

    @Test
    fun makeEqual2() {
        assertThat(Solution().makeEqual(arrayOf("ab", "a")), equalTo(false))
    }
}
