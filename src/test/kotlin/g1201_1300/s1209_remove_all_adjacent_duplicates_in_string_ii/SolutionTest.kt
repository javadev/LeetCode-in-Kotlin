package g1201_1300.s1209_remove_all_adjacent_duplicates_in_string_ii

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeDuplicates() {
        MatcherAssert.assertThat(Solution().removeDuplicates("abcd", 2), CoreMatchers.equalTo("abcd"))
    }

    @Test
    fun removeDuplicates2() {
        MatcherAssert.assertThat(Solution().removeDuplicates("deeedbbcccbdaa", 3), CoreMatchers.equalTo("aa"))
    }

    @Test
    fun removeDuplicates3() {
        MatcherAssert.assertThat(Solution().removeDuplicates("pbbcggttciiippooaais", 2), CoreMatchers.equalTo("ps"))
    }
}
