package g0201_0300.s0205_isomorphic_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val isIsomorphic: Unit
        get() {
            assertThat(Solution().isIsomorphic("egg", "add"), equalTo(true))
        }

    @get:Test
    val isIsomorphic2: Unit
        get() {
            assertThat(Solution().isIsomorphic("foo", "bar"), equalTo(false))
        }

    @get:Test
    val isIsomorphic3: Unit
        get() {
            assertThat(Solution().isIsomorphic("paper", "title"), equalTo(true))
        }
}
