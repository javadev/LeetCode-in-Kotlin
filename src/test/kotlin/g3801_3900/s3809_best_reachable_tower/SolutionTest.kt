package g3801_3900.s3809_best_reachable_tower

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun bestTower() {
        assertThat<IntArray>(
            Solution()
                .bestTower(
                    arrayOf<IntArray>(intArrayOf(1, 2, 5), intArrayOf(2, 1, 7), intArrayOf(3, 1, 9)),
                    intArrayOf(1, 1),
                    2,
                ),
            equalTo<IntArray>(intArrayOf(3, 1)),
        )
    }

    @Test
    fun bestTower2() {
        assertThat<IntArray>(
            Solution()
                .bestTower(
                    arrayOf<IntArray>(intArrayOf(1, 3, 4), intArrayOf(2, 2, 4), intArrayOf(4, 4, 7)),
                    intArrayOf(0, 0),
                    5,
                ),
            equalTo<IntArray>(intArrayOf(1, 3)),
        )
    }

    @Test
    fun bestTower3() {
        assertThat<IntArray>(
            Solution().bestTower(arrayOf<IntArray>(intArrayOf(5, 6, 8), intArrayOf(0, 3, 5)), intArrayOf(1, 2), 1),
            equalTo<IntArray>(intArrayOf(-1, -1)),
        )
    }
}
