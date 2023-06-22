package g2001_2100.s2007_find_original_array_from_doubled_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findOriginalArray() {
        assertThat(
            Solution().findOriginalArray(intArrayOf(1, 3, 4, 2, 6, 8)),
            equalTo(intArrayOf(1, 3, 4))
        )
    }

    @Test
    fun findOriginalArray2() {
        assertThat(
            Solution().findOriginalArray(intArrayOf(6, 3, 0, 1)),
            equalTo(intArrayOf())
        )
    }

    @Test
    fun findOriginalArray3() {
        assertThat(Solution().findOriginalArray(intArrayOf(1)), equalTo(intArrayOf()))
    }
}
