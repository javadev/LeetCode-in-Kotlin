package g0601_0700.s0690_employee_importance

import com_github_leetcode.Employee
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun getImportance() {
        val employees = listOf(
            Employee(1, 5, listOf(2, 3)),
            Employee(2, 3, listOf()),
            Employee(3, 3, listOf()),
        )
        assertThat(Solution().getImportance(employees, 1), equalTo(11))
    }

    @Test
    fun getImportance2() {
        val employees = listOf(
            Employee(1, 5, listOf(2, 3)),
            Employee(2, 3, listOf(4)),
            Employee(3, 4, listOf()),
            Employee(4, 1, listOf()),
        )
        assertThat(Solution().getImportance(employees, 1), equalTo(13))
    }
}
