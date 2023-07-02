package g1901_2000.s1909_remove_one_element_to_make_the_array_strictly_increasing

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canBeIncreasing() {
        assertThat(Solution().canBeIncreasing(intArrayOf(1, 2, 10, 5, 7)), equalTo(true))
    }

    @Test
    fun canBeIncreasing2() {
        assertThat(Solution().canBeIncreasing(intArrayOf(2, 3, 1, 2)), equalTo(false))
    }

    @Test
    fun canBeIncreasing3() {
        assertThat(Solution().canBeIncreasing(intArrayOf(1, 1, 1)), equalTo(false))
    }
}
