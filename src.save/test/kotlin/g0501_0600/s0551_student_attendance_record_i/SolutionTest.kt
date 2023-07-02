package g0501_0600.s0551_student_attendance_record_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkRecord() {
        assertThat(Solution().checkRecord("PPALLP"), equalTo(true))
    }

    @Test
    fun checkRecord2() {
        assertThat(Solution().checkRecord("PPALLL"), equalTo(false))
    }

    @Test
    fun checkRecord3() {
        assertThat(Solution().checkRecord("ALLAPPL"), equalTo(false))
    }
}
