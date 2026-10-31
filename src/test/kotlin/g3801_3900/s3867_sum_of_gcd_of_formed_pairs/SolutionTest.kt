package g3801_3900.s3867_sum_of_gcd_of_formed_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun gcdSum() {
        assertThat<Long>(Solution().gcdSum(intArrayOf(2, 6, 4)), equalTo<Long>(2L))
    }

    @Test
    fun gcdSum2() {
        assertThat<Long>(Solution().gcdSum(intArrayOf(3, 6, 2, 8)), equalTo<Long>(5L))
    }

    @Test
    fun gcdSum3() {
        assertThat<Long>(Solution().gcdSum(intArrayOf(7)), equalTo<Long>(0L))
    }
}
