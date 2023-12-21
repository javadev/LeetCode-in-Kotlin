package g2801_2900.s2872_maximum_number_of_k_divisible_components

import com_github_leetcode.CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxKDivisibleComponents() {
        assertThat(
            Solution()
                .maxKDivisibleComponents(
                    5,
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,2],[1,2],[1,3],[2,4]"
                    ),
                    intArrayOf(1, 8, 1, 4, 4),
                    6
                ),
            equalTo(2)
        )
    }

    @Test
    fun maxKDivisibleComponents2() {
        assertThat(
            Solution()
                .maxKDivisibleComponents(
                    7,
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,1],[0,2],[1,3],[1,4],[2,5],[2,6]"
                    ),
                    intArrayOf(3, 0, 6, 1, 5, 2, 1),
                    3
                ),
            equalTo(3)
        )
    }
}
