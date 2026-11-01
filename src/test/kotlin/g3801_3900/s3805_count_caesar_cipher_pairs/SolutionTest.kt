package g3801_3900.s3805_count_caesar_cipher_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPairs() {
        assertThat<Long>(
            Solution().countPairs(arrayOf<String>("fusion", "layout")),
            equalTo<Long>(1L),
        )
    }

    @Test
    fun countPairs2() {
        assertThat<Long>(
            Solution().countPairs(arrayOf<String>("ab", "aa", "za", "aa")),
            equalTo<Long>(2L),
        )
    }
}
