package g1201_1300.s1287_element_appearing_more_than_25_in_sorted_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findSpecialInteger() {
        assertThat(
            Solution().findSpecialInteger(intArrayOf(1, 2, 2, 6, 6, 6, 6, 7, 10)),
            equalTo(6),
        )
    }

    @Test
    fun findSpecialInteger2() {
        assertThat(Solution().findSpecialInteger(intArrayOf(1, 1)), equalTo(1))
    }
}
