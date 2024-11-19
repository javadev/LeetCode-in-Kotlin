package g2101_2200.s2194_cells_in_a_range_on_an_excel_sheet

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun cellsInRange() {
        assertThat(
            Solution().cellsInRange("K1:L2"),
            equalTo(mutableListOf("K1", "K2", "L1", "L2")),
        )
    }

    @Test
    fun cellsInRange2() {
        assertThat(
            Solution().cellsInRange("A1:F1"),
            equalTo(mutableListOf("A1", "B1", "C1", "D1", "E1", "F1")),
        )
    }
}
