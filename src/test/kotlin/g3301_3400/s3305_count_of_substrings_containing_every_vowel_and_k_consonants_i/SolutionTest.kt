package g3301_3400.s3305_count_of_substrings_containing_every_vowel_and_k_consonants_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countOfSubstrings() {
        assertThat<Int>(Solution().countOfSubstrings("aeioqq", 1), equalTo<Int>(0))
    }

    @Test
    fun countOfSubstrings2() {
        assertThat<Int>(Solution().countOfSubstrings("aeiou", 0), equalTo<Int>(1))
    }

    @Test
    fun countOfSubstrings3() {
        assertThat<Int>(Solution().countOfSubstrings("ieaouqqieaouqq", 1), equalTo<Int>(3))
    }
}
