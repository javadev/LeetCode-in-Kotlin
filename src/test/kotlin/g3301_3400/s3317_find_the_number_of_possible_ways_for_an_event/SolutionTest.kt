package g3301_3400.s3317_find_the_number_of_possible_ways_for_an_event

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfWays() {
        assertThat<Int?>(Solution().numberOfWays(1, 2, 3), equalTo<Int?>(6))
    }

    @Test
    fun numberOfWays2() {
        assertThat<Int?>(Solution().numberOfWays(5, 2, 1), equalTo<Int?>(32))
    }

    @Test
    fun numberOfWays3() {
        assertThat<Int?>(Solution().numberOfWays(3, 3, 4), equalTo<Int?>(684))
    }
}
