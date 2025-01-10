package g3401_3500.s3408_design_task_manager

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class TaskManagerTest {
    @Test
    fun test() {
        // Initializes with three tasks for Users 1, 2, and 3.
        val taskManager =
            TaskManager(
                listOf<MutableList<Int>>(
                    mutableListOf<Int>(1, 101, 10),
                    mutableListOf<Int>(2, 102, 20),
                    mutableListOf<Int>(3, 103, 15),
                ),
            )
        // Adds task 104 with priority 5 for User 4.
        taskManager.add(4, 104, 5)
        // Updates priority of task 102 to 8.
        taskManager.edit(102, 8)
        // return 3. Executes task 103 for User 3.
        assertThat<Int>(taskManager.execTop(), equalTo<Int>(3))
        // Removes task 101 from the system.
        taskManager.rmv(101)
        // Adds task 105 with priority 15 for User 5.
        taskManager.add(5, 105, 15)
        // return 5. Executes task 105 for User 5.
        assertThat<Int>(taskManager.execTop(), equalTo<Int>(5))
    }
}
