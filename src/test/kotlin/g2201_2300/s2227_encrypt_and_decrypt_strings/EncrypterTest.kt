package g2201_2300.s2227_encrypt_and_decrypt_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class EncrypterTest {
    @Test
    fun encrypterTest() {
        val encrypter = Encrypter(
            charArrayOf('a', 'b', 'c', 'd'),
            arrayOf("ei", "zf", "ei", "am"),
            arrayOf(
                "abcd",
                "acbd",
                "adbc",
                "badc",
                "dacb",
                "cadb",
                "cbda",
                "abad",
            ),
        )
        assertThat(encrypter.encrypt("abcd"), equalTo("eizfeiam"))
        assertThat(encrypter.decrypt("eizfeiam"), equalTo(2))
    }
}
