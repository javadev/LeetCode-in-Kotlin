package g2001_2100.s2076_process_restricted_friend_requests

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun friendRequests() {
        assertThat(
            Solution()
                .friendRequests(3, arrayOf(intArrayOf(0, 1)), arrayOf(intArrayOf(0, 2), intArrayOf(2, 1))),
            equalTo(booleanArrayOf(true, false)),
        )
    }

    @Test
    fun friendRequests2() {
        assertThat(
            Solution()
                .friendRequests(3, arrayOf(intArrayOf(0, 1)), arrayOf(intArrayOf(1, 2), intArrayOf(0, 2))),
            equalTo(booleanArrayOf(true, false)),
        )
    }

    @Test
    fun friendRequests3() {
        assertThat(
            Solution()
                .friendRequests(
                    5,
                    arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 3)),
                    arrayOf(intArrayOf(0, 4), intArrayOf(1, 2), intArrayOf(3, 1), intArrayOf(3, 4)),
                ),
            equalTo(booleanArrayOf(true, false, true, false)),
        )
    }
}
