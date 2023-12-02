# Simple substitution cipher solver

## READ THIS:

Program should be functional now. The program does not currently have UI.

## Quick user instructions
1. Download and open folder in terminal
2. Enter command "mvn package" to build project (do this after every time you modify anything)(requires maven, does work on uni computers/vdi)
3. To launch program enter command "java -cp target/Simple-substitution-cipher-solver-1.0-SNAPSHOT.jar cipherSolver.App"
4. (Optional) to add own texts for testing:
   - Get any English language text and save it in "yourfilename.txt" file
   - Move that textfile into folder "src/main/resources/TextsForTesting"
   - After program has run it's course ciphered version of your text file can be found in folder "src/main/resources/Input" and
     solved version of that cipher in folder "src/main/resources/Output"
     
### Testing a file may cause following error: "Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.util.ArrayList.iterator()" because "words" is null". If this happens, rebuild program with command "mvn package" and then try again.


(The program results do vary so running it a few times may give slightly different results)


[Weekly reports](Documentation/Weekly-reports)

[Project specification](Documentation/Project-specification.md)

[Design document](Documentation/Design-document.md)

