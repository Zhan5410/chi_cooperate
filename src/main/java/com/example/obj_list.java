package com.example;

import java.awt.GridBagConstraints;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class obj_list {
    static JFrame jfr = new JFrame();
    static GridBagConstraints layout = new GridBagConstraints();
    static ArrayList<JComponent> GUI = new ArrayList<>();

    static JLabel jlb_account = new JLabel();
    static JLabel jlb_password = new JLabel();
    static JLabel jlb_date = new JLabel();
    static JLabel jlb_month = new JLabel();
    static JLabel jlb_day = new JLabel();
    static JLabel jlb_datetime = new JLabel();
    static JLabel[] jlb = new JLabel[]{ jlb_account,
                                        jlb_password,
                                        jlb_date,
                                        jlb_month,
                                        jlb_day,
                                        jlb_datetime,
    };

    static JTextField jtf_account = new JTextField();

    static JPasswordField jpf_password = new JPasswordField();

    static JComboBox<String> jco_month = new JComboBox<String>();
    static JComboBox<String> jco_day = new JComboBox<String>();
    static JComponent jco[] = { jco_month,
                                jco_day,
    };

    static JButton jbt_ask = new JButton();
}
