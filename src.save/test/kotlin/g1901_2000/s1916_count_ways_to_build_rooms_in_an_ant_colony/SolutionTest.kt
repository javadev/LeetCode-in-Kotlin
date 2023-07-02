package g1901_2000.s1916_count_ways_to_build_rooms_in_an_ant_colony

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun waysToBuildRooms() {
        assertThat(Solution().waysToBuildRooms(intArrayOf(-1, 0, 1)), equalTo(1))
    }

    @Test
    fun waysToBuildRooms2() {
        assertThat(Solution().waysToBuildRooms(intArrayOf(-1, 0, 0, 1, 2)), equalTo(6))
    }
}
