package DafaultPackage;

import org.apache.pdfbox.*;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.*;

public class Main {

    public static void main (String[] args) {

        try{

            File pdfFile = new File ("Impressão NFC-e.pdf");

            PDDocument doc = Loader.loadPDF(pdfFile); // creating instance of pdfDoc

            doc.addPage(new PDPage()); // adding page in pdf doc file

            PDFTextStripper pdfStripper = new PDFTextStripper();

            String text = pdfStripper.getText(doc);

            System.out.println(text);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
