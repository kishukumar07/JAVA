//You are given a array print a string of those element which is odd



public class oddItemsInSingleLine{
    public static void main(String[] args){

int [] items ={1,2,3,4}; 

int n=items.length; 

   
  StringBuilder bag = new StringBuilder(n); 


  for(int i=0; i<n; i++){
      
      if(items[i]%2==1){
        bag.append(items[i]); 
      }

  }

System.out.println(bag.toString());



    }
}

//O(N) , O(N)
