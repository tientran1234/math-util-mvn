
package com.trantien.mathuntil.core;

//class này sẽ chauws các hàm static sinh ra để làm tôl dung chung cho các nơi khác
// cái gì mà dùng chung cho nhiều nơi,nhận info,trả info qua hàm mà ko cần lưu trữ gì cả,cái đó là static
//đồ nào mà lá static thì gọi trực tiếp qua tên claas
// không bao giừo gọi static qua con đường chung
public class MathUtility {
    public static final double PI=3.14;
    // c#: public const double Pi=3.14;//không có chữu static mà vẫn là static nếu cso từ khoá const
    //const c# ~ final java
    // hàm tính n! =1.2.3...n
    //ko có giai thừa của số amm ,N<0 KO TÍNH ĐƯỢC
    // NẾU n QUÁ LỚN THÌ TÀN KIỂU LONG ,LONG CHỈ CHỊU ĐUCOJW 18 SỐ 0
    //20! VỪA ĐỦ 18 SỐ 0,DO ĐÓ :KO TÍNH GIA THỪA TỪ 21 TRƠ ĐI
    public static long getFactorial(int n){
        if(n<0 ||n >200)
            throw new IllegalArgumentException("Invalid n,n must be between 0 ..20");
        if(n==0 || n==1)
            return 1;//nếu kết thúc sớm thì kết thúc ở đây
        //sống sót đến chỗ này ,n =2...20.vì nếu ko chết dọc đường ở
        // 2 cụm if ở trên rồi,ko cần else nếu trước đó sài return
        long result =1;//gia thừa khởi đàu là 1
        for(int i= 2;i<=n;i++){
            result *=i;
        }
        return result;
        
    }
     public static long getFactorial2(int n){
        if(n<0 ||n >200)
            throw new IllegalArgumentException("Invalid n,n must be between 0 ..20");
        if(n==0 || n==1)
            return 1;//nếu kết thúc sớm thì kết thúc ở đây
        //sống sót đến chỗ này ,n =2...20.vì nếu ko chết dọc đường ở
        // 2 cụm if ở trên rồi,ko cần else nếu trước đó sài return
        //gia thừa khởi đàu là 1
       
        return n*getFactorial2(n-1);
        
    }
}
// kĩ thuật kiểm thử hồi quy - regression test
// test lại những thứ đã từng test  để xác nhận nó còn có ổn ko
//tại sao phải test lại???
// code theo thời gian sẽ có thay đổi,thay đổi vì
//1 . Anh em fix bug ,sẽ sữa code
//2 .anh em tối ưu ,chỉnh sữa code để code dep hơn ,chạy tot hơnnhanh honư
//3. anh em thêm hàm mới method mới

// khi sữa code,phải tets lại để đảm bảo nó vẫn ngon ,vẫn xanh
// nếu test = tay cực kì mất sức ,coi chừng sai sót
// nếu có test script ,ta chỉ việc run ,nhìn màu đưa ra
// nếu màu xanh,code chỉn sữa ổn,vì thoả expected == actual
// nếu màu đỏ ,code ko ổn,sữa tiếp cho đến khi nào ổn\
// ta test lại mà chỉ cần nhìn màu nahnh ko hau sức chính xác
// miễn là đủ test case
// test lại những thứu đã test gọi alf test hồi quy

// đẹ quy -recursion
// búp bê nga - đệ quy là gọi lại chính mình với quy mô nhỏ hơn nhỏ đến 1 mcuws thì dừng lại
// 5! = 1 2 3 4 5
// 5! = 4!x5 = 5x4!
//4 ! = 1x2x3x4
//4! 3! x4 = 4x3! đuổi nhau 
