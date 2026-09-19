//circle rectangle  overlaping 
class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {

        // Find the closest point on the rectangle to the circle center ...   
        int nearestX = Math.max(x1, Math.min(xCenter, x2));
        int nearestY = Math.max(y1, Math.min(yCenter, y2)); 
 

 //euclidean distance... d^2 = (x2-x1)^2 + (y2-y1)^2
     int dx = xCenter - nearestX; 
     int dy = yCenter - nearestY; 


     //Check if distance^2 <= radius ^2 
      
     return (dx*dx + dy*dy) <= (radius*radius); 

  


    }
}