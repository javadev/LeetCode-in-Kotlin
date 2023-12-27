package g2901_3000.s2911_minimum_changes_to_make_k_semi_palindromes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumChanges() {
        assertThat(Solution().minimumChanges("abcac", 2), equalTo(1))
    }

    @Test
    fun minimumChanges2() {
        assertThat(Solution().minimumChanges("abcdef", 2), equalTo(2))
    }

    @Test
    fun minimumChanges3() {
        assertThat(Solution().minimumChanges("aabbaa", 3), equalTo(0))
    }
}
