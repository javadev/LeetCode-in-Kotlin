package g1801_1900.s1830_minimum_number_of_operations_to_make_string_sorted

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun makeStringSorted() {
        assertThat(Solution().makeStringSorted("cba"), equalTo(5))
    }

    @Test
    fun makeStringSorted2() {
        assertThat(Solution().makeStringSorted("aabaa"), equalTo(2))
    }
}
