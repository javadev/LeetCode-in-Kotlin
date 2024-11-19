package g0501_0600.s0591_tag_validator

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isValid() {
        assertThat(
            Solution().isValid("<DIV>This is the first line <![CDATA[<div>]]></DIV>"),
            equalTo(true),
        )
    }

    @Test
    fun isValid2() {
        assertThat(
            Solution()
                .isValid(
                    "<ABCDEFGHIJKLMN>This is the first line <![CDATA[<div>]]></ABCDEFGHIJKLMN>",
                ),
            equalTo(false),
        )
    }
}
