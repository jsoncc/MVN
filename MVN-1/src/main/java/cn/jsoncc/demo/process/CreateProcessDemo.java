package cn.jsoncc.demo.process;

import java.io.IOException;

/**
 * @author JsonCC
 * @date 2023/12/28 14:55
 * @desc
 */
public class CreateProcessDemo {
    public static void main(String[] args) {
        try {
            // 通过 ProcessBuilder 创建一个新的进程
            ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe");
            Process process = processBuilder.start();

            // 等待进程结束
            int exitCode = process.waitFor();
            System.out.println("进程已结束，退出码为：" + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
