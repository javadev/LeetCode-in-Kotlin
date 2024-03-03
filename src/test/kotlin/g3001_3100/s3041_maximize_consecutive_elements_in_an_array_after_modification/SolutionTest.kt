package g3001_3100.s3041_maximize_consecutive_elements_in_an_array_after_modification

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSelectedElements() {
        assertThat(Solution().maxSelectedElements(intArrayOf(2, 1, 5, 1, 1)), equalTo(3))
    }

    @Test
    fun maxSelectedElements2() {
        assertThat(Solution().maxSelectedElements(intArrayOf(1, 4, 7, 10)), equalTo(1))
    }
}
