package g2301_2400.s2390_removing_stars_from_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeStars() {
        assertThat(Solution().removeStars("leet**cod*e"), equalTo("lecoe"))
    }

    @Test
    fun removeStars2() {
        assertThat(Solution().removeStars("erase*****"), equalTo(""))
    }
}
