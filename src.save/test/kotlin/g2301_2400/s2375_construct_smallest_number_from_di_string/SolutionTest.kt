package g2301_2400.s2375_construct_smallest_number_from_di_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestNumber() {
        assertThat(Solution().smallestNumber("IIIDIDDD"), equalTo("123549876"))
    }

    @Test
    fun smallestNumber2() {
        assertThat(Solution().smallestNumber("DDD"), equalTo("4321"))
    }
}
