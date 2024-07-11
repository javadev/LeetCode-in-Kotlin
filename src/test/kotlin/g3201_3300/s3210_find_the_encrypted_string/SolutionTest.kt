package g3201_3300.s3210_find_the_encrypted_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun encryptedString() {
        assertThat(Solution().getEncryptedString("dart", 3), equalTo("tdar"))
    }

    @Test
    fun encryptedString2() {
        assertThat(Solution().getEncryptedString("aaa", 1), equalTo("aaa"))
    }
}
