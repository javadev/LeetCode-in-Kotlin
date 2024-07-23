package g3201_3300.s3228_maximum_number_of_operations_to_move_ones_to_the_end

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxOperations() {
        assertThat(Solution().maxOperations("1001101"), equalTo(4))
    }

    @Test
    fun maxOperations2() {
        assertThat(Solution().maxOperations("00111"), equalTo(0))
    }
}
