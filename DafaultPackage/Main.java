package DefaultPackage;

import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.*;


import java.io.IOException;

public class Main {
    public static void main (String[] args) {
        try {
            File pdfFile = new File("/home/raul/Desktop/project/src/DefaultPackage/sample.pdf");
            PDDocument pdDocument = Loader.loadPDF(pdfFile);
            PDFTextStripper pdfStripper = new PDFTextStripper();
            String text = pdfStripper.getText(pdDocument);
            System.out.println(text);
            int i = text.indexOf("CNPJ");
            int j = text.indexOf("Impresso");
            int k = text.indexOf("CPF");
            String s1 = text.substring(i, i + 24);
            String s2 = text.substring(j + 8,  j + 31);
            String s3 = text.substring(k, k + 19);
            System.out.printf("%n%n%n%n%s", s1);
            System.out.printf("%nData e horário: %s", s2);
            System.out.printf("%n%s", s3);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}