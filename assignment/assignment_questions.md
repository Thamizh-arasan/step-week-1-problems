# Week 1 Assignment — Assignment Problems

## 1. The Exam Hall Seat Duplication Checker
Accept an array of seat numbers and compare every seat number against every other seat number to detect duplicates. Do not use any Collections class; use arrays and loops only. If duplicates are found, print the duplicated seat number(s); otherwise print a clear confirmation.

Suggested method:
`void checkDuplicateSeats(int[] seatNumbers)`

Example:
- `{101, 102, 103, 102, 105}` → `Duplicate Seat Number Found: 102`
- `{101, 102, 103, 104, 105}` → `No Duplicate Seats Found`

## 2. The Typing Speed Test Accuracy Checker
Compare two equal-length strings character by character. Count matching characters, calculate the accuracy percentage, and report the first mismatch position.

Suggested method:
`void checkTypingAccuracy(String original, String typed)`

Example:
- `hello world` vs `hello worlt` → 90.91% accuracy, first mismatch at position 11
- `coding` vs `coding` → 100% accuracy

## 3. The Traffic Signal Streak Analyzer
Given a string containing R, Y, and G, find the longest continuous streak of the same color.

Suggested method:
`void findLongestStreak(String signalLog)`

Examples:
- `RRGGGYRR` → G × 3
- `RRRRYYGG` → R × 4

## 4. The Warehouse Inventory Balancer
Accept two integer arrays representing two warehouse sections. Calculate their totals and report whether the inventories are balanced. Also find the maximum quantity and identify its section and item/index.

Suggested method:
`void analyzeInventory(int[] sectionA, int[] sectionB)`

Example:
- Section totals: 65 and 65 → Balanced
- Maximum quantity: 30 in Section A, item 3

## 5. The Movie Review Word Length Profiler
Split a movie review into words and classify each word by length:
- Short: 1–4 characters
- Medium: 5–8 characters
- Long: 9+ characters

Count the number of Short, Medium, and Long words.

Suggested method:
`void classifyWordLengths(String review)`

Example:
`This movie was absolutely fantastic and thrilling`
→ Short: 3, Medium: 1, Long: 3
