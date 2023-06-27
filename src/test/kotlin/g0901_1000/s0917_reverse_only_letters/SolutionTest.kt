package g0901_1000.s0917_reverse_only_letters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reverseOnlyLetters() {
        assertThat(Solution().reverseOnlyLetters("ab-cd"), equalTo("dc-ba"))
    }

    @Test
    fun reverseOnlyLetters2() {
        assertThat(Solution().reverseOnlyLetters("a-bC-dEf-ghIj"), equalTo("j-Ih-gfE-dCba"))
    }

    @Test
    fun reverseOnlyLetters3() {
        assertThat(
            Solution().reverseOnlyLetters("Test1ng-Leet=code-Q!"),
            equalTo("Qedo1ct-eeLg=ntse-T!")
        )
    }
}
