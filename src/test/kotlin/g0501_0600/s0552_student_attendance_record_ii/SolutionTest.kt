package g0501_0600.s0552_student_attendance_record_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkRecord() {
        assertThat(Solution().checkRecord(2), equalTo(8))
    }

    @Test
    fun checkRecord2() {
        assertThat(Solution().checkRecord(1), equalTo(3))
    }

    @Test
    fun checkRecord3() {
        assertThat(Solution().checkRecord(10101), equalTo(183236316))
    }
}
