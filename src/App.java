import javax.swing.JOptionPane;

public class App {
    static boolean End = false;
    public static void main(String[] args) throws Exception {
        String[] type = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
        int team = 0; 
        while (End != true) {
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
            
            if (team == 0)
                team = 1;
            else
                team = 0;

            wincheck(type, "X");
            wincheck(type, "O");

            for(int i = 0; i < 9; i++) {
                if (type[i] == " ") {
                    break;
                }
                if (i == 8) {
                    JOptionPane.showMessageDialog(null, "Draw");
                    return; 
                }
            } 
            
        }
    }

    static void wincheck(String[] type, String team) {
        if (type[0] == team && type[1] == team && type[2] == team) {
            JOptionPane.showMessageDialog(null, team + " wins");
            End = true;
            return;
        }
        if (type[3] == team && type[4] == team && type[5] == team) {
            JOptionPane.showMessageDialog(null, team + " wins");
            End = true;
            return;
        }
        if (type[6] == team && type[7] == team && type[8] == team) {
            JOptionPane.showMessageDialog(null, team + " wins");
            End = true;
            return;
        }
        if (type[0] == team && type[3] == team && type[6] == team) {
            JOptionPane.showMessageDialog(null, team + " wins");
            End = true;
            return;
        }
        if (type[0] == team && type[3] == team && type[6] == team) {
            JOptionPane.showMessageDialog(null, team + " wins");
            End = true;
            return;
        }
        if (type[1] == team && type[4] == team && type[7] == team) {
            JOptionPane.showMessageDialog(null, team + " wins");
            End = true;
            return;
        }
        if (type[2] == team && type[5] == team && type[8] == team) {
            JOptionPane.showMessageDialog(null, team + " wins");
            End = true;
            return;
        }
        if (type[0] == team && type[4] == team && type[8] == team) {
            JOptionPane.showMessageDialog(null, team + " wins");
            End = true;
            return;
        }
        if (type[2] == team && type[4] == team && type[6] == team) {
            JOptionPane.showMessageDialog(null, team + " wins");
            End = true;
            return;
        }
    }
}
