package g0301_0400.s0331_verify_preorder_serialization_of_a_binary_tree

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minPatches() {
        assertThat(Solution().isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"), equalTo(true))
    }

    @Test
    fun minPatches2() {
        assertThat(Solution().isValidSerialization("1,#"), equalTo(false))
    }

    @Test
    fun minPatches3() {
        assertThat(Solution().isValidSerialization("9,#,#,1"), equalTo(false))
    }
}
