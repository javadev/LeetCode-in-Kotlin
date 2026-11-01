package g3901_4000.s3941_password_strength

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun passwordStrength() {
        assertThat<Int>(Solution().passwordStrength("aA1!"), equalTo<Int>(11))
    }

    @Test
    fun passwordStrength2() {
        assertThat<Int>(Solution().passwordStrength("bbB11#"), equalTo<Int>(11))
    }

    @Test
    fun passwordStrength3() {
        assertThat<Int>(Solution().passwordStrength("aaaa"), equalTo<Int>(1))
    }

    @Test
    fun passwordStrength4() {
        assertThat<Int>(Solution().passwordStrength("ZZZ"), equalTo<Int>(2))
    }

    @Test
    fun passwordStrength5() {
        assertThat<Int>(Solution().passwordStrength("000"), equalTo<Int>(3))
    }

    @Test
    fun passwordStrength6() {
        assertThat<Int>(Solution().passwordStrength("!@#$!"), equalTo<Int>(20))
    }

    @Test
    fun passwordStrength7() {
        assertThat<Int>(
            Solution()
                .passwordStrength(
                    "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$",
                ),
            equalTo<Int>(128),
        )
    }
}
