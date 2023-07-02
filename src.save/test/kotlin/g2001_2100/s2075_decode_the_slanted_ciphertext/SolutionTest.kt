package g2001_2100.s2075_decode_the_slanted_ciphertext

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun decodeCiphertext() {
        assertThat(Solution().decodeCiphertext("ch   ie   pr", 3), equalTo("cipher"))
    }

    @Test
    fun decodeCiphertext2() {
        assertThat(
            Solution().decodeCiphertext("iveo    eed   l te   olc", 4),
            equalTo("i love leetcode")
        )
    }

    @Test
    fun decodeCiphertext3() {
        assertThat(Solution().decodeCiphertext("coding", 1), equalTo("coding"))
    }
}
