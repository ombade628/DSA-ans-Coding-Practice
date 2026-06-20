public class recrsion_practice {
    public static void print_num(int n) {
        if (n==0) {
            return ;    
        }
        print_num(n-1) ;
        System.out.println(n); 
    }
    public static void main(String[] args) {
        int num  = 6  ;
        print_num(num);
        int i =0 ; 
        int count= 1  ;
        System.out.println(i+" " +(i+count));
    }
}
