package g2401_2500.s2424_longest_uploaded_prefix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class LUPrefixTest {
    @Test
    fun luPrefix() {
        val luPrefix = LUPrefix(4)
        luPrefix.upload(3)
        assertThat(luPrefix.longest(), equalTo(0))
        luPrefix.upload(1)
        assertThat(luPrefix.longest(), equalTo(1))
        luPrefix.upload(2)
        assertThat(luPrefix.longest(), equalTo(3))
    }
}
