# Design document

## Algorithm
Algorithm works solves substitution ciphers by forming a translating array in following steps.

### 1. Initial guess
<b>Initial guess: Ciphered text has the same letter distribution as dictionary. </b>

Therefore we get a starting point by calculating letter frequencies of both the used dictionary and the cipher. We then set the translating array in a way that the most common letter in cipher is translated 
as most common letter in dictionary and so on.

### 2. Make adjustments to translating array
<b> Assumption: Letter distribution of ciphered text is similar to dictionary . Therefore right answer is got by changing around the letters frequency of which is close to each other. </b>

Algorithm does changes in cycles followingly:
1. Pick n(undecided) random words from cipher. Words are picked randomly so that and we still get a good representation of the text in a long run while not having to translate it entirely in each cycle.
2. Translate those words using current translation array and check how many of those words are in dictionary.
3. Make a small change in translation array on basis of letter frequencies. Then use this translation array to translate words and run another dictionary check.
4. Compare these 2 dictionary checks and keep the version of translation array that yielded better results.
5. If older translating array did better, keep looking for a good adjustment.
6. Repeat this cycle until maximum amount of cycles are done (amount will be determined later), dictionary check result reaches acceptance threshold at which point we determine translation array to be complete (threshold to be determined) or no change that improves array can be found.
    
### 3. Acceptance 
After adjustment cycles are done algorithm will use the translating array to decipher the text.
