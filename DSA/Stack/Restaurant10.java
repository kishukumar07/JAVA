/*  
Problem: (Restaurant Packages)

You are given a sequence of queries. There is a pile of food packages, each with a cost. The pile follows LIFO (Last In First Out) .

You need to process the queries and print results accordingly.

Input Format:
- First line contains an integer Q — number of queries.
- Next Q lines contain queries of two types:

1
→ A customer takes the top package from the pile.
  - Print the cost of the removed package.
  - If the pile is empty, print -1.

2 C
→ Chef adds a package with cost C to the top of the pile.

Output Format:
- For every query of type 1, print the result in a new line.

Constraints:
- 1 ≤ Q ≤ 100
- 1 ≤ C ≤ 1000

Sample Input:
5
2 10
2 20
1
1
1

Sample Output:
20
10
-1

*/

import java.util.*; 
public class Restaurant10{
     public static void main(String[] args){
 
 String input = " 5 \n2 10\n 1 \n2 20\n 1 \n 1";       

 Scanner sc = new Scanner(input); 
 int t = sc.nextInt() ; 
    Stack<Integer> st = new  Stack<>();  

      while (t>0){
        
        int query = sc.nextInt(); 
        // System.out.println(query); 
       if(st.isEmpty() && query == 1){
      
       System.out.println(-1); 
      
       }else if(!st.isEmpty() && query ==1){
      
        System.out.println(st.pop()); 
      
       }
       else if(query == 2 ){
             st.push(sc.nextInt()); 
       } 
        t--; 
      }
 
 }
}