package cn.jsoncc.demo.stringtoziptobase64;

import java.io.*;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author JsonCC
 * @date 2023/9/6 16:42
 * @desc 将一个String类型的URL装成压缩包
 */

public class StringURLToZip {
    public static void main(String[] args) {
        String url = "http://fp.bwjf.cn/downInvoice/026/050003521107_99915455?sign=bac20f3574883f6f9bb1389f62941188bbed044a"; // 替换为实际的 URL
        String zipFileName = "D:\\JavaFiles\\IdeaProjects\\output.zip"; // 压缩包文件名

        try {
            URL sourceUrl = new URL(url);
            InputStream inputStream = sourceUrl.openStream();

            FileOutputStream fos = new FileOutputStream(zipFileName);
            ZipOutputStream zipOut = new ZipOutputStream(fos);

            ZipEntry zipEntry = new ZipEntry("data.pdf"); // 压缩包内的文件名
            zipOut.putNextEntry(zipEntry);

            byte[] bytes = new byte[1024];
            int length;
            while ((length = inputStream.read(bytes)) >= 0) {
                zipOut.write(bytes, 0, length);
            }

            zipOut.close();
            fos.close();
            inputStream.close();

            System.out.println("URL 内容已写入压缩包 " + zipFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
