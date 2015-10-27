package kata4v3;

import java.util.ArrayList;


public class MailHistogramBuilder {
    
    public static Histogram<String> build (ArrayList<String> mail){
        Histogram<String> histogram = new Histogram<>();
        for(Object mails : mail){
            histogram.increment(new Mail (mail.getDomain())); 
        }           
        return histogram;
        
    }
}
