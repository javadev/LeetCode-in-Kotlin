package g2301_2400.s2351_first_letter_to_appear_twice

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun repeatedCharacter() {
        assertThat(Solution().repeatedCharacter("abccbaacz"), equalTo('c'))
    }

    @Test
    fun repeatedCharacter2() {
        assertThat(Solution().repeatedCharacter("abcdd"), equalTo('d'))
    }

    @Test
    fun repeatedCharacter3() {
        assertThat(Solution().repeatedCharacter("abcd"), equalTo('0'))
    }
}
