package g3301_3400.s3325_count_substrings_with_k_frequency_characters_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfSubstrings() {
        assertThat<Int>(Solution().numberOfSubstrings("abacb", 2), equalTo<Int>(4))
    }

    @Test
    fun numberOfSubstrings2() {
        assertThat<Int>(Solution().numberOfSubstrings("abcde", 1), equalTo<Int>(15))
    }
}
