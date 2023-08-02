package g2401_2500.s2446_determine_if_two_events_have_conflict

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun haveConflict() {
        assertThat(
            Solution()
                .haveConflict(arrayOf("01:15", "02:00"), arrayOf("02:00", "03:00")),
            equalTo(true)
        )
    }

    @Test
    fun haveConflict2() {
        assertThat(
            Solution()
                .haveConflict(arrayOf("01:00", "02:00"), arrayOf("01:20", "03:00")),
            equalTo(true)
        )
    }

    @Test
    fun haveConflict3() {
        assertThat(
            Solution()
                .haveConflict(arrayOf("10:00", "11:00"), arrayOf("14:00", "15:00")),
            equalTo(false)
        )
    }
}
