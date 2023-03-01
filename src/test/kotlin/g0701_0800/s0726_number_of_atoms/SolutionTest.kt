package g0701_0800.s0726_number_of_atoms

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countOfAtoms() {
        assertThat(Solution().countOfAtoms("H2O"), equalTo("H2O"))
    }

    @Test
    fun countOfAtoms2() {
        assertThat(Solution().countOfAtoms("Mg(OH)2"), equalTo("H2MgO2"))
    }

    @Test
    fun countOfAtoms3() {
        assertThat(Solution().countOfAtoms("K4(ON(SO3)2)2"), equalTo("K4N2O14S4"))
    }
}
