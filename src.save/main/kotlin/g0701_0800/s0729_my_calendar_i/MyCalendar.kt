package g0701_0800.s0729_my_calendar_i

// #Medium #Binary_Search #Design #Ordered_Set #Segment_Tree #Programming_Skills_II_Day_20
// #2023_03_01_Time_378_ms_(69.70%)_Space_52_MB_(72.73%)

import java.util.TreeSet

class MyCalendar {
    internal class Meeting(val start: Int, val end: Int) : Comparable<Meeting?> {
        override operator fun compareTo(other: Meeting?): Int {
            return start - other!!.start
        }
    }

    private val meetings: TreeSet<Meeting> = TreeSet()

    fun book(start: Int, end: Int): Boolean {
        val meetingToBook = Meeting(start, end)
        val prevMeeting = meetings.floor(meetingToBook)
        val nextMeeting = meetings.ceiling(meetingToBook)
        if ((prevMeeting == null || prevMeeting.end <= meetingToBook.start) &&
            (nextMeeting == null || meetingToBook.end <= nextMeeting.start)
        ) {
            meetings.add(meetingToBook)
            return true
        }
        return false
    }
}

/*
 * Your MyCalendar object will be instantiated and called as such:
 * var obj = MyCalendar()
 * var param_1 = obj.book(start,end)
 */
