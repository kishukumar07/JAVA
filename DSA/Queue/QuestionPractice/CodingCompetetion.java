import java.util.*; 

public class CodingCompetetion{

   static Queue<Integer> q1 = new LinkedList<>(); 
   static Queue<Integer> q2 = new LinkedList<>(); 
   static Queue<Integer> q3 = new LinkedList<>(); 
   static Queue<Integer> q4 = new LinkedList<>(); 

    public static void main(String[] args){

    String input ="5 \n E 1 1 \n E 2 1 \n E 1 2 \n D \n D"; 

    Scanner sc = new Scanner(input); 
    int t = Integer.parseInt(sc.nextLine().trim());

    while(t>0){
        String query = sc.nextLine(); 
        String[] parts = query.trim().split(" ");
        String part = parts[0]; 
                  if(part.equals("E")){
                     int team = Integer.parseInt(parts[1]);
                     int rollNo = Integer.parseInt(parts[2]);
                       enqueue(team ,  rollNo); 
                  }else if(part.equals("D")) {
                       System.out.println(dequeue()); 
                  }
               t--; 
    } 
    }


static void enqueue(int team , int value){
    if(team == 1){
        q1.add(value);
    }else if(team ==2){
        q2.add(value);
    }else if(team ==3){
        q3.add(value);
    }else {
        q4.add(value);
    }
}

static String dequeue(){

   if(!q1.isEmpty()){
    return 1 +" "+ q1.remove(); 
   }else if(!q2.isEmpty()){
    return 2+ " "+q2.remove();
   }else if(!q3.isEmpty()){
    return 3 +" "+ q3.remove(); 
   }else if(!q4.isEmpty()){
    return 4+" "+ q4.remove();
   }
   return "String is Empty";
}


}





