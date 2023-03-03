package g0401_0500.s0451_sort_characters_by_frequency

// #Medium #String #Hash_Table #Sorting #Heap_Priority_Queue #Counting #Bucket_Sort
// #Data_Structure_II_Day_21_Heap_Priority_Queue
// #2022_12_25_Time_288_ms_(81.72%)_Space_39.4_MB_(83.06%)

class Solution {
    fun frequencySort(s: String) = s.groupingBy { it }.eachCount().entries.sortedByDescending { it.value }
        .joinToString("") {
            StringBuilder().apply { for (i in 1..it.value) append(it.key) }.toString()
        }
}
