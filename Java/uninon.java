public class uninon {
    public static void main(String[] args) {
        boolean isthere = false ;
        int []arr1 = {1,2,3};
        int []arr2 = {1,2,3,4,6,5};
        int count = 0 ;
        int len1= arr1.length ;
        int len2 = arr2.length ;
        for(int i = 0 ; i>len1 ;i+
        +){
            for(int j =0 ; j<len2;j++ ){
                if (arr1[i]==arr2[j]){
                    isthere= true ; 
                }
            }
            if(isthere==false){
                count++ ;
            }
        }
        System.out.println(count+len2);
    }
}
