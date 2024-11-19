package g3301_3400.s3301_maximize_the_total_height_of_unique_towers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumTotalSum() {
        assertThat<Long>(
            Solution().maximumTotalSum(intArrayOf(2, 3, 4, 3)),
            equalTo<Long>(10L),
        )
    }

    @Test
    fun maximumTotalSum2() {
        assertThat<Long>(
            Solution().maximumTotalSum(intArrayOf(15, 10)),
            equalTo<Long>(25L),
        )
    }

    @Test
    fun maximumTotalSum3() {
        assertThat<Long>(
            Solution().maximumTotalSum(intArrayOf(2, 2, 1)),
            equalTo<Long>(-1L),
        )
    }
}
