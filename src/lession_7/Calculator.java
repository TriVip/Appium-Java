package lession_7;

public class Calculator {

    //with out params
    /*
    [access modifier] | class method/ or NOT (optional) | return type | function's name (params){...}
    */
    public static void welcome(){ //void là không có kiểu trả về
        System.out.println("welcome");
    }
    //Method signature
    public static int sum(int  num1, int num2){
        int total = num1 + num2;
        return total;
    }

    public static int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    /*
    Overloading?
    . SAME class
    . Compile time
    . Base on method signature: SAME function name + diff params -> Overloading
     */
}
