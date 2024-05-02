import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String[] type = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
        int team = 0; 
        while (true) {
            if (team == 0)
                System.out.println("X turn");
            else
                System.out.println("O turn");

            int position = Integer.parseInt(JOptionPane.showInputDialog("1|2|3" + "\n-------" + "\n4|5|6" + "\n-------" + "\n7|8|9"));

            if (team == 0) {
                if (type[position - 1] == " ")
                    type[position - 1] = "X";
            }
            else {
                if (type[position - 1] == " ")
                    type[position - 1] = "O";
            }

            JOptionPane.showMessageDialog(null, type[0] + "|" + type[1] + "|" + type[2] + "\n-------" + "\n" + type[3] + "|" + type[4] + "|" + type[5] + "\n-------" + "\n" + type[6] + "|" + type[7] + "|" + type[8]);

            System.out.println(type[0] + "|" + type[1] + "|" + type[2]);
            System.out.println("-----");
            System.out.println(type[3] + "|" + type[4] + "|" + type[5]);
            System.out.println("-----");
            System.out.println(type[6] + "|" + type[7] + "|" + type[8]);
            
            if (team == 0)
                team = 1;
            else
                team = 0;
        }
    }
}
