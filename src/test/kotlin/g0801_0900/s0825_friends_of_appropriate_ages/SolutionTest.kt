package g0801_0900.s0825_friends_of_appropriate_ages

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numFriendRequests() {
        assertThat(Solution().numFriendRequests(intArrayOf(16, 16)), equalTo(2))
    }

    @Test
    fun numFriendRequests2() {
        assertThat(Solution().numFriendRequests(intArrayOf(16, 17, 18)), equalTo(2))
    }

    @Test
    fun numFriendRequests3() {
        assertThat(Solution().numFriendRequests(intArrayOf(20, 30, 100, 110, 120)), equalTo(3))
    }
}
