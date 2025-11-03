package g3701_3800.s3734_lexicographically_smallest_palindromic_permutation_greater_than_target

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lexPalindromicPermutation() {
        assertThat<String>(
            Solution().lexPalindromicPermutation("baba", "abba"),
            equalTo<String>("baab"),
        )
    }

    @Test
    fun lexPalindromicPermutation2() {
        assertThat<String>(
            Solution().lexPalindromicPermutation("baba", "bbaa"),
            equalTo<String>(""),
        )
    }

    @Test
    fun lexPalindromicPermutation3() {
        assertThat<String>(
            Solution().lexPalindromicPermutation("abc", "abb"),
            equalTo<String>(""),
        )
    }

    @Test
    fun lexPalindromicPermutation4() {
        assertThat<String>(
            Solution().lexPalindromicPermutation("aac", "abb"),
            equalTo<String>("aca"),
        )
    }
}
