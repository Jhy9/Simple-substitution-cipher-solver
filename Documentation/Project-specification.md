# Project specification

## Project

## Inputs
Program will take ciphered texts with some restrictions on original unciphered text. 
### Original text
Original text:
- has to be in English
- has to be lengthy
- has to be varied (not much repetition)
- almost all words have to be included in dictionary

How lengthy and varied text needs to be will become clearer during testing.

For testing purposes program will also be able to take unciphered texts to then transform and solve them.
## Complexities
### Space
Space complexity of trie is O(n) where n is the amount of words in chosen dictionary.
### Time
Time complexity of creating trie from dictionary and calculating frequencies of letters in dictionary are both O(n) where n is the number of letters (or words) in dictionary.

Ideally solving ciphers has time complexity of O(n) where n is the amount of words in text. However, this is dependant on how well the letter distribution of original text matches to letter distribution of dictionary.

## Other info
Program will be written in Java and language for code/documentation is English.
