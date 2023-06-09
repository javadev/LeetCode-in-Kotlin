package g1201_1300.s1220_count_vowels_permutation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countVowelPermutation() {
        assertThat(Solution().countVowelPermutation(1), equalTo(5))
    }

    @Test
    fun countVowelPermutation2() {
        assertThat(Solution().countVowelPermutation(2), equalTo(10))
    }

    @Test
    fun countVowelPermutation3() {
        assertThat(Solution().countVowelPermutation(5), equalTo(68))
    }
}
