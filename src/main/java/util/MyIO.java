package util;

import java.io.*;

public class MyIO {
    public static void main(String[] args) throws IOException {
        //OutputStreamDemo--------------------------
        // 1.使用File类，找到一个将字符串写入的文件
//        File file = new File("/opt/test5");
////        if(!file.exists()){
////            file.mkdirs();
////        }
//        // 2.通过子类FileOutputStream实例化OutputStream
//        OutputStream outputStream = null;
//        try {
//            outputStream = new FileOutputStream(file);
//            // 3.进行写操作
//            String str = "Hello world!";
//            byte[] b = str.getBytes();
//            outputStream.write(b);
//        }
//        finally {
//            try {
//                // 4.关闭输出流
//                outputStream.close();
//            } catch (IOException e) {
//                throw new RuntimeException("关闭字符输出流失败！");
//            }
//        }
        //OutputStreamDemo--------------------------
        //InputStreamDemo---------------------------
//        File file = new File("/opt/test5");
//        InputStream inputStream = null;
//        try {
//            // 2.实例化字节输入流 InputStream对象
//            inputStream = new FileInputStream(file);
//            // 3.进行读操作
//            byte[] bs = new byte[1024];
//            int len = 0;
//            while ((len = inputStream.read(bs)) != -1) {
//                System.out.println(new String(bs, 0, len));
//            }
//        } finally {
//            try {
//                // 4.关闭资源
//                inputStream.close();
//            } catch (IOException e) {
//                throw new RuntimeException("关闭输入字节流失败！");
//            }
//        }
        //InputStreamDemo---------------------------
        //WriterDemo--------------------------------
//        File file = new File("/opt/test5");
//        Writer out = new FileWriter(file);
//        String str = "hello world5!";
//        out.write(str);
//        out.close();
        //WriterDemo--------------------------------
        //WriterDemo with BufferWriter--------------
        File file = new File("/opt/test5");
        Writer out = new FileWriter(file);
        String str = "hello world5! ha ha ha~~";
        BufferedWriter out1=new BufferedWriter(out);
        out1.write(str);
        out1.flush();
        out1.close();
        out.close();
        //WriterDemo with BufferWriter--------------
        //ReaderDemo--------------------------------
//        File file = new File("/opt/test5");
//        Reader reader = new FileReader(file);
//        char[] c = new char[1024];
//        int len = 0;
//        while ((len = reader.read(c)) != -1) {
//            System.out.println(new String(c, 0, len));
//        }
//        reader.close();
        //ReaderDemo--------------------------------
        //CopyDemo採用字節流邊讀邊寫----------------------------------
//        if (args.length != 2) {
//            System.out.println("输入的参数不正确！");
//            System.out.println("例：java Copy　源文件路径　目标文件路径");
//            System.exit(1);    // 系统退出
//        }
//        File source = new File(args[0]);  // 源文件的File对象
//        File target = new File(args[1]);  // 目标文件的File对象
//        if (!source.exists()) {
//            System.out.println("源文件不存在！");
//            System.exit(1);
//        }
//        InputStream inputStream = null;
//        OutputStream outputStream = null;
//        try {
//            inputStream = new FileInputStream(source);
//            outputStream = new FileOutputStream(target);
//            if (inputStream != null && outputStream != null) {
//                int len = 0;
//                byte[] bs = new byte[10];
//                while ((len = inputStream.read(bs)) != -1) {
//                    System.out.println("len"+len);
//                    outputStream.write(bs, 0, len);
//                }
//                System.out.println("复制完成！");
//            }
//        } catch (IOException e) {
//            System.out.println("复制失败！");
//            throw new RuntimeException(e.getMessage());
//        }
//        finally {
//            if (outputStream != null) {
//                try {
//                    outputStream.close();
//                } catch (IOException e) {
//                    throw new RuntimeException("输出关闭流失败！");
//                }
//            }
//            if (inputStream != null) {
//                try {
//                    inputStream.close();
//                } catch (IOException e) {
//                    throw new RuntimeException("输入关闭流失败！");
//                }
//            }
//        }
        //CopyDemo----------------------------------
    }

}
