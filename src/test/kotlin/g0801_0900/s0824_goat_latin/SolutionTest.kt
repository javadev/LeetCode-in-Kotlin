package g0801_0900.s0824_goat_latin

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun toGoatLatin() {
        assertThat(
            Solution().toGoatLatin("I speak Goat Latin"),
            equalTo("Imaa peaksmaaa oatGmaaaa atinLmaaaaa")
        )
    }

    @Test
    fun toGoatLatin2() {
        assertThat(
            Solution().toGoatLatin("The quick brown fox jumped over the lazy dog"),
            equalTo(
                "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa " +
                    "overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
            )
        )
    }
}
