package g0201_0300.s0207_course_schedule

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Depth_First_Search
// #Breadth_First_Search #Graph #Topological_Sort
// #2022_09_08_Time_565_ms_(13.67%)_Space_50.5_MB_(57.38%)

class Solution {
    /**Kahn's algorithm for topological sorting */
    fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
        val indegree = IntArray(numCourses)
        for (prereq in prerequisites) {
            indegree[prereq[0]]++
        }
        val zeroDegree: MutableSet<Int?> = HashSet()
        for (i in 0 until numCourses) {
            if (indegree[i] == 0) {
                zeroDegree.add(i)
            }
        }
        if (zeroDegree.isEmpty()) {
            return false
        }
        while (!zeroDegree.isEmpty()) {
            val it: Iterator<Int?> = zeroDegree.iterator()
            val course = it.next()
            zeroDegree.remove(course)
            for (prereq in prerequisites) {
                if (prereq[1] == course) {
                    indegree[prereq[0]]--
                    if (indegree[prereq[0]] == 0) {
                        zeroDegree.add(prereq[0])
                    }
                }
            }
        }
        for (i in indegree) {
            if (i != 0) {
                return false
            }
        }
        return true
    }
}
