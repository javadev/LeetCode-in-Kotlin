package g1901_2000.s1968_array_with_elements_not_equal_to_average_of_neighbors

import com_github_leetcode.CommonUtils.compareArray
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rearrangeArray() {
        assertThat(
            compareArray(
                Solution().rearrangeArray(intArrayOf(1, 2, 3, 4, 5)), intArrayOf(1, 2, 4, 5, 3)
            ),
            equalTo(true)
        )
    }

    @Test
    fun rearrangeArray2() {
        assertThat(
            compareArray(
                Solution().rearrangeArray(intArrayOf(6, 2, 0, 9, 7)), intArrayOf(6, 2, 0, 9, 7)
            ),
            equalTo(true)
        )
    }
}
