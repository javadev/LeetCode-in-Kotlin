package g2401_2500.s2493_divide_nodes_into_the_maximum_number_of_groups

import com_github_leetcode.CommonUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun magnificentSets() {
        assertThat(
            Solution()
                .magnificentSets(
                    6,
                    CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,2],[1,4],[1,5],[2,6],[2,3],[4,6]",
                    ),
                ),
            equalTo(4),
        )
    }

    @Test
    fun magnificentSets2() {
        assertThat(
            Solution()
                .magnificentSets(
                    3,
                    CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,2],[2,3],[3,1]",
                    ),
                ),
            equalTo(-1),
        )
    }
}
