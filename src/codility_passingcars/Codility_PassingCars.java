/**
 *Solution to Codility Passing Cars Exercise Question
 */


/**
 *
 * @author kubrabas
 */
public class Codility_PassingCars {
    
    public static void main(String[] args) {
            
        int[] A = {0,1,0,1,1};
    
        int a = solution(A);
    
        System.out.print(a);
    
    }
    
    
     public static int solution(int[] A){
         
         int count=0;
             
         for(int i=0; i< A.length; i++){
             int start = i+1;
              for(int j=start; j<A.length; j++){
                  
                  System.out.print("(" + A[i] + A[j]+ ") ");
                  
                    if(A[i]==0 && A[j]==1){                      
                         count++; 
                    }
                         
                }
         }
         
         return count;
     }
    
}
