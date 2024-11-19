package g3301_3400.s3306_count_of_substrings_containing_every_vowel_and_k_consonants_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countOfSubstrings() {
        assertThat<Long>(Solution().countOfSubstrings("aeioqq", 1), equalTo<Long>(0L))
    }

    @Test
    fun countOfSubstrings2() {
        assertThat<Long>(Solution().countOfSubstrings("aeiou", 0), equalTo<Long>(1L))
    }

    @Test
    fun countOfSubstrings3() {
        assertThat<Long>(
            Solution().countOfSubstrings("ieaouqqieaouqq", 1),
            equalTo<Long>(3L),
        )
    }
}
