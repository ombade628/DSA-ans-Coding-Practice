package java_development;

public class array {
    public static void main(String[] args){
        
        int [][] nums = new int[3][4] ;
        for(int i = 0 ; i<nums.length ; i++){
            for(int j =  0 ; j<nums[0].length ; j++){
                nums[i][j] = (int)(Math.random()*100);
            } 
        }
        for(int[] arr :nums){
            for(int n : arr){
                System.out.print(n+" ") ;
            }
            System.out.println() ; 
        }
    }
}
