package g0201_0300.s0205_isomorphic_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isIsomorphic() {
        assertThat(Solution().isIsomorphic("egg", "add"), equalTo(true))
    }

    @Test
    fun isIsomorphic2() {
        assertThat(Solution().isIsomorphic("foo", "bar"), equalTo(false))
    }

    @Test
    fun isIsomorphic3() {
        assertThat(Solution().isIsomorphic("paper", "title"), equalTo(true))
    }
}
