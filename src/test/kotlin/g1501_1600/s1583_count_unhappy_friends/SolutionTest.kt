package g1501_1600.s1583_count_unhappy_friends

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun unhappyFriends() {
        assertThat(
            Solution()
                .unhappyFriends(
                    4,
                    arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 2, 0), intArrayOf(3, 1, 0), intArrayOf(1, 2, 0)),
                    arrayOf(
                        intArrayOf(0, 1), intArrayOf(2, 3)
                    )
                ),
            equalTo(2)
        )
    }

    @Test
    fun unhappyFriends2() {
        assertThat(
            Solution().unhappyFriends(2, arrayOf(intArrayOf(1), intArrayOf(0)), arrayOf(intArrayOf(1, 0))),
            equalTo(0)
        )
    }

    @Test
    fun unhappyFriends3() {
        assertThat(
            Solution()
                .unhappyFriends(
                    4,
                    arrayOf(intArrayOf(1, 3, 2), intArrayOf(2, 3, 0), intArrayOf(1, 3, 0), intArrayOf(0, 2, 1)),
                    arrayOf(
                        intArrayOf(1, 3), intArrayOf(0, 2)
                    )
                ),
            equalTo(4)
        )
    }
}
