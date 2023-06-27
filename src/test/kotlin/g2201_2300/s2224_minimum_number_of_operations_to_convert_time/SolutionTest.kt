package g2201_2300.s2224_minimum_number_of_operations_to_convert_time

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun convertTime() {
        assertThat(Solution().convertTime("02:30", "04:35"), equalTo(3))
    }

    @Test
    fun convertTime2() {
        assertThat(Solution().convertTime("11:00", "11:01"), equalTo(1))
    }
}
