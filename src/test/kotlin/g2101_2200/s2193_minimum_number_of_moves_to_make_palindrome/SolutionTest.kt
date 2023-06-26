package g2101_2200.s2193_minimum_number_of_moves_to_make_palindrome

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMovesToMakePalindrome() {
        assertThat(Solution().minMovesToMakePalindrome("aabb"), equalTo(2))
    }

    @Test
    fun minMovesToMakePalindrome2() {
        assertThat(Solution().minMovesToMakePalindrome("letelt"), equalTo(2))
    }

    @Test
    fun minMovesToMakePalindrome3() {
        assertThat(
            Solution().minMovesToMakePalindrome("skwhhaaunskegmdtutlgtteunmuuludii"),
            equalTo(163)
        )
    }
}
