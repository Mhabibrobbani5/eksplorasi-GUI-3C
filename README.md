# eksplorasi-GUI-3C
# Eksplorasi Graphical User Interface (GUI) pada Java

Repositori ini berisi kode program Java Swing sederhana untuk mengeksplorasi 5 komponen utama dalam pembuatan GUI serta penanganan *event* (*Event Listener*).

## 5 Komponen Utama GUI yang Digunakan

1. **Top-Level Container Class**
   * **Class:** `javax.swing.JFrame`
   * **Fungsi:** Bertindak sebagai jendela utama aplikasi yang menampung seluruh komponen antarmuka pengguna lainnya.

2. **Intermediate Container Class**
   * **Class:** `javax.swing.JPanel`
   * **Fungsi:** Digunakan sebagai wadah perantara untuk mengelompokkan komponen input (`panelForm`) dan tombol aksi (`panelTombol`) agar tata letaknya lebih rapi di dalam `JFrame`.

3. **Atomic Component Classes**
   * **Class:** `javax.swing.JLabel`, `javax.swing.JTextField`, dan `javax.swing.JButton`
   * **Fungsi:** Komponen dasar yang berinteraksi langsung dengan pengguna, yaitu label teks (`JLabel`), kolom input teks (`JTextField`), dan tombol klik (`JButton`).

4. **Layout Classes**
   * **Class:** `java.awt.BorderLayout`, `java.awt.GridLayout`, dan `java.awt.FlowLayout`
   * **Fungsi:** 
     * `BorderLayout` mengatur posisi panel utama ke bagian tengah (`CENTER`) dan panel tombol ke bagian bawah (`SOUTH`) pada `JFrame`.
     * `GridLayout` menyusun label dan kolom input dalam bentuk kisi 3 baris $\times$ 2 kolom pada `panelForm`.
     * `FlowLayout` menyusun tombol *Tampilkan* dan *Reset* secara sejajar di tengah pada `panelTombol`.

5. **Event Listener**
   * **Interface & Adapter Class:** `java.awt.event.ActionListener` dan `java.awt.event.MouseAdapter`
   * **Fungsi:** 
     * Meng-override method `actionPerformed(ActionEvent e)` dari interface `ActionListener` pada tombol **Tampilkan** untuk membaca input teks dan menampilkannya pada label status.
     * Meng-override method `mouseClicked(MouseEvent e)` dari adapter class `MouseAdapter` pada tombol **Reset** untuk mengosongkan kembali kolom input.

## Screenshot Hasil Program

![Screenshot Hasil Program GUI](screenshot.png)
