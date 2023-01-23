package g0501_0600.s0561_array_partition_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun arrayPairSum() {
        assertThat(Solution().arrayPairSum(intArrayOf(1, 4, 3, 2)), equalTo(4))
    }

    @Test
    fun arrayPairSum2() {
        assertThat(Solution().arrayPairSum(intArrayOf(6, 2, 6, 5, 1, 2)), equalTo(9))
    }
}
