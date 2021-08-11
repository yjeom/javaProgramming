package algorithm;

public class FizzBuzz {
    private static String toWord(int divisor,int value,String word){
        return value%divisor==0 ? word:"";
    }
    public static void main(String[]args){
        for(int i=1;i<=15;i++){
            String word=toWord(3,i,"Fizz")+toWord(5,i,"Buzz");

            if(!word.isEmpty()){
                System.out.println(i+":"+word);
            }

        }
    }
}
