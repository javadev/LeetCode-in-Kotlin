package g1501_1600.s1583_count_unhappy_friends

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun unhappyFriends() {
        MatcherAssert.assertThat(
            Solution()
                .unhappyFriends(
                    4,
                    arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 2, 0), intArrayOf(3, 1, 0), intArrayOf(1, 2, 0)),
                    arrayOf(
                        intArrayOf(0, 1), intArrayOf(2, 3)
                    )
                ),
            CoreMatchers.equalTo(2)
        )
    }

    @Test
    fun unhappyFriends2() {
        MatcherAssert.assertThat(
            Solution().unhappyFriends(2, arrayOf(intArrayOf(1), intArrayOf(0)), arrayOf(intArrayOf(1, 0))),
            CoreMatchers.equalTo(0)
        )
    }

    @Test
    fun unhappyFriends3() {
        MatcherAssert.assertThat(
            Solution()
                .unhappyFriends(
                    4,
                    arrayOf(intArrayOf(1, 3, 2), intArrayOf(2, 3, 0), intArrayOf(1, 3, 0), intArrayOf(0, 2, 1)),
                    arrayOf(
                        intArrayOf(1, 3), intArrayOf(0, 2)
                    )
                ),
            CoreMatchers.equalTo(4)
        )
    }
}
