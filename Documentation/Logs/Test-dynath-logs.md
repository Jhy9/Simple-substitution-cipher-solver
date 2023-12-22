# Dynamic acceptance threshold test logs
These tests were made as a part of acceptance threshold comparison testing. Discussion for results and reasons for these tests can be found [here](../Test-athcomparison-discussion.md). 

## Fields
 - Word search count: How many times algorithm performed a dictionary search for a word. (in millions)

 - Time used: How many ms algorithm took to perform task (read cipher+run solver+write solution) (in milliseconds)

 - S/F: Does final result match the original file. (S for success, F for failure)

## Tests

### Test 1
File: [testfile.txt](../../src/main/resources/TextsForTesting/testfile.txt)  

Word count:98

| Test number | Word search count (mil) | Time used (ms) |S/F |
| ------------- | ------------- | ------------- |------------- |
| 1   | 34.3  | 2940  |S  |
| 2  | 48   | 3679  |S |
| 3  | 35.4   | 2511  |S  |
| 4  | 56.3   | 3797  |S  |
| 5  | 62.9  | 4108  | S  |
| 6   | 87.6  | 5743  |S  |
| 7  | 63.4  | 4224  |S  |
| 8  | 71.3  | 4856  |S  |
| 9  | 122.8  | 7826  |S  |
| 10  | 68.6  | 4581  |  S  |

### Test 2
File: [testfile2.txt](../../src/main/resources/TextsForTesting/testfile2.txt)  

Word count: 186

| Test number | Word search count (mil) | Time used (ms) |S/F |
| ------------- | ------------- | ------------- |------------- |
| 1   | 34.2  | 3272  |S  |
| 2  | 30.9  | 2900  |S |
| 3  | 30  | 2912  |S  |
| 4  | 29.6  | 2877  |S  |
| 5  | 38.5  | 3478 | S  |
| 6   | 20.2  | 2307 |S  |
| 7  | 24.4  | 3270  | S  |
| 8  | 30.3  | 3196  |S  |
| 9  | 37.2  | 3426  | S |
| 10  | 40.4 | 3693  | S |

### Test 3
File:[testfile3.txt](../../src/main/resources/TextsForTesting/testfile3.txt)  

Word count: 545

| Test number | Word search count (mil) | Time used (ms) |S/F |
| ------------- | ------------- | ------------- |------------- |
| 1   | 12.2  |1551  |S  |
| 2  | 14.1  | 1761  |S |
| 3  | 14.8  | 1558  |S  |
| 4  | 10.8  | 1210  |S  |
| 5  | 12.1  | 1370  | S  |
| 6   | 9.4  | 1146  |S  |
| 7  | 21.1  | 2236  |S  |
| 8  | 11.8  | 1356 |S |
| 9  |14.3  |1554 | S  |
| 10  | 21.3 | 2161 | S  |

### Test 4
File: [testfile8.txt](../../src/main/resources/TextsForTesting/testfile8.txt)  

Word count: 249

| Test number | Word search count (mil) | Time used (ms) |S/F |
| ------------- | ------------- | ------------- |------------- |
| 1   | 38.6  | 3193  |S  |
| 2  | 27.8 | 2435  |S |
| 3  | 29.5  | 2739  |S  |
| 4  | 27.8  | 2453  |S  |
| 5  | 37.1  | 3104  | S  |
| 6   | 48.6  | 3970  |S  |
| 7  | 25.6 | 2173  | S  |
| 8  | 46.7  | 3923 |S  |
| 9  | 28.1  | 2408 | S  |
| 10  | 30.3  | 2758  |  S  |

### Test 5
File: [lotr.txt](../../src/main/resources/TextsForTesting/lotr.txt)   

Word count: 195 273 

| Test number | Word search count (mil) | Time used (ms) |S/F |
| ------------- | ------------- | ------------- |------------- |
| 1   | 35.2  | 4307  |S  |
| 2  | 52  | 6256  |S |
| 3  | 51.4  | 6216  |S  |
| 4  | 50.1  | 6439 |S  |
| 5  | 53  | 6514  | S  |
| 6   | 34.7 | 4683  |S  |
| 7  | 60.7  |7173 | S  |
| 8  | 32.4 | 4219  |S |
| 9  | 35.4  | 4652  | S  |
| 10  | 30  | 3884  |  S  |
