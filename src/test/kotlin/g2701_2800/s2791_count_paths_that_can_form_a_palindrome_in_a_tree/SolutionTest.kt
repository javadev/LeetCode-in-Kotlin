package g2701_2800.s2791_count_paths_that_can_form_a_palindrome_in_a_tree

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPalindromePaths() {
        assertThat(Solution().countPalindromePaths(listOf(-1, 0, 0, 1, 1, 2), "acaabc"), equalTo(8))
    }

    @Test
    fun countPalindromePaths2() {
        assertThat(Solution().countPalindromePaths(listOf(-1, 0, 0, 0, 0), "aaaaa"), equalTo(10))
    }
}
