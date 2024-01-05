public class Main {
    public static void main(String[] args) {

       System.out.println("Hii there, lets hamdle some Exceptions!!" );
        int arr[]= {1,2,3,4,5,6,7,8,9};
        try{
            int result= 5/0;
            System.out.println(arr[9]);// will never be executed because compiler jump to catch block
        }
        catch(ArithmeticException e){
            System.out.println("Arrey yaar, chhoti chhoti mistakes mat karona  "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ye lo ek aur exception:  "+e);// never  scanned because first exception got handled
        }

      try{ fun();}
       catch(Exception e)
       {
           System.out.println("handled exception "+e);
       }
        System.out.println("i think we have reached the end");

    }
    public static void fun() throws customExceptions {
       int age=15;
       if(age < 18)
       {
           throw new customExceptions("chhoti bachi ho kya");// its occuring at runtime so have to specify
       }
    }
//     try{
//         fun();
//     }
//     catch(Exception e){
//         System.out.println("e");
//     }
//
//    }
//    public static void fun() throws ArithmeticException, ArrayIndexOutOfBoundsException{
//        int i= 10/0;
    }

}