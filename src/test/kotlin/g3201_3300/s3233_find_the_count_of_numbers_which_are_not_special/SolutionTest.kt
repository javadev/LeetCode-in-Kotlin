package g3201_3300.s3233_find_the_count_of_numbers_which_are_not_special

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun nonSpecialCount() {
        assertThat(Solution().nonSpecialCount(5, 7), equalTo(3))
    }

    @Test
    fun nonSpecialCount2() {
        assertThat(Solution().nonSpecialCount(4, 16), equalTo(11))
    }
}
