package g3601_3700.s3695_maximize_alternating_sum_using_swaps

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxAlternatingSum() {
        assertThat<Long>(
            Solution().maxAlternatingSum(intArrayOf(1, 2, 3), arrayOf<IntArray>(intArrayOf(0, 2), intArrayOf(1, 2))),
            equalTo<Long>(4L),
        )
    }

    @Test
    fun maxAlternatingSum2() {
        assertThat<Long>(
            Solution().maxAlternatingSum(intArrayOf(1, 2, 3), arrayOf<IntArray>(intArrayOf(1, 2))),
            equalTo<Long>(2L),
        )
    }

    @Test
    fun maxAlternatingSum3() {
        assertThat<Long>(
            Solution()
                .maxAlternatingSum(
                    intArrayOf(1, 1000000000, 1, 1000000000, 1, 1000000000),
                    arrayOf<IntArray>(),
                ),
            equalTo<Long>(-2999999997L),
        )
    }
}
