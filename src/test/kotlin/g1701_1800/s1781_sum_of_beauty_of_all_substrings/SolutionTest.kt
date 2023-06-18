package g1701_1800.s1781_sum_of_beauty_of_all_substrings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun beautySum() {
        assertThat(Solution().beautySum("aabcb"), equalTo(5))
    }

    @Test
    fun beautySum2() {
        assertThat(Solution().beautySum("aabcbaa"), equalTo(17))
    }
}
