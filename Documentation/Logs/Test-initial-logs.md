# Test logs
These tests were based on old version of algorithm that is no longer available.

For each textfile I ran 10 concecutive testruns and marked down results. 

Analysis and discussion can be found [here](../Test-initial-discussion.md).


## Fields
 - Word search count: How many times algorithm performed a dictionary search for a word.

 - Time used: How many ms algorithm took to perform task (read cipher+run solver+write solution)

 - Found words: How many of the words in final answer can be found from used dictionary. (Some words can't be found there)

 - S/F: Does final result match the original file. (Perfect result means word count at which that happens)

## Tests

### Test 1
File: [testfile.txt](.../src/main/resources/TextsForTesting/testfile.txt)  

Word count:98 Perfect result : 97 

Text type: First paragraph of Wikipedia article
| Test number | Word search count | Time used (ms)  | Found words |S/F |
| ------------- | ------------- | ------------- | ------------- |------------- |
| 1   | 18 898 332  | 2118  | 97  | Success  |
| 2  | 8 847 132  | 1069  | 97  | Success |
| 3  | 21 317 196  | 1671  | 97  |Success  |
| 4  | 3 974 350  | 491  | 97  |Success  |
| 5  | 3 279 694  | 425  | 97  |Success  |
| 6   | 21 303 420  | 1556  | 48  |Failure  |
| 7  | 120 706  | 268  | 97  | Success  |
| 8  | 677 282  | 304  | 97  |Success  |
| 9  | 5 427 770  | 608  | 97  |Success  |
| 10  | 16 575 514  | 1370  | 97  | Success  |

### Test 2
File: [testfile2.txt](../src/main/resources/TextsForTesting/testfile2.txt)  

Word count: 186 Perfect result: 179

Text type: Satirical news article

| Test number | Word search count | Time used (ms)  | Found words |S/F |
| ------------- | ------------- | ------------- | ------------- |------------- |
| 1   | 138 878  | 491  | 179  | Success  |
| 2  | 4 476 946  | 742  | 179  | Success  |
| 3  | 2 808 982  | 544  | 179  |Success  |
| 4  | 693 922  | 326  |179  |Success  |
| 5  | 1 415 128  | 330  | 179  |Success  |
| 6   | 5 322 780  | 604  | 60 |Failure  |
| 7  | 1 033 650  | 369  | 179  | Success  |
| 8  | 4 925 526  | 588  | 179  |Success  |
| 9  | 575 686  | 316  | 179  |Success  |
| 10  | 1 336 912  | 325  | 179  | Success  |

### Test 3
File:[testfile3.txt](../src/main/resources/TextsForTesting/testfile3.txt)  

Word count: 545 Perfect result: 530

Text type: Opinion piece about football

| Test number | Word search count | Time used (ms)  | Found words |S/F |
| ------------- | ------------- | ------------- | ------------- |------------- |
| 1   | 1 073 565  | 460  | 530  | Success  |
| 2  | 616 015  | 324  | 530  | Success  |
| 3  |4 771 840  | 721  | 137  |Failure  |
| 4  | 4 466 525  | 647  |530  |Success  |
| 5  | 1 095 875  | 364  | 530  |Success  |
| 6   | 3 643 675  | 560  | 530 |Success  |
| 7  | 279 200  | 268  | 530  | Success  |
| 8  | 4 362 120  | 591  | 530  |Success  |
| 9  | 4 709 960  | 778  | 164  |Failure  |
| 10  | 2 816 445  | 438  | 530  | Success  |
### Test 4
File: [testfile4.txt](../src/main/resources/TextsForTesting/testfile4.txt)  

Word count: 54 Perfect result: 53

Text type: Small part of a wikipedia article

| Test number | Word search count | Time used (ms)  | Found words |S/F |
| ------------- | ------------- | ------------- | ------------- |------------- |
| 1   |40 303 440  | 3116  | 30  | Failure  |
| 2  | 40 125 780  | 2682  | 24  | Failure  |
| 3  |36 337 440  | 2460  | 32  |Failure  |
| 4  | 40 535 000  | 2892  |30  |Failure  |
| 5  | 21 455 074  | 1712  |53  |Success  |
| 6   | 40 153 380  | 2536  | 24 |Failure  |
| 7  | 1 005 654  | 241  | 53  | Success  |
| 8  | 1 949 708  | 301  | 53  |Success  |
| 9  | 37 886 560  | 2533  | 31  |Failure  |
| 10  | 40 119 180  | 2589  | 26  | Failure  |
### Test 5
File: [testfile5.txt](../src/main/resources/TextsForTesting/testfile5.txt)  

Word count: 30 Perfect result: 30

Text type: Even smaller part of a wikipedia article

| Test number | Word search count | Time used (ms)  | Found words |S/F |
| ------------- | ------------- | ------------- | ------------- |------------- |
| 1   |41 142 440  | 2996  | 18  | Failure  |
| 2  | 41 174 820  | 2650  | 19  | Failure  |
| 3  |40 745 160  | 2729  | 19  |Failure  |
| 4  | 32 488 520  | 2161  |18  |Failure  |
| 5  | 32 341 460  | 2147  | 18  |Failure  |
| 6   | 41 169 300  | 2760  | 18 |Failure |
| 7  | 41 130 340  | 2569  | 19  | Failure  |
| 8  | 41 066 540  | 2678  | 20  |Failure  |
| 9  | 40 803 000  | 2521  | 20  |Failure  |
| 10  | 40 851 880  | 2537  | 18  | Failure  |
### Test 6
File: [testfile6.txt](../src/main/resources/TextsForTesting/testfile6.txt)  

Word count: 976 Perfect result: 964

Type: Wikihow article

| Test number | Word search count | Time used (ms)  | Found words |S/F |
| ------------- | ------------- | ------------- | ------------- |------------- |
| 1   |3 364 400 | 566  | 230  | Failure  |
| 2  | 1 233 944  | 371  | 964  | Success  |
| 3  |3 152 732  | 592  | 964  |Success  |
| 4  | 2 005 292  | 440  |964  |Success  |
| 5  | 228 772  | 259  | 964  |Success  |
| 6   | 466 156  | 404  | 964 |Success  |
| 7  | 2 909 704  | 475  | 964  | Success  |
| 8  | 388 936 | 302  | 964  |Success  |
| 9  | 286 988  | 300 | 964  |Success  |
| 10  | 1 070 564  | 467  | 964  |Success  |
### Test 7
File: [testfile8.txt](../src/main/resources/TextsForTesting/testfile8.txt)  

Word count: 249 Perfect result: 228

Type: CS match report

| Test number | Word search count | Time used (ms)  | Found words |S/F |
| ------------- | ------------- | ------------- | ------------- |------------- |
| 1   |3 993 289 | 838  | 228  | Success  |
| 2  | 3 672 769 | 636  | 228  | Success  |
| 3  |3 368 087  | 507  | 228  |Success  |
| 4  | 5 442 020  | 685  |87  |Failure  |
| 5  | 5 184 800  | 784  | 99  |Failure  |
| 6   | 888 869  | 301  | 228 |Success  |
| 7  | 5 445 860  | 627  | 59  | Failure  |
| 8  | 5 086 740  | 663  | 108  |Failure  |
| 9  | 3 324 769  | 489 | 228  |Success  |
| 10  | 1 023 969  | 371  | 228  |Success  |

### Test 8
File: [testfile9.txt](../src/main/resources/TextsForTesting/testfile9.txt)   

Word count: 148 Perfect result: 142

Type: Meatball recipe

| Test number | Word search count | Time used (ms)  | Found words |S/F |
| ------------- | ------------- | ------------- | ------------- |------------- |
| 1   |61 228 | 498  | 142  | Success  |
| 2  | 31 808  | 442  | 142  | Success  |
| 3  |71 268  | 268  | 142  |Success  |
| 4  | 264 116  | 331  |142  |Success  |
| 5  | 126 488  | 415  | 142  |Success  |
| 6   | 404 948  | 265  | 142 |Success  |
| 7  | 21 448  | 234  | 142  | Success  |
| 8  | 1 508 088  | 345  | 142  |Success  |
| 9  | 4 724 000  | 739 | 41  |Failure  |
| 10  | 73 868  | 296  | 142  |Success  |
### Test 9
File: [lotr.txt](../src/main/resources/TextsForTesting/lotr.txt)   

Word count: 195 273 Perfect result: 188 589

Type: Book: Lord of the rings: the fellowship of the ring

| Test number | Word search count | Time used (ms)  | Found words |S/F |
| ------------- | ------------- | ------------- | ------------- |------------- |
| 1   |3 147 080 | 1098  | 66 634  | Failure  |
| 2  | 868 993 | 584  | 188 589  | Success  |
| 3  |3 503 305  | 912  | 188 589  |Success  |
| 4  |2 109 911  | 650  |188 589  |Success  |
| 5  | 3 118 120  | 866 | 71 767  |Failure  |
| 6   | 3 085 480 | 679  | 74 060 |Failure  |
| 7  |  3 264 212  | 761  | 188 589  | Success  |
| 8  | 2 892 200  | 659  | 65 854  |Failure  |
| 9  | 2 601 913  | 670 | 188 589  |Success  |
| 10  | 2 976 460  | 646  | 48 368  |Failure  |

## Results with static word picks

| File | Word search count | Time used (ms)  | Found words |S/F |
| ------------- | ------------- | ------------- | ------------- |------------- |
| testfile.txt   |41 174 260 | 2511  | 34/98  | Failure  |
| testfile2.txt  | 41 182 240 | 3025  | 64/186  | Failure  |
| testfile3.txt  |41 193 320  | 2723  | 196/545  |Failure  |
| testfile4.txt  |41 193 080  | 2415  |22/54  |Failure  |
| testfile5.txt  | 41 185 840  | 2362 | 14/30  |Failure  |
| testfile6.txt   | 41 186 320 | 2530  | 322/976 |Failure  |
| testfile8.txt  |  41 189 480  | 2685  | 105/249  |Failure  |
| testfile9.txt  | 41 188 920  | 2638  | 36/148  |Failure  |
| lotr.txt  | 41 189 540  | 2731 | 74 158/ 195 273  |Failure  |
