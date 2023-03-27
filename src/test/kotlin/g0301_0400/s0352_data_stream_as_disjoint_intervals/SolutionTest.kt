package g0301_0400.s0352_data_stream_as_disjoint_intervals

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private var summaryRanges = SummaryRanges()

    @Test
    fun getIntervals() {
        summaryRanges.addNum(1)
        assertThat(summaryRanges.getIntervals(), equalTo(arrayOf(intArrayOf(1, 1))))
    }

    @Test
    fun getIntervals2() {
        summaryRanges.addNum(1)
        summaryRanges.addNum(3)
        assertThat(summaryRanges.getIntervals(), equalTo(arrayOf(intArrayOf(1, 1), intArrayOf(3, 3))))
    }

    @Test
    fun getIntervals3() {
        summaryRanges.addNum(1)
        summaryRanges.addNum(3)
        summaryRanges.addNum(7)
        assertThat(summaryRanges.getIntervals(), equalTo(arrayOf(intArrayOf(1, 1), intArrayOf(3, 3), intArrayOf(7, 7))))
    }

    @Test
    fun getIntervals4() {
        summaryRanges.addNum(1)
        summaryRanges.addNum(2)
        summaryRanges.addNum(3)
        summaryRanges.addNum(7)
        assertThat(summaryRanges.getIntervals(), equalTo(arrayOf(intArrayOf(1, 3), intArrayOf(7, 7))))
    }

    @Test
    fun getIntervals5() {
        summaryRanges.addNum(1)
        summaryRanges.addNum(2)
        summaryRanges.addNum(3)
        summaryRanges.addNum(6)
        summaryRanges.addNum(7)
        assertThat(summaryRanges.getIntervals(), equalTo(arrayOf(intArrayOf(1, 3), intArrayOf(6, 7))))
    }
}
