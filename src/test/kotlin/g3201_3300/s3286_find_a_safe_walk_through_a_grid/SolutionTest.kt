package g3201_3300.s3286_find_a_safe_walk_through_a_grid

import com_github_leetcode.ArrayUtils.getLists
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findSafeWalk() {
        MatcherAssert.assertThat<Boolean?>(
            Solution()
                .findSafeWalk(
                    getLists(
                        arrayOf<IntArray>(
                            intArrayOf(0, 1, 0, 0, 0), intArrayOf(0, 1, 0, 1, 0), intArrayOf(0, 0, 0, 1, 0)
                        )
                    ),
                    1
                ),
            CoreMatchers.equalTo<Boolean?>(true)
        )
    }

    @Test
    fun findSafeWalk2() {
        MatcherAssert.assertThat<Boolean?>(
            Solution()
                .findSafeWalk(
                    getLists(
                        arrayOf<IntArray>(
                            intArrayOf(0, 1, 1, 0, 0, 0),
                            intArrayOf(1, 0, 1, 0, 0, 0),
                            intArrayOf(0, 1, 1, 1, 0, 1),
                            intArrayOf(0, 0, 1, 0, 1, 0)
                        )
                    ),
                    3
                ),
            CoreMatchers.equalTo<Boolean?>(false)
        )
    }

    @Test
    fun findSafeWalk3() {
        MatcherAssert.assertThat<Boolean?>(
            Solution()
                .findSafeWalk(
                    getLists(
                        arrayOf(
                            intArrayOf(1, 1, 1),
                            intArrayOf(1, 0, 1),
                            intArrayOf(1, 1, 1)
                        )
                    ),
                    5
                ),
            CoreMatchers.equalTo<Boolean?>(true)
        )
    }
}
