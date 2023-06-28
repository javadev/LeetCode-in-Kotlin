package g2201_2300.s2262_total_appeal_of_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun appealSum() {
        assertThat(Solution().appealSum("abbca"), equalTo(28L))
    }

    @Test
    fun appealSum2() {
        assertThat(Solution().appealSum("code"), equalTo(20L))
    }
}
