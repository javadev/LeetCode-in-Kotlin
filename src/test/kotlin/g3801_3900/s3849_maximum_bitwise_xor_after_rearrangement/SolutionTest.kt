package g3801_3900.s3849_maximum_bitwise_xor_after_rearrangement

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumXor() {
        assertThat<String>(Solution().maximumXor("101", "011"), equalTo<String>("110"))
    }

    @Test
    fun maximumXor2() {
        assertThat<String>(Solution().maximumXor("0110", "1110"), equalTo<String>("1101"))
    }

    @Test
    fun maximumXor3() {
        assertThat<String>(Solution().maximumXor("0101", "1001"), equalTo<String>("1111"))
    }
}
