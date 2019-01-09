package Kata5P2.vista;

import java.util.List;
import Kata5P2.modelo.Histogram;
import Kata5P2.modelo.Mail;


public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<Mail> mail) {
        Histogram<String> histo= new Histogram<String>();
        for (Mail mail1 : mail) {
            histo.increment(mail1.getDomain());
        }
        return histo;
    }
}