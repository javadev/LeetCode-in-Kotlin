# LeetCode-in-Kotlin

[![Maven Central](https://img.shields.io/maven-central/v/com.github.javadev/leetcode-in-kotlin.svg)](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22com.github.javadev%22%20AND%20a%3A%22leetcode-in-kotlin%22)
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
    <version>1.9</version>
  </dependency>
  ...
</dependencies>
```

Gradle:

```groovy
implementation 'com.github.javadev:leetcode-in-kotlin:1.9'
```

> ["For coding interview preparation, LeetCode is one of the best online resource providing a rich library of more than 300 real coding interview questions for you to practice from using one of the 7 supported languages - C, C++, Java, Python, C#, JavaScript, Ruby."](https://www.quora.com/How-effective-is-Leetcode-for-preparing-for-technical-interviews)

##
* [Programming Skills II](#programming-skills-ii)
* [Graph Theory I](#graph-theory-i)
* [SQL I](#sql-i)
* [Level 1](#level-1)
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

### Programming Skills II

#### Day 1

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
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
| 0043 |[Multiply Strings](src.save/main/kotlin/g0001_0100/s0043_multiply_strings/Solution.kt)| Medium | String, Math, Simulation | 390 | 56.25

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0067 |[Add Binary](src.save/main/kotlin/g0001_0100/s0067_add_binary/Solution.kt)| Easy | String, Math, Bit_Manipulation, Simulation | 327 | 32.67

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0739 |[Daily Temperatures](src/main/kotlin/g0701_0800/s0739_daily_temperatures/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Stack, Monotonic_Stack | 936 | 80.54
| 0058 |[Length of Last Word](src.save/main/kotlin/g0001_0100/s0058_length_of_last_word/Solution.kt)| Easy | String | 243 | 63.33

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0048 |[Rotate Image](src.save/main/kotlin/g0001_0100/s0048_rotate_image/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Matrix | 287 | 46.50

#### Day 8

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0054 |[Spiral Matrix](src.save/main/kotlin/g0001_0100/s0054_spiral_matrix/Solution.kt)| Medium | Top_Interview_Questions, Array, Matrix, Simulation | 224 | 62.50

#### Day 9

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0429 |[N-ary Tree Level Order Traversal](src.save/main/kotlin/g0401_0500/s0429_n_ary_tree_level_order_traversal/Solution.kt)| Medium | Breadth_First_Search, Tree | 278 | 75.00

#### Day 10

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0503 |[Next Greater Element II](src.save/main/kotlin/g0501_0600/s0503_next_greater_element_ii/Solution.kt)| Medium | Array, Stack, Monotonic_Stack | 331 | 92.68
| 0556 |[Next Greater Element III](src.save/main/kotlin/g0501_0600/s0556_next_greater_element_iii/Solution.kt)| Medium | String, Math, Two_Pointers | 137 | 80.00

#### Day 11

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0049 |[Group Anagrams](src.save/main/kotlin/g0001_0100/s0049_group_anagrams/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, String, Hash_Table, Sorting | 506 | 86.55

#### Day 12

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0438 |[Find All Anagrams in a String](src.save/main/kotlin/g0401_0500/s0438_find_all_anagrams_in_a_string/Solution.kt)| Medium | Top_100_Liked_Questions, String, Hash_Table, Sliding_Window | 561 | 54.68

#### Day 13

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0304 |[Range Sum Query 2D - Immutable](src.save/main/kotlin/g0301_0400/s0304_range_sum_query_2d_immutable/NumMatrix.kt)| Medium | Array, Matrix, Design, Prefix_Sum | 1373 | 85.71

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

#### Day 18

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0155 |[Min Stack](src.save/main/kotlin/g0101_0200/s0155_min_stack/MinStack.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design | 331 | 84.88
| 0341 |[Flatten Nested List Iterator](src.save/main/kotlin/g0301_0400/s0341_flatten_nested_list_iterator/NestedIterator.kt)| Medium | Top_Interview_Questions, Depth_First_Search, Tree, Stack, Design, Queue, Iterator | 210 | 100.00

#### Day 19

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 20

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0380 |[Insert Delete GetRandom O(1)](src.save/main/kotlin/g0301_0400/s0380_insert_delete_getrandom_o1/RandomizedSet.kt)| Medium | Top_Interview_Questions, Array, Hash_Table, Math, Design, Randomized | 1326 | 68.23
| 0622 |[Design Circular Queue](src/main/kotlin/g0601_0700/s0622_design_circular_queue/MyCircularQueue.kt)| Medium | Array, Design, Linked_List, Queue | 234 | 92.68

### Graph Theory I

#### Day 1 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0200 |[Number of Islands](src.save/main/kotlin/g0101_0200/s0200_number_of_islands/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 252 | 95.41

#### Day 2 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 3 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 4 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0417 |[Pacific Atlantic Water Flow](src.save/main/kotlin/g0401_0500/s0417_pacific_atlantic_water_flow/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix | 319 | 100.00

#### Day 5 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0542 |[01 Matrix](src.save/main/kotlin/g0501_0600/s0542_01_matrix/Solution.kt)| Medium | Array, Dynamic_Programming, Breadth_First_Search, Matrix | 441 | 94.06

#### Day 6 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 7 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 8 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0547 |[Number of Provinces](src.save/main/kotlin/g0501_0600/s0547_number_of_provinces/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 229 | 79.73

#### Day 9 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 10 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 11 Breadth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0365 |[Water and Jug Problem](src.save/main/kotlin/g0301_0400/s0365_water_and_jug_problem/Solution.kt)| Medium | Math, Depth_First_Search, Breadth_First_Search | 130 | 100.00

#### Day 12 Breadth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0433 |[Minimum Genetic Mutation](src.save/main/kotlin/g0401_0500/s0433_minimum_genetic_mutation/Solution.kt)| Medium | String, Hash_Table, Breadth_First_Search | 204 | 82.08
| 0127 |[Word Ladder](src.save/main/kotlin/g0101_0200/s0127_word_ladder/Solution.kt)| Hard | Top_Interview_Questions, String, Hash_Table, Breadth_First_Search | 396 | 98.68

#### Day 13 Graph Theory

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 14 Graph Theory

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

### SQL I

#### Day 1 Select

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0595 |[Big Countries](src.save/main/kotlin/g0501_0600/s0595_big_countries/script.sql)| Easy | Database | 417 | 56.09
| 0584 |[Find Customer Referee](src.save/main/kotlin/g0501_0600/s0584_find_customer_referee/script.sql)| Easy | Database | 779 | 43.48
| 0183 |[Customers Who Never Order](src.save/main/kotlin/g0101_0200/s0183_customers_who_never_order/script.sql)| Easy | Database | 712 | 33.67

#### Day 2 Select and Order

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0627 |[Swap Salary](src/main/kotlin/g0601_0700/s0627_swap_salary/script.sql)| Easy | Database | 400 | 51.04
| 0196 |[Delete Duplicate Emails](src.save/main/kotlin/g0101_0200/s0196_delete_duplicate_emails/script.sql)| Easy | Database | 593 | 94.17

#### Day 3 String Processing Functions

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 4 Union and Select

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0608 |[Tree Node](src/main/kotlin/g0601_0700/s0608_tree_node/script.sql)| Medium | LeetCode_Curated_SQL_70, Database | 794 | 48.38
| 0176 |[Second Highest Salary](src.save/main/kotlin/g0101_0200/s0176_second_highest_salary/script.sql)| Medium | Database | 219 | 92.54

#### Day 5 Union

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0175 |[Combine Two Tables](src.save/main/kotlin/g0101_0200/s0175_combine_two_tables/script.sql)| Easy | Database | 473 | 54.97

#### Day 6 Union

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0197 |[Rising Temperature](src.save/main/kotlin/g0101_0200/s0197_rising_temperature/script.sql)| Easy | Database | 394 | 94.15
| 0607 |[Sales Person](src/main/kotlin/g0601_0700/s0607_sales_person/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 2142 | 44.56

#### Day 7 Function

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 8 Function

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0586 |[Customer Placing the Largest Number of Orders](src.save/main/kotlin/g0501_0600/s0586_customer_placing_the_largest_number_of_orders/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 768 | 44.85
| 0511 |[Game Play Analysis I](src.save/main/kotlin/g0501_0600/s0511_game_play_analysis_i/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 790 | 45.04

#### Day 9 Control of Flow

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 10 Where

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0182 |[Duplicate Emails](src.save/main/kotlin/g0101_0200/s0182_duplicate_emails/script.sql)| Easy | Database | 396 | 68.40

### Level 1

#### Day 1 Prefix Sum

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

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
| 0278 |[First Bad Version](src.save/main/kotlin/g0201_0300/s0278_first_bad_version/Solution.kt)| Easy | Binary_Search, Interactive | 349 | 76.86

#### Day 8 Binary Search Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0098 |[Validate Binary Search Tree](src.save/main/kotlin/g0001_0100/s0098_validate_binary_search_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 330 | 41.38
| 0235 |[Lowest Common Ancestor of a Binary Search Tree](src.save/main/kotlin/g0201_0300/s0235_lowest_common_ancestor_of_a_binary_search_tree/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 404 | 75.59

#### Day 9 Graph/BFS/DFS

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0200 |[Number of Islands](src.save/main/kotlin/g0101_0200/s0200_number_of_islands/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 252 | 95.41

#### Day 10 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0509 |[Fibonacci Number](src.save/main/kotlin/g0501_0600/s0509_fibonacci_number/Solution.kt)| Easy | Dynamic_Programming, Math, Recursion, Memoization | 139 | 82.72
| 0070 |[Climbing Stairs](src.save/main/kotlin/g0001_0100/s0070_climbing_stairs/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization | 127 | 97.06

#### Day 11 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
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
| 0394 |[Decode String](src.save/main/kotlin/g0301_0400/s0394_decode_string/Solution.kt)| Medium | Top_100_Liked_Questions, String, Stack, Recursion | 224 | 64.86

#### Day 15 Heap

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

### Level 2

#### Day 1 Implementation/Simulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0202 |[Happy Number](src.save/main/kotlin/g0201_0300/s0202_happy_number/Solution.kt)| Easy | Top_Interview_Questions, Hash_Table, Math, Two_Pointers | 261 | 45.08
| 0054 |[Spiral Matrix](src.save/main/kotlin/g0001_0100/s0054_spiral_matrix/Solution.kt)| Medium | Top_Interview_Questions, Array, Matrix, Simulation | 224 | 62.50

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
| 0621 |[Task Scheduler](src/main/kotlin/g0601_0700/s0621_task_scheduler/Solution.kt)| Medium | Array, Hash_Table, Sorting, Greedy, Heap_Priority_Queue, Counting | 266 | 98.36

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
| 0994 |[Rotting Oranges](src/main/kotlin/g0901_1000/s0994_rotting_oranges/Solution.kt)| Medium | Array, Breadth_First_Search, Matrix | 308 | 57.93
| 0417 |[Pacific Atlantic Water Flow](src.save/main/kotlin/g0401_0500/s0417_pacific_atlantic_water_flow/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix | 319 | 100.00

#### Day 11 Graph/BFS/DFS

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0210 |[Course Schedule II](src.save/main/kotlin/g0201_0300/s0210_course_schedule_ii/Solution.kt)| Medium | Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Graph, Topological_Sort | 266 | 96.32

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
| 0056 |[Merge Intervals](src.save/main/kotlin/g0001_0100/s0056_merge_intervals/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting | 323 | 99.68

#### Day 18 Stack

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0227 |[Basic Calculator II](src.save/main/kotlin/g0201_0300/s0227_basic_calculator_ii/Solution.kt)| Medium | Top_Interview_Questions, String, Math, Stack | 383 | 62.50

#### Day 19 Union Find

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0547 |[Number of Provinces](src.save/main/kotlin/g0501_0600/s0547_number_of_provinces/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 229 | 79.73

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
| 0605 |[Can Place Flowers](src/main/kotlin/g0601_0700/s0605_can_place_flowers/Solution.kt)| Easy | Array, Greedy | 209 | 85.71
| 0122 |[Best Time to Buy and Sell Stock II](src.save/main/kotlin/g0101_0200/s0122_best_time_to_buy_and_sell_stock_ii/Solution.kt)| Medium | Top_Interview_Questions, Array, Dynamic_Programming, Greedy | 197 | 95.10
| 0080 |[Remove Duplicates from Sorted Array II](src.save/main/kotlin/g0001_0100/s0080_remove_duplicates_from_sorted_array_ii/Solution.kt)| Medium | Array, Two_Pointers | 357 | 44.78
| 0189 |[Rotate Array](src.save/main/kotlin/g0101_0200/s0189_rotate_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Two_Pointers | 483 | 86.95
| 0055 |[Jump Game](src.save/main/kotlin/g0001_0100/s0055_jump_game/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Greedy | 670 | 66.67
| 0075 |[Sort Colors](src.save/main/kotlin/g0001_0100/s0075_sort_colors/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers | 198 | 85.66
| 0066 |[Plus One](src.save/main/kotlin/g0001_0100/s0066_plus_one/Solution.kt)| Easy | Top_Interview_Questions, Array, Math | 303 | 35.18
| 0238 |[Product of Array Except Self](src.save/main/kotlin/g0201_0300/s0238_product_of_array_except_self/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Prefix_Sum | 669 | 48.96
| 0448 |[Find All Numbers Disappeared in an Array](src.save/main/kotlin/g0401_0500/s0448_find_all_numbers_disappeared_in_an_array/Solution.kt)| Easy | Array, Hash_Table | 394 | 100.00
| 0442 |[Find All Duplicates in an Array](src.save/main/kotlin/g0401_0500/s0442_find_all_duplicates_in_an_array/Solution.kt)| Medium | Array, Hash_Table | 480 | 73.81
| 0041 |[First Missing Positive](src.save/main/kotlin/g0001_0100/s0041_first_missing_positive/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table | 345 | 100.00
| 0532 |[K-diff Pairs in an Array](src.save/main/kotlin/g0501_0600/s0532_k_diff_pairs_in_an_array/Solution.kt)| Medium | Array, Hash_Table, Sorting, Binary_Search, Two_Pointers | 230 | 84.62
| 0456 |[132 Pattern](src.save/main/kotlin/g0401_0500/s0456_132_pattern/Solution.kt)| Medium | Array, Binary_Search, Stack, Ordered_Set, Monotonic_Stack | 434 | 100.00
| 0239 |[Sliding Window Maximum](src.save/main/kotlin/g0201_0300/s0239_sliding_window_maximum/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Heap_Priority_Queue, Sliding_Window, Queue, Monotonic_Queue | 1059 | 86.14

#### Udemy Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0392 |[Is Subsequence](src.save/main/kotlin/g0301_0400/s0392_is_subsequence/Solution.kt)| Easy | String, Dynamic_Programming, Two_Pointers | 156 | 87.74
| 0125 |[Valid Palindrome](src.save/main/kotlin/g0101_0200/s0125_valid_palindrome/Solution.kt)| Easy | Top_Interview_Questions, String, Two_Pointers | 353 | 52.06
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

#### Udemy 2D Arrays/Matrix

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0304 |[Range Sum Query 2D - Immutable](src.save/main/kotlin/g0301_0400/s0304_range_sum_query_2d_immutable/NumMatrix.kt)| Medium | Array, Matrix, Design, Prefix_Sum | 1373 | 85.71
| 0074 |[Search a 2D Matrix](src.save/main/kotlin/g0001_0100/s0074_search_a_2d_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix | 290 | 40.17
| 0054 |[Spiral Matrix](src.save/main/kotlin/g0001_0100/s0054_spiral_matrix/Solution.kt)| Medium | Top_Interview_Questions, Array, Matrix, Simulation | 224 | 62.50
| 0048 |[Rotate Image](src.save/main/kotlin/g0001_0100/s0048_rotate_image/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Matrix | 287 | 46.50
| 0073 |[Set Matrix Zeroes](src.save/main/kotlin/g0001_0100/s0073_set_matrix_zeroes/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Matrix | 255 | 100.00
| 0056 |[Merge Intervals](src.save/main/kotlin/g0001_0100/s0056_merge_intervals/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting | 323 | 99.68

#### Udemy Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0114 |[Flatten Binary Tree to Linked List](src.save/main/kotlin/g0101_0200/s0114_flatten_binary_tree_to_linked_list/Solution.kt)| Medium | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, Stack, Linked_List | 191 | 93.10
| 0445 |[Add Two Numbers II](src.save/main/kotlin/g0401_0500/s0445_add_two_numbers_ii/Solution.kt)| Medium | Math, Stack, Linked_List | 240 | 82.61
| 0328 |[Odd Even Linked List](src.save/main/kotlin/g0301_0400/s0328_odd_even_linked_list/Solution.kt)| Medium | Top_Interview_Questions, Linked_List | 216 | 86.96
| 0061 |[Rotate List](src.save/main/kotlin/g0001_0100/s0061_rotate_list/Solution.kt)| Medium | Two_Pointers, Linked_List | 193 | 92.16
| 0024 |[Swap Nodes in Pairs](src.save/main/kotlin/g0001_0100/s0024_swap_nodes_in_pairs/Solution.kt)| Medium | Top_100_Liked_Questions, Linked_List, Recursion | 149 | 99.39
| 0142 |[Linked List Cycle II](src.save/main/kotlin/g0101_0200/s0142_linked_list_cycle_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Hash_Table, Two_Pointers, Linked_List | 192 | 63.39
| 0141 |[Linked List Cycle](src.save/main/kotlin/g0101_0200/s0141_linked_list_cycle/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List | 223 | 91.85
| 0206 |[Reverse Linked List](src.save/main/kotlin/g0201_0300/s0206_reverse_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion | 279 | 45.78
| 0021 |[Merge Two Sorted Lists](src.save/main/kotlin/g0001_0100/s0021_merge_two_sorted_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion | 176 | 96.25
| 0160 |[Intersection of Two Linked Lists](src.save/main/kotlin/g0101_0200/s0160_intersection_of_two_linked_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List | 262 | 83.50
| 0234 |[Palindrome Linked List](src.save/main/kotlin/g0201_0300/s0234_palindrome_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Stack, Linked_List, Recursion | 641 | 79.53
| 0138 |[Copy List with Random Pointer](src.save/main/kotlin/g0101_0200/s0138_copy_list_with_random_pointer/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Linked_List | 274 | 80.58
| 0025 |[Reverse Nodes in k-Group](src.save/main/kotlin/g0001_0100/s0025_reverse_nodes_in_k_group/Solution.kt)| Hard | Top_100_Liked_Questions, Linked_List, Recursion | 194 | 87.72
| 0146 |[LRU Cache](src.save/main/kotlin/g0101_0200/s0146_lru_cache/LRUCache.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Design, Linked_List, Doubly_Linked_List | 1116 | 97.93

#### Udemy Tree Stack Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0144 |[Binary Tree Preorder Traversal](src.save/main/kotlin/g0101_0200/s0144_binary_tree_preorder_traversal/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Stack | 277 | 37.90
| 0094 |[Binary Tree Inorder Traversal](src.save/main/kotlin/g0001_0100/s0094_binary_tree_inorder_traversal/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Stack | 269 | 38.80
| 0145 |[Binary Tree Postorder Traversal](src.save/main/kotlin/g0101_0200/s0145_binary_tree_postorder_traversal/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Stack | 211 | 80.00
| 0102 |[Binary Tree Level Order Traversal](src.save/main/kotlin/g0101_0200/s0102_binary_tree_level_order_traversal/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree | 332 | 67.53
| 0103 |[Binary Tree Zigzag Level Order Traversal](src.save/main/kotlin/g0101_0200/s0103_binary_tree_zigzag_level_order_traversal/Solution.kt)| Medium | Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree | 316 | 34.25
| 0108 |[Convert Sorted Array to Binary Search Tree](src.save/main/kotlin/g0101_0200/s0108_convert_sorted_array_to_binary_search_tree/Solution.kt)| Easy | Top_Interview_Questions, Array, Tree, Binary_Tree, Binary_Search_Tree, Divide_and_Conquer | 334 | 35.39
| 0543 |[Diameter of Binary Tree](src.save/main/kotlin/g0501_0600/s0543_diameter_of_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree | 307 | 43.93
| 0100 |[Same Tree](src.save/main/kotlin/g0001_0100/s0100_same_tree/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 208 | 72.24
| 0226 |[Invert Binary Tree](src.save/main/kotlin/g0201_0300/s0226_invert_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 233 | 54.90
| 0111 |[Minimum Depth of Binary Tree](src.save/main/kotlin/g0101_0200/s0111_minimum_depth_of_binary_tree/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 525 | 90.51
| 0104 |[Maximum Depth of Binary Tree](src.save/main/kotlin/g0101_0200/s0104_maximum_depth_of_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 236 | 83.39
| 0110 |[Balanced Binary Tree](src.save/main/kotlin/g0101_0200/s0110_balanced_binary_tree/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree | 310 | 63.63
| 0297 |[Serialize and Deserialize Binary Tree](src.save/main/kotlin/g0201_0300/s0297_serialize_and_deserialize_binary_tree/Codec.kt)| Hard | Top_Interview_Questions, String, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Design | 475 | 78.85
| 0124 |[Binary Tree Maximum Path Sum](src.save/main/kotlin/g0101_0200/s0124_binary_tree_maximum_path_sum/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree | 331 | 74.42
| 0098 |[Validate Binary Search Tree](src.save/main/kotlin/g0001_0100/s0098_validate_binary_search_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 330 | 41.38
| 0337 |[House Robber III](src.save/main/kotlin/g0301_0400/s0337_house_robber_iii/Solution.kt)| Medium | Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree | 282 | 84.62
| 0236 |[Lowest Common Ancestor of a Binary Tree](src.save/main/kotlin/g0201_0300/s0236_lowest_common_ancestor_of_a_binary_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree | 386 | 45.21

#### Udemy Trie and Heap

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0208 |[Implement Trie (Prefix Tree)](src.save/main/kotlin/g0201_0300/s0208_implement_trie_prefix_tree/Trie.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Design, Trie | 689 | 61.00

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
| 1143 |[Longest Common Subsequence](src/main/kotlin/g1101_1200/s1143_longest_common_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming | 307 | 38.36
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

#### Day 14 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0098 |[Validate Binary Search Tree](src.save/main/kotlin/g0001_0100/s0098_validate_binary_search_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 330 | 41.38
| 0653 |[Two Sum IV - Input is a BST](src/main/kotlin/g0601_0700/s0653_two_sum_iv_input_is_a_bst/Solution.kt)| Easy | Hash_Table, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Two_Pointers, Binary_Search_Tree | 231 | 96.08
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
| 0056 |[Merge Intervals](src.save/main/kotlin/g0001_0100/s0056_merge_intervals/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting | 323 | 99.68

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
| 0763 |[Partition Labels](src/main/kotlin/g0701_0800/s0763_partition_labels/Solution.kt)| Medium | Top_100_Liked_Questions, String, Hash_Table, Greedy, Two_Pointers | 235 | 84.75

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

#### Day 13 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0025 |[Reverse Nodes in k-Group](src.save/main/kotlin/g0001_0100/s0025_reverse_nodes_in_k_group/Solution.kt)| Hard | Top_100_Liked_Questions, Linked_List, Recursion | 194 | 87.72
| 0143 |[Reorder List](src.save/main/kotlin/g0101_0200/s0143_reorder_list/Solution.kt)| Medium | Two_Pointers, Stack, Linked_List, Recursion | 395 | 82.26

#### Day 14 Stack Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0155 |[Min Stack](src.save/main/kotlin/g0101_0200/s0155_min_stack/MinStack.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design | 331 | 84.88

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

#### Day 20 Heap Priority Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0215 |[Kth Largest Element in an Array](src.save/main/kotlin/g0201_0300/s0215_kth_largest_element_in_an_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Quickselect | 839 | 34.43
| 0347 |[Top K Frequent Elements](src.save/main/kotlin/g0301_0400/s0347_top_k_frequent_elements/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Sorting, Heap_Priority_Queue, Counting, Divide_and_Conquer, Quickselect, Bucket_Sort | 268 | 99.74

#### Day 21 Heap Priority Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0451 |[Sort Characters By Frequency](src.save/main/kotlin/g0401_0500/s0451_sort_characters_by_frequency/Solution.kt)| Medium | String, Hash_Table, Sorting, Heap_Priority_Queue, Counting, Bucket_Sort | 288 | 81.72

### Algorithm I

#### Day 1 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0278 |[First Bad Version](src.save/main/kotlin/g0201_0300/s0278_first_bad_version/Solution.kt)| Easy | Binary_Search, Interactive | 349 | 76.86
| 0035 |[Search Insert Position](src.save/main/kotlin/g0001_0100/s0035_search_insert_position/Solution.kt)| Easy | Top_100_Liked_Questions, Array, Binary_Search | 267 | 50.32

#### Day 2 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
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
| 0019 |[Remove Nth Node From End of List](src.save/main/kotlin/g0001_0100/s0019_remove_nth_node_from_end_of_list/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Linked_List | 180 | 91.58

#### Day 6 Sliding Window

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0003 |[Longest Substring Without Repeating Characters](src.save/main/kotlin/g0001_0100/s0003_longest_substring_without_repeating_characters/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window | 258 | 91.09
| 0567 |[Permutation in String](src.save/main/kotlin/g0501_0600/s0567_permutation_in_string/Solution.kt)| Medium | String, Hash_Table, Two_Pointers, Sliding_Window | 169 | 100.00

#### Day 7 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 8 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0617 |[Merge Two Binary Trees](src/main/kotlin/g0601_0700/s0617_merge_two_binary_trees/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 243 | 72.83
| 0116 |[Populating Next Right Pointers in Each Node](src.save/main/kotlin/g0101_0200/s0116_populating_next_right_pointers_in_each_node/Solution.kt)| Medium | Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Linked_List | 355 | 69.02

#### Day 9 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0542 |[01 Matrix](src.save/main/kotlin/g0501_0600/s0542_01_matrix/Solution.kt)| Medium | Array, Dynamic_Programming, Breadth_First_Search, Matrix | 441 | 94.06
| 0994 |[Rotting Oranges](src/main/kotlin/g0901_1000/s0994_rotting_oranges/Solution.kt)| Medium | Array, Breadth_First_Search, Matrix | 308 | 57.93

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
| 0011 |[Container With Most Water](src.save/main/kotlin/g0001_0100/s0011_container_with_most_water/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Greedy, Two_Pointers | 474 | 89.18

#### Day 5 Sliding Window

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0438 |[Find All Anagrams in a String](src.save/main/kotlin/g0401_0500/s0438_find_all_anagrams_in_a_string/Solution.kt)| Medium | Top_100_Liked_Questions, String, Hash_Table, Sliding_Window | 561 | 54.68
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
| 0130 |[Surrounded Regions](src.save/main/kotlin/g0101_0200/s0130_surrounded_regions/Solution.kt)| Medium | Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 355 | 84.42

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
| 0673 |[Number of Longest Increasing Subsequence](src/main/kotlin/g0601_0700/s0673_number_of_longest_increasing_subsequence/Solution.kt)| Medium | Array, Dynamic_Programming, Segment_Tree, Binary_Indexed_Tree | 226 | 91.67

#### Day 17 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1143 |[Longest Common Subsequence](src/main/kotlin/g1101_1200/s1143_longest_common_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming | 307 | 38.36
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
| 0374 |[Guess Number Higher or Lower](src.save/main/kotlin/g0301_0400/s0374_guess_number_higher_or_lower/Solution.kt)| Easy | Binary_Search, Interactive | 134 | 94.19

#### Day 2

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0035 |[Search Insert Position](src.save/main/kotlin/g0001_0100/s0035_search_insert_position/Solution.kt)| Easy | Top_100_Liked_Questions, Array, Binary_Search | 267 | 50.32

#### Day 3

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0367 |[Valid Perfect Square](src.save/main/kotlin/g0301_0400/s0367_valid_perfect_square/Solution.kt)| Easy | Math, Binary_Search | 137 | 94.55

#### Day 4

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0069 |[Sqrt(x)](src.save/main/kotlin/g0001_0100/s0069_sqrtx/Solution.kt)| Easy | Top_Interview_Questions, Math, Binary_Search | 153 | 95.75

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0278 |[First Bad Version](src.save/main/kotlin/g0201_0300/s0278_first_bad_version/Solution.kt)| Easy | Binary_Search, Interactive | 349 | 76.86
| 0034 |[Find First and Last Position of Element in Sorted Array](src.save/main/kotlin/g0001_0100/s0034_find_first_and_last_position_of_element_in_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search | 228 | 83.38

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0441 |[Arranging Coins](src.save/main/kotlin/g0401_0500/s0441_arranging_coins/Solution.kt)| Easy | Math, Binary_Search | 150 | 84.21

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0167 |[Two Sum II - Input Array Is Sorted](src.save/main/kotlin/g0101_0200/s0167_two_sum_ii_input_array_is_sorted/Solution.kt)| Medium | Array, Binary_Search, Two_Pointers | 403 | 68.74

#### Day 8

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0074 |[Search a 2D Matrix](src.save/main/kotlin/g0001_0100/s0074_search_a_2d_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix | 290 | 40.17

#### Day 9

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 10

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0350 |[Intersection of Two Arrays II](src.save/main/kotlin/g0301_0400/s0350_intersection_of_two_arrays_ii/Solution.kt)| Easy | Top_Interview_Questions, Array, Hash_Table, Sorting, Binary_Search, Two_Pointers | 321 | 73.37
| 0633 |[Sum of Square Numbers](src/main/kotlin/g0601_0700/s0633_sum_of_square_numbers/Solution.kt)| Medium | Math, Binary_Search, Two_Pointers | 126 | 100.00

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
| 0611 |[Valid Triangle Number](src/main/kotlin/g0601_0700/s0611_valid_triangle_number/Solution.kt)| Medium | Array, Sorting, Greedy, Binary_Search, Two_Pointers | 203 | 100.00

#### Day 2

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0658 |[Find K Closest Elements](src/main/kotlin/g0601_0700/s0658_find_k_closest_elements/Solution.kt)| Medium | Array, Sorting, Binary_Search, Two_Pointers, Heap_Priority_Queue | 375 | 95.16

#### Day 3

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0300 |[Longest Increasing Subsequence](src.save/main/kotlin/g0201_0300/s0300_longest_increasing_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Binary_Search | 318 | 82.28

#### Day 4

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0287 |[Find the Duplicate Number](src.save/main/kotlin/g0201_0300/s0287_find_the_duplicate_number/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Two_Pointers, Bit_Manipulation | 656 | 66.21

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

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

#### Day 11

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
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

#### Day 15

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 16

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 17

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 18

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 19

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 20

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

### Dynamic Programming I

#### Day 1

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0509 |[Fibonacci Number](src.save/main/kotlin/g0501_0600/s0509_fibonacci_number/Solution.kt)| Easy | Dynamic_Programming, Math, Recursion, Memoization | 139 | 82.72

#### Day 2

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0070 |[Climbing Stairs](src.save/main/kotlin/g0001_0100/s0070_climbing_stairs/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization | 127 | 97.06

#### Day 3

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0198 |[House Robber](src.save/main/kotlin/g0101_0200/s0198_house_robber/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 156 | 92.24
| 0213 |[House Robber II](src.save/main/kotlin/g0201_0300/s0213_house_robber_ii/Solution.kt)| Medium | Array, Dynamic_Programming | 257 | 59.62

#### Day 4

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0055 |[Jump Game](src.save/main/kotlin/g0001_0100/s0055_jump_game/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Greedy | 670 | 66.67
| 0045 |[Jump Game II](src.save/main/kotlin/g0001_0100/s0045_jump_game_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Greedy | 227 | 98.14

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0053 |[Maximum Subarray](src.save/main/kotlin/g0001_0100/s0053_maximum_subarray/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Divide_and_Conquer | 662 | 82.48

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0152 |[Maximum Product Subarray](src.save/main/kotlin/g0101_0200/s0152_maximum_product_subarray/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 253 | 88.42

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0121 |[Best Time to Buy and Sell Stock](src.save/main/kotlin/g0101_0200/s0121_best_time_to_buy_and_sell_stock/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 609 | 94.06
| 0122 |[Best Time to Buy and Sell Stock II](src.save/main/kotlin/g0101_0200/s0122_best_time_to_buy_and_sell_stock_ii/Solution.kt)| Medium | Top_Interview_Questions, Array, Dynamic_Programming, Greedy | 197 | 95.10

#### Day 8

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0309 |[Best Time to Buy and Sell Stock with Cooldown](src.save/main/kotlin/g0301_0400/s0309_best_time_to_buy_and_sell_stock_with_cooldown/Solution.kt)| Medium | Array, Dynamic_Programming | 272 | 73.33

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
| 0120 |[Triangle](src.save/main/kotlin/g0101_0200/s0120_triangle/Solution.kt)| Medium | Array, Dynamic_Programming | 194 | 97.87

#### Day 14

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
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
| 1143 |[Longest Common Subsequence](src/main/kotlin/g1101_1200/s1143_longest_common_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming | 307 | 38.36
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

#### Day 2 Operator

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0191 |[Number of 1 Bits](src.save/main/kotlin/g0101_0200/s0191_number_of_1_bits/Solution.kt)| Easy | Top_Interview_Questions, Bit_Manipulation | 237 | 68.44

#### Day 3 Conditional Statements

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 4 Loop

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0202 |[Happy Number](src.save/main/kotlin/g0201_0300/s0202_happy_number/Solution.kt)| Easy | Top_Interview_Questions, Hash_Table, Math, Two_Pointers | 261 | 45.08

#### Day 5 Function

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0589 |[N-ary Tree Preorder Traversal](src.save/main/kotlin/g0501_0600/s0589_n_ary_tree_preorder_traversal/Solution.kt)| Easy | Depth_First_Search, Tree, Stack | 233 | 84.02
| 0496 |[Next Greater Element I](src.save/main/kotlin/g0401_0500/s0496_next_greater_element_i/Solution.kt)| Easy | Array, Hash_Table, Stack, Monotonic_Stack | 171 | 100.00

#### Day 6 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0283 |[Move Zeroes](src.save/main/kotlin/g0201_0300/s0283_move_zeroes/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Two_Pointers | 516 | 79.07

#### Day 7 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0566 |[Reshape the Matrix](src.save/main/kotlin/g0501_0600/s0566_reshape_the_matrix/Solution.kt)| Easy | Array, Matrix, Simulation | 239 | 99.05

#### Day 8 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0389 |[Find the Difference](src.save/main/kotlin/g0301_0400/s0389_find_the_difference/Solution.kt)| Easy | String, Hash_Table, Sorting, Bit_Manipulation | 256 | 64.81

#### Day 9 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 10 Linked List and Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0104 |[Maximum Depth of Binary Tree](src.save/main/kotlin/g0101_0200/s0104_maximum_depth_of_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 236 | 83.39
| 0404 |[Sum of Left Leaves](src.save/main/kotlin/g0401_0500/s0404_sum_of_left_leaves/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 173 | 86.05

#### Day 11 Containers and Libraries

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0232 |[Implement Queue using Stacks](src.save/main/kotlin/g0201_0300/s0232_implement_queue_using_stacks/MyQueue.kt)| Easy | Stack, Design, Queue | 258 | 70.86
| 0242 |[Valid Anagram](src.save/main/kotlin/g0201_0300/s0242_valid_anagram/Solution.kt)| Easy | Top_Interview_Questions, String, Hash_Table, Sorting | 251 | 87.65
| 0217 |[Contains Duplicate](src.save/main/kotlin/g0201_0300/s0217_contains_duplicate/Solution.kt)| Easy | Top_Interview_Questions, Array, Hash_Table, Sorting | 719 | 73.49

#### Day 12 Class and Object

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0303 |[Range Sum Query - Immutable](src.save/main/kotlin/g0301_0400/s0303_range_sum_query_immutable/NumArray.kt)| Easy | Array, Design, Prefix_Sum | 472 | 63.64

## Algorithms

| #    |      Title     | Difficulty  | Tag         | Time, ms | Time, %
|------|----------------|-------------|-------------|----------|---------
| 1143 |[Longest Common Subsequence](src/main/kotlin/g1101_1200/s1143_longest_common_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming, Algorithm_II_Day_17_Dynamic_Programming, Dynamic_Programming_I_Day_19, Udemy_Dynamic_Programming | 307 | 38.36
| 0994 |[Rotting Oranges](src/main/kotlin/g0901_1000/s0994_rotting_oranges/Solution.kt)| Medium | Array, Breadth_First_Search, Matrix, Algorithm_I_Day_9_Breadth_First_Search_Depth_First_Search, Level_2_Day_10_Graph/BFS/DFS | 308 | 57.93
| 0864 |[Shortest Path to Get All Keys](src/main/kotlin/g0801_0900/s0864_shortest_path_to_get_all_keys/Solution.kt)| Hard | Breadth_First_Search, Bit_Manipulation | 176 | 100.00
| 0763 |[Partition Labels](src/main/kotlin/g0701_0800/s0763_partition_labels/Solution.kt)| Medium | Top_100_Liked_Questions, String, Hash_Table, Greedy, Two_Pointers, Data_Structure_II_Day_7_String | 235 | 84.75
| 0739 |[Daily Temperatures](src/main/kotlin/g0701_0800/s0739_daily_temperatures/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Stack, Monotonic_Stack, Programming_Skills_II_Day_6 | 936 | 80.54
| 0687 |[Longest Univalue Path](src/main/kotlin/g0601_0700/s0687_longest_univalue_path/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree | 303 | 100.00
| 0686 |[Repeated String Match](src/main/kotlin/g0601_0700/s0686_repeated_string_match/Solution.kt)| Medium | String, String_Matching | 164 | 100.00
| 0685 |[Redundant Connection II](src/main/kotlin/g0601_0700/s0685_redundant_connection_ii/Solution.kt)| Hard | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 176 | 100.00
| 0684 |[Redundant Connection](src/main/kotlin/g0601_0700/s0684_redundant_connection/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 181 | 88.24
| 0682 |[Baseball Game](src/main/kotlin/g0601_0700/s0682_baseball_game/Solution.kt)| Easy | Array, Stack, Simulation | 159 | 100.00
| 0680 |[Valid Palindrome II](src/main/kotlin/g0601_0700/s0680_valid_palindrome_ii/Solution.kt)| Easy | String, Greedy, Two_Pointers | 296 | 79.17
| 0679 |[24 Game](src/main/kotlin/g0601_0700/s0679_24_game/Solution.kt)| Hard | Array, Math, Backtracking | 175 | 100.00
| 0678 |[Valid Parenthesis String](src/main/kotlin/g0601_0700/s0678_valid_parenthesis_string/Solution.kt)| Medium | String, Dynamic_Programming, Greedy, Stack | 133 | 100.00
| 0677 |[Map Sum Pairs](src/main/kotlin/g0601_0700/s0677_map_sum_pairs/MapSum.kt)| Medium | String, Hash_Table, Design, Trie | 197 | 80.00
| 0676 |[Implement Magic Dictionary](src/main/kotlin/g0601_0700/s0676_implement_magic_dictionary/MagicDictionary.kt)| Medium | String, Hash_Table, Design, Trie | 256 | 100.00
| 0675 |[Cut Off Trees for Golf Event](src/main/kotlin/g0601_0700/s0675_cut_off_trees_for_golf_event/Solution.kt)| Hard | Array, Breadth_First_Search, Matrix, Heap_Priority_Queue | 777 | 100.00
| 0674 |[Longest Continuous Increasing Subsequence](src/main/kotlin/g0601_0700/s0674_longest_continuous_increasing_subsequence/Solution.kt)| Easy | Array | 201 | 84.21
| 0673 |[Number of Longest Increasing Subsequence](src/main/kotlin/g0601_0700/s0673_number_of_longest_increasing_subsequence/Solution.kt)| Medium | Array, Dynamic_Programming, Segment_Tree, Binary_Indexed_Tree, Algorithm_II_Day_16_Dynamic_Programming | 226 | 91.67
| 0672 |[Bulb Switcher II](src/main/kotlin/g0601_0700/s0672_bulb_switcher_ii/Solution.kt)| Medium | Math, Depth_First_Search, Breadth_First_Search, Bit_Manipulation | 131 | 100.00
| 0671 |[Second Minimum Node In a Binary Tree](src/main/kotlin/g0601_0700/s0671_second_minimum_node_in_a_binary_tree/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree | 128 | 100.00
| 0670 |[Maximum Swap](src/main/kotlin/g0601_0700/s0670_maximum_swap/Solution.kt)| Medium | Math, Greedy | 143 | 100.00
| 0669 |[Trim a Binary Search Tree](src/main/kotlin/g0601_0700/s0669_trim_a_binary_search_tree/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 195 | 100.00
| 0668 |[Kth Smallest Number in Multiplication Table](src/main/kotlin/g0601_0700/s0668_kth_smallest_number_in_multiplication_table/Solution.kt)| Hard | Math, Binary_Search | 151 | 100.00
| 0667 |[Beautiful Arrangement II](src/main/kotlin/g0601_0700/s0667_beautiful_arrangement_ii/Solution.kt)| Medium | Array, Math | 175 | 100.00
| 0665 |[Non-decreasing Array](src/main/kotlin/g0601_0700/s0665_non_decreasing_array/Solution.kt)| Medium | Array | 256 | 85.71
| 0664 |[Strange Printer](src/main/kotlin/g0601_0700/s0664_strange_printer/Solution.kt)| Hard | String, Dynamic_Programming | 196 | 100.00
| 0662 |[Maximum Width of Binary Tree](src/main/kotlin/g0601_0700/s0662_maximum_width_of_binary_tree/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 189 | 75.00
| 0661 |[Image Smoother](src/main/kotlin/g0601_0700/s0661_image_smoother/Solution.kt)| Easy | Array, Matrix | 352 | 100.00
| 0659 |[Split Array into Consecutive Subsequences](src/main/kotlin/g0601_0700/s0659_split_array_into_consecutive_subsequences/Solution.kt)| Medium | Array, Hash_Table, Greedy, Heap_Priority_Queue | 352 | 100.00
| 0658 |[Find K Closest Elements](src/main/kotlin/g0601_0700/s0658_find_k_closest_elements/Solution.kt)| Medium | Array, Sorting, Binary_Search, Two_Pointers, Heap_Priority_Queue, Binary_Search_II_Day_2 | 375 | 95.16
| 0657 |[Robot Return to Origin](src/main/kotlin/g0601_0700/s0657_robot_return_to_origin/Solution.kt)| Easy | String, Simulation | 186 | 100.00
| 0655 |[Print Binary Tree](src/main/kotlin/g0601_0700/s0655_print_binary_tree/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 176 | 100.00
| 0654 |[Maximum Binary Tree](src/main/kotlin/g0601_0700/s0654_maximum_binary_tree/Solution.kt)| Medium | Array, Tree, Binary_Tree, Stack, Monotonic_Stack, Divide_and_Conquer | 271 | 90.00
| 0653 |[Two Sum IV - Input is a BST](src/main/kotlin/g0601_0700/s0653_two_sum_iv_input_is_a_bst/Solution.kt)| Easy | Hash_Table, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Two_Pointers, Binary_Search_Tree, Data_Structure_I_Day_14_Tree | 231 | 96.08
| 0652 |[Find Duplicate Subtrees](src/main/kotlin/g0601_0700/s0652_find_duplicate_subtrees/Solution.kt)| Medium | Hash_Table, Depth_First_Search, Tree, Binary_Tree | 266 | 76.00
| 0650 |[2 Keys Keyboard](src/main/kotlin/g0601_0700/s0650_2_keys_keyboard/Solution.kt)| Medium | Dynamic_Programming, Math | 115 | 100.00
| 0649 |[Dota2 Senate](src/main/kotlin/g0601_0700/s0649_dota2_senate/Solution.kt)| Medium | String, Greedy, Queue | 217 | 100.00
| 0648 |[Replace Words](src/main/kotlin/g0601_0700/s0648_replace_words/Solution.kt)| Medium | Array, String, Hash_Table, Trie | 392 | 100.00
| 0647 |[Palindromic Substrings](src/main/kotlin/g0601_0700/s0647_palindromic_substrings/Solution.kt)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming | 266 | 67.83
| 0646 |[Maximum Length of Pair Chain](src/main/kotlin/g0601_0700/s0646_maximum_length_of_pair_chain/Solution.kt)| Medium | Array, Dynamic_Programming, Sorting, Greedy | 249 | 100.00
| 0645 |[Set Mismatch](src/main/kotlin/g0601_0700/s0645_set_mismatch/Solution.kt)| Easy | Array, Hash_Table, Sorting, Bit_Manipulation | 246 | 88.46
| 0643 |[Maximum Average Subarray I](src/main/kotlin/g0601_0700/s0643_maximum_average_subarray_i/Solution.kt)| Easy | Array, Sliding_Window | 494 | 98.65
| 0641 |[Design Circular Deque](src/main/kotlin/g0601_0700/s0641_design_circular_deque/MyCircularDeque.kt)| Medium | Array, Design, Linked_List, Queue | 232 | 100.00
| 0640 |[Solve the Equation](src/main/kotlin/g0601_0700/s0640_solve_the_equation/Solution.kt)| Medium | String, Math, Simulation | 170 | 66.67
| 0639 |[Decode Ways II](src/main/kotlin/g0601_0700/s0639_decode_ways_ii/Solution.kt)| Hard | String, Dynamic_Programming | 259 | 100.00
| 0638 |[Shopping Offers](src/main/kotlin/g0601_0700/s0638_shopping_offers/Solution.kt)| Medium | Array, Dynamic_Programming, Bit_Manipulation, Backtracking, Bitmask, Memoization | 195 | 100.00
| 0637 |[Average of Levels in Binary Tree](src/main/kotlin/g0601_0700/s0637_average_of_levels_in_binary_tree/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 249 | 100.00
| 0636 |[Exclusive Time of Functions](src/main/kotlin/g0601_0700/s0636_exclusive_time_of_functions/Solution.kt)| Medium | Array, Stack | 270 | 80.00
| 0633 |[Sum of Square Numbers](src/main/kotlin/g0601_0700/s0633_sum_of_square_numbers/Solution.kt)| Medium | Math, Binary_Search, Two_Pointers, Binary_Search_I_Day_10 | 126 | 100.00
| 0632 |[Smallest Range Covering Elements from K Lists](src/main/kotlin/g0601_0700/s0632_smallest_range_covering_elements_from_k_lists/Solution.kt)| Hard | Array, Hash_Table, Sorting, Greedy, Heap_Priority_Queue, Sliding_Window | 399 | 83.33
| 0630 |[Course Schedule III](src/main/kotlin/g0601_0700/s0630_course_schedule_iii/Solution.kt)| Hard | Array, Greedy, Heap_Priority_Queue | 536 | 100.00
| 0629 |[K Inverse Pairs Array](src/main/kotlin/g0601_0700/s0629_k_inverse_pairs_array/Solution.kt)| Hard | Dynamic_Programming | 155 | 100.00
| 0628 |[Maximum Product of Three Numbers](src/main/kotlin/g0601_0700/s0628_maximum_product_of_three_numbers/Solution.kt)| Easy | Array, Math, Sorting | 276 | 97.30
| 0627 |[Swap Salary](src/main/kotlin/g0601_0700/s0627_swap_salary/script.sql)| Easy | Database, SQL_I_Day_2_Select_and_Order | 400 | 51.04
| 0626 |[Exchange Seats](src/main/kotlin/g0601_0700/s0626_exchange_seats/script.sql)| Medium | Database | 502 | 50.56
| 0623 |[Add One Row to Tree](src/main/kotlin/g0601_0700/s0623_add_one_row_to_tree/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 202 | 100.00
| 0622 |[Design Circular Queue](src/main/kotlin/g0601_0700/s0622_design_circular_queue/MyCircularQueue.kt)| Medium | Array, Design, Linked_List, Queue, Programming_Skills_II_Day_20 | 234 | 92.68
| 0621 |[Task Scheduler](src/main/kotlin/g0601_0700/s0621_task_scheduler/Solution.kt)| Medium | Array, Hash_Table, Sorting, Greedy, Heap_Priority_Queue, Counting, Level_2_Day_5_Greedy | 266 | 98.36
| 0620 |[Not Boring Movies](src/main/kotlin/g0601_0700/s0620_not_boring_movies/script.sql)| Easy | Database | 305 | 59.80
| 0617 |[Merge Two Binary Trees](src/main/kotlin/g0601_0700/s0617_merge_two_binary_trees/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Algorithm_I_Day_8_Breadth_First_Search_Depth_First_Search | 243 | 72.83
| 0611 |[Valid Triangle Number](src/main/kotlin/g0601_0700/s0611_valid_triangle_number/Solution.kt)| Medium | Array, Sorting, Greedy, Binary_Search, Two_Pointers, Binary_Search_II_Day_1 | 203 | 100.00
| 0609 |[Find Duplicate File in System](src/main/kotlin/g0601_0700/s0609_find_duplicate_file_in_system/Solution.kt)| Medium | Array, String, Hash_Table | 426 | 100.00
| 0608 |[Tree Node](src/main/kotlin/g0601_0700/s0608_tree_node/script.sql)| Medium | LeetCode_Curated_SQL_70, Database, SQL_I_Day_4_Union_and_Select | 794 | 48.38
| 0607 |[Sales Person](src/main/kotlin/g0601_0700/s0607_sales_person/script.sql)| Easy | LeetCode_Curated_SQL_70, Database, SQL_I_Day_6_Union | 2142 | 44.56
| 0606 |[Construct String from Binary Tree](src/main/kotlin/g0601_0700/s0606_construct_string_from_binary_tree/Solution.kt)| Easy | String, Depth_First_Search, Tree, Binary_Tree | 187 | 100.00
| 0605 |[Can Place Flowers](src/main/kotlin/g0601_0700/s0605_can_place_flowers/Solution.kt)| Easy | Array, Greedy, Udemy_Arrays | 209 | 85.71
| 0601 |[Human Traffic of Stadium](src/main/kotlin/g0601_0700/s0601_human_traffic_of_stadium/script.sql)| Hard | Database | 529 | 51.80
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
| 0584 |[Find Customer Referee](src.save/main/kotlin/g0501_0600/s0584_find_customer_referee/script.sql)| Easy | Database, SQL_I_Day_1_Select | 779 | 43.48
| 0583 |[Delete Operation for Two Strings](src.save/main/kotlin/g0501_0600/s0583_delete_operation_for_two_strings/Solution.kt)| Medium | String, Dynamic_Programming, Algorithm_II_Day_17_Dynamic_Programming | 197 | 100.00
| 0581 |[Shortest Unsorted Continuous Subarray](src.save/main/kotlin/g0501_0600/s0581_shortest_unsorted_continuous_subarray/Solution.kt)| Medium | Array, Sorting, Greedy, Two_Pointers, Stack, Monotonic_Stack | 246 | 100.00
| 0576 |[Out of Boundary Paths](src.save/main/kotlin/g0501_0600/s0576_out_of_boundary_paths/Solution.kt)| Medium | Dynamic_Programming | 153 | 100.00
| 0575 |[Distribute Candies](src.save/main/kotlin/g0501_0600/s0575_distribute_candies/Solution.kt)| Easy | Array, Hash_Table | 538 | 76.92
| 0572 |[Subtree of Another Tree](src.save/main/kotlin/g0501_0600/s0572_subtree_of_another_tree/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Hash_Function, String_Matching, Algorithm_II_Day_7_Breadth_First_Search_Depth_First_Search | 214 | 92.39
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
| 0429 |[N-ary Tree Level Order Traversal](src.save/main/kotlin/g0401_0500/s0429_n_ary_tree_level_order_traversal/Solution.kt)| Medium | Breadth_First_Search, Tree, Programming_Skills_II_Day_9 | 278 | 75.00
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
| 0192 |[Word Frequency](src.save/main/kotlin/g0101_0200/s0192_word_frequency/script.sh)| Medium | Shell | 114 | 73.60
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
| 0179 |[Largest Number](src.save/main/kotlin/g0101_0200/s0179_largest_number/Solution.kt)| Medium | Top_Interview_Questions, String, Sorting, Greedy | 380 | 43.40
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
| 0056 |[Merge Intervals](src.save/main/kotlin/g0001_0100/s0056_merge_intervals/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Data_Structure_II_Day_2_Array, Level_2_Day_17_Interval, Udemy_2D_Arrays/Matrix | 323 | 99.68
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
| 0018 |[4Sum](src.save/main/kotlin/g0001_0100/s0018_4sum/Solution.kt)| Medium | Array, Sorting, Two_Pointers | 244 | 100.00
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
