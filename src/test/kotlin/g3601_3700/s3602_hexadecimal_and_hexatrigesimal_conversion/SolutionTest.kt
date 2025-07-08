package g3601_3700.s3602_hexadecimal_and_hexatrigesimal_conversion

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun concatHex36() {
        assertThat<String>(Solution().concatHex36(13), equalTo<String>("A91P1"))
    }

    @Test
    fun concatHex362() {
        assertThat<String>(Solution().concatHex36(36), equalTo<String>("5101000"))
    }
}
