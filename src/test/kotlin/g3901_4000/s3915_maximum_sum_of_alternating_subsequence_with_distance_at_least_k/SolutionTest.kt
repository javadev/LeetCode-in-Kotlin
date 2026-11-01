package g3901_4000.s3915_maximum_sum_of_alternating_subsequence_with_distance_at_least_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxAlternatingSum() {
        val nums = IntArray(30000)
        for (i in nums.indices) {
            nums[i] = if (i % 2 == 0) 100000 else 99999
        }
        assertThat<Long>(Solution().maxAlternatingSum(nums, 1), equalTo<Long>(2999985000L))
    }

    @Test
    fun maxAlternatingSum2() {
        assertThat<Long>(
            Solution().maxAlternatingSum(intArrayOf(5, 4, 2), 2),
            equalTo<Long>(7L),
        )
    }

    @Test
    fun maxAlternatingSum3() {
        assertThat<Long>(
            Solution().maxAlternatingSum(intArrayOf(3, 5, 4, 2, 4), 1),
            equalTo<Long>(14L),
        )
    }

    @Test
    fun maxAlternatingSum4() {
        assertThat<Long>(Solution().maxAlternatingSum(intArrayOf(5), 1), equalTo<Long>(5L))
    }

    @Test
    fun maxAlternatingSum5() {
        assertThat<Long>(
            Solution().maxAlternatingSum(intArrayOf(4, 4, 4), 1),
            equalTo<Long>(4L),
        )
    }

    @Test
    fun maxAlternatingSum6() {
        assertThat<Long>(
            Solution().maxAlternatingSum(intArrayOf(3, 9, 4), 3),
            equalTo<Long>(9L),
        )
    }

    @Test
    fun maxAlternatingSum7() {
        assertThat<Long>(
            Solution().maxAlternatingSum(intArrayOf(1, 2, 3, 4), 1),
            equalTo<Long>(7L),
        )
    }

    @Test
    fun maxAlternatingSum8() {
        assertThat<Long>(
            Solution().maxAlternatingSum(intArrayOf(4, 3, 2, 1), 1),
            equalTo<Long>(7L),
        )
    }

    @Test
    fun maxAlternatingSum9() {
        assertThat<Long>(
            Solution().maxAlternatingSum(intArrayOf(2, 5, 1, 4, 2), 1),
            equalTo<Long>(14L),
        )
    }

    @Test
    fun maxAlternatingSum10() {
        assertThat<Long>(
            Solution().maxAlternatingSum(intArrayOf(5, 1, 4, 2, 6), 2),
            equalTo<Long>(15L),
        )
    }
}
