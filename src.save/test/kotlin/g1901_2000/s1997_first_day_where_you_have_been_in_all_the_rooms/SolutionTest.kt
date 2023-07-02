package g1901_2000.s1997_first_day_where_you_have_been_in_all_the_rooms

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun firstDayBeenInAllRooms() {
        assertThat(Solution().firstDayBeenInAllRooms(intArrayOf(0, 0)), equalTo(2))
    }

    @Test
    fun firstDayBeenInAllRooms2() {
        assertThat(Solution().firstDayBeenInAllRooms(intArrayOf(0, 0, 2)), equalTo(6))
    }

    @Test
    fun firstDayBeenInAllRooms3() {
        assertThat(Solution().firstDayBeenInAllRooms(intArrayOf(0, 1, 2, 0)), equalTo(6))
    }
}
