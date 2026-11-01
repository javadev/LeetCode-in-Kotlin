package g3901_4000.s3927_minimize_array_sum_using_divisible_replacements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.*

internal class SolutionTest {
    @Test
    fun minArraySum8() {
        val nums = IntArray(30000)
        Arrays.fill(nums, 100000)
        assertThat<Long>(Solution().minArraySum(nums), equalTo<Long>(3000000000L))
    }

    @Test
    fun minArraySum() {
        assertThat<Long>(Solution().minArraySum(intArrayOf(3, 6, 2)), equalTo<Long>(7L))
    }

    @Test
    fun minArraySum2() {
        assertThat<Long>(Solution().minArraySum(intArrayOf(4, 2, 8, 3)), equalTo<Long>(9L))
    }

    @Test
    fun minArraySum3() {
        assertThat<Long>(Solution().minArraySum(intArrayOf(7, 5, 9)), equalTo<Long>(21L))
    }

    @Test
    fun minArraySum4() {
        assertThat<Long>(
            Solution().minArraySum(intArrayOf(100000, 1, 7)),
            equalTo<Long>(3L),
        )
    }

    @Test
    fun minArraySum5() {
        assertThat<Long>(Solution().minArraySum(intArrayOf(8)), equalTo<Long>(8L))
    }

    @Test
    fun minArraySum6() {
        assertThat<Long>(
            Solution().minArraySum(intArrayOf(12, 6, 3, 2, 12)),
            equalTo<Long>(11L),
        )
    }

    @Test
    fun minArraySum7() {
        assertThat<Long>(Solution().minArraySum(intArrayOf(5, 5, 5)), equalTo<Long>(15L))
    }
}
