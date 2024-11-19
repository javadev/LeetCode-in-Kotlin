package g2901_3000.s2923_find_champion_i

import com_github_leetcode.CommonUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findChampion() {
        assertThat(
            Solution()
                .findChampion(
                    CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,1],[0,0]",
                    ),
                ),
            equalTo(0),
        )
    }

    @Test
    fun findChampion2() {
        assertThat(
            Solution()
                .findChampion(
                    CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,0,1],[1,0,1],[0,0,0]",
                    ),
                ),
            equalTo(1),
        )
    }

    @Test
    fun findChampion3() {
        assertThat(
            Solution()
                .findChampion(
                    CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,0,0],[1,0,0],[1,1,0]",
                    ),
                ),
            equalTo(2),
        )
    }
}
