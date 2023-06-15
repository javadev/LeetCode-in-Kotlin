package g1701_1800.s1737_change_minimum_characters_to_satisfy_one_of_three_conditions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCharacters() {
        assertThat(Solution().minCharacters("aba", "caa"), equalTo(2))
    }

    @Test
    fun minCharacters2() {
        assertThat(Solution().minCharacters("dabadd", "cda"), equalTo(3))
    }
}
