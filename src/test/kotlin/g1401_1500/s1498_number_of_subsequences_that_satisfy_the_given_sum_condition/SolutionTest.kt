package g1401_1500.s1498_number_of_subsequences_that_satisfy_the_given_sum_condition

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numSubseq() {
        assertThat(Solution().numSubseq(intArrayOf(3, 5, 6, 7), 9), equalTo(4))
    }

    @Test
    fun numSubseq2() {
        assertThat(Solution().numSubseq(intArrayOf(3, 3, 6, 8), 10), equalTo(6))
    }

    @Test
    fun numSubseq3() {
        assertThat(Solution().numSubseq(intArrayOf(2, 3, 3, 4, 6, 7), 12), equalTo(61))
    }
}
