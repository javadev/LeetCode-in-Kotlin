package g1301_1400.s1320_minimum_distance_to_type_a_word_using_two_fingers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumDistance() {
        assertThat(Solution().minimumDistance("CAKE"), equalTo(3))
    }

    @Test
    fun minimumDistance2() {
        assertThat(Solution().minimumDistance("HAPPY"), equalTo(6))
    }
}
