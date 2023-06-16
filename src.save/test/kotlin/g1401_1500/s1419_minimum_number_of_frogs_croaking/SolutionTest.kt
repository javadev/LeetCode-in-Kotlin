package g1401_1500.s1419_minimum_number_of_frogs_croaking

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minNumberOfFrogs() {
        assertThat(Solution().minNumberOfFrogs("croakcroak"), equalTo(1))
    }

    @Test
    fun minNumberOfFrogs2() {
        assertThat(Solution().minNumberOfFrogs("crcoakroak"), equalTo(2))
    }

    @Test
    fun minNumberOfFrogs3() {
        assertThat(Solution().minNumberOfFrogs("croakcrook"), equalTo(-1))
    }
}
