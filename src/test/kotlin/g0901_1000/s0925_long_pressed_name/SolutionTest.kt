package g0901_1000.s0925_long_pressed_name

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isLongPressedName() {
        assertThat(Solution().isLongPressedName("alex", "aaleex"), equalTo(true))
    }

    @Test
    fun isLongPressedName2() {
        assertThat(Solution().isLongPressedName("saeed", "ssaaedd"), equalTo(false))
    }

    @Test
    fun isLongPressedName3() {
        assertThat(Solution().isLongPressedName("alex", "ale"), equalTo(false))
    }

    @Test
    fun isLongPressedName4() {
        assertThat(Solution().isLongPressedName("alex", "alex"), equalTo(true))
    }

    @Test
    fun isLongPressedName5() {
        assertThat(Solution().isLongPressedName("alex", "alexxxxx"), equalTo(true))
    }

    @Test
    fun isLongPressedName6() {
        assertThat(Solution().isLongPressedName("alex", "alexy"), equalTo(false))
    }

    @Test
    fun isLongPressedName7() {
        assertThat(Solution().isLongPressedName("aabb", "aaabbb"), equalTo(true))
    }

    @Test
    fun isLongPressedName8() {
        assertThat(Solution().isLongPressedName("alex", "paalex"), equalTo(false))
    }

    @Test
    fun isLongPressedName9() {
        assertThat(Solution().isLongPressedName("alex", "allez"), equalTo(false))
    }

    @Test
    fun isLongPressedName10() {
        assertThat(Solution().isLongPressedName("a", "aaaaaa"), equalTo(true))
    }

    @Test
    fun isLongPressedName11() {
        assertThat(Solution().isLongPressedName("a", "b"), equalTo(false))
    }

    @Test
    fun isLongPressedName12() {
        assertThat(Solution().isLongPressedName("le", "leeex"), equalTo(false))
    }

    @Test
    fun isLongPressedName13() {
        assertThat(Solution().isLongPressedName("n", "nnnnn"), equalTo(true))
    }

    @Test
    fun isLongPressedName14() {
        assertThat(Solution().isLongPressedName("vtkgn", "vttkgnn"), equalTo(true))
    }

    @Test
    fun isLongPressedName15() {
        assertThat(Solution().isLongPressedName("ab", "aabb"), equalTo(true))
    }

    @Test
    fun isLongPressedName16() {
        assertThat(Solution().isLongPressedName("ab", "aa"), equalTo(false))
    }

    @Test
    fun isLongPressedName17() {
        assertThat(Solution().isLongPressedName("abc", "aab"), equalTo(false))
    }
}
