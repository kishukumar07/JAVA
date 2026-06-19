//{SUBARRAY-SUBSTRING}-> Sn(nelement) >> n/2(a=1+l) :nonEmptyEl

/* totalSubArray -> 3element -> 6 */ 
{1,2,3} 
{1}{12}{123}
{2}{23}
{3}
{ }  //edge case  


for(let i=0; i<n; i++){ //n
     let subarr=[]
    for(let j=i; j<n; j++){ //n 
        subarr.push(arr[j]) //push and print
        console.log(subarr)  //sum -> even -> count++
    }
} 

/*total SubString => 4element -> 10 */
"nikt"
"n" "ni" "nik" "nikt" 
"i" "ik" "ikt"
"k" "kt" 
"t"
for(let i=0; i<n; i++){
    let subStr =""; 
    for(j=i; j<n; j++){
        subStr+=str[j]; 
        console.log(subStr); 
    }
}




//FOR HIGHER CONCEPTS 


//SUBSEQUENCE-> pow(2,4element)-1 :nonEmptyEl  
"1234"
"1" "12" "123" "1234"   "13" "14"  "12 4" "1 34"
"2" "23"  "234"         "24" 
"3" "34"
"4"
/*Concept 	         Use Case
Recursion	 :       Generating and printing all subsequences (Pick/Exclude).
Backtracking :	     Managing temporary state in recursion.

Bit Masking	 :       Iteratively generating subsequences using binary 
                     representations.
Dynamic Programming :	Counting distinct subsequences efficiently.
*/

//SUBSET => {2^n}:EmptyEl =>   Order Does'nt matter
{1,2,3}           
{1}{12}{123}      {1,3} == {3,1} //so write any one
{2}{23}
{3}
{}

/*
TechniqueApproachBest  
Backtracking  Best
Cascading
BitMasking
 */







