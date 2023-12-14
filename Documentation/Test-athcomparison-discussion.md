

In this document I discuss and compare test results from two variants of algorithm that use different tactics in terms of acceptance thresholds: [Dynath](./Test-dynath-logs.md)
that uses dynamically determined acceptance threshold and [Nonath](./Test-noath-logs.md) that doesn't use any acceptance threshold.


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

Therefore it is worth investigating the performance differences of only using strike system vs using acceptance threshold+ strike system.



## Results




## Conclusions



