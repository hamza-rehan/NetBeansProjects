/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservationsystems;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hamza rehan
 */
public class ticket {
      File t1;
        PrintWriter pw;
        registration r;
        internationalflight i;
        public ticket() throws FileNotFoundException{
            t1=new File("D:\\ticket.txt");
            pw=new PrintWriter(t1);
            r=new registration("khi","lhr",2);
            i=new internationalflight("khi","lhr",2);
        }
        public void ticketdate(){
         Date d=new Date();
       SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy  HH:mm:ss" );
       pw.println(sdf.format(d));
        }
       public void ticket(){
           r.register();
           pw.println(r);
           pw.close();
       }
       
}
