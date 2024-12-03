package g3301_3400.s3366_minimum_array_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minArraySum() {
        assertThat<Int>(
            Solution().minArraySum(intArrayOf(2, 8, 3, 19, 3), 3, 1, 1),
            equalTo<Int>(23),
        )
    }

    @Test
    fun minArraySum2() {
        assertThat<Int>(
            Solution().minArraySum(intArrayOf(2, 4, 3), 3, 2, 1),
            equalTo<Int>(3),
        )
    }

    @Test
    fun minArraySum3() {
        assertThat<Int>(
            Solution()
                .minArraySum(
                    intArrayOf(
                        1, 3, 5, 7, 9, 12, 12, 12, 13, 15, 15, 15, 16, 17, 19, 20,
                    ),
                    11,
                    15,
                    4,
                ),
            equalTo<Int>(77),
        )
    }
}
