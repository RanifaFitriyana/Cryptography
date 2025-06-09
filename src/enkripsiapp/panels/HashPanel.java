/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enkripsiapp.panels;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author ACER
 */
public class HashPanel extends JPanel {
    public HashPanel() {
        // Gunakan layout default (FlowLayout)
        JLabel label = new JLabel("Panel Hash (MD5 & SHA)");
        this.add(label); // Gunakan this.add() atau langsung add() juga bisa
    }
}
