package g0601_0700.s0646_maximum_length_of_pair_chain

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findLongestChain() {
        assertThat(
            Solution().findLongestChain(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4))), equalTo(2)
        )
    }

    @Test
    fun findLongestChain2() {
        assertThat(
            Solution().findLongestChain(arrayOf(intArrayOf(1, 2), intArrayOf(7, 8), intArrayOf(4, 5))), equalTo(3)
        )
    }
}
