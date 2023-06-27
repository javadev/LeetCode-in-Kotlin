package g0701_0800.s0779_k_th_symbol_in_grammar

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kthGrammar() {
        assertThat(Solution().kthGrammar(1, 1), equalTo(0))
    }

    @Test
    fun kthGrammar2() {
        assertThat(Solution().kthGrammar(2, 1), equalTo(0))
    }

    @Test
    fun kthGrammar3() {
        assertThat(Solution().kthGrammar(2, 2), equalTo(1))
    }
}
