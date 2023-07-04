package g2401_2500.s2492_minimum_score_of_a_path_between_two_cities

import com_github_leetcode.CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minScore() {
        assertThat(
            Solution()
                .minScore(
                    4,
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,2,9],[2,3,6],[2,4,5],[1,4,7]"
                    )
                ),
            equalTo(5)
        )
    }

    @Test
    fun minScore2() {
        assertThat(
            Solution()
                .minScore(
                    4,
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,2,2],[1,3,4],[3,4,7]"
                    )
                ),
            equalTo(2)
        )
    }
}
