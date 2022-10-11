package g0101_0200.s0168_excel_sheet_column_title

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun convertToTitle() {
        assertThat(Solution().convertToTitle(1), equalTo("A"))
    }

    @Test
    fun convertToTitle2() {
        assertThat(Solution().convertToTitle(28), equalTo("AB"))
    }

    @Test
    fun convertToTitle3() {
        assertThat(Solution().convertToTitle(701), equalTo("ZY"))
    }
}
