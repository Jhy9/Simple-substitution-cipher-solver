# Implementation


## Dictionary
Program has a dictionary as a textfile that gets turned into a trie during runtime. Each node in trie contains an array of children which depict the next letters and a boolean that tells whether or not the node 
is an ending for a word.

### Complexities: 
Time:  
Adding word into dictionary: O(n) where n is amount of letters in the word.  
Searching dictionary for a word: O(n) where n is the amount of letters in searched word.


Space complexity of trie is O(n) where n is the word count of dictionary. 

## Solver
Solver attempts to create translating array that can translate ciphered words into actual words. This is done in two stages.

### Initialization
Initially solver compares letter frequencies of ciphered text to letter frequencies. Based on that it creates first version of translating array. Ciphered texts letter frequencies are also kept for next stage.

### Switching
Switching is done in cycles that go like this:
  1. Algorithm picks 30 random words from ciphered text
  2. These words are translated using current best translating array and result is saved for comparison
  3. Algorithm starts swapping process:
       - Two letters positions are switched in translating array. Switch priorities are determined by relative letter frequencies that were saved in initialization.
       - Picked words are translated and result is compared to result in step 2.
       - If this new result is better, go to step 1
       - If this result is worse, revert change and continue switching
       - If no valid switches are found by predetermined point, go to step 1
  
  Switching is stopped, if it has either gone full 10000 cycles or algorithm hasn't found a valid switch in 50 consecutive ones.
  
### Solver handler
Class solver handler executes solver until no improvement in results are found. This is done to combat inconsistency of individual solver executions.

### Complexities
Space complexity of solver is O(n) where n is the size of ciphered text.

Time complexity of solver is approximately O(1). It is somewhat dependant on "difficulty" of ciphered text but that complexity cannot be properly described numerically.


## Large language models
Large language models weren't used in this project.
