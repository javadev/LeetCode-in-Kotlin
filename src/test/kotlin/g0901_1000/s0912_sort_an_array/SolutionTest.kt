package g0901_1000.s0912_sort_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sortArray() {
        assertThat(
            Solution().sortArray(intArrayOf(5, 2, 3, 1)),
            equalTo(intArrayOf(1, 2, 3, 5)),
        )
    }

    @Test
    fun sortArray2() {
        assertThat(
            Solution().sortArray(intArrayOf(5, 1, 1, 2, 0, 0)),
            equalTo(intArrayOf(0, 0, 1, 1, 2, 5)),
        )
    }
}
