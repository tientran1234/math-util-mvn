
package com.trantien.mathuntil.main;

import com.trantien.mathuntil.core.MathUtility;


public class Main {

   
    public static void main(String[] args) {
        //test case #1 
        int n=0;
        long expected =1;// hàm ý hy vọng rằng n=0! phải trả về 1 
        long actual =MathUtility.getFactorial(n) ;
        
        // so sánh giữa expected == actual hay ko
        System.out.println(n+"! -> expected: "+expected+"| actual: "+ actual);
        
        n=5;
        expected =120;
        actual= MathUtility.getFactorial(n);
         System.out.println(n+"! -> expected: "+expected+"| actual: "+ actual);
       
    }
    
}


// dân dev viết code,hàm thì phải có trách nhiệm testcode của hắn làm ra
//làm sao để test code của chinh mình
//cách 1: in ra màn hình kết quả xử lí của hàm
//cách 2: in ra log file
// cách 3: dùng đò chơi bên ngoài đem vào



// nhưng dù kiểm thửu thế nào cũng cần 3 việc
// thiết kế test case 
// thực thi test case -test run
// ghi bug nếu có == log bug
// test case là:bộ data đưa vào app để xem app hành xử đúng ko
//kèm thêm expected  value để xem app trả về có đúng k
//kèm thêm hướng đẫn sử dụng app với data đưa vào
// kèm thêm tráng thái của test case : app đúng hay sai


// cấu trúc của 1 test case như sau
//( dùng  trong thực tế đi làm)
// test case ID|| test case description / steps/procedures
//expected result| status (passes | failed)

//Test case là 1 tình hướng sài app với bộ data đưa vào và giá trị kì vọng app sẽ trả về
// giờ ta muốn test hàm getF() thì ta phải thiết kế các test case coi xem 
// hàm trả về có đúng ko
//test case #1: verify getFactorial(with n=0) check 0! correct or not?
// test steps/procedures
// 1. Given n =0;
// 2. call /invoke getFactorial(n=0)
// expected result
// the method must return 1 as the result of 0;
//test case #2: verify getFactorial(with n=5) check 5! correct or not?
// test steps/procedures
// 1. Given n =5;
// 2. call /invoke getFactorial(n=5)
// expected result
// the method must return 1 as the result of 120;


// status :passed | failed, just waiting the method returns value
// đoán xem

// câu 3 bài thi pe 