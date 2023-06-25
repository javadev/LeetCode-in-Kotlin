package g2101_2200.s2193_minimum_number_of_moves_to_make_palindrome

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMovesToMakePalindrome() {
        MatcherAssert.assertThat(Solution().minMovesToMakePalindrome("aabb"), CoreMatchers.equalTo(2))
    }

    @Test
    fun minMovesToMakePalindrome2() {
        MatcherAssert.assertThat(Solution().minMovesToMakePalindrome("letelt"), CoreMatchers.equalTo(2))
    }

    @Test
    fun minMovesToMakePalindrome3() {
        MatcherAssert.assertThat(
            Solution().minMovesToMakePalindrome("skwhhaaunskegmdtutlgtteunmuuludii"),
            CoreMatchers.equalTo(163)
        )
    }
}
