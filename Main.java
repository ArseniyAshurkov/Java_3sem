import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int yuan;
        String okon_china="их", okon_yuan="ей";
        Scanner input=new Scanner(System.in);
        System.out.print("Введите кол-во юаней: ");
        yuan=input.nextInt();

        if ((yuan%10==1) && (yuan!=11)){
                okon_yuan="ь";
                okon_china="ий";
        }
        else if ((yuan%10>1) && (yuan%10<5) && ((yuan!=11) && (yuan!=12) && (yuan!=13) && (yuan!=14))){
                okon_yuan="я";
                okon_china="их";
        }
        System.out.print(yuan+" китайск"+okon_china+" юан"+ okon_yuan +" - "+11.91*yuan+" рублей");
    }
}