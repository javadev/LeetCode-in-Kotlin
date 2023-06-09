package g1001_1100.s1096_brace_expansion_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun braceExpansionII() {
        assertThat(
            Solution().braceExpansionII("{a,b}{c,{d,e}}"),
            equalTo(listOf("ac", "ad", "ae", "bc", "bd", "be"))
        )
    }

    @Test
    fun braceExpansionII2() {
        assertThat(
            Solution().braceExpansionII("{{a,z},a{b,c},{ab,z}}"),
            equalTo(listOf("a", "ab", "ac", "z"))
        )
    }
}
