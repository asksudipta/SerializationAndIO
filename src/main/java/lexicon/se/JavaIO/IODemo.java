package lexicon.se.JavaIO;

import java.io.*;

public class IODemo {
    public static void main(String[] args) {

        File source = new File("Photos/Java-logo-450x276.jpg");
        File destination = new File("DestinationPhoto/newJava.png");

        // call the methods here
        copy(source,destination);

        File source1=new File("Icon/img.png");
        File destination1=new File("IconCopy/copyIcon.png");
        copy(source1,destination1);

        File source2=new File("GoodMorning/good-morning-flower-images-.jpg");
        File destination2=new File("NewMorning/good-morning-flower-images-.png");
        copy(source2,destination2);
    }


    // define the static methods like copy and so on...
    public static void copy(File source, File destination) {

        try (
                InputStream inputStream = new FileInputStream(source);
                OutputStream outputStream = new FileOutputStream(destination)
        ) {
            int b;
            while ((b = inputStream.read()) != -1) {
                outputStream.write(b);
            }
            System.out.println("Operation is Done");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
