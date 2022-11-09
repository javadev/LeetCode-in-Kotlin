package g0301_0400.s0307_range_sum_query_mutable

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class NumArrayTest {
    @Test
    fun numArray() {
        val numArray = NumArray(intArrayOf(1, 3, 5))
        assertThat(numArray.sumRange(0, 2), equalTo(9))
        numArray.update(1, 2)
        assertThat(numArray.sumRange(0, 2), equalTo(8))
    }
}
