package g2901_3000.s2973_find_number_of_coins_to_place_in_tree_nodes

import com_github_leetcode.CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun placedCoins() {
        assertThat(
            Solution()
                .placedCoins(
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,1],[0,2],[0,3],[0,4],[0,5]"
                    ),
                    intArrayOf(1, 2, 3, 4, 5, 6)
                ),
            equalTo(longArrayOf(120, 1, 1, 1, 1, 1))
        )
    }

    @Test
    fun placedCoins2() {
        assertThat(
            Solution()
                .placedCoins(
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,1],[0,2],[1,3],[1,4],[1,5],[2,6],[2,7],[2,8]"
                    ),
                    intArrayOf(1, 4, 2, 3, 5, 7, 8, -4, 2)
                ),
            equalTo(longArrayOf(280, 140, 32, 1, 1, 1, 1, 1, 1))
        )
    }

    @Test
    fun placedCoins3() {
        assertThat(
            Solution()
                .placedCoins(
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,1],[0,2]"
                    ),
                    intArrayOf(1, 2, -2)
                ),
            equalTo(longArrayOf(0, 1, 1))
        )
    }
}
