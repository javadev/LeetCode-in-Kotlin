package g2201_2300.s2276_count_integers_in_intervals

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class CountIntervalsTest {
    @Test
    fun countIntervalsTest() {
        val countIntervals = CountIntervals()
        countIntervals.add(2, 3)
        countIntervals.add(7, 10)
        assertThat(countIntervals.count(), equalTo(6))
        countIntervals.add(5, 8)
        assertThat(countIntervals.count(), equalTo(8))
    }
}
