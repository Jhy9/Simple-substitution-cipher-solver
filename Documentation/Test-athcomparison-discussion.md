# Dynamic acceptance threshold vs no acceptance threshold - discussion

In this document I discuss and compare test results from two variants of algorithm that use different tactics in terms of acceptance thresholds: [Dynath](./Logs/Test-dynath-logs.md)
that uses dynamically determined acceptance threshold and [Nonath](./Logs/Test-noath-logs.md) that doesn't use any acceptance threshold.


## Background
From the start, the function of acceptance threshold has been to terminate solver early if it sees that more than a certain amount of words translated by translator-array can be found in dictionary.

This is done combat problem where solver would unnecessarily keep running looking for letter switches and never finding any which causes bad performance. 
The problem with acceptance threshold is that since it is dependant on the text we are translating, how do we find a good value for it (as was also talked about on [earlier tests](Test-initial-discussion.md)). 
If we set the number too high, it will stop doing the thing it is meant to do and if we set it too low it will cause program to give worse results.

An idea was floated in the feedback that maybe it could be determined dynamically by the program. 
While this does solve the problem of inaccuracy in answers it did still have one problem:  
Having it dynamically determined would cause program to always run solver with too high value a few times which would cause the problem acceptance threshold
 is meant to solve to happen on those runs. 
 
 To help with this issue another tool was developed for the solver: the strike system.  
 Principle of strike system if simple: If solver hasn't found a valid letter switch for x(currently 50) amount of conscecutive rounds, it will terminate itself and return answer.

 While it wasn't originally the intention, the new algortihm made me think: Is acceptance threshold even necessary or could strike system completely replace it.  
 Potential benefits of only using strike system are significant:  
 - It is simple and requires no overhead while acceptance threshold needs to controlled from outside of the solver. 
 - More significantly it only needs to check a value of a constant while acceptance threshold needs to always translate a large part if not all of the ciphered text when it investigates conditions for termination.

Therefore it is worth investigating the performance differences between only using strike system vs using acceptance threshold+ strike system.


## Results
In the test logs we can see that neither noath or dynath had any failures in tests.

Comparing average runtimes for each testfile:

| Testfile | Dynamic ath | No ath |
| ------------- | ------------- | ------------- |
| testfile   | 4427  | 2871  |
| testfile2  | 3133   | 3396 |
| testfile3  | 1590   | 1740  |
| testfile8  | 2916   | 2635  |
| lotr  | 5434  | 2191  |

For testfiles 2,3 and 8 differences are quite small and can be accounted as randomness. 
However for testfile1 and lotr we can see that noath performed significantly better compared to dynath on average.

## Conclusions
While sample size for these tests is not big I think we can see two things from results:
 1. There is no significant overall performance benefit in using acceptance threshold
 2. In case of some texts, using acceptance threshold slows down algorithm

First point wasn't that obvious going into these tests. Even though ath can't terminate solver for around half of its runs, I was kind of expecting the other half when it can to make up for it much more than it did. Therefore it is a little bit suprising to see that even in more favorable cases for dynath, the performance is just around the same as noath.  
Second point didn't come as a suprise. The reason for this slow down is that when translator is "almost ready" it starts to trigger ath almost every round causing constant large scale dictionary searches to happen. This is a big problem for long texts like lotr and some other individual texts like testfile1.


Therefore it seems that the best choice going forwards is to remove usage of acceptance threshold and only use strike system.


