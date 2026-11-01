package g3901_4000.s3922_minimum_flips_to_make_binary_string_coherent

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minFlips() {
        assertThat<Int>(Solution().minFlips("1010"), equalTo<Int>(1))
    }

    @Test
    fun minFlips2() {
        assertThat<Int>(Solution().minFlips("0110"), equalTo<Int>(1))
    }

    @Test
    fun minFlips3() {
        assertThat<Int>(Solution().minFlips("1000"), equalTo<Int>(0))
    }

    @Test
    fun minFlips4() {
        assertThat<Int>(Solution().minFlips("0"), equalTo<Int>(0))
    }

    @Test
    fun minFlips5() {
        assertThat<Int>(Solution().minFlips("1111"), equalTo<Int>(0))
    }

    @Test
    fun minFlips6() {
        assertThat<Int>(Solution().minFlips("0000"), equalTo<Int>(0))
    }

    @Test
    fun minFlips7() {
        assertThat<Int>(Solution().minFlips("10001"), equalTo<Int>(0))
    }

    @Test
    fun minFlips8() {
        assertThat<Int>(Solution().minFlips("01010"), equalTo<Int>(1))
    }

    @Test
    fun minFlips9() {
        assertThat<Int>(Solution().minFlips("011110"), equalTo<Int>(2))
    }
}
