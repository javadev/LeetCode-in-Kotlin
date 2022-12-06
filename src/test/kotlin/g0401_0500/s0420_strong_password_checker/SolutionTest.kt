package g0401_0500.s0420_strong_password_checker

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun strongPasswordChecker() {
        assertThat(Solution().strongPasswordChecker("a"), equalTo(5))
    }

    @Test
    fun strongPasswordChecker2() {
        assertThat(Solution().strongPasswordChecker("aA1"), equalTo(3))
    }

    @Test
    fun strongPasswordChecker3() {
        assertThat(Solution().strongPasswordChecker("1337C0d3"), equalTo(0))
    }

    @Test
    fun strongPasswordChecker4() {
        assertThat(Solution().strongPasswordChecker("aaa"), equalTo(3))
    }

    @Test
    fun strongPasswordChecker5() {
        assertThat(Solution().strongPasswordChecker("aaa1"), equalTo(2))
    }
}
