package g3701_3800.s3709_design_exam_scores_tracker

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class ExamTrackerTest {
    @Test
    fun examTracker() {
        val examTracker = ExamTracker()
        // Alice takes a new exam at time 1, scoring 98.
        examTracker.record(1, 98)
        // Between time 1 and time 1, Alice took 1 exam at time 1, scoring 98. The total score is
        // 98.
        assertThat<Long>(examTracker.totalScore(1, 1), equalTo<Long>(98L))
        // Alice takes a new exam at time 5, scoring 99.
        examTracker.record(5, 99)
        // Between time 1 and time 3, Alice took 1 exam at time 1, scoring 98. The total score is
        // 98.
        assertThat<Long>(examTracker.totalScore(1, 3), equalTo<Long>(98L))
        // Between time 1 and time 5, Alice took 2 exams at time 1 and 5, scoring 98 and 99.
        // The total score is 98 + 99 = 197.
        assertThat<Long>(examTracker.totalScore(1, 5), equalTo<Long>(197L))
        // Alice did not take any exam between time 3 and time 4. Therefore, the answer is 0.
        assertThat<Long>(examTracker.totalScore(3, 4), equalTo<Long>(0L))
        // Between time 2 and time 5, Alice took 1 exam at time 5, scoring 99. The total score is
        // 99.
        assertThat<Long>(examTracker.totalScore(2, 5), equalTo<Long>(99L))
    }
}
