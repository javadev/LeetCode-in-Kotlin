package g1501_1600.s1560_most_visited_sector_in_a_circular_track

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mostVisited() {
        assertThat(
            Solution().mostVisited(4, intArrayOf(1, 3, 1, 2)),
            equalTo(mutableListOf(1, 2))
        )
    }

    @Test
    fun mostVisited2() {
        assertThat(
            Solution().mostVisited(2, intArrayOf(2, 1, 2, 1, 2, 1, 2, 1, 2)),
            equalTo(listOf(2))
        )
    }

    @Test
    fun mostVisited3() {
        assertThat(
            Solution().mostVisited(7, intArrayOf(1, 3, 5, 7)),
            equalTo(mutableListOf(1, 2, 3, 4, 5, 6, 7))
        )
    }
}
