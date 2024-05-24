import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DaftarUlangMahasiswaBaru extends Frame {
    Label lbTitle, lbName, lbNIM, lbEmail, lbPhone, lbRegNumber, lbAddress;
    TextField txtName, txtNIM, txtEmail, txtPhone, txtRegNumber, txtAddress;
    Button btnSubmit;

    public DaftarUlangMahasiswaBaru() {
        setLayout(null);

        
        setBackground(new Color(173, 216, 230)); 

        lbTitle = new Label("Form Daftar Ulang Mahasiswa Baru");
        lbTitle.setFont(new Font("Arial", Font.BOLD, 14));
        lbTitle.setBounds(50, 30, 300, 20);
        add(lbTitle);

        addLabelAndTextField("Nama:", 60, lbName, txtName);
        addLabelAndTextField("NIM:", 90, lbNIM, txtNIM);
        addLabelAndTextField("Email:", 120, lbEmail, txtEmail);
        addLabelAndTextField("Nomor Telepon:", 150, lbPhone, txtPhone);
        addLabelAndTextField("Nomor Pendaftaran:", 180, lbRegNumber, txtRegNumber);
        addLabelAndTextField("Alamat:", 210, lbAddress, txtAddress);

        btnSubmit = new Button("Submit");
        btnSubmit.setBounds(150, 250, 100, 30);
        btnSubmit.setBackground(Color.RED); 
        btnSubmit.setForeground(Color.WHITE); 
        btnSubmit.addActionListener(new SubmitButtonListener());
        add(btnSubmit);

        setTitle("Form Daftar Ulang Mahasiswa Baru");
        setSize(400, 350);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addLabelAndTextField(String labelText, int yPosition, Label label, TextField textField) {
        label = new Label(labelText);
        label.setBounds(50, yPosition, 150, 20);
        add(label);

        textField = new TextField();
        textField.setBounds(200, yPosition, 150, 20);
        textField.setBackground(Color.WHITE); 
        textField.setForeground(Color.BLACK); 
        add(textField);

        switch (labelText) {
            case "Nama:" -> txtName = textField;
            case "NIM:" -> txtNIM = textField;
            case "Email:" -> txtEmail = textField;
            case "Nomor Telepon:" -> txtPhone = textField;
            case "Nomor Pendaftaran:" -> txtRegNumber = textField;
            case "Alamat:" -> txtAddress = textField;
        }
    }

    private void showMessageDialog(String message, String title) {
        Dialog dialog = new Dialog(this, title, true);
        dialog.setLayout(new FlowLayout());
        dialog.add(new Label(message));
        Button okButton = new Button("OK");
        okButton.addActionListener(e -> dialog.setVisible(false));
        dialog.add(okButton);
        dialog.setSize(300, 150);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }

    private int showConfirmDialog(String message, String title) {
        Dialog dialog = new Dialog(this, title, true);
        dialog.setLayout(new FlowLayout());
        dialog.add(new Label(message));
        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");
        final int[] response = {1}; 
        yesButton.addActionListener(e -> {
            response[0] = 0; // 
            dialog.setVisible(false);
        });
        noButton.addActionListener(e -> dialog.setVisible(false));
        dialog.add(yesButton);
        dialog.add(noButton);
        dialog.setSize(300, 150);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
        return response[0];
    }

    private void showConfirmationDialog(String name, String nim, String email, String phone, String regNumber, String address) {
        Frame confirmationFrame = new Frame("Data Mahasiswa");
        confirmationFrame.setLayout(new GridLayout(7, 1));

        confirmationFrame.add(new Label("Nama: " + name));
        confirmationFrame.add(new Label("NIM: " + nim));
        confirmationFrame.add(new Label("Email: " + email));
        confirmationFrame.add(new Label("Nomor Telepon: " + phone));
        confirmationFrame.add(new Label("Nomor Pendaftaran: " + regNumber));
        confirmationFrame.add(new Label("Alamat: " + address));

        Button closeButton = new Button("Tutup");
        closeButton.addActionListener(e -> confirmationFrame.dispose());
        confirmationFrame.add(closeButton);

        confirmationFrame.setSize(400, 350);
        confirmationFrame.setLocationRelativeTo(this);
        confirmationFrame.setVisible(true);
    }

    private class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = txtName.getText();
            String nim = txtNIM.getText();
            String email = txtEmail.getText();
            String phone = txtPhone.getText();
            String regNumber = txtRegNumber.getText();
            String address = txtAddress.getText();

            if (name.isEmpty() || nim.isEmpty() || email.isEmpty() || phone.isEmpty() || regNumber.isEmpty() || address.isEmpty()) {
                showMessageDialog("Semua kolom harus diisi!", "Peringatan");
            } else {
                int response = showConfirmDialog("Apakah anda yakin data yang Anda isi sudah benar?", "Konfirmasi");

                if (response == 0) {
                    showConfirmationDialog(name, nim, email, phone, regNumber, address);
                }
            }
        }
    }

    public static void main(String[] args) {
        new DaftarUlangMahasiswaBaru();
    }
}
