# Test logs
For each textfile I ran 10 concecutive testruns and marked down results. 

Analysis and discussion can be found here (link coming soon).


## Fields
 - Word search count: How many times algorithm performed a dictionary search for a word.

 - Time used: How many ms algorithm took to perform task (read cipher+run solver+write solution)

 - Found words: How many of the words in final answer can be found from used dictionary. (Some words can't be found there)

 - S/F: Does final result match the original file.

## Tests

File: testfile.txt  Word count:98 Perfect result : 97 

Text type: First paragraph of Wikipedia article
| Test number | Word search count | Time used (ms)  | Found words |S/F |
| ------------- | ------------- | ------------- | ------------- |------------- |
| 1   | 957 458  | 594  | 97  | Success  |
| 2  | 37 936 374  | 2906  | 88  | Failure |
| 3  | 1 989 070  | 468  | 97  |Success  |
| 4  | 1 943 588  | 438  | 97  |Success  |
| 5  | 1 055 130  | 316  | 97  |Success  |
| 6   | 6 634 208  | 877  | 97  |Success  |
| 7  | 19 510 896  | 1491  | 97  | Success  |
| 8  | 36 359 756  | 2598  | 88  |Failure  |
| 9  | 15 425 612  | 1286  | 97  |Success  |
| 10  | 5 325 208  | 623  | 97  | Success  |


File: testfile2.txt Word count: 186 Perfect result: 179

Text type: Satirical news article

| Test number | Word search count | Time used (ms)  | Found words |S/F |
| ------------- | ------------- | ------------- | ------------- |------------- |
| 1   | 2 284 772  | 868  | 179  | Success  |
| 2  | 1 664 046  | 587  | 179  | Success  |
| 3  |578 326  | 311  | 179  |Success  |
| 4  | 1 736 646  | 560  |179  |Success  |
| 5  | 4 679 600  | 861  | 58  |Failure  |
| 6   |2 514 924  | 501  | 179 |Success  |
| 7  | 3 922 806  | 756  | 179  | Success  |
| 8  | 635 588  | 308  | 179  |Success  |
| 9  | 2 394 266  | 450  | 179  |Success  |
| 10  | 2 886 468  | 499  | 179  | Success  |

File: testfile3.txt Word count: 545 Perfect result: 530

Text type: Opinion piece about football

| Test number | Word search count | Time used (ms)  | Found words |S/F |
| ------------- | ------------- | ------------- | ------------- |------------- |
| 1   | 4 183 320  | 950  | 530  | Success  |
| 2  | 5 176 980  | 791  | 162  | Failure  |
| 3  |937 655  | 314  | 530  |Success  |
| 4  | 992 410  | 369  |530  |Success  |
| 5  | 736 165  | 404  | 530  |Success  |
| 6   | 1 737 995  | 351  | 530 |Success  |
| 7  | 832 320  | 267  | 530  | Success  |
| 8  | 611 805  | 247  | 530  |Success  |
| 9  | 3 957 950  | 542  | 530  |Success  |
| 10  | 4 901 240  | 649  | 177  | Failure  |

File: testfile4.txt Word count: 54 Perfect result: 53

Text type: Small part of a wikipedia article

| Test number | Word search count | Time used (ms)  | Found words |S/F |
| ------------- | ------------- | ------------- | ------------- |------------- |
| 1   |33 549 440  | 2800  | 32  | Failure  |
| 2  | 1 732 254  | 349  | 53  | Success  |
| 3  |40 058 360  | 2726  | 25  |Failure  |
| 4  | 37 347 160  | 2766  |29  |Failure  |
| 5  | 36 910 374  | 2857  | 49  |Failure  |
| 6   | 37 330 060  | 2470  | 27 |Failure  |
| 7  | 35 703 382  | 2881  | 45  | Failure  |
| 8  | 40 076 800  | 2691  | 28  |Failure  |
| 9  | 8 890 834  | 851  | 53  |Success  |
| 10  | 36 409 560  | 2599  | 29  | Failure  |

File: testfile5.txt Word count: 30 Perfect result: 30
Text type: Even smaller part of a wikipedia article

| Test number | Word search count | Time used (ms)  | Found words |S/F |
| ------------- | ------------- | ------------- | ------------- |------------- |
| 1   |40 926 320  | 2953  | 18  | Failure  |
| 2  | 40 868 280  | 2585  | 18  | Failure  |
| 3  |40 130 700  | 2758  | 20  |Failure  |
| 4  | 40 606 340  | 2638  |19  |Failure  |
| 5  | 40 360 000  | 2654  | 22  |Failure  |
| 6   | 40 999 500  | 2913  | 28 |Failure (close) |
| 7  | 40 509 780  | 2676  | 16  | Failure  |
| 8  | 29 304 060  | 2011  | 19  |Failure  |
| 9  | 40 889 120  | 2567  | 19  |Failure  |
| 10  | 39 837 220  | 2521  | 18  | Failure  |

File: testfile6.txt Word count: 976 Perfect result: 964

Type: Wikihow article

| Test number | Word search count | Time used (ms)  | Found words |S/F |
| ------------- | ------------- | ------------- | ------------- |------------- |
| 1   |201 960 | 554  | 964  | Success  |
| 2  | 3 354 640  | 657  | 354  | Failure  |
| 3  |69 108  | 265  | 964  |Success  |
| 4  | 92 528  | 396  |964  |Success  |
| 5  | 1 715 304  | 442  | 964  |Success  |
| 6   | 3 262 240  | 564  | 368 |Failure  |
| 7  | 2 170 092  | 546  | 964  | Success  |
| 8  | 190 304  | 277  | 964  |Success  |
| 9  | 3 305 912  | 520 | 964  |Success  |
| 10  | 1 158 492  | 375  | 964  |Success  |

File: testfile8.txt Word count: 249 Perfect result: 228

Type: CS match report

| Test number | Word search count | Time used (ms)  | Found words |S/F |
| ------------- | ------------- | ------------- | ------------- |------------- |
| 1   |3 878 498 | 848  | 228  | Success  |
| 2  | 2 861 778  | 570  | 228  | Success  |
| 3  |4 756 889  | 723  | 228  |Success  |
| 4  | 4 889 120  | 600  |80  |Failure  |
| 5  | 4 850 500  | 666  | 101  |Failure  |
| 6   | 4 942 800  | 671  | 68 |Failure  |
| 7  | 4 886 060  | 642  | 88  | Failure  |
| 8  | 4 976 880  | 1131  | 106  |Failure  |
| 9  | 4 958 980  | 674 | 93  |Failure  |
| 10  | 2 599 489  | 460  | 228  |Success  |

File: testfile9.txt Word count: 148 Perfect result: 142

Type: Meatball recipe

| Test number | Word search count | Time used (ms)  | Found words |S/F |
| ------------- | ------------- | ------------- | ------------- |------------- |
| 1   |479 528 | 548  | 142  | Success  |
| 2  | 34 708  | 389  | 142  | Failure  |
| 3  |219 068  | 285  | 142  |Success  |
| 4  | 2 035 988  | 482  |142  |Success  |
| 5  | 2 925 676  | 492  | 142  |Success  |
| 6   | 123 008  | 265  | 142 |Failure  |
| 7  | 625 468  | 351  | 142  | Success  |
| 8  | 69 888  | 259  | 142  |Success  |
| 9  | 267 396  | 328 | 142  |Success  |
| 10  | 4 763 880  | 636  | 38  |Success  |

File: lotr.txt Word count: 195 273 Perfect result: 188 589

Type: Book: Lord of the rings: the fellowship of the ring

| Test number | Word search count | Time used (ms)  | Found words |S/F |
| ------------- | ------------- | ------------- | ------------- |------------- |
| 1   |1 038 753 | 513  | 188 589  | Success  |
| 2  | 2 768 720 | 692  | 62 357  | Failure  |
| 3  |4 787 403  | 916  | 188 589  |Success  |
| 4  | 2 161 091  | 745  |188 589  |Success  |
| 5  | 1 546 833  | 622  | 80 593  |Success  |
| 6   | 2 862 220  | 745  | 188 589 |Failure  |
| 7  |  526 893  | 532  | 188 589  | Success  |
| 8  | 2 838 320  | 830  | 66 661  |Success  |
| 9  | 2 395 993  | 655 | 188 589  |Success  |
| 10  | 3 922 770  | 892  | 188 589  |Success  |
