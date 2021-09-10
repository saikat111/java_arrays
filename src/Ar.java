public class Ar {
    public static  void main(String args[]){
        String[] phone ={"iphone", "samsung", "redmi", "readme"};
        int[] num = {10,20,30,40};
        /*
        * size = 4
        * 5
        * */
        for(int i=0; i<=num.length-1;i++){
            System.out.println(num[i]);
        }
        int result =0 ;
        for(int i=0; i<=num.length-1;i++){
            result = result + num[i];
            /*
            * 0 = 0 + 10 = 10
            * result = 10 + 20 = 30
            *        = 30 + 30 =60
            *        = 60 + 40 = 100
            *
            *
            * */
            System.out.println("total sub = " + result);
        }
        System.out.println("total = " + result);
        /*
        * i = 0
        * i= 1
        * i = 2
        * i = 3
        *
        *
        * */





        /*int a;
        a = num[0] + 10;
        System.out.println(a);*/
        /*int x;
        x = num[0] + 10;
        num[0]= x;
        System.out.println(num[0]);*/

        /*
        * iphone = index no. = 0
        *
        * */
       /* System.out.println(phone[0]);
        System.out.println(phone[1]);
        System.out.println(phone[2]);
        System.out.println(phone[3]);
        System.out.println(phone.length);*/
        /*int num;
        num = phone.length;
        System.out.println(num);*/
       /* String a;
        a= phone[3];
        System.out.println(a);*/


    }
}
