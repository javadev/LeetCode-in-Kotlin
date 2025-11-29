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

    @Test
    fun solutionTest2() {
        val rm = RangeModule()
        rm.addRange(5, 10)
        rm.addRange(10, 15)
        assertThat(rm.queryRange(6, 14), equalTo(true))
    }

    @Test
    fun solutionTest3() {
        val rm = RangeModule()
        rm.addRange(1, 5)
        rm.addRange(3, 7)
        rm.addRange(6, 10)
        assertThat(rm.queryRange(2, 9), equalTo(true))
        assertThat(rm.queryRange(0, 2), equalTo(false))
    }

    @Test
    fun solutionTest4() {
        val rm = RangeModule()
        rm.addRange(0, 10)
        rm.removeRange(3, 7)
        assertThat(rm.queryRange(1, 3), equalTo(true))
        assertThat(rm.queryRange(7, 9), equalTo(true))
        assertThat(rm.queryRange(4, 6), equalTo(false))
    }

    @Test
    fun solutionTest5() {
        val rm = RangeModule()
        rm.addRange(5, 8)
        rm.removeRange(0, 20)
        assertThat(rm.queryRange(5, 7), equalTo(false))
    }

    @Test
    fun solutionTest6() {
        val rm = RangeModule()
        rm.addRange(10, 20)
        rm.removeRange(5, 12)
        assertThat(rm.queryRange(10, 12), equalTo(false))
        assertThat(rm.queryRange(12, 15), equalTo(true))
    }

    @Test
    fun solutionTest7() {
        val rm = RangeModule()
        rm.addRange(10, 20)
        rm.removeRange(18, 30)
        assertThat(rm.queryRange(17, 18), equalTo(true))
        assertThat(rm.queryRange(18, 19), equalTo(false))
    }

    @Test
    fun solutionTest8() {
        val rm = RangeModule()
        rm.removeRange(5, 10)
        assertThat(rm.queryRange(5, 6), equalTo(false))
    }

    @Test
    fun solutionTest9() {
        val rm = RangeModule()
        rm.addRange(5, 7)
        rm.addRange(10, 12)
        assertThat(rm.queryRange(6, 7), equalTo(true))
        assertThat(rm.queryRange(8, 9), equalTo(false))
        assertThat(rm.queryRange(11, 12), equalTo(true))
    }

    @Test
    fun solutionTest10() {
        val rm = RangeModule()
        rm.addRange(1, 5)
        rm.addRange(10, 15)
        rm.removeRange(3, 12)
        assertThat(rm.queryRange(2, 3), equalTo(true))
        assertThat(rm.queryRange(3, 4), equalTo(false))
        assertThat(rm.queryRange(12, 14), equalTo(true))
    }
}
