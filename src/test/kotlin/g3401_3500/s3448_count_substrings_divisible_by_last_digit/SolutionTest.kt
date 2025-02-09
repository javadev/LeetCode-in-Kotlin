package g3401_3500.s3448_count_substrings_divisible_by_last_digit

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSubstrings() {
        assertThat<Long>(Solution().countSubstrings("12936"), equalTo<Long>(11L))
    }

    @Test
    fun countSubstrings2() {
        assertThat<Long>(Solution().countSubstrings("5701283"), equalTo<Long>(18L))
    }

    @Test
    fun countSubstrings3() {
        assertThat<Long>(Solution().countSubstrings("1010101010"), equalTo<Long>(25L))
    }

    @Test
    fun countSubstrings4() {
        assertThat<Long>(Solution().countSubstrings("4"), equalTo<Long>(1L))
    }

    @Test
    fun countSubstrings5() {
        assertThat<Long>(Solution().countSubstrings("28"), equalTo<Long>(2L))
    }

    @Test
    fun countSubstrings6() {
        assertThat<Long>(Solution().countSubstrings("04"), equalTo<Long>(2L))
    }

    @Test
    fun countSubstrings7() {
        assertThat<Long>(Solution().countSubstrings("8"), equalTo<Long>(1L))
    }
}
