// problem.There are two teams , given array -> length=2n , the first n elements of array represents strength of first team and the 2nd n element represents the strength of the second team . you have to take the absolute diff of the total  strength of both the array and if the diff is less than k :print -> valid else invalid 


public class ValidateTeamStr{
 
 public static void main(String [] args){

    int[] arr = {1,2,3,4,5,6,7,8};   
     
     int teamOne = 0; 
     int teamTwo = 0;
    int n = arr.length ; 
    
    for(int i=0; i<n; i++){
        if(i<n/2){  
           teamOne+=arr[i]; 
        }else{
           teamTwo+=arr[i]; 
        }
    }

     //System.out.println("team 1 :" +teamOne +" team 2 : "+teamTwo);
     System.out.println((Math.abs(teamOne-teamTwo) > 5) ? "true" :"false" );  

 }

}












