public class learnConstruct {
    public static void main(String[] args) {

        Complex num1 = new Complex(4,5);
        num1.print();
        Complex num2 = new Complex(0,0);
        num2.print();



    }
}

    class Complex{
           int a,b;

           Complex(int real , int imaginary){
               a=real;
               b=imaginary;
           }
            void print(){
                System.out.println(a +" + " + b + "i");
            }
        }
