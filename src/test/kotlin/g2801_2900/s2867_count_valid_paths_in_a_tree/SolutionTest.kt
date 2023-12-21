package g2801_2900.s2867_count_valid_paths_in_a_tree

import com_github_leetcode.CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPaths() {
        assertThat(
            Solution()
                .countPaths(
                    5,
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,2],[1,3],[2,4],[2,5]"
                    )
                ),
            equalTo(4L)
        )
    }

    @Test
    fun countPaths2() {
        assertThat(
            Solution()
                .countPaths(
                    6,
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,2],[1,3],[2,4],[3,5],[3,6]"
                    )
                ),
            equalTo(6L)
        )
    }
}
