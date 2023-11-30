# Simple substitution cipher solver

## READ THIS:

Program should be functional now. The program does not currently have any UI (likely added tomorrow).

## Quick user instructions
1. Download and open folder in terminal 
2. (Optional) to add own texts for testing:
   - Get any English language text and save it in "yourfilename.txt" file
   - Move that textfile into folder "src/main/resources/TextsForTesting"
   - Open src/main/Java/cipherSolver/App.java in code editor
   - In main add method call solveTestFile("yourfilename.txt") similar to example that is there
   - (You can modify amount of rounds algorithm does by changing the number on line "char[] solution = ..." in solveTestFile method)
   - After program has run it's course ciphered version of your text file can be found in folder "src/main/resources/Input" and
     solved version of that cipher in folder "src/main/resources/Output"
3. Enter command "mvn build" to build project (do this after every time you modify anything)(requires maven, does work on uni computers/vdi)
4. To launch program enter command "java -cp target/Simple-substitution-cipher-solver-1.0-SNAPSHOT.jar cipherSolver.App" (program will take some time to complete)

(The program results do seem to vary so running it a few time may give slightly different results)


[Weekly reports](Documentation/Weekly-reports)

[Project specification](Documentation/Project-specification.md)

[Design document](Documentation/Design-document.md)

