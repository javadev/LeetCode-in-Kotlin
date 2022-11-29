package g0101_0200.s0171_excel_sheet_column_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun titleToNumber() {
        assertThat(Solution().titleToNumber("A"), equalTo(1))
    }

    @Test
    fun titleToNumber2() {
        assertThat(Solution().titleToNumber("AB"), equalTo(28))
    }

    @Test
    fun titleToNumber3() {
        assertThat(Solution().titleToNumber("ZY"), equalTo(701))
    }
}
