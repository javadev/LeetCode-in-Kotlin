package g3201_3300.s3256_maximum_value_sum_by_placing_three_rooks_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumValueSum() {
        assertThat(
            Solution()
                .maximumValueSum(
                    arrayOf(intArrayOf(-3, 1, 1, 1), intArrayOf(-3, 1, -3, 1), intArrayOf(-3, 2, 1, 1))
                ),
            equalTo(4L)
        )
    }

    @Test
    fun maximumValueSum2() {
        assertThat(
            Solution().maximumValueSum(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))),
            equalTo(15L)
        )
    }

    @Test
    fun maximumValueSum3() {
        assertThat(
            Solution().maximumValueSum(arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 1, 1), intArrayOf(1, 1, 1))),
            equalTo(3L)
        )
    }
}
