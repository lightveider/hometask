package hometask1;

public class Hometask1 {

    public static void main(String[] args) {
        long start= 30560,end=84135;
        long between = start < end ? end-start : -1;
        System.out.println(between);

        int a = 56;
        System.out.println(a/10 + a%10); //сумма цифр двухзначного числа

        a = 986;
        System.out.println(a/100 + (a%100)/10 + (a%100)%10  ); //сумма цифр трехзначного числа

    }
}
