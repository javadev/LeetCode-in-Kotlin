package g1501_1600.s1600_throne_inheritance

// #Medium #Hash_Table #Depth_First_Search #Tree #Design
class ThroneInheritance(private val king: String) {
    private val graph: HashMap<String, LinkedHashSet<String>>
    private val isDead: HashSet<String>

    init {
        graph = HashMap()
        isDead = HashSet()
        graph[king] = LinkedHashSet()
    }

    fun birth(parentName: String, childName: String) {
        graph.putIfAbsent(parentName, LinkedHashSet())
        graph[parentName]!!.add(childName)
    }

    fun death(name: String) {
        isDead.add(name)
    }

    val inheritanceOrder: List<String>
        get() {
            val inheritance: MutableList<String> = ArrayList()
            val visited = HashSet<String>()
            dfs(graph, king, inheritance, visited)
            return inheritance
        }

    fun dfs(
        graph: Map<String, LinkedHashSet<String>>,
        src: String,
        l: MutableList<String>,
        visited: MutableSet<String>
    ) {
        visited.add(src)
        if (!isDead.contains(src)) {
            l.add(src)
        }
        if (!graph.containsKey(src)) {
            return
        }
        for (s in graph[src]!!) {
            if (!visited.contains(s)) {
                dfs(graph, s, l, visited)
            }
        }
    }
}
