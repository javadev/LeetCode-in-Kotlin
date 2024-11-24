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
}
