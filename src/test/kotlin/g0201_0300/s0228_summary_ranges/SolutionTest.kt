package g0201_0300.s0228_summary_ranges

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.Arrays

internal class SolutionTest {
    @Test
    fun summaryRanges() {
        assertThat(
            Solution().summaryRanges(intArrayOf(0, 1, 2, 4, 5, 7)),
            equalTo(Arrays.asList("0->2", "4->5", "7"))
        )
    }

    @Test
    fun summaryRanges2() {
        assertThat(
            Solution().summaryRanges(intArrayOf(0, 2, 3, 4, 6, 8, 9)),
            equalTo(Arrays.asList("0", "2->4", "6", "8->9"))
        )
    }
}
