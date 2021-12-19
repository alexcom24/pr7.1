import java.util.Stack;
public class GameDrunk {
    private Stack<Integer> player1;
    private Stack<Integer> player2;

    public void setPlayer1(Stack<Integer> player1) {
        this.player1 = player1;
    }

    public void setPlayer2(Stack<Integer> player2) {
        this.player2 = player2;
    }

    public Stack<Integer> getPlayer1() {
        return player1;
    }

    public Stack<Integer> getPlayer2() {
        return player2;
    }


    public void Step(Stack<Integer> player1, Stack<Integer> player2, int k) {
            int b;
            int b1;
            if ((player1.peek()==9) && (player2.peek()==0)) {
                b = player2.pop();
                b1 = player1.pop();
                Stack<Integer> current = new Stack<>();
                while (player2.empty() == false) {
                    current.push(player2.pop());
                }
                current.push(b);
                current.push(b1);
                while (current.empty() == false) {
                    player2.push(current.pop());
                }
                if (player1.empty() == true) {
                    System.out.println("Second, " + k);

                }
            }
            else
                if ((player2.peek()==9) && (player1.peek()==0)) {
                    b = player1.pop();
                    b1 = player2.pop();
                    Stack<Integer> current = new Stack<>();
                    while (player1.empty() == false) {
                        current.push(player1.pop());
                    }
                    current.push(b);
                    current.push(b1);
                    while (current.empty() == false) {
                        player1.push(current.pop());
                    }
                    if (player2.empty() == true) {
                        System.out.println("First, " + k);

                    }
                }
                else
            if (player1.peek() < player2.peek()) {
                b = player2.pop();
                b1 = player1.pop();
                Stack<Integer> current = new Stack<>();
                while (player2.empty() == false) {
                    current.push(player2.pop());
                }
                current.push(b);
                current.push(b1);
                while (current.empty() == false) {
                    player2.push(current.pop());
                }
                if (player1.empty() == true) {
                    System.out.println("Second, " + k);

                }
            }
            else {
                b = player1.pop();
                b1 = player2.pop();
                Stack<Integer> current = new Stack<>();
                while (player1.empty() == false) {
                    current.push(player1.pop());
                }
                current.push(b);
                current.push(b1);
                while (current.empty() == false) {
                    player1.push(current.pop());
                }
                if (player2.empty() == true) {
                    System.out.println("First, " + k);

                }
            }
        }
    }

