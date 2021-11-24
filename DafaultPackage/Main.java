package DafaultPackage;

import org.apache.pdfbox.*;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.*;
import java.sql.SQLOutput;

public class Main {

    public static void main (String[] args) {

        try{

            File pdfFile = new File ("src/nota.pdf");

            PDDocument doc = Loader.loadPDF(pdfFile);

            doc.addPage(new PDPage());

            PDFTextStripper pdfStripper = new PDFTextStripper();

            String text = pdfStripper.getText(doc);

            System.out.println(text);

            int i = text.indexOf("CNPJ");

            int j = text.indexOf("Impresso");

            int k = text.indexOf("CPF");

            String cnpj = text.substring (i + 6, i + 24);

            String data = text.substring (j + 9, j + 31);

            String cpf = text.substring (k + 5, k + 19);

            System.out.println("CNPJ: " + cnpj);

            System.out.println("Data e Horário: " + data);

            System.out.println("CPF: " + cpf);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
