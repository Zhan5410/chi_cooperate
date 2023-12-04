package com.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.util.sys_parameters;

public class contect {
    public static void main(String[] args) {
        try {
            //連接到網站
            Document document = Jsoup.connect(sys_parameters.login).get();

            //選擇元素
            Element inputElement = document.select("input").first();

            // 檢查是否找到了該元素
            if (inputElement != null) {
                // 修改 <input> 元素的 value 屬性
                inputElement.attr("value", "新的值");

                // 打印修改後的 HTML 文檔
                System.out.println(document.outerHtml());
            } else {
                System.out.println("未找到指定的 <input> 元素。");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
