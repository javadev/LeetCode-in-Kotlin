package g1901_2000.s1974_minimum_time_to_type_word_using_special_typewriter

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minTimeToType() {
        assertThat(Solution().minTimeToType("abc"), equalTo(5))
    }

    @Test
    fun minTimeToType2() {
        assertThat(Solution().minTimeToType("bza"), equalTo(7))
    }

    @Test
    fun minTimeToType3() {
        assertThat(Solution().minTimeToType("zjpc"), equalTo(34))
    }
}
