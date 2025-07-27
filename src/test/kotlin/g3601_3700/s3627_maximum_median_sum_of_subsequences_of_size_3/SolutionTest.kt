package g3601_3700.s3627_maximum_median_sum_of_subsequences_of_size_3

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumMedianSum() {
        assertThat<Long>(
            Solution().maximumMedianSum(intArrayOf(2, 1, 3, 2, 1, 3)),
            equalTo<Long>(5L),
        )
    }

    @Test
    fun maximumMedianSum2() {
        assertThat<Long>(
            Solution().maximumMedianSum(intArrayOf(1, 1, 10, 10, 10, 10)),
            equalTo<Long>(20L),
        )
    }
}
