package g1301_1400.s1353_maximum_number_of_events_that_can_be_attended

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxEvents() {
        assertThat(
            Solution().maxEvents(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(2, 3), intArrayOf(3, 4)
                )
            ),
            equalTo(3)
        )
    }

    @Test
    fun maxEvents2() {
        assertThat(
            Solution().maxEvents(
                arrayOf(
                    intArrayOf(1, 2), intArrayOf(2, 3),
                    intArrayOf(3, 4), intArrayOf(1, 2)
                )
            ),
            equalTo(4)
        )
    }
}
