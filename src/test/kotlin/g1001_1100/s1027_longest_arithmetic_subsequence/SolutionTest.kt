package g1001_1100.s1027_longest_arithmetic_subsequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestArithSeqLength() {
        assertThat(Solution().longestArithSeqLength(intArrayOf(3, 6, 9, 12)), equalTo(4))
    }

    @Test
    fun longestArithSeqLength2() {
        assertThat(Solution().longestArithSeqLength(intArrayOf(9, 4, 7, 2, 10)), equalTo(3))
    }

    @Test
    fun longestArithSeqLength3() {
        assertThat(
            Solution().longestArithSeqLength(intArrayOf(20, 1, 15, 3, 10, 5, 8)),
            equalTo(4)
        )
    }
}
