//form both ~ left or Right{this is the question mixed of NextSmallerElement varities}


// let arr = [5,4,1,3,2]
//         = [ 4, 1, -1, 1, 1 ]


//Soln1 -> expand from center of each element (Two pointer )=> O{n^2} think for 0th element 
//soln2.-> 
// let arr = [5,4,1,3,2]
//form right [ 4, 1,-1,2,-1] {O-N} 
                        // +
//from left  [-1,-1,-1,1,1]  {O-N}
//combined res         = [ 4, 1, -1, 1, 1 ] //{O{N} tc+sc}

import java.util.*; 
public class NearestSmallerElement{
     public static void main(String[] args){
      int[] arr= {5,4,1,3,2};  
      int n = arr.length; 

    Stack<Integer> st = new Stack<>(); 
    //form right nearest smaller el ..
    int [] Rres = new int[n]; 

    for(int i =n-1; i>=0; i--){
        while(st.size()!=0 && st.peek() >= arr[i]   ){
             st.pop(); 
        }

        if(st.size()==0){
           Rres[i]=-1; 
        }else{
            Rres[i]=st.peek(); 
        }
        st.push(arr[i]); 
    }
//   System.out.println(Arrays.toString(Rres)); 
  

   //from left and modifying res [] accordingly  
   int[] Lres =new int[n] ; 
    for(int i=0; i<n; i++){
        while(st.size()!=0 && st.peek() >= arr[i]  ){ 
            st.pop(); 
        }
        
        if(st.size()==0 ){
             Lres[i]=-1; 
        }else{
             Lres[i] =st.peek(); 
        }
       st.push(arr[i]); 

    }

System.out.println(Arrays.toString(Lres)); // by default due to non empty stack the result is comming combined of both cases...even there is no need to declare Lres[] even with one Rres[] it can be donee.... 

  }
}



