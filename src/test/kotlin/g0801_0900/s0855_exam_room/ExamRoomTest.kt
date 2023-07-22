package g0801_0900.s0855_exam_room

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class ExamRoomTest {
    @Test
    fun examRoomTest() {
        val examRoom = ExamRoom(10)
        assertThat(examRoom.seat(), equalTo(0))
        assertThat(examRoom.seat(), equalTo(9))
        assertThat(examRoom.seat(), equalTo(4))
        assertThat(examRoom.seat(), equalTo(2))
        examRoom.leave(4)
        assertThat(examRoom.seat(), equalTo(5))
    }
}
