# LeetCode-in-Kotlin

[![Maven Central](https://img.shields.io/maven-central/v/com.github.javadev/leetcode-in-kotlin?style=flat-square)](https://central.sonatype.com/artifact/com.github.javadev/leetcode-in-kotlin/1.13)
[![MIT License](http://img.shields.io/badge/license-MIT-green.svg) ](https://github.com/javadev/leetcode-in-kotlin/blob/main/LICENSE)
[![Java CI with Maven](https://github.com/javadev/LeetCode-in-Kotlin/actions/workflows/maven.yml/badge.svg)](https://github.com/javadev/LeetCode-in-Kotlin/actions/workflows/maven.yml)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=javadev_LeetCode-in-Kotlin&metric=sqale_rating)](https://sonarcloud.io/summary/overall?id=javadev_LeetCode-in-Kotlin)
[![javadoc](https://javadoc.io/badge2/com.github.javadev/leetcode-in-kotlin/javadoc.svg)](https://javadoc.io/doc/com.github.javadev/leetcode-in-kotlin)
[![](https://img.shields.io/github/stars/javadev/LeetCode-in-Kotlin?style=flat-square)](https://github.com/javadev/LeetCode-in-Kotlin)
[![](https://img.shields.io/github/forks/javadev/LeetCode-in-Kotlin?style=flat-square)](https://github.com/javadev/LeetCode-in-Kotlin/fork)

Kotlin Solution for LeetCode algorithm problems, continually updating.

## Installation

Include the following in your `pom.xml` for Maven:

```xml
<dependencies>
  <dependency>
    <groupId>com.github.javadev</groupId>
    <artifactId>leetcode-in-kotlin</artifactId>
    <version>1.13</version>
  </dependency>
  ...
</dependencies>
```

Gradle:

```groovy
implementation 'com.github.javadev:leetcode-in-kotlin:1.13'
```

> ["For coding interview preparation, LeetCode is one of the best online resource providing a rich library of more than 300 real coding interview questions for you to practice from using one of the 7 supported languages - C, C++, Java, Python, C#, JavaScript, Ruby."](https://www.quora.com/How-effective-is-Leetcode-for-preparing-for-technical-interviews)

##
* [Level 2](#level-2)
* [Udemy](#udemy)
* [Data Structure I](#data-structure-i)
* [Data Structure II](#data-structure-ii)
* [Algorithm I](#algorithm-i)
* [Algorithm II](#algorithm-ii)
* [Binary Search I](#binary-search-i)
* [Binary Search II](#binary-search-ii)
* [Dynamic Programming I](#dynamic-programming-i)
* [Programming Skills I](#programming-skills-i)
* [Programming Skills II](#programming-skills-ii)
* [Graph Theory I](#graph-theory-i)
* [SQL I](#sql-i)
* [Level 1](#level-1)

### Level 2

#### Day 1 Implementation/Simulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0202 |[Happy Number](src.save/main/kotlin/g0201_0300/s0202_happy_number/Solution.kt)| Easy | Top_Interview_Questions, Hash_Table, Math, Two_Pointers | 261 | 45.08
| 0054 |[Spiral Matrix](src.save/main/kotlin/g0001_0100/s0054_spiral_matrix/Solution.kt)| Medium | Top_Interview_Questions, Array, Matrix, Simulation | 224 | 62.50
| 1706 |[Where Will the Ball Fall](src/main/kotlin/g1701_1800/s1706_where_will_the_ball_fall/Solution.kt)| Medium | Array, Dynamic_Programming, Depth_First_Search, Matrix, Simulation | 270 | 67.86

#### Day 2 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0014 |[Longest Common Prefix](src.save/main/kotlin/g0001_0100/s0014_longest_common_prefix/Solution.kt)| Easy | Top_Interview_Questions, String | 209 | 88.86
| 0043 |[Multiply Strings](src.save/main/kotlin/g0001_0100/s0043_multiply_strings/Solution.kt)| Medium | String, Math, Simulation | 390 | 56.25

#### Day 3 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0019 |[Remove Nth Node From End of List](src.save/main/kotlin/g0001_0100/s0019_remove_nth_node_from_end_of_list/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Linked_List | 180 | 91.58
| 0234 |[Palindrome Linked List](src.save/main/kotlin/g0201_0300/s0234_palindrome_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Stack, Linked_List, Recursion | 641 | 79.53

#### Day 4 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0328 |[Odd Even Linked List](src.save/main/kotlin/g0301_0400/s0328_odd_even_linked_list/Solution.kt)| Medium | Top_Interview_Questions, Linked_List | 216 | 86.96
| 0148 |[Sort List](src.save/main/kotlin/g0101_0200/s0148_sort_list/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Sorting, Two_Pointers, Linked_List, Divide_and_Conquer, Merge_Sort | 820 | 61.70

#### Day 5 Greedy

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0621 |[Task Scheduler](src.save/main/kotlin/g0601_0700/s0621_task_scheduler/Solution.kt)| Medium | Array, Hash_Table, Sorting, Greedy, Heap_Priority_Queue, Counting | 266 | 98.36

#### Day 6 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0226 |[Invert Binary Tree](src.save/main/kotlin/g0201_0300/s0226_invert_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 233 | 54.90
| 0110 |[Balanced Binary Tree](src.save/main/kotlin/g0101_0200/s0110_balanced_binary_tree/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree | 310 | 63.63

#### Day 7 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0543 |[Diameter of Binary Tree](src.save/main/kotlin/g0501_0600/s0543_diameter_of_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree | 307 | 43.93
| 0437 |[Path Sum III](src.save/main/kotlin/g0401_0500/s0437_path_sum_iii/Solution.kt)| Medium | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree | 403 | 54.12

#### Day 8 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0074 |[Search a 2D Matrix](src.save/main/kotlin/g0001_0100/s0074_search_a_2d_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix | 290 | 40.17
| 0033 |[Search in Rotated Sorted Array](src.save/main/kotlin/g0001_0100/s0033_search_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search | 184 | 86.08

#### Day 9 Binary Search Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0108 |[Convert Sorted Array to Binary Search Tree](src.save/main/kotlin/g0101_0200/s0108_convert_sorted_array_to_binary_search_tree/Solution.kt)| Easy | Top_Interview_Questions, Array, Tree, Binary_Tree, Binary_Search_Tree, Divide_and_Conquer | 334 | 35.39
| 0230 |[Kth Smallest Element in a BST](src.save/main/kotlin/g0201_0300/s0230_kth_smallest_element_in_a_bst/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 393 | 33.33
| 0173 |[Binary Search Tree Iterator](src.save/main/kotlin/g0101_0200/s0173_binary_search_tree_iterator/BSTIterator.kt)| Medium | Tree, Binary_Tree, Stack, Design, Binary_Search_Tree, Iterator | 563 | 46.91

#### Day 10 Graph/BFS/DFS

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0994 |[Rotting Oranges](src.save/main/kotlin/g0901_1000/s0994_rotting_oranges/Solution.kt)| Medium | Array, Breadth_First_Search, Matrix | 164 | 82.95
| 0417 |[Pacific Atlantic Water Flow](src.save/main/kotlin/g0401_0500/s0417_pacific_atlantic_water_flow/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix | 319 | 100.00

#### Day 11 Graph/BFS/DFS

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0210 |[Course Schedule II](src.save/main/kotlin/g0201_0300/s0210_course_schedule_ii/Solution.kt)| Medium | Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Graph, Topological_Sort | 266 | 96.32
| 0815 |[Bus Routes](src.save/main/kotlin/g0801_0900/s0815_bus_routes/Solution.kt)| Hard | Array, Hash_Table, Breadth_First_Search | 429 | 100.00

#### Day 12 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0198 |[House Robber](src.save/main/kotlin/g0101_0200/s0198_house_robber/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 156 | 92.24
| 0322 |[Coin Change](src.save/main/kotlin/g0301_0400/s0322_coin_change/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Breadth_First_Search | 332 | 50.68

#### Day 13 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0416 |[Partition Equal Subset Sum](src.save/main/kotlin/g0401_0500/s0416_partition_equal_subset_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming | 204 | 98.82
| 0152 |[Maximum Product Subarray](src.save/main/kotlin/g0101_0200/s0152_maximum_product_subarray/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 253 | 88.42

#### Day 14 Sliding Window/Two Pointer

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0003 |[Longest Substring Without Repeating Characters](src.save/main/kotlin/g0001_0100/s0003_longest_substring_without_repeating_characters/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window | 258 | 91.09
| 0016 |[3Sum Closest](src.save/main/kotlin/g0001_0100/s0016_3sum_closest/Solution.kt)| Medium | Array, Sorting, Two_Pointers | 413 | 95.05
| 0076 |[Minimum Window Substring](src.save/main/kotlin/g0001_0100/s0076_minimum_window_substring/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window | 346 | 85.20

#### Day 15 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0100 |[Same Tree](src.save/main/kotlin/g0001_0100/s0100_same_tree/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 208 | 72.24
| 0101 |[Symmetric Tree](src.save/main/kotlin/g0101_0200/s0101_symmetric_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 190 | 91.36
| 0199 |[Binary Tree Right Side View](src.save/main/kotlin/g0101_0200/s0199_binary_tree_right_side_view/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 194 | 92.89

#### Day 16 Design

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0232 |[Implement Queue using Stacks](src.save/main/kotlin/g0201_0300/s0232_implement_queue_using_stacks/MyQueue.kt)| Easy | Stack, Design, Queue | 258 | 70.86
| 0155 |[Min Stack](src.save/main/kotlin/g0101_0200/s0155_min_stack/MinStack.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design | 331 | 84.88
| 0208 |[Implement Trie (Prefix Tree)](src.save/main/kotlin/g0201_0300/s0208_implement_trie_prefix_tree/Trie.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Design, Trie | 689 | 61.00

#### Day 17 Interval

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0057 |[Insert Interval](src.save/main/kotlin/g0001_0100/s0057_insert_interval/Solution.kt)| Medium | Array | 257 | 99.52
| 0056 |[Merge Intervals](src.save/main/kotlin/g0001_0100/s0056_merge_intervals/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting | 320 | 94.22

#### Day 18 Stack

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0735 |[Asteroid Collision](src.save/main/kotlin/g0701_0800/s0735_asteroid_collision/Solution.kt)| Medium | Array, Stack | 243 | 100.00
| 0227 |[Basic Calculator II](src.save/main/kotlin/g0201_0300/s0227_basic_calculator_ii/Solution.kt)| Medium | Top_Interview_Questions, String, Math, Stack | 383 | 62.50

#### Day 19 Union Find

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0547 |[Number of Provinces](src.save/main/kotlin/g0501_0600/s0547_number_of_provinces/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 229 | 79.73
| 0947 |[Most Stones Removed with Same Row or Column](src.save/main/kotlin/g0901_1000/s0947_most_stones_removed_with_same_row_or_column/Solution.kt)| Medium | Depth_First_Search, Graph, Union_Find | 200 | 100.00

#### Day 20 Brute Force/Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0039 |[Combination Sum](src.save/main/kotlin/g0001_0100/s0039_combination_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Backtracking | 317 | 86.85
| 0046 |[Permutations](src.save/main/kotlin/g0001_0100/s0046_permutations/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Backtracking | 186 | 100.00

### Udemy

#### Udemy Integers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0412 |[Fizz Buzz](src.save/main/kotlin/g0401_0500/s0412_fizz_buzz/Solution.kt)| Easy | Top_Interview_Questions, String, Math, Simulation | 307 | 71.81
| 0136 |[Single Number](src.save/main/kotlin/g0101_0200/s0136_single_number/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation | 344 | 83.63
| 0007 |[Reverse Integer](src.save/main/kotlin/g0001_0100/s0007_reverse_integer/Solution.kt)| Medium | Top_Interview_Questions, Math | 245 | 60.32
| 0009 |[Palindrome Number](src.save/main/kotlin/g0001_0100/s0009_palindrome_number/Solution.kt)| Easy | Math | 238 | 96.24
| 0172 |[Factorial Trailing Zeroes](src.save/main/kotlin/g0101_0200/s0172_factorial_trailing_zeroes/Solution.kt)| Medium | Top_Interview_Questions, Math | 220 | 67.65
| 0050 |[Pow(x, n)](src.save/main/kotlin/g0001_0100/s0050_powx_n/Solution.kt)| Medium | Top_Interview_Questions, Math, Recursion | 264 | 52.98

#### Udemy Strings

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0344 |[Reverse String](src.save/main/kotlin/g0301_0400/s0344_reverse_string/Solution.kt)| Easy | Top_Interview_Questions, String, Two_Pointers, Recursion | 445 | 69.75
| 0014 |[Longest Common Prefix](src.save/main/kotlin/g0001_0100/s0014_longest_common_prefix/Solution.kt)| Easy | Top_Interview_Questions, String | 209 | 88.86
| 0187 |[Repeated DNA Sequences](src.save/main/kotlin/g0101_0200/s0187_repeated_dna_sequences/Solution.kt)| Medium | String, Hash_Table, Bit_Manipulation, Sliding_Window, Hash_Function, Rolling_Hash | 319 | 79.03
| 0003 |[Longest Substring Without Repeating Characters](src.save/main/kotlin/g0001_0100/s0003_longest_substring_without_repeating_characters/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window | 258 | 91.09
| 0020 |[Valid Parentheses](src.save/main/kotlin/g0001_0100/s0020_valid_parentheses/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, String, Stack | 226 | 72.53
| 0005 |[Longest Palindromic Substring](src.save/main/kotlin/g0001_0100/s0005_longest_palindromic_substring/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming | 323 | 75.48
| 0394 |[Decode String](src.save/main/kotlin/g0301_0400/s0394_decode_string/Solution.kt)| Medium | Top_100_Liked_Questions, String, Stack, Recursion | 224 | 64.86
| 0242 |[Valid Anagram](src.save/main/kotlin/g0201_0300/s0242_valid_anagram/Solution.kt)| Easy | Top_Interview_Questions, String, Hash_Table, Sorting | 251 | 87.65
| 0049 |[Group Anagrams](src.save/main/kotlin/g0001_0100/s0049_group_anagrams/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, String, Hash_Table, Sorting | 506 | 86.55
| 0151 |[Reverse Words in a String](src.save/main/kotlin/g0101_0200/s0151_reverse_words_in_a_string/Solution.kt)| Medium | String, Two_Pointers | 206 | 98.90
| 0273 |[Integer to English Words](src.save/main/kotlin/g0201_0300/s0273_integer_to_english_words/Solution.kt)| Hard | String, Math, Recursion | 273 | 82.93

#### Udemy Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0704 |[Binary Search](src.save/main/kotlin/g0701_0800/s0704_binary_search/Solution.kt)| Easy | Array, Binary_Search | 261 | 77.91
| 0033 |[Search in Rotated Sorted Array](src.save/main/kotlin/g0001_0100/s0033_search_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search | 184 | 86.08
| 0153 |[Find Minimum in Rotated Sorted Array](src.save/main/kotlin/g0101_0200/s0153_find_minimum_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search | 262 | 60.96

#### Udemy Arrays

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0121 |[Best Time to Buy and Sell Stock](src.save/main/kotlin/g0101_0200/s0121_best_time_to_buy_and_sell_stock/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 609 | 94.06
| 0283 |[Move Zeroes](src.save/main/kotlin/g0201_0300/s0283_move_zeroes/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Two_Pointers | 516 | 79.07
| 0001 |[Two Sum](src.save/main/kotlin/g0001_0100/s0001_two_sum/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table | 234 | 92.75
| 0217 |[Contains Duplicate](src.save/main/kotlin/g0201_0300/s0217_contains_duplicate/Solution.kt)| Easy | Top_Interview_Questions, Array, Hash_Table, Sorting | 719 | 73.49
| 0058 |[Length of Last Word](src.save/main/kotlin/g0001_0100/s0058_length_of_last_word/Solution.kt)| Easy | String | 243 | 63.33
| 0605 |[Can Place Flowers](src.save/main/kotlin/g0601_0700/s0605_can_place_flowers/Solution.kt)| Easy | Array, Greedy | 209 | 85.71
| 0122 |[Best Time to Buy and Sell Stock II](src.save/main/kotlin/g0101_0200/s0122_best_time_to_buy_and_sell_stock_ii/Solution.kt)| Medium | Top_Interview_Questions, Array, Dynamic_Programming, Greedy | 197 | 95.10
| 0080 |[Remove Duplicates from Sorted Array II](src.save/main/kotlin/g0001_0100/s0080_remove_duplicates_from_sorted_array_ii/Solution.kt)| Medium | Array, Two_Pointers | 357 | 44.78
| 0189 |[Rotate Array](src.save/main/kotlin/g0101_0200/s0189_rotate_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Two_Pointers | 483 | 86.95
| 0055 |[Jump Game](src.save/main/kotlin/g0001_0100/s0055_jump_game/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Greedy | 670 | 66.67
| 0075 |[Sort Colors](src.save/main/kotlin/g0001_0100/s0075_sort_colors/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers | 198 | 85.66
| 0066 |[Plus One](src.save/main/kotlin/g0001_0100/s0066_plus_one/Solution.kt)| Easy | Top_Interview_Questions, Array, Math | 303 | 35.18
| 0238 |[Product of Array Except Self](src.save/main/kotlin/g0201_0300/s0238_product_of_array_except_self/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Prefix_Sum | 669 | 48.96
| 1291 |[Sequential Digits](src.save/main/kotlin/g1201_1300/s1291_sequential_digits/Solution.kt)| Medium | Enumeration | 114 | 100.00
| 0448 |[Find All Numbers Disappeared in an Array](src.save/main/kotlin/g0401_0500/s0448_find_all_numbers_disappeared_in_an_array/Solution.kt)| Easy | Array, Hash_Table | 394 | 100.00
| 0442 |[Find All Duplicates in an Array](src.save/main/kotlin/g0401_0500/s0442_find_all_duplicates_in_an_array/Solution.kt)| Medium | Array, Hash_Table | 480 | 73.81
| 0041 |[First Missing Positive](src.save/main/kotlin/g0001_0100/s0041_first_missing_positive/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table | 345 | 100.00
| 0697 |[Degree of an Array](src.save/main/kotlin/g0601_0700/s0697_degree_of_an_array/Solution.kt)| Easy | Array, Hash_Table | 289 | 84.62
| 0532 |[K-diff Pairs in an Array](src.save/main/kotlin/g0501_0600/s0532_k_diff_pairs_in_an_array/Solution.kt)| Medium | Array, Hash_Table, Sorting, Binary_Search, Two_Pointers | 230 | 84.62
| 0713 |[Subarray Product Less Than K](src.save/main/kotlin/g0701_0800/s0713_subarray_product_less_than_k/Solution.kt)| Medium | Array, Sliding_Window | 336 | 92.11
| 1007 |[Minimum Domino Rotations For Equal Row](src.save/main/kotlin/g1001_1100/s1007_minimum_domino_rotations_for_equal_row/Solution.kt)| Medium | Array, Greedy | 421 | 50.00
| 1306 |[Jump Game III](src.save/main/kotlin/g1301_1400/s1306_jump_game_iii/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search | 291 | 100.00
| 0456 |[132 Pattern](src.save/main/kotlin/g0401_0500/s0456_132_pattern/Solution.kt)| Medium | Array, Binary_Search, Stack, Ordered_Set, Monotonic_Stack | 434 | 100.00
| 0239 |[Sliding Window Maximum](src.save/main/kotlin/g0201_0300/s0239_sliding_window_maximum/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Heap_Priority_Queue, Sliding_Window, Queue, Monotonic_Queue | 1059 | 86.14

#### Udemy Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0392 |[Is Subsequence](src.save/main/kotlin/g0301_0400/s0392_is_subsequence/Solution.kt)| Easy | String, Dynamic_Programming, Two_Pointers | 156 | 87.74
| 0125 |[Valid Palindrome](src.save/main/kotlin/g0101_0200/s0125_valid_palindrome/Solution.kt)| Easy | Top_Interview_Questions, String, Two_Pointers | 353 | 52.06
| 0977 |[Squares of a Sorted Array](src.save/main/kotlin/g0901_1000/s0977_squares_of_a_sorted_array/Solution.kt)| Easy | Array, Sorting, Two_Pointers | 375 | 18.43
| 0026 |[Remove Duplicates from Sorted Array](src.save/main/kotlin/g0001_0100/s0026_remove_duplicates_from_sorted_array/Solution.kt)| Easy | Top_Interview_Questions, Array, Two_Pointers | 361 | 77.19
| 0042 |[Trapping Rain Water](src.save/main/kotlin/g0001_0100/s0042_trapping_rain_water/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Two_Pointers, Stack, Monotonic_Stack | 196 | 100.00
| 0015 |[3Sum](src.save/main/kotlin/g0001_0100/s0015_3sum/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers | 761 | 90.55

#### Udemy Famous Algorithm

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0053 |[Maximum Subarray](src.save/main/kotlin/g0001_0100/s0053_maximum_subarray/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Divide_and_Conquer | 662 | 82.48
| 0169 |[Majority Element](src.save/main/kotlin/g0101_0200/s0169_majority_element/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Sorting, Counting, Divide_and_Conquer | 460 | 51.25

#### Udemy Sorting Algorithms

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0912 |[Sort an Array](src.save/main/kotlin/g0901_1000/s0912_sort_an_array/Solution.kt)| Medium | Array, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Merge_Sort, Bucket_Sort, Counting_Sort, Radix_Sort | 606 | 98.48

#### Udemy 2D Arrays/Matrix

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0304 |[Range Sum Query 2D - Immutable](src.save/main/kotlin/g0301_0400/s0304_range_sum_query_2d_immutable/NumMatrix.kt)| Medium | Array, Matrix, Design, Prefix_Sum | 1373 | 85.71
| 0074 |[Search a 2D Matrix](src.save/main/kotlin/g0001_0100/s0074_search_a_2d_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix | 290 | 40.17
| 0054 |[Spiral Matrix](src.save/main/kotlin/g0001_0100/s0054_spiral_matrix/Solution.kt)| Medium | Top_Interview_Questions, Array, Matrix, Simulation | 224 | 62.50
| 0048 |[Rotate Image](src.save/main/kotlin/g0001_0100/s0048_rotate_image/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Matrix | 287 | 46.50
| 1572 |[Matrix Diagonal Sum](src.save/main/kotlin/g1501_1600/s1572_matrix_diagonal_sum/Solution.kt)| Easy | Array, Matrix | 221 | 67.61
| 0073 |[Set Matrix Zeroes](src.save/main/kotlin/g0001_0100/s0073_set_matrix_zeroes/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Matrix | 255 | 100.00
| 0056 |[Merge Intervals](src.save/main/kotlin/g0001_0100/s0056_merge_intervals/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting | 320 | 94.22

#### Udemy Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0114 |[Flatten Binary Tree to Linked List](src.save/main/kotlin/g0101_0200/s0114_flatten_binary_tree_to_linked_list/Solution.kt)| Medium | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, Stack, Linked_List | 191 | 93.10
| 0445 |[Add Two Numbers II](src.save/main/kotlin/g0401_0500/s0445_add_two_numbers_ii/Solution.kt)| Medium | Math, Stack, Linked_List | 240 | 82.61
| 0328 |[Odd Even Linked List](src.save/main/kotlin/g0301_0400/s0328_odd_even_linked_list/Solution.kt)| Medium | Top_Interview_Questions, Linked_List | 216 | 86.96
| 0061 |[Rotate List](src.save/main/kotlin/g0001_0100/s0061_rotate_list/Solution.kt)| Medium | Two_Pointers, Linked_List | 193 | 92.16
| 0024 |[Swap Nodes in Pairs](src.save/main/kotlin/g0001_0100/s0024_swap_nodes_in_pairs/Solution.kt)| Medium | Top_100_Liked_Questions, Linked_List, Recursion | 149 | 99.39
| 0876 |[Middle of the Linked List](src.save/main/kotlin/g0801_0900/s0876_middle_of_the_linked_list/Solution.kt)| Easy | Two_Pointers, Linked_List | 136 | 76.52
| 0142 |[Linked List Cycle II](src.save/main/kotlin/g0101_0200/s0142_linked_list_cycle_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Hash_Table, Two_Pointers, Linked_List | 192 | 63.39
| 0141 |[Linked List Cycle](src.save/main/kotlin/g0101_0200/s0141_linked_list_cycle/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List | 223 | 91.85
| 0206 |[Reverse Linked List](src.save/main/kotlin/g0201_0300/s0206_reverse_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion | 279 | 45.78
| 0021 |[Merge Two Sorted Lists](src.save/main/kotlin/g0001_0100/s0021_merge_two_sorted_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion | 176 | 96.25
| 0160 |[Intersection of Two Linked Lists](src.save/main/kotlin/g0101_0200/s0160_intersection_of_two_linked_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List | 262 | 83.50
| 0234 |[Palindrome Linked List](src.save/main/kotlin/g0201_0300/s0234_palindrome_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Stack, Linked_List, Recursion | 641 | 79.53
| 0138 |[Copy List with Random Pointer](src.save/main/kotlin/g0101_0200/s0138_copy_list_with_random_pointer/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Linked_List | 274 | 80.58
| 0025 |[Reverse Nodes in k-Group](src.save/main/kotlin/g0001_0100/s0025_reverse_nodes_in_k_group/Solution.kt)| Hard | Top_100_Liked_Questions, Linked_List, Recursion | 194 | 87.72
| 0146 |[LRU Cache](src.save/main/kotlin/g0101_0200/s0146_lru_cache/LRUCache.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Design, Linked_List, Doubly_Linked_List | 1116 | 97.93
| 0707 |[Design Linked List](src.save/main/kotlin/g0701_0800/s0707_design_linked_list/MyLinkedList.kt)| Medium | Design, Linked_List | 243 | 100.00

#### Udemy Tree Stack Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0144 |[Binary Tree Preorder Traversal](src.save/main/kotlin/g0101_0200/s0144_binary_tree_preorder_traversal/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Stack | 277 | 37.90
| 0094 |[Binary Tree Inorder Traversal](src.save/main/kotlin/g0001_0100/s0094_binary_tree_inorder_traversal/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Stack | 269 | 38.80
| 0145 |[Binary Tree Postorder Traversal](src.save/main/kotlin/g0101_0200/s0145_binary_tree_postorder_traversal/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Stack | 211 | 80.00
| 0102 |[Binary Tree Level Order Traversal](src.save/main/kotlin/g0101_0200/s0102_binary_tree_level_order_traversal/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree | 332 | 67.53
| 0103 |[Binary Tree Zigzag Level Order Traversal](src.save/main/kotlin/g0101_0200/s0103_binary_tree_zigzag_level_order_traversal/Solution.kt)| Medium | Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree | 316 | 34.25
| 0108 |[Convert Sorted Array to Binary Search Tree](src.save/main/kotlin/g0101_0200/s0108_convert_sorted_array_to_binary_search_tree/Solution.kt)| Easy | Top_Interview_Questions, Array, Tree, Binary_Tree, Binary_Search_Tree, Divide_and_Conquer | 334 | 35.39
| 1008 |[Construct Binary Search Tree from Preorder Traversal](src.save/main/kotlin/g1001_1100/s1008_construct_binary_search_tree_from_preorder_traversal/Solution.kt)| Medium | Array, Tree, Binary_Tree, Stack, Monotonic_Stack, Binary_Search_Tree | 145 | 100.00
| 0543 |[Diameter of Binary Tree](src.save/main/kotlin/g0501_0600/s0543_diameter_of_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree | 307 | 43.93
| 0938 |[Range Sum of BST](src.save/main/kotlin/g0901_1000/s0938_range_sum_of_bst/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 356 | 55.36
| 0100 |[Same Tree](src.save/main/kotlin/g0001_0100/s0100_same_tree/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 208 | 72.24
| 0226 |[Invert Binary Tree](src.save/main/kotlin/g0201_0300/s0226_invert_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 233 | 54.90
| 0111 |[Minimum Depth of Binary Tree](src.save/main/kotlin/g0101_0200/s0111_minimum_depth_of_binary_tree/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 525 | 90.51
| 0104 |[Maximum Depth of Binary Tree](src.save/main/kotlin/g0101_0200/s0104_maximum_depth_of_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 236 | 83.39
| 0110 |[Balanced Binary Tree](src.save/main/kotlin/g0101_0200/s0110_balanced_binary_tree/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree | 310 | 63.63
| 0701 |[Insert into a Binary Search Tree](src.save/main/kotlin/g0701_0800/s0701_insert_into_a_binary_search_tree/Solution.kt)| Medium | Tree, Binary_Tree, Binary_Search_Tree | 311 | 79.03
| 0297 |[Serialize and Deserialize Binary Tree](src.save/main/kotlin/g0201_0300/s0297_serialize_and_deserialize_binary_tree/Codec.kt)| Hard | Top_Interview_Questions, String, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Design | 475 | 78.85
| 0124 |[Binary Tree Maximum Path Sum](src.save/main/kotlin/g0101_0200/s0124_binary_tree_maximum_path_sum/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree | 331 | 74.42
| 0098 |[Validate Binary Search Tree](src.save/main/kotlin/g0001_0100/s0098_validate_binary_search_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 330 | 41.38
| 0337 |[House Robber III](src.save/main/kotlin/g0301_0400/s0337_house_robber_iii/Solution.kt)| Medium | Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree | 282 | 84.62
| 0236 |[Lowest Common Ancestor of a Binary Tree](src.save/main/kotlin/g0201_0300/s0236_lowest_common_ancestor_of_a_binary_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree | 386 | 45.21
| 0968 |[Binary Tree Cameras](src.save/main/kotlin/g0901_1000/s0968_binary_tree_cameras/Solution.kt)| Hard | Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree | 176 | 100.00

#### Udemy Trie and Heap

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0208 |[Implement Trie (Prefix Tree)](src.save/main/kotlin/g0201_0300/s0208_implement_trie_prefix_tree/Trie.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Design, Trie | 689 | 61.00
| 0745 |[Prefix and Suffix Search](src.save/main/kotlin/g0701_0800/s0745_prefix_and_suffix_search/WordFilter.kt)| Hard | String, Design, Trie | 1638 | 100.00

#### Udemy Graph

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0200 |[Number of Islands](src.save/main/kotlin/g0101_0200/s0200_number_of_islands/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 252 | 95.41
| 0133 |[Clone Graph](src.save/main/kotlin/g0101_0200/s0133_clone_graph/Solution.kt)| Medium | Hash_Table, Depth_First_Search, Breadth_First_Search, Graph | 351 | 60.91
| 0417 |[Pacific Atlantic Water Flow](src.save/main/kotlin/g0401_0500/s0417_pacific_atlantic_water_flow/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix | 319 | 100.00

#### Udemy Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0120 |[Triangle](src.save/main/kotlin/g0101_0200/s0120_triangle/Solution.kt)| Medium | Array, Dynamic_Programming | 194 | 97.87
| 0118 |[Pascal's Triangle](src.save/main/kotlin/g0101_0200/s0118_pascals_triangle/Solution.kt)| Easy | Top_Interview_Questions, Array, Dynamic_Programming | 277 | 33.22
| 0119 |[Pascal's Triangle II](src.save/main/kotlin/g0101_0200/s0119_pascals_triangle_ii/Solution.kt)| Easy | Array, Dynamic_Programming | 157 | 97.27
| 0139 |[Word Break](src.save/main/kotlin/g0101_0200/s0139_word_break/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Dynamic_Programming, Trie, Memoization | 197 | 87.17
| 0152 |[Maximum Product Subarray](src.save/main/kotlin/g0101_0200/s0152_maximum_product_subarray/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 253 | 88.42
| 0198 |[House Robber](src.save/main/kotlin/g0101_0200/s0198_house_robber/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 156 | 92.24
| 0213 |[House Robber II](src.save/main/kotlin/g0201_0300/s0213_house_robber_ii/Solution.kt)| Medium | Array, Dynamic_Programming | 257 | 59.62
| 0509 |[Fibonacci Number](src.save/main/kotlin/g0501_0600/s0509_fibonacci_number/Solution.kt)| Easy | Dynamic_Programming, Math, Recursion, Memoization | 139 | 82.72
| 0070 |[Climbing Stairs](src.save/main/kotlin/g0001_0100/s0070_climbing_stairs/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization | 127 | 97.06
| 0064 |[Minimum Path Sum](src.save/main/kotlin/g0001_0100/s0064_minimum_path_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Matrix | 222 | 95.70
| 0300 |[Longest Increasing Subsequence](src.save/main/kotlin/g0201_0300/s0300_longest_increasing_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Binary_Search | 318 | 82.28
| 1143 |[Longest Common Subsequence](src.save/main/kotlin/g1101_1200/s1143_longest_common_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming | 307 | 38.36
| 0072 |[Edit Distance](src.save/main/kotlin/g0001_0100/s0072_edit_distance/Solution.kt)| Hard | Top_100_Liked_Questions, String, Dynamic_Programming | 320 | 63.53
| 0044 |[Wildcard Matching](src.save/main/kotlin/g0001_0100/s0044_wildcard_matching/Solution.kt)| Hard | Top_Interview_Questions, String, Dynamic_Programming, Greedy, Recursion | 401 | 86.11
| 0010 |[Regular Expression Matching](src.save/main/kotlin/g0001_0100/s0010_regular_expression_matching/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Recursion | 292 | 58.58

#### Udemy Backtracking/Recursion

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0022 |[Generate Parentheses](src.save/main/kotlin/g0001_0100/s0022_generate_parentheses/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Backtracking | 210 | 78.51
| 0039 |[Combination Sum](src.save/main/kotlin/g0001_0100/s0039_combination_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Backtracking | 317 | 86.85
| 0216 |[Combination Sum III](src.save/main/kotlin/g0201_0300/s0216_combination_sum_iii/Solution.kt)| Medium | Array, Backtracking | 175 | 90.91
| 0078 |[Subsets](src.save/main/kotlin/g0001_0100/s0078_subsets/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation, Backtracking | 191 | 97.44
| 0017 |[Letter Combinations of a Phone Number](src.save/main/kotlin/g0001_0100/s0017_letter_combinations_of_a_phone_number/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Backtracking | 262 | 73.59
| 0046 |[Permutations](src.save/main/kotlin/g0001_0100/s0046_permutations/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Backtracking | 186 | 100.00

#### Udemy Bit Manipulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0191 |[Number of 1 Bits](src.save/main/kotlin/g0101_0200/s0191_number_of_1_bits/Solution.kt)| Easy | Top_Interview_Questions, Bit_Manipulation | 237 | 68.44
| 0389 |[Find the Difference](src.save/main/kotlin/g0301_0400/s0389_find_the_difference/Solution.kt)| Easy | String, Hash_Table, Sorting, Bit_Manipulation | 256 | 64.81
| 0190 |[Reverse Bits](src.save/main/kotlin/g0101_0200/s0190_reverse_bits/Solution.kt)| Easy | Top_Interview_Questions, Bit_Manipulation, Divide_and_Conquer | 198 | 81.82
| 0461 |[Hamming Distance](src.save/main/kotlin/g0401_0500/s0461_hamming_distance/Solution.kt)| Easy | Bit_Manipulation | 150 | 96.15
| 1009 |[Complement of Base 10 Integer](src.save/main/kotlin/g1001_1100/s1009_complement_of_base_10_integer/Solution.kt)| Easy | Bit_Manipulation | 126 | 72.73
| 0338 |[Counting Bits](src.save/main/kotlin/g0301_0400/s0338_counting_bits/Solution.kt)| Easy | Top_100_Liked_Questions, Dynamic_Programming, Bit_Manipulation | 186 | 99.26
| 0371 |[Sum of Two Integers](src.save/main/kotlin/g0301_0400/s0371_sum_of_two_integers/Solution.kt)| Medium | Top_Interview_Questions, Math, Bit_Manipulation | 129 | 95.45
| 0029 |[Divide Two Integers](src.save/main/kotlin/g0001_0100/s0029_divide_two_integers/Solution.kt)| Medium | Top_Interview_Questions, Math, Bit_Manipulation | 281 | 31.67

#### Udemy Design

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0155 |[Min Stack](src.save/main/kotlin/g0101_0200/s0155_min_stack/MinStack.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design | 331 | 84.88

### Data Structure I

#### Day 1 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0217 |[Contains Duplicate](src.save/main/kotlin/g0201_0300/s0217_contains_duplicate/Solution.kt)| Easy | Top_Interview_Questions, Array, Hash_Table, Sorting | 719 | 73.49
| 0053 |[Maximum Subarray](src.save/main/kotlin/g0001_0100/s0053_maximum_subarray/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Divide_and_Conquer | 662 | 82.48

#### Day 2 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0001 |[Two Sum](src.save/main/kotlin/g0001_0100/s0001_two_sum/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table | 234 | 92.75
| 0088 |[Merge Sorted Array](src.save/main/kotlin/g0001_0100/s0088_merge_sorted_array/Solution.kt)| Easy | Top_Interview_Questions, Array, Sorting, Two_Pointers | 311 | 33.40

#### Day 3 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0350 |[Intersection of Two Arrays II](src.save/main/kotlin/g0301_0400/s0350_intersection_of_two_arrays_ii/Solution.kt)| Easy | Top_Interview_Questions, Array, Hash_Table, Sorting, Binary_Search, Two_Pointers | 321 | 73.37
| 0121 |[Best Time to Buy and Sell Stock](src.save/main/kotlin/g0101_0200/s0121_best_time_to_buy_and_sell_stock/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 609 | 94.06

#### Day 4 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0566 |[Reshape the Matrix](src.save/main/kotlin/g0501_0600/s0566_reshape_the_matrix/Solution.kt)| Easy | Array, Matrix, Simulation | 239 | 99.05
| 0118 |[Pascal's Triangle](src.save/main/kotlin/g0101_0200/s0118_pascals_triangle/Solution.kt)| Easy | Top_Interview_Questions, Array, Dynamic_Programming | 277 | 33.22

#### Day 5 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0036 |[Valid Sudoku](src.save/main/kotlin/g0001_0100/s0036_valid_sudoku/Solution.kt)| Medium | Top_Interview_Questions, Array, Hash_Table, Matrix | 346 | 65.03
| 0074 |[Search a 2D Matrix](src.save/main/kotlin/g0001_0100/s0074_search_a_2d_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix | 290 | 40.17

#### Day 6 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0387 |[First Unique Character in a String](src.save/main/kotlin/g0301_0400/s0387_first_unique_character_in_a_string/Solution.kt)| Easy | Top_Interview_Questions, String, Hash_Table, Counting, Queue | 369 | 82.68
| 0383 |[Ransom Note](src.save/main/kotlin/g0301_0400/s0383_ransom_note/Solution.kt)| Easy | String, Hash_Table, Counting | 333 | 79.58
| 0242 |[Valid Anagram](src.save/main/kotlin/g0201_0300/s0242_valid_anagram/Solution.kt)| Easy | Top_Interview_Questions, String, Hash_Table, Sorting | 251 | 87.65

#### Day 7 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0141 |[Linked List Cycle](src.save/main/kotlin/g0101_0200/s0141_linked_list_cycle/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List | 223 | 91.85
| 0021 |[Merge Two Sorted Lists](src.save/main/kotlin/g0001_0100/s0021_merge_two_sorted_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion | 176 | 96.25
| 0203 |[Remove Linked List Elements](src.save/main/kotlin/g0201_0300/s0203_remove_linked_list_elements/Solution.kt)| Easy | Linked_List, Recursion | 233 | 91.22

#### Day 8 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0206 |[Reverse Linked List](src.save/main/kotlin/g0201_0300/s0206_reverse_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion | 279 | 45.78
| 0083 |[Remove Duplicates from Sorted List](src.save/main/kotlin/g0001_0100/s0083_remove_duplicates_from_sorted_list/Solution.kt)| Easy | Linked_List | 274 | 77.82

#### Day 9 Stack Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0020 |[Valid Parentheses](src.save/main/kotlin/g0001_0100/s0020_valid_parentheses/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, String, Stack | 226 | 72.53
| 0232 |[Implement Queue using Stacks](src.save/main/kotlin/g0201_0300/s0232_implement_queue_using_stacks/MyQueue.kt)| Easy | Stack, Design, Queue | 258 | 70.86

#### Day 10 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0144 |[Binary Tree Preorder Traversal](src.save/main/kotlin/g0101_0200/s0144_binary_tree_preorder_traversal/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Stack | 277 | 37.90
| 0094 |[Binary Tree Inorder Traversal](src.save/main/kotlin/g0001_0100/s0094_binary_tree_inorder_traversal/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Stack | 269 | 38.80
| 0145 |[Binary Tree Postorder Traversal](src.save/main/kotlin/g0101_0200/s0145_binary_tree_postorder_traversal/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Stack | 211 | 80.00

#### Day 11 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0102 |[Binary Tree Level Order Traversal](src.save/main/kotlin/g0101_0200/s0102_binary_tree_level_order_traversal/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree | 332 | 67.53
| 0104 |[Maximum Depth of Binary Tree](src.save/main/kotlin/g0101_0200/s0104_maximum_depth_of_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 236 | 83.39
| 0101 |[Symmetric Tree](src.save/main/kotlin/g0101_0200/s0101_symmetric_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 190 | 91.36

#### Day 12 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0226 |[Invert Binary Tree](src.save/main/kotlin/g0201_0300/s0226_invert_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 233 | 54.90
| 0112 |[Path Sum](src.save/main/kotlin/g0101_0200/s0112_path_sum/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 322 | 36.41

#### Day 13 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0700 |[Search in a Binary Search Tree](src.save/main/kotlin/g0601_0700/s0700_search_in_a_binary_search_tree/Solution.kt)| Easy | Tree, Binary_Tree, Binary_Search_Tree | 251 | 88.31
| 0701 |[Insert into a Binary Search Tree](src.save/main/kotlin/g0701_0800/s0701_insert_into_a_binary_search_tree/Solution.kt)| Medium | Tree, Binary_Tree, Binary_Search_Tree | 311 | 79.03

#### Day 14 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0098 |[Validate Binary Search Tree](src.save/main/kotlin/g0001_0100/s0098_validate_binary_search_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 330 | 41.38
| 0653 |[Two Sum IV - Input is a BST](src.save/main/kotlin/g0601_0700/s0653_two_sum_iv_input_is_a_bst/Solution.kt)| Easy | Hash_Table, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Two_Pointers, Binary_Search_Tree | 231 | 96.08
| 0235 |[Lowest Common Ancestor of a Binary Search Tree](src.save/main/kotlin/g0201_0300/s0235_lowest_common_ancestor_of_a_binary_search_tree/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 404 | 75.59

### Data Structure II

#### Day 1 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0136 |[Single Number](src.save/main/kotlin/g0101_0200/s0136_single_number/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation | 344 | 83.63
| 0169 |[Majority Element](src.save/main/kotlin/g0101_0200/s0169_majority_element/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Sorting, Counting, Divide_and_Conquer | 460 | 51.25
| 0015 |[3Sum](src.save/main/kotlin/g0001_0100/s0015_3sum/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers | 761 | 90.55

#### Day 2 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0075 |[Sort Colors](src.save/main/kotlin/g0001_0100/s0075_sort_colors/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers | 198 | 85.66
| 0056 |[Merge Intervals](src.save/main/kotlin/g0001_0100/s0056_merge_intervals/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting | 320 | 94.22
| 0706 |[Design HashMap](src.save/main/kotlin/g0701_0800/s0706_design_hashmap/MyHashMap.kt)| Easy | Array, Hash_Table, Design, Linked_List, Hash_Function | 405 | 92.11

#### Day 3 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0119 |[Pascal's Triangle II](src.save/main/kotlin/g0101_0200/s0119_pascals_triangle_ii/Solution.kt)| Easy | Array, Dynamic_Programming | 157 | 97.27
| 0048 |[Rotate Image](src.save/main/kotlin/g0001_0100/s0048_rotate_image/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Matrix | 287 | 46.50
| 0059 |[Spiral Matrix II](src.save/main/kotlin/g0001_0100/s0059_spiral_matrix_ii/Solution.kt)| Medium | Array, Matrix, Simulation | 153 | 100.00

#### Day 4 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0240 |[Search a 2D Matrix II](src.save/main/kotlin/g0201_0300/s0240_search_a_2d_matrix_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Matrix, Divide_and_Conquer | 460 | 66.08
| 0435 |[Non-overlapping Intervals](src.save/main/kotlin/g0401_0500/s0435_non_overlapping_intervals/Solution.kt)| Medium | Array, Dynamic_Programming, Sorting, Greedy | 1040 | 85.07

#### Day 5 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0334 |[Increasing Triplet Subsequence](src.save/main/kotlin/g0301_0400/s0334_increasing_triplet_subsequence/Solution.kt)| Medium | Top_Interview_Questions, Array, Greedy | 672 | 60.61
| 0238 |[Product of Array Except Self](src.save/main/kotlin/g0201_0300/s0238_product_of_array_except_self/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Prefix_Sum | 669 | 48.96
| 0560 |[Subarray Sum Equals K](src.save/main/kotlin/g0501_0600/s0560_subarray_sum_equals_k/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Hash_Table, Prefix_Sum | 692 | 53.27

#### Day 6 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0415 |[Add Strings](src.save/main/kotlin/g0401_0500/s0415_add_strings/Solution.kt)| Easy | String, Math, Simulation | 296 | 76.00
| 0409 |[Longest Palindrome](src.save/main/kotlin/g0401_0500/s0409_longest_palindrome/Solution.kt)| Easy | String, Hash_Table, Greedy | 259 | 60.71

#### Day 7 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0290 |[Word Pattern](src.save/main/kotlin/g0201_0300/s0290_word_pattern/Solution.kt)| Easy | String, Hash_Table | 177 | 89.55
| 0763 |[Partition Labels](src.save/main/kotlin/g0701_0800/s0763_partition_labels/Solution.kt)| Medium | Top_100_Liked_Questions, String, Hash_Table, Greedy, Two_Pointers | 235 | 84.75

#### Day 8 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0049 |[Group Anagrams](src.save/main/kotlin/g0001_0100/s0049_group_anagrams/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, String, Hash_Table, Sorting | 506 | 86.55
| 0043 |[Multiply Strings](src.save/main/kotlin/g0001_0100/s0043_multiply_strings/Solution.kt)| Medium | String, Math, Simulation | 390 | 56.25

#### Day 9 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0187 |[Repeated DNA Sequences](src.save/main/kotlin/g0101_0200/s0187_repeated_dna_sequences/Solution.kt)| Medium | String, Hash_Table, Bit_Manipulation, Sliding_Window, Hash_Function, Rolling_Hash | 319 | 79.03
| 0005 |[Longest Palindromic Substring](src.save/main/kotlin/g0001_0100/s0005_longest_palindromic_substring/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming | 323 | 75.48

#### Day 10 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0002 |[Add Two Numbers](src.save/main/kotlin/g0001_0100/s0002_add_two_numbers/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Math, Linked_List, Recursion | 417 | 50.44
| 0142 |[Linked List Cycle II](src.save/main/kotlin/g0101_0200/s0142_linked_list_cycle_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Hash_Table, Two_Pointers, Linked_List | 192 | 63.39

#### Day 11 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0160 |[Intersection of Two Linked Lists](src.save/main/kotlin/g0101_0200/s0160_intersection_of_two_linked_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List | 262 | 83.50
| 0082 |[Remove Duplicates from Sorted List II](src.save/main/kotlin/g0001_0100/s0082_remove_duplicates_from_sorted_list_ii/Solution.kt)| Medium | Two_Pointers, Linked_List | 241 | 91.04

#### Day 12 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0024 |[Swap Nodes in Pairs](src.save/main/kotlin/g0001_0100/s0024_swap_nodes_in_pairs/Solution.kt)| Medium | Top_100_Liked_Questions, Linked_List, Recursion | 149 | 99.39
| 0707 |[Design Linked List](src.save/main/kotlin/g0701_0800/s0707_design_linked_list/MyLinkedList.kt)| Medium | Design, Linked_List | 243 | 100.00

#### Day 13 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0025 |[Reverse Nodes in k-Group](src.save/main/kotlin/g0001_0100/s0025_reverse_nodes_in_k_group/Solution.kt)| Hard | Top_100_Liked_Questions, Linked_List, Recursion | 194 | 87.72
| 0143 |[Reorder List](src.save/main/kotlin/g0101_0200/s0143_reorder_list/Solution.kt)| Medium | Two_Pointers, Stack, Linked_List, Recursion | 395 | 82.26

#### Day 14 Stack Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0155 |[Min Stack](src.save/main/kotlin/g0101_0200/s0155_min_stack/MinStack.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design | 331 | 84.88
| 1249 |[Minimum Remove to Make Valid Parentheses](src.save/main/kotlin/g1201_1300/s1249_minimum_remove_to_make_valid_parentheses/Solution.kt)| Medium | String, Stack | 218 | 100.00

#### Day 15 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0108 |[Convert Sorted Array to Binary Search Tree](src.save/main/kotlin/g0101_0200/s0108_convert_sorted_array_to_binary_search_tree/Solution.kt)| Easy | Top_Interview_Questions, Array, Tree, Binary_Tree, Binary_Search_Tree, Divide_and_Conquer | 334 | 35.39
| 0105 |[Construct Binary Tree from Preorder and Inorder Traversal](src.save/main/kotlin/g0101_0200/s0105_construct_binary_tree_from_preorder_and_inorder_traversal/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Tree, Binary_Tree, Divide_and_Conquer | 370 | 58.31
| 0103 |[Binary Tree Zigzag Level Order Traversal](src.save/main/kotlin/g0101_0200/s0103_binary_tree_zigzag_level_order_traversal/Solution.kt)| Medium | Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree | 316 | 34.25

#### Day 16 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0199 |[Binary Tree Right Side View](src.save/main/kotlin/g0101_0200/s0199_binary_tree_right_side_view/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 194 | 92.89
| 0113 |[Path Sum II](src.save/main/kotlin/g0101_0200/s0113_path_sum_ii/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree, Backtracking | 364 | 78.67
| 0450 |[Delete Node in a BST](src.save/main/kotlin/g0401_0500/s0450_delete_node_in_a_bst/Solution.kt)| Medium | Tree, Binary_Tree, Binary_Search_Tree | 257 | 84.62

#### Day 17 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0230 |[Kth Smallest Element in a BST](src.save/main/kotlin/g0201_0300/s0230_kth_smallest_element_in_a_bst/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 393 | 33.33
| 0173 |[Binary Search Tree Iterator](src.save/main/kotlin/g0101_0200/s0173_binary_search_tree_iterator/BSTIterator.kt)| Medium | Tree, Binary_Tree, Stack, Design, Binary_Search_Tree, Iterator | 563 | 46.91

#### Day 18 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0236 |[Lowest Common Ancestor of a Binary Tree](src.save/main/kotlin/g0201_0300/s0236_lowest_common_ancestor_of_a_binary_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree | 386 | 45.21
| 0297 |[Serialize and Deserialize Binary Tree](src.save/main/kotlin/g0201_0300/s0297_serialize_and_deserialize_binary_tree/Codec.kt)| Hard | Top_Interview_Questions, String, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Design | 475 | 78.85

#### Day 19 Graph

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0997 |[Find the Town Judge](src.save/main/kotlin/g0901_1000/s0997_find_the_town_judge/Solution.kt)| Easy | Array, Hash_Table, Graph | 475 | 58.62
| 1557 |[Minimum Number of Vertices to Reach All Nodes](src.save/main/kotlin/g1501_1600/s1557_minimum_number_of_vertices_to_reach_all_nodes/Solution.kt)| Medium | Graph | 792 | 99.29
| 0841 |[Keys and Rooms](src.save/main/kotlin/g0801_0900/s0841_keys_and_rooms/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph | 189 | 69.23

#### Day 20 Heap Priority Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0215 |[Kth Largest Element in an Array](src.save/main/kotlin/g0201_0300/s0215_kth_largest_element_in_an_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Quickselect | 839 | 34.43
| 0347 |[Top K Frequent Elements](src.save/main/kotlin/g0301_0400/s0347_top_k_frequent_elements/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Sorting, Heap_Priority_Queue, Counting, Divide_and_Conquer, Quickselect, Bucket_Sort | 268 | 99.74

#### Day 21 Heap Priority Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0451 |[Sort Characters By Frequency](src.save/main/kotlin/g0401_0500/s0451_sort_characters_by_frequency/Solution.kt)| Medium | String, Hash_Table, Sorting, Heap_Priority_Queue, Counting, Bucket_Sort | 288 | 81.72
| 0973 |[K Closest Points to Origin](src.save/main/kotlin/g0901_1000/s0973_k_closest_points_to_origin/Solution.kt)| Medium | Array, Math, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Geometry, Quickselect | 800 | 37.89

### Algorithm I

#### Day 1 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0704 |[Binary Search](src.save/main/kotlin/g0701_0800/s0704_binary_search/Solution.kt)| Easy | Array, Binary_Search | 261 | 77.91
| 0278 |[First Bad Version](src.save/main/kotlin/g0201_0300/s0278_first_bad_version/Solution.kt)| Easy | Binary_Search, Interactive | 349 | 76.86
| 0035 |[Search Insert Position](src.save/main/kotlin/g0001_0100/s0035_search_insert_position/Solution.kt)| Easy | Top_100_Liked_Questions, Array, Binary_Search | 267 | 50.32

#### Day 2 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0977 |[Squares of a Sorted Array](src.save/main/kotlin/g0901_1000/s0977_squares_of_a_sorted_array/Solution.kt)| Easy | Array, Sorting, Two_Pointers | 375 | 18.43
| 0189 |[Rotate Array](src.save/main/kotlin/g0101_0200/s0189_rotate_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Two_Pointers | 483 | 86.95

#### Day 3 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0283 |[Move Zeroes](src.save/main/kotlin/g0201_0300/s0283_move_zeroes/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Two_Pointers | 516 | 79.07
| 0167 |[Two Sum II - Input Array Is Sorted](src.save/main/kotlin/g0101_0200/s0167_two_sum_ii_input_array_is_sorted/Solution.kt)| Medium | Array, Binary_Search, Two_Pointers | 403 | 68.74

#### Day 4 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0344 |[Reverse String](src.save/main/kotlin/g0301_0400/s0344_reverse_string/Solution.kt)| Easy | Top_Interview_Questions, String, Two_Pointers, Recursion | 445 | 69.75
| 0557 |[Reverse Words in a String III](src.save/main/kotlin/g0501_0600/s0557_reverse_words_in_a_string_iii/Solution.kt)| Easy | String, Two_Pointers | 215 | 98.10

#### Day 5 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0876 |[Middle of the Linked List](src.save/main/kotlin/g0801_0900/s0876_middle_of_the_linked_list/Solution.kt)| Easy | Two_Pointers, Linked_List | 136 | 76.52
| 0019 |[Remove Nth Node From End of List](src.save/main/kotlin/g0001_0100/s0019_remove_nth_node_from_end_of_list/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Linked_List | 180 | 91.58

#### Day 6 Sliding Window

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0003 |[Longest Substring Without Repeating Characters](src.save/main/kotlin/g0001_0100/s0003_longest_substring_without_repeating_characters/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window | 258 | 91.09
| 0567 |[Permutation in String](src.save/main/kotlin/g0501_0600/s0567_permutation_in_string/Solution.kt)| Medium | String, Hash_Table, Two_Pointers, Sliding_Window | 169 | 100.00

#### Day 7 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0733 |[Flood Fill](src.save/main/kotlin/g0701_0800/s0733_flood_fill/Solution.kt)| Easy | Array, Depth_First_Search, Breadth_First_Search, Matrix | 230 | 97.76
| 0695 |[Max Area of Island](src.save/main/kotlin/g0601_0700/s0695_max_area_of_island/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 324 | 24.06

#### Day 8 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0617 |[Merge Two Binary Trees](src.save/main/kotlin/g0601_0700/s0617_merge_two_binary_trees/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 243 | 72.83
| 0116 |[Populating Next Right Pointers in Each Node](src.save/main/kotlin/g0101_0200/s0116_populating_next_right_pointers_in_each_node/Solution.kt)| Medium | Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Linked_List | 355 | 69.02

#### Day 9 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0542 |[01 Matrix](src.save/main/kotlin/g0501_0600/s0542_01_matrix/Solution.kt)| Medium | Array, Dynamic_Programming, Breadth_First_Search, Matrix | 441 | 94.06
| 0994 |[Rotting Oranges](src.save/main/kotlin/g0901_1000/s0994_rotting_oranges/Solution.kt)| Medium | Array, Breadth_First_Search, Matrix | 164 | 82.95

#### Day 10 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0021 |[Merge Two Sorted Lists](src.save/main/kotlin/g0001_0100/s0021_merge_two_sorted_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion | 176 | 96.25
| 0206 |[Reverse Linked List](src.save/main/kotlin/g0201_0300/s0206_reverse_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion | 279 | 45.78

#### Day 11 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0077 |[Combinations](src.save/main/kotlin/g0001_0100/s0077_combinations/Solution.kt)| Medium | Backtracking | 244 | 100.00
| 0046 |[Permutations](src.save/main/kotlin/g0001_0100/s0046_permutations/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Backtracking | 186 | 100.00
| 0784 |[Letter Case Permutation](src.save/main/kotlin/g0701_0800/s0784_letter_case_permutation/Solution.kt)| Medium | String, Bit_Manipulation, Backtracking | 219 | 84.62

#### Day 12 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0070 |[Climbing Stairs](src.save/main/kotlin/g0001_0100/s0070_climbing_stairs/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization | 127 | 97.06
| 0198 |[House Robber](src.save/main/kotlin/g0101_0200/s0198_house_robber/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 156 | 92.24
| 0120 |[Triangle](src.save/main/kotlin/g0101_0200/s0120_triangle/Solution.kt)| Medium | Array, Dynamic_Programming | 194 | 97.87

#### Day 13 Bit Manipulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0231 |[Power of Two](src.save/main/kotlin/g0201_0300/s0231_power_of_two/Solution.kt)| Easy | Math, Bit_Manipulation, Recursion | 161 | 86.81
| 0191 |[Number of 1 Bits](src.save/main/kotlin/g0101_0200/s0191_number_of_1_bits/Solution.kt)| Easy | Top_Interview_Questions, Bit_Manipulation | 237 | 68.44

#### Day 14 Bit Manipulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0190 |[Reverse Bits](src.save/main/kotlin/g0101_0200/s0190_reverse_bits/Solution.kt)| Easy | Top_Interview_Questions, Bit_Manipulation, Divide_and_Conquer | 198 | 81.82
| 0136 |[Single Number](src.save/main/kotlin/g0101_0200/s0136_single_number/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation | 344 | 83.63

### Algorithm II

#### Day 1 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0034 |[Find First and Last Position of Element in Sorted Array](src.save/main/kotlin/g0001_0100/s0034_find_first_and_last_position_of_element_in_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search | 228 | 83.38
| 0033 |[Search in Rotated Sorted Array](src.save/main/kotlin/g0001_0100/s0033_search_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search | 184 | 86.08
| 0074 |[Search a 2D Matrix](src.save/main/kotlin/g0001_0100/s0074_search_a_2d_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix | 290 | 40.17

#### Day 2 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0153 |[Find Minimum in Rotated Sorted Array](src.save/main/kotlin/g0101_0200/s0153_find_minimum_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search | 262 | 60.96
| 0162 |[Find Peak Element](src.save/main/kotlin/g0101_0200/s0162_find_peak_element/Solution.kt)| Medium | Top_Interview_Questions, Array, Binary_Search | 297 | 53.85

#### Day 3 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0082 |[Remove Duplicates from Sorted List II](src.save/main/kotlin/g0001_0100/s0082_remove_duplicates_from_sorted_list_ii/Solution.kt)| Medium | Two_Pointers, Linked_List | 241 | 91.04
| 0015 |[3Sum](src.save/main/kotlin/g0001_0100/s0015_3sum/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers | 761 | 90.55

#### Day 4 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0844 |[Backspace String Compare](src.save/main/kotlin/g0801_0900/s0844_backspace_string_compare/Solution.kt)| Easy | String, Two_Pointers, Stack, Simulation | 126 | 98.31
| 0986 |[Interval List Intersections](src.save/main/kotlin/g0901_1000/s0986_interval_list_intersections/Solution.kt)| Medium | Array, Two_Pointers | 318 | 60.98
| 0011 |[Container With Most Water](src.save/main/kotlin/g0001_0100/s0011_container_with_most_water/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Greedy, Two_Pointers | 474 | 89.18

#### Day 5 Sliding Window

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0438 |[Find All Anagrams in a String](src.save/main/kotlin/g0401_0500/s0438_find_all_anagrams_in_a_string/Solution.kt)| Medium | Top_100_Liked_Questions, String, Hash_Table, Sliding_Window | 561 | 54.68
| 0713 |[Subarray Product Less Than K](src.save/main/kotlin/g0701_0800/s0713_subarray_product_less_than_k/Solution.kt)| Medium | Array, Sliding_Window | 336 | 92.11
| 0209 |[Minimum Size Subarray Sum](src.save/main/kotlin/g0201_0300/s0209_minimum_size_subarray_sum/Solution.kt)| Medium | Array, Binary_Search, Prefix_Sum, Sliding_Window | 315 | 96.73

#### Day 6 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0200 |[Number of Islands](src.save/main/kotlin/g0101_0200/s0200_number_of_islands/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 252 | 95.41
| 0547 |[Number of Provinces](src.save/main/kotlin/g0501_0600/s0547_number_of_provinces/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 229 | 79.73

#### Day 7 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0117 |[Populating Next Right Pointers in Each Node II](src.save/main/kotlin/g0101_0200/s0117_populating_next_right_pointers_in_each_node_ii/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Linked_List | 199 | 94.67
| 0572 |[Subtree of Another Tree](src.save/main/kotlin/g0501_0600/s0572_subtree_of_another_tree/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Hash_Function, String_Matching | 214 | 92.39

#### Day 8 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1091 |[Shortest Path in Binary Matrix](src.save/main/kotlin/g1001_1100/s1091_shortest_path_in_binary_matrix/Solution.kt)| Medium | Array, Breadth_First_Search, Matrix | 305 | 98.28
| 0130 |[Surrounded Regions](src.save/main/kotlin/g0101_0200/s0130_surrounded_regions/Solution.kt)| Medium | Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 355 | 84.42
| 0797 |[All Paths From Source to Target](src.save/main/kotlin/g0701_0800/s0797_all_paths_from_source_to_target/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Backtracking | 232 | 100.00

#### Day 9 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0078 |[Subsets](src.save/main/kotlin/g0001_0100/s0078_subsets/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation, Backtracking | 191 | 97.44
| 0090 |[Subsets II](src.save/main/kotlin/g0001_0100/s0090_subsets_ii/Solution.kt)| Medium | Array, Bit_Manipulation, Backtracking | 366 | 58.09

#### Day 10 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0047 |[Permutations II](src.save/main/kotlin/g0001_0100/s0047_permutations_ii/Solution.kt)| Medium | Array, Backtracking | 406 | 76.36
| 0039 |[Combination Sum](src.save/main/kotlin/g0001_0100/s0039_combination_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Backtracking | 317 | 86.85
| 0040 |[Combination Sum II](src.save/main/kotlin/g0001_0100/s0040_combination_sum_ii/Solution.kt)| Medium | Array, Backtracking | 348 | 80.92

#### Day 11 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0017 |[Letter Combinations of a Phone Number](src.save/main/kotlin/g0001_0100/s0017_letter_combinations_of_a_phone_number/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Backtracking | 262 | 73.59
| 0022 |[Generate Parentheses](src.save/main/kotlin/g0001_0100/s0022_generate_parentheses/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Backtracking | 210 | 78.51
| 0079 |[Word Search](src.save/main/kotlin/g0001_0100/s0079_word_search/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Matrix, Backtracking | 463 | 68.49

#### Day 12 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0213 |[House Robber II](src.save/main/kotlin/g0201_0300/s0213_house_robber_ii/Solution.kt)| Medium | Array, Dynamic_Programming | 257 | 59.62
| 0055 |[Jump Game](src.save/main/kotlin/g0001_0100/s0055_jump_game/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Greedy | 670 | 66.67

#### Day 13 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0045 |[Jump Game II](src.save/main/kotlin/g0001_0100/s0045_jump_game_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Greedy | 227 | 98.14
| 0062 |[Unique Paths](src.save/main/kotlin/g0001_0100/s0062_unique_paths/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Combinatorics | 209 | 49.18

#### Day 14 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0005 |[Longest Palindromic Substring](src.save/main/kotlin/g0001_0100/s0005_longest_palindromic_substring/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming | 323 | 75.48
| 0413 |[Arithmetic Slices](src.save/main/kotlin/g0401_0500/s0413_arithmetic_slices/Solution.kt)| Medium | Array, Dynamic_Programming | 156 | 100.00

#### Day 15 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0091 |[Decode Ways](src.save/main/kotlin/g0001_0100/s0091_decode_ways/Solution.kt)| Medium | Top_Interview_Questions, String, Dynamic_Programming | 237 | 76.88
| 0139 |[Word Break](src.save/main/kotlin/g0101_0200/s0139_word_break/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Dynamic_Programming, Trie, Memoization | 197 | 87.17

#### Day 16 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0300 |[Longest Increasing Subsequence](src.save/main/kotlin/g0201_0300/s0300_longest_increasing_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Binary_Search | 318 | 82.28
| 0673 |[Number of Longest Increasing Subsequence](src.save/main/kotlin/g0601_0700/s0673_number_of_longest_increasing_subsequence/Solution.kt)| Medium | Array, Dynamic_Programming, Segment_Tree, Binary_Indexed_Tree | 226 | 91.67

#### Day 17 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1143 |[Longest Common Subsequence](src.save/main/kotlin/g1101_1200/s1143_longest_common_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming | 307 | 38.36
| 0583 |[Delete Operation for Two Strings](src.save/main/kotlin/g0501_0600/s0583_delete_operation_for_two_strings/Solution.kt)| Medium | String, Dynamic_Programming | 197 | 100.00

#### Day 18 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0072 |[Edit Distance](src.save/main/kotlin/g0001_0100/s0072_edit_distance/Solution.kt)| Hard | Top_100_Liked_Questions, String, Dynamic_Programming | 320 | 63.53
| 0322 |[Coin Change](src.save/main/kotlin/g0301_0400/s0322_coin_change/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Breadth_First_Search | 332 | 50.68
| 0343 |[Integer Break](src.save/main/kotlin/g0301_0400/s0343_integer_break/Solution.kt)| Medium | Dynamic_Programming, Math | 218 | 63.89

#### Day 19 Bit Manipulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0201 |[Bitwise AND of Numbers Range](src.save/main/kotlin/g0201_0300/s0201_bitwise_and_of_numbers_range/Solution.kt)| Medium | Bit_Manipulation | 368 | 80.00

#### Day 20 Others

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0384 |[Shuffle an Array](src.save/main/kotlin/g0301_0400/s0384_shuffle_an_array/Solution.kt)| Medium | Top_Interview_Questions, Array, Math, Randomized | 940 | 72.09

#### Day 21 Others

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0202 |[Happy Number](src.save/main/kotlin/g0201_0300/s0202_happy_number/Solution.kt)| Easy | Top_Interview_Questions, Hash_Table, Math, Two_Pointers | 261 | 45.08
| 0149 |[Max Points on a Line](src.save/main/kotlin/g0101_0200/s0149_max_points_on_a_line/Solution.kt)| Hard | Top_Interview_Questions, Array, Hash_Table, Math, Geometry | 307 | 83.33

### Binary Search I

#### Day 1

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0704 |[Binary Search](src.save/main/kotlin/g0701_0800/s0704_binary_search/Solution.kt)| Easy | Array, Binary_Search | 261 | 77.91
| 0374 |[Guess Number Higher or Lower](src.save/main/kotlin/g0301_0400/s0374_guess_number_higher_or_lower/Solution.kt)| Easy | Binary_Search, Interactive | 134 | 94.19

#### Day 2

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0035 |[Search Insert Position](src.save/main/kotlin/g0001_0100/s0035_search_insert_position/Solution.kt)| Easy | Top_100_Liked_Questions, Array, Binary_Search | 267 | 50.32
| 0852 |[Peak Index in a Mountain Array](src.save/main/kotlin/g0801_0900/s0852_peak_index_in_a_mountain_array/Solution.kt)| Easy | Array, Binary_Search | 433 | 94.29

#### Day 3

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0367 |[Valid Perfect Square](src.save/main/kotlin/g0301_0400/s0367_valid_perfect_square/Solution.kt)| Easy | Math, Binary_Search | 137 | 94.55
| 1385 |[Find the Distance Value Between Two Arrays](src.save/main/kotlin/g1301_1400/s1385_find_the_distance_value_between_two_arrays/Solution.kt)| Easy | Array, Sorting, Binary_Search, Two_Pointers | 190 | 84.62

#### Day 4

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0069 |[Sqrt(x)](src.save/main/kotlin/g0001_0100/s0069_sqrtx/Solution.kt)| Easy | Top_Interview_Questions, Math, Binary_Search | 153 | 95.75
| 0744 |[Find Smallest Letter Greater Than Target](src.save/main/kotlin/g0701_0800/s0744_find_smallest_letter_greater_than_target/Solution.kt)| Easy | Array, Binary_Search | 162 | 100.00

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0278 |[First Bad Version](src.save/main/kotlin/g0201_0300/s0278_first_bad_version/Solution.kt)| Easy | Binary_Search, Interactive | 349 | 76.86
| 0034 |[Find First and Last Position of Element in Sorted Array](src.save/main/kotlin/g0001_0100/s0034_find_first_and_last_position_of_element_in_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search | 228 | 83.38

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0441 |[Arranging Coins](src.save/main/kotlin/g0401_0500/s0441_arranging_coins/Solution.kt)| Easy | Math, Binary_Search | 150 | 84.21
| 1539 |[Kth Missing Positive Number](src.save/main/kotlin/g1501_1600/s1539_kth_missing_positive_number/Solution.kt)| Easy | Array, Binary_Search | 153 | 100.00

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0167 |[Two Sum II - Input Array Is Sorted](src.save/main/kotlin/g0101_0200/s0167_two_sum_ii_input_array_is_sorted/Solution.kt)| Medium | Array, Binary_Search, Two_Pointers | 403 | 68.74
| 1608 |[Special Array With X Elements Greater Than or Equal X](src/main/kotlin/g1601_1700/s1608_special_array_with_x_elements_greater_than_or_equal_x/Solution.kt)| Easy | Array, Sorting, Binary_Search | 147 | 81.82

#### Day 8

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1351 |[Count Negative Numbers in a Sorted Matrix](src.save/main/kotlin/g1301_1400/s1351_count_negative_numbers_in_a_sorted_matrix/Solution.kt)| Easy | Array, Binary_Search, Matrix | 206 | 71.43
| 0074 |[Search a 2D Matrix](src.save/main/kotlin/g0001_0100/s0074_search_a_2d_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix | 290 | 40.17

#### Day 9

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1337 |[The K Weakest Rows in a Matrix](src.save/main/kotlin/g1301_1400/s1337_the_k_weakest_rows_in_a_matrix/Solution.kt)| Easy | Array, Sorting, Binary_Search, Matrix, Heap_Priority_Queue | 216 | 77.59
| 1346 |[Check If N and Its Double Exist](src.save/main/kotlin/g1301_1400/s1346_check_if_n_and_its_double_exist/Solution.kt)| Easy | Array, Hash_Table, Sorting, Binary_Search, Two_Pointers | 175 | 70.83

#### Day 10

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0350 |[Intersection of Two Arrays II](src.save/main/kotlin/g0301_0400/s0350_intersection_of_two_arrays_ii/Solution.kt)| Easy | Top_Interview_Questions, Array, Hash_Table, Sorting, Binary_Search, Two_Pointers | 321 | 73.37
| 0633 |[Sum of Square Numbers](src.save/main/kotlin/g0601_0700/s0633_sum_of_square_numbers/Solution.kt)| Medium | Math, Binary_Search, Two_Pointers | 126 | 100.00

#### Day 11

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0033 |[Search in Rotated Sorted Array](src.save/main/kotlin/g0001_0100/s0033_search_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search | 184 | 86.08

#### Day 12

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0153 |[Find Minimum in Rotated Sorted Array](src.save/main/kotlin/g0101_0200/s0153_find_minimum_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search | 262 | 60.96

### Binary Search II

#### Day 1

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0209 |[Minimum Size Subarray Sum](src.save/main/kotlin/g0201_0300/s0209_minimum_size_subarray_sum/Solution.kt)| Medium | Array, Binary_Search, Prefix_Sum, Sliding_Window | 315 | 96.73
| 0611 |[Valid Triangle Number](src.save/main/kotlin/g0601_0700/s0611_valid_triangle_number/Solution.kt)| Medium | Array, Sorting, Greedy, Binary_Search, Two_Pointers | 203 | 100.00

#### Day 2

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0658 |[Find K Closest Elements](src.save/main/kotlin/g0601_0700/s0658_find_k_closest_elements/Solution.kt)| Medium | Array, Sorting, Binary_Search, Two_Pointers, Heap_Priority_Queue | 375 | 95.16

#### Day 3

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0300 |[Longest Increasing Subsequence](src.save/main/kotlin/g0201_0300/s0300_longest_increasing_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Binary_Search | 318 | 82.28
| 1760 |[Minimum Limit of Balls in a Bag](src/main/kotlin/g1701_1800/s1760_minimum_limit_of_balls_in_a_bag/Solution.kt)| Medium | Array, Binary_Search | 460 | 100.00

#### Day 4

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0875 |[Koko Eating Bananas](src.save/main/kotlin/g0801_0900/s0875_koko_eating_bananas/Solution.kt)| Medium | Array, Binary_Search | 267 | 93.85
| 1552 |[Magnetic Force Between Two Balls](src.save/main/kotlin/g1501_1600/s1552_magnetic_force_between_two_balls/Solution.kt)| Medium | Array, Sorting, Binary_Search | 636 | 100.00

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0287 |[Find the Duplicate Number](src.save/main/kotlin/g0201_0300/s0287_find_the_duplicate_number/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Two_Pointers, Bit_Manipulation | 656 | 66.21
| 1283 |[Find the Smallest Divisor Given a Threshold](src.save/main/kotlin/g1201_1300/s1283_find_the_smallest_divisor_given_a_threshold/Solution.kt)| Medium | Array, Binary_Search | 255 | 100.00

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1482 |[Minimum Number of Days to Make m Bouquets](src.save/main/kotlin/g1401_1500/s1482_minimum_number_of_days_to_make_m_bouquets/Solution.kt)| Medium | Array, Binary_Search | 538 | 50.00

#### Day 8

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0240 |[Search a 2D Matrix II](src.save/main/kotlin/g0201_0300/s0240_search_a_2d_matrix_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Matrix, Divide_and_Conquer | 460 | 66.08
| 0275 |[H-Index II](src.save/main/kotlin/g0201_0300/s0275_h_index_ii/Solution.kt)| Medium | Array, Binary_Search | 398 | 81.82

#### Day 9

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0540 |[Single Element in a Sorted Array](src.save/main/kotlin/g0501_0600/s0540_single_element_in_a_sorted_array/Solution.kt)| Medium | Array, Binary_Search | 274 | 86.67

#### Day 10

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0222 |[Count Complete Tree Nodes](src.save/main/kotlin/g0201_0300/s0222_count_complete_tree_nodes/Solution.kt)| |||
| 1712 |[Ways to Split Array Into Three Subarrays](src/main/kotlin/g1701_1800/s1712_ways_to_split_array_into_three_subarrays/Solution.kt)| Medium | Array, Binary_Search, Two_Pointers, Prefix_Sum | 486 | 100.00

#### Day 11

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0826 |[Most Profit Assigning Work](src.save/main/kotlin/g0801_0900/s0826_most_profit_assigning_work/Solution.kt)| Medium | Array, Sorting, Greedy, Binary_Search, Two_Pointers | 366 | 100.00
| 0436 |[Find Right Interval](src.save/main/kotlin/g0401_0500/s0436_find_right_interval/Solution.kt)| Medium | Array, Sorting, Binary_Search | 333 | 100.00

#### Day 12

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0081 |[Search in Rotated Sorted Array II](src.save/main/kotlin/g0001_0100/s0081_search_in_rotated_sorted_array_ii/Solution.kt)| Medium | Array, Binary_Search | 352 | 42.31
| 0162 |[Find Peak Element](src.save/main/kotlin/g0101_0200/s0162_find_peak_element/Solution.kt)| Medium | Top_Interview_Questions, Array, Binary_Search | 297 | 53.85

#### Day 13

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0154 |[Find Minimum in Rotated Sorted Array II](src.save/main/kotlin/g0101_0200/s0154_find_minimum_in_rotated_sorted_array_ii/Solution.kt)| Hard | Array, Binary_Search | 275 | 84.00
| 0528 |[Random Pick with Weight](src.save/main/kotlin/g0501_0600/s0528_random_pick_with_weight/Solution.kt)| Medium | Math, Binary_Search, Prefix_Sum, Randomized | 393 | 91.38

#### Day 14

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1508 |[Range Sum of Sorted Subarray Sums](src.save/main/kotlin/g1501_1600/s1508_range_sum_of_sorted_subarray_sums/Solution.kt)| Medium | Array, Sorting, Binary_Search, Two_Pointers | 378 | 66.67
| 1574 |[Shortest Subarray to be Removed to Make Array Sorted](src.save/main/kotlin/g1501_1600/s1574_shortest_subarray_to_be_removed_to_make_array_sorted/Solution.kt)| Medium | Array, Binary_Search, Two_Pointers, Stack, Monotonic_Stack | 477 | 50.00

#### Day 15

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1292 |[Maximum Side Length of a Square with Sum Less than or Equal to Threshold](src.save/main/kotlin/g1201_1300/s1292_maximum_side_length_of_a_square_with_sum_less_than_or_equal_to_threshold/Solution.kt)| Medium | Array, Binary_Search, Matrix, Prefix_Sum | 376 | 100.00
| 1498 |[Number of Subsequences That Satisfy the Given Sum Condition](src.save/main/kotlin/g1401_1500/s1498_number_of_subsequences_that_satisfy_the_given_sum_condition/Solution.kt)| Medium | Array, Sorting, Binary_Search, Two_Pointers | 487 | 97.89

#### Day 16

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0981 |[Time Based Key-Value Store](src.save/main/kotlin/g0901_1000/s0981_time_based_key_value_store/TimeMap.kt)| Medium | String, Hash_Table, Binary_Search, Design | 1555 | 10.00
| 1300 |[Sum of Mutated Array Closest to Target](src.save/main/kotlin/g1201_1300/s1300_sum_of_mutated_array_closest_to_target/Solution.kt)| Medium | Array, Sorting, Binary_Search | 217 | 100.00

#### Day 17

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 18

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1146 |[Snapshot Array](src.save/main/kotlin/g1101_1200/s1146_snapshot_array/SnapshotArray.kt)| Medium | Array, Hash_Table, Binary_Search, Design | 1064 | 57.14
| 1488 |[Avoid Flood in The City](src.save/main/kotlin/g1401_1500/s1488_avoid_flood_in_the_city/Solution.kt)| Medium | Array, Hash_Table, Greedy, Binary_Search, Heap_Priority_Queue | 823 | 66.67

#### Day 19

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1562 |[Find Latest Group of Size M](src.save/main/kotlin/g1501_1600/s1562_find_latest_group_of_size_m/Solution.kt)| Medium | Array, Binary_Search, Simulation | 534 | 100.00
| 1648 |[Sell Diminishing-Valued Colored Balls](src/main/kotlin/g1601_1700/s1648_sell_diminishing_valued_colored_balls/Solution.kt)| Medium | Array, Math, Sorting, Greedy, Binary_Search, Heap_Priority_Queue | 509 | 100.00

#### Day 20

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1201 |[Ugly Number III](src.save/main/kotlin/g1201_1300/s1201_ugly_number_iii/Solution.kt)| Medium | Math, Binary_Search, Number_Theory | 136 | 100.00
| 0911 |[Online Election](src.save/main/kotlin/g0901_1000/s0911_online_election/TopVotedCandidate.kt)| Medium | Array, Hash_Table, Binary_Search, Design | 766 | 83.33

### Dynamic Programming I

#### Day 1

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0509 |[Fibonacci Number](src.save/main/kotlin/g0501_0600/s0509_fibonacci_number/Solution.kt)| Easy | Dynamic_Programming, Math, Recursion, Memoization | 139 | 82.72
| 1137 |[N-th Tribonacci Number](src.save/main/kotlin/g1101_1200/s1137_n_th_tribonacci_number/Solution.kt)| Easy | Dynamic_Programming, Math, Memoization | 122 | 69.35

#### Day 2

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0070 |[Climbing Stairs](src.save/main/kotlin/g0001_0100/s0070_climbing_stairs/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization | 127 | 97.06
| 0746 |[Min Cost Climbing Stairs](src.save/main/kotlin/g0701_0800/s0746_min_cost_climbing_stairs/Solution.kt)| Easy | Array, Dynamic_Programming | 171 | 96.76

#### Day 3

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0198 |[House Robber](src.save/main/kotlin/g0101_0200/s0198_house_robber/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 156 | 92.24
| 0213 |[House Robber II](src.save/main/kotlin/g0201_0300/s0213_house_robber_ii/Solution.kt)| Medium | Array, Dynamic_Programming | 257 | 59.62
| 0740 |[Delete and Earn](src.save/main/kotlin/g0701_0800/s0740_delete_and_earn/Solution.kt)| Medium | Array, Hash_Table, Dynamic_Programming | 192 | 100.00

#### Day 4

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0055 |[Jump Game](src.save/main/kotlin/g0001_0100/s0055_jump_game/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Greedy | 670 | 66.67
| 0045 |[Jump Game II](src.save/main/kotlin/g0001_0100/s0045_jump_game_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Greedy | 227 | 98.14

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0053 |[Maximum Subarray](src.save/main/kotlin/g0001_0100/s0053_maximum_subarray/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Divide_and_Conquer | 662 | 82.48
| 0918 |[Maximum Sum Circular Subarray](src.save/main/kotlin/g0901_1000/s0918_maximum_sum_circular_subarray/Solution.kt)| Medium | Array, Dynamic_Programming, Divide_and_Conquer, Queue, Monotonic_Queue | 339 | 86.96

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0152 |[Maximum Product Subarray](src.save/main/kotlin/g0101_0200/s0152_maximum_product_subarray/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 253 | 88.42
| 1567 |[Maximum Length of Subarray With Positive Product](src.save/main/kotlin/g1501_1600/s1567_maximum_length_of_subarray_with_positive_product/Solution.kt)| Medium | Array, Dynamic_Programming, Greedy | 468 | 33.33

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1014 |[Best Sightseeing Pair](src.save/main/kotlin/g1001_1100/s1014_best_sightseeing_pair/Solution.kt)| Medium | Array, Dynamic_Programming | 336 | 66.67
| 0121 |[Best Time to Buy and Sell Stock](src.save/main/kotlin/g0101_0200/s0121_best_time_to_buy_and_sell_stock/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 609 | 94.06
| 0122 |[Best Time to Buy and Sell Stock II](src.save/main/kotlin/g0101_0200/s0122_best_time_to_buy_and_sell_stock_ii/Solution.kt)| Medium | Top_Interview_Questions, Array, Dynamic_Programming, Greedy | 197 | 95.10

#### Day 8

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0309 |[Best Time to Buy and Sell Stock with Cooldown](src.save/main/kotlin/g0301_0400/s0309_best_time_to_buy_and_sell_stock_with_cooldown/Solution.kt)| Medium | Array, Dynamic_Programming | 272 | 73.33
| 0714 |[Best Time to Buy and Sell Stock with Transaction Fee](src.save/main/kotlin/g0701_0800/s0714_best_time_to_buy_and_sell_stock_with_transaction_fee/Solution.kt)| Medium | Array, Dynamic_Programming, Greedy | 417 | 90.91

#### Day 9

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0139 |[Word Break](src.save/main/kotlin/g0101_0200/s0139_word_break/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Dynamic_Programming, Trie, Memoization | 197 | 87.17
| 0042 |[Trapping Rain Water](src.save/main/kotlin/g0001_0100/s0042_trapping_rain_water/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Two_Pointers, Stack, Monotonic_Stack | 196 | 100.00

#### Day 10

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0413 |[Arithmetic Slices](src.save/main/kotlin/g0401_0500/s0413_arithmetic_slices/Solution.kt)| Medium | Array, Dynamic_Programming | 156 | 100.00
| 0091 |[Decode Ways](src.save/main/kotlin/g0001_0100/s0091_decode_ways/Solution.kt)| Medium | Top_Interview_Questions, String, Dynamic_Programming | 237 | 76.88

#### Day 11

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0264 |[Ugly Number II](src.save/main/kotlin/g0201_0300/s0264_ugly_number_ii/Solution.kt)| Medium | Hash_Table, Dynamic_Programming, Math, Heap_Priority_Queue | 182 | 95.45
| 0096 |[Unique Binary Search Trees](src.save/main/kotlin/g0001_0100/s0096_unique_binary_search_trees/Solution.kt)| Medium | Top_100_Liked_Questions, Dynamic_Programming, Math, Tree, Binary_Tree, Binary_Search_Tree | 147 | 88.52

#### Day 12

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0118 |[Pascal's Triangle](src.save/main/kotlin/g0101_0200/s0118_pascals_triangle/Solution.kt)| Easy | Top_Interview_Questions, Array, Dynamic_Programming | 277 | 33.22
| 0119 |[Pascal's Triangle II](src.save/main/kotlin/g0101_0200/s0119_pascals_triangle_ii/Solution.kt)| Easy | Array, Dynamic_Programming | 157 | 97.27

#### Day 13

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0931 |[Minimum Falling Path Sum](src.save/main/kotlin/g0901_1000/s0931_minimum_falling_path_sum/Solution.kt)| Medium | Array, Dynamic_Programming, Matrix | 201 | 84.21
| 0120 |[Triangle](src.save/main/kotlin/g0101_0200/s0120_triangle/Solution.kt)| Medium | Array, Dynamic_Programming | 194 | 97.87

#### Day 14

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1314 |[Matrix Block Sum](src.save/main/kotlin/g1301_1400/s1314_matrix_block_sum/Solution.kt)| Medium | Array, Matrix, Prefix_Sum | 235 | 100.00
| 0304 |[Range Sum Query 2D - Immutable](src.save/main/kotlin/g0301_0400/s0304_range_sum_query_2d_immutable/NumMatrix.kt)| Medium | Array, Matrix, Design, Prefix_Sum | 1373 | 85.71

#### Day 15

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0062 |[Unique Paths](src.save/main/kotlin/g0001_0100/s0062_unique_paths/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Combinatorics | 209 | 49.18
| 0063 |[Unique Paths II](src.save/main/kotlin/g0001_0100/s0063_unique_paths_ii/Solution.kt)| Medium | Array, Dynamic_Programming, Matrix | 187 | 84.62

#### Day 16

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0064 |[Minimum Path Sum](src.save/main/kotlin/g0001_0100/s0064_minimum_path_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Matrix | 222 | 95.70
| 0221 |[Maximal Square](src.save/main/kotlin/g0201_0300/s0221_maximal_square/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Matrix | 614 | 44.00

#### Day 17

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0005 |[Longest Palindromic Substring](src.save/main/kotlin/g0001_0100/s0005_longest_palindromic_substring/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming | 323 | 75.48
| 0516 |[Longest Palindromic Subsequence](src.save/main/kotlin/g0501_0600/s0516_longest_palindromic_subsequence/Solution.kt)| Medium | String, Dynamic_Programming | 243 | 87.50

#### Day 18

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0300 |[Longest Increasing Subsequence](src.save/main/kotlin/g0201_0300/s0300_longest_increasing_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Binary_Search | 318 | 82.28
| 0376 |[Wiggle Subsequence](src.save/main/kotlin/g0301_0400/s0376_wiggle_subsequence/Solution.kt)| Medium | Array, Dynamic_Programming, Greedy | 162 | 88.89

#### Day 19

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0392 |[Is Subsequence](src.save/main/kotlin/g0301_0400/s0392_is_subsequence/Solution.kt)| Easy | String, Dynamic_Programming, Two_Pointers | 156 | 87.74
| 1143 |[Longest Common Subsequence](src.save/main/kotlin/g1101_1200/s1143_longest_common_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming | 307 | 38.36
| 0072 |[Edit Distance](src.save/main/kotlin/g0001_0100/s0072_edit_distance/Solution.kt)| Hard | Top_100_Liked_Questions, String, Dynamic_Programming | 320 | 63.53

#### Day 20

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0322 |[Coin Change](src.save/main/kotlin/g0301_0400/s0322_coin_change/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Breadth_First_Search | 332 | 50.68
| 0518 |[Coin Change II](src.save/main/kotlin/g0501_0600/s0518_coin_change_2/Solution.kt)| Medium | Array, Dynamic_Programming | 139 | 100.00

#### Day 21

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0377 |[Combination Sum IV](src.save/main/kotlin/g0301_0400/s0377_combination_sum_iv/Solution.kt)| Medium | Array, Dynamic_Programming | 217 | 72.41
| 0343 |[Integer Break](src.save/main/kotlin/g0301_0400/s0343_integer_break/Solution.kt)| Medium | Dynamic_Programming, Math | 218 | 63.89
| 0279 |[Perfect Squares](src.save/main/kotlin/g0201_0300/s0279_perfect_squares/Solution.kt)| Medium | Top_Interview_Questions, Dynamic_Programming, Math, Breadth_First_Search | 176 | 98.80

### Programming Skills I

#### Day 1 Basic Data Type

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1523 |[Count Odd Numbers in an Interval Range](src.save/main/kotlin/g1501_1600/s1523_count_odd_numbers_in_an_interval_range/Solution.kt)| Easy | Math | 114 | 97.22
| 1491 |[Average Salary Excluding the Minimum and Maximum Salary](src.save/main/kotlin/g1401_1500/s1491_average_salary_excluding_the_minimum_and_maximum_salary/Solution.kt)| Easy | Array, Sorting | 165 | 27.87

#### Day 2 Operator

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0191 |[Number of 1 Bits](src.save/main/kotlin/g0101_0200/s0191_number_of_1_bits/Solution.kt)| Easy | Top_Interview_Questions, Bit_Manipulation | 237 | 68.44
| 1281 |[Subtract the Product and Sum of Digits of an Integer](src.save/main/kotlin/g1201_1300/s1281_subtract_the_product_and_sum_of_digits_of_an_integer/Solution.kt)| Easy | Math | 128 | 61.82

#### Day 3 Conditional Statements

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0976 |[Largest Perimeter Triangle](src.save/main/kotlin/g0901_1000/s0976_largest_perimeter_triangle/Solution.kt)| Easy | Array, Math, Sorting, Greedy | 304 | 33.33
| 1779 |[Find Nearest Point That Has the Same X or Y Coordinate](src/main/kotlin/g1701_1800/s1779_find_nearest_point_that_has_the_same_x_or_y_coordinate/Solution.kt)| Easy | Array | 364 | 100.00

#### Day 4 Loop

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1502 |[Can Make Arithmetic Progression From Sequence](src.save/main/kotlin/g1501_1600/s1502_can_make_arithmetic_progression_from_sequence/Solution.kt)| Easy | Array, Sorting | 156 | 94.82
| 0202 |[Happy Number](src.save/main/kotlin/g0201_0300/s0202_happy_number/Solution.kt)| Easy | Top_Interview_Questions, Hash_Table, Math, Two_Pointers | 261 | 45.08
| 1790 |[Check if One String Swap Can Make Strings Equal](src/main/kotlin/g1701_1800/s1790_check_if_one_string_swap_can_make_strings_equal/Solution.kt)| Easy | String, Hash_Table, Counting | 138 | 100.00

#### Day 5 Function

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0589 |[N-ary Tree Preorder Traversal](src.save/main/kotlin/g0501_0600/s0589_n_ary_tree_preorder_traversal/Solution.kt)| Easy | Depth_First_Search, Tree, Stack | 233 | 84.02
| 0496 |[Next Greater Element I](src.save/main/kotlin/g0401_0500/s0496_next_greater_element_i/Solution.kt)| Easy | Array, Hash_Table, Stack, Monotonic_Stack | 171 | 100.00
| 1232 |[Check If It Is a Straight Line](src.save/main/kotlin/g1201_1300/s1232_check_if_it_is_a_straight_line/Solution.kt)| Easy | Array, Math, Geometry | 152 | 95.38

#### Day 6 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1588 |[Sum of All Odd Length Subarrays](src.save/main/kotlin/g1501_1600/s1588_sum_of_all_odd_length_subarrays/Solution.kt)| Easy | Array, Math, Prefix_Sum | 157 | 64.00
| 0283 |[Move Zeroes](src.save/main/kotlin/g0201_0300/s0283_move_zeroes/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Two_Pointers | 516 | 79.07
| 1672 |[Richest Customer Wealth](src/main/kotlin/g1601_1700/s1672_richest_customer_wealth/Solution.kt)| Easy | Array, Matrix | 155 | 94.54

#### Day 7 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1572 |[Matrix Diagonal Sum](src.save/main/kotlin/g1501_1600/s1572_matrix_diagonal_sum/Solution.kt)| Easy | Array, Matrix | 221 | 67.61
| 0566 |[Reshape the Matrix](src.save/main/kotlin/g0501_0600/s0566_reshape_the_matrix/Solution.kt)| Easy | Array, Matrix, Simulation | 239 | 99.05

#### Day 8 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1768 |[Merge Strings Alternately](src/main/kotlin/g1701_1800/s1768_merge_strings_alternately/Solution.kt)| Easy | String, Two_Pointers | 138 | 93.81
| 1678 |[Goal Parser Interpretation](src/main/kotlin/g1601_1700/s1678_goal_parser_interpretation/Solution.kt)| Easy | String | 136 | 88.24
| 0389 |[Find the Difference](src.save/main/kotlin/g0301_0400/s0389_find_the_difference/Solution.kt)| Easy | String, Hash_Table, Sorting, Bit_Manipulation | 256 | 64.81

#### Day 9 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0709 |[To Lower Case](src.save/main/kotlin/g0701_0800/s0709_to_lower_case/Solution.kt)| Easy | String | 142 | 98.68
| 1309 |[Decrypt String from Alphabet to Integer Mapping](src.save/main/kotlin/g1301_1400/s1309_decrypt_string_from_alphabet_to_integer_mapping/Solution.kt)| Easy | String | 129 | 95.45
| 0953 |[Verifying an Alien Dictionary](src.save/main/kotlin/g0901_1000/s0953_verifying_an_alien_dictionary/Solution.kt)| Easy | Array, String, Hash_Table | 137 | 100.00

#### Day 10 Linked List and Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1290 |[Convert Binary Number in a Linked List to Integer](src.save/main/kotlin/g1201_1300/s1290_convert_binary_number_in_a_linked_list_to_integer/Solution.kt)| Easy | Math, Linked_List | 145 | 25.93
| 0876 |[Middle of the Linked List](src.save/main/kotlin/g0801_0900/s0876_middle_of_the_linked_list/Solution.kt)| Easy | Two_Pointers, Linked_List | 136 | 76.52
| 0104 |[Maximum Depth of Binary Tree](src.save/main/kotlin/g0101_0200/s0104_maximum_depth_of_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 236 | 83.39
| 0404 |[Sum of Left Leaves](src.save/main/kotlin/g0401_0500/s0404_sum_of_left_leaves/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 173 | 86.05

#### Day 11 Containers and Libraries

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1356 |[Sort Integers by The Number of 1 Bits](src.save/main/kotlin/g1301_1400/s1356_sort_integers_by_the_number_of_1_bits/Solution.kt)| Easy | Array, Sorting, Bit_Manipulation, Counting | 236 | 92.31
| 0232 |[Implement Queue using Stacks](src.save/main/kotlin/g0201_0300/s0232_implement_queue_using_stacks/MyQueue.kt)| Easy | Stack, Design, Queue | 258 | 70.86
| 0242 |[Valid Anagram](src.save/main/kotlin/g0201_0300/s0242_valid_anagram/Solution.kt)| Easy | Top_Interview_Questions, String, Hash_Table, Sorting | 251 | 87.65
| 0217 |[Contains Duplicate](src.save/main/kotlin/g0201_0300/s0217_contains_duplicate/Solution.kt)| Easy | Top_Interview_Questions, Array, Hash_Table, Sorting | 719 | 73.49

#### Day 12 Class and Object

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1603 |[Design Parking System](src/main/kotlin/g1601_1700/s1603_design_parking_system/ParkingSystem.kt)| Easy | Design, Simulation, Counting | 376 | 31.83
| 0303 |[Range Sum Query - Immutable](src.save/main/kotlin/g0301_0400/s0303_range_sum_query_immutable/NumArray.kt)| Easy | Array, Design, Prefix_Sum | 472 | 63.64

### Programming Skills II

#### Day 1

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0896 |[Monotonic Array](src.save/main/kotlin/g0801_0900/s0896_monotonic_array/Solution.kt)| Easy | Array | 576 | 90.91
| 0028 |[Find the Index of the First Occurrence in a String](src.save/main/kotlin/g0001_0100/s0028_implement_strstr/Solution.kt)| Easy | Top_Interview_Questions, String, Two_Pointers, String_Matching | 257 | 32.35

#### Day 2

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0110 |[Balanced Binary Tree](src.save/main/kotlin/g0101_0200/s0110_balanced_binary_tree/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree | 310 | 63.63
| 0459 |[Repeated Substring Pattern](src.save/main/kotlin/g0401_0500/s0459_repeated_substring_pattern/Solution.kt)| Easy | String, String_Matching | 201 | 100.00

#### Day 3

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0150 |[Evaluate Reverse Polish Notation](src.save/main/kotlin/g0101_0200/s0150_evaluate_reverse_polish_notation/Solution.kt)| Medium | Top_Interview_Questions, Array, Math, Stack | 233 | 88.82
| 0066 |[Plus One](src.save/main/kotlin/g0001_0100/s0066_plus_one/Solution.kt)| Easy | Top_Interview_Questions, Array, Math | 303 | 35.18

#### Day 4

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1367 |[Linked List in Binary Tree](src.save/main/kotlin/g1301_1400/s1367_linked_list_in_binary_tree/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Linked_List | 237 | 92.86
| 0043 |[Multiply Strings](src.save/main/kotlin/g0001_0100/s0043_multiply_strings/Solution.kt)| Medium | String, Math, Simulation | 390 | 56.25

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0067 |[Add Binary](src.save/main/kotlin/g0001_0100/s0067_add_binary/Solution.kt)| Easy | String, Math, Bit_Manipulation, Simulation | 327 | 32.67
| 0989 |[Add to Array-Form of Integer](src.save/main/kotlin/g0901_1000/s0989_add_to_array_form_of_integer/Solution.kt)| Easy | Array, Math | 350 | 70.00

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0739 |[Daily Temperatures](src.save/main/kotlin/g0701_0800/s0739_daily_temperatures/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Stack, Monotonic_Stack | 936 | 80.54
| 0058 |[Length of Last Word](src.save/main/kotlin/g0001_0100/s0058_length_of_last_word/Solution.kt)| Easy | String | 243 | 63.33

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0048 |[Rotate Image](src.save/main/kotlin/g0001_0100/s0048_rotate_image/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Matrix | 287 | 46.50

#### Day 8

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0054 |[Spiral Matrix](src.save/main/kotlin/g0001_0100/s0054_spiral_matrix/Solution.kt)| Medium | Top_Interview_Questions, Array, Matrix, Simulation | 224 | 62.50
| 0973 |[K Closest Points to Origin](src.save/main/kotlin/g0901_1000/s0973_k_closest_points_to_origin/Solution.kt)| Medium | Array, Math, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Geometry, Quickselect | 800 | 37.89

#### Day 9

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1630 |[Arithmetic Subarrays](src/main/kotlin/g1601_1700/s1630_arithmetic_subarrays/Solution.kt)| Medium | Array, Sorting | 264 | 100.00
| 0429 |[N-ary Tree Level Order Traversal](src.save/main/kotlin/g0401_0500/s0429_n_ary_tree_level_order_traversal/Solution.kt)| Medium | Breadth_First_Search, Tree | 248 | 75.86

#### Day 10

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0503 |[Next Greater Element II](src.save/main/kotlin/g0501_0600/s0503_next_greater_element_ii/Solution.kt)| Medium | Array, Stack, Monotonic_Stack | 331 | 92.68
| 0556 |[Next Greater Element III](src.save/main/kotlin/g0501_0600/s0556_next_greater_element_iii/Solution.kt)| Medium | String, Math, Two_Pointers | 137 | 80.00

#### Day 11

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1376 |[Time Needed to Inform All Employees](src.save/main/kotlin/g1301_1400/s1376_time_needed_to_inform_all_employees/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree | 915 | 37.62
| 0049 |[Group Anagrams](src.save/main/kotlin/g0001_0100/s0049_group_anagrams/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, String, Hash_Table, Sorting | 506 | 86.55

#### Day 12

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0438 |[Find All Anagrams in a String](src.save/main/kotlin/g0401_0500/s0438_find_all_anagrams_in_a_string/Solution.kt)| Medium | Top_100_Liked_Questions, String, Hash_Table, Sliding_Window | 561 | 54.68
| 0713 |[Subarray Product Less Than K](src.save/main/kotlin/g0701_0800/s0713_subarray_product_less_than_k/Solution.kt)| Medium | Array, Sliding_Window | 336 | 92.11

#### Day 13

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0304 |[Range Sum Query 2D - Immutable](src.save/main/kotlin/g0301_0400/s0304_range_sum_query_2d_immutable/NumMatrix.kt)| Medium | Array, Matrix, Design, Prefix_Sum | 1373 | 85.71
| 0910 |[Smallest Range II](src.save/main/kotlin/g0901_1000/s0910_smallest_range_ii/Solution.kt)| Medium | Array, Math, Sorting, Greedy | 234 | 100.00

#### Day 14

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0143 |[Reorder List](src.save/main/kotlin/g0101_0200/s0143_reorder_list/Solution.kt)| Medium | Two_Pointers, Stack, Linked_List, Recursion | 395 | 82.26
| 0138 |[Copy List with Random Pointer](src.save/main/kotlin/g0101_0200/s0138_copy_list_with_random_pointer/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Linked_List | 274 | 80.58

#### Day 15

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0002 |[Add Two Numbers](src.save/main/kotlin/g0001_0100/s0002_add_two_numbers/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Math, Linked_List, Recursion | 417 | 50.44
| 0445 |[Add Two Numbers II](src.save/main/kotlin/g0401_0500/s0445_add_two_numbers_ii/Solution.kt)| Medium | Math, Stack, Linked_List | 240 | 82.61

#### Day 16

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0061 |[Rotate List](src.save/main/kotlin/g0001_0100/s0061_rotate_list/Solution.kt)| Medium | Two_Pointers, Linked_List | 193 | 92.16
| 0173 |[Binary Search Tree Iterator](src.save/main/kotlin/g0101_0200/s0173_binary_search_tree_iterator/BSTIterator.kt)| Medium | Tree, Binary_Tree, Stack, Design, Binary_Search_Tree, Iterator | 563 | 46.91

#### Day 17

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0860 |[Lemonade Change](src.save/main/kotlin/g0801_0900/s0860_lemonade_change/Solution.kt)| Easy | Array, Greedy | 413 | 86.96

#### Day 18

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0155 |[Min Stack](src.save/main/kotlin/g0101_0200/s0155_min_stack/MinStack.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design | 331 | 84.88
| 0341 |[Flatten Nested List Iterator](src.save/main/kotlin/g0301_0400/s0341_flatten_nested_list_iterator/NestedIterator.kt)| Medium | Top_Interview_Questions, Depth_First_Search, Tree, Stack, Design, Queue, Iterator | 210 | 100.00

#### Day 19

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1797 |[Design Authentication Manager](src/main/kotlin/g1701_1800/s1797_design_authentication_manager/AuthenticationManager.kt)| Medium | Hash_Table, Design | 334 | 100.00
| 0707 |[Design Linked List](src.save/main/kotlin/g0701_0800/s0707_design_linked_list/MyLinkedList.kt)| Medium | Design, Linked_List | 243 | 100.00

#### Day 20

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0380 |[Insert Delete GetRandom O(1)](src.save/main/kotlin/g0301_0400/s0380_insert_delete_getrandom_o1/RandomizedSet.kt)| Medium | Top_Interview_Questions, Array, Hash_Table, Math, Design, Randomized | 1326 | 68.23
| 0622 |[Design Circular Queue](src.save/main/kotlin/g0601_0700/s0622_design_circular_queue/MyCircularQueue.kt)| Medium | Array, Design, Linked_List, Queue | 234 | 92.68
| 0729 |[My Calendar I](src.save/main/kotlin/g0701_0800/s0729_my_calendar_i/MyCalendar.kt)| Medium | Binary_Search, Design, Ordered_Set, Segment_Tree | 378 | 69.70

### Graph Theory I

#### Day 1 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0733 |[Flood Fill](src.save/main/kotlin/g0701_0800/s0733_flood_fill/Solution.kt)| Easy | Array, Depth_First_Search, Breadth_First_Search, Matrix | 230 | 97.76
| 0200 |[Number of Islands](src.save/main/kotlin/g0101_0200/s0200_number_of_islands/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 252 | 95.41

#### Day 2 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0695 |[Max Area of Island](src.save/main/kotlin/g0601_0700/s0695_max_area_of_island/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 324 | 24.06
| 1254 |[Number of Closed Islands](src.save/main/kotlin/g1201_1300/s1254_number_of_closed_islands/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 177 | 89.47

#### Day 3 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1020 |[Number of Enclaves](src.save/main/kotlin/g1001_1100/s1020_number_of_enclaves/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 369 | 76.26

#### Day 4 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1162 |[As Far from Land as Possible](src.save/main/kotlin/g1101_1200/s1162_as_far_from_land_as_possible/Solution.kt)| Medium | Array, Dynamic_Programming, Breadth_First_Search, Matrix | 362 | 81.25
| 0417 |[Pacific Atlantic Water Flow](src.save/main/kotlin/g0401_0500/s0417_pacific_atlantic_water_flow/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix | 319 | 100.00

#### Day 5 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1091 |[Shortest Path in Binary Matrix](src.save/main/kotlin/g1001_1100/s1091_shortest_path_in_binary_matrix/Solution.kt)| Medium | Array, Breadth_First_Search, Matrix | 305 | 98.28
| 0542 |[01 Matrix](src.save/main/kotlin/g0501_0600/s0542_01_matrix/Solution.kt)| Medium | Array, Dynamic_Programming, Breadth_First_Search, Matrix | 441 | 94.06

#### Day 6 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0934 |[Shortest Bridge](src.save/main/kotlin/g0901_1000/s0934_shortest_bridge/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix | 301 | 80.95

#### Day 7 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0797 |[All Paths From Source to Target](src.save/main/kotlin/g0701_0800/s0797_all_paths_from_source_to_target/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Backtracking | 232 | 100.00
| 0841 |[Keys and Rooms](src.save/main/kotlin/g0801_0900/s0841_keys_and_rooms/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph | 189 | 69.23

#### Day 8 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0547 |[Number of Provinces](src.save/main/kotlin/g0501_0600/s0547_number_of_provinces/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 229 | 79.73
| 1319 |[Number of Operations to Make Network Connected](src.save/main/kotlin/g1301_1400/s1319_number_of_operations_to_make_network_connected/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 379 | 83.33

#### Day 9 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1376 |[Time Needed to Inform All Employees](src.save/main/kotlin/g1301_1400/s1376_time_needed_to_inform_all_employees/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree | 915 | 37.62
| 0802 |[Find Eventual Safe States](src.save/main/kotlin/g0801_0900/s0802_find_eventual_safe_states/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Topological_Sort | 511 | 100.00

#### Day 10 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1129 |[Shortest Path with Alternating Colors](src.save/main/kotlin/g1101_1200/s1129_shortest_path_with_alternating_colors/Solution.kt)| Medium | Breadth_First_Search, Graph | 241 | 16.67
| 1466 |[Reorder Routes to Make All Paths Lead to the City Zero](src.save/main/kotlin/g1401_1500/s1466_reorder_routes_to_make_all_paths_lead_to_the_city_zero/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph | 718 | 100.00
| 0847 |[Shortest Path Visiting All Nodes](src.save/main/kotlin/g0801_0900/s0847_shortest_path_visiting_all_nodes/Solution.kt)| Hard | Dynamic_Programming, Breadth_First_Search, Bit_Manipulation, Graph, Bitmask | 164 | 100.00

#### Day 11 Breadth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1306 |[Jump Game III](src.save/main/kotlin/g1301_1400/s1306_jump_game_iii/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search | 291 | 100.00
| 1654 |[Minimum Jumps to Reach Home](src/main/kotlin/g1601_1700/s1654_minimum_jumps_to_reach_home/Solution.kt)| Medium | Array, Dynamic_Programming, Breadth_First_Search | 192 | 100.00
| 0365 |[Water and Jug Problem](src.save/main/kotlin/g0301_0400/s0365_water_and_jug_problem/Solution.kt)| Medium | Math, Depth_First_Search, Breadth_First_Search | 130 | 100.00

#### Day 12 Breadth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0433 |[Minimum Genetic Mutation](src.save/main/kotlin/g0401_0500/s0433_minimum_genetic_mutation/Solution.kt)| Medium | String, Hash_Table, Breadth_First_Search | 204 | 82.08
| 0752 |[Open the Lock](src.save/main/kotlin/g0701_0800/s0752_open_the_lock/Solution.kt)| Medium | Array, String, Hash_Table, Breadth_First_Search | 310 | 100.00
| 0127 |[Word Ladder](src.save/main/kotlin/g0101_0200/s0127_word_ladder/Solution.kt)| Hard | Top_Interview_Questions, String, Hash_Table, Breadth_First_Search | 396 | 98.68

#### Day 13 Graph Theory

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0997 |[Find the Town Judge](src.save/main/kotlin/g0901_1000/s0997_find_the_town_judge/Solution.kt)| Easy | Array, Hash_Table, Graph | 475 | 58.62
| 1557 |[Minimum Number of Vertices to Reach All Nodes](src.save/main/kotlin/g1501_1600/s1557_minimum_number_of_vertices_to_reach_all_nodes/Solution.kt)| Medium | Graph | 792 | 99.29

#### Day 14 Graph Theory

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1615 |[Maximal Network Rank](src/main/kotlin/g1601_1700/s1615_maximal_network_rank/Solution.kt)| Medium | Graph | 282 | 100.00
| 0886 |[Possible Bipartition](src.save/main/kotlin/g0801_0900/s0886_possible_bipartition/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 397 | 100.00
| 0785 |[Is Graph Bipartite?](src.save/main/kotlin/g0701_0800/s0785_is_graph_bipartite/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 215 | 82.35

### SQL I

#### Day 1 Select

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0595 |[Big Countries](src.save/main/kotlin/g0501_0600/s0595_big_countries/script.sql)| Easy | Database | 417 | 56.09
| 1757 |[Recyclable and Low Fat Products](src/main/kotlin/g1701_1800/s1757_recyclable_and_low_fat_products/script.sql)| Easy | Database | 1237 | 34.20
| 0584 |[Find Customer Referee](src.save/main/kotlin/g0501_0600/s0584_find_customer_referee/script.sql)| Easy | Database | 779 | 43.48
| 0183 |[Customers Who Never Order](src.save/main/kotlin/g0101_0200/s0183_customers_who_never_order/script.sql)| Easy | Database | 712 | 33.67

#### Day 2 Select and Order

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0627 |[Swap Salary](src.save/main/kotlin/g0601_0700/s0627_swap_salary/script.sql)| Easy | Database | 400 | 51.04
| 0196 |[Delete Duplicate Emails](src.save/main/kotlin/g0101_0200/s0196_delete_duplicate_emails/script.sql)| Easy | Database | 593 | 94.17

#### Day 3 String Processing Functions

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1667 |[Fix Names in a Table](src/main/kotlin/g1601_1700/s1667_fix_names_in_a_table/script.sql)| Easy | Database | 1196 | 61.40
| 1484 |[Group Sold Products By The Date](src.save/main/kotlin/g1401_1500/s1484_group_sold_products_by_the_date/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 899 | 40.76
| 1527 |[Patients With a Condition](src.save/main/kotlin/g1501_1600/s1527_patients_with_a_condition/script.sql)| Easy | Database | 708 | 48.23

#### Day 4 Union and Select

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1795 |[Rearrange Products Table](src/main/kotlin/g1701_1800/s1795_rearrange_products_table/script.sql)| Easy | Database | 1027 | 67.57
| 0608 |[Tree Node](src.save/main/kotlin/g0601_0700/s0608_tree_node/script.sql)| Medium | LeetCode_Curated_SQL_70, Database | 794 | 48.38
| 0176 |[Second Highest Salary](src.save/main/kotlin/g0101_0200/s0176_second_highest_salary/script.sql)| Medium | Database | 219 | 92.54

#### Day 5 Union

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0175 |[Combine Two Tables](src.save/main/kotlin/g0101_0200/s0175_combine_two_tables/script.sql)| Easy | Database | 473 | 54.97
| 1581 |[Customer Who Visited but Did Not Make Any Transactions](src.save/main/kotlin/g1501_1600/s1581_customer_who_visited_but_did_not_make_any_transactions/script.sql)| Easy | Database | 2771 | 54.68
| 1148 |[Article Views I](src.save/main/kotlin/g1101_1200/s1148_article_views_i/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 806 | 54.41

#### Day 6 Union

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0197 |[Rising Temperature](src.save/main/kotlin/g0101_0200/s0197_rising_temperature/script.sql)| Easy | Database | 394 | 94.15
| 0607 |[Sales Person](src.save/main/kotlin/g0601_0700/s0607_sales_person/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 2142 | 44.56

#### Day 7 Function

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1141 |[User Activity for the Past 30 Days I](src.save/main/kotlin/g1101_1200/s1141_user_activity_for_the_past_30_days_i/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 790 | 87.11
| 1693 |[Daily Leads and Partners](src/main/kotlin/g1601_1700/s1693_daily_leads_and_partners/script.sql)| Easy | Database | 1115 | 52.84
| 1729 |[Find Followers Count](src/main/kotlin/g1701_1800/s1729_find_followers_count/script.sql)| Easy | Database | 1228 | 38.04

#### Day 8 Function

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0586 |[Customer Placing the Largest Number of Orders](src.save/main/kotlin/g0501_0600/s0586_customer_placing_the_largest_number_of_orders/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 768 | 44.85
| 0511 |[Game Play Analysis I](src.save/main/kotlin/g0501_0600/s0511_game_play_analysis_i/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 790 | 45.04
| 1741 |[Find Total Time Spent by Each Employee](src/main/kotlin/g1701_1800/s1741_find_total_time_spent_by_each_employee/script.sql)| Easy | Database | 1101 | 51.40

#### Day 9 Control of Flow

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1393 |[Capital Gain/Loss](src.save/main/kotlin/g1301_1400/s1393_capital_gainloss/script.sql)| Medium | LeetCode_Curated_SQL_70, Database | 990 | 47.36
| 1407 |[Top Travellers](src.save/main/kotlin/g1401_1500/s1407_top_travellers/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 2035 | 14.53
| 1158 |[Market Analysis I](src.save/main/kotlin/g1101_1200/s1158_market_analysis_i/script.sql)| Medium | Database | 2470 | 44.76

#### Day 10 Where

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0182 |[Duplicate Emails](src.save/main/kotlin/g0101_0200/s0182_duplicate_emails/script.sql)| Easy | Database | 396 | 68.40
| 1050 |[Actors and Directors Who Cooperated At Least Three Times](src.save/main/kotlin/g1001_1100/s1050_actors_and_directors_who_cooperated_at_least_three_times/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 629 | 81.02
| 1587 |[Bank Account Summary II](src.save/main/kotlin/g1501_1600/s1587_bank_account_summary_ii/script.sql)| Easy | Database | 1582 | 52.96
| 1084 |[Sales Analysis III](src.save/main/kotlin/g1001_1100/s1084_sales_analysis_iii/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 1881 | 79.36

### Level 1

#### Day 1 Prefix Sum

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1480 |[Running Sum of 1d Array](src.save/main/kotlin/g1401_1500/s1480_running_sum_of_1d_array/Solution.kt)| Easy | Array, Prefix_Sum | 195 | 21.52
| 0724 |[Find Pivot Index](src.save/main/kotlin/g0701_0800/s0724_find_pivot_index/Solution.kt)| Easy | Array, Prefix_Sum | 255 | 88.92

#### Day 2 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0205 |[Isomorphic Strings](src.save/main/kotlin/g0201_0300/s0205_isomorphic_strings/Solution.kt)| Easy | String, Hash_Table | 278 | 79.96
| 0392 |[Is Subsequence](src.save/main/kotlin/g0301_0400/s0392_is_subsequence/Solution.kt)| Easy | String, Dynamic_Programming, Two_Pointers | 156 | 87.74

#### Day 3 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0021 |[Merge Two Sorted Lists](src.save/main/kotlin/g0001_0100/s0021_merge_two_sorted_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion | 176 | 96.25
| 0206 |[Reverse Linked List](src.save/main/kotlin/g0201_0300/s0206_reverse_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion | 279 | 45.78

#### Day 4 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0876 |[Middle of the Linked List](src.save/main/kotlin/g0801_0900/s0876_middle_of_the_linked_list/Solution.kt)| Easy | Two_Pointers, Linked_List | 136 | 76.52
| 0142 |[Linked List Cycle II](src.save/main/kotlin/g0101_0200/s0142_linked_list_cycle_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Hash_Table, Two_Pointers, Linked_List | 192 | 63.39

#### Day 5 Greedy

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0121 |[Best Time to Buy and Sell Stock](src.save/main/kotlin/g0101_0200/s0121_best_time_to_buy_and_sell_stock/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 609 | 94.06
| 0409 |[Longest Palindrome](src.save/main/kotlin/g0401_0500/s0409_longest_palindrome/Solution.kt)| Easy | String, Hash_Table, Greedy | 259 | 60.71

#### Day 6 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0589 |[N-ary Tree Preorder Traversal](src.save/main/kotlin/g0501_0600/s0589_n_ary_tree_preorder_traversal/Solution.kt)| Easy | Depth_First_Search, Tree, Stack | 233 | 84.02
| 0102 |[Binary Tree Level Order Traversal](src.save/main/kotlin/g0101_0200/s0102_binary_tree_level_order_traversal/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree | 332 | 67.53

#### Day 7 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0704 |[Binary Search](src.save/main/kotlin/g0701_0800/s0704_binary_search/Solution.kt)| Easy | Array, Binary_Search | 261 | 77.91
| 0278 |[First Bad Version](src.save/main/kotlin/g0201_0300/s0278_first_bad_version/Solution.kt)| Easy | Binary_Search, Interactive | 349 | 76.86

#### Day 8 Binary Search Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0098 |[Validate Binary Search Tree](src.save/main/kotlin/g0001_0100/s0098_validate_binary_search_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 330 | 41.38
| 0235 |[Lowest Common Ancestor of a Binary Search Tree](src.save/main/kotlin/g0201_0300/s0235_lowest_common_ancestor_of_a_binary_search_tree/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 404 | 75.59

#### Day 9 Graph/BFS/DFS

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0733 |[Flood Fill](src.save/main/kotlin/g0701_0800/s0733_flood_fill/Solution.kt)| Easy | Array, Depth_First_Search, Breadth_First_Search, Matrix | 230 | 97.76
| 0200 |[Number of Islands](src.save/main/kotlin/g0101_0200/s0200_number_of_islands/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 252 | 95.41

#### Day 10 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0509 |[Fibonacci Number](src.save/main/kotlin/g0501_0600/s0509_fibonacci_number/Solution.kt)| Easy | Dynamic_Programming, Math, Recursion, Memoization | 139 | 82.72
| 0070 |[Climbing Stairs](src.save/main/kotlin/g0001_0100/s0070_climbing_stairs/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization | 127 | 97.06

#### Day 11 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0746 |[Min Cost Climbing Stairs](src.save/main/kotlin/g0701_0800/s0746_min_cost_climbing_stairs/Solution.kt)| Easy | Array, Dynamic_Programming | 171 | 96.76
| 0062 |[Unique Paths](src.save/main/kotlin/g0001_0100/s0062_unique_paths/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Combinatorics | 209 | 49.18

#### Day 12 Sliding Window/Two Pointer

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0438 |[Find All Anagrams in a String](src.save/main/kotlin/g0401_0500/s0438_find_all_anagrams_in_a_string/Solution.kt)| Medium | Top_100_Liked_Questions, String, Hash_Table, Sliding_Window | 561 | 54.68
| 0424 |[Longest Repeating Character Replacement](src.save/main/kotlin/g0401_0500/s0424_longest_repeating_character_replacement/Solution.kt)| Medium | String, Hash_Table, Sliding_Window | 288 | 84.38

#### Day 13 Hashmap

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0001 |[Two Sum](src.save/main/kotlin/g0001_0100/s0001_two_sum/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table | 234 | 92.75
| 0299 |[Bulls and Cows](src.save/main/kotlin/g0201_0300/s0299_bulls_and_cows/Solution.kt)| Medium | String, Hash_Table, Counting | 254 | 84.82

#### Day 14 Stack

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0844 |[Backspace String Compare](src.save/main/kotlin/g0801_0900/s0844_backspace_string_compare/Solution.kt)| Easy | String, Two_Pointers, Stack, Simulation | 126 | 98.31
| 0394 |[Decode String](src.save/main/kotlin/g0301_0400/s0394_decode_string/Solution.kt)| Medium | Top_100_Liked_Questions, String, Stack, Recursion | 224 | 64.86

#### Day 15 Heap

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1046 |[Last Stone Weight](src.save/main/kotlin/g1001_1100/s1046_last_stone_weight/Solution.kt)| Easy | Array, Heap_Priority_Queue | 123 | 100.00
| 0692 |[Top K Frequent Words](src.save/main/kotlin/g0601_0700/s0692_top_k_frequent_words/Solution.kt)| Medium | String, Hash_Table, Sorting, Heap_Priority_Queue, Counting, Trie, Bucket_Sort | 239 | 81.10

## Algorithms

| #    |      Title     | Difficulty  | Tag         | Time, ms | Time, %
|------|----------------|-------------|-------------|----------|---------
| 1800 |[Maximum Ascending Subarray Sum](src/main/kotlin/g1701_1800/s1800_maximum_ascending_subarray_sum/Solution.kt)| Easy | Array | 139 | 100.00
| 1799 |[Maximize Score After N Operations](src/main/kotlin/g1701_1800/s1799_maximize_score_after_n_operations/Solution.kt)| Hard | Array, Dynamic_Programming, Math, Bit_Manipulation, Backtracking, Bitmask, Number_Theory | 347 | 73.17
| 1798 |[Maximum Number of Consecutive Values You Can Make](src/main/kotlin/g1701_1800/s1798_maximum_number_of_consecutive_values_you_can_make/Solution.kt)| Medium | Array, Greedy | 414 | 100.00
| 1797 |[Design Authentication Manager](src/main/kotlin/g1701_1800/s1797_design_authentication_manager/AuthenticationManager.kt)| Medium | Hash_Table, Design, Programming_Skills_II_Day_19 | 334 | 100.00
| 1796 |[Second Largest Digit in a String](src/main/kotlin/g1701_1800/s1796_second_largest_digit_in_a_string/Solution.kt)| Easy | String, Hash_Table | 148 | 100.00
| 1795 |[Rearrange Products Table](src/main/kotlin/g1701_1800/s1795_rearrange_products_table/script.sql)| Easy | Database, SQL_I_Day_4_Union_and_Select | 1027 | 67.57
| 1793 |[Maximum Score of a Good Subarray](src/main/kotlin/g1701_1800/s1793_maximum_score_of_a_good_subarray/Solution.kt)| Hard | Array, Binary_Search, Two_Pointers, Stack, Monotonic_Stack | 568 | 100.00
| 1792 |[Maximum Average Pass Ratio](src/main/kotlin/g1701_1800/s1792_maximum_average_pass_ratio/Solution.kt)| Medium | Array, Greedy, Heap_Priority_Queue | 1111 | 75.00
| 1791 |[Find Center of Star Graph](src/main/kotlin/g1701_1800/s1791_find_center_of_star_graph/Solution.kt)| Easy | Graph | 476 | 91.67
| 1790 |[Check if One String Swap Can Make Strings Equal](src/main/kotlin/g1701_1800/s1790_check_if_one_string_swap_can_make_strings_equal/Solution.kt)| Easy | String, Hash_Table, Counting, Programming_Skills_I_Day_4_Loop | 138 | 100.00
| 1787 |[Make the XOR of All Segments Equal to Zero](src/main/kotlin/g1701_1800/s1787_make_the_xor_of_all_segments_equal_to_zero/Solution.kt)| Hard | Array, Dynamic_Programming, Bit_Manipulation | 374 | 100.00
| 1786 |[Number of Restricted Paths From First to Last Node](src/main/kotlin/g1701_1800/s1786_number_of_restricted_paths_from_first_to_last_node/Solution.kt)| Medium | Dynamic_Programming, Heap_Priority_Queue, Graph, Topological_Sort, Shortest_Path | 977 | 100.00
| 1785 |[Minimum Elements to Add to Form a Given Sum](src/main/kotlin/g1701_1800/s1785_minimum_elements_to_add_to_form_a_given_sum/Solution.kt)| Medium | Array, Greedy | 595 | 100.00
| 1784 |[Check if Binary String Has at Most One Segment of Ones](src/main/kotlin/g1701_1800/s1784_check_if_binary_string_has_at_most_one_segment_of_ones/Solution.kt)| Easy | String | 135 | 85.71
| 1782 |[Count Pairs Of Nodes](src/main/kotlin/g1701_1800/s1782_count_pairs_of_nodes/Solution.kt)| Hard | Binary_Search, Two_Pointers, Graph | 1441 | 100.00
| 1781 |[Sum of Beauty of All Substrings](src/main/kotlin/g1701_1800/s1781_sum_of_beauty_of_all_substrings/Solution.kt)| Medium | String, Hash_Table, Counting | 172 | 100.00
| 1780 |[Check if Number is a Sum of Powers of Three](src/main/kotlin/g1701_1800/s1780_check_if_number_is_a_sum_of_powers_of_three/Solution.kt)| Medium | Math | 133 | 66.67
| 1779 |[Find Nearest Point That Has the Same X or Y Coordinate](src/main/kotlin/g1701_1800/s1779_find_nearest_point_that_has_the_same_x_or_y_coordinate/Solution.kt)| Easy | Array, Programming_Skills_I_Day_3_Conditional_Statements | 364 | 100.00
| 1776 |[Car Fleet II](src/main/kotlin/g1701_1800/s1776_car_fleet_ii/Solution.kt)| Hard | Array, Math, Stack, Heap_Priority_Queue, Monotonic_Stack | 2049 | 100.00
| 1775 |[Equal Sum Arrays With Minimum Number of Operations](src/main/kotlin/g1701_1800/s1775_equal_sum_arrays_with_minimum_number_of_operations/Solution.kt)| Medium | Array, Hash_Table, Greedy, Counting | 529 | 100.00
| 1774 |[Closest Dessert Cost](src/main/kotlin/g1701_1800/s1774_closest_dessert_cost/Solution.kt)| Medium | Array, Dynamic_Programming, Backtracking | 147 | 100.00
| 1773 |[Count Items Matching a Rule](src/main/kotlin/g1701_1800/s1773_count_items_matching_a_rule/Solution.kt)| Easy | Array, String | 227 | 97.50
| 1771 |[Maximize Palindrome Length From Subsequences](src/main/kotlin/g1701_1800/s1771_maximize_palindrome_length_from_subsequences/Solution.kt)| Hard | String, Dynamic_Programming | 248 | 100.00
| 1770 |[Maximum Score from Performing Multiplication Operations](src/main/kotlin/g1701_1800/s1770_maximum_score_from_performing_multiplication_operations/Solution.kt)| Medium | Array, Dynamic_Programming | 436 | 91.67
| 1769 |[Minimum Number of Operations to Move All Balls to Each Box](src/main/kotlin/g1701_1800/s1769_minimum_number_of_operations_to_move_all_balls_to_each_box/Solution.kt)| Medium | Array, String | 217 | 75.00
| 1768 |[Merge Strings Alternately](src/main/kotlin/g1701_1800/s1768_merge_strings_alternately/Solution.kt)| Easy | String, Two_Pointers, Programming_Skills_I_Day_8_String | 138 | 93.81
| 1766 |[Tree of Coprimes](src/main/kotlin/g1701_1800/s1766_tree_of_coprimes/Solution.kt)| Hard | Math, Depth_First_Search, Breadth_First_Search, Tree | 991 | 100.00
| 1765 |[Map of Highest Peak](src/main/kotlin/g1701_1800/s1765_map_of_highest_peak/Solution.kt)| Medium | Array, Breadth_First_Search, Matrix | 1087 | 100.00
| 1764 |[Form Array by Concatenating Subarrays of Another Array](src/main/kotlin/g1701_1800/s1764_form_array_by_concatenating_subarrays_of_another_array/Solution.kt)| Medium | Array, Greedy, String_Matching | 206 | 100.00
| 1763 |[Longest Nice Substring](src/main/kotlin/g1701_1800/s1763_longest_nice_substring/Solution.kt)| Easy | String, Hash_Table, Bit_Manipulation, Sliding_Window | 158 | 91.67
| 1761 |[Minimum Degree of a Connected Trio in a Graph](src/main/kotlin/g1701_1800/s1761_minimum_degree_of_a_connected_trio_in_a_graph/Solution.kt)| Hard | Graph | 590 | 50.00
| 1760 |[Minimum Limit of Balls in a Bag](src/main/kotlin/g1701_1800/s1760_minimum_limit_of_balls_in_a_bag/Solution.kt)| Medium | Array, Binary_Search, Binary_Search_II_Day_3 | 460 | 100.00
| 1759 |[Count Number of Homogenous Substrings](src/main/kotlin/g1701_1800/s1759_count_number_of_homogenous_substrings/Solution.kt)| Medium | String, Math | 230 | 100.00
| 1758 |[Minimum Changes To Make Alternating Binary String](src/main/kotlin/g1701_1800/s1758_minimum_changes_to_make_alternating_binary_string/Solution.kt)| Easy | String | 153 | 100.00
| 1757 |[Recyclable and Low Fat Products](src/main/kotlin/g1701_1800/s1757_recyclable_and_low_fat_products/script.sql)| Easy | Database, SQL_I_Day_1_Select | 1237 | 34.20
| 1755 |[Closest Subsequence Sum](src/main/kotlin/g1701_1800/s1755_closest_subsequence_sum/Solution.kt)| Hard | Array, Dynamic_Programming, Two_Pointers, Bit_Manipulation, Bitmask | 620 | 100.00
| 1754 |[Largest Merge Of Two Strings](src/main/kotlin/g1701_1800/s1754_largest_merge_of_two_strings/Solution.kt)| Medium | String, Greedy, Two_Pointers | 217 | 100.00
| 1753 |[Maximum Score From Removing Stones](src/main/kotlin/g1701_1800/s1753_maximum_score_from_removing_stones/Solution.kt)| Medium | Math, Greedy, Heap_Priority_Queue | 141 | 100.00
| 1752 |[Check if Array Is Sorted and Rotated](src/main/kotlin/g1701_1800/s1752_check_if_array_is_sorted_and_rotated/Solution.kt)| Easy | Array | 133 | 85.71
| 1751 |[Maximum Number of Events That Can Be Attended II](src/main/kotlin/g1701_1800/s1751_maximum_number_of_events_that_can_be_attended_ii/Solution.kt)| Hard | Array, Dynamic_Programming, Binary_Search | 608 | 100.00
| 1750 |[Minimum Length of String After Deleting Similar Ends](src/main/kotlin/g1701_1800/s1750_minimum_length_of_string_after_deleting_similar_ends/Solution.kt)| Medium | String, Two_Pointers | 215 | 100.00
| 1749 |[Maximum Absolute Sum of Any Subarray](src/main/kotlin/g1701_1800/s1749_maximum_absolute_sum_of_any_subarray/Solution.kt)| Medium | Array, Dynamic_Programming | 367 | 100.00
| 1748 |[Sum of Unique Elements](src/main/kotlin/g1701_1800/s1748_sum_of_unique_elements/Solution.kt)| Easy | Array, Hash_Table, Counting | 143 | 82.35
| 1745 |[Palindrome Partitioning IV](src/main/kotlin/g1701_1800/s1745_palindrome_partitioning_iv/Solution.kt)| Hard | String, Dynamic_Programming | 179 | 100.00
| 1744 |[Can You Eat Your Favorite Candy on Your Favorite Day?](src/main/kotlin/g1701_1800/s1744_can_you_eat_your_favorite_candy_on_your_favorite_day/Solution.kt)| Medium | Array, Prefix_Sum | 809 | 100.00
| 1743 |[Restore the Array From Adjacent Pairs](src/main/kotlin/g1701_1800/s1743_restore_the_array_from_adjacent_pairs/Solution.kt)| Medium | Array, Hash_Table | 1018 | 100.00
| 1742 |[Maximum Number of Balls in a Box](src/main/kotlin/g1701_1800/s1742_maximum_number_of_balls_in_a_box/Solution.kt)| Easy | Hash_Table, Math, Counting | 125 | 100.00
| 1741 |[Find Total Time Spent by Each Employee](src/main/kotlin/g1701_1800/s1741_find_total_time_spent_by_each_employee/script.sql)| Easy | Database, SQL_I_Day_8_Function | 1101 | 51.40
| 1739 |[Building Boxes](src/main/kotlin/g1701_1800/s1739_building_boxes/Solution.kt)| Hard | Math, Greedy, Binary_Search | 133 | 100.00
| 1738 |[Find Kth Largest XOR Coordinate Value](src/main/kotlin/g1701_1800/s1738_find_kth_largest_xor_coordinate_value/Solution.kt)| Medium | Array, Matrix, Bit_Manipulation, Heap_Priority_Queue, Prefix_Sum, Divide_and_Conquer, Quickselect | 936 | 100.00
| 1737 |[Change Minimum Characters to Satisfy One of Three Conditions](src/main/kotlin/g1701_1800/s1737_change_minimum_characters_to_satisfy_one_of_three_conditions/Solution.kt)| Medium | String, Hash_Table, Prefix_Sum, Counting | 240 | 100.00
| 1736 |[Latest Time by Replacing Hidden Digits](src/main/kotlin/g1701_1800/s1736_latest_time_by_replacing_hidden_digits/Solution.kt)| Easy | String, Greedy | 161 | 100.00
| 1735 |[Count Ways to Make Array With Product](src/main/kotlin/g1701_1800/s1735_count_ways_to_make_array_with_product/Solution.kt)| Hard | Array, Dynamic_Programming, Math | 394 | 100.00
| 1734 |[Decode XORed Permutation](src/main/kotlin/g1701_1800/s1734_decode_xored_permutation/Solution.kt)| Medium | Array, Bit_Manipulation | 684 | 100.00
| 1733 |[Minimum Number of People to Teach](src/main/kotlin/g1701_1800/s1733_minimum_number_of_people_to_teach/Solution.kt)| Medium | Array, Greedy | 580 | 100.00
| 1732 |[Find the Highest Altitude](src/main/kotlin/g1701_1800/s1732_find_the_highest_altitude/Solution.kt)| Easy | Array, Prefix_Sum | 139 | 90.70
| 1729 |[Find Followers Count](src/main/kotlin/g1701_1800/s1729_find_followers_count/script.sql)| Easy | Database, SQL_I_Day_7_Function | 1228 | 38.04
| 1728 |[Cat and Mouse II](src/main/kotlin/g1701_1800/s1728_cat_and_mouse_ii/Solution.kt)| Hard | Array, Dynamic_Programming, Math, Matrix, Graph, Memoization, Topological_Sort, Game_Theory | 193 | 100.00
| 1727 |[Largest Submatrix With Rearrangements](src/main/kotlin/g1701_1800/s1727_largest_submatrix_with_rearrangements/Solution.kt)| Medium | Array, Sorting, Greedy, Matrix | 650 | 100.00
| 1726 |[Tuple with Same Product](src/main/kotlin/g1701_1800/s1726_tuple_with_same_product/Solution.kt)| Medium | Array, Hash_Table | 762 | 100.00
| 1725 |[Number Of Rectangles That Can Form The Largest Square](src/main/kotlin/g1701_1800/s1725_number_of_rectangles_that_can_form_the_largest_square/Solution.kt)| Easy | Array | 244 | 100.00
| 1723 |[Find Minimum Time to Finish All Jobs](src/main/kotlin/g1701_1800/s1723_find_minimum_time_to_finish_all_jobs/Solution.kt)| Hard | Array, Dynamic_Programming, Bit_Manipulation, Backtracking, Bitmask | 167 | 100.00
| 1722 |[Minimize Hamming Distance After Swap Operations](src/main/kotlin/g1701_1800/s1722_minimize_hamming_distance_after_swap_operations/Solution.kt)| Medium | Array, Depth_First_Search, Union_Find | 843 | 100.00
| 1721 |[Swapping Nodes in a Linked List](src/main/kotlin/g1701_1800/s1721_swapping_nodes_in_a_linked_list/Solution.kt)| Medium | Two_Pointers, Linked_List | 879 | 13.84
| 1720 |[Decode XORed Array](src/main/kotlin/g1701_1800/s1720_decode_xored_array/Solution.kt)| Easy | Array, Bit_Manipulation | 304 | 95.00
| 1719 |[Number Of Ways To Reconstruct A Tree](src/main/kotlin/g1701_1800/s1719_number_of_ways_to_reconstruct_a_tree/Solution.kt)| Hard | Tree, Graph, Topological_Sort | 1015 | 100.00
| 1718 |[Construct the Lexicographically Largest Valid Sequence](src/main/kotlin/g1701_1800/s1718_construct_the_lexicographically_largest_valid_sequence/Solution.kt)| Medium | Array, Backtracking | 140 | 100.00
| 1717 |[Maximum Score From Removing Substrings](src/main/kotlin/g1701_1800/s1717_maximum_score_from_removing_substrings/Solution.kt)| Medium | String, Greedy, Stack | 265 | 100.00
| 1716 |[Calculate Money in Leetcode Bank](src/main/kotlin/g1701_1800/s1716_calculate_money_in_leetcode_bank/Solution.kt)| Easy | Math | 119 | 66.67
| 1713 |[Minimum Operations to Make a Subsequence](src/main/kotlin/g1701_1800/s1713_minimum_operations_to_make_a_subsequence/Solution.kt)| Hard | Array, Hash_Table, Greedy, Binary_Search | 862 | 100.00
| 1712 |[Ways to Split Array Into Three Subarrays](src/main/kotlin/g1701_1800/s1712_ways_to_split_array_into_three_subarrays/Solution.kt)| Medium | Array, Binary_Search, Two_Pointers, Prefix_Sum, Binary_Search_II_Day_10 | 486 | 100.00
| 1711 |[Count Good Meals](src/main/kotlin/g1701_1800/s1711_count_good_meals/Solution.kt)| Medium | Array, Hash_Table | 549 | 100.00
| 1710 |[Maximum Units on a Truck](src/main/kotlin/g1701_1800/s1710_maximum_units_on_a_truck/Solution.kt)| Easy | Array, Sorting, Greedy | 228 | 100.00
| 1707 |[Maximum XOR With an Element From Array](src/main/kotlin/g1701_1800/s1707_maximum_xor_with_an_element_from_array/Solution.kt)| Hard | Array, Bit_Manipulation, Trie | 1295 | 100.00
| 1706 |[Where Will the Ball Fall](src/main/kotlin/g1701_1800/s1706_where_will_the_ball_fall/Solution.kt)| Medium | Array, Dynamic_Programming, Depth_First_Search, Matrix, Simulation, Level_2_Day_1_Implementation/Simulation | 270 | 67.86
| 1705 |[Maximum Number of Eaten Apples](src/main/kotlin/g1701_1800/s1705_maximum_number_of_eaten_apples/Solution.kt)| Medium | Array, Greedy, Heap_Priority_Queue | 428 | 100.00
| 1704 |[Determine if String Halves Are Alike](src/main/kotlin/g1701_1800/s1704_determine_if_string_halves_are_alike/Solution.kt)| Easy | String, Counting | 162 | 83.33
| 1703 |[Minimum Adjacent Swaps for K Consecutive Ones](src/main/kotlin/g1701_1800/s1703_minimum_adjacent_swaps_for_k_consecutive_ones/Solution.kt)| Hard | Array, Greedy, Prefix_Sum, Sliding_Window | 518 | 100.00
| 1702 |[Maximum Binary String After Change](src/main/kotlin/g1701_1800/s1702_maximum_binary_string_after_change/Solution.kt)| Medium | String, Greedy | 343 | 100.00
| 1701 |[Average Waiting Time](src/main/kotlin/g1701_1800/s1701_average_waiting_time/Solution.kt)| Medium | Array, Simulation | 654 | 100.00
| 1700 |[Number of Students Unable to Eat Lunch](src/main/kotlin/g1601_1700/s1700_number_of_students_unable_to_eat_lunch/Solution.kt)| Easy | Array, Stack, Simulation, Queue | 143 | 100.00
| 1697 |[Checking Existence of Edge Length Limited Paths](src/main/kotlin/g1601_1700/s1697_checking_existence_of_edge_length_limited_paths/Solution.kt)| Hard | Array, Sorting, Graph, Union_Find | 1411 | 72.90
| 1696 |[Jump Game VI](src/main/kotlin/g1601_1700/s1696_jump_game_vi/Solution.kt)| Medium | Array, Dynamic_Programming, Heap_Priority_Queue, Sliding_Window, Queue, Monotonic_Queue | 497 | 100.00
| 1695 |[Maximum Erasure Value](src/main/kotlin/g1601_1700/s1695_maximum_erasure_value/Solution.kt)| Medium | Array, Hash_Table, Sliding_Window | 478 | 100.00
| 1694 |[Reformat Phone Number](src/main/kotlin/g1601_1700/s1694_reformat_phone_number/Solution.kt)| Easy | String | 142 | 100.00
| 1693 |[Daily Leads and Partners](src/main/kotlin/g1601_1700/s1693_daily_leads_and_partners/script.sql)| Easy | Database, SQL_I_Day_7_Function | 1115 | 52.84
| 1691 |[Maximum Height by Stacking Cuboids](src/main/kotlin/g1601_1700/s1691_maximum_height_by_stacking_cuboids/Solution.kt)| Hard | Array, Dynamic_Programming, Sorting | 187 | 100.00
| 1690 |[Stone Game VII](src/main/kotlin/g1601_1700/s1690_stone_game_vii/Solution.kt)| Medium | Array, Dynamic_Programming, Math, Game_Theory | 196 | 100.00
| 1689 |[Partitioning Into Minimum Number Of Deci-Binary Numbers](src/main/kotlin/g1601_1700/s1689_partitioning_into_minimum_number_of_deci_binary_numbers/Solution.kt)| Medium | String, Greedy | 226 | 84.44
| 1688 |[Count of Matches in Tournament](src/main/kotlin/g1601_1700/s1688_count_of_matches_in_tournament/Solution.kt)| Easy | Math, Simulation | 124 | 83.33
| 1687 |[Delivering Boxes from Storage to Ports](src/main/kotlin/g1601_1700/s1687_delivering_boxes_from_storage_to_ports/Solution.kt)| Hard | Array, Dynamic_Programming, Heap_Priority_Queue, Queue, Segment_Tree, Monotonic_Queue | 778 | 100.00
| 1686 |[Stone Game VI](src/main/kotlin/g1601_1700/s1686_stone_game_vi/Solution.kt)| Medium | Array, Math, Sorting, Greedy, Heap_Priority_Queue, Game_Theory | 702 | 100.00
| 1685 |[Sum of Absolute Differences in a Sorted Array](src/main/kotlin/g1601_1700/s1685_sum_of_absolute_differences_in_a_sorted_array/Solution.kt)| Medium | Array, Math, Prefix_Sum | 612 | 100.00
| 1684 |[Count the Number of Consistent Strings](src/main/kotlin/g1601_1700/s1684_count_the_number_of_consistent_strings/Solution.kt)| Easy | Array, String, Hash_Table, Bit_Manipulation | 234 | 100.00
| 1681 |[Minimum Incompatibility](src/main/kotlin/g1601_1700/s1681_minimum_incompatibility/Solution.kt)| Hard | Array, Dynamic_Programming, Bit_Manipulation, Bitmask | 162 | 100.00
| 1680 |[Concatenation of Consecutive Binary Numbers](src/main/kotlin/g1601_1700/s1680_concatenation_of_consecutive_binary_numbers/Solution.kt)| Medium | Math, Bit_Manipulation, Simulation | 175 | 100.00
| 1679 |[Max Number of K-Sum Pairs](src/main/kotlin/g1601_1700/s1679_max_number_of_k_sum_pairs/Solution.kt)| Medium | Array, Hash_Table, Sorting, Two_Pointers | 468 | 92.86
| 1678 |[Goal Parser Interpretation](src/main/kotlin/g1601_1700/s1678_goal_parser_interpretation/Solution.kt)| Easy | String, Programming_Skills_I_Day_8_String | 136 | 88.24
| 1675 |[Minimize Deviation in Array](src/main/kotlin/g1601_1700/s1675_minimize_deviation_in_array/Solution.kt)| Hard | Array, Greedy, Heap_Priority_Queue, Ordered_Set | 769 | 100.00
| 1674 |[Minimum Moves to Make Array Complementary](src/main/kotlin/g1601_1700/s1674_minimum_moves_to_make_array_complementary/Solution.kt)| Medium | Array, Hash_Table, Prefix_Sum | 522 | 100.00
| 1673 |[Find the Most Competitive Subsequence](src/main/kotlin/g1601_1700/s1673_find_the_most_competitive_subsequence/Solution.kt)| Medium | Array, Greedy, Stack, Monotonic_Stack | 741 | 100.00
| 1672 |[Richest Customer Wealth](src/main/kotlin/g1601_1700/s1672_richest_customer_wealth/Solution.kt)| Easy | Array, Matrix, Programming_Skills_I_Day_6_Array | 155 | 94.54
| 1671 |[Minimum Number of Removals to Make Mountain Array](src/main/kotlin/g1601_1700/s1671_minimum_number_of_removals_to_make_mountain_array/Solution.kt)| Hard | Array, Dynamic_Programming, Greedy, Binary_Search | 264 | 100.00
| 1670 |[Design Front Middle Back Queue](src/main/kotlin/g1601_1700/s1670_design_front_middle_back_queue/FrontMiddleBackQueue.kt)| Medium | Array, Design, Linked_List, Queue, Data_Stream | 267 | 100.00
| 1669 |[Merge In Between Linked Lists](src/main/kotlin/g1601_1700/s1669_merge_in_between_linked_lists/Solution.kt)| Medium | Linked_List | 531 | 66.67
| 1668 |[Maximum Repeating Substring](src/main/kotlin/g1601_1700/s1668_maximum_repeating_substring/Solution.kt)| Easy | String, String_Matching | 170 | 100.00
| 1667 |[Fix Names in a Table](src/main/kotlin/g1601_1700/s1667_fix_names_in_a_table/script.sql)| Easy | Database, SQL_I_Day_3_String_Processing_Functions | 1196 | 61.40
| 1665 |[Minimum Initial Energy to Finish Tasks](src/main/kotlin/g1601_1700/s1665_minimum_initial_energy_to_finish_tasks/Solution.kt)| Hard | Array, Sorting, Greedy | 823 | 100.00
| 1664 |[Ways to Make a Fair Array](src/main/kotlin/g1601_1700/s1664_ways_to_make_a_fair_array/Solution.kt)| Medium | Array, Dynamic_Programming | 475 | 100.00
| 1663 |[Smallest String With A Given Numeric Value](src/main/kotlin/g1601_1700/s1663_smallest_string_with_a_given_numeric_value/Solution.kt)| Medium | String, Greedy | 202 | 100.00
| 1662 |[Check If Two String Arrays are Equivalent](src/main/kotlin/g1601_1700/s1662_check_if_two_string_arrays_are_equivalent/Solution.kt)| Easy | Array, String | 144 | 86.84
| 1659 |[Maximize Grid Happiness](src/main/kotlin/g1601_1700/s1659_maximize_grid_happiness/Solution.kt)| Hard | Dynamic_Programming, Bit_Manipulation, Bitmask, Memoization | 181 | 100.00
| 1658 |[Minimum Operations to Reduce X to Zero](src/main/kotlin/g1601_1700/s1658_minimum_operations_to_reduce_x_to_zero/Solution.kt)| Medium | Array, Hash_Table, Binary_Search, Prefix_Sum, Sliding_Window | 532 | 50.00
| 1657 |[Determine if Two Strings Are Close](src/main/kotlin/g1601_1700/s1657_determine_if_two_strings_are_close/Solution.kt)| Medium | String, Hash_Table, Sorting | 287 | 100.00
| 1656 |[Design an Ordered Stream](src/main/kotlin/g1601_1700/s1656_design_an_ordered_stream/OrderedStream.kt)| Easy | Array, Hash_Table, Design, Data_Stream | 487 | 91.67
| 1655 |[Distribute Repeating Integers](src/main/kotlin/g1601_1700/s1655_distribute_repeating_integers/Solution.kt)| Hard | Array, Dynamic_Programming, Bit_Manipulation, Backtracking, Bitmask | 445 | 100.00
| 1654 |[Minimum Jumps to Reach Home](src/main/kotlin/g1601_1700/s1654_minimum_jumps_to_reach_home/Solution.kt)| Medium | Array, Dynamic_Programming, Breadth_First_Search, Graph_Theory_I_Day_11_Breadth_First_Search | 192 | 100.00
| 1653 |[Minimum Deletions to Make String Balanced](src/main/kotlin/g1601_1700/s1653_minimum_deletions_to_make_string_balanced/Solution.kt)| Medium | String, Dynamic_Programming, Stack | 291 | 100.00
| 1652 |[Defuse the Bomb](src/main/kotlin/g1601_1700/s1652_defuse_the_bomb/Solution.kt)| Easy | Array | 160 | 100.00
| 1649 |[Create Sorted Array through Instructions](src/main/kotlin/g1601_1700/s1649_create_sorted_array_through_instructions/Solution.kt)| Hard | Array, Binary_Search, Ordered_Set, Divide_and_Conquer, Segment_Tree, Binary_Indexed_Tree, Merge_Sort | 571 | 100.00
| 1648 |[Sell Diminishing-Valued Colored Balls](src/main/kotlin/g1601_1700/s1648_sell_diminishing_valued_colored_balls/Solution.kt)| Medium | Array, Math, Sorting, Greedy, Binary_Search, Heap_Priority_Queue, Binary_Search_II_Day_19 | 509 | 100.00
| 1647 |[Minimum Deletions to Make Character Frequencies Unique](src/main/kotlin/g1601_1700/s1647_minimum_deletions_to_make_character_frequencies_unique/Solution.kt)| Medium | String, Sorting, Greedy | 252 | 100.00
| 1646 |[Get Maximum in Generated Array](src/main/kotlin/g1601_1700/s1646_get_maximum_in_generated_array/Solution.kt)| Easy | Array, Dynamic_Programming, Simulation | 142 | 100.00
| 1643 |[Kth Smallest Instructions](src/main/kotlin/g1601_1700/s1643_kth_smallest_instructions/Solution.kt)| Hard | Array, Dynamic_Programming, Math, Combinatorics | 171 | 100.00
| 1642 |[Furthest Building You Can Reach](src/main/kotlin/g1601_1700/s1642_furthest_building_you_can_reach/Solution.kt)| Medium | Array, Greedy, Heap_Priority_Queue | 457 | 71.43
| 1641 |[Count Sorted Vowel Strings](src/main/kotlin/g1601_1700/s1641_count_sorted_vowel_strings/Solution.kt)| Medium | Dynamic_Programming | 141 | 42.86
| 1640 |[Check Array Formation Through Concatenation](src/main/kotlin/g1601_1700/s1640_check_array_formation_through_concatenation/Solution.kt)| Easy | Array, Hash_Table | 154 | 100.00
| 1639 |[Number of Ways to Form a Target String Given a Dictionary](src/main/kotlin/g1601_1700/s1639_number_of_ways_to_form_a_target_string_given_a_dictionary/Solution.kt)| Hard | Array, String, Dynamic_Programming | 408 | 100.00
| 1638 |[Count Substrings That Differ by One Character](src/main/kotlin/g1601_1700/s1638_count_substrings_that_differ_by_one_character/Solution.kt)| Medium | String, Hash_Table, Dynamic_Programming | 143 | 100.00
| 1637 |[Widest Vertical Area Between Two Points Containing No Points](src/main/kotlin/g1601_1700/s1637_widest_vertical_area_between_two_points_containing_no_points/Solution.kt)| Medium | Array, Sorting | 616 | 100.00
| 1636 |[Sort Array by Increasing Frequency](src/main/kotlin/g1601_1700/s1636_sort_array_by_increasing_frequency/Solution.kt)| Easy | Array, Hash_Table, Sorting | 222 | 95.65
| 1633 |[Percentage of Users Attended a Contest](src/main/kotlin/g1601_1700/s1633_percentage_of_users_attended_a_contest/script.sql)| Easy | Database | 1556 | 93.74
| 1632 |[Rank Transform of a Matrix](src/main/kotlin/g1601_1700/s1632_rank_transform_of_a_matrix/Solution.kt)| Hard | Array, Greedy, Matrix, Graph, Union_Find, Topological_Sort | 807 | 100.00
| 1631 |[Path With Minimum Effort](src/main/kotlin/g1601_1700/s1631_path_with_minimum_effort/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Binary_Search, Matrix, Heap_Priority_Queue, Union_Find | 384 | 100.00
| 1630 |[Arithmetic Subarrays](src/main/kotlin/g1601_1700/s1630_arithmetic_subarrays/Solution.kt)| Medium | Array, Sorting, Programming_Skills_II_Day_9 | 264 | 100.00
| 1629 |[Slowest Key](src/main/kotlin/g1601_1700/s1629_slowest_key/Solution.kt)| Easy | Array, String | 200 | 75.00
| 1627 |[Graph Connectivity With Threshold](src/main/kotlin/g1601_1700/s1627_graph_connectivity_with_threshold/Solution.kt)| Hard | Array, Math, Union_Find | 703 | 100.00
| 1626 |[Best Team With No Conflicts](src/main/kotlin/g1601_1700/s1626_best_team_with_no_conflicts/Solution.kt)| Medium | Array, Dynamic_Programming, Sorting | 370 | 100.00
| 1625 |[Lexicographically Smallest String After Applying Operations](src/main/kotlin/g1601_1700/s1625_lexicographically_smallest_string_after_applying_operations/Solution.kt)| Medium | String, Breadth_First_Search | 415 | 100.00
| 1624 |[Largest Substring Between Two Equal Characters](src/main/kotlin/g1601_1700/s1624_largest_substring_between_two_equal_characters/Solution.kt)| Easy | String, Hash_Table | 132 | 100.00
| 1622 |[Fancy Sequence](src/main/kotlin/g1601_1700/s1622_fancy_sequence/Fancy.kt)| Hard | Math, Design, Segment_Tree | 1050 | 100.00
| 1621 |[Number of Sets of K Non-Overlapping Line Segments](src/main/kotlin/g1601_1700/s1621_number_of_sets_of_k_non_overlapping_line_segments/Solution.kt)| Medium | Dynamic_Programming, Math | 147 | 100.00
| 1620 |[Coordinate With Maximum Network Quality](src/main/kotlin/g1601_1700/s1620_coordinate_with_maximum_network_quality/Solution.kt)| Medium | Array, Enumeration | 233 | 100.00
| 1619 |[Mean of Array After Removing Some Elements](src/main/kotlin/g1601_1700/s1619_mean_of_array_after_removing_some_elements/Solution.kt)| Easy | Array, Sorting | 178 | 100.00
| 1617 |[Count Subtrees With Max Distance Between Cities](src/main/kotlin/g1601_1700/s1617_count_subtrees_with_max_distance_between_cities/Solution.kt)| Hard | Dynamic_Programming, Tree, Bit_Manipulation, Bitmask, Enumeration | 297 | 100.00
| 1616 |[Split Two Strings to Make Palindrome](src/main/kotlin/g1601_1700/s1616_split_two_strings_to_make_palindrome/Solution.kt)| Medium | String, Greedy, Two_Pointers | 277 | 100.00
| 1615 |[Maximal Network Rank](src/main/kotlin/g1601_1700/s1615_maximal_network_rank/Solution.kt)| Medium | Graph, Graph_Theory_I_Day_14_Graph_Theory | 282 | 100.00
| 1614 |[Maximum Nesting Depth of the Parentheses](src/main/kotlin/g1601_1700/s1614_maximum_nesting_depth_of_the_parentheses/Solution.kt)| Easy | String, Stack | 130 | 81.25
| 1611 |[Minimum One Bit Operations to Make Integers Zero](src/main/kotlin/g1601_1700/s1611_minimum_one_bit_operations_to_make_integers_zero/Solution.kt)| Hard | Dynamic_Programming, Bit_Manipulation, Memoization | 127 | 100.00
| 1610 |[Maximum Number of Visible Points](src/main/kotlin/g1601_1700/s1610_maximum_number_of_visible_points/Solution.kt)| Hard | Array, Math, Sorting, Sliding_Window, Geometry | 1343 | 100.00
| 1609 |[Even Odd Tree](src/main/kotlin/g1601_1700/s1609_even_odd_tree/Solution.kt)| Medium | Breadth_First_Search, Tree, Binary_Tree | 497 | 100.00
| 1608 |[Special Array With X Elements Greater Than or Equal X](src/main/kotlin/g1601_1700/s1608_special_array_with_x_elements_greater_than_or_equal_x/Solution.kt)| Easy | Array, Sorting, Binary_Search, Binary_Search_I_Day_7 | 147 | 81.82
| 1606 |[Find Servers That Handled Most Number of Requests](src/main/kotlin/g1601_1700/s1606_find_servers_that_handled_most_number_of_requests/Solution.kt)| Hard | Array, Greedy, Heap_Priority_Queue, Ordered_Set | 973 | 33.33
| 1605 |[Find Valid Matrix Given Row and Column Sums](src/main/kotlin/g1601_1700/s1605_find_valid_matrix_given_row_and_column_sums/Solution.kt)| Medium | Array, Greedy, Matrix | 574 | 100.00
| 1604 |[Alert Using Same Key-Card Three or More Times in a One Hour Period](src/main/kotlin/g1601_1700/s1604_alert_using_same_key_card_three_or_more_times_in_a_one_hour_period/Solution.kt)| Medium | Array, String, Hash_Table, Sorting | 1063 | 20.00
| 1603 |[Design Parking System](src/main/kotlin/g1601_1700/s1603_design_parking_system/ParkingSystem.kt)| Easy | Design, Simulation, Counting, Programming_Skills_I_Day_12_Class_and_Object | 376 | 31.83
| 1601 |[Maximum Number of Achievable Transfer Requests](src/main/kotlin/g1601_1700/s1601_maximum_number_of_achievable_transfer_requests/Solution.kt)| Hard | Array, Bit_Manipulation, Backtracking, Enumeration | 206 | 100.00
| 1600 |[Throne Inheritance](src.save/main/kotlin/g1501_1600/s1600_throne_inheritance/ThroneInheritance.kt)| Medium | Hash_Table, Depth_First_Search, Tree, Design | 1847 | 100.00
| 1599 |[Maximum Profit of Operating a Centennial Wheel](src.save/main/kotlin/g1501_1600/s1599_maximum_profit_of_operating_a_centennial_wheel/Solution.kt)| Medium | Array, Simulation | 593 | 100.00
| 1598 |[Crawler Log Folder](src.save/main/kotlin/g1501_1600/s1598_crawler_log_folder/Solution.kt)| Easy | Array, String, Stack | 150 | 92.31
| 1595 |[Minimum Cost to Connect Two Groups of Points](src.save/main/kotlin/g1501_1600/s1595_minimum_cost_to_connect_two_groups_of_points/Solution.kt)| Hard | Array, Dynamic_Programming, Matrix, Bit_Manipulation, Bitmask | 278 | 100.00
| 1594 |[Maximum Non Negative Product in a Matrix](src.save/main/kotlin/g1501_1600/s1594_maximum_non_negative_product_in_a_matrix/Solution.kt)| Medium | Array, Dynamic_Programming, Matrix | 224 | 100.00
| 1593 |[Split a String Into the Max Number of Unique Substrings](src.save/main/kotlin/g1501_1600/s1593_split_a_string_into_the_max_number_of_unique_substrings/Solution.kt)| Medium | String, Hash_Table, Backtracking | 161 | 100.00
| 1592 |[Rearrange Spaces Between Words](src.save/main/kotlin/g1501_1600/s1592_rearrange_spaces_between_words/Solution.kt)| Easy | String | 182 | 75.00
| 1591 |[Strange Printer II](src.save/main/kotlin/g1501_1600/s1591_strange_printer_ii/Solution.kt)| Hard | Array, Matrix, Graph, Topological_Sort | 321 | 100.00
| 1590 |[Make Sum Divisible by P](src.save/main/kotlin/g1501_1600/s1590_make_sum_divisible_by_p/Solution.kt)| Medium | Array, Hash_Table, Prefix_Sum | 633 | 20.00
| 1589 |[Maximum Sum Obtained of Any Permutation](src.save/main/kotlin/g1501_1600/s1589_maximum_sum_obtained_of_any_permutation/Solution.kt)| Medium | Array, Sorting, Greedy, Prefix_Sum | 867 | 66.67
| 1588 |[Sum of All Odd Length Subarrays](src.save/main/kotlin/g1501_1600/s1588_sum_of_all_odd_length_subarrays/Solution.kt)| Easy | Array, Math, Prefix_Sum, Programming_Skills_I_Day_6_Array | 157 | 64.00
| 1587 |[Bank Account Summary II](src.save/main/kotlin/g1501_1600/s1587_bank_account_summary_ii/script.sql)| Easy | Database, SQL_I_Day_10_Where | 1582 | 52.96
| 1585 |[Check If String Is Transformable With Substring Sort Operations](src.save/main/kotlin/g1501_1600/s1585_check_if_string_is_transformable_with_substring_sort_operations/Solution.kt)| Hard | String, Sorting, Greedy | 271 | 100.00
| 1584 |[Min Cost to Connect All Points](src.save/main/kotlin/g1501_1600/s1584_min_cost_to_connect_all_points/Solution.kt)| Medium | Array, Union_Find, Minimum_Spanning_Tree | 331 | 95.12
| 1583 |[Count Unhappy Friends](src.save/main/kotlin/g1501_1600/s1583_count_unhappy_friends/Solution.kt)| Medium | Array, Simulation | 324 | 100.00
| 1582 |[Special Positions in a Binary Matrix](src.save/main/kotlin/g1501_1600/s1582_special_positions_in_a_binary_matrix/Solution.kt)| Easy | Array, Matrix | 212 | 60.00
| 1581 |[Customer Who Visited but Did Not Make Any Transactions](src.save/main/kotlin/g1501_1600/s1581_customer_who_visited_but_did_not_make_any_transactions/script.sql)| Easy | Database, SQL_I_Day_5_Union | 2771 | 54.68
| 1579 |[Remove Max Number of Edges to Keep Graph Fully Traversable](src.save/main/kotlin/g1501_1600/s1579_remove_max_number_of_edges_to_keep_graph_fully_traversable/Solution.kt)| Hard | Graph, Union_Find | 942 | 32.52
| 1578 |[Minimum Time to Make Rope Colorful](src.save/main/kotlin/g1501_1600/s1578_minimum_time_to_make_rope_colorful/Solution.kt)| Medium | Array, String, Dynamic_Programming, Greedy | 577 | 100.00
| 1577 |[Number of Ways Where Square of Number Is Equal to Product of Two Numbers](src.save/main/kotlin/g1501_1600/s1577_number_of_ways_where_square_of_number_is_equal_to_product_of_two_numbers/Solution.kt)| Medium | Array, Hash_Table, Math, Two_Pointers | 209 | 100.00
| 1576 |[Replace All ?'s to Avoid Consecutive Repeating Characters](src.save/main/kotlin/g1501_1600/s1576_replace_all_s_to_avoid_consecutive_repeating_characters/Solution.kt)| Easy | String | 180 | 37.50
| 1575 |[Count All Possible Routes](src.save/main/kotlin/g1501_1600/s1575_count_all_possible_routes/Solution.kt)| Hard | Array, Dynamic_Programming, Memoization | 246 | 100.00
| 1574 |[Shortest Subarray to be Removed to Make Array Sorted](src.save/main/kotlin/g1501_1600/s1574_shortest_subarray_to_be_removed_to_make_array_sorted/Solution.kt)| Medium | Array, Binary_Search, Two_Pointers, Stack, Monotonic_Stack, Binary_Search_II_Day_14 | 477 | 50.00
| 1573 |[Number of Ways to Split a String](src.save/main/kotlin/g1501_1600/s1573_number_of_ways_to_split_a_string/Solution.kt)| Medium | String, Math | 247 | 100.00
| 1572 |[Matrix Diagonal Sum](src.save/main/kotlin/g1501_1600/s1572_matrix_diagonal_sum/Solution.kt)| Easy | Array, Matrix, Programming_Skills_I_Day_7_Array, Udemy_2D_Arrays/Matrix | 221 | 67.61
| 1569 |[Number of Ways to Reorder Array to Get Same BST](src.save/main/kotlin/g1501_1600/s1569_number_of_ways_to_reorder_array_to_get_same_bst/Solution.kt)| Hard | Array, Dynamic_Programming, Math, Tree, Binary_Tree, Union_Find, Binary_Search_Tree, Divide_and_Conquer, Memoization, Combinatorics | 256 | 100.00
| 1568 |[Minimum Number of Days to Disconnect Island](src.save/main/kotlin/g1501_1600/s1568_minimum_number_of_days_to_disconnect_island/Solution.kt)| Hard | Array, Depth_First_Search, Breadth_First_Search, Matrix, Strongly_Connected_Component | 210 | 100.00
| 1567 |[Maximum Length of Subarray With Positive Product](src.save/main/kotlin/g1501_1600/s1567_maximum_length_of_subarray_with_positive_product/Solution.kt)| Medium | Array, Dynamic_Programming, Greedy, Dynamic_Programming_I_Day_6 | 468 | 33.33
| 1566 |[Detect Pattern of Length M Repeated K or More Times](src.save/main/kotlin/g1501_1600/s1566_detect_pattern_of_length_m_repeated_k_or_more_times/Solution.kt)| Easy | Array, Enumeration | 168 | 33.33
| 1563 |[Stone Game V](src.save/main/kotlin/g1501_1600/s1563_stone_game_v/Solution.kt)| Hard | Array, Dynamic_Programming, Math, Game_Theory | 371 | 100.00
| 1562 |[Find Latest Group of Size M](src.save/main/kotlin/g1501_1600/s1562_find_latest_group_of_size_m/Solution.kt)| Medium | Array, Binary_Search, Simulation, Binary_Search_II_Day_19 | 534 | 100.00
| 1561 |[Maximum Number of Coins You Can Get](src.save/main/kotlin/g1501_1600/s1561_maximum_number_of_coins_you_can_get/Solution.kt)| Medium | Array, Math, Sorting, Greedy, Game_Theory | 515 | 50.00
| 1560 |[Most Visited Sector in a Circular Track](src.save/main/kotlin/g1501_1600/s1560_most_visited_sector_in_a_circular_track/Solution.kt)| Easy | Array, Simulation | 230 | 100.00
| 1559 |[Detect Cycles in 2D Grid](src.save/main/kotlin/g1501_1600/s1559_detect_cycles_in_2d_grid/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 871 | 33.33
| 1558 |[Minimum Numbers of Function Calls to Make Target Array](src.save/main/kotlin/g1501_1600/s1558_minimum_numbers_of_function_calls_to_make_target_array/Solution.kt)| Medium | Array, Greedy | 347 | 50.00
| 1557 |[Minimum Number of Vertices to Reach All Nodes](src.save/main/kotlin/g1501_1600/s1557_minimum_number_of_vertices_to_reach_all_nodes/Solution.kt)| Medium | Graph, Data_Structure_II_Day_19_Graph, Graph_Theory_I_Day_13_Graph_Theory | 792 | 99.29
| 1556 |[Thousand Separator](src.save/main/kotlin/g1501_1600/s1556_thousand_separator/Solution.kt)| Easy | String | 131 | 100.00
| 1553 |[Minimum Number of Days to Eat N Oranges](src.save/main/kotlin/g1501_1600/s1553_minimum_number_of_days_to_eat_n_oranges/Solution.kt)| Hard | Dynamic_Programming, Memoization | 153 | 100.00
| 1552 |[Magnetic Force Between Two Balls](src.save/main/kotlin/g1501_1600/s1552_magnetic_force_between_two_balls/Solution.kt)| Medium | Array, Sorting, Binary_Search, Binary_Search_II_Day_4 | 636 | 100.00
| 1551 |[Minimum Operations to Make Array Equal](src.save/main/kotlin/g1501_1600/s1551_minimum_operations_to_make_array_equal/Solution.kt)| Medium | Math | 119 | 100.00
| 1550 |[Three Consecutive Odds](src.save/main/kotlin/g1501_1600/s1550_three_consecutive_odds/Solution.kt)| Easy | Array | 154 | 90.00
| 1547 |[Minimum Cost to Cut a Stick](src.save/main/kotlin/g1501_1600/s1547_minimum_cost_to_cut_a_stick/Solution.kt)| Hard | Array, Dynamic_Programming | 187 | 92.00
| 1546 |[Maximum Number of Non-Overlapping Subarrays With Sum Equals Target](src.save/main/kotlin/g1501_1600/s1546_maximum_number_of_non_overlapping_subarrays_with_sum_equals_target/Solution.kt)| Medium | Array, Hash_Table, Greedy, Prefix_Sum | 560 | 100.00
| 1545 |[Find Kth Bit in Nth Binary String](src.save/main/kotlin/g1501_1600/s1545_find_kth_bit_in_nth_binary_string/Solution.kt)| Medium | String, Recursion | 141 | 100.00
| 1544 |[Make The String Great](src.save/main/kotlin/g1501_1600/s1544_make_the_string_great/Solution.kt)| Easy | String, Stack | 164 | 92.16
| 1542 |[Find Longest Awesome Substring](src.save/main/kotlin/g1501_1600/s1542_find_longest_awesome_substring/Solution.kt)| Hard | String, Hash_Table, Bit_Manipulation | 239 | 100.00
| 1541 |[Minimum Insertions to Balance a Parentheses String](src.save/main/kotlin/g1501_1600/s1541_minimum_insertions_to_balance_a_parentheses_string/Solution.kt)| Medium | String, Greedy, Stack | 240 | 80.00
| 1540 |[Can Convert String in K Moves](src.save/main/kotlin/g1501_1600/s1540_can_convert_string_in_k_moves/Solution.kt)| Medium | String, Hash_Table | 272 | 75.00
| 1539 |[Kth Missing Positive Number](src.save/main/kotlin/g1501_1600/s1539_kth_missing_positive_number/Solution.kt)| Easy | Array, Binary_Search, Binary_Search_I_Day_6 | 153 | 100.00
| 1537 |[Get the Maximum Score](src.save/main/kotlin/g1501_1600/s1537_get_the_maximum_score/Solution.kt)| Hard | Array, Dynamic_Programming, Greedy, Two_Pointers | 453 | 100.00
| 1536 |[Minimum Swaps to Arrange a Binary Grid](src.save/main/kotlin/g1501_1600/s1536_minimum_swaps_to_arrange_a_binary_grid/Solution.kt)| Medium | Array, Greedy, Matrix | 336 | 100.00
| 1535 |[Find the Winner of an Array Game](src.save/main/kotlin/g1501_1600/s1535_find_the_winner_of_an_array_game/Solution.kt)| Medium | Array, Simulation | 460 | 100.00
| 1534 |[Count Good Triplets](src.save/main/kotlin/g1501_1600/s1534_count_good_triplets/Solution.kt)| Easy | Array, Enumeration | 175 | 66.67
| 1531 |[String Compression II](src.save/main/kotlin/g1501_1600/s1531_string_compression_ii/Solution.kt)| Hard | String, Dynamic_Programming | 207 | 100.00
| 1530 |[Number of Good Leaf Nodes Pairs](src.save/main/kotlin/g1501_1600/s1530_number_of_good_leaf_nodes_pairs/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree | 242 | 100.00
| 1529 |[Minimum Suffix Flips](src.save/main/kotlin/g1501_1600/s1529_minimum_suffix_flips/Solution.kt)| Medium | String, Greedy | 200 | 100.00
| 1528 |[Shuffle String](src.save/main/kotlin/g1501_1600/s1528_shuffle_string/Solution.kt)| Easy | Array, String | 180 | 89.23
| 1527 |[Patients With a Condition](src.save/main/kotlin/g1501_1600/s1527_patients_with_a_condition/script.sql)| Easy | Database, SQL_I_Day_3_String_Processing_Functions | 708 | 48.23
| 1526 |[Minimum Number of Increments on Subarrays to Form a Target Array](src.save/main/kotlin/g1501_1600/s1526_minimum_number_of_increments_on_subarrays_to_form_a_target_array/Solution.kt)| Hard | Array, Dynamic_Programming, Greedy, Stack, Monotonic_Stack | 466 | 100.00
| 1525 |[Number of Good Ways to Split a String](src.save/main/kotlin/g1501_1600/s1525_number_of_good_ways_to_split_a_string/Solution.kt)| Medium | String, Dynamic_Programming, Bit_Manipulation | 238 | 100.00
| 1524 |[Number of Sub-arrays With Odd Sum](src.save/main/kotlin/g1501_1600/s1524_number_of_sub_arrays_with_odd_sum/Solution.kt)| Medium | Array, Dynamic_Programming, Math, Prefix_Sum | 584 | 100.00
| 1523 |[Count Odd Numbers in an Interval Range](src.save/main/kotlin/g1501_1600/s1523_count_odd_numbers_in_an_interval_range/Solution.kt)| Easy | Math, Programming_Skills_I_Day_1_Basic_Data_Type | 114 | 97.22
| 1521 |[Find a Value of a Mysterious Function Closest to Target](src.save/main/kotlin/g1501_1600/s1521_find_a_value_of_a_mysterious_function_closest_to_target/Solution.kt)| Hard | Array, Binary_Search, Bit_Manipulation, Segment_Tree | 446 | 100.00
| 1520 |[Maximum Number of Non-Overlapping Substrings](src.save/main/kotlin/g1501_1600/s1520_maximum_number_of_non_overlapping_substrings/Solution.kt)| Hard | String, Greedy | 333 | 100.00
| 1519 |[Number of Nodes in the Sub-Tree With the Same Label](src.save/main/kotlin/g1501_1600/s1519_number_of_nodes_in_the_sub_tree_with_the_same_label/Solution.kt)| Medium | Hash_Table, Depth_First_Search, Breadth_First_Search, Tree, Counting | 1130 | 87.50
| 1518 |[Water Bottles](src.save/main/kotlin/g1501_1600/s1518_water_bottles/Solution.kt)| Easy | Math, Simulation | 116 | 100.00
| 1517 |[Find Users With Valid E-Mails](src.save/main/kotlin/g1501_1600/s1517_find_users_with_valid_e_mails/script.sql)| Easy | Database | 1278 | 77.30
| 1515 |[Best Position for a Service Centre](src.save/main/kotlin/g1501_1600/s1515_best_position_for_a_service_centre/Solution.kt)| Hard | Math, Geometry, Randomized | 183 | 100.00
| 1514 |[Path with Maximum Probability](src.save/main/kotlin/g1501_1600/s1514_path_with_maximum_probability/Solution.kt)| Medium | Heap_Priority_Queue, Graph, Shortest_Path | 681 | 100.00
| 1513 |[Number of Substrings With Only 1s](src.save/main/kotlin/g1501_1600/s1513_number_of_substrings_with_only_1s/Solution.kt)| Medium | String, Math | 171 | 100.00
| 1512 |[Number of Good Pairs](src.save/main/kotlin/g1501_1600/s1512_number_of_good_pairs/Solution.kt)| Easy | Array, Hash_Table, Math, Counting | 138 | 70.65
| 1510 |[Stone Game IV](src.save/main/kotlin/g1501_1600/s1510_stone_game_iv/Solution.kt)| Hard | Dynamic_Programming, Math, Game_Theory | 137 | 100.00
| 1509 |[Minimum Difference Between Largest and Smallest Value in Three Moves](src.save/main/kotlin/g1501_1600/s1509_minimum_difference_between_largest_and_smallest_value_in_three_moves/Solution.kt)| Medium | Array, Sorting, Greedy | 415 | 100.00
| 1508 |[Range Sum of Sorted Subarray Sums](src.save/main/kotlin/g1501_1600/s1508_range_sum_of_sorted_subarray_sums/Solution.kt)| Medium | Array, Sorting, Binary_Search, Two_Pointers, Binary_Search_II_Day_14 | 378 | 66.67
| 1507 |[Reformat Date](src.save/main/kotlin/g1501_1600/s1507_reformat_date/Solution.kt)| Easy | String | 147 | 100.00
| 1505 |[Minimum Possible Integer After at Most K Adjacent Swaps On Digits](src.save/main/kotlin/g1501_1600/s1505_minimum_possible_integer_after_at_most_k_adjacent_swaps_on_digits/Solution.kt)| Hard | String, Greedy, Segment_Tree, Binary_Indexed_Tree | 226 | 100.00
| 1504 |[Count Submatrices With All Ones](src.save/main/kotlin/g1501_1600/s1504_count_submatrices_with_all_ones/Solution.kt)| Medium | Array, Dynamic_Programming, Matrix, Stack, Monotonic_Stack | 265 | 80.00
| 1503 |[Last Moment Before All Ants Fall Out of a Plank](src.save/main/kotlin/g1501_1600/s1503_last_moment_before_all_ants_fall_out_of_a_plank/Solution.kt)| Medium | Array, Simulation, Brainteaser | 253 | 100.00
| 1502 |[Can Make Arithmetic Progression From Sequence](src.save/main/kotlin/g1501_1600/s1502_can_make_arithmetic_progression_from_sequence/Solution.kt)| Easy | Array, Sorting, Programming_Skills_I_Day_4_Loop | 156 | 94.82
| 1499 |[Max Value of Equation](src.save/main/kotlin/g1401_1500/s1499_max_value_of_equation/Solution.kt)| Hard | Array, Heap_Priority_Queue, Sliding_Window, Queue, Monotonic_Queue | 708 | 100.00
| 1498 |[Number of Subsequences That Satisfy the Given Sum Condition](src.save/main/kotlin/g1401_1500/s1498_number_of_subsequences_that_satisfy_the_given_sum_condition/Solution.kt)| Medium | Array, Sorting, Binary_Search, Two_Pointers, Binary_Search_II_Day_15 | 487 | 97.89
| 1497 |[Check If Array Pairs Are Divisible by k](src.save/main/kotlin/g1401_1500/s1497_check_if_array_pairs_are_divisible_by_k/Solution.kt)| Medium | Array, Hash_Table, Counting | 575 | 83.33
| 1496 |[Path Crossing](src.save/main/kotlin/g1401_1500/s1496_path_crossing/Solution.kt)| Easy | String, Hash_Table | 120 | 100.00
| 1494 |[Parallel Courses II](src.save/main/kotlin/g1401_1500/s1494_parallel_courses_ii/Solution.kt)| Hard | Dynamic_Programming, Bit_Manipulation, Graph, Bitmask | 381 | 100.00
| 1493 |[Longest Subarray of 1's After Deleting One Element](src.save/main/kotlin/g1401_1500/s1493_longest_subarray_of_1s_after_deleting_one_element/Solution.kt)| Medium | Dynamic_Programming, Math, Sliding_Window | 288 | 73.85
| 1492 |[The kth Factor of n](src.save/main/kotlin/g1401_1500/s1492_the_kth_factor_of_n/Solution.kt)| Medium | Math | 133 | 65.12
| 1491 |[Average Salary Excluding the Minimum and Maximum Salary](src.save/main/kotlin/g1401_1500/s1491_average_salary_excluding_the_minimum_and_maximum_salary/Solution.kt)| Easy | Array, Sorting, Programming_Skills_I_Day_1_Basic_Data_Type | 165 | 27.87
| 1489 |[Find Critical and Pseudo-Critical Edges in Minimum Spanning Tree](src.save/main/kotlin/g1401_1500/s1489_find_critical_and_pseudo_critical_edges_in_minimum_spanning_tree/Solution.kt)| Hard | Sorting, Graph, Union_Find, Minimum_Spanning_Tree, Strongly_Connected_Component | 342 | 100.00
| 1488 |[Avoid Flood in The City](src.save/main/kotlin/g1401_1500/s1488_avoid_flood_in_the_city/Solution.kt)| Medium | Array, Hash_Table, Greedy, Binary_Search, Heap_Priority_Queue, Binary_Search_II_Day_18 | 823 | 66.67
| 1487 |[Making File Names Unique](src.save/main/kotlin/g1401_1500/s1487_making_file_names_unique/Solution.kt)| Medium | Array, String, Hash_Table | 553 | 50.00
| 1486 |[XOR Operation in an Array](src.save/main/kotlin/g1401_1500/s1486_xor_operation_in_an_array/Solution.kt)| Easy | Math, Bit_Manipulation | 123 | 81.25
| 1484 |[Group Sold Products By The Date](src.save/main/kotlin/g1401_1500/s1484_group_sold_products_by_the_date/script.sql)| Easy | LeetCode_Curated_SQL_70, Database, SQL_I_Day_3_String_Processing_Functions | 899 | 40.76
| 1483 |[Kth Ancestor of a Tree Node](src.save/main/kotlin/g1401_1500/s1483_kth_ancestor_of_a_tree_node/TreeAncestor.kt)| Hard | Dynamic_Programming, Depth_First_Search, Breadth_First_Search, Tree, Binary_Search, Design | 956 | 100.00
| 1482 |[Minimum Number of Days to Make m Bouquets](src.save/main/kotlin/g1401_1500/s1482_minimum_number_of_days_to_make_m_bouquets/Solution.kt)| Medium | Array, Binary_Search, Binary_Search_II_Day_7 | 538 | 50.00
| 1481 |[Least Number of Unique Integers after K Removals](src.save/main/kotlin/g1401_1500/s1481_least_number_of_unique_integers_after_k_removals/Solution.kt)| Medium | Array, Hash_Table, Sorting, Greedy, Counting | 564 | 76.19
| 1480 |[Running Sum of 1d Array](src.save/main/kotlin/g1401_1500/s1480_running_sum_of_1d_array/Solution.kt)| Easy | Array, Prefix_Sum, Level_1_Day_1_Prefix_Sum | 195 | 21.52
| 1478 |[Allocate Mailboxes](src.save/main/kotlin/g1401_1500/s1478_allocate_mailboxes/Solution.kt)| Hard | Array, Dynamic_Programming, Math, Sorting | 226 | 100.00
| 1477 |[Find Two Non-overlapping Sub-arrays Each With Target Sum](src.save/main/kotlin/g1401_1500/s1477_find_two_non_overlapping_sub_arrays_each_with_target_sum/Solution.kt)| Medium | Array, Hash_Table, Dynamic_Programming, Binary_Search, Sliding_Window | 746 | 100.00
| 1476 |[Subrectangle Queries](src.save/main/kotlin/g1401_1500/s1476_subrectangle_queries/SubrectangleQueries.kt)| Medium | Array, Matrix, Design | 332 | 81.82
| 1475 |[Final Prices With a Special Discount in a Shop](src.save/main/kotlin/g1401_1500/s1475_final_prices_with_a_special_discount_in_a_shop/Solution.kt)| Easy | Array, Stack, Monotonic_Stack | 182 | 94.12
| 1473 |[Paint House III](src.save/main/kotlin/g1401_1500/s1473_paint_house_iii/Solution.kt)| Hard | Array, Dynamic_Programming | 235 | 100.00
| 1472 |[Design Browser History](src.save/main/kotlin/g1401_1500/s1472_design_browser_history/BrowserHistory.kt)| Medium | Array, Stack, Design, Linked_List, Data_Stream, Doubly_Linked_List | 576 | 42.42
| 1471 |[The k Strongest Values in an Array](src.save/main/kotlin/g1401_1500/s1471_the_k_strongest_values_in_an_array/Solution.kt)| Medium | Array, Sorting, Two_Pointers | 780 | 100.00
| 1470 |[Shuffle the Array](src.save/main/kotlin/g1401_1500/s1470_shuffle_the_array/Solution.kt)| Easy | Array | 220 | 41.96
| 1467 |[Probability of a Two Boxes Having The Same Number of Distinct Balls](src.save/main/kotlin/g1401_1500/s1467_probability_of_a_two_boxes_having_the_same_number_of_distinct_balls/Solution.kt)| Hard | Dynamic_Programming, Math, Backtracking, Combinatorics, Probability_and_Statistics | 150 | 100.00
| 1466 |[Reorder Routes to Make All Paths Lead to the City Zero](src.save/main/kotlin/g1401_1500/s1466_reorder_routes_to_make_all_paths_lead_to_the_city_zero/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Graph_Theory_I_Day_10_Standard_Traversal | 718 | 100.00
| 1465 |[Maximum Area of a Piece of Cake After Horizontal and Vertical Cuts](src.save/main/kotlin/g1401_1500/s1465_maximum_area_of_a_piece_of_cake_after_horizontal_and_vertical_cuts/Solution.kt)| Medium | Array, Sorting, Greedy | 418 | 50.00
| 1464 |[Maximum Product of Two Elements in an Array](src.save/main/kotlin/g1401_1500/s1464_maximum_product_of_two_elements_in_an_array/Solution.kt)| Easy | Array, Sorting, Heap_Priority_Queue | 190 | 64.71
| 1463 |[Cherry Pickup II](src.save/main/kotlin/g1401_1500/s1463_cherry_pickup_ii/Solution.kt)| Hard | Array, Dynamic_Programming, Matrix | 198 | 100.00
| 1462 |[Course Schedule IV](src.save/main/kotlin/g1401_1500/s1462_course_schedule_iv/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph |  Sort |  Sort
| 1461 |[Check If a String Contains All Binary Codes of Size K](src.save/main/kotlin/g1401_1500/s1461_check_if_a_string_contains_all_binary_codes_of_size_k/Solution.kt)| Medium | String, Hash_Table, Bit_Manipulation, Hash_Function, Rolling_Hash | 578 | 20.00
| 1460 |[Make Two Arrays Equal by Reversing Sub-arrays](src.save/main/kotlin/g1401_1500/s1460_make_two_arrays_equal_by_reversing_subarrays/Solution.kt)| Easy | Array, Hash_Table, Sorting | 231 | 66.67
| 1458 |[Max Dot Product of Two Subsequences](src.save/main/kotlin/g1401_1500/s1458_max_dot_product_of_two_subsequences/Solution.kt)| Hard | Array, Dynamic_Programming | 215 | 100.00
| 1457 |[Pseudo-Palindromic Paths in a Binary Tree](src.save/main/kotlin/g1401_1500/s1457_pseudo_palindromic_paths_in_a_binary_tree/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Bit_Manipulation | 583 | 50.00
| 1456 |[Maximum Number of Vowels in a Substring of Given Length](src.save/main/kotlin/g1401_1500/s1456_maximum_number_of_vowels_in_a_substring_of_given_length/Solution.kt)| Medium | String, Sliding_Window | 215 | 97.25
| 1455 |[Check If a Word Occurs As a Prefix of Any Word in a Sentence](src.save/main/kotlin/g1401_1500/s1455_check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence/Solution.kt)| Easy | String, String_Matching | 155 | 42.86
| 1453 |[Maximum Number of Darts Inside of a Circular Dartboard](src.save/main/kotlin/g1401_1500/s1453_maximum_number_of_darts_inside_of_a_circular_dartboard/Solution.kt)| Hard | Array, Math, Geometry | 211 | 100.00
| 1452 |[People Whose List of Favorite Companies Is Not a Subset of Another List](src.save/main/kotlin/g1401_1500/s1452_people_whose_list_of_favorite_companies_is_not_a_subset_of_another_list/Solution.kt)| Medium | Array, String, Hash_Table | 600 | 100.00
| 1451 |[Rearrange Words in a Sentence](src.save/main/kotlin/g1401_1500/s1451_rearrange_words_in_a_sentence/Solution.kt)| Medium | String, Sorting | 263 | 100.00
| 1450 |[Number of Students Doing Homework at a Given Time](src.save/main/kotlin/g1401_1500/s1450_number_of_students_doing_homework_at_a_given_time/Solution.kt)| Easy | Array | 180 | 10.00
| 1449 |[Form Largest Integer With Digits That Add up to Target](src.save/main/kotlin/g1401_1500/s1449_form_largest_integer_with_digits_that_add_up_to_target/Solution.kt)| Hard | Array, Dynamic_Programming | 201 | 100.00
| 1448 |[Count Good Nodes in Binary Tree](src.save/main/kotlin/g1401_1500/s1448_count_good_nodes_in_binary_tree/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 384 | 68.52
| 1447 |[Simplified Fractions](src.save/main/kotlin/g1401_1500/s1447_simplified_fractions/Solution.kt)| Medium | String, Math, Number_Theory | 338 | 100.00
| 1446 |[Consecutive Characters](src.save/main/kotlin/g1401_1500/s1446_consecutive_characters/Solution.kt)| Easy | String | 141 | 100.00
| 1444 |[Number of Ways of Cutting a Pizza](src.save/main/kotlin/g1401_1500/s1444_number_of_ways_of_cutting_a_pizza/Solution.kt)| Hard | Array, Dynamic_Programming, Matrix, Memoization | 175 | 75.00
| 1443 |[Minimum Time to Collect All Apples in a Tree](src.save/main/kotlin/g1401_1500/s1443_minimum_time_to_collect_all_apples_in_a_tree/Solution.kt)| Medium | Hash_Table, Depth_First_Search, Breadth_First_Search, Tree | 793 | 85.71
| 1442 |[Count Triplets That Can Form Two Arrays of Equal XOR](src.save/main/kotlin/g1401_1500/s1442_count_triplets_that_can_form_two_arrays_of_equal_xor/Solution.kt)| Medium | Array, Hash_Table, Math, Bit_Manipulation, Prefix_Sum | 145 | 100.00
| 1441 |[Build an Array With Stack Operations](src.save/main/kotlin/g1401_1500/s1441_build_an_array_with_stack_operations/Solution.kt)| Easy | Array, Stack, Simulation | 160 | 100.00
| 1439 |[Find the Kth Smallest Sum of a Matrix With Sorted Rows](src.save/main/kotlin/g1401_1500/s1439_find_the_kth_smallest_sum_of_a_matrix_with_sorted_rows/Solution.kt)| Hard | Array, Binary_Search, Matrix, Heap_Priority_Queue | 225 | 100.00
| 1438 |[Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit](src.save/main/kotlin/g1401_1500/s1438_longest_continuous_subarray_with_absolute_diff_less_than_or_equal_to_limit/Solution.kt)| Medium | Array, Heap_Priority_Queue, Sliding_Window, Ordered_Set, Queue, Monotonic_Queue | 479 | 75.00
| 1437 |[Check If All 1's Are at Least Length K Places Away](src.save/main/kotlin/g1401_1500/s1437_check_if_all_1s_are_at_least_length_k_places_away/Solution.kt)| Easy | Array | 345 | 66.67
| 1436 |[Destination City](src.save/main/kotlin/g1401_1500/s1436_destination_city/Solution.kt)| Easy | String, Hash_Table | 174 | 77.78
| 1434 |[Number of Ways to Wear Different Hats to Each Other](src.save/main/kotlin/g1401_1500/s1434_number_of_ways_to_wear_different_hats_to_each_other/Solution.kt)| Hard | Array, Dynamic_Programming, Bit_Manipulation, Bitmask | 206 | 100.00
| 1433 |[Check If a String Can Break Another String](src.save/main/kotlin/g1401_1500/s1433_check_if_a_string_can_break_another_string/Solution.kt)| Medium | String, Sorting, Greedy | 221 | 100.00
| 1432 |[Max Difference You Can Get From Changing an Integer](src.save/main/kotlin/g1401_1500/s1432_max_difference_you_can_get_from_changing_an_integer/Solution.kt)| Medium | Math, Greedy | 147 | 100.00
| 1431 |[Kids With the Greatest Number of Candies](src.save/main/kotlin/g1401_1500/s1431_kids_with_the_greatest_number_of_candies/Solution.kt)| Easy | Array | 152 | 99.61
| 1425 |[Constrained Subsequence Sum](src.save/main/kotlin/g1401_1500/s1425_constrained_subsequence_sum/Solution.kt)| Hard | Array, Dynamic_Programming, Heap_Priority_Queue, Sliding_Window, Queue, Monotonic_Queue | 649 | 33.33
| 1424 |[Diagonal Traverse II](src.save/main/kotlin/g1401_1500/s1424_diagonal_traverse_ii/Solution.kt)| Medium | Array, Sorting, Heap_Priority_Queue | 706 | 100.00
| 1423 |[Maximum Points You Can Obtain from Cards](src.save/main/kotlin/g1401_1500/s1423_maximum_points_you_can_obtain_from_cards/Solution.kt)| Medium | Array, Prefix_Sum, Sliding_Window | 349 | 78.57
| 1422 |[Maximum Score After Splitting a String](src.save/main/kotlin/g1401_1500/s1422_maximum_score_after_splitting_a_string/Solution.kt)| Easy | String | 145 | 100.00
| 1420 |[Build Array Where You Can Find The Maximum Exactly K Comparisons](src.save/main/kotlin/g1401_1500/s1420_build_array_where_you_can_find_the_maximum_exactly_k_comparisons/Solution.kt)| Hard | Dynamic_Programming | 153 | 100.00
| 1419 |[Minimum Number of Frogs Croaking](src.save/main/kotlin/g1401_1500/s1419_minimum_number_of_frogs_croaking/Solution.kt)| Medium | String, Counting | 210 | 90.91
| 1418 |[Display Table of Food Orders in a Restaurant](src.save/main/kotlin/g1401_1500/s1418_display_table_of_food_orders_in_a_restaurant/Solution.kt)| Medium | Array, String, Hash_Table, Sorting, Ordered_Set | 710 | 100.00
| 1417 |[Reformat The String](src.save/main/kotlin/g1401_1500/s1417_reformat_the_string/Solution.kt)| Easy | String | 174 | 100.00
| 1416 |[Restore The Array](src.save/main/kotlin/g1401_1500/s1416_restore_the_array/Solution.kt)| Hard | String, Dynamic_Programming | 279 | 51.85
| 1415 |[The k-th Lexicographical String of All Happy Strings of Length n](src.save/main/kotlin/g1401_1500/s1415_the_k_th_lexicographical_string_of_all_happy_strings_of_length_n/Solution.kt)| Medium | String, Backtracking | 160 | 100.00
| 1414 |[Find the Minimum Number of Fibonacci Numbers Whose Sum Is K](src.save/main/kotlin/g1401_1500/s1414_find_the_minimum_number_of_fibonacci_numbers_whose_sum_is_k/Solution.kt)| Medium | Greedy | 165 | 100.00
| 1413 |[Minimum Value to Get Positive Step by Step Sum](src.save/main/kotlin/g1401_1500/s1413_minimum_value_to_get_positive_step_by_step_sum/Solution.kt)| Easy | Array, Prefix_Sum | 127 | 97.22
| 1411 |[Number of Ways to Paint N × 3 Grid](src.save/main/kotlin/g1401_1500/s1411_number_of_ways_to_paint_n_3_grid/Solution.kt)| Hard | Dynamic_Programming | 201 | 100.00
| 1410 |[HTML Entity Parser](src.save/main/kotlin/g1401_1500/s1410_html_entity_parser/Solution.kt)| Medium | String, Hash_Table | 334 | 100.00
| 1409 |[Queries on a Permutation With Key](src.save/main/kotlin/g1401_1500/s1409_queries_on_a_permutation_with_key/Solution.kt)| Medium | Array, Simulation, Binary_Indexed_Tree | 209 | 100.00
| 1408 |[String Matching in an Array](src.save/main/kotlin/g1401_1500/s1408_string_matching_in_an_array/Solution.kt)| Easy | String, String_Matching | 194 | 77.78
| 1407 |[Top Travellers](src.save/main/kotlin/g1401_1500/s1407_top_travellers/script.sql)| Easy | LeetCode_Curated_SQL_70, Database, SQL_I_Day_9_Control_of_Flow | 2035 | 14.53
| 1406 |[Stone Game III](src.save/main/kotlin/g1401_1500/s1406_stone_game_iii/Solution.kt)| Hard | Array, Dynamic_Programming, Math, Game_Theory | 699 | 90.70
| 1405 |[Longest Happy String](src.save/main/kotlin/g1401_1500/s1405_longest_happy_string/Solution.kt)| Medium | String, Greedy, Heap_Priority_Queue | 119 | 100.00
| 1404 |[Number of Steps to Reduce a Number in Binary Representation to One](src.save/main/kotlin/g1401_1500/s1404_number_of_steps_to_reduce_a_number_in_binary_representation_to_one/Solution.kt)| Medium | String, Bit_Manipulation | 144 | 100.00
| 1403 |[Minimum Subsequence in Non-Increasing Order](src.save/main/kotlin/g1401_1500/s1403_minimum_subsequence_in_non_increasing_order/Solution.kt)| Easy | Array, Sorting, Greedy | 190 | 100.00
| 1402 |[Reducing Dishes](src.save/main/kotlin/g1401_1500/s1402_reducing_dishes/Solution.kt)| Hard | Array, Dynamic_Programming, Sorting, Greedy | 151 | 100.00
| 1401 |[Circle and Rectangle Overlapping](src.save/main/kotlin/g1401_1500/s1401_circle_and_rectangle_overlapping/Solution.kt)| Medium | Math, Geometry | 116 | 100.00
| 1400 |[Construct K Palindrome Strings](src.save/main/kotlin/g1301_1400/s1400_construct_k_palindrome_strings/Solution.kt)| Medium | String, Hash_Table, Greedy, Counting | 204 | 90.00
| 1399 |[Count Largest Group](src.save/main/kotlin/g1301_1400/s1399_count_largest_group/Solution.kt)| Easy | Hash_Table, Math | 136 | 100.00
| 1397 |[Find All Good Strings](src.save/main/kotlin/g1301_1400/s1397_find_all_good_strings/Solution.kt)| Hard | String, Dynamic_Programming, String_Matching | 273 | 100.00
| 1396 |[Design Underground System](src.save/main/kotlin/g1301_1400/s1396_design_underground_system/UndergroundSystem.kt)| Medium | String, Hash_Table, Design | 703 | 99.29
| 1395 |[Count Number of Teams](src.save/main/kotlin/g1301_1400/s1395_count_number_of_teams/Solution.kt)| Medium | Array, Dynamic_Programming, Binary_Indexed_Tree | 192 | 100.00
| 1394 |[Find Lucky Integer in an Array](src.save/main/kotlin/g1301_1400/s1394_find_lucky_integer_in_an_array/Solution.kt)| Easy | Array, Hash_Table, Counting | 161 | 100.00
| 1393 |[Capital Gain/Loss](src.save/main/kotlin/g1301_1400/s1393_capital_gainloss/script.sql)| Medium | LeetCode_Curated_SQL_70, Database, SQL_I_Day_9_Control_of_Flow | 990 | 47.36
| 1392 |[Longest Happy Prefix](src.save/main/kotlin/g1301_1400/s1392_longest_happy_prefix/Solution.kt)| Hard | String, Hash_Function, String_Matching, Rolling_Hash | 291 | 50.00
| 1391 |[Check if There is a Valid Path in a Grid](src.save/main/kotlin/g1301_1400/s1391_check_if_there_is_a_valid_path_in_a_grid/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 636 | 100.00
| 1390 |[Four Divisors](src.save/main/kotlin/g1301_1400/s1390_four_divisors/Solution.kt)| Medium | Array, Math | 255 | 100.00
| 1389 |[Create Target Array in the Given Order](src.save/main/kotlin/g1301_1400/s1389_create_target_array_in_the_given_order/Solution.kt)| Easy | Array, Simulation | 155 | 91.67
| 1388 |[Pizza With 3n Slices](src.save/main/kotlin/g1301_1400/s1388_pizza_with_3n_slices/Solution.kt)| Hard | Array, Dynamic_Programming, Greedy, Heap_Priority_Queue | 170 | 100.00
| 1387 |[Sort Integers by The Power Value](src.save/main/kotlin/g1301_1400/s1387_sort_integers_by_the_power_value/Solution.kt)| Medium | Dynamic_Programming, Sorting, Memoization | 370 | 100.00
| 1386 |[Cinema Seat Allocation](src.save/main/kotlin/g1301_1400/s1386_cinema_seat_allocation/Solution.kt)| Medium | Array, Hash_Table, Greedy, Bit_Manipulation | 397 | 100.00
| 1385 |[Find the Distance Value Between Two Arrays](src.save/main/kotlin/g1301_1400/s1385_find_the_distance_value_between_two_arrays/Solution.kt)| Easy | Array, Sorting, Binary_Search, Two_Pointers, Binary_Search_I_Day_3 | 190 | 84.62
| 1383 |[Maximum Performance of a Team](src.save/main/kotlin/g1301_1400/s1383_maximum_performance_of_a_team/Solution.kt)| Hard | Array, Sorting, Greedy, Heap_Priority_Queue | 427 | 100.00
| 1382 |[Balance a Binary Search Tree](src.save/main/kotlin/g1301_1400/s1382_balance_a_binary_search_tree/Solution.kt)| Medium | Depth_First_Search, Greedy, Tree, Binary_Tree, Binary_Search_Tree, Divide_and_Conquer | 369 | 85.71
| 1381 |[Design a Stack With Increment Operation](src.save/main/kotlin/g1301_1400/s1381_design_a_stack_with_increment_operation/CustomStack.kt)| Medium | Array, Stack, Design | 267 | 100.00
| 1380 |[Lucky Numbers in a Matrix](src.save/main/kotlin/g1301_1400/s1380_lucky_numbers_in_a_matrix/Solution.kt)| Easy | Array, Matrix | 223 | 89.29
| 1379 |[Find a Corresponding Node of a Binary Tree in a Clone of That Tree](src.save/main/kotlin/g1301_1400/s1379_find_a_corresponding_node_of_a_binary_tree_in_a_clone_of_that_tree/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 1 | 100.00
| 1378 |[Replace Employee ID With The Unique Identifier](src.save/main/kotlin/g1301_1400/s1378_replace_employee_id_with_the_unique_identifier/script.sql)| Easy | Database | 2452 | 54.86
| 1377 |[Frog Position After T Seconds](src.save/main/kotlin/g1301_1400/s1377_frog_position_after_t_seconds/Solution.kt)| Hard | Depth_First_Search, Breadth_First_Search, Tree, Graph | 221 | 100.00
| 1376 |[Time Needed to Inform All Employees](src.save/main/kotlin/g1301_1400/s1376_time_needed_to_inform_all_employees/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Programming_Skills_II_Day_11, Graph_Theory_I_Day_9_Standard_Traversal | 915 | 37.62
| 1375 |[Number of Times Binary String Is Prefix-Aligned](src.save/main/kotlin/g1301_1400/s1375_number_of_times_binary_string_is_prefix_aligned/Solution.kt)| Medium | Array | 327 | 100.00
| 1374 |[Generate a String With Characters That Have Odd Counts](src.save/main/kotlin/g1301_1400/s1374_generate_a_string_with_characters_that_have_odd_counts/Solution.kt)| Easy | String | 130 | 100.00
| 1373 |[Maximum Sum BST in Binary Tree](src.save/main/kotlin/g1301_1400/s1373_maximum_sum_bst_in_binary_tree/Solution.kt)| Hard | Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 451 | 100.00
| 1372 |[Longest ZigZag Path in a Binary Tree](src.save/main/kotlin/g1301_1400/s1372_longest_zigzag_path_in_a_binary_tree/Solution.kt)| Medium | Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree | 381 | 66.11
| 1371 |[Find the Longest Substring Containing Vowels in Even Counts](src.save/main/kotlin/g1301_1400/s1371_find_the_longest_substring_containing_vowels_in_even_counts/Solution.kt)| Medium | String, Hash_Table, Bit_Manipulation, Prefix_Sum | 317 | 100.00
| 1370 |[Increasing Decreasing String](src.save/main/kotlin/g1301_1400/s1370_increasing_decreasing_string/Solution.kt)| Easy | String, Hash_Table, Counting | 189 | 33.33
| 1368 |[Minimum Cost to Make at Least One Valid Path in a Grid](src.save/main/kotlin/g1301_1400/s1368_minimum_cost_to_make_at_least_one_valid_path_in_a_grid/Solution.kt)| Hard | Array, Breadth_First_Search, Matrix, Heap_Priority_Queue, Graph, Shortest_Path | 220 | 100.00
| 1367 |[Linked List in Binary Tree](src.save/main/kotlin/g1301_1400/s1367_linked_list_in_binary_tree/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Linked_List, Programming_Skills_II_Day_4 | 237 | 92.86
| 1366 |[Rank Teams by Votes](src.save/main/kotlin/g1301_1400/s1366_rank_teams_by_votes/Solution.kt)| Medium | Array, String, Hash_Table, Sorting, Counting | 179 | 100.00
| 1365 |[How Many Numbers Are Smaller Than the Current Number](src.save/main/kotlin/g1301_1400/s1365_how_many_numbers_are_smaller_than_the_current_number/Solution.kt)| Easy | Array, Hash_Table, Sorting, Counting | 193 | 93.33
| 1363 |[Largest Multiple of Three](src.save/main/kotlin/g1301_1400/s1363_largest_multiple_of_three/Solution.kt)| Hard | Array, Dynamic_Programming, Greedy | 267 | 100.00
| 1362 |[Closest Divisors](src.save/main/kotlin/g1301_1400/s1362_closest_divisors/Solution.kt)| Medium | Math | 167 | 100.00
| 1361 |[Validate Binary Tree Nodes](src.save/main/kotlin/g1301_1400/s1361_validate_binary_tree_nodes/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Graph, Union_Find | 316 | 83.33
| 1360 |[Number of Days Between Two Dates](src.save/main/kotlin/g1301_1400/s1360_number_of_days_between_two_dates/Solution.kt)| Easy | String, Math | 166 | 100.00
| 1359 |[Count All Valid Pickup and Delivery Options](src.save/main/kotlin/g1301_1400/s1359_count_all_valid_pickup_and_delivery_options/Solution.kt)| Hard | Dynamic_Programming, Math, Combinatorics | 121 | 100.00
| 1358 |[Number of Substrings Containing All Three Characters](src.save/main/kotlin/g1301_1400/s1358_number_of_substrings_containing_all_three_characters/Solution.kt)| Medium | String, Hash_Table, Sliding_Window | 196 | 100.00
| 1357 |[Apply Discount Every n Orders](src.save/main/kotlin/g1301_1400/s1357_apply_discount_every_n_orders/Cashier.kt)| Medium | Array, Hash_Table, Design | 967 | 100.00
| 1356 |[Sort Integers by The Number of 1 Bits](src.save/main/kotlin/g1301_1400/s1356_sort_integers_by_the_number_of_1_bits/Solution.kt)| Easy | Array, Sorting, Bit_Manipulation, Counting, Programming_Skills_I_Day_11_Containers_and_Libraries | 236 | 92.31
| 1354 |[Construct Target Array With Multiple Sums](src.save/main/kotlin/g1301_1400/s1354_construct_target_array_with_multiple_sums/Solution.kt)| Hard | Array, Heap_Priority_Queue | 289 | 100.00
| 1353 |[Maximum Number of Events That Can Be Attended](src.save/main/kotlin/g1301_1400/s1353_maximum_number_of_events_that_can_be_attended/Solution.kt)| Medium | Array, Greedy, Heap_Priority_Queue | 728 | 100.00
| 1352 |[Product of the Last K Numbers](src.save/main/kotlin/g1301_1400/s1352_product_of_the_last_k_numbers/ProductOfNumbers.kt)| Medium | Array, Math, Design, Queue, Data_Stream | 563 | 100.00
| 1351 |[Count Negative Numbers in a Sorted Matrix](src.save/main/kotlin/g1301_1400/s1351_count_negative_numbers_in_a_sorted_matrix/Solution.kt)| Easy | Array, Binary_Search, Matrix, Binary_Search_I_Day_8 | 206 | 71.43
| 1349 |[Maximum Students Taking Exam](src.save/main/kotlin/g1301_1400/s1349_maximum_students_taking_exam/Solution.kt)| Hard | Array, Dynamic_Programming, Matrix, Bit_Manipulation, Bitmask | 173 | 100.00
| 1348 |[Tweet Counts Per Frequency](src.save/main/kotlin/g1301_1400/s1348_tweet_counts_per_frequency/TweetCounts.kt)| Medium | Hash_Table, Sorting, Binary_Search, Design, Ordered_Set | 701 | 100.00
| 1347 |[Minimum Number of Steps to Make Two Strings Anagram](src.save/main/kotlin/g1301_1400/s1347_minimum_number_of_steps_to_make_two_strings_anagram/Solution.kt)| Medium | String, Hash_Table, Counting | 271 | 23.08
| 1346 |[Check If N and Its Double Exist](src.save/main/kotlin/g1301_1400/s1346_check_if_n_and_its_double_exist/Solution.kt)| Easy | Array, Hash_Table, Sorting, Binary_Search, Two_Pointers, Binary_Search_I_Day_9 | 175 | 70.83
| 1345 |[Jump Game IV](src.save/main/kotlin/g1301_1400/s1345_jump_game_iv/Solution.kt)| Hard | Array, Hash_Table, Breadth_First_Search | 599 | 100.00
| 1344 |[Angle Between Hands of a Clock](src.save/main/kotlin/g1301_1400/s1344_angle_between_hands_of_a_clock/Solution.kt)| Medium | Math | 118 | 83.33
| 1343 |[Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold](src.save/main/kotlin/g1301_1400/s1343_number_of_sub_arrays_of_size_k_and_average_greater_than_or_equal_to_threshold/Solution.kt)| Medium | Array, Sliding_Window | 394 | 84.62
| 1342 |[Number of Steps to Reduce a Number to Zero](src.save/main/kotlin/g1301_1400/s1342_number_of_steps_to_reduce_a_number_to_zero/Solution.kt)| Easy | Math, Bit_Manipulation | 124 | 83.18
| 1341 |[Movie Rating](src.save/main/kotlin/g1301_1400/s1341_movie_rating/script.sql)| Medium | Database | 2387 | 59.80
| 1340 |[Jump Game V](src.save/main/kotlin/g1301_1400/s1340_jump_game_v/Solution.kt)| Hard | Array, Dynamic_Programming, Sorting | 208 | 100.00
| 1339 |[Maximum Product of Splitted Binary Tree](src.save/main/kotlin/g1301_1400/s1339_maximum_product_of_splitted_binary_tree/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree | 384 | 100.00
| 1338 |[Reduce Array Size to The Half](src.save/main/kotlin/g1301_1400/s1338_reduce_array_size_to_the_half/Solution.kt)| Medium | Array, Hash_Table, Sorting, Greedy, Heap_Priority_Queue | 579 | 71.43
| 1337 |[The K Weakest Rows in a Matrix](src.save/main/kotlin/g1301_1400/s1337_the_k_weakest_rows_in_a_matrix/Solution.kt)| Easy | Array, Sorting, Binary_Search, Matrix, Heap_Priority_Queue, Binary_Search_I_Day_9 | 216 | 77.59
| 1335 |[Minimum Difficulty of a Job Schedule](src.save/main/kotlin/g1301_1400/s1335_minimum_difficulty_of_a_job_schedule/Solution.kt)| Hard | Array, Dynamic_Programming | 154 | 100.00
| 1334 |[Find the City With the Smallest Number of Neighbors at a Threshold Distance](src.save/main/kotlin/g1301_1400/s1334_find_the_city_with_the_smallest_number_of_neighbors_at_a_threshold_distance/Solution.kt)| Medium | Dynamic_Programming, Graph, Shortest_Path | 223 | 88.89
| 1333 |[Filter Restaurants by Vegan-Friendly, Price and Distance](src.save/main/kotlin/g1301_1400/s1333_filter_restaurants_by_vegan_friendly_price_and_distance/Solution.kt)| Medium | Array, Sorting | 326 | 100.00
| 1332 |[Remove Palindromic Subsequences](src.save/main/kotlin/g1301_1400/s1332_remove_palindromic_subsequences/Solution.kt)| Easy | String, Two_Pointers | 122 | 83.33
| 1331 |[Rank Transform of an Array](src.save/main/kotlin/g1301_1400/s1331_rank_transform_of_an_array/Solution.kt)| Easy | Array, Hash_Table, Sorting | 553 | 100.00
| 1330 |[Reverse Subarray To Maximize Array Value](src.save/main/kotlin/g1301_1400/s1330_reverse_subarray_to_maximize_array_value/Solution.kt)| Hard | Array, Math, Greedy | 347 | 100.00
| 1329 |[Sort the Matrix Diagonally](src.save/main/kotlin/g1301_1400/s1329_sort_the_matrix_diagonally/Solution.kt)| Medium | Array, Sorting, Matrix | 243 | 100.00
| 1328 |[Break a Palindrome](src.save/main/kotlin/g1301_1400/s1328_break_a_palindrome/Solution.kt)| Medium | String, Greedy | 137 | 81.82
| 1327 |[List the Products Ordered in a Period](src.save/main/kotlin/g1301_1400/s1327_list_the_products_ordered_in_a_period/script.sql)| Easy | Database | 1324 | 61.30
| 1326 |[Minimum Number of Taps to Open to Water a Garden](src.save/main/kotlin/g1301_1400/s1326_minimum_number_of_taps_to_open_to_water_a_garden/Solution.kt)| Hard | Array, Dynamic_Programming, Greedy | 189 | 100.00
| 1325 |[Delete Leaves With a Given Value](src.save/main/kotlin/g1301_1400/s1325_delete_leaves_with_a_given_value/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree | 185 | 100.00
| 1324 |[Print Words Vertically](src.save/main/kotlin/g1301_1400/s1324_print_words_vertically/Solution.kt)| Medium | Array, String, Simulation | 149 | 66.67
| 1323 |[Maximum 69 Number](src.save/main/kotlin/g1301_1400/s1323_maximum_69_number/Solution.kt)| Easy | Math, Greedy | 118 | 90.00
| 1321 |[Restaurant Growth](src.save/main/kotlin/g1301_1400/s1321_restaurant_growth/script.sql)| Medium | Database | 630 | 83.05
| 1320 |[Minimum Distance to Type a Word Using Two Fingers](src.save/main/kotlin/g1301_1400/s1320_minimum_distance_to_type_a_word_using_two_fingers/Solution.kt)| Hard | String, Dynamic_Programming | 181 | 100.00
| 1319 |[Number of Operations to Make Network Connected](src.save/main/kotlin/g1301_1400/s1319_number_of_operations_to_make_network_connected/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find, Graph_Theory_I_Day_8_Standard_Traversal | 379 | 83.33
| 1318 |[Minimum Flips to Make a OR b Equal to c](src.save/main/kotlin/g1301_1400/s1318_minimum_flips_to_make_a_or_b_equal_to_c/Solution.kt)| Medium | Bit_Manipulation | 123 | 88.89
| 1317 |[Convert Integer to the Sum of Two No-Zero Integers](src.save/main/kotlin/g1301_1400/s1317_convert_integer_to_the_sum_of_two_no_zero_integers/Solution.kt)| Easy | Math | 146 | 100.00
| 1316 |[Distinct Echo Substrings](src.save/main/kotlin/g1301_1400/s1316_distinct_echo_substrings/Solution.kt)| Hard | String, Dynamic_Programming, Sliding_Window, Trie, Hash_Function, Rolling_Hash | 371 | 100.00
| 1315 |[Sum of Nodes with Even-Valued Grandparent](src.save/main/kotlin/g1301_1400/s1315_sum_of_nodes_with_even_valued_grandparent/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 257 | 82.35
| 1314 |[Matrix Block Sum](src.save/main/kotlin/g1301_1400/s1314_matrix_block_sum/Solution.kt)| Medium | Array, Matrix, Prefix_Sum, Dynamic_Programming_I_Day_14 | 235 | 100.00
| 1313 |[Decompress Run-Length Encoded List](src.save/main/kotlin/g1301_1400/s1313_decompress_run_length_encoded_list/Solution.kt)| Easy | Array | 196 | 100.00
| 1312 |[Minimum Insertion Steps to Make a String Palindrome](src.save/main/kotlin/g1301_1400/s1312_minimum_insertion_steps_to_make_a_string_palindrome/Solution.kt)| Hard | String, Dynamic_Programming | 186 | 67.70
| 1311 |[Get Watched Videos by Your Friends](src.save/main/kotlin/g1301_1400/s1311_get_watched_videos_by_your_friends/Solution.kt)| Medium | Array, Hash_Table, Sorting, Breadth_First_Search | 372 | 100.00
| 1310 |[XOR Queries of a Subarray](src.save/main/kotlin/g1301_1400/s1310_xor_queries_of_a_subarray/Solution.kt)| Medium | Array, Bit_Manipulation, Prefix_Sum | 382 | 100.00
| 1309 |[Decrypt String from Alphabet to Integer Mapping](src.save/main/kotlin/g1301_1400/s1309_decrypt_string_from_alphabet_to_integer_mapping/Solution.kt)| Easy | String, Programming_Skills_I_Day_9_String | 129 | 95.45
| 1307 |[Verbal Arithmetic Puzzle](src.save/main/kotlin/g1301_1400/s1307_verbal_arithmetic_puzzle/Solution.kt)| Hard | Array, String, Math, Backtracking | 164 | 100.00
| 1306 |[Jump Game III](src.save/main/kotlin/g1301_1400/s1306_jump_game_iii/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Graph_Theory_I_Day_11_Breadth_First_Search, Udemy_Arrays | 291 | 100.00
| 1305 |[All Elements in Two Binary Search Trees](src.save/main/kotlin/g1301_1400/s1305_all_elements_in_two_binary_search_trees/Solution.kt)| Medium | Sorting, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 531 | 100.00
| 1304 |[Find N Unique Integers Sum up to Zero](src.save/main/kotlin/g1301_1400/s1304_find_n_unique_integers_sum_up_to_zero/Solution.kt)| Easy | Array, Math | 142 | 100.00
| 1302 |[Deepest Leaves Sum](src.save/main/kotlin/g1301_1400/s1302_deepest_leaves_sum/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 325 | 67.39
| 1301 |[Number of Paths with Max Score](src.save/main/kotlin/g1301_1400/s1301_number_of_paths_with_max_score/Solution.kt)| Hard | Array, Dynamic_Programming, Matrix | 178 | 100.00
| 1300 |[Sum of Mutated Array Closest to Target](src.save/main/kotlin/g1201_1300/s1300_sum_of_mutated_array_closest_to_target/Solution.kt)| Medium | Array, Sorting, Binary_Search, Binary_Search_II_Day_16 | 217 | 100.00
| 1299 |[Replace Elements with Greatest Element on Right Side](src.save/main/kotlin/g1201_1300/s1299_replace_elements_with_greatest_element_on_right_side/Solution.kt)| Easy | Array | 514 | 79.69
| 1298 |[Maximum Candies You Can Get from Boxes](src.save/main/kotlin/g1201_1300/s1298_maximum_candies_you_can_get_from_boxes/Solution.kt)| Hard | Array, Breadth_First_Search | 442 | 80.00
| 1297 |[Maximum Number of Occurrences of a Substring](src.save/main/kotlin/g1201_1300/s1297_maximum_number_of_occurrences_of_a_substring/Solution.kt)| Medium | String, Hash_Table, Sliding_Window | 253 | 75.00
| 1296 |[Divide Array in Sets of K Consecutive Numbers](src.save/main/kotlin/g1201_1300/s1296_divide_array_in_sets_of_k_consecutive_numbers/Solution.kt)| Medium | Array, Hash_Table, Sorting, Greedy | 488 | 100.00
| 1295 |[Find Numbers with Even Number of Digits](src.save/main/kotlin/g1201_1300/s1295_find_numbers_with_even_number_of_digits/Solution.kt)| Easy | Array | 189 | 35.85
| 1293 |[Shortest Path in a Grid with Obstacles Elimination](src.save/main/kotlin/g1201_1300/s1293_shortest_path_in_a_grid_with_obstacles_elimination/Solution.kt)| Hard | Array, Breadth_First_Search, Matrix | 189 | 100.00
| 1292 |[Maximum Side Length of a Square with Sum Less than or Equal to Threshold](src.save/main/kotlin/g1201_1300/s1292_maximum_side_length_of_a_square_with_sum_less_than_or_equal_to_threshold/Solution.kt)| Medium | Array, Binary_Search, Matrix, Prefix_Sum, Binary_Search_II_Day_15 | 376 | 100.00
| 1291 |[Sequential Digits](src.save/main/kotlin/g1201_1300/s1291_sequential_digits/Solution.kt)| Medium | Enumeration, Udemy_Arrays | 114 | 100.00
| 1290 |[Convert Binary Number in a Linked List to Integer](src.save/main/kotlin/g1201_1300/s1290_convert_binary_number_in_a_linked_list_to_integer/Solution.kt)| Easy | Math, Linked_List, Programming_Skills_I_Day_10_Linked_List_and_Tree | 145 | 25.93
| 1289 |[Minimum Falling Path Sum II](src.save/main/kotlin/g1201_1300/s1289_minimum_falling_path_sum_ii/Solution.kt)| Hard | Array, Dynamic_Programming, Matrix | 234 | 100.00
| 1288 |[Remove Covered Intervals](src.save/main/kotlin/g1201_1300/s1288_remove_covered_intervals/Solution.kt)| Medium | Array, Sorting | 184 | 100.00
| 1287 |[Element Appearing More Than 25% In Sorted Array](src.save/main/kotlin/g1201_1300/s1287_element_appearing_more_than_25_in_sorted_array/Solution.kt)| Easy | Array | 199 | 100.00
| 1286 |[Iterator for Combination](src.save/main/kotlin/g1201_1300/s1286_iterator_for_combination/CombinationIterator.kt)| Medium | String, Design, Backtracking, Iterator | 236 | 100.00
| 1284 |[Minimum Number of Flips to Convert Binary Matrix to Zero Matrix](src.save/main/kotlin/g1201_1300/s1284_minimum_number_of_flips_to_convert_binary_matrix_to_zero_matrix/Solution.kt)| Hard | Array, Breadth_First_Search, Matrix, Bit_Manipulation | 131 | 100.00
| 1283 |[Find the Smallest Divisor Given a Threshold](src.save/main/kotlin/g1201_1300/s1283_find_the_smallest_divisor_given_a_threshold/Solution.kt)| Medium | Array, Binary_Search, Binary_Search_II_Day_5 | 255 | 100.00
| 1282 |[Group the People Given the Group Size They Belong To](src.save/main/kotlin/g1201_1300/s1282_group_the_people_given_the_group_size_they_belong_to/Solution.kt)| Medium | Array, Hash_Table | 267 | 100.00
| 1281 |[Subtract the Product and Sum of Digits of an Integer](src.save/main/kotlin/g1201_1300/s1281_subtract_the_product_and_sum_of_digits_of_an_integer/Solution.kt)| Easy | Math, Programming_Skills_I_Day_2_Operator | 128 | 61.82
| 1280 |[Students and Examinations](src.save/main/kotlin/g1201_1300/s1280_students_and_examinations/script.sql)| Easy | Database | 1552 | 85.96
| 1278 |[Palindrome Partitioning III](src.save/main/kotlin/g1201_1300/s1278_palindrome_partitioning_iii/Solution.kt)| Hard | String, Dynamic_Programming | 137 | 100.00
| 1277 |[Count Square Submatrices with All Ones](src.save/main/kotlin/g1201_1300/s1277_count_square_submatrices_with_all_ones/Solution.kt)| Medium | Array, Dynamic_Programming, Matrix | 381 | 75.00
| 1276 |[Number of Burgers with No Waste of Ingredients](src.save/main/kotlin/g1201_1300/s1276_number_of_burgers_with_no_waste_of_ingredients/Solution.kt)| Medium | Math | 190 | 50.00
| 1275 |[Find Winner on a Tic Tac Toe Game](src.save/main/kotlin/g1201_1300/s1275_find_winner_on_a_tic_tac_toe_game/Solution.kt)| Easy | Array, Hash_Table, Matrix, Simulation | 125 | 87.50
| 1269 |[Number of Ways to Stay in the Same Place After Some Steps](src.save/main/kotlin/g1201_1300/s1269_number_of_ways_to_stay_in_the_same_place_after_some_steps/Solution.kt)| Hard | Dynamic_Programming | 159 | 50.00
| 1268 |[Search Suggestions System](src.save/main/kotlin/g1201_1300/s1268_search_suggestions_system/Solution.kt)| Medium | Array, String | 331 | 100.00
| 1267 |[Count Servers that Communicate](src.save/main/kotlin/g1201_1300/s1267_count_servers_that_communicate/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Counting, Union_Find | 295 | 100.00
| 1266 |[Minimum Time Visiting All Points](src.save/main/kotlin/g1201_1300/s1266_minimum_time_visiting_all_points/Solution.kt)| Easy | Array, Math, Geometry | 152 | 100.00
| 1263 |[Minimum Moves to Move a Box to Their Target Location](src.save/main/kotlin/g1201_1300/s1263_minimum_moves_to_move_a_box_to_their_target_location/Solution.kt)| Hard | Array, Breadth_First_Search, Matrix, Heap_Priority_Queue | 183 | 100.00
| 1262 |[Greatest Sum Divisible by Three](src.save/main/kotlin/g1201_1300/s1262_greatest_sum_divisible_by_three/Solution.kt)| Medium | Array, Dynamic_Programming, Greedy | 263 | 100.00
| 1261 |[Find Elements in a Contaminated Binary Tree](src.save/main/kotlin/g1201_1300/s1261_find_elements_in_a_contaminated_binary_tree/FindElements.kt)| Medium | Hash_Table, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Design | 287 | 100.00
| 1260 |[Shift 2D Grid](src.save/main/kotlin/g1201_1300/s1260_shift_2d_grid/Solution.kt)| Easy | Array, Matrix, Simulation | 302 | 100.00
| 1255 |[Maximum Score Words Formed by Letters](src.save/main/kotlin/g1201_1300/s1255_maximum_score_words_formed_by_letters/Solution.kt)| Hard | Array, String, Dynamic_Programming, Bit_Manipulation, Backtracking, Bitmask | 131 | 100.00
| 1254 |[Number of Closed Islands](src.save/main/kotlin/g1201_1300/s1254_number_of_closed_islands/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find, Graph_Theory_I_Day_2_Matrix_Related_Problems | 177 | 89.47
| 1253 |[Reconstruct a 2-Row Binary Matrix](src.save/main/kotlin/g1201_1300/s1253_reconstruct_a_2_row_binary_matrix/Solution.kt)| Medium | Array, Greedy, Matrix | 496 | 75.00
| 1252 |[Cells with Odd Values in a Matrix](src.save/main/kotlin/g1201_1300/s1252_cells_with_odd_values_in_a_matrix/Solution.kt)| Easy | Array, Math, Simulation | 134 | 100.00
| 1251 |[Average Selling Price](src.save/main/kotlin/g1201_1300/s1251_average_selling_price/script.sql)| Easy | Database | 1371 | 76.11
| 1250 |[Check If It Is a Good Array](src.save/main/kotlin/g1201_1300/s1250_check_if_it_is_a_good_array/Solution.kt)| Hard | Array, Math, Number_Theory | 334 | 100.00
| 1249 |[Minimum Remove to Make Valid Parentheses](src.save/main/kotlin/g1201_1300/s1249_minimum_remove_to_make_valid_parentheses/Solution.kt)| Medium | String, Stack, Data_Structure_II_Day_14_Stack_Queue | 218 | 100.00
| 1248 |[Count Number of Nice Subarrays](src.save/main/kotlin/g1201_1300/s1248_count_number_of_nice_subarrays/Solution.kt)| Medium | Array, Hash_Table, Math, Sliding_Window | 431 | 93.33
| 1247 |[Minimum Swaps to Make Strings Equal](src.save/main/kotlin/g1201_1300/s1247_minimum_swaps_to_make_strings_equal/Solution.kt)| Medium | String, Math, Greedy | 134 | 66.67
| 1240 |[Tiling a Rectangle with the Fewest Squares](src.save/main/kotlin/g1201_1300/s1240_tiling_a_rectangle_with_the_fewest_squares/Solution.kt)| Hard | Dynamic_Programming, Backtracking | 134 | 75.00
| 1239 |[Maximum Length of a Concatenated String with Unique Characters](src.save/main/kotlin/g1201_1300/s1239_maximum_length_of_a_concatenated_string_with_unique_characters/Solution.kt)| Medium | Array, String, Bit_Manipulation, Backtracking | 166 | 50.00
| 1238 |[Circular Permutation in Binary Representation](src.save/main/kotlin/g1201_1300/s1238_circular_permutation_in_binary_representation/Solution.kt)| Medium | Math, Bit_Manipulation, Backtracking | 296 | 100.00
| 1237 |[Find Positive Integer Solution for a Given Equation](src.save/main/kotlin/g1201_1300/s1237_find_positive_integer_solution_for_a_given_equation/Solution.kt)| Medium | Math, Binary_Search, Two_Pointers, Interactive | 176 | 36.36
| 1235 |[Maximum Profit in Job Scheduling](src.save/main/kotlin/g1201_1300/s1235_maximum_profit_in_job_scheduling/Solution.kt)| Hard | Array, Dynamic_Programming, Sorting, Binary_Search | 370 | 100.00
| 1234 |[Replace the Substring for Balanced String](src.save/main/kotlin/g1201_1300/s1234_replace_the_substring_for_balanced_string/Solution.kt)| Medium | String, Sliding_Window | 182 | 100.00
| 1233 |[Remove Sub-Folders from the Filesystem](src.save/main/kotlin/g1201_1300/s1233_remove_sub_folders_from_the_filesystem/Solution.kt)| Medium | Array, String, Trie | 459 | 40.00
| 1232 |[Check If It Is a Straight Line](src.save/main/kotlin/g1201_1300/s1232_check_if_it_is_a_straight_line/Solution.kt)| Easy | Array, Math, Geometry, Programming_Skills_I_Day_5_Function | 152 | 95.38
| 1227 |[Airplane Seat Assignment Probability](src.save/main/kotlin/g1201_1300/s1227_airplane_seat_assignment_probability/Solution.kt)| Medium | Dynamic_Programming, Math, Brainteaser, Probability_and_Statistics | 135 | 100.00
| 1226 |[The Dining Philosophers](src.save/main/kotlin/g1201_1300/s1226_the_dining_philosophers/DiningPhilosophers.kt)| Medium | Concurrency | 12 | 95.88
| 1224 |[Maximum Equal Frequency](src.save/main/kotlin/g1201_1300/s1224_maximum_equal_frequency/Solution.kt)| Hard | Array, Hash_Table | 330 | 100.00
| 1223 |[Dice Roll Simulation](src.save/main/kotlin/g1201_1300/s1223_dice_roll_simulation/Solution.kt)| Hard | Array, Dynamic_Programming | 146 | 100.00
| 1222 |[Queens That Can Attack the King](src.save/main/kotlin/g1201_1300/s1222_queens_that_can_attack_the_king/Solution.kt)| Medium | Array, Matrix, Simulation | 189 | 50.00
| 1221 |[Split a String in Balanced Strings](src.save/main/kotlin/g1201_1300/s1221_split_a_string_in_balanced_strings/Solution.kt)| Easy | String, Greedy, Counting | 131 | 67.65
| 1220 |[Count Vowels Permutation](src.save/main/kotlin/g1201_1300/s1220_count_vowels_permutation/Solution.kt)| Hard | Dynamic_Programming | 129 | 100.00
| 1219 |[Path with Maximum Gold](src.save/main/kotlin/g1201_1300/s1219_path_with_maximum_gold/Solution.kt)| Medium | Array, Matrix, Backtracking | 238 | 100.00
| 1218 |[Longest Arithmetic Subsequence of Given Difference](src.save/main/kotlin/g1201_1300/s1218_longest_arithmetic_subsequence_of_given_difference/Solution.kt)| Medium | Array, Hash_Table, Dynamic_Programming | 420 | 100.00
| 1217 |[Minimum Cost to Move Chips to The Same Position](src.save/main/kotlin/g1201_1300/s1217_minimum_cost_to_move_chips_to_the_same_position/Solution.kt)| Easy | Array, Math, Greedy | 119 | 100.00
| 1211 |[Queries Quality and Percentage](src.save/main/kotlin/g1201_1300/s1211_queries_quality_and_percentage/script.sql)| Easy | Database | 1176 | 80.10
| 1210 |[Minimum Moves to Reach Target with Rotations](src.save/main/kotlin/g1201_1300/s1210_minimum_moves_to_reach_target_with_rotations/Solution.kt)| Hard | Array, Breadth_First_Search, Matrix | 230 | 100.00
| 1209 |[Remove All Adjacent Duplicates in String II](src.save/main/kotlin/g1201_1300/s1209_remove_all_adjacent_duplicates_in_string_ii/Solution.kt)| Medium | String, Stack | 223 | 100.00
| 1208 |[Get Equal Substrings Within Budget](src.save/main/kotlin/g1201_1300/s1208_get_equal_substrings_within_budget/Solution.kt)| Medium | String, Binary_Search, Prefix_Sum, Sliding_Window | 163 | 100.00
| 1207 |[Unique Number of Occurrences](src.save/main/kotlin/g1201_1300/s1207_unique_number_of_occurrences/Solution.kt)| Easy | Array, Hash_Table | 151 | 83.00
| 1206 |[Design Skiplist](src.save/main/kotlin/g1201_1300/s1206_design_skiplist/Skiplist.kt)| Hard | Design, Linked_List | 306 | 100.00
| 1204 |[Last Person to Fit in the Bus](src.save/main/kotlin/g1201_1300/s1204_last_person_to_fit_in_the_bus/script.sql)| Medium | Database | 1476 | 82.95
| 1203 |[Sort Items by Groups Respecting Dependencies](src.save/main/kotlin/g1201_1300/s1203_sort_items_by_groups_respecting_dependencies/Solution.kt)| Hard | Depth_First_Search, Breadth_First_Search, Graph, Topological_Sort | 503 | 100.00
| 1202 |[Smallest String With Swaps](src.save/main/kotlin/g1201_1300/s1202_smallest_string_with_swaps/Solution.kt)| Medium | String, Hash_Table, Depth_First_Search, Breadth_First_Search, Union_Find | 562 | 100.00
| 1201 |[Ugly Number III](src.save/main/kotlin/g1201_1300/s1201_ugly_number_iii/Solution.kt)| Medium | Math, Binary_Search, Number_Theory, Binary_Search_II_Day_20 | 136 | 100.00
| 1200 |[Minimum Absolute Difference](src.save/main/kotlin/g1101_1200/s1200_minimum_absolute_difference/Solution.kt)| Easy | Array, Sorting | 507 | 75.00
| 1195 |[Fizz Buzz Multithreaded](src.save/main/kotlin/g1101_1200/s1195_fizz_buzz_multithreaded/FizzBuzz.kt)| Medium | Concurrency | 6 | 87.26
| 1193 |[Monthly Transactions I](src.save/main/kotlin/g1101_1200/s1193_monthly_transactions_i/script.sql)| Medium | Database | 891 | 92.73
| 1192 |[Critical Connections in a Network](src.save/main/kotlin/g1101_1200/s1192_critical_connections_in_a_network/Solution.kt)| Hard | Depth_First_Search, Graph, Biconnected_Component | 1696 | 60.00
| 1191 |[K-Concatenation Maximum Sum](src.save/main/kotlin/g1101_1200/s1191_k_concatenation_maximum_sum/Solution.kt)| Medium | Array, Dynamic_Programming | 389 | 100.00
| 1190 |[Reverse Substrings Between Each Pair of Parentheses](src.save/main/kotlin/g1101_1200/s1190_reverse_substrings_between_each_pair_of_parentheses/Solution.kt)| Medium | String, Stack | 153 | 42.86
| 1189 |[Maximum Number of Balloons](src.save/main/kotlin/g1101_1200/s1189_maximum_number_of_balloons/Solution.kt)| Easy | String, Hash_Table, Counting | 136 | 98.31
| 1187 |[Make Array Strictly Increasing](src.save/main/kotlin/g1101_1200/s1187_make_array_strictly_increasing/Solution.kt)| Hard | Array, Dynamic_Programming, Binary_Search | 308 | 100.00
| 1186 |[Maximum Subarray Sum with One Deletion](src.save/main/kotlin/g1101_1200/s1186_maximum_subarray_sum_with_one_deletion/Solution.kt)| Medium | Array, Dynamic_Programming | 304 | 50.00
| 1185 |[Day of the Week](src.save/main/kotlin/g1101_1200/s1185_day_of_the_week/Solution.kt)| Easy | Math | 127 | 50.00
| 1184 |[Distance Between Bus Stops](src.save/main/kotlin/g1101_1200/s1184_distance_between_bus_stops/Solution.kt)| Easy | Array | 164 | 57.14
| 1179 |[Reformat Department Table](src.save/main/kotlin/g1101_1200/s1179_reformat_department_table/script.sql)| Easy | Database | 815 | 90.95
| 1178 |[Number of Valid Words for Each Puzzle](src.save/main/kotlin/g1101_1200/s1178_number_of_valid_words_for_each_puzzle/Solution.kt)| Hard | Array, String, Hash_Table, Bit_Manipulation, Trie | 675 | 100.00
| 1177 |[Can Make Palindrome from Substring](src.save/main/kotlin/g1101_1200/s1177_can_make_palindrome_from_substring/Solution.kt)| Medium | String, Hash_Table, Bit_Manipulation, Prefix_Sum | 937 | 100.00
| 1175 |[Prime Arrangements](src.save/main/kotlin/g1101_1200/s1175_prime_arrangements/Solution.kt)| Easy | Math | 129 | 50.00
| 1174 |[Immediate Food Delivery II](src.save/main/kotlin/g1101_1200/s1174_immediate_food_delivery_ii/script.sql)| Medium | Database | 981 | 97.51
| 1172 |[Dinner Plate Stacks](src.save/main/kotlin/g1101_1200/s1172_dinner_plate_stacks/DinnerPlates.kt)| Hard | Hash_Table, Stack, Design, Heap_Priority_Queue | 1160 | 50.00
| 1171 |[Remove Zero Sum Consecutive Nodes from Linked List](src.save/main/kotlin/g1101_1200/s1171_remove_zero_sum_consecutive_nodes_from_linked_list/Solution.kt)| Medium | Hash_Table, Linked_List | 194 | 50.00
| 1170 |[Compare Strings by Frequency of the Smallest Character](src.save/main/kotlin/g1101_1200/s1170_compare_strings_by_frequency_of_the_smallest_character/Solution.kt)| Medium | Array, String, Hash_Table, Sorting, Binary_Search | 221 | 50.00
| 1169 |[Invalid Transactions](src.save/main/kotlin/g1101_1200/s1169_invalid_transactions/Solution.kt)| Medium | Array, String, Hash_Table, Sorting | 362 | 57.14
| 1164 |[Product Price at a Given Date](src.save/main/kotlin/g1101_1200/s1164_product_price_at_a_given_date/script.sql)| Medium | Database | 774 | 91.86
| 1163 |[Last Substring in Lexicographical Order](src.save/main/kotlin/g1101_1200/s1163_last_substring_in_lexicographical_order/Solution.kt)| Hard | String, Two_Pointers | 254 | 100.00
| 1162 |[As Far from Land as Possible](src.save/main/kotlin/g1101_1200/s1162_as_far_from_land_as_possible/Solution.kt)| Medium | Array, Dynamic_Programming, Breadth_First_Search, Matrix, Graph_Theory_I_Day_4_Matrix_Related_Problems | 362 | 81.25
| 1161 |[Maximum Level Sum of a Binary Tree](src.save/main/kotlin/g1101_1200/s1161_maximum_level_sum_of_a_binary_tree/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 445 | 87.50
| 1160 |[Find Words That Can Be Formed by Characters](src.save/main/kotlin/g1101_1200/s1160_find_words_that_can_be_formed_by_characters/Solution.kt)| Easy | Array, String, Hash_Table | 288 | 72.22
| 1158 |[Market Analysis I](src.save/main/kotlin/g1101_1200/s1158_market_analysis_i/script.sql)| Medium | Database, SQL_I_Day_9_Control_of_Flow | 2470 | 44.76
| 1157 |[Online Majority Element In Subarray](src.save/main/kotlin/g1101_1200/s1157_online_majority_element_in_subarray/MajorityChecker.kt)| Hard | Array, Binary_Search, Design, Segment_Tree, Binary_Indexed_Tree | 953 | 100.00
| 1156 |[Swap For Longest Repeated Character Substring](src.save/main/kotlin/g1101_1200/s1156_swap_for_longest_repeated_character_substring/Solution.kt)| Medium | String, Sliding_Window | 195 | 20.00
| 1155 |[Number of Dice Rolls With Target Sum](src.save/main/kotlin/g1101_1200/s1155_number_of_dice_rolls_with_target_sum/Solution.kt)| Medium | Dynamic_Programming | 158 | 80.95
| 1154 |[Day of the Year](src.save/main/kotlin/g1101_1200/s1154_day_of_the_year/Solution.kt)| Easy | String, Math | 317 | 70.00
| 1148 |[Article Views I](src.save/main/kotlin/g1101_1200/s1148_article_views_i/script.sql)| Easy | LeetCode_Curated_SQL_70, Database, SQL_I_Day_5_Union | 806 | 54.41
| 1147 |[Longest Chunked Palindrome Decomposition](src.save/main/kotlin/g1101_1200/s1147_longest_chunked_palindrome_decomposition/Solution.kt)| Hard | String, Dynamic_Programming, Greedy, Two_Pointers, Hash_Function, Rolling_Hash | 148 | 50.00
| 1146 |[Snapshot Array](src.save/main/kotlin/g1101_1200/s1146_snapshot_array/SnapshotArray.kt)| Medium | Array, Hash_Table, Binary_Search, Design, Binary_Search_II_Day_18 | 1064 | 57.14
| 1145 |[Binary Tree Coloring Game](src.save/main/kotlin/g1101_1200/s1145_binary_tree_coloring_game/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree | 181 | 100.00
| 1144 |[Decrease Elements To Make Array Zigzag](src.save/main/kotlin/g1101_1200/s1144_decrease_elements_to_make_array_zigzag/Solution.kt)| Medium | Array, Greedy | 144 | 100.00
| 1143 |[Longest Common Subsequence](src.save/main/kotlin/g1101_1200/s1143_longest_common_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming, Algorithm_II_Day_17_Dynamic_Programming, Dynamic_Programming_I_Day_19, Udemy_Dynamic_Programming | 307 | 38.36
| 1141 |[User Activity for the Past 30 Days I](src.save/main/kotlin/g1101_1200/s1141_user_activity_for_the_past_30_days_i/script.sql)| Easy | LeetCode_Curated_SQL_70, Database, SQL_I_Day_7_Function | 790 | 87.11
| 1140 |[Stone Game II](src.save/main/kotlin/g1101_1200/s1140_stone_game_ii/Solution.kt)| Medium | Array, Dynamic_Programming, Math, Game_Theory | 166 | 93.27
| 1139 |[Largest 1-Bordered Square](src.save/main/kotlin/g1101_1200/s1139_largest_1_bordered_square/Solution.kt)| Medium | Array, Dynamic_Programming, Matrix | 224 | 100.00
| 1138 |[Alphabet Board Path](src.save/main/kotlin/g1101_1200/s1138_alphabet_board_path/Solution.kt)| Medium | String, Hash_Table | 138 | 100.00
| 1137 |[N-th Tribonacci Number](src.save/main/kotlin/g1101_1200/s1137_n_th_tribonacci_number/Solution.kt)| Easy | Dynamic_Programming, Math, Memoization, Dynamic_Programming_I_Day_1 | 122 | 69.35
| 1131 |[Maximum of Absolute Value Expression](src.save/main/kotlin/g1101_1200/s1131_maximum_of_absolute_value_expression/Solution.kt)| Medium | Array, Math | 333 | 100.00
| 1130 |[Minimum Cost Tree From Leaf Values](src.save/main/kotlin/g1101_1200/s1130_minimum_cost_tree_from_leaf_values/Solution.kt)| Medium | Dynamic_Programming, Greedy, Stack, Monotonic_Stack | 145 | 66.67
| 1129 |[Shortest Path with Alternating Colors](src.save/main/kotlin/g1101_1200/s1129_shortest_path_with_alternating_colors/Solution.kt)| Medium | Breadth_First_Search, Graph, Graph_Theory_I_Day_10_Standard_Traversal | 241 | 16.67
| 1128 |[Number of Equivalent Domino Pairs](src.save/main/kotlin/g1101_1200/s1128_number_of_equivalent_domino_pairs/Solution.kt)| Easy | Array, Hash_Table, Counting | 289 | 80.00
| 1125 |[Smallest Sufficient Team](src.save/main/kotlin/g1101_1200/s1125_smallest_sufficient_team/Solution.kt)| Hard | Array, Dynamic_Programming, Bit_Manipulation, Bitmask | 181 | 100.00
| 1124 |[Longest Well-Performing Interval](src.save/main/kotlin/g1101_1200/s1124_longest_well_performing_interval/Solution.kt)| Medium | Array, Hash_Table, Stack, Prefix_Sum, Monotonic_Stack | 313 | 100.00
| 1123 |[Lowest Common Ancestor of Deepest Leaves](src.save/main/kotlin/g1101_1200/s1123_lowest_common_ancestor_of_deepest_leaves/Solution.kt)| Medium | Hash_Table, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 221 | 66.67
| 1122 |[Relative Sort Array](src.save/main/kotlin/g1101_1200/s1122_relative_sort_array/Solution.kt)| Easy | Array, Hash_Table, Sorting, Counting_Sort | 183 | 90.00
| 1117 |[Building H2O](src.save/main/kotlin/g1101_1200/s1117_building_h2o/H2O.kt)| Medium | Concurrency | 20 | 45.16
| 1116 |[Print Zero Even Odd](src.save/main/kotlin/g1101_1200/s1116_print_zero_even_odd/ZeroEvenOdd.kt)| Medium | Concurrency | 7 | 39.21
| 1115 |[Print FooBar Alternately](src.save/main/kotlin/g1101_1200/s1115_print_foobar_alternately/FooBar.kt)| Medium | Concurrency | 23 | 71.25
| 1114 |[Print in Order](src.save/main/kotlin/g1101_1200/s1114_print_in_order/Foo.kt)| Easy | Concurrency | 13 | 30.13
| 1111 |[Maximum Nesting Depth of Two Valid Parentheses Strings](src.save/main/kotlin/g1101_1200/s1111_maximum_nesting_depth_of_two_valid_parentheses_strings/Solution.kt)| Medium | String, Stack | 207 | 33.33
| 1110 |[Delete Nodes And Return Forest](src.save/main/kotlin/g1101_1200/s1110_delete_nodes_and_return_forest/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree | 223 | 100.00
| 1109 |[Corporate Flight Bookings](src.save/main/kotlin/g1101_1200/s1109_corporate_flight_bookings/Solution.kt)| Medium | Array, Prefix_Sum | 719 | 100.00
| 1108 |[Defanging an IP Address](src.save/main/kotlin/g1101_1200/s1108_defanging_an_ip_address/Solution.kt)| Easy | String | 159 | 62.10
| 1106 |[Parsing A Boolean Expression](src.save/main/kotlin/g1101_1200/s1106_parsing_a_boolean_expression/Solution.kt)| Hard | String, Stack, Recursion | 205 | 100.00
| 1105 |[Filling Bookcase Shelves](src.save/main/kotlin/g1101_1200/s1105_filling_bookcase_shelves/Solution.kt)| Medium | Array, Dynamic_Programming | 175 | 33.33
| 1104 |[Path In Zigzag Labelled Binary Tree](src.save/main/kotlin/g1101_1200/s1104_path_in_zigzag_labelled_binary_tree/Solution.kt)| Medium | Math, Tree, Binary_Tree | 136 | 100.00
| 1103 |[Distribute Candies to People](src.save/main/kotlin/g1101_1200/s1103_distribute_candies_to_people/Solution.kt)| Easy | Math, Simulation | 129 | 100.00
| 1096 |[Brace Expansion II](src.save/main/kotlin/g1001_1100/s1096_brace_expansion_ii/Solution.kt)| Hard | String, Breadth_First_Search, Stack, Backtracking | 205 | 100.00
| 1095 |[Find in Mountain Array](src.save/main/kotlin/g1001_1100/s1095_find_in_mountain_array/Solution.kt)| Hard | Array, Binary_Search, Interactive | 173 | 100.00
| 1094 |[Car Pooling](src.save/main/kotlin/g1001_1100/s1094_car_pooling/Solution.kt)| Medium | Array, Sorting, Heap_Priority_Queue, Simulation, Prefix_Sum | 172 | 81.82
| 1093 |[Statistics from a Large Sample](src.save/main/kotlin/g1001_1100/s1093_statistics_from_a_large_sample/Solution.kt)| Medium | Math, Two_Pointers, Probability_and_Statistics | 191 | 100.00
| 1092 |[Shortest Common Supersequence](src.save/main/kotlin/g1001_1100/s1092_shortest_common_supersequence/Solution.kt)| Hard | String, Dynamic_Programming | 174 | 100.00
| 1091 |[Shortest Path in Binary Matrix](src.save/main/kotlin/g1001_1100/s1091_shortest_path_in_binary_matrix/Solution.kt)| Medium | Array, Breadth_First_Search, Matrix, Algorithm_II_Day_8_Breadth_First_Search_Depth_First_Search, Graph_Theory_I_Day_5_Matrix_Related_Problems | 305 | 98.28
| 1090 |[Largest Values From Labels](src.save/main/kotlin/g1001_1100/s1090_largest_values_from_labels/Solution.kt)| Medium | Array, Hash_Table, Sorting, Greedy, Counting | 281 | 100.00
| 1089 |[Duplicate Zeros](src.save/main/kotlin/g1001_1100/s1089_duplicate_zeros/Solution.kt)| Easy | Array, Two_Pointers | 185 | 93.60
| 1084 |[Sales Analysis III](src.save/main/kotlin/g1001_1100/s1084_sales_analysis_iii/script.sql)| Easy | LeetCode_Curated_SQL_70, Database, SQL_I_Day_10_Where | 1881 | 79.36
| 1081 |[Smallest Subsequence of Distinct Characters](src.save/main/kotlin/g1001_1100/s1081_smallest_subsequence_of_distinct_characters/Solution.kt)| Medium | String, Greedy, Stack, Monotonic_Stack | 146 | 100.00
| 1080 |[Insufficient Nodes in Root to Leaf Paths](src.save/main/kotlin/g1001_1100/s1080_insufficient_nodes_in_root_to_leaf_paths/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree | 271 | 100.00
| 1079 |[Letter Tile Possibilities](src.save/main/kotlin/g1001_1100/s1079_letter_tile_possibilities/Solution.kt)| Medium | String, Backtracking | 144 | 100.00
| 1078 |[Occurrences After Bigram](src.save/main/kotlin/g1001_1100/s1078_occurrences_after_bigram/Solution.kt)| Easy | String | 151 | 88.24
| 1075 |[Project Employees I](src.save/main/kotlin/g1001_1100/s1075_project_employees_i/script.sql)| Easy | Database | 1268 | 94.71
| 1074 |[Number of Submatrices That Sum to Target](src.save/main/kotlin/g1001_1100/s1074_number_of_submatrices_that_sum_to_target/Solution.kt)| Hard | Array, Hash_Table, Matrix, Prefix_Sum | 770 | 100.00
| 1073 |[Adding Two Negabinary Numbers](src.save/main/kotlin/g1001_1100/s1073_adding_two_negabinary_numbers/Solution.kt)| Medium | Array, Math | 187 | 100.00
| 1072 |[Flip Columns For Maximum Number of Equal Rows](src.save/main/kotlin/g1001_1100/s1072_flip_columns_for_maximum_number_of_equal_rows/Solution.kt)| Medium | Array, Hash_Table, Matrix | 536 | 100.00
| 1071 |[Greatest Common Divisor of Strings](src.save/main/kotlin/g1001_1100/s1071_greatest_common_divisor_of_strings/Solution.kt)| Easy | String, Math | 150 | 80.68
| 1070 |[Product Sales Analysis III](src.save/main/kotlin/g1001_1100/s1070_product_sales_analysis_iii/script.sql)| Medium | Database | 1561 | 95.47
| 1068 |[Product Sales Analysis I](src.save/main/kotlin/g1001_1100/s1068_product_sales_analysis_i/script.sql)| Easy | Database | 1897 | 79.88
| 1061 |[Lexicographically Smallest Equivalent String](src.save/main/kotlin/g1001_1100/s1061_lexicographically_smallest_equivalent_string/Solution.kt)| Medium | String, Union_Find | 166 | 100.00
| 1054 |[Distant Barcodes](src.save/main/kotlin/g1001_1100/s1054_distant_barcodes/Solution.kt)| Medium | Array, Hash_Table, Sorting, Greedy, Heap_Priority_Queue, Counting | 622 | 75.00
| 1053 |[Previous Permutation With One Swap](src.save/main/kotlin/g1001_1100/s1053_previous_permutation_with_one_swap/Solution.kt)| Medium | Array, Greedy | 338 | 25.00
| 1052 |[Grumpy Bookstore Owner](src.save/main/kotlin/g1001_1100/s1052_grumpy_bookstore_owner/Solution.kt)| Medium | Array, Sliding_Window | 268 | 80.00
| 1051 |[Height Checker](src.save/main/kotlin/g1001_1100/s1051_height_checker/Solution.kt)| Easy | Array, Sorting, Counting_Sort | 140 | 94.37
| 1050 |[Actors and Directors Who Cooperated At Least Three Times](src.save/main/kotlin/g1001_1100/s1050_actors_and_directors_who_cooperated_at_least_three_times/script.sql)| Easy | LeetCode_Curated_SQL_70, Database, SQL_I_Day_10_Where | 629 | 81.02
| 1049 |[Last Stone Weight II](src.save/main/kotlin/g1001_1100/s1049_last_stone_weight_ii/Solution.kt)| Medium | Array, Dynamic_Programming | 150 | 100.00
| 1048 |[Longest String Chain](src.save/main/kotlin/g1001_1100/s1048_longest_string_chain/Solution.kt)| Medium | Array, String, Hash_Table, Dynamic_Programming, Two_Pointers | 273 | 75.00
| 1047 |[Remove All Adjacent Duplicates In String](src.save/main/kotlin/g1001_1100/s1047_remove_all_adjacent_duplicates_in_string/Solution.kt)| Easy | String, Stack | 228 | 94.52
| 1046 |[Last Stone Weight](src.save/main/kotlin/g1001_1100/s1046_last_stone_weight/Solution.kt)| Easy | Array, Heap_Priority_Queue, Level_1_Day_15_Heap | 123 | 100.00
| 1045 |[Customers Who Bought All Products](src.save/main/kotlin/g1001_1100/s1045_customers_who_bought_all_products/script.sql)| Medium | Database | 881 | 90.47
| 1044 |[Longest Duplicate Substring](src.save/main/kotlin/g1001_1100/s1044_longest_duplicate_substring/Solution.kt)| Hard | String, Binary_Search, Sliding_Window, Hash_Function, Rolling_Hash, Suffix_Array | 592 | 100.00
| 1043 |[Partition Array for Maximum Sum](src.save/main/kotlin/g1001_1100/s1043_partition_array_for_maximum_sum/Solution.kt)| Medium | Array, Dynamic_Programming | 194 | 71.43
| 1042 |[Flower Planting With No Adjacent](src.save/main/kotlin/g1001_1100/s1042_flower_planting_with_no_adjacent/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph | 396 | 85.71
| 1041 |[Robot Bounded In Circle](src.save/main/kotlin/g1001_1100/s1041_robot_bounded_in_circle/Solution.kt)| Medium | String, Math, Simulation | 121 | 100.00
| 1040 |[Moving Stones Until Consecutive II](src.save/main/kotlin/g1001_1100/s1040_moving_stones_until_consecutive_ii/Solution.kt)| Medium | Array, Math, Sorting, Two_Pointers | 287 | 50.00
| 1039 |[Minimum Score Triangulation of Polygon](src.save/main/kotlin/g1001_1100/s1039_minimum_score_triangulation_of_polygon/Solution.kt)| Medium | Array, Dynamic_Programming | 147 | 100.00
| 1038 |[Binary Search Tree to Greater Sum Tree](src.save/main/kotlin/g1001_1100/s1038_binary_search_tree_to_greater_sum_tree/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 123 | 91.67
| 1037 |[Valid Boomerang](src.save/main/kotlin/g1001_1100/s1037_valid_boomerang/Solution.kt)| Easy | Array, Math, Geometry | 126 | 100.00
| 1036 |[Escape a Large Maze](src.save/main/kotlin/g1001_1100/s1036_escape_a_large_maze/Solution.kt)| Hard | Array, Hash_Table, Depth_First_Search, Breadth_First_Search | 387 | 100.00
| 1035 |[Uncrossed Lines](src.save/main/kotlin/g1001_1100/s1035_uncrossed_lines/Solution.kt)| Medium | Array, Dynamic_Programming | 162 | 93.33
| 1034 |[Coloring A Border](src.save/main/kotlin/g1001_1100/s1034_coloring_a_border/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix | 332 | 100.00
| 1033 |[Moving Stones Until Consecutive](src.save/main/kotlin/g1001_1100/s1033_moving_stones_until_consecutive/Solution.kt)| Medium | Math, Brainteaser | 139 | 100.00
| 1032 |[Stream of Characters](src.save/main/kotlin/g1001_1100/s1032_stream_of_characters/StreamChecker.kt)| Hard | Array, String, Design, Trie, Data_Stream | 733 | 100.00
| 1031 |[Maximum Sum of Two Non-Overlapping Subarrays](src.save/main/kotlin/g1001_1100/s1031_maximum_sum_of_two_non_overlapping_subarrays/Solution.kt)| Medium | Array, Dynamic_Programming, Sliding_Window | 172 | 100.00
| 1030 |[Matrix Cells in Distance Order](src.save/main/kotlin/g1001_1100/s1030_matrix_cells_in_distance_order/Solution.kt)| Easy | Array, Math, Sorting, Matrix, Geometry | 426 | 100.00
| 1029 |[Two City Scheduling](src.save/main/kotlin/g1001_1100/s1029_two_city_scheduling/Solution.kt)| Medium | Array, Sorting, Greedy | 148 | 100.00
| 1028 |[Recover a Tree From Preorder Traversal](src.save/main/kotlin/g1001_1100/s1028_recover_a_tree_from_preorder_traversal/Solution.kt)| Hard | String, Depth_First_Search, Tree, Binary_Tree | 246 | 100.00
| 1027 |[Longest Arithmetic Subsequence](src.save/main/kotlin/g1001_1100/s1027_longest_arithmetic_subsequence/Solution.kt)| Medium | Array, Hash_Table, Dynamic_Programming, Binary_Search | 330 | 100.00
| 1026 |[Maximum Difference Between Node and Ancestor](src.save/main/kotlin/g1001_1100/s1026_maximum_difference_between_node_and_ancestor/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree | 155 | 77.78
| 1025 |[Divisor Game](src.save/main/kotlin/g1001_1100/s1025_divisor_game/Solution.kt)| Easy | Dynamic_Programming, Math, Game_Theory, Brainteaser | 114 | 93.33
| 1024 |[Video Stitching](src.save/main/kotlin/g1001_1100/s1024_video_stitching/Solution.kt)| Medium | Array, Dynamic_Programming, Greedy | 141 | 100.00
| 1023 |[Camelcase Matching](src.save/main/kotlin/g1001_1100/s1023_camelcase_matching/Solution.kt)| Medium | String, Two_Pointers, Trie, String_Matching | 149 | 60.00
| 1022 |[Sum of Root To Leaf Binary Numbers](src.save/main/kotlin/g1001_1100/s1022_sum_of_root_to_leaf_binary_numbers/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree | 158 | 88.89
| 1021 |[Remove Outermost Parentheses](src.save/main/kotlin/g1001_1100/s1021_remove_outermost_parentheses/Solution.kt)| Easy | String, Stack | 156 | 60.00
| 1020 |[Number of Enclaves](src.save/main/kotlin/g1001_1100/s1020_number_of_enclaves/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find, Graph_Theory_I_Day_3_Matrix_Related_Problems | 369 | 76.26
| 1019 |[Next Greater Node In Linked List](src.save/main/kotlin/g1001_1100/s1019_next_greater_node_in_linked_list/Solution.kt)| Medium | Array, Stack, Linked_List, Monotonic_Stack | 472 | 75.00
| 1018 |[Binary Prefix Divisible By 5](src.save/main/kotlin/g1001_1100/s1018_binary_prefix_divisible_by_5/Solution.kt)| Easy | Array | 297 | 100.00
| 1017 |[Convert to Base -2](src.save/main/kotlin/g1001_1100/s1017_convert_to_base_2/Solution.kt)| Medium | Math | 138 | 100.00
| 1016 |[Binary String With Substrings Representing 1 To N](src.save/main/kotlin/g1001_1100/s1016_binary_string_with_substrings_representing_1_to_n/Solution.kt)| Medium | String | 134 | 75.00
| 1015 |[Smallest Integer Divisible by K](src.save/main/kotlin/g1001_1100/s1015_smallest_integer_divisible_by_k/Solution.kt)| Medium | Hash_Table, Math | 123 | 100.00
| 1014 |[Best Sightseeing Pair](src.save/main/kotlin/g1001_1100/s1014_best_sightseeing_pair/Solution.kt)| Medium | Array, Dynamic_Programming, Dynamic_Programming_I_Day_7 | 336 | 66.67
| 1013 |[Partition Array Into Three Parts With Equal Sum](src.save/main/kotlin/g1001_1100/s1013_partition_array_into_three_parts_with_equal_sum/Solution.kt)| Easy | Array, Greedy | 328 | 100.00
| 1012 |[Numbers With Repeated Digits](src.save/main/kotlin/g1001_1100/s1012_numbers_with_repeated_digits/Solution.kt)| Hard | Dynamic_Programming, Math | 123 | 100.00
| 1011 |[Capacity To Ship Packages Within D Days](src.save/main/kotlin/g1001_1100/s1011_capacity_to_ship_packages_within_d_days/Solution.kt)| Medium | Array, Binary_Search | 325 | 66.67
| 1010 |[Pairs of Songs With Total Durations Divisible by 60](src.save/main/kotlin/g1001_1100/s1010_pairs_of_songs_with_total_durations_divisible_by_60/Solution.kt)| Medium | Array, Hash_Table, Counting | 287 | 77.78
| 1009 |[Complement of Base 10 Integer](src.save/main/kotlin/g1001_1100/s1009_complement_of_base_10_integer/Solution.kt)| Easy | Bit_Manipulation, Udemy_Bit_Manipulation | 126 | 72.73
| 1008 |[Construct Binary Search Tree from Preorder Traversal](src.save/main/kotlin/g1001_1100/s1008_construct_binary_search_tree_from_preorder_traversal/Solution.kt)| Medium | Array, Tree, Binary_Tree, Stack, Monotonic_Stack, Binary_Search_Tree, Udemy_Tree_Stack_Queue | 145 | 100.00
| 1007 |[Minimum Domino Rotations For Equal Row](src.save/main/kotlin/g1001_1100/s1007_minimum_domino_rotations_for_equal_row/Solution.kt)| Medium | Array, Greedy, Udemy_Arrays | 421 | 50.00
| 1006 |[Clumsy Factorial](src.save/main/kotlin/g1001_1100/s1006_clumsy_factorial/Solution.kt)| Medium | Math, Stack, Simulation | 127 | 100.00
| 1005 |[Maximize Sum Of Array After K Negations](src.save/main/kotlin/g1001_1100/s1005_maximize_sum_of_array_after_k_negations/Solution.kt)| Easy | Array, Sorting, Greedy | 167 | 100.00
| 1004 |[Max Consecutive Ones III](src.save/main/kotlin/g1001_1100/s1004_max_consecutive_ones_iii/Solution.kt)| Medium | Array, Binary_Search, Prefix_Sum, Sliding_Window | 318 | 30.95
| 1003 |[Check If Word Is Valid After Substitutions](src.save/main/kotlin/g1001_1100/s1003_check_if_word_is_valid_after_substitutions/Solution.kt)| Medium | String, Stack | 216 | 100.00
| 1002 |[Find Common Characters](src.save/main/kotlin/g1001_1100/s1002_find_common_characters/Solution.kt)| Easy | Array, String, Hash_Table | 181 | 100.00
| 1001 |[Grid Illumination](src.save/main/kotlin/g1001_1100/s1001_grid_illumination/Solution.kt)| Hard | Array, Hash_Table | 801 | 100.00
| 1000 |[Minimum Cost to Merge Stones](src.save/main/kotlin/g0901_1000/s1000_minimum_cost_to_merge_stones/Solution.kt)| Hard | Array, Dynamic_Programming | 152 | 75.00
| 0999 |[Available Captures for Rook](src.save/main/kotlin/g0901_1000/s0999_available_captures_for_rook/Solution.kt)| Easy | Array, Matrix, Simulation | 143 | 80.00
| 0998 |[Maximum Binary Tree II](src.save/main/kotlin/g0901_1000/s0998_maximum_binary_tree_ii/Solution.kt)| Medium | Tree, Binary_Tree | 157 | 100.00
| 0997 |[Find the Town Judge](src.save/main/kotlin/g0901_1000/s0997_find_the_town_judge/Solution.kt)| Easy | Array, Hash_Table, Graph, Data_Structure_II_Day_19_Graph, Graph_Theory_I_Day_13_Graph_Theory | 475 | 58.62
| 0996 |[Number of Squareful Arrays](src.save/main/kotlin/g0901_1000/s0996_number_of_squareful_arrays/Solution.kt)| Hard | Array, Dynamic_Programming, Math, Bit_Manipulation, Backtracking, Bitmask | 139 | 100.00
| 0995 |[Minimum Number of K Consecutive Bit Flips](src.save/main/kotlin/g0901_1000/s0995_minimum_number_of_k_consecutive_bit_flips/Solution.kt)| Hard | Array, Bit_Manipulation, Prefix_Sum, Sliding_Window | 480 | 100.00
| 0994 |[Rotting Oranges](src.save/main/kotlin/g0901_1000/s0994_rotting_oranges/Solution.kt)| Medium | Array, Breadth_First_Search, Matrix, Algorithm_I_Day_9_Breadth_First_Search_Depth_First_Search, Level_2_Day_10_Graph/BFS/DFS | 164 | 82.95
| 0993 |[Cousins in Binary Tree](src.save/main/kotlin/g0901_1000/s0993_cousins_in_binary_tree/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 152 | 71.43
| 0992 |[Subarrays with K Different Integers](src.save/main/kotlin/g0901_1000/s0992_subarrays_with_k_different_integers/Solution.kt)| Hard | Array, Hash_Table, Counting, Sliding_Window | 341 | 87.50
| 0991 |[Broken Calculator](src.save/main/kotlin/g0901_1000/s0991_broken_calculator/Solution.kt)| Medium | Math, Greedy | 127 | 100.00
| 0990 |[Satisfiability of Equality Equations](src.save/main/kotlin/g0901_1000/s0990_satisfiability_of_equality_equations/Solution.kt)| Medium | Array, String, Graph, Union_Find | 163 | 100.00
| 0989 |[Add to Array-Form of Integer](src.save/main/kotlin/g0901_1000/s0989_add_to_array_form_of_integer/Solution.kt)| Easy | Array, Math, Programming_Skills_II_Day_5 | 350 | 70.00
| 0988 |[Smallest String Starting From Leaf](src.save/main/kotlin/g0901_1000/s0988_smallest_string_starting_from_leaf/Solution.kt)| Medium | String, Depth_First_Search, Tree, Binary_Tree | 180 | 100.00
| 0987 |[Vertical Order Traversal of a Binary Tree](src.save/main/kotlin/g0901_1000/s0987_vertical_order_traversal_of_a_binary_tree/Solution.kt)| Hard | Hash_Table, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 189 | 66.67
| 0986 |[Interval List Intersections](src.save/main/kotlin/g0901_1000/s0986_interval_list_intersections/Solution.kt)| Medium | Array, Two_Pointers, Algorithm_II_Day_4_Two_Pointers | 318 | 60.98
| 0985 |[Sum of Even Numbers After Queries](src.save/main/kotlin/g0901_1000/s0985_sum_of_even_numbers_after_queries/Solution.kt)| Medium | Array, Simulation | 497 | 71.43
| 0984 |[String Without AAA or BBB](src.save/main/kotlin/g0901_1000/s0984_string_without_aaa_or_bbb/Solution.kt)| Medium | String, Greedy | 132 | 66.67
| 0983 |[Minimum Cost For Tickets](src.save/main/kotlin/g0901_1000/s0983_minimum_cost_for_tickets/Solution.kt)| Medium | Array, Dynamic_Programming | 147 | 92.80
| 0982 |[Triples with Bitwise AND Equal To Zero](src.save/main/kotlin/g0901_1000/s0982_triples_with_bitwise_and_equal_to_zero/Solution.kt)| Hard | Array, Hash_Table, Bit_Manipulation | 227 | 100.00
| 0981 |[Time Based Key-Value Store](src.save/main/kotlin/g0901_1000/s0981_time_based_key_value_store/TimeMap.kt)| Medium | String, Hash_Table, Binary_Search, Design, Binary_Search_II_Day_16 | 1555 | 10.00
| 0980 |[Unique Paths III](src.save/main/kotlin/g0901_1000/s0980_unique_paths_iii/Solution.kt)| Hard | Array, Matrix, Bit_Manipulation, Backtracking | 134 | 100.00
| 0979 |[Distribute Coins in Binary Tree](src.save/main/kotlin/g0901_1000/s0979_distribute_coins_in_binary_tree/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree | 165 | 80.00
| 0978 |[Longest Turbulent Subarray](src.save/main/kotlin/g0901_1000/s0978_longest_turbulent_subarray/Solution.kt)| Medium | Array, Dynamic_Programming, Sliding_Window | 395 | 40.00
| 0977 |[Squares of a Sorted Array](src.save/main/kotlin/g0901_1000/s0977_squares_of_a_sorted_array/Solution.kt)| Easy | Array, Sorting, Two_Pointers, Algorithm_I_Day_2_Two_Pointers, Udemy_Two_Pointers | 375 | 18.43
| 0976 |[Largest Perimeter Triangle](src.save/main/kotlin/g0901_1000/s0976_largest_perimeter_triangle/Solution.kt)| Easy | Array, Math, Sorting, Greedy, Programming_Skills_I_Day_3_Conditional_Statements | 304 | 33.33
| 0975 |[Odd Even Jump](src.save/main/kotlin/g0901_1000/s0975_odd_even_jump/Solution.kt)| Hard | Array, Dynamic_Programming, Stack, Ordered_Set, Monotonic_Stack | 326 | 100.00
| 0974 |[Subarray Sums Divisible by K](src.save/main/kotlin/g0901_1000/s0974_subarray_sums_divisible_by_k/Solution.kt)| Medium | Array, Hash_Table, Prefix_Sum | 334 | 66.67
| 0973 |[K Closest Points to Origin](src.save/main/kotlin/g0901_1000/s0973_k_closest_points_to_origin/Solution.kt)| Medium | Array, Math, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Geometry, Quickselect, Data_Structure_II_Day_21_Heap_Priority_Queue, Programming_Skills_II_Day_8 | 800 | 37.89
| 0972 |[Equal Rational Numbers](src.save/main/kotlin/g0901_1000/s0972_equal_rational_numbers/Solution.kt)| Hard | String, Math | 130 | 100.00
| 0971 |[Flip Binary Tree To Match Preorder Traversal](src.save/main/kotlin/g0901_1000/s0971_flip_binary_tree_to_match_preorder_traversal/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree | 173 | 66.67
| 0970 |[Powerful Integers](src.save/main/kotlin/g0901_1000/s0970_powerful_integers/Solution.kt)| Medium | Hash_Table, Math | 136 | 100.00
| 0969 |[Pancake Sorting](src.save/main/kotlin/g0901_1000/s0969_pancake_sorting/Solution.kt)| Medium | Array, Sorting, Greedy, Two_Pointers | 169 | 100.00
| 0968 |[Binary Tree Cameras](src.save/main/kotlin/g0901_1000/s0968_binary_tree_cameras/Solution.kt)| Hard | Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree, Udemy_Tree_Stack_Queue | 176 | 100.00
| 0967 |[Numbers With Same Consecutive Differences](src.save/main/kotlin/g0901_1000/s0967_numbers_with_same_consecutive_differences/Solution.kt)| Medium | Breadth_First_Search, Backtracking | 144 | 100.00
| 0966 |[Vowel Spellchecker](src.save/main/kotlin/g0901_1000/s0966_vowel_spellchecker/Solution.kt)| Medium | Array, String, Hash_Table | 371 | 100.00
| 0965 |[Univalued Binary Tree](src.save/main/kotlin/g0901_1000/s0965_univalued_binary_tree/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 138 | 90.91
| 0964 |[Least Operators to Express Number](src.save/main/kotlin/g0901_1000/s0964_least_operators_to_express_number/Solution.kt)| Hard | Dynamic_Programming, Math | 160 | 100.00
| 0963 |[Minimum Area Rectangle II](src.save/main/kotlin/g0901_1000/s0963_minimum_area_rectangle_ii/Solution.kt)| Medium | Array, Math, Geometry | 183 | 100.00
| 0962 |[Maximum Width Ramp](src.save/main/kotlin/g0901_1000/s0962_maximum_width_ramp/Solution.kt)| Medium | Array, Stack, Monotonic_Stack | 324 | 100.00
| 0961 |[N-Repeated Element in Size 2N Array](src.save/main/kotlin/g0901_1000/s0961_n_repeated_element_in_size_2n_array/Solution.kt)| Easy | Array, Hash_Table | 264 | 75.00
| 0960 |[Delete Columns to Make Sorted III](src.save/main/kotlin/g0901_1000/s0960_delete_columns_to_make_sorted_iii/Solution.kt)| Hard | Array, String, Dynamic_Programming | 200 | 100.00
| 0959 |[Regions Cut By Slashes](src.save/main/kotlin/g0901_1000/s0959_regions_cut_by_slashes/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 180 | 100.00
| 0958 |[Check Completeness of a Binary Tree](src.save/main/kotlin/g0901_1000/s0958_check_completeness_of_a_binary_tree/Solution.kt)| Medium | Breadth_First_Search, Tree, Binary_Tree | 142 | 96.04
| 0957 |[Prison Cells After N Days](src.save/main/kotlin/g0901_1000/s0957_prison_cells_after_n_days/Solution.kt)| Medium | Array, Hash_Table, Math, Bit_Manipulation | 172 | 100.00
| 0956 |[Tallest Billboard](src.save/main/kotlin/g0901_1000/s0956_tallest_billboard/Solution.kt)| Hard | Array, Dynamic_Programming | 182 | 100.00
| 0955 |[Delete Columns to Make Sorted II](src.save/main/kotlin/g0901_1000/s0955_delete_columns_to_make_sorted_ii/Solution.kt)| Medium | Array, String, Greedy | 190 | 100.00
| 0954 |[Array of Doubled Pairs](src.save/main/kotlin/g0901_1000/s0954_array_of_doubled_pairs/Solution.kt)| Medium | Array, Hash_Table, Sorting, Greedy | 462 | 100.00
| 0953 |[Verifying an Alien Dictionary](src.save/main/kotlin/g0901_1000/s0953_verifying_an_alien_dictionary/Solution.kt)| Easy | Array, String, Hash_Table, Programming_Skills_I_Day_9_String | 137 | 100.00
| 0952 |[Largest Component Size by Common Factor](src.save/main/kotlin/g0901_1000/s0952_largest_component_size_by_common_factor/Solution.kt)| Hard | Array, Math, Union_Find | 538 | 100.00
| 0951 |[Flip Equivalent Binary Trees](src.save/main/kotlin/g0901_1000/s0951_flip_equivalent_binary_trees/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree | 150 | 100.00
| 0950 |[Reveal Cards In Increasing Order](src.save/main/kotlin/g0901_1000/s0950_reveal_cards_in_increasing_order/Solution.kt)| Medium | Array, Sorting, Simulation, Queue | 176 | 100.00
| 0949 |[Largest Time for Given Digits](src.save/main/kotlin/g0901_1000/s0949_largest_time_for_given_digits/Solution.kt)| Medium | String, Enumeration | 171 | 100.00
| 0948 |[Bag of Tokens](src.save/main/kotlin/g0901_1000/s0948_bag_of_tokens/Solution.kt)| Medium | Array, Sorting, Greedy, Two_Pointers | 161 | 100.00
| 0947 |[Most Stones Removed with Same Row or Column](src.save/main/kotlin/g0901_1000/s0947_most_stones_removed_with_same_row_or_column/Solution.kt)| Medium | Depth_First_Search, Graph, Union_Find, Level_2_Day_19_Union_Find | 200 | 100.00
| 0946 |[Validate Stack Sequences](src.save/main/kotlin/g0901_1000/s0946_validate_stack_sequences/Solution.kt)| Medium | Array, Stack, Simulation | 180 | 74.91
| 0945 |[Minimum Increment to Make Array Unique](src.save/main/kotlin/g0901_1000/s0945_minimum_increment_to_make_array_unique/Solution.kt)| Medium | Array, Sorting, Greedy, Counting | 427 | 100.00
| 0944 |[Delete Columns to Make Sorted](src.save/main/kotlin/g0901_1000/s0944_delete_columns_to_make_sorted/Solution.kt)| Easy | Array, String | 221 | 75.00
| 0943 |[Find the Shortest Superstring](src.save/main/kotlin/g0901_1000/s0943_find_the_shortest_superstring/Solution.kt)| Hard | Array, String, Dynamic_Programming, Bit_Manipulation, Bitmask | 1290 | 100.00
| 0942 |[DI String Match](src.save/main/kotlin/g0901_1000/s0942_di_string_match/Solution.kt)| Easy | Array, String, Math, Greedy, Two_Pointers | 202 | 80.00
| 0941 |[Valid Mountain Array](src.save/main/kotlin/g0901_1000/s0941_valid_mountain_array/Solution.kt)| Easy | Array | 251 | 51.94
| 0940 |[Distinct Subsequences II](src.save/main/kotlin/g0901_1000/s0940_distinct_subsequences_ii/Solution.kt)| Hard | String, Dynamic_Programming | 177 | 100.00
| 0939 |[Minimum Area Rectangle](src.save/main/kotlin/g0901_1000/s0939_minimum_area_rectangle/Solution.kt)| Medium | Array, Hash_Table, Math, Sorting, Geometry | 461 | 100.00
| 0938 |[Range Sum of BST](src.save/main/kotlin/g0901_1000/s0938_range_sum_of_bst/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree, Udemy_Tree_Stack_Queue | 356 | 55.36
| 0937 |[Reorder Data in Log Files](src.save/main/kotlin/g0901_1000/s0937_reorder_data_in_log_files/Solution.kt)| Easy | Array, String, Sorting | 205 | 81.82
| 0936 |[Stamping The Sequence](src.save/main/kotlin/g0901_1000/s0936_stamping_the_sequence/Solution.kt)| Hard | String, Greedy, Stack, Queue | 196 | 100.00
| 0935 |[Knight Dialer](src.save/main/kotlin/g0901_1000/s0935_knight_dialer/Solution.kt)| Medium | Dynamic_Programming | 160 | 100.00
| 0934 |[Shortest Bridge](src.save/main/kotlin/g0901_1000/s0934_shortest_bridge/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Graph_Theory_I_Day_6_Matrix_Related_Problems | 301 | 80.95
| 0933 |[Number of Recent Calls](src.save/main/kotlin/g0901_1000/s0933_number_of_recent_calls/RecentCounter.kt)| Easy | Design, Queue, Data_Stream | 476 | 82.50
| 0932 |[Beautiful Array](src.save/main/kotlin/g0901_1000/s0932_beautiful_array/Solution.kt)| Medium | Array, Math, Divide_and_Conquer | 145 | 100.00
| 0931 |[Minimum Falling Path Sum](src.save/main/kotlin/g0901_1000/s0931_minimum_falling_path_sum/Solution.kt)| Medium | Array, Dynamic_Programming, Matrix, Dynamic_Programming_I_Day_13 | 201 | 84.21
| 0930 |[Binary Subarrays With Sum](src.save/main/kotlin/g0901_1000/s0930_binary_subarrays_with_sum/Solution.kt)| Medium | Array, Hash_Table, Prefix_Sum, Sliding_Window | 250 | 93.75
| 0929 |[Unique Email Addresses](src.save/main/kotlin/g0901_1000/s0929_unique_email_addresses/Solution.kt)| Easy | Array, String, Hash_Table | 207 | 89.29
| 0928 |[Minimize Malware Spread II](src.save/main/kotlin/g0901_1000/s0928_minimize_malware_spread_ii/Solution.kt)| Hard | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 716 | 100.00
| 0927 |[Three Equal Parts](src.save/main/kotlin/g0901_1000/s0927_three_equal_parts/Solution.kt)| Hard | Array, Math | 303 | 100.00
| 0926 |[Flip String to Monotone Increasing](src.save/main/kotlin/g0901_1000/s0926_flip_string_to_monotone_increasing/Solution.kt)| Medium | String, Dynamic_Programming | 199 | 100.00
| 0925 |[Long Pressed Name](src.save/main/kotlin/g0901_1000/s0925_long_pressed_name/Solution.kt)| Easy | String, Two_Pointers | 126 | 92.31
| 0924 |[Minimize Malware Spread](src.save/main/kotlin/g0901_1000/s0924_minimize_malware_spread/Solution.kt)| Hard | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 791 | 100.00
| 0923 |[3Sum With Multiplicity](src.save/main/kotlin/g0901_1000/s0923_3sum_with_multiplicity/Solution.kt)| Medium | Array, Hash_Table, Sorting, Two_Pointers, Counting | 190 | 100.00
| 0922 |[Sort Array By Parity II](src.save/main/kotlin/g0901_1000/s0922_sort_array_by_parity_ii/Solution.kt)| Easy | Array, Sorting, Two_Pointers | 257 | 87.50
| 0921 |[Minimum Add to Make Parentheses Valid](src.save/main/kotlin/g0901_1000/s0921_minimum_add_to_make_parentheses_valid/Solution.kt)| Medium | String, Greedy, Stack | 131 | 92.59
| 0920 |[Number of Music Playlists](src.save/main/kotlin/g0901_1000/s0920_number_of_music_playlists/Solution.kt)| Hard | Dynamic_Programming, Math, Combinatorics | 136 | 100.00
| 0919 |[Complete Binary Tree Inserter](src.save/main/kotlin/g0901_1000/s0919_complete_binary_tree_inserter/CBTInserter.kt)| Medium | Breadth_First_Search, Tree, Binary_Tree, Design | 225 | 100.00
| 0918 |[Maximum Sum Circular Subarray](src.save/main/kotlin/g0901_1000/s0918_maximum_sum_circular_subarray/Solution.kt)| Medium | Array, Dynamic_Programming, Divide_and_Conquer, Queue, Monotonic_Queue, Dynamic_Programming_I_Day_5 | 339 | 86.96
| 0917 |[Reverse Only Letters](src.save/main/kotlin/g0901_1000/s0917_reverse_only_letters/Solution.kt)| Easy | String, Two_Pointers | 126 | 100.00
| 0916 |[Word Subsets](src.save/main/kotlin/g0901_1000/s0916_word_subsets/Solution.kt)| Medium | Array, String, Hash_Table | 397 | 88.89
| 0915 |[Partition Array into Disjoint Intervals](src.save/main/kotlin/g0901_1000/s0915_partition_array_into_disjoint_intervals/Solution.kt)| Medium | Array | 510 | 76.92
| 0914 |[X of a Kind in a Deck of Cards](src.save/main/kotlin/g0901_1000/s0914_x_of_a_kind_in_a_deck_of_cards/Solution.kt)| Easy | Array, Hash_Table, Math, Counting, Number_Theory | 238 | 70.00
| 0913 |[Cat and Mouse](src.save/main/kotlin/g0901_1000/s0913_cat_and_mouse/Solution.kt)| Hard | Dynamic_Programming, Math, Graph, Memoization, Topological_Sort, Game_Theory | 211 | 100.00
| 0912 |[Sort an Array](src.save/main/kotlin/g0901_1000/s0912_sort_an_array/Solution.kt)| Medium | Array, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Merge_Sort, Bucket_Sort, Counting_Sort, Radix_Sort, Udemy_Sorting_Algorithms | 606 | 98.48
| 0911 |[Online Election](src.save/main/kotlin/g0901_1000/s0911_online_election/TopVotedCandidate.kt)| Medium | Array, Hash_Table, Binary_Search, Design, Binary_Search_II_Day_20 | 766 | 83.33
| 0910 |[Smallest Range II](src.save/main/kotlin/g0901_1000/s0910_smallest_range_ii/Solution.kt)| Medium | Array, Math, Sorting, Greedy, Programming_Skills_II_Day_13 | 234 | 100.00
| 0909 |[Snakes and Ladders](src.save/main/kotlin/g0901_1000/s0909_snakes_and_ladders/Solution.kt)| Medium | Array, Breadth_First_Search, Matrix | 203 | 100.00
| 0908 |[Smallest Range I](src.save/main/kotlin/g0901_1000/s0908_smallest_range_i/Solution.kt)| Easy | Array, Math | 202 | 87.50
| 0907 |[Sum of Subarray Minimums](src.save/main/kotlin/g0901_1000/s0907_sum_of_subarray_minimums/Solution.kt)| Medium | Array, Dynamic_Programming, Stack, Monotonic_Stack | 341 | 100.00
| 0906 |[Super Palindromes](src.save/main/kotlin/g0901_1000/s0906_super_palindromes/Solution.kt)| Hard | Math, Enumeration | 153 | 100.00
| 0905 |[Sort Array By Parity](src.save/main/kotlin/g0901_1000/s0905_sort_array_by_parity/Solution.kt)| Easy | Array, Sorting, Two_Pointers | 219 | 75.00
| 0904 |[Fruit Into Baskets](src.save/main/kotlin/g0901_1000/s0904_fruit_into_baskets/Solution.kt)| Medium | Array, Hash_Table, Sliding_Window | 371 | 100.00
| 0903 |[Valid Permutations for DI Sequence](src.save/main/kotlin/g0901_1000/s0903_valid_permutations_for_di_sequence/Solution.kt)| Hard | Dynamic_Programming | 140 | 100.00
| 0902 |[Numbers At Most N Given Digit Set](src.save/main/kotlin/g0901_1000/s0902_numbers_at_most_n_given_digit_set/Solution.kt)| Hard | Array, Dynamic_Programming, Math, Binary_Search | 138 | 100.00
| 0901 |[Online Stock Span](src.save/main/kotlin/g0901_1000/s0901_online_stock_span/StockSpanner.kt)| Medium | Stack, Design, Monotonic_Stack, Data_Stream | 641 | 75.00
| 0900 |[RLE Iterator](src.save/main/kotlin/g0801_0900/s0900_rle_iterator/RLEIterator.kt)| Medium | Array, Design, Counting, Iterator | 175 | 83.33
| 0899 |[Orderly Queue](src.save/main/kotlin/g0801_0900/s0899_orderly_queue/Solution.kt)| Hard | String, Math, Sorting | 148 | 100.00
| 0898 |[Bitwise ORs of Subarrays](src.save/main/kotlin/g0801_0900/s0898_bitwise_ors_of_subarrays/Solution.kt)| Medium | Array, Dynamic_Programming, Bit_Manipulation | 812 | 100.00
| 0897 |[Increasing Order Search Tree](src.save/main/kotlin/g0801_0900/s0897_increasing_order_search_tree/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Stack, Binary_Search_Tree | 128 | 85.71
| 0896 |[Monotonic Array](src.save/main/kotlin/g0801_0900/s0896_monotonic_array/Solution.kt)| Easy | Array, Programming_Skills_II_Day_1 | 576 | 90.91
| 0895 |[Maximum Frequency Stack](src.save/main/kotlin/g0801_0900/s0895_maximum_frequency_stack/FreqStack.kt)| Hard | Hash_Table, Stack, Design, Ordered_Set | 617 | 100.00
| 0894 |[All Possible Full Binary Trees](src.save/main/kotlin/g0801_0900/s0894_all_possible_full_binary_trees/Solution.kt)| Medium | Dynamic_Programming, Tree, Binary_Tree, Recursion, Memoization | 257 | 100.00
| 0893 |[Groups of Special-Equivalent Strings](src.save/main/kotlin/g0801_0900/s0893_groups_of_special_equivalent_strings/Solution.kt)| Medium | Array, String, Hash_Table | 141 | 100.00
| 0892 |[Surface Area of 3D Shapes](src.save/main/kotlin/g0801_0900/s0892_surface_area_of_3d_shapes/Solution.kt)| Easy | Array, Math, Matrix, Geometry | 180 | 100.00
| 0891 |[Sum of Subsequence Widths](src.save/main/kotlin/g0801_0900/s0891_sum_of_subsequence_widths/Solution.kt)| Hard | Array, Math, Sorting | 481 | 100.00
| 0890 |[Find and Replace Pattern](src.save/main/kotlin/g0801_0900/s0890_find_and_replace_pattern/Solution.kt)| Medium | Array, String, Hash_Table | 150 | 100.00
| 0889 |[Construct Binary Tree from Preorder and Postorder Traversal](src.save/main/kotlin/g0801_0900/s0889_construct_binary_tree_from_preorder_and_postorder_traversal/Solution.kt)| Medium | Array, Hash_Table, Tree, Binary_Tree, Divide_and_Conquer | 168 | 100.00
| 0888 |[Fair Candy Swap](src.save/main/kotlin/g0801_0900/s0888_fair_candy_swap/Solution.kt)| Easy | Array, Hash_Table, Sorting, Binary_Search | 318 | 100.00
| 0887 |[Super Egg Drop](src.save/main/kotlin/g0801_0900/s0887_super_egg_drop/Solution.kt)| Hard | Dynamic_Programming, Math, Binary_Search | 119 | 100.00
| 0886 |[Possible Bipartition](src.save/main/kotlin/g0801_0900/s0886_possible_bipartition/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find, Graph_Theory_I_Day_14_Graph_Theory | 397 | 100.00
| 0885 |[Spiral Matrix III](src.save/main/kotlin/g0801_0900/s0885_spiral_matrix_iii/Solution.kt)| Medium | Array, Matrix, Simulation | 265 | 100.00
| 0884 |[Uncommon Words from Two Sentences](src.save/main/kotlin/g0801_0900/s0884_uncommon_words_from_two_sentences/Solution.kt)| Easy | String, Hash_Table | 171 | 100.00
| 0883 |[Projection Area of 3D Shapes](src.save/main/kotlin/g0801_0900/s0883_projection_area_of_3d_shapes/Solution.kt)| Easy | Array, Math, Matrix, Geometry | 173 | 100.00
| 0882 |[Reachable Nodes In Subdivided Graph](src.save/main/kotlin/g0801_0900/s0882_reachable_nodes_in_subdivided_graph/Solution.kt)| Hard | Heap_Priority_Queue, Graph, Shortest_Path | 434 | 100.00
| 0881 |[Boats to Save People](src.save/main/kotlin/g0801_0900/s0881_boats_to_save_people/Solution.kt)| Medium | Array, Sorting, Greedy, Two_Pointers | 370 | 96.07
| 0880 |[Decoded String at Index](src.save/main/kotlin/g0801_0900/s0880_decoded_string_at_index/Solution.kt)| Medium | String, Stack | 134 | 100.00
| 0879 |[Profitable Schemes](src.save/main/kotlin/g0801_0900/s0879_profitable_schemes/Solution.kt)| Hard | Array, Dynamic_Programming | 198 | 75.00
| 0878 |[Nth Magical Number](src.save/main/kotlin/g0801_0900/s0878_nth_magical_number/Solution.kt)| Hard | Math, Binary_Search | 124 | 100.00
| 0877 |[Stone Game](src.save/main/kotlin/g0801_0900/s0877_stone_game/Solution.kt)| Medium | Array, Dynamic_Programming, Math, Game_Theory | 136 | 88.24
| 0876 |[Middle of the Linked List](src.save/main/kotlin/g0801_0900/s0876_middle_of_the_linked_list/Solution.kt)| Easy | Two_Pointers, Linked_List, Algorithm_I_Day_5_Two_Pointers, Programming_Skills_I_Day_10_Linked_List_and_Tree, Level_1_Day_4_Linked_List, Udemy_Linked_List | 136 | 76.52
| 0875 |[Koko Eating Bananas](src.save/main/kotlin/g0801_0900/s0875_koko_eating_bananas/Solution.kt)| Medium | Array, Binary_Search, Binary_Search_II_Day_4 | 267 | 93.85
| 0874 |[Walking Robot Simulation](src.save/main/kotlin/g0801_0900/s0874_walking_robot_simulation/Solution.kt)| Medium | Array, Simulation | 274 | 100.00
| 0873 |[Length of Longest Fibonacci Subsequence](src.save/main/kotlin/g0801_0900/s0873_length_of_longest_fibonacci_subsequence/Solution.kt)| Medium | Array, Hash_Table, Dynamic_Programming | 341 | 90.00
| 0872 |[Leaf-Similar Trees](src.save/main/kotlin/g0801_0900/s0872_leaf_similar_trees/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree | 140 | 100.00
| 0871 |[Minimum Number of Refueling Stops](src.save/main/kotlin/g0801_0900/s0871_minimum_number_of_refueling_stops/Solution.kt)| Hard | Array, Dynamic_Programming, Greedy, Heap_Priority_Queue | 203 | 92.86
| 0870 |[Advantage Shuffle](src.save/main/kotlin/g0801_0900/s0870_advantage_shuffle/Solution.kt)| Medium | Array, Sorting, Greedy | 698 | 100.00
| 0869 |[Reordered Power of 2](src.save/main/kotlin/g0801_0900/s0869_reordered_power_of_2/Solution.kt)| Medium | Math, Sorting, Counting, Enumeration | 145 | 87.50
| 0868 |[Binary Gap](src.save/main/kotlin/g0801_0900/s0868_binary_gap/Solution.kt)| Easy | Bit_Manipulation | 142 | 100.00
| 0867 |[Transpose Matrix](src.save/main/kotlin/g0801_0900/s0867_transpose_matrix/Solution.kt)| Easy | Array, Matrix, Simulation | 201 | 100.00
| 0866 |[Prime Palindrome](src.save/main/kotlin/g0801_0900/s0866_prime_palindrome/Solution.kt)| Medium | Math | 143 | 100.00
| 0865 |[Smallest Subtree with all the Deepest Nodes](src.save/main/kotlin/g0801_0900/s0865_smallest_subtree_with_all_the_deepest_nodes/Solution.kt)| Medium | Hash_Table, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 147 | 100.00
| 0864 |[Shortest Path to Get All Keys](src.save/main/kotlin/g0801_0900/s0864_shortest_path_to_get_all_keys/Solution.kt)| Hard | Breadth_First_Search, Bit_Manipulation | 176 | 100.00
| 0863 |[All Nodes Distance K in Binary Tree](src.save/main/kotlin/g0801_0900/s0863_all_nodes_distance_k_in_binary_tree/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 147 | 95.83
| 0862 |[Shortest Subarray with Sum at Least K](src.save/main/kotlin/g0801_0900/s0862_shortest_subarray_with_sum_at_least_k/Solution.kt)| Hard | Array, Binary_Search, Heap_Priority_Queue, Prefix_Sum, Sliding_Window, Queue, Monotonic_Queue | 563 | 84.62
| 0861 |[Score After Flipping Matrix](src.save/main/kotlin/g0801_0900/s0861_score_after_flipping_matrix/Solution.kt)| Medium | Array, Greedy, Matrix, Bit_Manipulation | 135 | 71.43
| 0860 |[Lemonade Change](src.save/main/kotlin/g0801_0900/s0860_lemonade_change/Solution.kt)| Easy | Array, Greedy, Programming_Skills_II_Day_17 | 413 | 86.96
| 0859 |[Buddy Strings](src.save/main/kotlin/g0801_0900/s0859_buddy_strings/Solution.kt)| Easy | String, Hash_Table | 149 | 91.01
| 0858 |[Mirror Reflection](src.save/main/kotlin/g0801_0900/s0858_mirror_reflection/Solution.kt)| Medium | Math, Geometry | 120 | 100.00
| 0857 |[Minimum Cost to Hire K Workers](src.save/main/kotlin/g0801_0900/s0857_minimum_cost_to_hire_k_workers/Solution.kt)| Hard | Array, Sorting, Greedy, Heap_Priority_Queue | 302 | 100.00
| 0856 |[Score of Parentheses](src.save/main/kotlin/g0801_0900/s0856_score_of_parentheses/Solution.kt)| Medium | String, Stack | 129 | 84.62
| 0855 |[Exam Room](src.save/main/kotlin/g0801_0900/s0855_exam_room/ExamRoom.kt)| Medium | Design, Ordered_Set | 644 | 83.33
| 0854 |[K-Similar Strings](src.save/main/kotlin/g0801_0900/s0854_k_similar_strings/Solution.kt)| Hard | String, Breadth_First_Search | 136 | 100.00
| 0853 |[Car Fleet](src.save/main/kotlin/g0801_0900/s0853_car_fleet/Solution.kt)| Medium | Array, Sorting, Stack, Monotonic_Stack | 757 | 85.29
| 0852 |[Peak Index in a Mountain Array](src.save/main/kotlin/g0801_0900/s0852_peak_index_in_a_mountain_array/Solution.kt)| Easy | Array, Binary_Search, Binary_Search_I_Day_2 | 433 | 94.29
| 0851 |[Loud and Rich](src.save/main/kotlin/g0801_0900/s0851_loud_and_rich/Solution.kt)| Medium | Array, Depth_First_Search, Graph, Topological_Sort | 347 | 100.00
| 0850 |[Rectangle Area II](src.save/main/kotlin/g0801_0900/s0850_rectangle_area_ii/Solution.kt)| Hard | Array, Ordered_Set, Segment_Tree, Line_Sweep | 171 | 100.00
| 0849 |[Maximize Distance to Closest Person](src.save/main/kotlin/g0801_0900/s0849_maximize_distance_to_closest_person/Solution.kt)| Medium | Array | 196 | 88.46
| 0848 |[Shifting Letters](src.save/main/kotlin/g0801_0900/s0848_shifting_letters/Solution.kt)| Medium | Array, String | 537 | 93.75
| 0847 |[Shortest Path Visiting All Nodes](src.save/main/kotlin/g0801_0900/s0847_shortest_path_visiting_all_nodes/Solution.kt)| Hard | Dynamic_Programming, Breadth_First_Search, Bit_Manipulation, Graph, Bitmask, Graph_Theory_I_Day_10_Standard_Traversal | 164 | 100.00
| 0846 |[Hand of Straights](src.save/main/kotlin/g0801_0900/s0846_hand_of_straights/Solution.kt)| Medium | Array, Hash_Table, Sorting, Greedy | 306 | 96.15
| 0845 |[Longest Mountain in Array](src.save/main/kotlin/g0801_0900/s0845_longest_mountain_in_array/Solution.kt)| Medium | Array, Dynamic_Programming, Two_Pointers, Enumeration | 222 | 100.00
| 0844 |[Backspace String Compare](src.save/main/kotlin/g0801_0900/s0844_backspace_string_compare/Solution.kt)| Easy | String, Two_Pointers, Stack, Simulation, Algorithm_II_Day_4_Two_Pointers, Level_1_Day_14_Stack | 126 | 98.31
| 0843 |[Guess the Word](src.save/main/kotlin/g0801_0900/s0843_guess_the_word/Solution.kt)| Hard | Array, String, Math, Game_Theory, Interactive | 75 | 100.00
| 0842 |[Split Array into Fibonacci Sequence](src.save/main/kotlin/g0801_0900/s0842_split_array_into_fibonacci_sequence/Solution.kt)| Medium | String, Backtracking | 142 | 100.00
| 0841 |[Keys and Rooms](src.save/main/kotlin/g0801_0900/s0841_keys_and_rooms/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Data_Structure_II_Day_19_Graph, Graph_Theory_I_Day_7_Standard_Traversal | 189 | 69.23
| 0840 |[Magic Squares In Grid](src.save/main/kotlin/g0801_0900/s0840_magic_squares_in_grid/Solution.kt)| Medium | Array, Math, Matrix | 149 | 100.00
| 0839 |[Similar String Groups](src.save/main/kotlin/g0801_0900/s0839_similar_string_groups/Solution.kt)| Hard | Array, String, Depth_First_Search, Breadth_First_Search, Union_Find | 205 | 100.00
| 0838 |[Push Dominoes](src.save/main/kotlin/g0801_0900/s0838_push_dominoes/Solution.kt)| Medium | String, Dynamic_Programming, Two_Pointers | 270 | 100.00
| 0837 |[New 21 Game](src.save/main/kotlin/g0801_0900/s0837_new_21_game/Solution.kt)| Medium | Dynamic_Programming, Math, Sliding_Window, Probability_and_Statistics | 144 | 75.00
| 0836 |[Rectangle Overlap](src.save/main/kotlin/g0801_0900/s0836_rectangle_overlap/Solution.kt)| Easy | Math, Geometry | 121 | 100.00
| 0835 |[Image Overlap](src.save/main/kotlin/g0801_0900/s0835_image_overlap/Solution.kt)| Medium | Array, Matrix | 163 | 100.00
| 0834 |[Sum of Distances in Tree](src.save/main/kotlin/g0801_0900/s0834_sum_of_distances_in_tree/Solution.kt)| Hard | Dynamic_Programming, Depth_First_Search, Tree, Graph | 746 | 100.00
| 0833 |[Find And Replace in String](src.save/main/kotlin/g0801_0900/s0833_find_and_replace_in_string/Solution.kt)| Medium | Array, String, Sorting | 158 | 100.00
| 0832 |[Flipping an Image](src.save/main/kotlin/g0801_0900/s0832_flipping_an_image/Solution.kt)| Easy | Array, Matrix, Two_Pointers, Simulation | 190 | 94.44
| 0831 |[Masking Personal Information](src.save/main/kotlin/g0801_0900/s0831_masking_personal_information/Solution.kt)| Medium | String | 149 | 100.00
| 0830 |[Positions of Large Groups](src.save/main/kotlin/g0801_0900/s0830_positions_of_large_groups/Solution.kt)| Easy | String | 221 | 100.00
| 0829 |[Consecutive Numbers Sum](src.save/main/kotlin/g0801_0900/s0829_consecutive_numbers_sum/Solution.kt)| Hard | Math, Enumeration | 151 | 100.00
| 0828 |[Count Unique Characters of All Substrings of a Given String](src.save/main/kotlin/g0801_0900/s0828_count_unique_characters_of_all_substrings_of_a_given_string/Solution.kt)| Hard | String, Hash_Table, Dynamic_Programming | 216 | 100.00
| 0827 |[Making A Large Island](src.save/main/kotlin/g0801_0900/s0827_making_a_large_island/Solution.kt)| Hard | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 985 | 100.00
| 0826 |[Most Profit Assigning Work](src.save/main/kotlin/g0801_0900/s0826_most_profit_assigning_work/Solution.kt)| Medium | Array, Sorting, Greedy, Binary_Search, Two_Pointers, Binary_Search_II_Day_11 | 366 | 100.00
| 0825 |[Friends Of Appropriate Ages](src.save/main/kotlin/g0801_0900/s0825_friends_of_appropriate_ages/Solution.kt)| Medium | Array, Sorting, Binary_Search, Two_Pointers | 278 | 100.00
| 0824 |[Goat Latin](src.save/main/kotlin/g0801_0900/s0824_goat_latin/Solution.kt)| Easy | String | 146 | 100.00
| 0823 |[Binary Trees With Factors](src.save/main/kotlin/g0801_0900/s0823_binary_trees_with_factors/Solution.kt)| Medium | Array, Hash_Table, Dynamic_Programming | 298 | 100.00
| 0822 |[Card Flipping Game](src.save/main/kotlin/g0801_0900/s0822_card_flipping_game/Solution.kt)| Medium | Array, Hash_Table | 186 | 100.00
| 0821 |[Shortest Distance to a Character](src.save/main/kotlin/g0801_0900/s0821_shortest_distance_to_a_character/Solution.kt)| Easy | Array, String, Two_Pointers | 168 | 88.00
| 0820 |[Short Encoding of Words](src.save/main/kotlin/g0801_0900/s0820_short_encoding_of_words/Solution.kt)| Medium | Array, String, Hash_Table, Trie | 231 | 100.00
| 0819 |[Most Common Word](src.save/main/kotlin/g0801_0900/s0819_most_common_word/Solution.kt)| Easy | String, Hash_Table, Counting | 211 | 83.33
| 0818 |[Race Car](src.save/main/kotlin/g0801_0900/s0818_race_car/Solution.kt)| Hard | Dynamic_Programming | 123 | 100.00
| 0817 |[Linked List Components](src.save/main/kotlin/g0801_0900/s0817_linked_list_components/Solution.kt)| Medium | Hash_Table, Linked_List | 239 | 100.00
| 0816 |[Ambiguous Coordinates](src.save/main/kotlin/g0801_0900/s0816_ambiguous_coordinates/Solution.kt)| Medium | String, Backtracking | 231 | 100.00
| 0815 |[Bus Routes](src.save/main/kotlin/g0801_0900/s0815_bus_routes/Solution.kt)| Hard | Array, Hash_Table, Breadth_First_Search, Level_2_Day_11_Graph/BFS/DFS | 429 | 100.00
| 0814 |[Binary Tree Pruning](src.save/main/kotlin/g0801_0900/s0814_binary_tree_pruning/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree | 127 | 100.00
| 0813 |[Largest Sum of Averages](src.save/main/kotlin/g0801_0900/s0813_largest_sum_of_averages/Solution.kt)| Medium | Array, Dynamic_Programming | 160 | 100.00
| 0812 |[Largest Triangle Area](src.save/main/kotlin/g0801_0900/s0812_largest_triangle_area/Solution.kt)| Easy | Array, Math, Geometry | 156 | 71.43
| 0811 |[Subdomain Visit Count](src.save/main/kotlin/g0801_0900/s0811_subdomain_visit_count/Solution.kt)| Medium | Array, String, Hash_Table, Counting | 220 | 100.00
| 0810 |[Chalkboard XOR Game](src.save/main/kotlin/g0801_0900/s0810_chalkboard_xor_game/Solution.kt)| Hard | Array, Math, Bit_Manipulation, Game_Theory, Brainteaser | 172 | 100.00
| 0809 |[Expressive Words](src.save/main/kotlin/g0801_0900/s0809_expressive_words/Solution.kt)| Medium | Array, String, Two_Pointers | 158 | 100.00
| 0808 |[Soup Servings](src.save/main/kotlin/g0801_0900/s0808_soup_servings/Solution.kt)| Medium | Dynamic_Programming, Math, Probability_and_Statistics | 112 | 100.00
| 0807 |[Max Increase to Keep City Skyline](src.save/main/kotlin/g0801_0900/s0807_max_increase_to_keep_city_skyline/Solution.kt)| Medium | Array, Greedy, Matrix | 158 | 100.00
| 0806 |[Number of Lines To Write String](src.save/main/kotlin/g0801_0900/s0806_number_of_lines_to_write_string/Solution.kt)| Easy | Array, String | 134 | 100.00
| 0805 |[Split Array With Same Average](src.save/main/kotlin/g0801_0900/s0805_split_array_with_same_average/Solution.kt)| Hard | Array, Dynamic_Programming, Math, Bit_Manipulation, Bitmask | 142 | 100.00
| 0804 |[Unique Morse Code Words](src.save/main/kotlin/g0801_0900/s0804_unique_morse_code_words/Solution.kt)| Easy | Array, String, Hash_Table | 158 | 80.00
| 0803 |[Bricks Falling When Hit](src.save/main/kotlin/g0801_0900/s0803_bricks_falling_when_hit/Solution.kt)| Hard | Array, Matrix, Union_Find | 742 | 100.00
| 0802 |[Find Eventual Safe States](src.save/main/kotlin/g0801_0900/s0802_find_eventual_safe_states/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Topological_Sort, Graph_Theory_I_Day_9_Standard_Traversal | 511 | 100.00
| 0801 |[Minimum Swaps To Make Sequences Increasing](src.save/main/kotlin/g0801_0900/s0801_minimum_swaps_to_make_sequences_increasing/Solution.kt)| Hard | Array, Dynamic_Programming | 617 | 83.33
| 0799 |[Champagne Tower](src.save/main/kotlin/g0701_0800/s0799_champagne_tower/Solution.kt)| Medium | Dynamic_Programming | 153 | 100.00
| 0798 |[Smallest Rotation with Highest Score](src.save/main/kotlin/g0701_0800/s0798_smallest_rotation_with_highest_score/Solution.kt)| Hard | Array, Prefix_Sum | 470 | 100.00
| 0797 |[All Paths From Source to Target](src.save/main/kotlin/g0701_0800/s0797_all_paths_from_source_to_target/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Backtracking, Algorithm_II_Day_8_Breadth_First_Search_Depth_First_Search, Graph_Theory_I_Day_7_Standard_Traversal | 232 | 100.00
| 0796 |[Rotate String](src.save/main/kotlin/g0701_0800/s0796_rotate_string/Solution.kt)| Easy | String, String_Matching | 134 | 100.00
| 0795 |[Number of Subarrays with Bounded Maximum](src.save/main/kotlin/g0701_0800/s0795_number_of_subarrays_with_bounded_maximum/Solution.kt)| Medium | Array, Two_Pointers | 361 | 66.67
| 0794 |[Valid Tic-Tac-Toe State](src.save/main/kotlin/g0701_0800/s0794_valid_tic_tac_toe_state/Solution.kt)| Medium | Array, String | 138 | 100.00
| 0793 |[Preimage Size of Factorial Zeroes Function](src.save/main/kotlin/g0701_0800/s0793_preimage_size_of_factorial_zeroes_function/Solution.kt)| Hard | Math, Binary_Search | 114 | 100.00
| 0792 |[Number of Matching Subsequences](src.save/main/kotlin/g0701_0800/s0792_number_of_matching_subsequences/Solution.kt)| Medium | String, Hash_Table, Sorting, Trie | 346 | 100.00
| 0791 |[Custom Sort String](src.save/main/kotlin/g0701_0800/s0791_custom_sort_string/Solution.kt)| Medium | String, Hash_Table, Sorting | 133 | 90.00
| 0790 |[Domino and Tromino Tiling](src.save/main/kotlin/g0701_0800/s0790_domino_and_tromino_tiling/Solution.kt)| Medium | Dynamic_Programming | 116 | 100.00
| 0789 |[Escape The Ghosts](src.save/main/kotlin/g0701_0800/s0789_escape_the_ghosts/Solution.kt)| Medium | Array, Math | 187 | 100.00
| 0788 |[Rotated Digits](src.save/main/kotlin/g0701_0800/s0788_rotated_digits/Solution.kt)| Medium | Dynamic_Programming, Math | 137 | 80.00
| 0787 |[Cheapest Flights Within K Stops](src.save/main/kotlin/g0701_0800/s0787_cheapest_flights_within_k_stops/Solution.kt)| Medium | Dynamic_Programming, Depth_First_Search, Breadth_First_Search, Heap_Priority_Queue, Graph, Shortest_Path | 185 | 99.20
| 0786 |[K-th Smallest Prime Fraction](src.save/main/kotlin/g0701_0800/s0786_k_th_smallest_prime_fraction/Solution.kt)| Medium | Array, Binary_Search, Heap_Priority_Queue | 165 | 100.00
| 0785 |[Is Graph Bipartite?](src.save/main/kotlin/g0701_0800/s0785_is_graph_bipartite/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find, Graph_Theory_I_Day_14_Graph_Theory | 215 | 82.35
| 0784 |[Letter Case Permutation](src.save/main/kotlin/g0701_0800/s0784_letter_case_permutation/Solution.kt)| Medium | String, Bit_Manipulation, Backtracking, Algorithm_I_Day_11_Recursion_Backtracking | 219 | 84.62
| 0783 |[Minimum Distance Between BST Nodes](src.save/main/kotlin/g0701_0800/s0783_minimum_distance_between_bst_nodes/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 144 | 96.35
| 0782 |[Transform to Chessboard](src.save/main/kotlin/g0701_0800/s0782_transform_to_chessboard/Solution.kt)| Hard | Array, Math, Matrix, Bit_Manipulation | 188 | 100.00
| 0781 |[Rabbits in Forest](src.save/main/kotlin/g0701_0800/s0781_rabbits_in_forest/Solution.kt)| Medium | Array, Hash_Table, Math, Greedy | 132 | 100.00
| 0780 |[Reaching Points](src.save/main/kotlin/g0701_0800/s0780_reaching_points/Solution.kt)| Hard | Math | 139 | 100.00
| 0779 |[K-th Symbol in Grammar](src.save/main/kotlin/g0701_0800/s0779_k_th_symbol_in_grammar/Solution.kt)| Medium | Math, Bit_Manipulation, Recursion | 114 | 100.00
| 0778 |[Swim in Rising Water](src.save/main/kotlin/g0701_0800/s0778_swim_in_rising_water/Solution.kt)| Hard | Array, Depth_First_Search, Breadth_First_Search, Binary_Search, Matrix, Heap_Priority_Queue, Union_Find | 190 | 100.00
| 0777 |[Swap Adjacent in LR String](src.save/main/kotlin/g0701_0800/s0777_swap_adjacent_in_lr_string/Solution.kt)| Medium | String, Two_Pointers | 188 | 100.00
| 0775 |[Global and Local Inversions](src.save/main/kotlin/g0701_0800/s0775_global_and_local_inversions/Solution.kt)| Medium | Array, Math | 495 | 100.00
| 0773 |[Sliding Puzzle](src.save/main/kotlin/g0701_0800/s0773_sliding_puzzle/Solution.kt)| Hard | Array, Breadth_First_Search, Matrix | 166 | 100.00
| 0771 |[Jewels and Stones](src.save/main/kotlin/g0701_0800/s0771_jewels_and_stones/Solution.kt)| Easy | String, Hash_Table | 143 | 99.08
| 0770 |[Basic Calculator IV](src.save/main/kotlin/g0701_0800/s0770_basic_calculator_iv/Solution.kt)| Hard | String, Hash_Table, Math, Stack, Recursion | 222 | 100.00
| 0769 |[Max Chunks To Make Sorted](src.save/main/kotlin/g0701_0800/s0769_max_chunks_to_make_sorted/Solution.kt)| Medium | Array, Sorting, Greedy, Stack, Monotonic_Stack | 136 | 90.00
| 0768 |[Max Chunks To Make Sorted II](src.save/main/kotlin/g0701_0800/s0768_max_chunks_to_make_sorted_ii/Solution.kt)| Hard | Array, Sorting, Greedy, Stack, Monotonic_Stack | 202 | 100.00
| 0767 |[Reorganize String](src.save/main/kotlin/g0701_0800/s0767_reorganize_string/Solution.kt)| Medium | String, Hash_Table, Sorting, Greedy, Heap_Priority_Queue, Counting | 148 | 100.00
| 0766 |[Toeplitz Matrix](src.save/main/kotlin/g0701_0800/s0766_toeplitz_matrix/Solution.kt)| Easy | Array, Matrix | 174 | 100.00
| 0765 |[Couples Holding Hands](src.save/main/kotlin/g0701_0800/s0765_couples_holding_hands/Solution.kt)| Hard | Depth_First_Search, Greedy, Breadth_First_Search, Graph, Union_Find | 131 | 100.00
| 0764 |[Largest Plus Sign](src.save/main/kotlin/g0701_0800/s0764_largest_plus_sign/Solution.kt)| Medium | Array, Dynamic_Programming | 415 | 100.00
| 0763 |[Partition Labels](src.save/main/kotlin/g0701_0800/s0763_partition_labels/Solution.kt)| Medium | Top_100_Liked_Questions, String, Hash_Table, Greedy, Two_Pointers, Data_Structure_II_Day_7_String | 235 | 84.75
| 0762 |[Prime Number of Set Bits in Binary Representation](src.save/main/kotlin/g0701_0800/s0762_prime_number_of_set_bits_in_binary_representation/Solution.kt)| Easy | Math, Bit_Manipulation | 147 | 100.00
| 0761 |[Special Binary String](src.save/main/kotlin/g0701_0800/s0761_special_binary_string/Solution.kt)| Hard | String, Recursion | 128 | 100.00
| 0757 |[Set Intersection Size At Least Two](src.save/main/kotlin/g0701_0800/s0757_set_intersection_size_at_least_two/Solution.kt)| Hard | Array, Sorting, Greedy | 298 | 100.00
| 0756 |[Pyramid Transition Matrix](src.save/main/kotlin/g0701_0800/s0756_pyramid_transition_matrix/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Bit_Manipulation | 268 | 100.00
| 0754 |[Reach a Number](src.save/main/kotlin/g0701_0800/s0754_reach_a_number/Solution.kt)| Medium | Math, Binary_Search | 134 | 100.00
| 0753 |[Cracking the Safe](src.save/main/kotlin/g0701_0800/s0753_cracking_the_safe/Solution.kt)| Hard | Depth_First_Search, Graph, Eulerian_Circuit | 147 | 100.00
| 0752 |[Open the Lock](src.save/main/kotlin/g0701_0800/s0752_open_the_lock/Solution.kt)| Medium | Array, String, Hash_Table, Breadth_First_Search, Graph_Theory_I_Day_12_Breadth_First_Search | 310 | 100.00
| 0749 |[Contain Virus](src.save/main/kotlin/g0701_0800/s0749_contain_virus/Solution.kt)| Hard | Array, Depth_First_Search, Breadth_First_Search, Matrix, Simulation | 201 | 100.00
| 0748 |[Shortest Completing Word](src.save/main/kotlin/g0701_0800/s0748_shortest_completing_word/Solution.kt)| Easy | Array, String, Hash_Table | 172 | 100.00
| 0747 |[Largest Number At Least Twice of Others](src.save/main/kotlin/g0701_0800/s0747_largest_number_at_least_twice_of_others/Solution.kt)| Easy | Array, Sorting | 147 | 98.21
| 0746 |[Min Cost Climbing Stairs](src.save/main/kotlin/g0701_0800/s0746_min_cost_climbing_stairs/Solution.kt)| Easy | Array, Dynamic_Programming, Dynamic_Programming_I_Day_2, Level_1_Day_11_Dynamic_Programming | 171 | 96.76
| 0745 |[Prefix and Suffix Search](src.save/main/kotlin/g0701_0800/s0745_prefix_and_suffix_search/WordFilter.kt)| Hard | String, Design, Trie, Udemy_Trie_and_Heap | 1638 | 100.00
| 0744 |[Find Smallest Letter Greater Than Target](src.save/main/kotlin/g0701_0800/s0744_find_smallest_letter_greater_than_target/Solution.kt)| Easy | Array, Binary_Search, Binary_Search_I_Day_4 | 162 | 100.00
| 0743 |[Network Delay Time](src.save/main/kotlin/g0701_0800/s0743_network_delay_time/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Heap_Priority_Queue, Graph, Shortest_Path | 321 | 98.55
| 0741 |[Cherry Pickup](src.save/main/kotlin/g0701_0800/s0741_cherry_pickup/Solution.kt)| Hard | Array, Dynamic_Programming, Matrix | 196 | 100.00
| 0740 |[Delete and Earn](src.save/main/kotlin/g0701_0800/s0740_delete_and_earn/Solution.kt)| Medium | Array, Hash_Table, Dynamic_Programming, Dynamic_Programming_I_Day_3 | 192 | 100.00
| 0739 |[Daily Temperatures](src.save/main/kotlin/g0701_0800/s0739_daily_temperatures/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Stack, Monotonic_Stack, Programming_Skills_II_Day_6 | 936 | 80.54
| 0738 |[Monotone Increasing Digits](src.save/main/kotlin/g0701_0800/s0738_monotone_increasing_digits/Solution.kt)| Medium | Math, Greedy | 127 | 100.00
| 0736 |[Parse Lisp Expression](src.save/main/kotlin/g0701_0800/s0736_parse_lisp_expression/Solution.kt)| Hard | String, Hash_Table, Stack, Recursion | 172 | 100.00
| 0735 |[Asteroid Collision](src.save/main/kotlin/g0701_0800/s0735_asteroid_collision/Solution.kt)| Medium | Array, Stack, Level_2_Day_18_Stack | 243 | 100.00
| 0733 |[Flood Fill](src.save/main/kotlin/g0701_0800/s0733_flood_fill/Solution.kt)| Easy | Array, Depth_First_Search, Breadth_First_Search, Matrix, Algorithm_I_Day_7_Breadth_First_Search_Depth_First_Search, Graph_Theory_I_Day_1_Matrix_Related_Problems, Level_1_Day_9_Graph/BFS/DFS | 230 | 97.76
| 0732 |[My Calendar III](src.save/main/kotlin/g0701_0800/s0732_my_calendar_iii/MyCalendarThree.kt)| Hard | Binary_Search, Design, Ordered_Set, Segment_Tree | 294 | 100.00
| 0731 |[My Calendar II](src.save/main/kotlin/g0701_0800/s0731_my_calendar_ii/MyCalendarTwo.kt)| Medium | Binary_Search, Design, Ordered_Set, Segment_Tree | 371 | 100.00
| 0730 |[Count Different Palindromic Subsequences](src.save/main/kotlin/g0701_0800/s0730_count_different_palindromic_subsequences/Solution.kt)| Hard | String, Dynamic_Programming | 233 | 100.00
| 0729 |[My Calendar I](src.save/main/kotlin/g0701_0800/s0729_my_calendar_i/MyCalendar.kt)| Medium | Binary_Search, Design, Ordered_Set, Segment_Tree, Programming_Skills_II_Day_20 | 378 | 69.70
| 0728 |[Self Dividing Numbers](src.save/main/kotlin/g0701_0800/s0728_self_dividing_numbers/Solution.kt)| Easy | Math | 142 | 100.00
| 0726 |[Number of Atoms](src.save/main/kotlin/g0701_0800/s0726_number_of_atoms/Solution.kt)| Hard | String, Hash_Table, Sorting, Stack | 149 | 100.00
| 0725 |[Split Linked List in Parts](src.save/main/kotlin/g0701_0800/s0725_split_linked_list_in_parts/Solution.kt)| Medium | Linked_List | 162 | 95.00
| 0724 |[Find Pivot Index](src.save/main/kotlin/g0701_0800/s0724_find_pivot_index/Solution.kt)| Easy | Array, Prefix_Sum, Level_1_Day_1_Prefix_Sum | 255 | 88.92
| 0722 |[Remove Comments](src.save/main/kotlin/g0701_0800/s0722_remove_comments/Solution.kt)| Medium | Array, String | 164 | 100.00
| 0721 |[Accounts Merge](src.save/main/kotlin/g0701_0800/s0721_accounts_merge/Solution.kt)| Medium | Array, String, Depth_First_Search, Breadth_First_Search, Union_Find | 364 | 100.00
| 0720 |[Longest Word in Dictionary](src.save/main/kotlin/g0701_0800/s0720_longest_word_in_dictionary/Solution.kt)| Medium | Array, String, Hash_Table, Sorting, Trie | 209 | 100.00
| 0719 |[Find K-th Smallest Pair Distance](src.save/main/kotlin/g0701_0800/s0719_find_k_th_smallest_pair_distance/Solution.kt)| Hard | Array, Sorting, Binary_Search, Two_Pointers | 172 | 100.00
| 0718 |[Maximum Length of Repeated Subarray](src.save/main/kotlin/g0701_0800/s0718_maximum_length_of_repeated_subarray/Solution.kt)| Medium | Array, Dynamic_Programming, Binary_Search, Sliding_Window, Hash_Function, Rolling_Hash | 270 | 91.43
| 0717 |[1-bit and 2-bit Characters](src.save/main/kotlin/g0701_0800/s0717_1_bit_and_2_bit_characters/Solution.kt)| Easy | Array | 165 | 100.00
| 0715 |[Range Module](src.save/main/kotlin/g0701_0800/s0715_range_module/RangeModule.kt)| Hard | Design, Ordered_Set, Segment_Tree | 638 | 58.33
| 0714 |[Best Time to Buy and Sell Stock with Transaction Fee](src.save/main/kotlin/g0701_0800/s0714_best_time_to_buy_and_sell_stock_with_transaction_fee/Solution.kt)| Medium | Array, Dynamic_Programming, Greedy, Dynamic_Programming_I_Day_8 | 417 | 90.91
| 0713 |[Subarray Product Less Than K](src.save/main/kotlin/g0701_0800/s0713_subarray_product_less_than_k/Solution.kt)| Medium | Array, Sliding_Window, Algorithm_II_Day_5_Sliding_Window, Programming_Skills_II_Day_12, Udemy_Arrays | 336 | 92.11
| 0712 |[Minimum ASCII Delete Sum for Two Strings](src.save/main/kotlin/g0701_0800/s0712_minimum_ascii_delete_sum_for_two_strings/Solution.kt)| Medium | String, Dynamic_Programming | 176 | 100.00
| 0710 |[Random Pick with Blacklist](src.save/main/kotlin/g0701_0800/s0710_random_pick_with_blacklist/Solution.kt)| Hard | Hash_Table, Math, Sorting, Binary_Search, Randomized | 632 | 100.00
| 0709 |[To Lower Case](src.save/main/kotlin/g0701_0800/s0709_to_lower_case/Solution.kt)| Easy | String, Programming_Skills_I_Day_9_String | 142 | 98.68
| 0707 |[Design Linked List](src.save/main/kotlin/g0701_0800/s0707_design_linked_list/MyLinkedList.kt)| Medium | Design, Linked_List, Data_Structure_II_Day_12_Linked_List, Programming_Skills_II_Day_19, Udemy_Linked_List | 243 | 100.00
| 0706 |[Design HashMap](src.save/main/kotlin/g0701_0800/s0706_design_hashmap/MyHashMap.kt)| Easy | Array, Hash_Table, Design, Linked_List, Hash_Function, Data_Structure_II_Day_2_Array | 405 | 92.11
| 0705 |[Design HashSet](src.save/main/kotlin/g0701_0800/s0705_design_hashset/MyHashSet.kt)| Easy | Array, Hash_Table, Design, Linked_List, Hash_Function | 385 | 75.61
| 0704 |[Binary Search](src.save/main/kotlin/g0701_0800/s0704_binary_search/Solution.kt)| Easy | Array, Binary_Search, Algorithm_I_Day_1_Binary_Search, Binary_Search_I_Day_1, Level_1_Day_7_Binary_Search, Udemy_Binary_Search | 261 | 77.91
| 0703 |[Kth Largest Element in a Stream](src.save/main/kotlin/g0701_0800/s0703_kth_largest_element_in_a_stream/KthLargest.kt)| Easy | Tree, Binary_Tree, Design, Heap_Priority_Queue, Binary_Search_Tree, Data_Stream | 286 | 95.45
| 0701 |[Insert into a Binary Search Tree](src.save/main/kotlin/g0701_0800/s0701_insert_into_a_binary_search_tree/Solution.kt)| Medium | Tree, Binary_Tree, Binary_Search_Tree, Data_Structure_I_Day_13_Tree, Udemy_Tree_Stack_Queue | 311 | 79.03
| 0700 |[Search in a Binary Search Tree](src.save/main/kotlin/g0601_0700/s0700_search_in_a_binary_search_tree/Solution.kt)| Easy | Tree, Binary_Tree, Binary_Search_Tree, Data_Structure_I_Day_13_Tree | 251 | 88.31
| 0699 |[Falling Squares](src.save/main/kotlin/g0601_0700/s0699_falling_squares/Solution.kt)| Hard | Array, Ordered_Set, Segment_Tree | 293 | 100.00
| 0698 |[Partition to K Equal Sum Subsets](src.save/main/kotlin/g0601_0700/s0698_partition_to_k_equal_sum_subsets/Solution.kt)| Medium | Array, Dynamic_Programming, Bit_Manipulation, Backtracking, Bitmask, Memoization | 191 | 100.00
| 0697 |[Degree of an Array](src.save/main/kotlin/g0601_0700/s0697_degree_of_an_array/Solution.kt)| Easy | Array, Hash_Table, Udemy_Arrays | 289 | 84.62
| 0696 |[Count Binary Substrings](src.save/main/kotlin/g0601_0700/s0696_count_binary_substrings/Solution.kt)| Easy | String, Two_Pointers | 222 | 100.00
| 0695 |[Max Area of Island](src.save/main/kotlin/g0601_0700/s0695_max_area_of_island/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find, Algorithm_I_Day_7_Breadth_First_Search_Depth_First_Search, Graph_Theory_I_Day_2_Matrix_Related_Problems | 324 | 24.06
| 0693 |[Binary Number with Alternating Bits](src.save/main/kotlin/g0601_0700/s0693_binary_number_with_alternating_bits/Solution.kt)| Easy | Bit_Manipulation | 129 | 100.00
| 0692 |[Top K Frequent Words](src.save/main/kotlin/g0601_0700/s0692_top_k_frequent_words/Solution.kt)| Medium | String, Hash_Table, Sorting, Heap_Priority_Queue, Counting, Trie, Bucket_Sort, Level_1_Day_15_Heap | 239 | 81.10
| 0691 |[Stickers to Spell Word](src.save/main/kotlin/g0601_0700/s0691_stickers_to_spell_word/Solution.kt)| Hard | Array, String, Dynamic_Programming, Bit_Manipulation, Backtracking, Bitmask | 249 | 100.00
| 0690 |[Employee Importance](src.save/main/kotlin/g0601_0700/s0690_employee_importance/Solution.kt)| Medium | Hash_Table, Depth_First_Search, Breadth_First_Search | 255 | 100.00
| 0689 |[Maximum Sum of 3 Non-Overlapping Subarrays](src.save/main/kotlin/g0601_0700/s0689_maximum_sum_of_3_non_overlapping_subarrays/Solution.kt)| Hard | Array, Dynamic_Programming | 248 | 100.00
| 0688 |[Knight Probability in Chessboard](src.save/main/kotlin/g0601_0700/s0688_knight_probability_in_chessboard/Solution.kt)| Medium | Dynamic_Programming | 144 | 100.00
| 0687 |[Longest Univalue Path](src.save/main/kotlin/g0601_0700/s0687_longest_univalue_path/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree | 303 | 100.00
| 0686 |[Repeated String Match](src.save/main/kotlin/g0601_0700/s0686_repeated_string_match/Solution.kt)| Medium | String, String_Matching | 164 | 100.00
| 0685 |[Redundant Connection II](src.save/main/kotlin/g0601_0700/s0685_redundant_connection_ii/Solution.kt)| Hard | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 176 | 100.00
| 0684 |[Redundant Connection](src.save/main/kotlin/g0601_0700/s0684_redundant_connection/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 181 | 88.24
| 0682 |[Baseball Game](src.save/main/kotlin/g0601_0700/s0682_baseball_game/Solution.kt)| Easy | Array, Stack, Simulation | 159 | 100.00
| 0680 |[Valid Palindrome II](src.save/main/kotlin/g0601_0700/s0680_valid_palindrome_ii/Solution.kt)| Easy | String, Greedy, Two_Pointers | 296 | 79.17
| 0679 |[24 Game](src.save/main/kotlin/g0601_0700/s0679_24_game/Solution.kt)| Hard | Array, Math, Backtracking | 175 | 100.00
| 0678 |[Valid Parenthesis String](src.save/main/kotlin/g0601_0700/s0678_valid_parenthesis_string/Solution.kt)| Medium | String, Dynamic_Programming, Greedy, Stack | 133 | 100.00
| 0677 |[Map Sum Pairs](src.save/main/kotlin/g0601_0700/s0677_map_sum_pairs/MapSum.kt)| Medium | String, Hash_Table, Design, Trie | 197 | 80.00
| 0676 |[Implement Magic Dictionary](src.save/main/kotlin/g0601_0700/s0676_implement_magic_dictionary/MagicDictionary.kt)| Medium | String, Hash_Table, Design, Trie | 256 | 100.00
| 0675 |[Cut Off Trees for Golf Event](src.save/main/kotlin/g0601_0700/s0675_cut_off_trees_for_golf_event/Solution.kt)| Hard | Array, Breadth_First_Search, Matrix, Heap_Priority_Queue | 777 | 100.00
| 0674 |[Longest Continuous Increasing Subsequence](src.save/main/kotlin/g0601_0700/s0674_longest_continuous_increasing_subsequence/Solution.kt)| Easy | Array | 201 | 84.21
| 0673 |[Number of Longest Increasing Subsequence](src.save/main/kotlin/g0601_0700/s0673_number_of_longest_increasing_subsequence/Solution.kt)| Medium | Array, Dynamic_Programming, Segment_Tree, Binary_Indexed_Tree, Algorithm_II_Day_16_Dynamic_Programming | 226 | 91.67
| 0672 |[Bulb Switcher II](src.save/main/kotlin/g0601_0700/s0672_bulb_switcher_ii/Solution.kt)| Medium | Math, Depth_First_Search, Breadth_First_Search, Bit_Manipulation | 131 | 100.00
| 0671 |[Second Minimum Node In a Binary Tree](src.save/main/kotlin/g0601_0700/s0671_second_minimum_node_in_a_binary_tree/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree | 128 | 100.00
| 0670 |[Maximum Swap](src.save/main/kotlin/g0601_0700/s0670_maximum_swap/Solution.kt)| Medium | Math, Greedy | 143 | 100.00
| 0669 |[Trim a Binary Search Tree](src.save/main/kotlin/g0601_0700/s0669_trim_a_binary_search_tree/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 195 | 100.00
| 0668 |[Kth Smallest Number in Multiplication Table](src.save/main/kotlin/g0601_0700/s0668_kth_smallest_number_in_multiplication_table/Solution.kt)| Hard | Math, Binary_Search | 151 | 100.00
| 0667 |[Beautiful Arrangement II](src.save/main/kotlin/g0601_0700/s0667_beautiful_arrangement_ii/Solution.kt)| Medium | Array, Math | 175 | 100.00
| 0665 |[Non-decreasing Array](src.save/main/kotlin/g0601_0700/s0665_non_decreasing_array/Solution.kt)| Medium | Array | 256 | 85.71
| 0664 |[Strange Printer](src.save/main/kotlin/g0601_0700/s0664_strange_printer/Solution.kt)| Hard | String, Dynamic_Programming | 196 | 100.00
| 0662 |[Maximum Width of Binary Tree](src.save/main/kotlin/g0601_0700/s0662_maximum_width_of_binary_tree/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 189 | 75.00
| 0661 |[Image Smoother](src.save/main/kotlin/g0601_0700/s0661_image_smoother/Solution.kt)| Easy | Array, Matrix | 352 | 100.00
| 0659 |[Split Array into Consecutive Subsequences](src.save/main/kotlin/g0601_0700/s0659_split_array_into_consecutive_subsequences/Solution.kt)| Medium | Array, Hash_Table, Greedy, Heap_Priority_Queue | 352 | 100.00
| 0658 |[Find K Closest Elements](src.save/main/kotlin/g0601_0700/s0658_find_k_closest_elements/Solution.kt)| Medium | Array, Sorting, Binary_Search, Two_Pointers, Heap_Priority_Queue, Binary_Search_II_Day_2 | 375 | 95.16
| 0657 |[Robot Return to Origin](src.save/main/kotlin/g0601_0700/s0657_robot_return_to_origin/Solution.kt)| Easy | String, Simulation | 186 | 100.00
| 0655 |[Print Binary Tree](src.save/main/kotlin/g0601_0700/s0655_print_binary_tree/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 176 | 100.00
| 0654 |[Maximum Binary Tree](src.save/main/kotlin/g0601_0700/s0654_maximum_binary_tree/Solution.kt)| Medium | Array, Tree, Binary_Tree, Stack, Monotonic_Stack, Divide_and_Conquer | 271 | 90.00
| 0653 |[Two Sum IV - Input is a BST](src.save/main/kotlin/g0601_0700/s0653_two_sum_iv_input_is_a_bst/Solution.kt)| Easy | Hash_Table, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Two_Pointers, Binary_Search_Tree, Data_Structure_I_Day_14_Tree | 231 | 96.08
| 0652 |[Find Duplicate Subtrees](src.save/main/kotlin/g0601_0700/s0652_find_duplicate_subtrees/Solution.kt)| Medium | Hash_Table, Depth_First_Search, Tree, Binary_Tree | 266 | 76.00
| 0650 |[2 Keys Keyboard](src.save/main/kotlin/g0601_0700/s0650_2_keys_keyboard/Solution.kt)| Medium | Dynamic_Programming, Math | 115 | 100.00
| 0649 |[Dota2 Senate](src.save/main/kotlin/g0601_0700/s0649_dota2_senate/Solution.kt)| Medium | String, Greedy, Queue | 217 | 100.00
| 0648 |[Replace Words](src.save/main/kotlin/g0601_0700/s0648_replace_words/Solution.kt)| Medium | Array, String, Hash_Table, Trie | 392 | 100.00
| 0647 |[Palindromic Substrings](src.save/main/kotlin/g0601_0700/s0647_palindromic_substrings/Solution.kt)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming | 266 | 67.83
| 0646 |[Maximum Length of Pair Chain](src.save/main/kotlin/g0601_0700/s0646_maximum_length_of_pair_chain/Solution.kt)| Medium | Array, Dynamic_Programming, Sorting, Greedy | 249 | 100.00
| 0645 |[Set Mismatch](src.save/main/kotlin/g0601_0700/s0645_set_mismatch/Solution.kt)| Easy | Array, Hash_Table, Sorting, Bit_Manipulation | 246 | 88.46
| 0643 |[Maximum Average Subarray I](src.save/main/kotlin/g0601_0700/s0643_maximum_average_subarray_i/Solution.kt)| Easy | Array, Sliding_Window | 494 | 98.65
| 0641 |[Design Circular Deque](src.save/main/kotlin/g0601_0700/s0641_design_circular_deque/MyCircularDeque.kt)| Medium | Array, Design, Linked_List, Queue | 232 | 100.00
| 0640 |[Solve the Equation](src.save/main/kotlin/g0601_0700/s0640_solve_the_equation/Solution.kt)| Medium | String, Math, Simulation | 170 | 66.67
| 0639 |[Decode Ways II](src.save/main/kotlin/g0601_0700/s0639_decode_ways_ii/Solution.kt)| Hard | String, Dynamic_Programming | 259 | 100.00
| 0638 |[Shopping Offers](src.save/main/kotlin/g0601_0700/s0638_shopping_offers/Solution.kt)| Medium | Array, Dynamic_Programming, Bit_Manipulation, Backtracking, Bitmask, Memoization | 195 | 100.00
| 0637 |[Average of Levels in Binary Tree](src.save/main/kotlin/g0601_0700/s0637_average_of_levels_in_binary_tree/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 249 | 100.00
| 0636 |[Exclusive Time of Functions](src.save/main/kotlin/g0601_0700/s0636_exclusive_time_of_functions/Solution.kt)| Medium | Array, Stack | 270 | 80.00
| 0633 |[Sum of Square Numbers](src.save/main/kotlin/g0601_0700/s0633_sum_of_square_numbers/Solution.kt)| Medium | Math, Binary_Search, Two_Pointers, Binary_Search_I_Day_10 | 126 | 100.00
| 0632 |[Smallest Range Covering Elements from K Lists](src.save/main/kotlin/g0601_0700/s0632_smallest_range_covering_elements_from_k_lists/Solution.kt)| Hard | Array, Hash_Table, Sorting, Greedy, Heap_Priority_Queue, Sliding_Window | 399 | 83.33
| 0630 |[Course Schedule III](src.save/main/kotlin/g0601_0700/s0630_course_schedule_iii/Solution.kt)| Hard | Array, Greedy, Heap_Priority_Queue | 536 | 100.00
| 0629 |[K Inverse Pairs Array](src.save/main/kotlin/g0601_0700/s0629_k_inverse_pairs_array/Solution.kt)| Hard | Dynamic_Programming | 155 | 100.00
| 0628 |[Maximum Product of Three Numbers](src.save/main/kotlin/g0601_0700/s0628_maximum_product_of_three_numbers/Solution.kt)| Easy | Array, Math, Sorting | 276 | 97.30
| 0627 |[Swap Salary](src.save/main/kotlin/g0601_0700/s0627_swap_salary/script.sql)| Easy | Database, SQL_I_Day_2_Select_and_Order | 400 | 51.04
| 0626 |[Exchange Seats](src.save/main/kotlin/g0601_0700/s0626_exchange_seats/script.sql)| Medium | Database | 502 | 50.56
| 0623 |[Add One Row to Tree](src.save/main/kotlin/g0601_0700/s0623_add_one_row_to_tree/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 202 | 100.00
| 0622 |[Design Circular Queue](src.save/main/kotlin/g0601_0700/s0622_design_circular_queue/MyCircularQueue.kt)| Medium | Array, Design, Linked_List, Queue, Programming_Skills_II_Day_20 | 234 | 92.68
| 0621 |[Task Scheduler](src.save/main/kotlin/g0601_0700/s0621_task_scheduler/Solution.kt)| Medium | Array, Hash_Table, Sorting, Greedy, Heap_Priority_Queue, Counting, Level_2_Day_5_Greedy | 266 | 98.36
| 0620 |[Not Boring Movies](src.save/main/kotlin/g0601_0700/s0620_not_boring_movies/script.sql)| Easy | Database | 305 | 59.80
| 0619 |[Biggest Single Number](src.save/main/kotlin/g0601_0700/s0619_biggest_single_number/script.sql)| Easy | Database | 656 | 90.69
| 0617 |[Merge Two Binary Trees](src.save/main/kotlin/g0601_0700/s0617_merge_two_binary_trees/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Algorithm_I_Day_8_Breadth_First_Search_Depth_First_Search | 243 | 72.83
| 0611 |[Valid Triangle Number](src.save/main/kotlin/g0601_0700/s0611_valid_triangle_number/Solution.kt)| Medium | Array, Sorting, Greedy, Binary_Search, Two_Pointers, Binary_Search_II_Day_1 | 203 | 100.00
| 0610 |[Triangle Judgement](src.save/main/kotlin/g0601_0700/s0610_triangle_judgement/script.sql)| Easy | Database | 464 | 72.35
| 0609 |[Find Duplicate File in System](src.save/main/kotlin/g0601_0700/s0609_find_duplicate_file_in_system/Solution.kt)| Medium | Array, String, Hash_Table | 426 | 100.00
| 0608 |[Tree Node](src.save/main/kotlin/g0601_0700/s0608_tree_node/script.sql)| Medium | LeetCode_Curated_SQL_70, Database, SQL_I_Day_4_Union_and_Select | 794 | 48.38
| 0607 |[Sales Person](src.save/main/kotlin/g0601_0700/s0607_sales_person/script.sql)| Easy | LeetCode_Curated_SQL_70, Database, SQL_I_Day_6_Union | 2142 | 44.56
| 0606 |[Construct String from Binary Tree](src.save/main/kotlin/g0601_0700/s0606_construct_string_from_binary_tree/Solution.kt)| Easy | String, Depth_First_Search, Tree, Binary_Tree | 187 | 100.00
| 0605 |[Can Place Flowers](src.save/main/kotlin/g0601_0700/s0605_can_place_flowers/Solution.kt)| Easy | Array, Greedy, Udemy_Arrays | 209 | 85.71
| 0602 |[Friend Requests II: Who Has the Most Friends](src.save/main/kotlin/g0601_0700/s0602_friend_requests_ii_who_has_the_most_friends/script.sql)| Medium | Database | 398 | 97.39
| 0601 |[Human Traffic of Stadium](src.save/main/kotlin/g0601_0700/s0601_human_traffic_of_stadium/script.sql)| Hard | Database | 529 | 51.80
| 0600 |[Non-negative Integers without Consecutive Ones](src.save/main/kotlin/g0501_0600/s0600_non_negative_integers_without_consecutive_ones/Solution.kt)| Hard | Dynamic_Programming | 142 | 100.00
| 0599 |[Minimum Index Sum of Two Lists](src.save/main/kotlin/g0501_0600/s0599_minimum_index_sum_of_two_lists/Solution.kt)| Easy | Array, String, Hash_Table | 293 | 100.00
| 0598 |[Range Addition II](src.save/main/kotlin/g0501_0600/s0598_range_addition_ii/Solution.kt)| Easy | Array, Math | 176 | 66.67
| 0596 |[Classes More Than 5 Students](src.save/main/kotlin/g0501_0600/s0596_classes_more_than_5_students/script.sql)| Easy | Database | 484 | 50.92
| 0595 |[Big Countries](src.save/main/kotlin/g0501_0600/s0595_big_countries/script.sql)| Easy | Database, SQL_I_Day_1_Select | 417 | 56.09
| 0594 |[Longest Harmonious Subsequence](src.save/main/kotlin/g0501_0600/s0594_longest_harmonious_subsequence/Solution.kt)| Easy | Array, Hash_Table, Sorting | 331 | 100.00
| 0593 |[Valid Square](src.save/main/kotlin/g0501_0600/s0593_valid_square/Solution.kt)| Medium | Math, Geometry | 161 | 83.33
| 0592 |[Fraction Addition and Subtraction](src.save/main/kotlin/g0501_0600/s0592_fraction_addition_and_subtraction/Solution.kt)| Medium | String, Math, Simulation | 164 | 100.00
| 0591 |[Tag Validator](src.save/main/kotlin/g0501_0600/s0591_tag_validator/Solution.kt)| Hard | String, Stack | 177 | 100.00
| 0590 |[N-ary Tree Postorder Traversal](src.save/main/kotlin/g0501_0600/s0590_n_ary_tree_postorder_traversal/Solution.kt)| Easy | Depth_First_Search, Tree, Stack | 237 | 88.10
| 0589 |[N-ary Tree Preorder Traversal](src.save/main/kotlin/g0501_0600/s0589_n_ary_tree_preorder_traversal/Solution.kt)| Easy | Depth_First_Search, Tree, Stack, Programming_Skills_I_Day_5_Function, Level_1_Day_6_Tree | 233 | 84.02
| 0587 |[Erect the Fence](src.save/main/kotlin/g0501_0600/s0587_erect_the_fence/Solution.kt)| Hard | Array, Math, Geometry | 470 | 100.00
| 0586 |[Customer Placing the Largest Number of Orders](src.save/main/kotlin/g0501_0600/s0586_customer_placing_the_largest_number_of_orders/script.sql)| Easy | LeetCode_Curated_SQL_70, Database, SQL_I_Day_8_Function | 768 | 44.85
| 0585 |[Investments in 2016](src.save/main/kotlin/g0501_0600/s0585_investments_in_2016/script.sql)| Medium | Database | 729 | 99.22
| 0584 |[Find Customer Referee](src.save/main/kotlin/g0501_0600/s0584_find_customer_referee/script.sql)| Easy | Database, SQL_I_Day_1_Select | 779 | 43.48
| 0583 |[Delete Operation for Two Strings](src.save/main/kotlin/g0501_0600/s0583_delete_operation_for_two_strings/Solution.kt)| Medium | String, Dynamic_Programming, Algorithm_II_Day_17_Dynamic_Programming | 197 | 100.00
| 0581 |[Shortest Unsorted Continuous Subarray](src.save/main/kotlin/g0501_0600/s0581_shortest_unsorted_continuous_subarray/Solution.kt)| Medium | Array, Sorting, Greedy, Two_Pointers, Stack, Monotonic_Stack | 246 | 100.00
| 0577 |[Employee Bonus](src.save/main/kotlin/g0501_0600/s0577_employee_bonus/script.sql)| Easy | Database | 1473 | 95.83
| 0576 |[Out of Boundary Paths](src.save/main/kotlin/g0501_0600/s0576_out_of_boundary_paths/Solution.kt)| Medium | Dynamic_Programming | 153 | 100.00
| 0575 |[Distribute Candies](src.save/main/kotlin/g0501_0600/s0575_distribute_candies/Solution.kt)| Easy | Array, Hash_Table | 538 | 76.92
| 0572 |[Subtree of Another Tree](src.save/main/kotlin/g0501_0600/s0572_subtree_of_another_tree/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Hash_Function, String_Matching, Algorithm_II_Day_7_Breadth_First_Search_Depth_First_Search | 214 | 92.39
| 0570 |[Managers with at Least 5 Direct Reports](src.save/main/kotlin/g0501_0600/s0570_managers_with_at_least_5_direct_reports/script.sql)| Medium | Database | 454 | 90.82
| 0567 |[Permutation in String](src.save/main/kotlin/g0501_0600/s0567_permutation_in_string/Solution.kt)| Medium | String, Hash_Table, Two_Pointers, Sliding_Window, Algorithm_I_Day_6_Sliding_Window | 169 | 100.00
| 0566 |[Reshape the Matrix](src.save/main/kotlin/g0501_0600/s0566_reshape_the_matrix/Solution.kt)| Easy | Array, Matrix, Simulation, Data_Structure_I_Day_4_Array, Programming_Skills_I_Day_7_Array | 239 | 99.05
| 0565 |[Array Nesting](src.save/main/kotlin/g0501_0600/s0565_array_nesting/Solution.kt)| Medium | Array, Depth_First_Search | 553 | 100.00
| 0564 |[Find the Closest Palindrome](src.save/main/kotlin/g0501_0600/s0564_find_the_closest_palindrome/Solution.kt)| Hard | String, Math | 179 | 100.00
| 0563 |[Binary Tree Tilt](src.save/main/kotlin/g0501_0600/s0563_binary_tree_tilt/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree | 197 | 100.00
| 0561 |[Array Partition](src.save/main/kotlin/g0501_0600/s0561_array_partition_i/Solution.kt)| Easy | Array, Sorting, Greedy, Counting_Sort | 337 | 90.48
| 0560 |[Subarray Sum Equals K](src.save/main/kotlin/g0501_0600/s0560_subarray_sum_equals_k/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Hash_Table, Prefix_Sum, Data_Structure_II_Day_5_Array | 692 | 53.27
| 0559 |[Maximum Depth of N-ary Tree](src.save/main/kotlin/g0501_0600/s0559_maximum_depth_of_n_ary_tree/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree | 196 | 100.00
| 0558 |[Logical OR of Two Binary Grids Represented as Quad-Trees](src.save/main/kotlin/g0501_0600/s0558_logical_or_of_two_binary_grids_represented_as_quad_trees/Solution.kt)| Medium | Tree, Divide_and_Conquer | 268 | 100.00
| 0557 |[Reverse Words in a String III](src.save/main/kotlin/g0501_0600/s0557_reverse_words_in_a_string_iii/Solution.kt)| Easy | String, Two_Pointers, Algorithm_I_Day_4_Two_Pointers | 215 | 98.10
| 0556 |[Next Greater Element III](src.save/main/kotlin/g0501_0600/s0556_next_greater_element_iii/Solution.kt)| Medium | String, Math, Two_Pointers, Programming_Skills_II_Day_10 | 137 | 80.00
| 0554 |[Brick Wall](src.save/main/kotlin/g0501_0600/s0554_brick_wall/Solution.kt)| Medium | Array, Hash_Table | 307 | 100.00
| 0553 |[Optimal Division](src.save/main/kotlin/g0501_0600/s0553_optimal_division/Solution.kt)| Medium | Array, Dynamic_Programming, Math | 154 | 100.00
| 0552 |[Student Attendance Record II](src.save/main/kotlin/g0501_0600/s0552_student_attendance_record_ii/Solution.kt)| Hard | Dynamic_Programming | 151 | 100.00
| 0551 |[Student Attendance Record I](src.save/main/kotlin/g0501_0600/s0551_student_attendance_record_i/Solution.kt)| Easy | String | 151 | 95.00
| 0550 |[Game Play Analysis IV](src.save/main/kotlin/g0501_0600/s0550_game_play_analysis_iv/script.sql)| Medium | Database | 762 | 97.74
| 0547 |[Number of Provinces](src.save/main/kotlin/g0501_0600/s0547_number_of_provinces/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find, Algorithm_II_Day_6_Breadth_First_Search_Depth_First_Search, Graph_Theory_I_Day_8_Standard_Traversal, Level_2_Day_19_Union_Find | 229 | 79.73
| 0546 |[Remove Boxes](src.save/main/kotlin/g0501_0600/s0546_remove_boxes/Solution.kt)| Hard | Array, Dynamic_Programming, Memoization | 283 | 100.00
| 0543 |[Diameter of Binary Tree](src.save/main/kotlin/g0501_0600/s0543_diameter_of_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, Level_2_Day_7_Tree, Udemy_Tree_Stack_Queue | 307 | 43.93
| 0542 |[01 Matrix](src.save/main/kotlin/g0501_0600/s0542_01_matrix/Solution.kt)| Medium | Array, Dynamic_Programming, Breadth_First_Search, Matrix, Algorithm_I_Day_9_Breadth_First_Search_Depth_First_Search, Graph_Theory_I_Day_5_Matrix_Related_Problems | 441 | 94.06
| 0541 |[Reverse String II](src.save/main/kotlin/g0501_0600/s0541_reverse_string_ii/Solution.kt)| Easy | String, Two_Pointers | 200 | 83.33
| 0540 |[Single Element in a Sorted Array](src.save/main/kotlin/g0501_0600/s0540_single_element_in_a_sorted_array/Solution.kt)| Medium | Array, Binary_Search, Binary_Search_II_Day_9 | 274 | 86.67
| 0539 |[Minimum Time Difference](src.save/main/kotlin/g0501_0600/s0539_minimum_time_difference/Solution.kt)| Medium | Array, String, Math, Sorting | 183 | 100.00
| 0538 |[Convert BST to Greater Tree](src.save/main/kotlin/g0501_0600/s0538_convert_bst_to_greater_tree/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 252 | 77.78
| 0537 |[Complex Number Multiplication](src.save/main/kotlin/g0501_0600/s0537_complex_number_multiplication/Solution.kt)| Medium | String, Math, Simulation | 171 | 75.00
| 0535 |[Encode and Decode TinyURL](src.save/main/kotlin/g0501_0600/s0535_encode_and_decode_tinyurl/Codec.kt)| Medium | String, Hash_Table, Design, Hash_Function | 183 | 81.25
| 0532 |[K-diff Pairs in an Array](src.save/main/kotlin/g0501_0600/s0532_k_diff_pairs_in_an_array/Solution.kt)| Medium | Array, Hash_Table, Sorting, Binary_Search, Two_Pointers, Udemy_Arrays | 230 | 84.62
| 0530 |[Minimum Absolute Difference in BST](src.save/main/kotlin/g0501_0600/s0530_minimum_absolute_difference_in_bst/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 209 | 86.96
| 0529 |[Minesweeper](src.save/main/kotlin/g0501_0600/s0529_minesweeper/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix | 243 | 87.50
| 0528 |[Random Pick with Weight](src.save/main/kotlin/g0501_0600/s0528_random_pick_with_weight/Solution.kt)| Medium | Math, Binary_Search, Prefix_Sum, Randomized, Binary_Search_II_Day_13 | 393 | 91.38
| 0526 |[Beautiful Arrangement](src.save/main/kotlin/g0501_0600/s0526_beautiful_arrangement/Solution.kt)| Medium | Array, Dynamic_Programming, Bit_Manipulation, Backtracking, Bitmask | 107 | 100.00
| 0525 |[Contiguous Array](src.save/main/kotlin/g0501_0600/s0525_contiguous_array/Solution.kt)| Medium | Array, Hash_Table, Prefix_Sum | 471 | 100.00
| 0524 |[Longest Word in Dictionary through Deleting](src.save/main/kotlin/g0501_0600/s0524_longest_word_in_dictionary_through_deleting/Solution.kt)| Medium | Array, String, Sorting, Two_Pointers | 307 | 100.00
| 0523 |[Continuous Subarray Sum](src.save/main/kotlin/g0501_0600/s0523_continuous_subarray_sum/Solution.kt)| Medium | Array, Hash_Table, Math, Prefix_Sum | 682 | 95.45
| 0522 |[Longest Uncommon Subsequence II](src.save/main/kotlin/g0501_0600/s0522_longest_uncommon_subsequence_ii/Solution.kt)| Medium | Array, String, Hash_Table, Sorting, Two_Pointers | 163 | 100.00
| 0521 |[Longest Uncommon Subsequence I](src.save/main/kotlin/g0501_0600/s0521_longest_uncommon_subsequence_i/Solution.kt)| Easy | String | 146 | 88.89
| 0520 |[Detect Capital](src.save/main/kotlin/g0501_0600/s0520_detect_capital/Solution.kt)| Easy | String | 161 | 84.54
| 0519 |[Random Flip Matrix](src.save/main/kotlin/g0501_0600/s0519_random_flip_matrix/Solution.kt)| Medium | Hash_Table, Math, Randomized, Reservoir_Sampling | 270 | 100.00
| 0518 |[Coin Change II](src.save/main/kotlin/g0501_0600/s0518_coin_change_2/Solution.kt)| Medium | Array, Dynamic_Programming, Dynamic_Programming_I_Day_20 | 139 | 100.00
| 0517 |[Super Washing Machines](src.save/main/kotlin/g0501_0600/s0517_super_washing_machines/Solution.kt)| Hard | Array, Greedy | 210 | 100.00
| 0516 |[Longest Palindromic Subsequence](src.save/main/kotlin/g0501_0600/s0516_longest_palindromic_subsequence/Solution.kt)| Medium | String, Dynamic_Programming, Dynamic_Programming_I_Day_17 | 243 | 87.50
| 0515 |[Find Largest Value in Each Tree Row](src.save/main/kotlin/g0501_0600/s0515_find_largest_value_in_each_tree_row/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 238 | 73.33
| 0514 |[Freedom Trail](src.save/main/kotlin/g0501_0600/s0514_freedom_trail/Solution.kt)| Hard | String, Dynamic_Programming, Depth_First_Search, Breadth_First_Search | 182 | 100.00
| 0513 |[Find Bottom Left Tree Value](src.save/main/kotlin/g0501_0600/s0513_find_bottom_left_tree_value/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 190 | 88.24
| 0511 |[Game Play Analysis I](src.save/main/kotlin/g0501_0600/s0511_game_play_analysis_i/script.sql)| Easy | LeetCode_Curated_SQL_70, Database, SQL_I_Day_8_Function | 790 | 45.04
| 0509 |[Fibonacci Number](src.save/main/kotlin/g0501_0600/s0509_fibonacci_number/Solution.kt)| Easy | Dynamic_Programming, Math, Recursion, Memoization, Dynamic_Programming_I_Day_1, Level_1_Day_10_Dynamic_Programming, Udemy_Dynamic_Programming | 139 | 82.72
| 0508 |[Most Frequent Subtree Sum](src.save/main/kotlin/g0501_0600/s0508_most_frequent_subtree_sum/Solution.kt)| Medium | Hash_Table, Depth_First_Search, Tree, Binary_Tree | 246 | 80.00
| 0507 |[Perfect Number](src.save/main/kotlin/g0501_0600/s0507_perfect_number/Solution.kt)| Easy | Math | 172 | 81.82
| 0506 |[Relative Ranks](src.save/main/kotlin/g0501_0600/s0506_relative_ranks/Solution.kt)| Easy | Array, Sorting, Heap_Priority_Queue | 244 | 94.23
| 0504 |[Base 7](src.save/main/kotlin/g0501_0600/s0504_base_7/Solution.kt)| Easy | Math | 136 | 100.00
| 0503 |[Next Greater Element II](src.save/main/kotlin/g0501_0600/s0503_next_greater_element_ii/Solution.kt)| Medium | Array, Stack, Monotonic_Stack, Programming_Skills_II_Day_10 | 331 | 92.68
| 0502 |[IPO](src.save/main/kotlin/g0501_0600/s0502_ipo/Solution.kt)| Hard | Array, Sorting, Greedy, Heap_Priority_Queue | 799 | 54.55
| 0501 |[Find Mode in Binary Search Tree](src.save/main/kotlin/g0501_0600/s0501_find_mode_in_binary_search_tree/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 235 | 86.67
| 0500 |[Keyboard Row](src.save/main/kotlin/g0401_0500/s0500_keyboard_row/Solution.kt)| Easy | Array, String, Hash_Table | 170 | 85.19
| 0498 |[Diagonal Traverse](src.save/main/kotlin/g0401_0500/s0498_diagonal_traverse/Solution.kt)| Medium | Array, Matrix, Simulation | 430 | 61.54
| 0497 |[Random Point in Non-overlapping Rectangles](src.save/main/kotlin/g0401_0500/s0497_random_point_in_non_overlapping_rectangles/Solution.kt)| Medium | Math, Binary_Search, Prefix_Sum, Ordered_Set, Randomized, Reservoir_Sampling | 759 | 100.00
| 0496 |[Next Greater Element I](src.save/main/kotlin/g0401_0500/s0496_next_greater_element_i/Solution.kt)| Easy | Array, Hash_Table, Stack, Monotonic_Stack, Programming_Skills_I_Day_5_Function | 171 | 100.00
| 0495 |[Teemo Attacking](src.save/main/kotlin/g0401_0500/s0495_teemo_attacking/Solution.kt)| Easy | Array, Simulation | 283 | 100.00
| 0494 |[Target Sum](src.save/main/kotlin/g0401_0500/s0494_target_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Backtracking | 308 | 89.61
| 0493 |[Reverse Pairs](src.save/main/kotlin/g0401_0500/s0493_reverse_pairs/Solution.kt)| Hard | Array, Binary_Search, Ordered_Set, Divide_and_Conquer, Segment_Tree, Binary_Indexed_Tree, Merge_Sort | 887 | 66.67
| 0492 |[Construct the Rectangle](src.save/main/kotlin/g0401_0500/s0492_construct_the_rectangle/Solution.kt)| Easy | Math | 202 | 88.89
| 0491 |[Non-decreasing Subsequences](src.save/main/kotlin/g0401_0500/s0491_increasing_subsequences/Solution.kt)| Medium | Array, Hash_Table, Bit_Manipulation, Backtracking | 499 | 100.00
| 0488 |[Zuma Game](src.save/main/kotlin/g0401_0500/s0488_zuma_game/Solution.kt)| Hard | String, Dynamic_Programming, Breadth_First_Search, Memoization | 1727 | 100.00
| 0486 |[Predict the Winner](src.save/main/kotlin/g0401_0500/s0486_predict_the_winner/Solution.kt)| Medium | Array, Dynamic_Programming, Math, Recursion, Game_Theory | 158 | 84.62
| 0485 |[Max Consecutive Ones](src.save/main/kotlin/g0401_0500/s0485_max_consecutive_ones/Solution.kt)| Easy | Array | 272 | 88.46
| 0483 |[Smallest Good Base](src.save/main/kotlin/g0401_0500/s0483_smallest_good_base/Solution.kt)| Hard | Math, Binary_Search | 164 | 100.00
| 0482 |[License Key Formatting](src.save/main/kotlin/g0401_0500/s0482_license_key_formatting/Solution.kt)| Easy | String | 234 | 87.18
| 0481 |[Magical String](src.save/main/kotlin/g0401_0500/s0481_magical_string/Solution.kt)| Medium | String, Two_Pointers | 124 | 100.00
| 0480 |[Sliding Window Median](src.save/main/kotlin/g0401_0500/s0480_sliding_window_median/Solution.kt)| Hard | Array, Hash_Table, Heap_Priority_Queue, Sliding_Window | 409 | 100.00
| 0479 |[Largest Palindrome Product](src.save/main/kotlin/g0401_0500/s0479_largest_palindrome_product/Solution.kt)| Hard | Math | 147 | 100.00
| 0478 |[Generate Random Point in a Circle](src.save/main/kotlin/g0401_0500/s0478_generate_random_point_in_a_circle/Solution.kt)| Medium | Math, Geometry, Randomized, Rejection_Sampling | 862 | 100.00
| 0477 |[Total Hamming Distance](src.save/main/kotlin/g0401_0500/s0477_total_hamming_distance/Solution.kt)| Medium | Array, Math, Bit_Manipulation | 298 | 100.00
| 0476 |[Number Complement](src.save/main/kotlin/g0401_0500/s0476_number_complement/Solution.kt)| Easy | Bit_Manipulation | 133 | 100.00
| 0475 |[Heaters](src.save/main/kotlin/g0401_0500/s0475_heaters/Solution.kt)| Medium | Array, Sorting, Binary_Search, Two_Pointers | 356 | 87.50
| 0474 |[Ones and Zeroes](src.save/main/kotlin/g0401_0500/s0474_ones_and_zeroes/Solution.kt)| Medium | Array, String, Dynamic_Programming | 204 | 100.00
| 0473 |[Matchsticks to Square](src.save/main/kotlin/g0401_0500/s0473_matchsticks_to_square/Solution.kt)| Medium | Array, Dynamic_Programming, Bit_Manipulation, Backtracking, Bitmask | 255 | 100.00
| 0472 |[Concatenated Words](src.save/main/kotlin/g0401_0500/s0472_concatenated_words/Solution.kt)| Hard | Array, String, Dynamic_Programming, Depth_First_Search, Trie | 484 | 100.00
| 0470 |[Implement Rand10() Using Rand7()](src.save/main/kotlin/g0401_0500/s0470_implement_rand10_using_rand7/Solution.kt)| Medium | Math, Randomized, Probability_and_Statistics, Rejection_Sampling | 220 | 100.00
| 0468 |[Validate IP Address](src.save/main/kotlin/g0401_0500/s0468_validate_ip_address/Solution.kt)| Medium | String | 192 | 62.50
| 0467 |[Unique Substrings in Wraparound String](src.save/main/kotlin/g0401_0500/s0467_unique_substrings_in_wraparound_string/Solution.kt)| Medium | String, Dynamic_Programming | 197 | 100.00
| 0466 |[Count The Repetitions](src.save/main/kotlin/g0401_0500/s0466_count_the_repetitions/Solution.kt)| Hard | String, Dynamic_Programming | 147 | 100.00
| 0464 |[Can I Win](src.save/main/kotlin/g0401_0500/s0464_can_i_win/Solution.kt)| Medium | Dynamic_Programming, Math, Bit_Manipulation, Bitmask, Memoization, Game_Theory | 213 | 100.00
| 0463 |[Island Perimeter](src.save/main/kotlin/g0401_0500/s0463_island_perimeter/Solution.kt)| Easy | Array, Depth_First_Search, Breadth_First_Search, Matrix | 381 | 98.04
| 0462 |[Minimum Moves to Equal Array Elements II](src.save/main/kotlin/g0401_0500/s0462_minimum_moves_to_equal_array_elements_ii/Solution.kt)| Medium | Array, Math, Sorting | 210 | 100.00
| 0461 |[Hamming Distance](src.save/main/kotlin/g0401_0500/s0461_hamming_distance/Solution.kt)| Easy | Bit_Manipulation, Udemy_Bit_Manipulation | 150 | 96.15
| 0460 |[LFU Cache](src.save/main/kotlin/g0401_0500/s0460_lfu_cache/LFUCache.kt)| Hard | Hash_Table, Design, Linked_List, Doubly_Linked_List | 1143 | 100.00
| 0459 |[Repeated Substring Pattern](src.save/main/kotlin/g0401_0500/s0459_repeated_substring_pattern/Solution.kt)| Easy | String, String_Matching, Programming_Skills_II_Day_2 | 201 | 100.00
| 0458 |[Poor Pigs](src.save/main/kotlin/g0401_0500/s0458_poor_pigs/Solution.kt)| Hard | Dynamic_Programming, Math, Combinatorics | 133 | 80.00
| 0457 |[Circular Array Loop](src.save/main/kotlin/g0401_0500/s0457_circular_array_loop/Solution.kt)| Medium | Array, Hash_Table, Two_Pointers | 143 | 100.00
| 0456 |[132 Pattern](src.save/main/kotlin/g0401_0500/s0456_132_pattern/Solution.kt)| Medium | Array, Binary_Search, Stack, Ordered_Set, Monotonic_Stack, Udemy_Arrays | 434 | 100.00
| 0455 |[Assign Cookies](src.save/main/kotlin/g0401_0500/s0455_assign_cookies/Solution.kt)| Easy | Array, Sorting, Greedy | 260 | 96.67
| 0454 |[4Sum II](src.save/main/kotlin/g0401_0500/s0454_4sum_ii/Solution.kt)| Medium | Top_Interview_Questions, Array, Hash_Table | 660 | 85.71
| 0453 |[Minimum Moves to Equal Array Elements](src.save/main/kotlin/g0401_0500/s0453_minimum_moves_to_equal_array_elements/Solution.kt)| Medium | Array, Math | 282 | 100.00
| 0452 |[Minimum Number of Arrows to Burst Balloons](src.save/main/kotlin/g0401_0500/s0452_minimum_number_of_arrows_to_burst_balloons/Solution.kt)| Medium | Array, Sorting, Greedy | 934 | 100.00
| 0451 |[Sort Characters By Frequency](src.save/main/kotlin/g0401_0500/s0451_sort_characters_by_frequency/Solution.kt)| Medium | String, Hash_Table, Sorting, Heap_Priority_Queue, Counting, Bucket_Sort, Data_Structure_II_Day_21_Heap_Priority_Queue | 288 | 81.72
| 0450 |[Delete Node in a BST](src.save/main/kotlin/g0401_0500/s0450_delete_node_in_a_bst/Solution.kt)| Medium | Tree, Binary_Tree, Binary_Search_Tree, Data_Structure_II_Day_16_Tree | 257 | 84.62
| 0449 |[Serialize and Deserialize BST](src.save/main/kotlin/g0401_0500/s0449_serialize_and_deserialize_bst/Codec.kt)| Medium | String, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Design, Binary_Search_Tree | 233 | 100.00
| 0448 |[Find All Numbers Disappeared in an Array](src.save/main/kotlin/g0401_0500/s0448_find_all_numbers_disappeared_in_an_array/Solution.kt)| Easy | Array, Hash_Table, Udemy_Arrays | 394 | 100.00
| 0447 |[Number of Boomerangs](src.save/main/kotlin/g0401_0500/s0447_number_of_boomerangs/Solution.kt)| Medium | Array, Hash_Table, Math | 308 | 100.00
| 0446 |[Arithmetic Slices II - Subsequence](src.save/main/kotlin/g0401_0500/s0446_arithmetic_slices_ii_subsequence/Solution.kt)| Hard | Array, Dynamic_Programming | 312 | 100.00
| 0445 |[Add Two Numbers II](src.save/main/kotlin/g0401_0500/s0445_add_two_numbers_ii/Solution.kt)| Medium | Math, Stack, Linked_List, Programming_Skills_II_Day_15, Udemy_Linked_List | 240 | 82.61
| 0443 |[String Compression](src.save/main/kotlin/g0401_0500/s0443_string_compression/Solution.kt)| Medium | String, Two_Pointers | 198 | 92.68
| 0442 |[Find All Duplicates in an Array](src.save/main/kotlin/g0401_0500/s0442_find_all_duplicates_in_an_array/Solution.kt)| Medium | Array, Hash_Table, Udemy_Arrays | 480 | 73.81
| 0441 |[Arranging Coins](src.save/main/kotlin/g0401_0500/s0441_arranging_coins/Solution.kt)| Easy | Math, Binary_Search, Binary_Search_I_Day_6 | 150 | 84.21
| 0440 |[K-th Smallest in Lexicographical Order](src.save/main/kotlin/g0401_0500/s0440_k_th_smallest_in_lexicographical_order/Solution.kt)| Hard | Trie | 149 | 100.00
| 0438 |[Find All Anagrams in a String](src.save/main/kotlin/g0401_0500/s0438_find_all_anagrams_in_a_string/Solution.kt)| Medium | Top_100_Liked_Questions, String, Hash_Table, Sliding_Window, Algorithm_II_Day_5_Sliding_Window, Programming_Skills_II_Day_12, Level_1_Day_12_Sliding_Window/Two_Pointer | 561 | 54.68
| 0437 |[Path Sum III](src.save/main/kotlin/g0401_0500/s0437_path_sum_iii/Solution.kt)| Medium | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, Level_2_Day_7_Tree | 403 | 54.12
| 0436 |[Find Right Interval](src.save/main/kotlin/g0401_0500/s0436_find_right_interval/Solution.kt)| Medium | Array, Sorting, Binary_Search, Binary_Search_II_Day_11 | 333 | 100.00
| 0435 |[Non-overlapping Intervals](src.save/main/kotlin/g0401_0500/s0435_non_overlapping_intervals/Solution.kt)| Medium | Array, Dynamic_Programming, Sorting, Greedy, Data_Structure_II_Day_4_Array | 1040 | 85.07
| 0434 |[Number of Segments in a String](src.save/main/kotlin/g0401_0500/s0434_number_of_segments_in_a_string/Solution.kt)| Easy | String | 167 | 80.00
| 0433 |[Minimum Genetic Mutation](src.save/main/kotlin/g0401_0500/s0433_minimum_genetic_mutation/Solution.kt)| Medium | String, Hash_Table, Breadth_First_Search, Graph_Theory_I_Day_12_Breadth_First_Search | 204 | 82.08
| 0432 |[All O\`one Data Structure](src.save/main/kotlin/g0401_0500/s0432_all_oone_data_structure/AllOne.kt)| Hard | Hash_Table, Design, Linked_List, Doubly_Linked_List | 1200 | 100.00
| 0430 |[Flatten a Multilevel Doubly Linked List](src.save/main/kotlin/g0401_0500/s0430_flatten_a_multilevel_doubly_linked_list/Solution.kt)| Medium | Depth_First_Search, Linked_List, Doubly_Linked_List | 194 | 97.44
| 0429 |[N-ary Tree Level Order Traversal](src.save/main/kotlin/g0401_0500/s0429_n_ary_tree_level_order_traversal/Solution.kt)| Medium | Breadth_First_Search, Tree, Programming_Skills_II_Day_9 | 248 | 75.86
| 0427 |[Construct Quad Tree](src.save/main/kotlin/g0401_0500/s0427_construct_quad_tree/Solution.kt)| Medium | Array, Tree, Matrix, Divide_and_Conquer | 221 | 94.74
| 0424 |[Longest Repeating Character Replacement](src.save/main/kotlin/g0401_0500/s0424_longest_repeating_character_replacement/Solution.kt)| Medium | String, Hash_Table, Sliding_Window, Level_1_Day_12_Sliding_Window/Two_Pointer | 288 | 84.38
| 0423 |[Reconstruct Original Digits from English](src.save/main/kotlin/g0401_0500/s0423_reconstruct_original_digits_from_english/Solution.kt)| Medium | String, Hash_Table, Math | 349 | 100.00
| 0421 |[Maximum XOR of Two Numbers in an Array](src.save/main/kotlin/g0401_0500/s0421_maximum_xor_of_two_numbers_in_an_array/Solution.kt)| Medium | Array, Hash_Table, Bit_Manipulation, Trie | 710 | 100.00
| 0420 |[Strong Password Checker](src.save/main/kotlin/g0401_0500/s0420_strong_password_checker/Solution.kt)| Hard | String, Greedy, Heap_Priority_Queue | 157 | 80.00
| 0419 |[Battleships in a Board](src.save/main/kotlin/g0401_0500/s0419_battleships_in_a_board/Solution.kt)| Medium | Array, Depth_First_Search, Matrix | 273 | 76.92
| 0417 |[Pacific Atlantic Water Flow](src.save/main/kotlin/g0401_0500/s0417_pacific_atlantic_water_flow/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Graph_Theory_I_Day_4_Matrix_Related_Problems, Level_2_Day_10_Graph/BFS/DFS, Udemy_Graph | 319 | 100.00
| 0416 |[Partition Equal Subset Sum](src.save/main/kotlin/g0401_0500/s0416_partition_equal_subset_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Level_2_Day_13_Dynamic_Programming | 204 | 98.82
| 0415 |[Add Strings](src.save/main/kotlin/g0401_0500/s0415_add_strings/Solution.kt)| Easy | String, Math, Simulation, Data_Structure_II_Day_6_String | 296 | 76.00
| 0414 |[Third Maximum Number](src.save/main/kotlin/g0401_0500/s0414_third_maximum_number/Solution.kt)| Easy | Array, Sorting | 317 | 73.00
| 0413 |[Arithmetic Slices](src.save/main/kotlin/g0401_0500/s0413_arithmetic_slices/Solution.kt)| Medium | Array, Dynamic_Programming, Algorithm_II_Day_14_Dynamic_Programming, Dynamic_Programming_I_Day_10 | 156 | 100.00
| 0412 |[Fizz Buzz](src.save/main/kotlin/g0401_0500/s0412_fizz_buzz/Solution.kt)| Easy | Top_Interview_Questions, String, Math, Simulation, Udemy_Integers | 307 | 71.81
| 0410 |[Split Array Largest Sum](src.save/main/kotlin/g0401_0500/s0410_split_array_largest_sum/Solution.kt)| Hard | Array, Dynamic_Programming, Greedy, Binary_Search | 165 | 100.00
| 0409 |[Longest Palindrome](src.save/main/kotlin/g0401_0500/s0409_longest_palindrome/Solution.kt)| Easy | String, Hash_Table, Greedy, Data_Structure_II_Day_6_String, Level_1_Day_5_Greedy | 259 | 60.71
| 0407 |[Trapping Rain Water II](src.save/main/kotlin/g0401_0500/s0407_trapping_rain_water_ii/Solution.kt)| Hard | Array, Breadth_First_Search, Matrix, Heap_Priority_Queue | 500 | 100.00
| 0406 |[Queue Reconstruction by Height](src.save/main/kotlin/g0401_0500/s0406_queue_reconstruction_by_height/Solution.kt)| Medium | Array, Sorting, Greedy, Segment_Tree, Binary_Indexed_Tree | 306 | 100.00
| 0405 |[Convert a Number to Hexadecimal](src.save/main/kotlin/g0401_0500/s0405_convert_a_number_to_hexadecimal/Solution.kt)| Easy | Math, Bit_Manipulation | 132 | 100.00
| 0404 |[Sum of Left Leaves](src.save/main/kotlin/g0401_0500/s0404_sum_of_left_leaves/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Programming_Skills_I_Day_10_Linked_List_and_Tree | 173 | 86.05
| 0403 |[Frog Jump](src.save/main/kotlin/g0401_0500/s0403_frog_jump/Solution.kt)| Hard | Array, Dynamic_Programming | 240 | 100.00
| 0402 |[Remove K Digits](src.save/main/kotlin/g0401_0500/s0402_remove_k_digits/Solution.kt)| Medium | String, Greedy, Stack, Monotonic_Stack | 375 | 75.00
| 0401 |[Binary Watch](src.save/main/kotlin/g0401_0500/s0401_binary_watch/Solution.kt)| Easy | Bit_Manipulation, Backtracking | 266 | 71.43
| 0400 |[Nth Digit](src.save/main/kotlin/g0301_0400/s0400_nth_digit/Solution.kt)| Medium | Math, Binary_Search | 271 | 50.00
| 0399 |[Evaluate Division](src.save/main/kotlin/g0301_0400/s0399_evaluate_division/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Graph, Union_Find, Shortest_Path | 183 | 91.49
| 0398 |[Random Pick Index](src.save/main/kotlin/g0301_0400/s0398_random_pick_index/Solution.kt)| Medium | Hash_Table, Math, Randomized, Reservoir_Sampling | 1091 | 75.00
| 0397 |[Integer Replacement](src.save/main/kotlin/g0301_0400/s0397_integer_replacement/Solution.kt)| Medium | Dynamic_Programming, Greedy, Bit_Manipulation, Memoization | 145 | 87.50
| 0396 |[Rotate Function](src.save/main/kotlin/g0301_0400/s0396_rotate_function/Solution.kt)| Medium | Array, Dynamic_Programming, Math | 571 | 87.50
| 0395 |[Longest Substring with At Least K Repeating Characters](src.save/main/kotlin/g0301_0400/s0395_longest_substring_with_at_least_k_repeating_characters/Solution.kt)| Medium | Top_Interview_Questions, String, Hash_Table, Sliding_Window, Divide_and_Conquer | 274 | 66.67
| 0394 |[Decode String](src.save/main/kotlin/g0301_0400/s0394_decode_string/Solution.kt)| Medium | Top_100_Liked_Questions, String, Stack, Recursion, Level_1_Day_14_Stack, Udemy_Strings | 224 | 64.86
| 0393 |[UTF-8 Validation](src.save/main/kotlin/g0301_0400/s0393_utf_8_validation/Solution.kt)| Medium | Array, Bit_Manipulation | 219 | 100.00
| 0392 |[Is Subsequence](src.save/main/kotlin/g0301_0400/s0392_is_subsequence/Solution.kt)| Easy | String, Dynamic_Programming, Two_Pointers, Dynamic_Programming_I_Day_19, Level_1_Day_2_String, Udemy_Two_Pointers | 156 | 87.74
| 0391 |[Perfect Rectangle](src.save/main/kotlin/g0301_0400/s0391_perfect_rectangle/Solution.kt)| Hard | Array, Line_Sweep | 897 | 100.00
| 0390 |[Elimination Game](src.save/main/kotlin/g0301_0400/s0390_elimination_game/Solution.kt)| Medium | Math, Recursion | 319 | 55.56
| 0389 |[Find the Difference](src.save/main/kotlin/g0301_0400/s0389_find_the_difference/Solution.kt)| Easy | String, Hash_Table, Sorting, Bit_Manipulation, Programming_Skills_I_Day_8_String, Udemy_Bit_Manipulation | 256 | 64.81
| 0388 |[Longest Absolute File Path](src.save/main/kotlin/g0301_0400/s0388_longest_absolute_file_path/Solution.kt)| Medium | String, Depth_First_Search, Stack | 150 | 100.00
| 0387 |[First Unique Character in a String](src.save/main/kotlin/g0301_0400/s0387_first_unique_character_in_a_string/Solution.kt)| Easy | Top_Interview_Questions, String, Hash_Table, Counting, Queue, Data_Structure_I_Day_6_String | 369 | 82.68
| 0386 |[Lexicographical Numbers](src.save/main/kotlin/g0301_0400/s0386_lexicographical_numbers/Solution.kt)| Medium | Depth_First_Search, Trie | 463 | 83.33
| 0385 |[Mini Parser](src.save/main/kotlin/g0301_0400/s0385_mini_parser/Solution.kt)| Medium | String, Depth_First_Search, Stack | 210 | 100.00
| 0384 |[Shuffle an Array](src.save/main/kotlin/g0301_0400/s0384_shuffle_an_array/Solution.kt)| Medium | Top_Interview_Questions, Array, Math, Randomized, Algorithm_II_Day_20_Others | 940 | 72.09
| 0383 |[Ransom Note](src.save/main/kotlin/g0301_0400/s0383_ransom_note/Solution.kt)| Easy | String, Hash_Table, Counting, Data_Structure_I_Day_6_String | 333 | 79.58
| 0382 |[Linked List Random Node](src.save/main/kotlin/g0301_0400/s0382_linked_list_random_node/Solution.kt)| Medium | Math, Linked_List, Randomized, Reservoir_Sampling | 283 | 100.00
| 0381 |[Insert Delete GetRandom O(1) - Duplicates allowed](src.save/main/kotlin/g0301_0400/s0381_insert_delete_getrandom_o1_duplicates_allowed/RandomizedCollection.kt)| Hard | Array, Hash_Table, Math, Design, Randomized | 1313 | 50.00
| 0380 |[Insert Delete GetRandom O(1)](src.save/main/kotlin/g0301_0400/s0380_insert_delete_getrandom_o1/RandomizedSet.kt)| Medium | Top_Interview_Questions, Array, Hash_Table, Math, Design, Randomized, Programming_Skills_II_Day_20 | 1326 | 68.23
| 0378 |[Kth Smallest Element in a Sorted Matrix](src.save/main/kotlin/g0301_0400/s0378_kth_smallest_element_in_a_sorted_matrix/Solution.kt)| Medium | Top_Interview_Questions, Array, Sorting, Binary_Search, Matrix, Heap_Priority_Queue | 522 | 59.78
| 0377 |[Combination Sum IV](src.save/main/kotlin/g0301_0400/s0377_combination_sum_iv/Solution.kt)| Medium | Array, Dynamic_Programming, Dynamic_Programming_I_Day_21 | 217 | 72.41
| 0376 |[Wiggle Subsequence](src.save/main/kotlin/g0301_0400/s0376_wiggle_subsequence/Solution.kt)| Medium | Array, Dynamic_Programming, Greedy, Dynamic_Programming_I_Day_18 | 162 | 88.89
| 0375 |[Guess Number Higher or Lower II](src.save/main/kotlin/g0301_0400/s0375_guess_number_higher_or_lower_ii/Solution.kt)| Medium | Dynamic_Programming, Math, Game_Theory | 235 | 75.00
| 0374 |[Guess Number Higher or Lower](src.save/main/kotlin/g0301_0400/s0374_guess_number_higher_or_lower/Solution.kt)| Easy | Binary_Search, Interactive, Binary_Search_I_Day_1 | 134 | 94.19
| 0373 |[Find K Pairs with Smallest Sums](src.save/main/kotlin/g0301_0400/s0373_find_k_pairs_with_smallest_sums/Solution.kt)| Medium | Array, Heap_Priority_Queue | 1809 | 80.95
| 0372 |[Super Pow](src.save/main/kotlin/g0301_0400/s0372_super_pow/Solution.kt)| Medium | Math, Divide_and_Conquer | 196 | 100.00
| 0371 |[Sum of Two Integers](src.save/main/kotlin/g0301_0400/s0371_sum_of_two_integers/Solution.kt)| Medium | Top_Interview_Questions, Math, Bit_Manipulation, Udemy_Bit_Manipulation | 129 | 95.45
| 0368 |[Largest Divisible Subset](src.save/main/kotlin/g0301_0400/s0368_largest_divisible_subset/Solution.kt)| Medium | Array, Dynamic_Programming, Math, Sorting | 412 | 73.33
| 0367 |[Valid Perfect Square](src.save/main/kotlin/g0301_0400/s0367_valid_perfect_square/Solution.kt)| Easy | Math, Binary_Search, Binary_Search_I_Day_3 | 137 | 94.55
| 0365 |[Water and Jug Problem](src.save/main/kotlin/g0301_0400/s0365_water_and_jug_problem/Solution.kt)| Medium | Math, Depth_First_Search, Breadth_First_Search, Graph_Theory_I_Day_11_Breadth_First_Search | 130 | 100.00
| 0363 |[Max Sum of Rectangle No Larger Than K](src.save/main/kotlin/g0301_0400/s0363_max_sum_of_rectangle_no_larger_than_k/Solution.kt)| Hard | Array, Dynamic_Programming, Binary_Search, Matrix, Ordered_Set | 243 | 100.00
| 0357 |[Count Numbers with Unique Digits](src.save/main/kotlin/g0301_0400/s0357_count_numbers_with_unique_digits/Solution.kt)| Medium | Dynamic_Programming, Math, Backtracking | 104 | 100.00
| 0355 |[Design Twitter](src.save/main/kotlin/g0301_0400/s0355_design_twitter/Twitter.kt)| Medium | Hash_Table, Design, Heap_Priority_Queue, Linked_List | 288 | 68.75
| 0354 |[Russian Doll Envelopes](src.save/main/kotlin/g0301_0400/s0354_russian_doll_envelopes/Solution.kt)| Hard | Array, Dynamic_Programming, Sorting, Binary_Search | 788 | 100.00
| 0352 |[Data Stream as Disjoint Intervals](src.save/main/kotlin/g0301_0400/s0352_data_stream_as_disjoint_intervals/SummaryRanges.kt)| Hard | Binary_Search, Design, Ordered_Set | 905 | 75.00
| 0350 |[Intersection of Two Arrays II](src.save/main/kotlin/g0301_0400/s0350_intersection_of_two_arrays_ii/Solution.kt)| Easy | Top_Interview_Questions, Array, Hash_Table, Sorting, Binary_Search, Two_Pointers, Data_Structure_I_Day_3_Array, Binary_Search_I_Day_10 | 321 | 73.37
| 0349 |[Intersection of Two Arrays](src.save/main/kotlin/g0301_0400/s0349_intersection_of_two_arrays/Solution.kt)| Easy | Array, Hash_Table, Sorting, Binary_Search, Two_Pointers | 346 | 66.99
| 0347 |[Top K Frequent Elements](src.save/main/kotlin/g0301_0400/s0347_top_k_frequent_elements/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Sorting, Heap_Priority_Queue, Counting, Divide_and_Conquer, Quickselect, Bucket_Sort, Data_Structure_II_Day_20_Heap_Priority_Queue | 268 | 99.74
| 0345 |[Reverse Vowels of a String](src.save/main/kotlin/g0301_0400/s0345_reverse_vowels_of_a_string/Solution.kt)| Easy | String, Two_Pointers | 349 | 80.63
| 0344 |[Reverse String](src.save/main/kotlin/g0301_0400/s0344_reverse_string/Solution.kt)| Easy | Top_Interview_Questions, String, Two_Pointers, Recursion, Algorithm_I_Day_4_Two_Pointers, Udemy_Strings | 445 | 69.75
| 0343 |[Integer Break](src.save/main/kotlin/g0301_0400/s0343_integer_break/Solution.kt)| Medium | Dynamic_Programming, Math, Algorithm_II_Day_18_Dynamic_Programming, Dynamic_Programming_I_Day_21 | 218 | 63.89
| 0342 |[Power of Four](src.save/main/kotlin/g0301_0400/s0342_power_of_four/Solution.kt)| Easy | Math, Bit_Manipulation, Recursion | 150 | 92.11
| 0341 |[Flatten Nested List Iterator](src.save/main/kotlin/g0301_0400/s0341_flatten_nested_list_iterator/NestedIterator.kt)| Medium | Top_Interview_Questions, Depth_First_Search, Tree, Stack, Design, Queue, Iterator, Programming_Skills_II_Day_18 | 210 | 100.00
| 0338 |[Counting Bits](src.save/main/kotlin/g0301_0400/s0338_counting_bits/Solution.kt)| Easy | Top_100_Liked_Questions, Dynamic_Programming, Bit_Manipulation, Udemy_Bit_Manipulation | 186 | 99.26
| 0337 |[House Robber III](src.save/main/kotlin/g0301_0400/s0337_house_robber_iii/Solution.kt)| Medium | Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree, Udemy_Tree_Stack_Queue | 282 | 84.62
| 0336 |[Palindrome Pairs](src.save/main/kotlin/g0301_0400/s0336_palindrome_pairs/Solution.kt)| Hard | Array, String, Hash_Table, Trie | 2451 | 67.33
| 0335 |[Self Crossing](src.save/main/kotlin/g0301_0400/s0335_self_crossing/Solution.kt)| Hard | Array, Math, Geometry | 477 | 100.00
| 0334 |[Increasing Triplet Subsequence](src.save/main/kotlin/g0301_0400/s0334_increasing_triplet_subsequence/Solution.kt)| Medium | Top_Interview_Questions, Array, Greedy, Data_Structure_II_Day_5_Array | 672 | 60.61
| 0332 |[Reconstruct Itinerary](src.save/main/kotlin/g0301_0400/s0332_reconstruct_itinerary/Solution.kt)| Hard | Depth_First_Search, Graph, Eulerian_Circuit | 240 | 93.88
| 0331 |[Verify Preorder Serialization of a Binary Tree](src.save/main/kotlin/g0301_0400/s0331_verify_preorder_serialization_of_a_binary_tree/Solution.kt)| Medium | String, Tree, Binary_Tree, Stack | 335 | 70.00
| 0330 |[Patching Array](src.save/main/kotlin/g0301_0400/s0330_patching_array/Solution.kt)| Hard | Array, Greedy | 201 | 100.00
| 0329 |[Longest Increasing Path in a Matrix](src.save/main/kotlin/g0301_0400/s0329_longest_increasing_path_in_a_matrix/Solution.kt)| Hard | Top_Interview_Questions, Dynamic_Programming, Depth_First_Search, Breadth_First_Search, Graph, Memoization, Topological_Sort | 322 | 92.65
| 0328 |[Odd Even Linked List](src.save/main/kotlin/g0301_0400/s0328_odd_even_linked_list/Solution.kt)| Medium | Top_Interview_Questions, Linked_List, Level_2_Day_4_Linked_List, Udemy_Linked_List | 216 | 86.96
| 0327 |[Count of Range Sum](src.save/main/kotlin/g0301_0400/s0327_count_of_range_sum/Solution.kt)| Hard | Array, Binary_Search, Ordered_Set, Divide_and_Conquer, Segment_Tree, Binary_Indexed_Tree, Merge_Sort | 638 | 100.00
| 0326 |[Power of Three](src.save/main/kotlin/g0301_0400/s0326_power_of_three/Solution.kt)| Easy | Top_Interview_Questions, Math, Recursion | 413 | 76.12
| 0324 |[Wiggle Sort II](src.save/main/kotlin/g0301_0400/s0324_wiggle_sort_ii/Solution.kt)| Medium | Top_Interview_Questions, Array, Sorting, Divide_and_Conquer, Quickselect | 545 | 57.14
| 0322 |[Coin Change](src.save/main/kotlin/g0301_0400/s0322_coin_change/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Breadth_First_Search, Algorithm_II_Day_18_Dynamic_Programming, Dynamic_Programming_I_Day_20, Level_2_Day_12_Dynamic_Programming | 332 | 50.68
| 0321 |[Create Maximum Number](src.save/main/kotlin/g0301_0400/s0321_create_maximum_number/Solution.kt)| Hard | Greedy, Stack, Monotonic_Stack | 209 | 100.00
| 0319 |[Bulb Switcher](src.save/main/kotlin/g0301_0400/s0319_bulb_switcher/Solution.kt)| Medium | Math, Brainteaser | 214 | 77.78
| 0318 |[Maximum Product of Word Lengths](src.save/main/kotlin/g0301_0400/s0318_maximum_product_of_word_lengths/Solution.kt)| Medium | Array, String, Bit_Manipulation | 477 | 100.00
| 0316 |[Remove Duplicate Letters](src.save/main/kotlin/g0301_0400/s0316_remove_duplicate_letters/Solution.kt)| Medium | String, Greedy, Stack, Monotonic_Stack | 291 | 81.82
| 0315 |[Count of Smaller Numbers After Self](src.save/main/kotlin/g0301_0400/s0315_count_of_smaller_numbers_after_self/Solution.kt)| Hard | Top_Interview_Questions, Array, Binary_Search, Ordered_Set, Divide_and_Conquer, Segment_Tree, Binary_Indexed_Tree, Merge_Sort | 1282 | 88.46
| 0313 |[Super Ugly Number](src.save/main/kotlin/g0301_0400/s0313_super_ugly_number/Solution.kt)| Medium | Array, Dynamic_Programming, Math | 330 | 100.00
| 0312 |[Burst Balloons](src.save/main/kotlin/g0301_0400/s0312_burst_balloons/Solution.kt)| Hard | Array, Dynamic_Programming | 210 | 100.00
| 0310 |[Minimum Height Trees](src.save/main/kotlin/g0301_0400/s0310_minimum_height_trees/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Topological_Sort | 521 | 97.56
| 0309 |[Best Time to Buy and Sell Stock with Cooldown](src.save/main/kotlin/g0301_0400/s0309_best_time_to_buy_and_sell_stock_with_cooldown/Solution.kt)| Medium | Array, Dynamic_Programming, Dynamic_Programming_I_Day_8 | 272 | 73.33
| 0307 |[Range Sum Query - Mutable](src.save/main/kotlin/g0301_0400/s0307_range_sum_query_mutable/NumArray.kt)| Medium | Array, Design, Segment_Tree, Binary_Indexed_Tree | 1729 | 78.79
| 0306 |[Additive Number](src.save/main/kotlin/g0301_0400/s0306_additive_number/Solution.kt)| Medium | String, Backtracking | 261 | 63.16
| 0304 |[Range Sum Query 2D - Immutable](src.save/main/kotlin/g0301_0400/s0304_range_sum_query_2d_immutable/NumMatrix.kt)| Medium | Array, Matrix, Design, Prefix_Sum, Dynamic_Programming_I_Day_14, Programming_Skills_II_Day_13, Udemy_2D_Arrays/Matrix | 1373 | 85.71
| 0303 |[Range Sum Query - Immutable](src.save/main/kotlin/g0301_0400/s0303_range_sum_query_immutable/NumArray.kt)| Easy | Array, Design, Prefix_Sum, Programming_Skills_I_Day_12_Class_and_Object | 472 | 63.64
| 0301 |[Remove Invalid Parentheses](src.save/main/kotlin/g0301_0400/s0301_remove_invalid_parentheses/Solution.kt)| Hard | String, Breadth_First_Search, Backtracking | 312 | 100.00
| 0300 |[Longest Increasing Subsequence](src.save/main/kotlin/g0201_0300/s0300_longest_increasing_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Binary_Search, Algorithm_II_Day_16_Dynamic_Programming, Binary_Search_II_Day_3, Dynamic_Programming_I_Day_18, Udemy_Dynamic_Programming | 318 | 82.28
| 0299 |[Bulls and Cows](src.save/main/kotlin/g0201_0300/s0299_bulls_and_cows/Solution.kt)| Medium | String, Hash_Table, Counting, Level_1_Day_13_Hashmap | 254 | 84.82
| 0297 |[Serialize and Deserialize Binary Tree](src.save/main/kotlin/g0201_0300/s0297_serialize_and_deserialize_binary_tree/Codec.kt)| Hard | Top_Interview_Questions, String, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Design, Data_Structure_II_Day_18_Tree, Udemy_Tree_Stack_Queue | 475 | 78.85
| 0295 |[Find Median from Data Stream](src.save/main/kotlin/g0201_0300/s0295_find_median_from_data_stream/MedianFinder.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Sorting, Two_Pointers, Design, Heap_Priority_Queue, Data_Stream | 2289 | 33.60
| 0292 |[Nim Game](src.save/main/kotlin/g0201_0300/s0292_nim_game/Solution.kt)| Easy | Math, Game_Theory, Brainteaser | 129 | 94.29
| 0290 |[Word Pattern](src.save/main/kotlin/g0201_0300/s0290_word_pattern/Solution.kt)| Easy | String, Hash_Table, Data_Structure_II_Day_7_String | 177 | 89.55
| 0289 |[Game of Life](src.save/main/kotlin/g0201_0300/s0289_game_of_life/Solution.kt)| Medium | Top_Interview_Questions, Array, Matrix, Simulation | 174 | 96.97
| 0287 |[Find the Duplicate Number](src.save/main/kotlin/g0201_0300/s0287_find_the_duplicate_number/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Two_Pointers, Bit_Manipulation, Binary_Search_II_Day_5 | 656 | 66.21
| 0284 |[Peeking Iterator](src.save/main/kotlin/g0201_0300/s0284_peeking_iterator/PeekingIterator.kt)| Medium | Array, Design, Iterator | 286 | 62.50
| 0283 |[Move Zeroes](src.save/main/kotlin/g0201_0300/s0283_move_zeroes/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Two_Pointers, Algorithm_I_Day_3_Two_Pointers, Programming_Skills_I_Day_6_Array, Udemy_Arrays | 516 | 79.07
| 0282 |[Expression Add Operators](src.save/main/kotlin/g0201_0300/s0282_expression_add_operators/Solution.kt)| Hard | String, Math, Backtracking | 367 | 85.71
| 0279 |[Perfect Squares](src.save/main/kotlin/g0201_0300/s0279_perfect_squares/Solution.kt)| Medium | Top_Interview_Questions, Dynamic_Programming, Math, Breadth_First_Search, Dynamic_Programming_I_Day_21 | 176 | 98.80
| 0278 |[First Bad Version](src.save/main/kotlin/g0201_0300/s0278_first_bad_version/Solution.kt)| Easy | Binary_Search, Interactive, Algorithm_I_Day_1_Binary_Search, Binary_Search_I_Day_5, Level_1_Day_7_Binary_Search | 349 | 76.86
| 0275 |[H-Index II](src.save/main/kotlin/g0201_0300/s0275_h_index_ii/Solution.kt)| Medium | Array, Binary_Search, Binary_Search_II_Day_8 | 398 | 81.82
| 0274 |[H-Index](src.save/main/kotlin/g0201_0300/s0274_h_index/Solution.kt)| Medium | Array, Sorting, Counting_Sort | 291 | 45.45
| 0273 |[Integer to English Words](src.save/main/kotlin/g0201_0300/s0273_integer_to_english_words/Solution.kt)| Hard | String, Math, Recursion, Udemy_Strings | 273 | 82.93
| 0268 |[Missing Number](src.save/main/kotlin/g0201_0300/s0268_missing_number/Solution.kt)| Easy | Top_Interview_Questions, Array, Hash_Table, Math, Sorting, Binary_Search, Bit_Manipulation | 380 | 83.49
| 0264 |[Ugly Number II](src.save/main/kotlin/g0201_0300/s0264_ugly_number_ii/Solution.kt)| Medium | Hash_Table, Dynamic_Programming, Math, Heap_Priority_Queue, Dynamic_Programming_I_Day_11 | 182 | 95.45
| 0263 |[Ugly Number](src.save/main/kotlin/g0201_0300/s0263_ugly_number/Solution.kt)| Easy | Math | 243 | 64.10
| 0262 |[Trips and Users](src.save/main/kotlin/g0201_0300/s0262_trips_and_users/script.sql)| Hard | Database | 577 | 63.97
| 0260 |[Single Number III](src.save/main/kotlin/g0201_0300/s0260_single_number_iii/Solution.kt)| Medium | Array, Bit_Manipulation | 222 | 100.00
| 0258 |[Add Digits](src.save/main/kotlin/g0201_0300/s0258_add_digits/Solution.kt)| Easy | Math, Simulation, Number_Theory | 234 | 71.64
| 0257 |[Binary Tree Paths](src.save/main/kotlin/g0201_0300/s0257_binary_tree_paths/Solution.kt)| Easy | String, Depth_First_Search, Tree, Binary_Tree, Backtracking | 320 | 72.84
| 0242 |[Valid Anagram](src.save/main/kotlin/g0201_0300/s0242_valid_anagram/Solution.kt)| Easy | Top_Interview_Questions, String, Hash_Table, Sorting, Data_Structure_I_Day_6_String, Programming_Skills_I_Day_11_Containers_and_Libraries, Udemy_Strings | 251 | 87.65
| 0241 |[Different Ways to Add Parentheses](src.save/main/kotlin/g0201_0300/s0241_different_ways_to_add_parentheses/Solution.kt)| Medium | String, Dynamic_Programming, Math, Recursion, Memoization | 294 | 73.47
| 0240 |[Search a 2D Matrix II](src.save/main/kotlin/g0201_0300/s0240_search_a_2d_matrix_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Matrix, Divide_and_Conquer, Data_Structure_II_Day_4_Array, Binary_Search_II_Day_8 | 460 | 66.08
| 0239 |[Sliding Window Maximum](src.save/main/kotlin/g0201_0300/s0239_sliding_window_maximum/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Heap_Priority_Queue, Sliding_Window, Queue, Monotonic_Queue, Udemy_Arrays | 1059 | 86.14
| 0238 |[Product of Array Except Self](src.save/main/kotlin/g0201_0300/s0238_product_of_array_except_self/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Prefix_Sum, Data_Structure_II_Day_5_Array, Udemy_Arrays | 669 | 48.96
| 0237 |[Delete Node in a Linked List](src.save/main/kotlin/g0201_0300/s0237_delete_node_in_a_linked_list/Solution.kt)| Easy | Top_Interview_Questions, Linked_List | 183 | 93.00
| 0236 |[Lowest Common Ancestor of a Binary Tree](src.save/main/kotlin/g0201_0300/s0236_lowest_common_ancestor_of_a_binary_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Data_Structure_II_Day_18_Tree, Udemy_Tree_Stack_Queue | 386 | 45.21
| 0235 |[Lowest Common Ancestor of a Binary Search Tree](src.save/main/kotlin/g0201_0300/s0235_lowest_common_ancestor_of_a_binary_search_tree/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree, Data_Structure_I_Day_14_Tree, Level_1_Day_8_Binary_Search_Tree | 404 | 75.59
| 0234 |[Palindrome Linked List](src.save/main/kotlin/g0201_0300/s0234_palindrome_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Stack, Linked_List, Recursion, Level_2_Day_3_Linked_List, Udemy_Linked_List | 641 | 79.53
| 0233 |[Number of Digit One](src.save/main/kotlin/g0201_0300/s0233_number_of_digit_one/Solution.kt)| Hard | Dynamic_Programming, Math, Recursion | 129 | 100.00
| 0232 |[Implement Queue using Stacks](src.save/main/kotlin/g0201_0300/s0232_implement_queue_using_stacks/MyQueue.kt)| Easy | Stack, Design, Queue, Data_Structure_I_Day_9_Stack_Queue, Programming_Skills_I_Day_11_Containers_and_Libraries, Level_2_Day_16_Design | 258 | 70.86
| 0231 |[Power of Two](src.save/main/kotlin/g0201_0300/s0231_power_of_two/Solution.kt)| Easy | Math, Bit_Manipulation, Recursion, Algorithm_I_Day_13_Bit_Manipulation | 161 | 86.81
| 0230 |[Kth Smallest Element in a BST](src.save/main/kotlin/g0201_0300/s0230_kth_smallest_element_in_a_bst/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree, Data_Structure_II_Day_17_Tree, Level_2_Day_9_Binary_Search_Tree | 393 | 33.33
| 0229 |[Majority Element II](src.save/main/kotlin/g0201_0300/s0229_majority_element_ii/Solution.kt)| Medium | Array, Hash_Table, Sorting, Counting | 408 | 71.21
| 0228 |[Summary Ranges](src.save/main/kotlin/g0201_0300/s0228_summary_ranges/Solution.kt)| Easy | Array | 169 | 91.89
| 0227 |[Basic Calculator II](src.save/main/kotlin/g0201_0300/s0227_basic_calculator_ii/Solution.kt)| Medium | Top_Interview_Questions, String, Math, Stack, Level_2_Day_18_Stack | 383 | 62.50
| 0226 |[Invert Binary Tree](src.save/main/kotlin/g0201_0300/s0226_invert_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Data_Structure_I_Day_12_Tree, Level_2_Day_6_Tree, Udemy_Tree_Stack_Queue | 233 | 54.90
| 0225 |[Implement Stack using Queues](src.save/main/kotlin/g0201_0300/s0225_implement_stack_using_queues/MyStack.kt)| Easy | Stack, Design, Queue | 248 | 73.44
| 0224 |[Basic Calculator](src.save/main/kotlin/g0201_0300/s0224_basic_calculator/Solution.kt)| Hard | String, Math, Stack, Recursion | 294 | 93.33
| 0223 |[Rectangle Area](src.save/main/kotlin/g0201_0300/s0223_rectangle_area/Solution.kt)| Medium | Math, Geometry | 291 | 66.67
| 0222 |[Count Complete Tree Nodes](src.save/main/kotlin/g0201_0300/s0222_count_complete_tree_nodes/Solution.kt)| |||
| 0221 |[Maximal Square](src.save/main/kotlin/g0201_0300/s0221_maximal_square/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Matrix, Dynamic_Programming_I_Day_16 | 614 | 44.00
| 0220 |[Contains Duplicate III](src.save/main/kotlin/g0201_0300/s0220_contains_duplicate_iii/Solution.kt)| Medium | Array, Sorting, Sliding_Window, Ordered_Set, Bucket_Sort | 921 | 72.22
| 0219 |[Contains Duplicate II](src.save/main/kotlin/g0201_0300/s0219_contains_duplicate_ii/Solution.kt)| Easy | Array, Hash_Table, Sliding_Window | 813 | 80.46
| 0218 |[The Skyline Problem](src.save/main/kotlin/g0201_0300/s0218_the_skyline_problem/Solution.kt)| Hard | Top_Interview_Questions, Array, Heap_Priority_Queue, Ordered_Set, Divide_and_Conquer, Segment_Tree, Binary_Indexed_Tree, Line_Sweep | 365 | 93.14
| 0217 |[Contains Duplicate](src.save/main/kotlin/g0201_0300/s0217_contains_duplicate/Solution.kt)| Easy | Top_Interview_Questions, Array, Hash_Table, Sorting, Data_Structure_I_Day_1_Array, Programming_Skills_I_Day_11_Containers_and_Libraries, Udemy_Arrays | 719 | 73.49
| 0216 |[Combination Sum III](src.save/main/kotlin/g0201_0300/s0216_combination_sum_iii/Solution.kt)| Medium | Array, Backtracking, Udemy_Backtracking/Recursion | 175 | 90.91
| 0215 |[Kth Largest Element in an Array](src.save/main/kotlin/g0201_0300/s0215_kth_largest_element_in_an_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Quickselect, Data_Structure_II_Day_20_Heap_Priority_Queue | 839 | 34.43
| 0214 |[Shortest Palindrome](src.save/main/kotlin/g0201_0300/s0214_shortest_palindrome/Solution.kt)| Hard | String, Hash_Function, String_Matching, Rolling_Hash | 278 | 100.00
| 0213 |[House Robber II](src.save/main/kotlin/g0201_0300/s0213_house_robber_ii/Solution.kt)| Medium | Array, Dynamic_Programming, Algorithm_II_Day_12_Dynamic_Programming, Dynamic_Programming_I_Day_3, Udemy_Dynamic_Programming | 257 | 59.62
| 0212 |[Word Search II](src.save/main/kotlin/g0201_0300/s0212_word_search_ii/Solution.kt)| Hard | Top_Interview_Questions, Array, String, Matrix, Backtracking, Trie | 268 | 100.00
| 0211 |[Design Add and Search Words Data Structure](src.save/main/kotlin/g0201_0300/s0211_design_add_and_search_words_data_structure/WordDictionary.kt)| Medium | String, Depth_First_Search, Design, Trie | 2256 | 87.04
| 0210 |[Course Schedule II](src.save/main/kotlin/g0201_0300/s0210_course_schedule_ii/Solution.kt)| Medium | Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Graph, Topological_Sort, Level_2_Day_11_Graph/BFS/DFS | 266 | 96.32
| 0209 |[Minimum Size Subarray Sum](src.save/main/kotlin/g0201_0300/s0209_minimum_size_subarray_sum/Solution.kt)| Medium | Array, Binary_Search, Prefix_Sum, Sliding_Window, Algorithm_II_Day_5_Sliding_Window, Binary_Search_II_Day_1 | 315 | 96.73
| 0208 |[Implement Trie (Prefix Tree)](src.save/main/kotlin/g0201_0300/s0208_implement_trie_prefix_tree/Trie.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Design, Trie, Level_2_Day_16_Design, Udemy_Trie_and_Heap | 689 | 61.00
| 0207 |[Course Schedule](src.save/main/kotlin/g0201_0300/s0207_course_schedule/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Graph, Topological_Sort | 416 | 40.10
| 0206 |[Reverse Linked List](src.save/main/kotlin/g0201_0300/s0206_reverse_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion, Data_Structure_I_Day_8_Linked_List, Algorithm_I_Day_10_Recursion_Backtracking, Level_1_Day_3_Linked_List, Udemy_Linked_List | 279 | 45.78
| 0205 |[Isomorphic Strings](src.save/main/kotlin/g0201_0300/s0205_isomorphic_strings/Solution.kt)| Easy | String, Hash_Table, Level_1_Day_2_String | 278 | 79.96
| 0204 |[Count Primes](src.save/main/kotlin/g0201_0300/s0204_count_primes/Solution.kt)| Medium | Top_Interview_Questions, Array, Math, Enumeration, Number_Theory | 360 | 96.61
| 0203 |[Remove Linked List Elements](src.save/main/kotlin/g0201_0300/s0203_remove_linked_list_elements/Solution.kt)| Easy | Linked_List, Recursion, Data_Structure_I_Day_7_Linked_List | 233 | 91.22
| 0202 |[Happy Number](src.save/main/kotlin/g0201_0300/s0202_happy_number/Solution.kt)| Easy | Top_Interview_Questions, Hash_Table, Math, Two_Pointers, Algorithm_II_Day_21_Others, Programming_Skills_I_Day_4_Loop, Level_2_Day_1_Implementation/Simulation | 261 | 45.08
| 0201 |[Bitwise AND of Numbers Range](src.save/main/kotlin/g0201_0300/s0201_bitwise_and_of_numbers_range/Solution.kt)| Medium | Bit_Manipulation, Algorithm_II_Day_19_Bit_Manipulation | 368 | 80.00
| 0200 |[Number of Islands](src.save/main/kotlin/g0101_0200/s0200_number_of_islands/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find, Algorithm_II_Day_6_Breadth_First_Search_Depth_First_Search, Graph_Theory_I_Day_1_Matrix_Related_Problems, Level_1_Day_9_Graph/BFS/DFS, Udemy_Graph | 252 | 95.41
| 0199 |[Binary Tree Right Side View](src.save/main/kotlin/g0101_0200/s0199_binary_tree_right_side_view/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Data_Structure_II_Day_16_Tree, Level_2_Day_15_Tree | 194 | 92.89
| 0198 |[House Robber](src.save/main/kotlin/g0101_0200/s0198_house_robber/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Algorithm_I_Day_12_Dynamic_Programming, Dynamic_Programming_I_Day_3, Level_2_Day_12_Dynamic_Programming, Udemy_Dynamic_Programming | 156 | 92.24
| 0197 |[Rising Temperature](src.save/main/kotlin/g0101_0200/s0197_rising_temperature/script.sql)| Easy | Database, SQL_I_Day_6_Union | 394 | 94.15
| 0196 |[Delete Duplicate Emails](src.save/main/kotlin/g0101_0200/s0196_delete_duplicate_emails/script.sql)| Easy | Database, SQL_I_Day_2_Select_and_Order | 593 | 94.17
| 0195 |[Tenth Line](src.save/main/kotlin/g0101_0200/s0195_tenth_line/script.sh)| Easy | Shell | 36 | 87.50
| 0194 |[Transpose File](src.save/main/kotlin/g0101_0200/s0194_transpose_file/script.sh)| Medium | Shell | 461 | 33.47
| 0193 |[Valid Phone Numbers](src.save/main/kotlin/g0101_0200/s0193_valid_phone_numbers/script.sh)| Easy | Shell | 98 | 88.64
| 0192 |[Word Frequency](src.save/main/kotlin/g0101_0200/s0192_word_frequency/script.sh)| Medium | Shell | 96 | 80.40
| 0191 |[Number of 1 Bits](src.save/main/kotlin/g0101_0200/s0191_number_of_1_bits/Solution.kt)| Easy | Top_Interview_Questions, Bit_Manipulation, Algorithm_I_Day_13_Bit_Manipulation, Programming_Skills_I_Day_2_Operator, Udemy_Bit_Manipulation | 237 | 68.44
| 0190 |[Reverse Bits](src.save/main/kotlin/g0101_0200/s0190_reverse_bits/Solution.kt)| Easy | Top_Interview_Questions, Bit_Manipulation, Divide_and_Conquer, Algorithm_I_Day_14_Bit_Manipulation, Udemy_Bit_Manipulation | 198 | 81.82
| 0189 |[Rotate Array](src.save/main/kotlin/g0101_0200/s0189_rotate_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Two_Pointers, Algorithm_I_Day_2_Two_Pointers, Udemy_Arrays | 483 | 86.95
| 0188 |[Best Time to Buy and Sell Stock IV](src.save/main/kotlin/g0101_0200/s0188_best_time_to_buy_and_sell_stock_iv/Solution.kt)| Hard | Array, Dynamic_Programming | 293 | 68.31
| 0187 |[Repeated DNA Sequences](src.save/main/kotlin/g0101_0200/s0187_repeated_dna_sequences/Solution.kt)| Medium | String, Hash_Table, Bit_Manipulation, Sliding_Window, Hash_Function, Rolling_Hash, Data_Structure_II_Day_9_String, Udemy_Strings | 319 | 79.03
| 0185 |[Department Top Three Salaries](src.save/main/kotlin/g0101_0200/s0185_department_top_three_salaries/script.sql)| Hard | Database | 757 | 87.06
| 0184 |[Department Highest Salary](src.save/main/kotlin/g0101_0200/s0184_department_highest_salary/script.sql)| Medium | Database | 637 | 76.01
| 0183 |[Customers Who Never Order](src.save/main/kotlin/g0101_0200/s0183_customers_who_never_order/script.sql)| Easy | Database, SQL_I_Day_1_Select | 712 | 33.67
| 0182 |[Duplicate Emails](src.save/main/kotlin/g0101_0200/s0182_duplicate_emails/script.sql)| Easy | Database, SQL_I_Day_10_Where | 396 | 68.40
| 0181 |[Employees Earning More Than Their Managers](src.save/main/kotlin/g0101_0200/s0181_employees_earning_more_than_their_managers/script.sql)| Easy | Database | 351 | 94.75
| 0180 |[Consecutive Numbers](src.save/main/kotlin/g0101_0200/s0180_consecutive_numbers/script.sql)| Medium | Database | 695 | 38.05
| 0179 |[Largest Number](src.save/main/kotlin/g0101_0200/s0179_largest_number/Solution.kt)| Medium | Top_Interview_Questions, String, Sorting, Greedy | 187 | 100.00
| 0178 |[Rank Scores](src.save/main/kotlin/g0101_0200/s0178_rank_scores/script.sql)| Medium | Database | 292 | 85.14
| 0177 |[Nth Highest Salary](src.save/main/kotlin/g0101_0200/s0177_nth_highest_salary/script.sql)| Medium | Database | 338 | 86.68
| 0176 |[Second Highest Salary](src.save/main/kotlin/g0101_0200/s0176_second_highest_salary/script.sql)| Medium | Database, SQL_I_Day_4_Union_and_Select | 219 | 92.54
| 0175 |[Combine Two Tables](src.save/main/kotlin/g0101_0200/s0175_combine_two_tables/script.sql)| Easy | Database, SQL_I_Day_5_Union | 473 | 54.97
| 0174 |[Dungeon Game](src.save/main/kotlin/g0101_0200/s0174_dungeon_game/Solution.kt)| Hard | Array, Dynamic_Programming, Matrix | 300 | 66.67
| 0173 |[Binary Search Tree Iterator](src.save/main/kotlin/g0101_0200/s0173_binary_search_tree_iterator/BSTIterator.kt)| Medium | Tree, Binary_Tree, Stack, Design, Binary_Search_Tree, Iterator, Data_Structure_II_Day_17_Tree, Programming_Skills_II_Day_16, Level_2_Day_9_Binary_Search_Tree | 563 | 46.91
| 0172 |[Factorial Trailing Zeroes](src.save/main/kotlin/g0101_0200/s0172_factorial_trailing_zeroes/Solution.kt)| Medium | Top_Interview_Questions, Math, Udemy_Integers | 220 | 67.65
| 0171 |[Excel Sheet Column Number](src.save/main/kotlin/g0101_0200/s0171_excel_sheet_column_number/Solution.kt)| Easy | Top_Interview_Questions, String, Math | 310 | 30.68
| 0169 |[Majority Element](src.save/main/kotlin/g0101_0200/s0169_majority_element/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Sorting, Counting, Divide_and_Conquer, Data_Structure_II_Day_1_Array, Udemy_Famous_Algorithm | 460 | 51.25
| 0168 |[Excel Sheet Column Title](src.save/main/kotlin/g0101_0200/s0168_excel_sheet_column_title/Solution.kt)| Easy | String, Math | 208 | 66.07
| 0167 |[Two Sum II - Input Array Is Sorted](src.save/main/kotlin/g0101_0200/s0167_two_sum_ii_input_array_is_sorted/Solution.kt)| Medium | Array, Binary_Search, Two_Pointers, Algorithm_I_Day_3_Two_Pointers, Binary_Search_I_Day_7 | 403 | 68.74
| 0166 |[Fraction to Recurring Decimal](src.save/main/kotlin/g0101_0200/s0166_fraction_to_recurring_decimal/Solution.kt)| Medium | Top_Interview_Questions, String, Hash_Table, Math | 147 | 90.91
| 0165 |[Compare Version Numbers](src.save/main/kotlin/g0101_0200/s0165_compare_version_numbers/Solution.kt)| Medium | String, Two_Pointers | 144 | 100.00
| 0164 |[Maximum Gap](src.save/main/kotlin/g0101_0200/s0164_maximum_gap/Solution.kt)| Hard | Array, Sorting, Bucket_Sort, Radix_Sort | 991 | 68.00
| 0162 |[Find Peak Element](src.save/main/kotlin/g0101_0200/s0162_find_peak_element/Solution.kt)| Medium | Top_Interview_Questions, Array, Binary_Search, Algorithm_II_Day_2_Binary_Search, Binary_Search_II_Day_12 | 297 | 53.85
| 0160 |[Intersection of Two Linked Lists](src.save/main/kotlin/g0101_0200/s0160_intersection_of_two_linked_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List, Data_Structure_II_Day_11_Linked_List, Udemy_Linked_List | 262 | 83.50
| 0155 |[Min Stack](src.save/main/kotlin/g0101_0200/s0155_min_stack/MinStack.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design, Data_Structure_II_Day_14_Stack_Queue, Programming_Skills_II_Day_18, Level_2_Day_16_Design, Udemy_Design | 331 | 84.88
| 0154 |[Find Minimum in Rotated Sorted Array II](src.save/main/kotlin/g0101_0200/s0154_find_minimum_in_rotated_sorted_array_ii/Solution.kt)| Hard | Array, Binary_Search, Binary_Search_II_Day_13 | 275 | 84.00
| 0153 |[Find Minimum in Rotated Sorted Array](src.save/main/kotlin/g0101_0200/s0153_find_minimum_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Algorithm_II_Day_2_Binary_Search, Binary_Search_I_Day_12, Udemy_Binary_Search | 262 | 60.96
| 0152 |[Maximum Product Subarray](src.save/main/kotlin/g0101_0200/s0152_maximum_product_subarray/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Dynamic_Programming_I_Day_6, Level_2_Day_13_Dynamic_Programming, Udemy_Dynamic_Programming | 253 | 88.42
| 0151 |[Reverse Words in a String](src.save/main/kotlin/g0101_0200/s0151_reverse_words_in_a_string/Solution.kt)| Medium | String, Two_Pointers, Udemy_Strings | 206 | 98.90
| 0150 |[Evaluate Reverse Polish Notation](src.save/main/kotlin/g0101_0200/s0150_evaluate_reverse_polish_notation/Solution.kt)| Medium | Top_Interview_Questions, Array, Math, Stack, Programming_Skills_II_Day_3 | 233 | 88.82
| 0149 |[Max Points on a Line](src.save/main/kotlin/g0101_0200/s0149_max_points_on_a_line/Solution.kt)| Hard | Top_Interview_Questions, Array, Hash_Table, Math, Geometry, Algorithm_II_Day_21_Others | 307 | 83.33
| 0148 |[Sort List](src.save/main/kotlin/g0101_0200/s0148_sort_list/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Sorting, Two_Pointers, Linked_List, Divide_and_Conquer, Merge_Sort, Level_2_Day_4_Linked_List | 820 | 61.70
| 0147 |[Insertion Sort List](src.save/main/kotlin/g0101_0200/s0147_insertion_sort_list/Solution.kt)| Medium | Sorting, Linked_List | 385 | 52.00
| 0146 |[LRU Cache](src.save/main/kotlin/g0101_0200/s0146_lru_cache/LRUCache.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Design, Linked_List, Doubly_Linked_List, Udemy_Linked_List | 1116 | 97.93
| 0145 |[Binary Tree Postorder Traversal](src.save/main/kotlin/g0101_0200/s0145_binary_tree_postorder_traversal/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Stack, Data_Structure_I_Day_10_Tree, Udemy_Tree_Stack_Queue | 211 | 80.00
| 0144 |[Binary Tree Preorder Traversal](src.save/main/kotlin/g0101_0200/s0144_binary_tree_preorder_traversal/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Stack, Data_Structure_I_Day_10_Tree, Udemy_Tree_Stack_Queue | 277 | 37.90
| 0143 |[Reorder List](src.save/main/kotlin/g0101_0200/s0143_reorder_list/Solution.kt)| Medium | Two_Pointers, Stack, Linked_List, Recursion, Data_Structure_II_Day_13_Linked_List, Programming_Skills_II_Day_14 | 395 | 82.26
| 0142 |[Linked List Cycle II](src.save/main/kotlin/g0101_0200/s0142_linked_list_cycle_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Hash_Table, Two_Pointers, Linked_List, Data_Structure_II_Day_10_Linked_List, Level_1_Day_4_Linked_List, Udemy_Linked_List | 192 | 63.39
| 0141 |[Linked List Cycle](src.save/main/kotlin/g0101_0200/s0141_linked_list_cycle/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List, Data_Structure_I_Day_7_Linked_List, Udemy_Linked_List | 223 | 91.85
| 0140 |[Word Break II](src.save/main/kotlin/g0101_0200/s0140_word_break_ii/Solution.kt)| Hard | Top_Interview_Questions, String, Hash_Table, Dynamic_Programming, Backtracking, Trie, Memoization | 287 | 44.19
| 0139 |[Word Break](src.save/main/kotlin/g0101_0200/s0139_word_break/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Dynamic_Programming, Trie, Memoization, Algorithm_II_Day_15_Dynamic_Programming, Dynamic_Programming_I_Day_9, Udemy_Dynamic_Programming | 197 | 87.17
| 0138 |[Copy List with Random Pointer](src.save/main/kotlin/g0101_0200/s0138_copy_list_with_random_pointer/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Linked_List, Programming_Skills_II_Day_14, Udemy_Linked_List | 274 | 80.58
| 0137 |[Single Number II](src.save/main/kotlin/g0101_0200/s0137_single_number_ii/Solution.kt)| Medium | Array, Bit_Manipulation | 344 | 64.29
| 0136 |[Single Number](src.save/main/kotlin/g0101_0200/s0136_single_number/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation, Data_Structure_II_Day_1_Array, Algorithm_I_Day_14_Bit_Manipulation, Udemy_Integers | 344 | 83.63
| 0135 |[Candy](src.save/main/kotlin/g0101_0200/s0135_candy/Solution.kt)| Hard | Array, Greedy | 466 | 58.33
| 0134 |[Gas Station](src.save/main/kotlin/g0101_0200/s0134_gas_station/Solution.kt)| Medium | Top_Interview_Questions, Array, Greedy | 545 | 70.18
| 0133 |[Clone Graph](src.save/main/kotlin/g0101_0200/s0133_clone_graph/Solution.kt)| Medium | Hash_Table, Depth_First_Search, Breadth_First_Search, Graph, Udemy_Graph | 351 | 60.91
| 0132 |[Palindrome Partitioning II](src.save/main/kotlin/g0101_0200/s0132_palindrome_partitioning_ii/Solution.kt)| Hard | String, Dynamic_Programming | 290 | 100.00
| 0131 |[Palindrome Partitioning](src.save/main/kotlin/g0101_0200/s0131_palindrome_partitioning/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Backtracking | 820 | 87.27
| 0130 |[Surrounded Regions](src.save/main/kotlin/g0101_0200/s0130_surrounded_regions/Solution.kt)| Medium | Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find, Algorithm_II_Day_8_Breadth_First_Search_Depth_First_Search | 355 | 84.42
| 0129 |[Sum Root to Leaf Numbers](src.save/main/kotlin/g0101_0200/s0129_sum_root_to_leaf_numbers/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree | 237 | 52.50
| 0128 |[Longest Consecutive Sequence](src.save/main/kotlin/g0101_0200/s0128_longest_consecutive_sequence/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Union_Find | 460 | 97.77
| 0127 |[Word Ladder](src.save/main/kotlin/g0101_0200/s0127_word_ladder/Solution.kt)| Hard | Top_Interview_Questions, String, Hash_Table, Breadth_First_Search, Graph_Theory_I_Day_12_Breadth_First_Search | 396 | 98.68
| 0126 |[Word Ladder II](src.save/main/kotlin/g0101_0200/s0126_word_ladder_ii/Solution.kt)| Hard | String, Hash_Table, Breadth_First_Search, Backtracking | 418 | 51.45
| 0125 |[Valid Palindrome](src.save/main/kotlin/g0101_0200/s0125_valid_palindrome/Solution.kt)| Easy | Top_Interview_Questions, String, Two_Pointers, Udemy_Two_Pointers | 353 | 52.06
| 0124 |[Binary Tree Maximum Path Sum](src.save/main/kotlin/g0101_0200/s0124_binary_tree_maximum_path_sum/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree, Udemy_Tree_Stack_Queue | 331 | 74.42
| 0123 |[Best Time to Buy and Sell Stock III](src.save/main/kotlin/g0101_0200/s0123_best_time_to_buy_and_sell_stock_iii/Solution.kt)| Hard | Array, Dynamic_Programming | 585 | 95.24
| 0122 |[Best Time to Buy and Sell Stock II](src.save/main/kotlin/g0101_0200/s0122_best_time_to_buy_and_sell_stock_ii/Solution.kt)| Medium | Top_Interview_Questions, Array, Dynamic_Programming, Greedy, Dynamic_Programming_I_Day_7, Udemy_Arrays | 197 | 95.10
| 0121 |[Best Time to Buy and Sell Stock](src.save/main/kotlin/g0101_0200/s0121_best_time_to_buy_and_sell_stock/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Data_Structure_I_Day_3_Array, Dynamic_Programming_I_Day_7, Level_1_Day_5_Greedy, Udemy_Arrays | 609 | 94.06
| 0120 |[Triangle](src.save/main/kotlin/g0101_0200/s0120_triangle/Solution.kt)| Medium | Array, Dynamic_Programming, Algorithm_I_Day_12_Dynamic_Programming, Dynamic_Programming_I_Day_13, Udemy_Dynamic_Programming | 194 | 97.87
| 0119 |[Pascal's Triangle II](src.save/main/kotlin/g0101_0200/s0119_pascals_triangle_ii/Solution.kt)| Easy | Array, Dynamic_Programming, Data_Structure_II_Day_3_Array, Dynamic_Programming_I_Day_12, Udemy_Dynamic_Programming | 157 | 97.27
| 0118 |[Pascal's Triangle](src.save/main/kotlin/g0101_0200/s0118_pascals_triangle/Solution.kt)| Easy | Top_Interview_Questions, Array, Dynamic_Programming, Data_Structure_I_Day_4_Array, Dynamic_Programming_I_Day_12, Udemy_Dynamic_Programming | 277 | 33.22
| 0117 |[Populating Next Right Pointers in Each Node II](src.save/main/kotlin/g0101_0200/s0117_populating_next_right_pointers_in_each_node_ii/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Linked_List, Algorithm_II_Day_7_Breadth_First_Search_Depth_First_Search | 199 | 94.67
| 0116 |[Populating Next Right Pointers in Each Node](src.save/main/kotlin/g0101_0200/s0116_populating_next_right_pointers_in_each_node/Solution.kt)| Medium | Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Linked_List, Algorithm_I_Day_8_Breadth_First_Search_Depth_First_Search | 355 | 69.02
| 0115 |[Distinct Subsequences](src.save/main/kotlin/g0101_0200/s0115_distinct_subsequences/Solution.kt)| Hard | String, Dynamic_Programming | 285 | 88.89
| 0114 |[Flatten Binary Tree to Linked List](src.save/main/kotlin/g0101_0200/s0114_flatten_binary_tree_to_linked_list/Solution.kt)| Medium | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, Stack, Linked_List, Udemy_Linked_List | 191 | 93.10
| 0113 |[Path Sum II](src.save/main/kotlin/g0101_0200/s0113_path_sum_ii/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree, Backtracking, Data_Structure_II_Day_16_Tree | 364 | 78.67
| 0112 |[Path Sum](src.save/main/kotlin/g0101_0200/s0112_path_sum/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Data_Structure_I_Day_12_Tree | 322 | 36.41
| 0111 |[Minimum Depth of Binary Tree](src.save/main/kotlin/g0101_0200/s0111_minimum_depth_of_binary_tree/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Udemy_Tree_Stack_Queue | 525 | 90.51
| 0110 |[Balanced Binary Tree](src.save/main/kotlin/g0101_0200/s0110_balanced_binary_tree/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Programming_Skills_II_Day_2, Level_2_Day_6_Tree, Udemy_Tree_Stack_Queue | 310 | 63.63
| 0109 |[Convert Sorted List to Binary Search Tree](src.save/main/kotlin/g0101_0200/s0109_convert_sorted_list_to_binary_search_tree/Solution.kt)| Medium | Tree, Binary_Tree, Linked_List, Binary_Search_Tree, Divide_and_Conquer | 376 | 59.26
| 0108 |[Convert Sorted Array to Binary Search Tree](src.save/main/kotlin/g0101_0200/s0108_convert_sorted_array_to_binary_search_tree/Solution.kt)| Easy | Top_Interview_Questions, Array, Tree, Binary_Tree, Binary_Search_Tree, Divide_and_Conquer, Data_Structure_II_Day_15_Tree, Level_2_Day_9_Binary_Search_Tree, Udemy_Tree_Stack_Queue | 334 | 35.39
| 0107 |[Binary Tree Level Order Traversal II](src.save/main/kotlin/g0101_0200/s0107_binary_tree_level_order_traversal_ii/Solution.kt)| Medium | Breadth_First_Search, Tree, Binary_Tree | 204 | 98.04
| 0106 |[Construct Binary Tree from Inorder and Postorder Traversal](src.save/main/kotlin/g0101_0200/s0106_construct_binary_tree_from_inorder_and_postorder_traversal/Solution.kt)| Medium | Array, Hash_Table, Tree, Binary_Tree, Divide_and_Conquer | 358 | 61.29
| 0105 |[Construct Binary Tree from Preorder and Inorder Traversal](src.save/main/kotlin/g0101_0200/s0105_construct_binary_tree_from_preorder_and_inorder_traversal/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Tree, Binary_Tree, Divide_and_Conquer, Data_Structure_II_Day_15_Tree | 370 | 58.31
| 0104 |[Maximum Depth of Binary Tree](src.save/main/kotlin/g0101_0200/s0104_maximum_depth_of_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Data_Structure_I_Day_11_Tree, Programming_Skills_I_Day_10_Linked_List_and_Tree, Udemy_Tree_Stack_Queue | 236 | 83.39
| 0103 |[Binary Tree Zigzag Level Order Traversal](src.save/main/kotlin/g0101_0200/s0103_binary_tree_zigzag_level_order_traversal/Solution.kt)| Medium | Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree, Data_Structure_II_Day_15_Tree, Udemy_Tree_Stack_Queue | 316 | 34.25
| 0102 |[Binary Tree Level Order Traversal](src.save/main/kotlin/g0101_0200/s0102_binary_tree_level_order_traversal/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree, Data_Structure_I_Day_11_Tree, Level_1_Day_6_Tree, Udemy_Tree_Stack_Queue | 332 | 67.53
| 0101 |[Symmetric Tree](src.save/main/kotlin/g0101_0200/s0101_symmetric_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Data_Structure_I_Day_11_Tree, Level_2_Day_15_Tree | 190 | 91.36
| 0100 |[Same Tree](src.save/main/kotlin/g0001_0100/s0100_same_tree/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Level_2_Day_15_Tree, Udemy_Tree_Stack_Queue | 208 | 72.24
| 0099 |[Recover Binary Search Tree](src.save/main/kotlin/g0001_0100/s0099_recover_binary_search_tree/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 492 | 39.39
| 0098 |[Validate Binary Search Tree](src.save/main/kotlin/g0001_0100/s0098_validate_binary_search_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree, Data_Structure_I_Day_14_Tree, Level_1_Day_8_Binary_Search_Tree, Udemy_Tree_Stack_Queue | 330 | 41.38
| 0097 |[Interleaving String](src.save/main/kotlin/g0001_0100/s0097_interleaving_string/Solution.kt)| Medium | String, Dynamic_Programming | 240 | 57.50
| 0096 |[Unique Binary Search Trees](src.save/main/kotlin/g0001_0100/s0096_unique_binary_search_trees/Solution.kt)| Medium | Top_100_Liked_Questions, Dynamic_Programming, Math, Tree, Binary_Tree, Binary_Search_Tree, Dynamic_Programming_I_Day_11 | 147 | 88.52
| 0095 |[Unique Binary Search Trees II](src.save/main/kotlin/g0001_0100/s0095_unique_binary_search_trees_ii/Solution.kt)| Medium | Dynamic_Programming, Tree, Binary_Tree, Backtracking, Binary_Search_Tree | 360 | 41.38
| 0094 |[Binary Tree Inorder Traversal](src.save/main/kotlin/g0001_0100/s0094_binary_tree_inorder_traversal/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Stack, Data_Structure_I_Day_10_Tree, Udemy_Tree_Stack_Queue | 269 | 38.80
| 0093 |[Restore IP Addresses](src.save/main/kotlin/g0001_0100/s0093_restore_ip_addresses/Solution.kt)| Medium | String, Backtracking | 304 | 73.33
| 0092 |[Reverse Linked List II](src.save/main/kotlin/g0001_0100/s0092_reverse_linked_list_ii/Solution.kt)| Medium | Linked_List | 191 | 82.35
| 0091 |[Decode Ways](src.save/main/kotlin/g0001_0100/s0091_decode_ways/Solution.kt)| Medium | Top_Interview_Questions, String, Dynamic_Programming, Algorithm_II_Day_15_Dynamic_Programming, Dynamic_Programming_I_Day_10 | 237 | 76.88
| 0090 |[Subsets II](src.save/main/kotlin/g0001_0100/s0090_subsets_ii/Solution.kt)| Medium | Array, Bit_Manipulation, Backtracking, Algorithm_II_Day_9_Recursion_Backtracking | 366 | 58.09
| 0089 |[Gray Code](src.save/main/kotlin/g0001_0100/s0089_gray_code/Solution.kt)| Medium | Math, Bit_Manipulation, Backtracking | 273 | 100.00
| 0088 |[Merge Sorted Array](src.save/main/kotlin/g0001_0100/s0088_merge_sorted_array/Solution.kt)| Easy | Top_Interview_Questions, Array, Sorting, Two_Pointers, Data_Structure_I_Day_2_Array | 311 | 33.40
| 0087 |[Scramble String](src.save/main/kotlin/g0001_0100/s0087_scramble_string/Solution.kt)| Hard | String, Dynamic_Programming | 366 | 85.00
| 0086 |[Partition List](src.save/main/kotlin/g0001_0100/s0086_partition_list/Solution.kt)| Medium | Two_Pointers, Linked_List | 172 | 94.00
| 0085 |[Maximal Rectangle](src.save/main/kotlin/g0001_0100/s0085_maximal_rectangle/Solution.kt)| Hard | Array, Dynamic_Programming, Matrix, Stack, Monotonic_Stack | 463 | 55.17
| 0084 |[Largest Rectangle in Histogram](src.save/main/kotlin/g0001_0100/s0084_largest_rectangle_in_histogram/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Stack, Monotonic_Stack | 525 | 100.00
| 0083 |[Remove Duplicates from Sorted List](src.save/main/kotlin/g0001_0100/s0083_remove_duplicates_from_sorted_list/Solution.kt)| Easy | Linked_List, Data_Structure_I_Day_8_Linked_List | 274 | 77.82
| 0082 |[Remove Duplicates from Sorted List II](src.save/main/kotlin/g0001_0100/s0082_remove_duplicates_from_sorted_list_ii/Solution.kt)| Medium | Two_Pointers, Linked_List, Data_Structure_II_Day_11_Linked_List, Algorithm_II_Day_3_Two_Pointers | 241 | 91.04
| 0081 |[Search in Rotated Sorted Array II](src.save/main/kotlin/g0001_0100/s0081_search_in_rotated_sorted_array_ii/Solution.kt)| Medium | Array, Binary_Search, Binary_Search_II_Day_12 | 352 | 42.31
| 0080 |[Remove Duplicates from Sorted Array II](src.save/main/kotlin/g0001_0100/s0080_remove_duplicates_from_sorted_array_ii/Solution.kt)| Medium | Array, Two_Pointers, Udemy_Arrays | 357 | 44.78
| 0079 |[Word Search](src.save/main/kotlin/g0001_0100/s0079_word_search/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Matrix, Backtracking, Algorithm_II_Day_11_Recursion_Backtracking | 463 | 68.49
| 0078 |[Subsets](src.save/main/kotlin/g0001_0100/s0078_subsets/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation, Backtracking, Algorithm_II_Day_9_Recursion_Backtracking, Udemy_Backtracking/Recursion | 191 | 97.44
| 0077 |[Combinations](src.save/main/kotlin/g0001_0100/s0077_combinations/Solution.kt)| Medium | Backtracking, Algorithm_I_Day_11_Recursion_Backtracking | 244 | 100.00
| 0076 |[Minimum Window Substring](src.save/main/kotlin/g0001_0100/s0076_minimum_window_substring/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window, Level_2_Day_14_Sliding_Window/Two_Pointer | 346 | 85.20
| 0075 |[Sort Colors](src.save/main/kotlin/g0001_0100/s0075_sort_colors/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers, Data_Structure_II_Day_2_Array, Udemy_Arrays | 198 | 85.66
| 0074 |[Search a 2D Matrix](src.save/main/kotlin/g0001_0100/s0074_search_a_2d_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix, Data_Structure_I_Day_5_Array, Algorithm_II_Day_1_Binary_Search, Binary_Search_I_Day_8, Level_2_Day_8_Binary_Search, Udemy_2D_Arrays/Matrix | 290 | 40.17
| 0073 |[Set Matrix Zeroes](src.save/main/kotlin/g0001_0100/s0073_set_matrix_zeroes/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Matrix, Udemy_2D_Arrays/Matrix | 255 | 100.00
| 0072 |[Edit Distance](src.save/main/kotlin/g0001_0100/s0072_edit_distance/Solution.kt)| Hard | Top_100_Liked_Questions, String, Dynamic_Programming, Algorithm_II_Day_18_Dynamic_Programming, Dynamic_Programming_I_Day_19, Udemy_Dynamic_Programming | 320 | 63.53
| 0071 |[Simplify Path](src.save/main/kotlin/g0001_0100/s0071_simplify_path/Solution.kt)| Medium | String, Stack | 318 | 64.44
| 0070 |[Climbing Stairs](src.save/main/kotlin/g0001_0100/s0070_climbing_stairs/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization, Algorithm_I_Day_12_Dynamic_Programming, Dynamic_Programming_I_Day_2, Level_1_Day_10_Dynamic_Programming, Udemy_Dynamic_Programming | 127 | 97.06
| 0069 |[Sqrt(x)](src.save/main/kotlin/g0001_0100/s0069_sqrtx/Solution.kt)| Easy | Top_Interview_Questions, Math, Binary_Search, Binary_Search_I_Day_4 | 153 | 95.75
| 0068 |[Text Justification](src.save/main/kotlin/g0001_0100/s0068_text_justification/Solution.kt)| Hard | Array, String, Simulation | 269 | 50.00
| 0067 |[Add Binary](src.save/main/kotlin/g0001_0100/s0067_add_binary/Solution.kt)| Easy | String, Math, Bit_Manipulation, Simulation, Programming_Skills_II_Day_5 | 327 | 32.67
| 0066 |[Plus One](src.save/main/kotlin/g0001_0100/s0066_plus_one/Solution.kt)| Easy | Top_Interview_Questions, Array, Math, Programming_Skills_II_Day_3, Udemy_Arrays | 303 | 35.18
| 0065 |[Valid Number](src.save/main/kotlin/g0001_0100/s0065_valid_number/Solution.kt)| Hard | String | 310 | 81.82
| 0064 |[Minimum Path Sum](src.save/main/kotlin/g0001_0100/s0064_minimum_path_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Matrix, Dynamic_Programming_I_Day_16, Udemy_Dynamic_Programming | 222 | 95.70
| 0063 |[Unique Paths II](src.save/main/kotlin/g0001_0100/s0063_unique_paths_ii/Solution.kt)| Medium | Array, Dynamic_Programming, Matrix, Dynamic_Programming_I_Day_15 | 187 | 84.62
| 0062 |[Unique Paths](src.save/main/kotlin/g0001_0100/s0062_unique_paths/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Combinatorics, Algorithm_II_Day_13_Dynamic_Programming, Dynamic_Programming_I_Day_15, Level_1_Day_11_Dynamic_Programming | 209 | 49.18
| 0061 |[Rotate List](src.save/main/kotlin/g0001_0100/s0061_rotate_list/Solution.kt)| Medium | Two_Pointers, Linked_List, Programming_Skills_II_Day_16, Udemy_Linked_List | 193 | 92.16
| 0060 |[Permutation Sequence](src.save/main/kotlin/g0001_0100/s0060_permutation_sequence/Solution.kt)| Hard | Math, Recursion | 146 | 100.00
| 0059 |[Spiral Matrix II](src.save/main/kotlin/g0001_0100/s0059_spiral_matrix_ii/Solution.kt)| Medium | Array, Matrix, Simulation, Data_Structure_II_Day_3_Array | 153 | 100.00
| 0058 |[Length of Last Word](src.save/main/kotlin/g0001_0100/s0058_length_of_last_word/Solution.kt)| Easy | String, Programming_Skills_II_Day_6, Udemy_Arrays | 243 | 63.33
| 0057 |[Insert Interval](src.save/main/kotlin/g0001_0100/s0057_insert_interval/Solution.kt)| Medium | Array, Level_2_Day_17_Interval | 257 | 99.52
| 0056 |[Merge Intervals](src.save/main/kotlin/g0001_0100/s0056_merge_intervals/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Data_Structure_II_Day_2_Array, Level_2_Day_17_Interval, Udemy_2D_Arrays/Matrix | 320 | 94.22
| 0055 |[Jump Game](src.save/main/kotlin/g0001_0100/s0055_jump_game/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Greedy, Algorithm_II_Day_12_Dynamic_Programming, Dynamic_Programming_I_Day_4, Udemy_Arrays | 670 | 66.67
| 0054 |[Spiral Matrix](src.save/main/kotlin/g0001_0100/s0054_spiral_matrix/Solution.kt)| Medium | Top_Interview_Questions, Array, Matrix, Simulation, Programming_Skills_II_Day_8, Level_2_Day_1_Implementation/Simulation, Udemy_2D_Arrays/Matrix | 224 | 62.50
| 0053 |[Maximum Subarray](src.save/main/kotlin/g0001_0100/s0053_maximum_subarray/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Divide_and_Conquer, Data_Structure_I_Day_1_Array, Dynamic_Programming_I_Day_5, Udemy_Famous_Algorithm | 662 | 82.48
| 0052 |[N-Queens II](src.save/main/kotlin/g0001_0100/s0052_n_queens_ii/Solution.kt)| Hard | Backtracking | 231 | 80.00
| 0051 |[N-Queens](src.save/main/kotlin/g0001_0100/s0051_n_queens/Solution.kt)| Hard | Top_100_Liked_Questions, Array, Backtracking | 243 | 95.10
| 0050 |[Pow(x, n)](src.save/main/kotlin/g0001_0100/s0050_powx_n/Solution.kt)| Medium | Top_Interview_Questions, Math, Recursion, Udemy_Integers | 264 | 52.98
| 0049 |[Group Anagrams](src.save/main/kotlin/g0001_0100/s0049_group_anagrams/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, String, Hash_Table, Sorting, Data_Structure_II_Day_8_String, Programming_Skills_II_Day_11, Udemy_Strings | 506 | 86.55
| 0048 |[Rotate Image](src.save/main/kotlin/g0001_0100/s0048_rotate_image/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Matrix, Data_Structure_II_Day_3_Array, Programming_Skills_II_Day_7, Udemy_2D_Arrays/Matrix | 287 | 46.50
| 0047 |[Permutations II](src.save/main/kotlin/g0001_0100/s0047_permutations_ii/Solution.kt)| Medium | Array, Backtracking, Algorithm_II_Day_10_Recursion_Backtracking | 406 | 76.36
| 0046 |[Permutations](src.save/main/kotlin/g0001_0100/s0046_permutations/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Backtracking, Algorithm_I_Day_11_Recursion_Backtracking, Level_2_Day_20_Brute_Force/Backtracking, Udemy_Backtracking/Recursion | 186 | 100.00
| 0045 |[Jump Game II](src.save/main/kotlin/g0001_0100/s0045_jump_game_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Greedy, Algorithm_II_Day_13_Dynamic_Programming, Dynamic_Programming_I_Day_4 | 227 | 98.14
| 0044 |[Wildcard Matching](src.save/main/kotlin/g0001_0100/s0044_wildcard_matching/Solution.kt)| Hard | Top_Interview_Questions, String, Dynamic_Programming, Greedy, Recursion, Udemy_Dynamic_Programming | 401 | 86.11
| 0043 |[Multiply Strings](src.save/main/kotlin/g0001_0100/s0043_multiply_strings/Solution.kt)| Medium | String, Math, Simulation, Data_Structure_II_Day_8_String, Programming_Skills_II_Day_4, Level_2_Day_2_String | 390 | 56.25
| 0042 |[Trapping Rain Water](src.save/main/kotlin/g0001_0100/s0042_trapping_rain_water/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Two_Pointers, Stack, Monotonic_Stack, Dynamic_Programming_I_Day_9, Udemy_Two_Pointers | 196 | 100.00
| 0041 |[First Missing Positive](src.save/main/kotlin/g0001_0100/s0041_first_missing_positive/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Udemy_Arrays | 345 | 100.00
| 0040 |[Combination Sum II](src.save/main/kotlin/g0001_0100/s0040_combination_sum_ii/Solution.kt)| Medium | Array, Backtracking, Algorithm_II_Day_10_Recursion_Backtracking | 348 | 80.92
| 0039 |[Combination Sum](src.save/main/kotlin/g0001_0100/s0039_combination_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Backtracking, Algorithm_II_Day_10_Recursion_Backtracking, Level_2_Day_20_Brute_Force/Backtracking, Udemy_Backtracking/Recursion | 317 | 86.85
| 0038 |[Count and Say](src.save/main/kotlin/g0001_0100/s0038_count_and_say/Solution.kt)| Medium | Top_Interview_Questions, String | 317 | 41.11
| 0037 |[Sudoku Solver](src.save/main/kotlin/g0001_0100/s0037_sudoku_solver/Solution.kt)| Hard | Array, Matrix, Backtracking | 294 | 79.69
| 0036 |[Valid Sudoku](src.save/main/kotlin/g0001_0100/s0036_valid_sudoku/Solution.kt)| Medium | Top_Interview_Questions, Array, Hash_Table, Matrix, Data_Structure_I_Day_5_Array | 346 | 65.03
| 0035 |[Search Insert Position](src.save/main/kotlin/g0001_0100/s0035_search_insert_position/Solution.kt)| Easy | Top_100_Liked_Questions, Array, Binary_Search, Algorithm_I_Day_1_Binary_Search, Binary_Search_I_Day_2 | 267 | 50.32
| 0034 |[Find First and Last Position of Element in Sorted Array](src.save/main/kotlin/g0001_0100/s0034_find_first_and_last_position_of_element_in_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Algorithm_II_Day_1_Binary_Search, Binary_Search_I_Day_5 | 228 | 83.38
| 0033 |[Search in Rotated Sorted Array](src.save/main/kotlin/g0001_0100/s0033_search_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Algorithm_II_Day_1_Binary_Search, Binary_Search_I_Day_11, Level_2_Day_8_Binary_Search, Udemy_Binary_Search | 184 | 86.08
| 0032 |[Longest Valid Parentheses](src.save/main/kotlin/g0001_0100/s0032_longest_valid_parentheses/Solution.kt)| Hard | Top_100_Liked_Questions, String, Dynamic_Programming, Stack | 215 | 95.71
| 0031 |[Next Permutation](src.save/main/kotlin/g0001_0100/s0031_next_permutation/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Two_Pointers | 211 | 94.23
| 0030 |[Substring with Concatenation of All Words](src.save/main/kotlin/g0001_0100/s0030_substring_with_concatenation_of_all_words/Solution.kt)| Hard | String, Hash_Table, Sliding_Window | 441 | 85.84
| 0029 |[Divide Two Integers](src.save/main/kotlin/g0001_0100/s0029_divide_two_integers/Solution.kt)| Medium | Top_Interview_Questions, Math, Bit_Manipulation, Udemy_Bit_Manipulation | 281 | 31.67
| 0028 |[Find the Index of the First Occurrence in a String](src.save/main/kotlin/g0001_0100/s0028_implement_strstr/Solution.kt)| Easy | Top_Interview_Questions, String, Two_Pointers, String_Matching, Programming_Skills_II_Day_1 | 257 | 32.35
| 0027 |[Remove Element](src.save/main/kotlin/g0001_0100/s0027_remove_element/Solution.kt)| Easy | Array, Two_Pointers | 293 | 32.19
| 0026 |[Remove Duplicates from Sorted Array](src.save/main/kotlin/g0001_0100/s0026_remove_duplicates_from_sorted_array/Solution.kt)| Easy | Top_Interview_Questions, Array, Two_Pointers, Udemy_Two_Pointers | 361 | 77.19
| 0025 |[Reverse Nodes in k-Group](src.save/main/kotlin/g0001_0100/s0025_reverse_nodes_in_k_group/Solution.kt)| Hard | Top_100_Liked_Questions, Linked_List, Recursion, Data_Structure_II_Day_13_Linked_List, Udemy_Linked_List | 194 | 87.72
| 0024 |[Swap Nodes in Pairs](src.save/main/kotlin/g0001_0100/s0024_swap_nodes_in_pairs/Solution.kt)| Medium | Top_100_Liked_Questions, Linked_List, Recursion, Data_Structure_II_Day_12_Linked_List, Udemy_Linked_List | 149 | 99.39
| 0023 |[Merge k Sorted Lists](src.save/main/kotlin/g0001_0100/s0023_merge_k_sorted_lists/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Heap_Priority_Queue, Linked_List, Divide_and_Conquer, Merge_Sort | 323 | 75.14
| 0022 |[Generate Parentheses](src.save/main/kotlin/g0001_0100/s0022_generate_parentheses/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Backtracking, Algorithm_II_Day_11_Recursion_Backtracking, Udemy_Backtracking/Recursion | 210 | 78.51
| 0021 |[Merge Two Sorted Lists](src.save/main/kotlin/g0001_0100/s0021_merge_two_sorted_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion, Data_Structure_I_Day_7_Linked_List, Algorithm_I_Day_10_Recursion_Backtracking, Level_1_Day_3_Linked_List, Udemy_Linked_List | 176 | 96.25
| 0020 |[Valid Parentheses](src.save/main/kotlin/g0001_0100/s0020_valid_parentheses/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, String, Stack, Data_Structure_I_Day_9_Stack_Queue, Udemy_Strings | 226 | 72.53
| 0019 |[Remove Nth Node From End of List](src.save/main/kotlin/g0001_0100/s0019_remove_nth_node_from_end_of_list/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Linked_List, Algorithm_I_Day_5_Two_Pointers, Level_2_Day_3_Linked_List | 180 | 91.58
| 0018 |[4Sum](src.save/main/kotlin/g0001_0100/s0018_4sum/Solution.kt)| Medium | Array, Sorting, Two_Pointers | 221 | 100.00
| 0017 |[Letter Combinations of a Phone Number](src.save/main/kotlin/g0001_0100/s0017_letter_combinations_of_a_phone_number/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Backtracking, Algorithm_II_Day_11_Recursion_Backtracking, Udemy_Backtracking/Recursion | 262 | 73.59
| 0016 |[3Sum Closest](src.save/main/kotlin/g0001_0100/s0016_3sum_closest/Solution.kt)| Medium | Array, Sorting, Two_Pointers, Level_2_Day_14_Sliding_Window/Two_Pointer | 413 | 95.05
| 0015 |[3Sum](src.save/main/kotlin/g0001_0100/s0015_3sum/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers, Data_Structure_II_Day_1_Array, Algorithm_II_Day_3_Two_Pointers, Udemy_Two_Pointers | 761 | 90.55
| 0014 |[Longest Common Prefix](src.save/main/kotlin/g0001_0100/s0014_longest_common_prefix/Solution.kt)| Easy | Top_Interview_Questions, String, Level_2_Day_2_String, Udemy_Strings | 209 | 88.86
| 0013 |[Roman to Integer](src.save/main/kotlin/g0001_0100/s0013_roman_to_integer/Solution.kt)| Easy | Top_Interview_Questions, String, Hash_Table, Math | 358 | 75.16
| 0012 |[Integer to Roman](src.save/main/kotlin/g0001_0100/s0012_integer_to_roman/Solution.kt)| Medium | String, Hash_Table, Math | 223 | 93.87
| 0011 |[Container With Most Water](src.save/main/kotlin/g0001_0100/s0011_container_with_most_water/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Greedy, Two_Pointers, Algorithm_II_Day_4_Two_Pointers | 474 | 89.18
| 0010 |[Regular Expression Matching](src.save/main/kotlin/g0001_0100/s0010_regular_expression_matching/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Recursion, Udemy_Dynamic_Programming | 292 | 58.58
| 0009 |[Palindrome Number](src.save/main/kotlin/g0001_0100/s0009_palindrome_number/Solution.kt)| Easy | Math, Udemy_Integers | 238 | 96.24
| 0008 |[String to Integer (atoi)](src.save/main/kotlin/g0001_0100/s0008_string_to_integer_atoi/Solution.kt)| Medium | Top_Interview_Questions, String | 196 | 96.46
| 0007 |[Reverse Integer](src.save/main/kotlin/g0001_0100/s0007_reverse_integer/Solution.kt)| Medium | Top_Interview_Questions, Math, Udemy_Integers | 245 | 60.32
| 0006 |[Zigzag Conversion](src.save/main/kotlin/g0001_0100/s0006_zigzag_conversion/Solution.kt)| Medium | String | 366 | 80.62
| 0005 |[Longest Palindromic Substring](src.save/main/kotlin/g0001_0100/s0005_longest_palindromic_substring/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Data_Structure_II_Day_9_String, Algorithm_II_Day_14_Dynamic_Programming, Dynamic_Programming_I_Day_17, Udemy_Strings | 323 | 75.48
| 0004 |[Median of Two Sorted Arrays](src.save/main/kotlin/g0001_0100/s0004_median_of_two_sorted_arrays/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Divide_and_Conquer | 355 | 83.48
| 0003 |[Longest Substring Without Repeating Characters](src.save/main/kotlin/g0001_0100/s0003_longest_substring_without_repeating_characters/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window, Algorithm_I_Day_6_Sliding_Window, Level_2_Day_14_Sliding_Window/Two_Pointer, Udemy_Strings | 258 | 91.09
| 0002 |[Add Two Numbers](src.save/main/kotlin/g0001_0100/s0002_add_two_numbers/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Math, Linked_List, Recursion, Data_Structure_II_Day_10_Linked_List, Programming_Skills_II_Day_15 | 417 | 50.44
| 0001 |[Two Sum](src.save/main/kotlin/g0001_0100/s0001_two_sum/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Data_Structure_I_Day_2_Array, Level_1_Day_13_Hashmap, Udemy_Arrays | 234 | 92.75

## Contributing
Your ideas/fixes/algorithms are more than welcome!

1. Fork this repo
2. Clone your forked repo (`git clone https://github.com/YOUR_GITHUB_USERNAME/LeetCode-in-Kotlin.git`) onto your local machine
3. `cd` into your cloned directory, create your feature branch (`git checkout -b my-awesome-fix`)
4. `git add` your desired changes to this repo
5. Commit your changes (`git commit -m 'Added some awesome features/fixes'`)
6. Push to the branch (`git push origin my-awesome-feature`)
7. Open your forked repo on Github website, create a new Pull Request to this repo!
