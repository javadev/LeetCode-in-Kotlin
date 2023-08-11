package g2101_2200.s2150_find_all_lonely_numbers_in_the_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findLonely() {
        assertThat(
            Solution().findLonely(intArrayOf(10, 6, 5, 8)), equalTo(mutableListOf(10, 8))
        )
    }

    @Test
    fun findLonely2() {
        assertThat(
            Solution().findLonely(intArrayOf(1, 3, 5, 3)),
            equalTo(mutableListOf(1, 5))
        )
    }
}
