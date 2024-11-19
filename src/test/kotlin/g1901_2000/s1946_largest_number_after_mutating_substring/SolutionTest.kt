package g1901_2000.s1946_largest_number_after_mutating_substring

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumNumber() {
        assertThat(
            Solution().maximumNumber("132", intArrayOf(9, 8, 5, 0, 3, 6, 4, 2, 6, 8)),
            equalTo("832"),
        )
    }

    @Test
    fun maximumNumber2() {
        assertThat(
            Solution().maximumNumber("021", intArrayOf(9, 4, 3, 5, 7, 2, 1, 9, 0, 6)),
            equalTo("934"),
        )
    }

    @Test
    fun maximumNumber3() {
        assertThat(
            Solution().maximumNumber("5", intArrayOf(1, 4, 7, 5, 3, 2, 5, 6, 9, 4)),
            equalTo("5"),
        )
    }
}
