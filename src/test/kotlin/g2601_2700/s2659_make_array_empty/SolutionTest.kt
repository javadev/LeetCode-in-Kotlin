package g2601_2700.s2659_make_array_empty

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countOperationsToEmptyArray() {
        assertThat(
            Solution().countOperationsToEmptyArray(intArrayOf(3, 4, -1)),
            equalTo(5)
        )
    }

    @Test
    fun countOperationsToEmptyArray2() {
        assertThat(
            Solution().countOperationsToEmptyArray(intArrayOf(1, 2, 4, 3)),
            equalTo(5)
        )
    }

    @Test
    fun countOperationsToEmptyArray3() {
        assertThat(
            Solution().countOperationsToEmptyArray(intArrayOf(1, 2, 3)),
            equalTo(3)
        )
    }
}
