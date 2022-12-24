package g0401_0500.s0448_find_all_numbers_disappeared_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.Arrays

internal class SolutionTest {
    @Test
    fun findDisappearedNumbers() {
        assertThat(
            Solution().findDisappearedNumbers(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)),
            equalTo(Arrays.asList(5, 6))
        )
    }

    @Test
    fun findDisappearedNumbers2() {
        assertThat(
            Solution().findDisappearedNumbers(intArrayOf(1, 1)), equalTo(Arrays.asList(2))
        )
    }
}
