package g1001_1100.s1047_remove_all_adjacent_duplicates_in_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeDuplicates() {
        assertThat(Solution().removeDuplicates("abbaca"), equalTo("ca"))
    }

    @Test
    fun removeDuplicates2() {
        assertThat(Solution().removeDuplicates("azxxzy"), equalTo("ay"))
    }
}
