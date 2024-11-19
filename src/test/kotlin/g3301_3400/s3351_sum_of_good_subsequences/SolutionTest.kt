package g3301_3400.s3351_sum_of_good_subsequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfGoodSubsequences() {
        assertThat<Int>(
            Solution().sumOfGoodSubsequences(intArrayOf(1, 2, 1)),
            equalTo<Int>(14),
        )
    }

    @Test
    fun sumOfGoodSubsequences2() {
        assertThat<Int>(
            Solution().sumOfGoodSubsequences(intArrayOf(3, 4, 5)),
            equalTo<Int>(40),
        )
    }
}
