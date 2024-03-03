package g3001_3100.s3035_maximum_palindromes_after_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxPalindromesAfterOperations() {
        assertThat(
            Solution().maxPalindromesAfterOperations(arrayOf("abbb", "ba", "aa")),
            equalTo(3)
        )
    }

    @Test
    fun maxPalindromesAfterOperations2() {
        assertThat(
            Solution().maxPalindromesAfterOperations(arrayOf("abc", "ab")),
            equalTo(2)
        )
    }

    @Test
    fun maxPalindromesAfterOperations3() {
        assertThat(
            Solution().maxPalindromesAfterOperations(arrayOf("cd", "ef", "a")),
            equalTo(1)
        )
    }
}
