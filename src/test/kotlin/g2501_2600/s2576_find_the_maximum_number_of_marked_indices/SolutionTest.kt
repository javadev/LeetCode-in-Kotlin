package g2501_2600.s2576_find_the_maximum_number_of_marked_indices

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxNumOfMarkedIndices() {
        assertThat(
            Solution().maxNumOfMarkedIndices(intArrayOf(3, 5, 2, 4)),
            equalTo(2),
        )
    }

    @Test
    fun maxNumOfMarkedIndices2() {
        assertThat(
            Solution().maxNumOfMarkedIndices(intArrayOf(9, 2, 5, 4)),
            equalTo(4),
        )
    }

    @Test
    fun maxNumOfMarkedIndices3() {
        assertThat(
            Solution().maxNumOfMarkedIndices(intArrayOf(7, 6, 8)),
            equalTo(0),
        )
    }
}
