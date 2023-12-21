# User manual

## Setting up

## Using program
Textfield "Filename" in lower right takes name of the file as input. Filename should be written as it appears in folder, for example "testfile.txt".
Button "Create testfile" takes file with from folder TextsForTesting and creates ciphered version of it with same filename into folder src/main/resources/Input.  
Button "Decipher" takes file from folder src/main/resources/Input and deciphers it. Program automatically shows deciphered text and performance data from algortithm as this command is given. After text has been deciphered, it can be found in folder src/main/resources/Output. 

## Text files
Users can add their own textfiles for testing or deciphering. Files should be in English and have preferably at least 50 words (as program may not be able to decipher shorter texts).  
File should also be in .txt format. Other file types may work but haven't been tested.  
If your file is not ciphered, put it into folder src/main/resources/TextsForTesting . If your file is already in ciphered form, put it into folder src/main/resources/Input.
