package g0901_1000.s0922_sort_array_by_parity_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sortArrayByParityII() {
        assertThat(
            Solution().sortArrayByParityII(intArrayOf(4, 2, 5, 7)),
            equalTo(intArrayOf(4, 5, 2, 7)),
        )
    }

    @Test
    fun sortArrayByParityII2() {
        assertThat(Solution().sortArrayByParityII(intArrayOf(2, 3)), equalTo(intArrayOf(2, 3)))
    }
}
