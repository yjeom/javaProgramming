package lambda;


import java.util.Arrays;

interface MyFunction{
   public abstract int plus(int a,int b);

}

public class MyLambda {
    public static void main(String[]args){
//      MyFunction myFunction=(int a,int b)->{return a+b;};
        // 타입 추론가능할 경우 생략가능
        MyFunction myFunction=new MyFunction() {
            @Override
            public int plus(int a, int b) {
                return a+b;
            }
        };
        System.out.println("익명객체로 메서드 호출:"+myFunction.plus(1,2));
        MyFunction myFunction2=(a,b)->a+b;
        System.out.println("익명객체를 람다식으로 대체:"+myFunction.plus(1,2));

        //매개변수 하나인 경우 괄호 생략가능
        //명령문 하나일 경우 중괄호와 생략가능 (세미콜론도 같이 생략해야함)
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(arr).forEach(i->System.out.println(i));

        int arr2[]={1,2,3,4,5,6,7,8,9,10};
        Arrays.setAll(arr2,i->arr2[i]*10);
        System.out.print(Arrays.toString(arr2));

    }



}
