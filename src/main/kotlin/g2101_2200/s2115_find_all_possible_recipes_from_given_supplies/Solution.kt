package g2101_2200.s2115_find_all_possible_recipes_from_given_supplies

import java.util.LinkedList
import java.util.Queue

// #Medium #Array #String #Hash_Table #Graph #Topological_Sort
class Solution {
    fun findAllRecipes(
        recipes: Array<String>,
        ingredients: List<List<String>>,
        supplies: Array<String>
    ): List<String> {
        val indegree: MutableMap<String, Int> = HashMap()
        val supplySet: MutableSet<String> = HashSet()
        val adj: MutableMap<String, MutableSet<String>> = HashMap()
        supplySet.addAll(supplies)
        for (recipe in recipes) {
            indegree[recipe] = 0
        }
        for (i in recipes.indices) {
            val recipe = recipes[i]
            var numberOfDependencies = 0
            for (ingredient in ingredients[i]) {
                if (!supplySet.contains(ingredient)) {
                    adj.computeIfAbsent(ingredient) { _: String? -> HashSet() }.add(recipe)
                    numberOfDependencies++
                }
            }
            indegree[recipe] = numberOfDependencies
        }
        val q: Queue<String> = LinkedList()
        for ((key, value) in indegree) {
            if (value == 0) {
                q.add(key)
            }
        }
        val res: MutableList<String> = ArrayList()
        while (!q.isEmpty()) {
            val recipe = q.remove()
            res.add(recipe)
            if (adj.containsKey(recipe)) {
                for (dep in adj[recipe]!!) {
                    indegree[dep] = indegree[dep]!! - 1
                    if (indegree[dep] == 0) {
                        q.add(dep)
                    }
                }
            }
        }
        return res
    }
}
