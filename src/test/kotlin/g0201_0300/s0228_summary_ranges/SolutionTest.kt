package g0201_0300.s0228_summary_ranges

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun summaryRanges() {
        MatcherAssert.assertThat(
            Solution().summaryRanges(intArrayOf(0, 1, 2, 4, 5, 7)),
            CoreMatchers.equalTo(listOf("0->2", "4->5", "7"))
        )
    }

    @Test
    fun summaryRanges2() {
        MatcherAssert.assertThat(
            Solution().summaryRanges(intArrayOf(0, 2, 3, 4, 6, 8, 9)),
            CoreMatchers.equalTo(listOf("0", "2->4", "6", "8->9"))
        )
    }
}
