/*
From a college , a group of students applied for 8 positions in the indian army. Each student will be choosen based on the following criteria ...

-Every Student has the following 4 details ...Name , Height , Weight , IQ in the same order 
-IQ is the first Priority to choose a particular student . If a student has IQ of 115 and other has 110 : print first the name of Greater IQ 
-If any two student have same IQ  then print the name of the student Having greater Height 
-If height are also same then print name of student  having lesser weight . 
-if all these details (height , weight ,IQ )are same then first print the lexicographically smaller name . 

You have to prepare top 8 student merit list bases on the above criteria . 

Note: You can't use built in sort function using that can lead to disqualification write your own alg.


Input : First line contains N number of students applied. 
following N line Contains Name , Height , Weight IQ of each student separated by Spaces .

Output : Print each students name in the merit. 


Sample input 1 :      
10
jhon 168 74  124 
jack 158 85  112
bhwan 182 84 124 
arti 148 65  120 
navi  175 88 115
vijay 175 88 115
amit 180 89  119
kelvin 182 77 120 
rohit  174 85 100
vivek 184 75 111 


Output -> 
bhwan
jhon 
navi 
kevin 
arti 
amit 
vivek
javk
*/


//my approach i will take a 2d array and insert this all 
//then i will sort this on behalf of iq > height > weight > name 
//i'll trim and print first 8 el index ....
//O{N^2}            Space ...
//O{N(n^2)sorting}  Time ...


import java.util.*; 

public class MakeMeritList12{
    public static void main(String[] args){
     
     String input = " 10 \n jack 158 85  112\n jhon 168 74  124 \n bhwan 182 84 124 \n arti 148 65  120 \n navi  175 88 115 \n vijay 175 88 115 \n amit 180 89  119 \n kelvin 182 77 120 \n rohit  174 85 100 \n vivek 184 75 111 " ; 



   Scanner sc = new Scanner(input);
   int n = sc.nextInt(); 

   String [][] arr = new String[n][4];   //

   for(int i=0; i<n; i++) {
    for(int j=0; j<4; j++){
        
        arr[i][j] = sc.next();  
        
    }
   }



//    System.out.println(Arrays.deepToString(arr)); 



//Sorting on basis of a[3] ie.iq
  Arrays.sort(arr,(a,b)-> (Integer.parseInt(b[3])) - (Integer.parseInt(a[3])));


//Sorting on basis of a[1] ie.Height

 for(int i=0; i<n-1; i++){
    if((Integer.parseInt(arr[i][3]) == Integer.parseInt(arr[i+1][3])) && (Integer.parseInt(arr[i][1]) < Integer.parseInt(arr[i+1][1]))){
               String[] temp =arr[i]; 
               arr[i]=arr[i+1]; 
               arr[i+1]=temp;
            
    }
 }

// System.out.println(Arrays.deepToString(arr)); 



//Sorting on basis of a[2] ie. Weight 
 for(int i=0; i<n-1; i++){
    if(((Integer.parseInt(arr[i][1])) == (Integer.parseInt(arr[i+1][1]))) && (Integer.parseInt(arr[i][2]) > Integer.parseInt(arr[i+1][2]))){
               String[] temp =arr[i]; 
               arr[i]=arr[i+1]; 
               arr[i+1]=temp;
    }
 }

// System.out.println(Arrays.deepToString(arr)); 

//Sorting on behalf of name lexico..

for(int i=0; i<n-1; i++){
    if(((Integer.parseInt(arr[i][2])) == (Integer.parseInt(arr[i+1][2])))   && checkLexicographic(arr[i][0] , arr[i+1][0])){
               String[] temp =arr[i]; 
               arr[i]=arr[i+1]; 
               arr[i+1]=temp;

    }
 }


// System.out.print(Arrays.deepToString(arr)); 
for(int i =0; i<8; i++){
   System.out.println(arr[i][0]); 
}




    }

static Boolean checkLexicographic(String a, String b){
            int i = 0,  j = 0; 
            // System.out.println(b.codePointAt(3)); 
            while ((i < a.length() ) && (j < b.length())){
                 if(b.codePointAt(j) == a.codePointAt(i) ){
                     i++ ; 
                     j++ ; 
                  }
                  else if(b.codePointAt(j) < a.codePointAt(i)){
                     return true; 
                  }else{
                     return false; 
                  }
                }
                return a.length() > b.length();
}





}

//we have to send true if b > a










