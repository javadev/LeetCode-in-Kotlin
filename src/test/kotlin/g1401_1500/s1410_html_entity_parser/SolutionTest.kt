package g1401_1500.s1410_html_entity_parser

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun entityParser() {
        assertThat(
            Solution().entityParser("&amp; is an HTML entity but &ambassador; is not."),
            equalTo("& is an HTML entity but &ambassador; is not.")
        )
    }

    @Test
    fun entityParser2() {
        assertThat(
            Solution().entityParser("and I quote: &quot;...&quot;"),
            equalTo("and I quote: \"...\"")
        )
    }

    @Test
    fun entityParser3() {
        assertThat(Solution().entityParser("&frasl;&apos;&gt;&lt;&lt"), equalTo("/'><&lt"))
    }
}
