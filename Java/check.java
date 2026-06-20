public class check {

    public static void main(String[] args){
        // int [][] arr = {{12,31,41},{52,62,72},{90,89,81}};
        // int len =arr.length ;
        // for(int i=0 ; i<3 ;i++){
        //     for(int j=0 ;j<3 ;j++){
        //         System.out.print(arr[j][i]+" ");
        //     }
        //     System.out.println();
        // }
        // for(int i=0 ; i<3 ;i++){
        //     for(int j=0 ;j<3 ;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // int [][] arr1 = {{11,21,40},{63,82,29},{51,11,7}};
        // int len1 =arr1.length ;
        // for(int i=0 ; i<3 ;i++){
        //     for(int j=0 ;j<3 ;j++){
        //         System.out.print(arr1[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // for(int i=0 ; i<3 ;i++){
        //     for(int j=2 ;j>=0 ;j--){
        //         System.out.print(arr1[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // int [][] arr1 = {{11,21,40},{63,82,29},{51,11,7}};
        // int len1 =arr1.length ;
        // for(int i=0 ; i<3 ;i++){
        //     for(int j=0 ;j<3 ;j++){
        //         System.out.print(arr1[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();

        // for(int i=0 ; i<3 ;i++){
        //     if(i%2 ==1 ){
        //         for(int j=2 ;j>=0 ;j--){
        //             System.out.print(arr1[i][j]+" ");
        //         }  
        //     }
        //     else{
        //         for(int k=0 ;k>3 ;k++){
        //             System.out.print(arr1[i][k]+" ");
        //         }  
        //     }
        // }
        int [][] arr1 = {{11,21,40},{63,82,29},{51,11,7}};
        int len1 =arr1.length ;
        for(int i=0 ; i<3 ;i++){
            for(int j=0 ;j<3 ;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0 ; i<3 ;i++){
            for(int j=2 ;j>=0 ;j--){
                System.out.print(arr1[j][i]+" ");
            }
            System.out.println();
        }  
    }
}
