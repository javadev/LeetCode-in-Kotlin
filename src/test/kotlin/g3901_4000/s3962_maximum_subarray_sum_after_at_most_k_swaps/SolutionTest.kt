package g3901_4000.s3962_maximum_subarray_sum_after_at_most_k_swaps

import g3901_4000.s3962_maximum_subarray_sum_after_at_most_k_swaps.Solution.SwapContext
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSum() {
        assertThat<Long>(Solution().maxSum(intArrayOf(1, -1, 0, 2), 1), equalTo<Long>(3L))
    }

    @Test
    fun maxSum2() {
        assertThat<Long>(Solution().maxSum(intArrayOf(4, 3, 2, 4), 2), equalTo<Long>(13L))
    }

    @Test
    fun maxSum3() {
        assertThat<Long>(Solution().maxSum(intArrayOf(-1, -2), 0), equalTo<Long>(-1L))
    }

    @Test
    fun maxSum4() {
        assertThat<Long>(Solution().maxSum(intArrayOf(-5, -1, -3), 1), equalTo<Long>(-1L))
    }

    @Test
    fun maxSum5() {
        assertThat<Long>(
            Solution().maxSum(intArrayOf(1, -10, 1, -10, 1, -10, 1), 1),
            equalTo<Long>(3L),
        )
    }

    @Test
    fun maxSum6() {
        assertThat<Long>(
            Solution()
                .maxSum(intArrayOf(10, -1000, 10, -1000, 10, -1000, 10, -1000, 10), 1),
            equalTo<Long>(30L),
        )
    }

    @Test
    fun maxSum7() {
        assertThat<Long>(
            Solution().maxSum(intArrayOf(5, -1, -2, -3, 6), 1),
            equalTo<Long>(11L),
        )
    }

    @Test
    fun maxSum8() {
        assertThat<Long>(
            Solution().maxSum(intArrayOf(3, -5, 4, -5, 8), 2),
            equalTo<Long>(15L),
        )
    }

    @Test
    fun maxSum9() {
        assertThat<Long>(
            Solution().maxSum(intArrayOf(1, 1, 1, -100, 2), 1),
            equalTo<Long>(5L),
        )
    }

    @Test
    fun maxSum10() {
        assertThat<Long>(Solution().maxSum(intArrayOf(7), 1), equalTo<Long>(7L))
    }

    @Test
    fun swapContext() {
        val context =
            SwapContext(intArrayOf(1, 2), intArrayOf(1, 0), intArrayOf(1, 1))
        assertThat<Boolean>(context.equals(context), equalTo<Boolean>(true))
        assertThat<Boolean>(context.equals(null), equalTo<Boolean>(false))
        assertThat<Boolean>(context.equals("swap"), equalTo<Boolean>(false))
        val same =
            SwapContext(intArrayOf(1, 2), intArrayOf(1, 0), intArrayOf(1, 1))
        assertThat<Boolean>(context.equals(same), equalTo<Boolean>(true))
        assertThat<Int>(context.hashCode(), equalTo<Int>(same.hashCode()))
        val differentValues =
            SwapContext(intArrayOf(1, 3), intArrayOf(1, 0), intArrayOf(1, 1))
        assertThat<Boolean>(context.equals(differentValues), equalTo<Boolean>(false))
        val differentIncluded =
            SwapContext(intArrayOf(1, 2), intArrayOf(0, 1), intArrayOf(1, 1))
        assertThat<Boolean>(context.equals(differentIncluded), equalTo<Boolean>(false))
        val differentCounts =
            SwapContext(intArrayOf(1, 2), intArrayOf(1, 0), intArrayOf(2, 1))
        assertThat<Boolean>(context.equals(differentCounts), equalTo<Boolean>(false))
        assertThat<String>(
            context.toString(),
            equalTo<String>("SwapContext[values=[1, 2], included=[1, 0], totalCounts=[1, 1]]"),
        )
    }
}
