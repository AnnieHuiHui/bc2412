
public class Helloworld{
    public static void main (String[]args) {
        //Comment.Welcome to bootcamp !
            //! 1. Data Type(Primitive)
            //int-->Integer
            int x =3;
            int dayOfWeek=7;
            //int y=3.2; // not  OK, y is a variable that can store integer only.

            double y2 =3.2;
            // double 2w=10.0//!not OK

            //variable naming convension
            //caml case:dayOfWeek, y2

          //Re-assignmentg
            x=101;//res-assign 101 to x
            x=x+10; // right:101+10,left:assign 111 to x
            x=x-40; // 111-40-->71
            x=x*3; //71*->213
            x=x/213;//213/213

            //Print out
            System.out.println(x);
            x=x+8*2/4+1;
            //8*2/4->4
            //1+4+1
            //6
            System.out.println(x);//6

            x=(x+2)*2/(3+1);
            System.out.println(x);//4

            x=((x+3)/(6+1))*(x+1);
            System.out.println(x);//5

            //divide by 0
            int f=10/0;
            System.out.println(f);//

            //0/10
            System.out.println(0/10);//0

            //divide
            x2 =3/2;
            //Step 1:3->int value,2-->int value
            //Step 2:int value/int value->int value
            //Step 3: 3/2->1
            //Step 4: assign 1(int value)to int type variable (OK!)

            System.out.println(x2);//1

            double x3=3/2;
            //Step 1:3->int value,2-->int value
            //Step 2:int value/int value->int value
            //Step 3: 3/2->1
            //Step 4: assign 1(int value)to double type variable (convert 1 to1.0)
        System.out.println(x3);//1.0

        double x4 3.0/2;
        //Step 1: 3.0-->double value,2 ->int value
        //Step 2:double value/int value->double value
        //Step 3: 3.0/2.0->1.5
        //Step:assign 1.5(double value)to double type variable
        System.out.println(x4); //1.5

        int x5=3.0/2;
        //Step 1:3.0->double value,2->int value
        //Step 2:double value/int value ->double value
        //Step 3:3.0/2.0->1.5
        //Step 4:assign1.5(double value) to 
        //double->int(downcast)

        //!Store integer,Java:int,byte,short,long
        int value=100000;
        int value2 =1_000_000;
        int maxInteger=2_100_000_000;
        int minInteger = -2_147_483_649;
        //int maxInteger=2_100_000_000;
       // int minInteger = -2_147_483_649;

       //!byte -128 to 127
       byte b1 =-128;
       byte b2 = 127;

       //!short -32768 to32767
       short s1 =-32768;
       short s2 =32767;

       //!long
       // 2_147_483_648 ->int value
       //int value ->double type variable

       //!Declare a hardcore long value,you should always add"L"
       long l1=214748368L;"L"->declare it is a long value
      // !Step 1: declare an int value (NOT OK)
      //!Step 2:convert an int value to long type

      //!Declare
    }

}