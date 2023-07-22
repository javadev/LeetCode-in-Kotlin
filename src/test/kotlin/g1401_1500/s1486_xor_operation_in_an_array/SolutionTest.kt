package g1401_1500.s1486_xor_operation_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun xorOperation() {
        assertThat(Solution().xorOperation(5, 0), equalTo(8))
    }

    @Test
    fun xorOperation2() {
        assertThat(Solution().xorOperation(4, 3), equalTo(8))
    }
}
