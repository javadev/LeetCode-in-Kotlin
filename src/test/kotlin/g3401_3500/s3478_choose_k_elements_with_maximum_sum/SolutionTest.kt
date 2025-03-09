package g3401_3500.s3478_choose_k_elements_with_maximum_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMaxSum() {
        assertThat<LongArray>(
            Solution()
                .findMaxSum(intArrayOf(4, 2, 1, 5, 3), intArrayOf(10, 20, 30, 40, 50), 2),
            equalTo<LongArray>(longArrayOf(80L, 30L, 0L, 80L, 50L)),
        )
    }

    @Test
    fun findMaxSum2() {
        assertThat<LongArray>(
            Solution().findMaxSum(intArrayOf(2, 2, 2, 2), intArrayOf(3, 1, 2, 3), 1),
            equalTo<LongArray>(longArrayOf(0L, 0L, 0L, 0L)),
        )
    }
}
