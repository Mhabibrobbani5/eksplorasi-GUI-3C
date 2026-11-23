import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EksplorasiGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Eksplorasi GUI Java - PBO");
        frame.setSize(420, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setLayout(new BorderLayout(10, 10));

        JPanel panelForm = new JPanel();
        panelForm.setLayout(new GridLayout(3, 2, 8, 8));
        panelForm.setBorder(BorderFactory.createEmptyBorder(15, 15, 5, 15));

        JPanel panelTombol = new JPanel();
        panelTombol.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JLabel lblNama = new JLabel("Masukkan Nama:");
        JTextField txtNama = new JTextField();

        JLabel lblNim = new JLabel("Masukkan NIM:");
        JTextField txtNim = new JTextField();

        JLabel lblHasil = new JLabel("Status: Menunggu input...");
        JButton btnTampil = new JButton("Tampilkan");
        JButton btnReset = new JButton("Reset");

        btnTampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = txtNama.getText();
                String nim = txtNim.getText();
                if (nama.isEmpty() || nim.isEmpty()) {
                    lblHasil.setText("Status: Nama dan NIM wajib diisi!");
                } else {
                    lblHasil.setText("Halo, " + nama + " (" + nim + ")");
                }
            }
        });

        btnReset.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtNama.setText("");
                txtNim.setText("");
                lblHasil.setText("Status: Form telah di-reset.");
            }
        });

        panelForm.add(lblNama);
        panelForm.add(txtNama);
        panelForm.add(lblNim);
        panelForm.add(txtNim);
        panelForm.add(new JLabel("Output:"));
        panelForm.add(lblHasil);

        panelTombol.add(btnTampil);
        panelTombol.add(btnReset);

        frame.add(panelForm, BorderLayout.CENTER);
        frame.add(panelTombol, BorderLayout.SOUTH);

        
        frame.setVisible(true);
    }
}