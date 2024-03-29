package g2001_2100.s2080_range_frequency_queries

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class RangeFreqQueryTest {
    @Test
    fun rangeFreqQuery() {
        val rangeFreqQuery = RangeFreqQuery(intArrayOf(12, 33, 4, 56, 22, 2, 34, 33, 22, 12, 34, 56))
        // return 1. The value 4 occurs 1 time in the subarray [33, 4]
        assertThat(rangeFreqQuery.query(1, 2, 4), equalTo(1))
        // return 2. The value 33 occurs 2 times in the whole array.
        assertThat(rangeFreqQuery.query(0, 11, 33), equalTo(2))
    }
}
