package dealornodeal;

import javax.swing.JOptionPane;

public class DealOrNoDeal {

    public static void pickfirstcase(Cases mycase, Cases valuecases) {
        String[] t = mycase.casesLeftAsStrings();
        String values = valuecases.valuesLeft();
        int n = JOptionPane.showOptionDialog(null, values,
                "what case do you want?",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, t, t[1]);

        mycase.swap(n + 1, 0);
    }

    public static void pickcases(Cases mycase, Cases valuecases) {
        for (int i = 0; i < casesToPick; i++) {
            String[] t = mycase.casesLeftAsStrings();
            String values = valuecases.valuesLeft();
            int n = JOptionPane.showOptionDialog(null, values,
                    "what case do you want? " + (casesToPick - i),
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, t, t[1]);
            int location = mycase.location(n);
            int value = mycase.valueOfCase(location);
            JOptionPane.showMessageDialog(null, "The case has " + value);
            mycase.clearLocation(location);
            valuecases.findAndClearValue(value);
        }
    }

    public static int casesToPick = 6;

    public static void main(String[] args) {
        Cases test = new Cases();
        test.shuffle();

        Cases test2 = new Cases();

        pickfirstcase(test, test2);

        boolean choose = true;
        while (choose) {
            pickcases(test, test2);
            int ch = JOptionPane.showConfirmDialog(null, "Your offer is " + test2.offer() + " Deal or no deal?");

            if (ch == 0) {
                choose = false;
            }
            if (casesToPick > 1) {
                casesToPick--;
            }
            if (test.numcasesLeft() <= 2) {
                choose = false;
            }
        }

        JOptionPane.showMessageDialog(null, "Your case had " + test.valueOfCase(0));
    }
}