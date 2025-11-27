package g0501_0600.s0556_next_greater_element_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun nextGreaterElement() {
        assertThat(Solution().nextGreaterElement(12), equalTo(21))
    }

    @Test
    fun nextGreaterElement2() {
        assertThat(Solution().nextGreaterElement(21), equalTo(-1))
    }

    @Test
    fun nextGreaterElement3() {
        assertThat(Solution().nextGreaterElement(1234), equalTo(1243))
    }

    @Test
    fun nextGreaterElement4() {
        assertThat(Solution().nextGreaterElement(4321), equalTo(-1))
    }

    @Test
    fun nextGreaterElement5() {
        assertThat(Solution().nextGreaterElement(115), equalTo(151))
    }

    @Test
    fun nextGreaterElement6() {
        assertThat(Solution().nextGreaterElement(111), equalTo(-1))
    }

    @Test
    fun nextGreaterElement7() {
        assertThat(Solution().nextGreaterElement(12443322), equalTo(13222344))
    }

    @Test
    fun nextGreaterElement8() {
        assertThat(Solution().nextGreaterElement(230241), equalTo(230412))
    }

    @Test
    fun nextGreaterElement9() {
        assertThat(Solution().nextGreaterElement(1999999999), equalTo(-1))
    }

    @Test
    fun nextGreaterElement10() {
        assertThat(Solution().nextGreaterElement(218765), equalTo(251678))
    }

    @Test
    fun nextGreaterElement11() {
        assertThat(Solution().nextGreaterElement(7), equalTo(-1))
    }

    @Test
    fun nextGreaterElement12() {
        assertThat(Solution().nextGreaterElement(132), equalTo(213))
    }

    @Test
    fun nextGreaterElement13() {
        assertThat(Solution().nextGreaterElement(534976), equalTo(536479))
    }

    @Test
    fun nextGreaterElement14() {
        assertThat(Solution().nextGreaterElement(1998), equalTo(8199))
    }

    @Test
    fun nextGreaterElement15() {
        assertThat(Solution().nextGreaterElement(2147483647), equalTo(-1))
    }
}
