package cn.jsoncc.demo.test;

import java.net.*;
import java.io.*;

public class URLDemo {
    public static void main(String[] args) {
        try {
            // 创建 URL 对象
            URL url = new URL("https://blog.csdn.net/TheChany");

            // 打开 URL 连接
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // 设置请求方式
            conn.setRequestMethod("GET");

            // 获取输入流
            InputStream in = conn.getInputStream();

            // 读取页面内容
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
