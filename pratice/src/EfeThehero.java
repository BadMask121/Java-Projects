/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking;
import java.applet.AppletContext;
import java.awt.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author User
 */
public class EfeThehero extends JApplet{
    private HashMap<String,URL> storage;
    private ArrayList<String> titlestore;
    private JList mainlist;
    
    @Override
    public  void init(){
    storage = new HashMap<String, URL>();
    titlestore = new ArrayList<String>();
   
    grabHTMLinfo();
    add(new JLabel("what website do you want to visit"),BorderLayout.NORTH);
   mainlist = new JList(titlestore.toArray());
        
   mainlist.addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
     //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  Object ob = mainlist.getSelectedValue();
  URL  newdocument = storage.get(ob);
            AppletContext browser = getAppletContext();
            browser.showDocument(newdocument);
            
        }
    });
   
   add(new JScrollPane(mainlist),BorderLayout.CENTER);
    }
   private void grabHTMLinfo(){ 
   String title,address;
   URL url;
   int counter = 0;
   title= getParameter("title"+counter);
   
   while(title !=null){
   address= getParameter("address"+counter);
       try {
          url = new URL(address);
                  storage.put(title, url);
                  titlestore.add(title);
       } catch (MalformedURLException urlexception) {
           urlexception.printStackTrace();
       }
       ++counter;
       title=getParameter("title"+counter);
   }
   
   }
    
}
