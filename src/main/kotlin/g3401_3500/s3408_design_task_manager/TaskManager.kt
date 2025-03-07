package g3401_3500.s3408_design_task_manager

// #Medium #Hash_Table #Design #Heap_Priority_Queue #Ordered_Set
// #2025_01_07_Time_405_ms_(88.24%)_Space_263.70_MB_(5.88%)

import java.util.TreeSet

class TaskManager(tasks: List<List<Int>>) {
    private val tasks: TreeSet<IntArray> = TreeSet<IntArray>(
        Comparator { a: IntArray, b: IntArray ->
            if (b[2] == a[2]) b[1] - a[1] else b[2] - a[2]
        },
    )
    private val taskMap: MutableMap<Int, IntArray> = HashMap<Int, IntArray>()

    init {
        for (task in tasks) {
            val t = intArrayOf(task[0], task[1], task[2])
            this.tasks.add(t)
            this.taskMap.put(task[1], t)
        }
    }

    fun add(userId: Int, taskId: Int, priority: Int) {
        val task = intArrayOf(userId, taskId, priority)
        this.tasks.add(task)
        this.taskMap.put(taskId, task)
    }

    fun edit(taskId: Int, newPriority: Int) {
        val task: IntArray = taskMap[taskId]!!
        tasks.remove(task)
        taskMap.remove(taskId)
        val newTask = intArrayOf(task[0], task[1], newPriority)
        tasks.add(newTask)
        taskMap.put(taskId, newTask)
    }

    fun rmv(taskId: Int) {
        this.tasks.remove(this.taskMap[taskId])
        this.taskMap.remove(taskId)
    }

    fun execTop(): Int {
        if (this.tasks.isEmpty()) {
            return -1
        }
        val task = this.tasks.pollFirst()
        this.taskMap.remove(task!![1])
        return task[0]
    }
}

/*
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */
