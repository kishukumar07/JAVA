/* Goal: your task is to make the final integer as large as possible

sample Input1            sample Output1
1                          4321
4
1 2 3 4    

sample Input2            sample Output2
1                          880
2
80 8                      
*/



import java. util.*; 

public class Customize_shorting09{
    public static void main(String[] args){
    
    String input = "2 4 2 1 4 3 2 80 8 "; 
    // String input = "1 4 2 1 4 3  "; 
                         
                        
    
    Scanner sc = new Scanner(input);  
    
    int t = sc.nextInt();

    while (t>0){
       
    int n = sc.nextInt(); 
    int [] arr = new int[n] ;  

    for(int i = 0; i<n; i++){
     arr[i] = sc.nextInt() ; 
    }
    
    //we have n and array we have to write the logic.... 
       
     for(int i =0; i<=n-2; i++){
             Boolean swapped = false ; 
        for(int j=0; j<n-1-i; j++){
                                //   8 80 
                                //  880 808
            if(Integer.parseInt(arr[j]+""+arr[j+1]) <  Integer.parseInt(arr[j+1]+""+arr[j])){ //condn...  agar simple addition chota hota then well swap to make it bit big...     
                int temp = arr[j]; 
                arr[j]=arr[j+1]; 
                arr[j+1]=temp; 
             swapped =true; 
            }
        

        }
         if(!swapped){
            break; 
         }
       
     }

    // System.out.println(Arrays.toString(arr)); 
    StringBuilder sb  = new StringBuilder(n);
    for(int i=0; i<n; i++){
        sb.append(arr[i]); 
    }
    System.out.println(sb.toString()) ; 



        t--; 
    }    

    


    
    


    }
}


















