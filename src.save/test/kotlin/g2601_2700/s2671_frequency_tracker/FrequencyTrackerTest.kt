package g2601_2700.s2671_frequency_tracker

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class FrequencyTrackerTest {
    @Test
    fun frequencyTracker() {
        val frequencyTracker = FrequencyTracker()
        frequencyTracker.add(3)
        frequencyTracker.add(3)
        assertThat(frequencyTracker.hasFrequency(2), equalTo(true))
    }

    @Test
    fun frequencyTracker2() {
        val frequencyTracker = FrequencyTracker()
        frequencyTracker.add(1)
        frequencyTracker.deleteOne(1)
        assertThat(frequencyTracker.hasFrequency(1), equalTo(false))
    }

    @Test
    fun frequencyTracker3() {
        val frequencyTracker = FrequencyTracker()
        assertThat(frequencyTracker.hasFrequency(2), equalTo(false))
        frequencyTracker.add(3)
        assertThat(frequencyTracker.hasFrequency(1), equalTo(true))
    }
}
