package g2401_2500.s2477_minimum_fuel_cost_to_report_to_the_capital

import com_github_leetcode.CommonUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumFuelCost() {
        assertThat(
            Solution()
                .minimumFuelCost(
                    CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,1],[0,2],[0,3]"
                    ),
                    5
                ),
            equalTo(3L)
        )
    }

    @Test
    fun minimumFuelCost2() {
        assertThat(
            Solution()
                .minimumFuelCost(
                    CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[3,1],[3,2],[1,0],[0,4],[0,5],[4,6]"
                    ),
                    2
                ),
            equalTo(7L)
        )
    }

    @Test
    fun minimumFuelCost3() {
        assertThat(Solution().minimumFuelCost(arrayOf(), 1), equalTo(0L))
    }
}
