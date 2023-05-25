package g0801_0900.s0894_all_possible_full_binary_trees

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun allPossibleFBT() {
        assertThat(
            Solution().allPossibleFBT(7).toString(),
            equalTo(
                "[0,0,0,0,0,0,0, 0,0,0,0,0,0,0, 0,0,0,0,0,0,0, 0,0,0,0,0,0,0, 0,0,0,0,0,0,0]"
            )
        )
    }

    @Test
    fun allPossibleFBT2() {
        assertThat(Solution().allPossibleFBT(3).toString(), equalTo("[0,0,0]"))
    }
}
