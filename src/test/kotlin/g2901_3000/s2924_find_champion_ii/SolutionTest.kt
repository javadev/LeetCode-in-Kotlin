package g2901_3000.s2924_find_champion_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findChampion() {
        assertThat(
            Solution().findChampion(3, arrayOf(intArrayOf(0, 1), intArrayOf(1, 2))),
            equalTo(0)
        )
    }

    @Test
    fun findChampion2() {
        assertThat(
            Solution().findChampion(4, arrayOf(intArrayOf(0, 2), intArrayOf(1, 3), intArrayOf(1, 2))),
            equalTo(-1)
        )
    }
}
