package g3101_3200.s3117_minimum_sum_of_values_by_dividing_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumValueSum() {
        assertThat(
            Solution().minimumValueSum(intArrayOf(1, 4, 3, 3, 2), intArrayOf(0, 3, 3, 2)),
            equalTo(12),
        )
    }

    @Test
    fun minimumValueSum2() {
        assertThat(
            Solution()
                .minimumValueSum(intArrayOf(2, 3, 5, 7, 7, 7, 5), intArrayOf(0, 7, 5)),
            equalTo(17),
        )
    }

    @Test
    fun minimumValueSum3() {
        assertThat(
            Solution().minimumValueSum(intArrayOf(1, 2, 3, 4), intArrayOf(2)),
            equalTo(-1),
        )
    }
}
