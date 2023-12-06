package g2801_2900.s2812_find_the_safest_path_in_a_grid

import com_github_leetcode.ArrayUtils.getLists
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

// #Medium #Array #Breadth_First_Search #Binary_Search #Matrix #Union_Find
internal class SolutionTest {
    @Test
    fun maximumSafenessFactor() {
        assertThat(
            Solution()
                .maximumSafenessFactor(
                    getLists(arrayOf(intArrayOf(1, 0, 0), intArrayOf(0, 0, 0), intArrayOf(0, 0, 1)))
                ),
            equalTo(0)
        )
    }

    @Test
    fun maximumSafenessFactor2() {
        assertThat(
            Solution()
                .maximumSafenessFactor(
                    getLists(arrayOf(intArrayOf(0, 0, 1), intArrayOf(0, 0, 0), intArrayOf(0, 0, 0)))
                ),
            equalTo(2)
        )
    }

    @Test
    fun maximumSafenessFactor3() {
        assertThat(
            Solution()
                .maximumSafenessFactor(
                    getLists(
                        arrayOf(
                            intArrayOf(0, 0, 0, 1),
                            intArrayOf(0, 0, 0, 0),
                            intArrayOf(0, 0, 0, 0),
                            intArrayOf(1, 0, 0, 0)
                        )
                    )
                ),
            equalTo(2)
        )
    }
}
