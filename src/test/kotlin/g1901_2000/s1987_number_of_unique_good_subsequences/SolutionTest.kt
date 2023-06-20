package g1901_2000.s1987_number_of_unique_good_subsequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfUniqueGoodSubsequences() {
        assertThat(Solution().numberOfUniqueGoodSubsequences("001"), equalTo(2))
    }

    @Test
    fun numberOfUniqueGoodSubsequences2() {
        assertThat(Solution().numberOfUniqueGoodSubsequences("11"), equalTo(2))
    }

    @Test
    fun numberOfUniqueGoodSubsequences3() {
        assertThat(Solution().numberOfUniqueGoodSubsequences("101"), equalTo(5))
    }
}
