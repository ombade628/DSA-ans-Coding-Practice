package java_development;

import java.util.* ; 
class Student{
    int roll_no ; 
    String name ; 
    int marks ; 
}
class calculator{
    public int add(int  a , int b ,int c ){
        return a + b + c ; 
    }
    public int add(int  a , int b  ){
        return a + b ; 
    }
    public double add(double  a , double b ,double c ){
        return a + b + c ; 
    }
    public double add(double  a , double b  ){
        return a + b ; 
    }
}
public class practice {
        public static void main(String[] args){
        // System.out.println("hellow world") ; 
        // calculator cal = new calculator() ; 
        // System.out.println(cal.add(5,3,5) ); 
        // System.out.println(cal.add(5,3)) ; 
        // System.out.println(cal.add(5.4,3.5,5.5)) ; 
        // System.out.println(cal.add(5.4,3.5)) ; 
        // System.out.println(cal.add(5,3.3,5)) ; 
        
        // int [][]arr = new int[3][4] ; 
        // array(arr) ; 
        // for(int i =0 ;  i<arr.length ; i++){
        //     for(int j=0 ; j<arr[0].length ; j++){
        //         System.out.print(arr[i][j] +" " );
        //     }
        //     System.out.println();
        // }

        Student s1 = new Student();
        s1.roll_no  = 1 ; 
        s1.marks = 40 ; 
        s1.name = "Om" ; 

        Student s2 = new Student();
        s2.roll_no  = 2 ; 
        s2.marks = 30 ; 
        s2.name = "sachin" ; 
        
        Student s3 = new Student();
        s3.roll_no  = 3 ; 
        s3.marks = 60 ; 
        s3.name = "rahul" ; 
        
        Student s4 = new Student();
        s4.roll_no  = 4 ; 
        s4.marks = 60 ; 
        s4.name = "akash" ; 

        Student [] students = new Student[4] ; 
        students[0] = s1 ; 
        students[1] = s2 ; 
        students[2] = s3 ; 
        students[3] = s4 ; 

        for(int i = 0 ; i<students.length ; i++){
            System.out.println(students[i].name +" "+ students[i].marks +" " + students[i].roll_no )
;
        }
    }
    public static void array(int[][] arr){

        for(int i =0 ;  i<arr.length ; i++){
            for(int j=0 ; j<arr[0].length ; j++){
                arr[i][j] =(int) (Math.random()*100) ;
            }
        }
    }
}
