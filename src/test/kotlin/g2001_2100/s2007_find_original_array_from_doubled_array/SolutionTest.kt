package g2001_2100.s2007_find_original_array_from_doubled_array

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findOriginalArray() {
        MatcherAssert.assertThat(
            Solution().findOriginalArray(intArrayOf(1, 3, 4, 2, 6, 8)),
            CoreMatchers.equalTo(intArrayOf(1, 3, 4))
        )
    }

    @Test
    fun findOriginalArray2() {
        MatcherAssert.assertThat(
            Solution().findOriginalArray(intArrayOf(6, 3, 0, 1)),
            CoreMatchers.equalTo(intArrayOf())
        )
    }

    @Test
    fun findOriginalArray3() {
        MatcherAssert.assertThat(Solution().findOriginalArray(intArrayOf(1)), CoreMatchers.equalTo(intArrayOf()))
    }
}
