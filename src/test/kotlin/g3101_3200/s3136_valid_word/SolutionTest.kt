package g3101_3200.s3136_valid_word

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isValid() {
        assertThat(Solution().isValid("234Adas"), equalTo(true))
    }

    @Test
    fun isValid2() {
        assertThat(Solution().isValid("b3"), equalTo(false))
    }

    @Test
    fun isValid3() {
        assertThat(Solution().isValid("a3\$e"), equalTo(false))
    }

    @Test
    fun isValid4() {
        assertThat(Solution().isValid("a"), equalTo(false))
        assertThat(Solution().isValid("ab"), equalTo(false))
        assertThat(Solution().isValid("1"), equalTo(false))
        assertThat(Solution().isValid("1a"), equalTo(false))
        assertThat(Solution().isValid(""), equalTo(false))
    }

    @Test
    fun isValid5() {
        assertThat(Solution().isValid("aei"), equalTo(false))
        assertThat(Solution().isValid("AEI"), equalTo(false))
        assertThat(Solution().isValid("Aei"), equalTo(false))
        assertThat(Solution().isValid("uuu"), equalTo(false))
    }

    @Test
    fun isValid6() {
        assertThat(Solution().isValid("bcdfg"), equalTo(false))
        assertThat(Solution().isValid("BCD"), equalTo(false))
        assertThat(Solution().isValid("xyz"), equalTo(false))
        assertThat(Solution().isValid("QWRTY"), equalTo(false))
    }

    @Test
    fun isValid7() {
        assertThat(Solution().isValid("abc"), equalTo(true))
        assertThat(Solution().isValid("bac"), equalTo(true))
        assertThat(Solution().isValid("AeIbcD"), equalTo(true))
        assertThat(Solution().isValid("tree"), equalTo(true))
        assertThat(Solution().isValid("skyE"), equalTo(true))
    }

    @Test
    fun isValid8() {
        assertThat(Solution().isValid("a1b2c"), equalTo(true))
        assertThat(Solution().isValid("1a2b"), equalTo(true))
        assertThat(Solution().isValid("b2c4e"), equalTo(true))
        assertThat(Solution().isValid("123"), equalTo(false))
    }

    @Test
    fun isValid10() {
        assertThat(Solution().isValid("a#b"), equalTo(false))
        assertThat(Solution().isValid("@ab"), equalTo(false))
        assertThat(Solution().isValid("ab!"), equalTo(false))
        assertThat(Solution().isValid("c_d"), equalTo(false))
        assertThat(Solution().isValid("a.b"), equalTo(false))
        assertThat(Solution().isValid("abc "), equalTo(false))
    }

    @Test
    fun isValid11() {
        assertThat(Solution().isValid("AbC"), equalTo(true))
        assertThat(Solution().isValid("BacE1"), equalTo(true))
        assertThat(Solution().isValid("zEi"), equalTo(true))
    }

    @Test
    fun isValid12() {
        assertThat(Solution().isValid("a1b"), equalTo(true))
        assertThat(Solution().isValid("ab1"), equalTo(true))
        assertThat(Solution().isValid("1ab"), equalTo(true))
        assertThat(Solution().isValid("1a"), equalTo(false))
        assertThat(Solution().isValid("1b"), equalTo(false))
    }
}
