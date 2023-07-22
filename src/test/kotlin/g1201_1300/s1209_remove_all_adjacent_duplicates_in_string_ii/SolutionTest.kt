package g1201_1300.s1209_remove_all_adjacent_duplicates_in_string_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeDuplicates() {
        assertThat(Solution().removeDuplicates("abcd", 2), equalTo("abcd"))
    }

    @Test
    fun removeDuplicates2() {
        assertThat(Solution().removeDuplicates("deeedbbcccbdaa", 3), equalTo("aa"))
    }

    @Test
    fun removeDuplicates3() {
        assertThat(Solution().removeDuplicates("pbbcggttciiippooaais", 2), equalTo("ps"))
    }
}
