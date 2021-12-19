import java.util.Scanner;
import java.util.Stack;
public class Test {
    public static void main(String[] args) {
            Scanner a1 = new Scanner(System.in);
            int a;
            Stack <Integer> player11=new Stack<> ();
            Stack <Integer> player12=new Stack<> ();
            int k=0;
            System.out.print("Введите 5 карт первого игрока: ");
            for (int i=1;i<=5;i++) {
                a=a1.nextInt();
                player11.push(a);
            }
            System.out.println("");
            Stack <Integer> player1=new Stack<> (); // Входные данные.Карты перечислены сверху вниз,то есть каждая строка начинается с той карты, которая будет открыта первой.
            for (int i=1;i<=5;i++) {
            player1.push(player11.pop()); // Входные данные.Карты перечислены сверху вниз,то есть каждая строка начинается с той карты, которая будет открыта первой.
            }
            System.out.print("Введите 5 карт второго игрока: ");
            for (int i=1;i<=5;i++) {
               a=a1.nextInt();
               player12.push(a);
            }
            System.out.println("");
            Stack <Integer> player2=new Stack<>();
            for (int i=1;i<=5;i++) {
               player2.push(player12.pop());
            }
            GameDrunk Drunk=new GameDrunk();
            Drunk.setPlayer1(player1);
            Drunk.setPlayer2(player2);
            while (k!=106) {
                k=k+1;
                Drunk.Step(player1,player2,k);
                if ((player1.empty()==true) || (player2.empty()==true)) break;
                if (k==106) System.out.println("botva");
            }
      }
    }

