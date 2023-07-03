package g2401_2500.s2402_meeting_rooms_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mostBooked() {
        assertThat(
            Solution().mostBooked(2, arrayOf(intArrayOf(0, 10), intArrayOf(1, 5), intArrayOf(2, 7), intArrayOf(3, 4))),
            equalTo(0)
        )
    }

    @Test
    fun mostBooked2() {
        assertThat(
            Solution()
                .mostBooked(
                    3,
                    arrayOf(intArrayOf(1, 20), intArrayOf(2, 10), intArrayOf(3, 5), intArrayOf(4, 9), intArrayOf(6, 8))
                ),
            equalTo(1)
        )
    }
}
