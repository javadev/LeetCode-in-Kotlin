package g2201_2300.s2299_strong_password_checker_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun strongPasswordCheckerII() {
        assertThat(Solution().strongPasswordCheckerII("IloveLe3tcode!"), equalTo(true))
    }

    @Test
    fun strongPasswordCheckerII2() {
        assertThat(Solution().strongPasswordCheckerII("Me+You--IsMyDream"), equalTo(false))
    }

    @Test
    fun strongPasswordCheckerII3() {
        assertThat(Solution().strongPasswordCheckerII("1aB!"), equalTo(false))
    }

    @Test
    fun strongPasswordCheckerII4() {
        assertThat(
            Solution()
                .strongPasswordCheckerII(
                    "ecuwcfoyajkolntovfniplayrxhzpmhrkhzonopcwxgupzhoupw"
                ),
            equalTo(false)
        )
    }

    @Test
    fun strongPasswordCheckerII5() {
        assertThat(Solution().strongPasswordCheckerII("\"|{}\"|{}"), equalTo(false))
    }
}
