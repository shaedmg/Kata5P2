package Kata5P2;

import Kata5P2.modelo.Mail;
import Kata5P2.modelo.Histogram;
import java.io.IOException;
import java.util.List;

import Kata5P2.vista.HistogramDisplay;
import Kata5P2.vista.MailHistogramBuilder;
import Kata5P2.vista.MailListReader;

public class Kata5P2 {
    private List<Mail> mailList;
    private Histogram<String> histogram;
   
    public static void main(String[] args) throws IOException {
      Kata5P2 kata5=new Kata5P2();
      kata5.execute();
    }
    
    void execute() throws IOException {
        input();
        process();
        output();
    }
    
    void input() throws IOException {
        String fileName="C:\\Users\\usuario\\Documents\\NetBeansProjects\\Kata5P21\\emails.txt";
        mailList=MailListReader.read(fileName);
    }
    
    void process() {
       histogram = MailHistogramBuilder.build(mailList);
    }
    
    void output() {
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}