package com.util;

import java.awt.GridBagConstraints;

public class sys_parameters {
    private static final int none = GridBagConstraints.NONE;
    private static final int both = GridBagConstraints.BOTH;
    private static final int west = GridBagConstraints.WEST;
    private static final int east = GridBagConstraints.EAST;
    private static final int center = GridBagConstraints.CENTER;

    public static final String frame_name = "請假小精靈";
    public static final String button_text = "請假";

    public static final String[] label_text = { "帳號",
                                                "密碼",
                                                "日期",
                                                "月",
                                                "日",
                                                "假別：病假",
                                                "請假狀態"
    };

    public static final String month[] = {  "1",
                                            "2",
                                            "3",
                                            "4",
                                            "5",
                                            "6",
                                            "7",
                                            "8",
                                            "9",
                                            "10",
                                            "11",
                                            "12",
    }; 

    public static final String day[] = {"01","02","03","04","05","06","07","08","09","10",
                                        "11","12","13","14","15","16","17","18","19","20",
                                        "21","22","23","24","25","26","27","28","29","30","31",
    };

    public static final int gbc[][] = { {0,0,1,1,0,0,none,west},    //jlb_account
                                        {0,1,1,1,0,0,none,west},    //jlb_password
                                        {0,2,1,1,1,1,none,west},    //jlb_date
                                        {1,2,1,1,0,0,none,center},  //jlb_month
                                        {3,2,1,1,0,0,none,center},  //jlb_day
                                        {0,3,4,1,1,0,both,west},    //jlb_datetime
                                        {0,4,1,1,0,1,both,west},    //jlb_askstate
                                        {1,0,4,1,1,0,both,west},    //jtf_account
                                        {1,1,4,1,1,0,both,west},    //jtf_password
                                        {1,4,4,1,1,1,both,west},    //jta_state
                                        {2,2,1,1,0,1,both,east},    //jco_month
                                        {4,2,1,1,0,0,both,east},    //jco_day
                                        {4,3,1,1,0,0,none,east},    //jbt_ask

    }; 

    public static final String pagemain = "https://as1.npu.edu.tw/npu";

}