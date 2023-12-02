## What was done
-  Implemented large amounts of fixes, refactoring and cleaned up code.
-   Picked up multiple different texts that can be used to test solver.
-  Did a lot of manual testing on algorithm and tweaked solver parameters based on observations.
-  Documented a lot of test results into file  [test-logs](../Test-Logs.md)

  ## Problems
  Biggest nuisance right now is an issue caused by maven which I have to figure out a solution to. Problem is related to reading files from input folder if said   file isn't there at the time of project building (causes nullpoint error and forces rebuilding project after which it works correctly). 

## Current status
Right now I'm happy with the state of solver and the program. Solver is solving everything it should be solving and to me it doesn't seem that it has problems with efficiency. Therefore I think it is fine as it is and I probably could shift focus away from further developing it.

## What next?
I think the project is currently lacking in 3 things: Documentation, testing and UI.

I think improving documentation has currently the highest priority. First thing is to create a document where I go through all test results and discuss them in detail. Also inner workings of program need to be documented in higher detail.

Testing is still somewhat lacking. Overall testing of algorithm has been done manually, but automatic tests like unittests are still very lacking. It would probably be good to add some sort of automatic performance test as well.

UI is rather low priority and program isn't really dependent of it. It will probably not be worked on this week.

### Time used: 21 hours
