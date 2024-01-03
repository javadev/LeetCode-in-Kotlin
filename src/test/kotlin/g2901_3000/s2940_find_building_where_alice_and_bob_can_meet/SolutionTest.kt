package g2901_3000.s2940_find_building_where_alice_and_bob_can_meet

import com_github_leetcode.CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun leftmostBuildingQueries() {
        assertThat(
            Solution()
                .leftmostBuildingQueries(
                    intArrayOf(6, 4, 8, 5, 2, 7),
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,1],[0,3],[2,4],[3,4],[2,2]"
                    )
                ),
            equalTo(intArrayOf(2, 5, -1, 5, 2))
        )
    }

    @Test
    fun leftmostBuildingQueries2() {
        assertThat(
            Solution()
                .leftmostBuildingQueries(
                    intArrayOf(5, 3, 8, 2, 6, 1, 4, 6),
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,7],[3,5],[5,2],[3,0],[1,6]"
                    )
                ),
            equalTo(intArrayOf(7, 6, -1, 4, 6))
        )
    }
}
