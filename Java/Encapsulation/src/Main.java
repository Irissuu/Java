import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        Encapsulation valid = new Encapsulation();

        String role1 = JOptionPane.showInputDialog(null, "Inform your role");
        valid.setRole(role1);

        String user = JOptionPane.showInputDialog(null, "Inform your user");
        valid.setUser(user);

        JOptionPane.showMessageDialog(null, valid.getRole());
        JOptionPane.showMessageDialog(null, valid.getUser());
    }
}
