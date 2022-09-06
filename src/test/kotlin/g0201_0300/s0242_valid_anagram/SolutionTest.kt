package g0201_0300.s0242_valid_anagram

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val isAnagram: Unit
        get() {
            assertThat(Solution().isAnagram("anagram", "nagaram"), equalTo(true))
        }

    @get:Test
    val isAnagram2: Unit
        get() {
            assertThat(Solution().isAnagram("rat", "car"), equalTo(false))
        }
}
