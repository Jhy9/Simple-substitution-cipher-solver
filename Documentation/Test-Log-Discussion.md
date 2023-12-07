# Test log discussion
In this document I will go through results of [test log](./Test-Logs.md).


## Used parameters
Tests used following parameters:

<b>maxRounds</b> = 10000

<b>acceptanceThreshold</b> = Perfect result

<b>pickAmount</b> = 20

<b> No termination unless result is acceptanceThreshold or maxrounds is reached.</b>

## Result recap

Recap of test results:

(k means thousand and m million)

| Testfile | Success count | Time used (ms)  | Word searches |
| ------------- | ------------- | ------------- | ------------- |
| testfile1   | 9/10  | 268-2118  | 120k-21.3 m  |
| testfile2  | 9/10 | 316-742  | 138k-5.3 m  | 
| testfile3  | 8/10  |268-778  | 280k-4.7 m  |
| testfile4  | 3/10  | 241-3116  | 1 m-40m  |
| testfile5  | 0/10  | 2147-2996  | 32m-41m  |
| testfile6   | 9/10  | 259-592  | 286k-3.3m  |
| testfile8  | 6/10  | 301-838  | 888k-5.4m  | 
| testfile9  | 9/10  | 234-739  | 21k-4.7m  |
| lotr  | 5/10  | 584-1098  | 868k-3.5m  |

## Discussion

### Success rates


### Word search amounts

Lower ends of word search counts aren't particularly interesting as we are more interested in worst-case scenarios than best-case scenarios.

On higher ends of word searches we can see that testfiles divide into two groups:

First we have cases where max word searches are in range 3-5.5m and then we have cases where they are >20m.
As higher word search counts are related to failures, I believe that this tells us what is going on when algorithm isn't successful on individual runs.

For cases where word searches are really high, it seems that inner for loop is struggling to find suitable letter swap. This causes algorithm to require many more word searches for each 
swap which racks up the number. Alternatively it doesn't find any suitable switches at all. Latter problem could be addressed by terminating program if no suitable switches have been found for some time. 
This would have to be done carefully though since depending on picked words this can happen even if algorithm hasn't yet reached it's best solution.

For cases where word search maximum is lower algorithm keeps finding swaps early but these swaps aren't good. Probable reason for this is that translating array has gone off the track and 
can't find it's way back. There isn't much that can be reasonably done at that point other than trying again. Chance of this happening could maybe be slightly decreased by increasing pickAmount but 
it may be not worth it due to time efficiency decrease that change would cause.

### Acceptance threshold
In these tests I used manually determined ideal results as acceptance threshold. However this can't be done in final algorithm since in reality we don't know the exact words that our ciphered text contains. More testing is required to find the best solution to this problem.

