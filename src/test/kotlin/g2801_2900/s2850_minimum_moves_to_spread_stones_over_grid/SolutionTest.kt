package g2801_2900.s2850_minimum_moves_to_spread_stones_over_grid

import com_github_leetcode.CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumMoves() {
        assertThat(
            Solution()
                .minimumMoves(
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,1,0],[1,1,1],[1,2,1]"
                    )
                ),
            equalTo(3)
        )
    }

    @Test
    fun minimumMoves2() {
        assertThat(
            Solution()
                .minimumMoves(
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,3,0],[1,0,0],[1,0,3]"
                    )
                ),
            equalTo(4)
        )
    }
}
