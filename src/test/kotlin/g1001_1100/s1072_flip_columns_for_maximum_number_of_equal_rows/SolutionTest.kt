package g1001_1100.s1072_flip_columns_for_maximum_number_of_equal_rows

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxEqualRowsAfterFlips() {
        assertThat(Solution().maxEqualRowsAfterFlips(arrayOf(intArrayOf(0, 1), intArrayOf(1, 1))), equalTo(1))
    }

    @Test
    fun maxEqualRowsAfterFlips2() {
        assertThat(Solution().maxEqualRowsAfterFlips(arrayOf(intArrayOf(0, 1), intArrayOf(1, 0))), equalTo(2))
    }

    @Test
    fun maxEqualRowsAfterFlips3() {
        assertThat(
            Solution()
                .maxEqualRowsAfterFlips(arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 0, 1), intArrayOf(1, 1, 0))),
            equalTo(2),
        )
    }
}
