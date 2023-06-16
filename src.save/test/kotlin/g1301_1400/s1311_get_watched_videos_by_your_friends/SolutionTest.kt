package g1301_1400.s1311_get_watched_videos_by_your_friends

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun watchedVideosByFriends() {
        assertThat(
            Solution()
                .watchedVideosByFriends(
                    listOf(
                        mutableListOf("A", "B"), listOf("C"), mutableListOf("B", "C"),
                        listOf("D")
                    ),
                    arrayOf(
                        intArrayOf(1, 2), intArrayOf(0, 3),
                        intArrayOf(0, 3), intArrayOf(1, 2)
                    ),
                    0,
                    1
                ),
            equalTo(mutableListOf("B", "C"))
        )
    }

    @Test
    fun watchedVideosByFriends2() {
        assertThat(
            Solution()
                .watchedVideosByFriends(
                    listOf(
                        mutableListOf("A", "B"), listOf("C"),
                        mutableListOf("B", "C"), listOf("D")
                    ),
                    arrayOf(intArrayOf(1, 2), intArrayOf(0, 3), intArrayOf(0, 3), intArrayOf(1, 2)),
                    0,
                    2
                ),
            equalTo(listOf("D"))
        )
    }
}
