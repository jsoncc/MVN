package cn.jsoncc.demo.stringtoziptobase64;

import java.util.Base64;
import java.io.*;

/**
 * @author JsonCC
 * @date 2023/9/1 15:57
 * @desc 将一个Base64码转成压缩包, 保存到本地指定路径
 */

public class Base64ToZip {
    public static void main(String[] args) {
        // 替换为你的Base64编码字符串
        String base64EncodedData = "一个Base64字符串";
        // 输出文件路径
        String outputFilePath = "D:\\JavaFiles\\IdeaProjects\\output.zip";

        try {
            // 解码Base64字符串并写入文件
            byte[] decodedBytes = Base64.getDecoder().decode(base64EncodedData);
            FileOutputStream outputStream = new FileOutputStream(outputFilePath);
            outputStream.write(decodedBytes);
            outputStream.close();

            System.out.println("文件解码成功并保存到 " + outputFilePath);

            // 现在可以打开或解压 output.zip 文件来访问压缩包内容
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
