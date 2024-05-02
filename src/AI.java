import java.util.Scanner;

public class AI {
    public static void main(String[] args) throws Exception {
        Scanner Input = new Scanner(System.in);
        String[] type = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
        int team = 0; 
        while (true) {
            if (team == 0)
                System.out.println("X turn");
            else
                System.out.println("O turn");

            if (team == 0) {
                int position = Input.nextInt();
                type[position - 1] = "X";

                System.out.println(type[0] + "|" + type[1] + "|" + type[2]);
                System.out.println("-----");
                System.out.println(type[3] + "|" + type[4] + "|" + type[5]);
                System.out.println("-----");
                System.out.println(type[6] + "|" + type[7] + "|" + type[8]);
            }
            else {
                for (int i = 0; i < 9; i++) {
                    if (type[i] == " ") {
                        type[i] = "O";
                        break;
                    }
                }

                System.out.println(type[0] + "|" + type[1] + "|" + type[2]);
                System.out.println("-----");
                System.out.println(type[3] + "|" + type[4] + "|" + type[5]);
                System.out.println("-----");
                System.out.println(type[6] + "|" + type[7] + "|" + type[8]);
            }
            
            if (team == 0)
                team = 1;
            else
                team = 0;
        }
    }
    
    public boolean Check() {
        return false;
    }
}
