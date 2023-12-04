package com.example;

import com.util.sys_parameters;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

import javax.swing.JFrame;

public class chi_cooperate 
{
    private String user_account = "";
    private String user_password = "";

    private void obj_set(){
        //set_frame
        obj_list.jfr.setTitle(sys_parameters.frame_name);
        obj_list.jfr.setLayout(new GridBagLayout());
        obj_list.jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj_list.jfr.setSize(300,150);
        obj_list.jfr.setResizable(false);

        //set_labeltext
        for(int i=0 ; i<obj_list.jlb.length ; i++){
            obj_list.jlb[i].setText(sys_parameters.label_text[i]);
        }

        //set_combotext
        for(int i=0 ; i<sys_parameters.month.length ; i++){
            obj_list.jco_month.addItem(sys_parameters.month[i]);
        }
        for(int i=0 ; i<sys_parameters.day.length ; i++){
            obj_list.jco_day.addItem(sys_parameters.day[i]);
        }

        //set_buttontext
        obj_list.jbt_ask.setText(sys_parameters.button_text);

    }

    private void obj_function(){

        //handel user_input
        obj_list.jtf_account.addInputMethodListener(new InputMethodListener() {

            @Override
            public void inputMethodTextChanged(InputMethodEvent event) {
                user_account = new String(obj_list.jtf_account.getText());
            }

            @Override
            public void caretPositionChanged(InputMethodEvent event) {
                throw new UnsupportedOperationException("Unimplemented method 'caretPositionChanged'");
            }

        });
        obj_list.jpf_password.addInputMethodListener(new InputMethodListener() {

            @Override
            public void inputMethodTextChanged(InputMethodEvent event) {
                user_password = new String(obj_list.jpf_password.getPassword());
            }

            @Override
            public void caretPositionChanged(InputMethodEvent event) {
                throw new UnsupportedOperationException("Unimplemented method 'caretPositionChanged'");
            }
            
        });

        //handel button
        obj_list.jbt_ask.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(user_account);
                System.out.println(user_password);
                System.out.println(obj_list.jpf_password.getPassword());
            }
            
        });

    }

    private void obj_add(){
        //handel label
        for(int i=0 ; i<obj_list.jlb.length ; i++){
            obj_list.GUI.add(obj_list.jlb[i]);
        }

        //handel text_field
        obj_list.GUI.add(obj_list.jtf_account);

        //handel password_field
        obj_list.GUI.add(obj_list.jpf_password);

        //handel combobox
        for(int i=0 ; i<obj_list.jco.length ; i++){
            obj_list.GUI.add(obj_list.jco[i]);
        }

        //handel button
        obj_list.GUI.add(obj_list.jbt_ask);

        //handel GUI
        for(int i=0 ; i<obj_list.GUI.size() ; i++){
            obj_list.layout.gridx = sys_parameters.gbc[i][0];
            obj_list.layout.gridy = sys_parameters.gbc[i][1];
            obj_list.layout.gridwidth = sys_parameters.gbc[i][2];
            obj_list.layout.gridheight = sys_parameters.gbc[i][3];
            obj_list.layout.weightx = sys_parameters.gbc[i][4];
            obj_list.layout.weighty = sys_parameters.gbc[i][5];
            obj_list.layout.fill = sys_parameters.gbc[i][6];
            obj_list.layout.anchor = sys_parameters.gbc[i][7];

            obj_list.jfr.add(obj_list.GUI.get(i),obj_list.layout);
        }

    }

    public static void main( String[] args )
    {
        chi_cooperate start = new chi_cooperate();
        start.obj_set();
        start.obj_function();
        start.obj_add();
        obj_list.jfr.setVisible(true);
    }
}
