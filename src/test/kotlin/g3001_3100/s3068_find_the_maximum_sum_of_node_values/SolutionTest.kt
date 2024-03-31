package g3001_3100.s3068_find_the_maximum_sum_of_node_values

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumValueSum() {
        assertThat(
            Solution()
                .maximumValueSum(intArrayOf(1, 2, 1), 3, arrayOf(intArrayOf(0, 1), intArrayOf(0, 2))),
            equalTo(6L)
        )
    }

    @Test
    fun maximumValueSum2() {
        assertThat(
            Solution().maximumValueSum(intArrayOf(2, 3), 7, arrayOf(intArrayOf(0, 1))),
            equalTo(9L)
        )
    }

    @Test
    fun maximumValueSum3() {
        assertThat(
            Solution()
                .maximumValueSum(
                    intArrayOf(7, 7, 7, 7, 7, 7),
                    3,
                    arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(0, 3), intArrayOf(0, 4), intArrayOf(0, 5))
                ),
            equalTo(42L)
        )
    }
}
