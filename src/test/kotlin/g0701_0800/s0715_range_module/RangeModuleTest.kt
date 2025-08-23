package g0701_0800.s0715_range_module

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class RangeModuleTest {
    @Test
    fun solutionTest() {
        val rangeModule = RangeModule()
        rangeModule.addRange(10, 20)
        rangeModule.removeRange(14, 16)
        assertThat(rangeModule.queryRange(10, 14), equalTo(true))
        assertThat(rangeModule.queryRange(13, 15), equalTo(false))
        assertThat(rangeModule.queryRange(16, 17), equalTo(true))
    }
}
