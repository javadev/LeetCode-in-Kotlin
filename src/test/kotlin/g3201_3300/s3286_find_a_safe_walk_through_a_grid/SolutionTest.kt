package g3201_3300.s3286_find_a_safe_walk_through_a_grid

import com_github_leetcode.ArrayUtils.getLists
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findSafeWalk() {
        assertThat<Boolean>(
            Solution()
                .findSafeWalk(
                    getLists(
                        arrayOf<IntArray>(
                            intArrayOf(0, 1, 0, 0, 0),
                            intArrayOf(0, 1, 0, 1, 0),
                            intArrayOf(0, 0, 0, 1, 0),
                        ),
                    ),
                    1,
                ),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun findSafeWalk2() {
        assertThat<Boolean>(
            Solution()
                .findSafeWalk(
                    getLists(
                        arrayOf<IntArray>(
                            intArrayOf(0, 1, 1, 0, 0, 0),
                            intArrayOf(1, 0, 1, 0, 0, 0),
                            intArrayOf(0, 1, 1, 1, 0, 1),
                            intArrayOf(0, 0, 1, 0, 1, 0),
                        ),
                    ),
                    3,
                ),
            equalTo<Boolean>(false),
        )
    }

    @Test
    fun findSafeWalk3() {
        assertThat<Boolean>(
            Solution()
                .findSafeWalk(
                    getLists(
                        arrayOf(
                            intArrayOf(1, 1, 1),
                            intArrayOf(1, 0, 1),
                            intArrayOf(1, 1, 1),
                        ),
                    ),
                    5,
                ),
            equalTo<Boolean>(true),
        )
    }
}
