package g1501_1600.s1585_check_if_string_is_transformable_with_substring_sort_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val isTransformable: Unit
        get() {
            assertThat(Solution().isTransformable("84532", "34852"), equalTo(true))
        }

    @get:Test
    val isTransformable2: Unit
        get() {
            assertThat(Solution().isTransformable("34521", "23415"), equalTo(true))
        }

    @get:Test
    val isTransformable3: Unit
        get() {
            assertThat(Solution().isTransformable("12345", "12435"), equalTo(false))
        }
}
