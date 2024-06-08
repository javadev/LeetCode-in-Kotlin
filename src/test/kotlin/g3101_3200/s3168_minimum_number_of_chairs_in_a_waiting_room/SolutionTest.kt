package g3101_3200.s3168_minimum_number_of_chairs_in_a_waiting_room

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumChairs() {
        assertThat(Solution().minimumChairs("EEEEEEE"), equalTo(7))
    }

    @Test
    fun minimumChairs2() {
        assertThat(Solution().minimumChairs("ELELEEL"), equalTo(2))
    }

    @Test
    fun minimumChairs3() {
        assertThat(Solution().minimumChairs("ELEELEELLL"), equalTo(3))
    }
}
