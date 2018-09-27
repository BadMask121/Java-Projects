import java.awt.event.*;import javax.swing.*; import java.awt.*;import javax.swing.ImageIcon;import java.io.*;import java.io.BufferedReader;
import java.io.FileReader;import javax.swing.event.*;import java.util.Calendar;import java.awt.BorderLayout;import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;import java.awt.event.KeyEvent;import javax.swing.BorderFactory;import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;import javax.swing.SwingUtilities;import javax.swing.border.EtchedBorder;import java.io.File;import java.io.IOException;
import java.io.BufferedReader;import javax.imageio.ImageIO;import java.awt.Toolkit;

public class incognito extends javax.swing.JFrame { 	
    
    private Toolkit toolkit;
   	Timer timer;
   	static String times;
   	static String named;
   	
   	static String TempPath = "res/src/startupmes";
   	static String mes;
   	static String Me;
   	static JFrame mainframe;
   	static String PathHolder,myConPath;
   	
   	static JButton btn_send;
    static JMenuBar jMenuBar1;
    static JScrollPane jScrollPane1;
    static JScrollPane jScrollPane2;
    static JMenu menu_about;
    static JMenuItem menu_about_dev;
    static JMenuItem menu_about_gI;
    static JMenu menu_file;
    static JMenuItem menu_file_conn;
    static JMenu menu_file_Private;
    static JMenuItem priv_join,priv_create;
    static JMenuItem menu_file_export;
    static JMenu menu_file_myacc;
    static JMenuItem menu_file_myacc_Createnew;
    static JMenuItem menu_file_myacc_SignIn;
    static JMenuItem menu_sys_ex;
    static JMenuItem menu_sys_logout;
    static JMenu menu_system;
    static JMenu menu_tools;
    static JMenuItem menu_tools_calc;
    static JMenuItem menu_tools_note;
    static JTextArea txt_chatarea;
    static JTextArea txt_textArea;
    
    static JButton login_btn_go;
    static JLabel login_lab_pass;
    static JLabel login_lab_user;
    static JPanel login_panel;
    static JPasswordField login_txt_pass;
    static JTextField login_txt_user;
    static JFrame login_frame;
    
    static JButton create_btn_createAcc;
    static JLabel create_lab_ID;
    static JLabel create_lab_pass;
    static JLabel create_lab_user;
    static JPanel create_panel;
    static JTextField create_txt_ID;
    static JPasswordField create_txt_pass;
    static JTextField create_txt_user;
    static JFrame create_frame;
    
    static JFrame devframe;
    ImageIcon image;
	JLabel statslab; 
	
	 static JFrame privFrame;
	 static Button priv_btn_go,priv_ntn_path;
	 static TextField chatName,privPath;
	 static Panel privPanel;
    static String privChatName,privChatPath;
    
    public incognito() 
    {
    	LogInComponents();
    	create_acc(); 
    	initComponents(); 
    	
    } 
    
    //========================================================================================================================================
    static void timer()
	{
		try
		{
			times = "";
        
        javax.swing.Timer t = new javax.swing.Timer(1000,new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
   				String am_pm;
   				Calendar now = Calendar.getInstance();
                int h = now.get(Calendar.HOUR_OF_DAY);
                int m = now.get(Calendar.MINUTE);
                int s = now.get(Calendar.SECOND);
                times = "[ " + h + ":" + m + ":" + s + " ]"; 
                try
				{
					
					txt_chatarea.setText(""); 
					BufferedReader bufferedReader = new BufferedReader(new FileReader(TempPath));
					String line = bufferedReader.readLine();
					while (line != null)
					{
						try
						{
							txt_chatarea.append(line+"\n");
							line = bufferedReader.readLine();
						}catch(Exception er){
							
						}
					}
				}
				catch(Exception er)
				{
					txt_chatarea.setText(" Connection path must be established !"); 
					TempPath = "res/src/startupmes"; 
					er.printStackTrace();
				}
                
            }
	        });
	        t.start();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
    @SuppressWarnings("unchecked")  
    
    //========================================================================================================================================
    private void create_acc() {
    	
		create_frame = new javax.swing.JFrame();
        create_panel = new javax.swing.JPanel();
        create_lab_user = new javax.swing.JLabel();
        create_lab_pass = new javax.swing.JLabel();
        create_lab_ID = new javax.swing.JLabel();
        create_txt_user = new javax.swing.JTextField();
        create_txt_pass = new javax.swing.JPasswordField();
        create_txt_ID = new javax.swing.JTextField();
        create_btn_createAcc = new javax.swing.JButton();

        create_frame.setResizable(false);

        create_lab_user.setText("Username : ");
		create_lab_user.setFont(new java.awt.Font("Segoe UI", 0, 11));
        create_lab_pass.setText("Password :");
		create_lab_pass.setFont(new java.awt.Font("Segoe UI", 0, 11));
        create_lab_ID.setText("Account ID :");
		create_lab_ID.setFont(new java.awt.Font("Segoe UI", 0, 11));
		
        create_btn_createAcc.setText("Create Account");

        javax.swing.GroupLayout create_panelLayout = new javax.swing.GroupLayout(create_panel);
        create_panel.setLayout(create_panelLayout);
        create_panelLayout.setHorizontalGroup(create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(create_panelLayout.createSequentialGroup().addContainerGap().addGroup(create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(create_btn_createAcc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(create_panelLayout.createSequentialGroup().addComponent(create_lab_user).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE).addComponent(create_txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, create_panelLayout.createSequentialGroup().addGroup(create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(create_lab_pass).addComponent(create_lab_ID)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(create_txt_pass).addComponent(create_txt_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)))).addContainerGap()));
        create_panelLayout.setVerticalGroup(
            create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(create_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create_lab_user)
                    .addComponent(create_txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create_lab_pass)
                    .addComponent(create_txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create_lab_ID)
                    .addComponent(create_txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(create_btn_createAcc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(create_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(create_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
          
        create_panel.add(create_lab_user);
        create_panel.add(create_txt_user);
        create_panel.add(create_lab_pass);
        create_panel.add(create_txt_pass);
        create_panel.add(create_lab_ID);
        create_panel.add(create_txt_ID); 
        create_frame.add(create_btn_createAcc);
        create_frame.add(create_panel);
        
		create_frame.setVisible(false);
        create_frame.pack();
        	create_btn_createAcc.addActionListener(new ActionListener()
        	{
        		@Override
	            public void actionPerformed(ActionEvent event)
	            {
	            	createaccount();
	            	menu_file_conn.setEnabled(true);
	            }
	         });
    }
    //========================================================================================================================================
    private void LogInComponents() {

		login_frame = new javax.swing.JFrame();
		login_frame.setLocation(200,300);
        login_panel = new javax.swing.JPanel();
        login_btn_go = new javax.swing.JButton();
        login_btn_go.addActionListener(new ActionListener() 
        {
        	public void actionPerformed(ActionEvent e) 
        	{
        		signin();	
        	}
        }); 
     
        login_lab_user = new javax.swing.JLabel();
        login_lab_pass = new javax.swing.JLabel();
        login_txt_user = new javax.swing.JTextField();
        login_txt_pass = new javax.swing.JPasswordField();
 		
        login_frame.setTitle("Log In");
        login_frame.setResizable(false);

        login_btn_go.setText("Ok");

        login_lab_user.setFont(new java.awt.Font("Segoe UI", 0, 11));
        login_lab_user.setText("Username :");

        login_lab_pass.setFont(new java.awt.Font("Segoe UI", 0, 11));
        login_lab_pass.setText("Password :");

        javax.swing.GroupLayout login_panelLayout = new javax.swing.GroupLayout(login_panel);
        login_panel.setLayout(login_panelLayout);
        login_panelLayout.setHorizontalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(login_btn_go, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, login_panelLayout.createSequentialGroup()
                        .addComponent(login_lab_user)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(login_txt_user, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, login_panelLayout.createSequentialGroup()
                        .addComponent(login_lab_pass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(login_txt_pass)))
                .addContainerGap())
        );
        login_panelLayout.setVerticalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_panelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_lab_user)
                    .addComponent(login_txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_lab_pass)
                    .addComponent(login_txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_btn_go)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        login_panel.add(login_lab_user);
        login_panel.add(login_txt_user);
        login_panel.add(login_lab_pass);
        login_panel.add(login_txt_user);
		login_frame.add(login_panel);
        login_frame.pack();
        login_frame.setVisible(false);
    }
    
    //========================================================================================================================================
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txt_chatarea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_textArea = new javax.swing.JTextArea();
        btn_send = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_file = new javax.swing.JMenu();
        menu_file_myacc = new javax.swing.JMenu();
        menu_file_myacc_SignIn = new javax.swing.JMenuItem();
        menu_file_myacc_Createnew = new javax.swing.JMenuItem();
        menu_file_conn = new javax.swing.JMenuItem();
        menu_file_export = new javax.swing.JMenuItem();
        menu_file_export.setEnabled(false);
        menu_tools = new javax.swing.JMenu();
        menu_tools_calc = new javax.swing.JMenuItem();
        menu_tools_note = new javax.swing.JMenuItem();
        menu_about = new javax.swing.JMenu();
        menu_about_gI = new javax.swing.JMenuItem();
        menu_about_dev = new javax.swing.JMenuItem();
        menu_system = new javax.swing.JMenu();
        menu_sys_logout = new javax.swing.JMenuItem();
        menu_sys_ex = new javax.swing.JMenuItem();
        
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize(); 
		int width = 400;
		int height = 225;
		int x = (screen.width-width)/2;
		int y = (screen.height-height)/2;
		setLocation(x,y); 
		
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Go Incognito");
        setResizable(false);

        txt_chatarea.setBackground(new java.awt.Color(0, 0, 0));
        txt_chatarea.setColumns(20);
        txt_chatarea.setFont(new java.awt.Font("Segoe UI", 0, 13));
        txt_chatarea.setForeground(new java.awt.Color(255, 255, 255));
        txt_chatarea.setRows(5);
        txt_chatarea.setEnabled(false);
        jScrollPane1.setViewportView(txt_chatarea);
		timer();
        txt_textArea.setColumns(20);
        txt_textArea.setFont(new java.awt.Font("Segoe UI", 2, 13));
        txt_textArea.setForeground(new java.awt.Color(51, 51, 51));
        txt_textArea.setRows(5); 
        jScrollPane2.setViewportView(txt_textArea);
		
        btn_send.setText("SEND");
         
        btn_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendActionPerformed(evt);
            }
        });

        menu_file.setText("File");

        menu_file_myacc.setText("My Account");

        menu_file_myacc_SignIn.setText("Sign in");
        menu_file_myacc_SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_file_myacc_SignInActionPerformed(evt);
            }
        });
        menu_file_myacc.add(menu_file_myacc_SignIn);

        menu_file_myacc_Createnew.setText("Create my new account");
        menu_file_myacc_Createnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_file_myacc_CreatenewActionPerformed(evt);
            }
        });
        menu_file_myacc.add(menu_file_myacc_Createnew);

        menu_file.add(menu_file_myacc);

        menu_file_conn.setText("My Connection");
        menu_file_conn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_file_connActionPerformed(evt);
            }
        });
        menu_file.add(menu_file_conn);
  		menu_file_Private = new javax.swing.JMenu();
  		menu_file_Private.setText("Private Chat");
  		priv_create = new javax.swing.JMenuItem();
  		priv_create.setText("Create Chat Group");
  		create_frame.pack();
        priv_create.addActionListener(new ActionListener()
        {
        	@Override
	        public void actionPerformed(ActionEvent event)
	        {
	        	priv_create();
	        }
	         
	    });
	   
  		priv_join = new javax.swing.JMenuItem();
  		priv_join.setText("Join Chat Group");
  		priv_join.addActionListener(new ActionListener()
        {
        	@Override
	        public void actionPerformed(ActionEvent event)
	        {
	        	priv_join();
	        }
	         
	    });
  		menu_file_Private.setEnabled(false);
    	menu_file.add(menu_file_Private);
    	menu_file_Private.add(priv_create);
    	menu_file_Private.add(priv_join);
        menu_file_export.setText("Export my History");
        menu_file_export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_file_exportActionPerformed(evt);
            }
        });
        menu_file.add(menu_file_export);

        jMenuBar1.add(menu_file);

        menu_tools.setText("Tools");

        menu_tools_calc.setText("Calculator");
        menu_tools_calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_tools_calcActionPerformed(evt);
            }
        });
        menu_tools.add(menu_tools_calc);

        menu_tools_note.setText("Notepad");
        menu_tools_note.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_tools_noteActionPerformed(evt);
            }
        });
        menu_tools.add(menu_tools_note);

        jMenuBar1.add(menu_tools);

        menu_about.setText("About");

        menu_about_gI.setText("GoIncognito");
        menu_about_gI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_about_gIActionPerformed(evt);
            }
        });
        menu_about.add(menu_about_gI);

        menu_about_dev.setText("Developer");
        menu_about_dev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_about_devActionPerformed(evt);
            }
        });
        menu_about.add(menu_about_dev);

        jMenuBar1.add(menu_about);

        menu_system.setText("System");

        menu_sys_logout.setText("Logout");
        menu_sys_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_sys_logoutActionPerformed(evt);
            }
        });
        menu_system.add(menu_sys_logout);

        menu_sys_ex.setText("Exit application");
        menu_sys_ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_sys_exActionPerformed(evt);
            }
        });
        menu_system.add(menu_sys_ex);

        jMenuBar1.add(menu_system);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_send, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_send, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
		menu_file_conn.setEnabled(false);
		btn_send.setEnabled(false);
    	toolkit = this.getToolkit();
    	toolkit.beep();
        pack();
        
    } 

    private void btn_sendActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	sender();
    }

    private void menu_file_myacc_SignInActionPerformed(java.awt.event.ActionEvent evt)
    { 
    	login_txt_user.setText("");
    	login_txt_pass.setText("");
    	login_frame.setVisible(true);
    } 

    private void menu_file_myacc_CreatenewActionPerformed(java.awt.event.ActionEvent evt)
    {
    	create_txt_user.setText("");
    	create_txt_pass.setText("");
    	create_txt_ID.setText("");
    	create_frame.setVisible(true);
    }

    private void menu_file_connActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	conOpen();
    }

    private void menu_file_exportActionPerformed(java.awt.event.ActionEvent evt) 
    { 

    }
//calculator
    private void menu_tools_calcActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	Runtime rs = Runtime.getRuntime();
	            	try
	            	{
	            		rs.exec("calc");
	            	}
	            	catch(Exception er)
	            	{
	            		JOptionPane.showMessageDialog(null,
						"Calculator is corrupted or uninstalled in this unit.");
	            	}
    } 
    
    private void menu_tools_noteActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	Runtime rs = Runtime.getRuntime();
	            	try
	            	{
	            		rs.exec("notepad");
	            	}
	            	catch(Exception er)
	            	{
	            		JOptionPane.showMessageDialog(null,
						"Notepad is corrupted or uninstalled in this unit.");
	            	}
    }
    
    private void menu_about_gIActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	JOptionPane.showMessageDialog(null,
		"Software : GoIncognito\nDate Published : March 20, 2017\nVersion : v1.7\nProgrammer : Arnold Elacion Jr");
    }

    private void menu_about_devActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	aboutdev();
    }

    private void menu_sys_logoutActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	
    	logout();	
    }

    private void menu_sys_exActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	int dialog;
    	dialog = JOptionPane.showConfirmDialog(null,"Are you sure ?","Warning",JOptionPane.YES_NO_OPTION);	
						if(dialog == JOptionPane.YES_OPTION)
						{
		            	try
						{
		        			mes =txt_chatarea.getText();
							txt_chatarea.setText("");		
							mes =  mes +"\n "+" "+times+"\n "+Me+ " has left the chat";
							
							BufferedWriter writer = null;
							try
							{
							    writer = new BufferedWriter( new FileWriter(PathHolder+"/conchat"));
							    writer.write(mes +"");
							    writer.newLine();
							    
							}
							catch ( IOException e)
							{
								    	
							}
							finally
							{
								try
							    {
							        if ( writer != null)
							        writer.close( );
							     }
							     catch(Exception er)
							     {
							     }
							      
							}
	
							FileReader reader = new FileReader(TempPath+"/conchat");
							BufferedReader bufferedReader = new BufferedReader(new FileReader(TempPath+"/conchat"));
							String line = bufferedReader.readLine();
							while (line != null)
							{
								txt_chatarea.append(line+"\n");
								line = bufferedReader.readLine();
							}
						}
						catch(Exception er)
						{
							er.printStackTrace();
						}
						System.exit(0);
		            }
		            else
		         {
		         	//do nothing for dialog no
		         }
    }
    
 	//========================================================================================================================================
    public static void main(String args[]) 
    { 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(incognito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(incognito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(incognito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(incognito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new incognito().setVisible(true);
            }
        });
    } 
     //========================================================================================================================================
     private void conOpen(){
		final JFileChooser fileDialog = new JFileChooser();
		
		menu_file_conn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				fileDialog.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int returnVal = fileDialog.showOpenDialog(mainframe);
				
				if(returnVal == JFileChooser.APPROVE_OPTION){
					java.io.File file = fileDialog.getSelectedFile();
					PathHolder = fileDialog.getSelectedFile().getAbsolutePath();
					}
					
						try
						{
							BufferedWriter writer = null;
							try
							{ 
							    writer = new BufferedWriter( new FileWriter(myConPath));
							    writer.write(PathHolder);
							    writer.newLine(); 
							}
							catch(Exception ee)
							{
								TempPath = "res/src/startupmes"; 
								ee.printStackTrace();
							}
							finally
							{
								
							    try
							    {
							    	
							    	File file = new File (PathHolder+"/conchat");
									if(file.createNewFile())
									{ 
									
										txt_chatarea.setText("");
										TempPath = PathHolder +"/conchat";
								    	menu_file_export.setEnabled(true);
								    	btn_send.setEnabled(true);
								    	String aftermat =" "+times+"\n "+ Me + " started group chat"; 
										writer = null;
										try
										{
											//writer path here
										    writer = new BufferedWriter( new FileWriter(TempPath));
										    writer.write(aftermat);
										    writer.newLine();   
										    
										}
										catch(Exception ee)
										{
											ee.printStackTrace();
										}
										finally
										{
										    try
										    {
										        if ( writer != null)
										        writer.close( );
										    }
										    catch ( IOException eeeeee)
										    {
										    	eeeeee.printStackTrace();
										    }
										}
										
										if ( writer != null)
								        writer.close( );
									}
									else
									{ 
										
										TempPath = PathHolder +"/conchat";
								    	menu_file_export.setEnabled(true);
								    	String la;
								    	
								    	txt_chatarea.setText("");
										FileReader reader = new FileReader(TempPath);
										BufferedReader bufferedReader = new BufferedReader(new FileReader(TempPath));
										String line = bufferedReader.readLine();
										while (line != null)
										{
											txt_chatarea.append(line+"\n");
											line = bufferedReader.readLine(); 
										}
								    		
								    	la = txt_chatarea.getText();
								    	
								    	String aftermat =la+"\n "+times+"\n "+ Me + " joined the chat";
								    	writer = null;
										try
										{
											//writer path here
										    writer = new BufferedWriter( new FileWriter(TempPath));
										    writer.write(aftermat);
										    writer.newLine();   
										    
										}
										catch(Exception ee)
										{
											ee.printStackTrace();
										}
										finally
										{
										    try
										    {
										        if ( writer != null)
										        writer.close( );
										    }
										    catch ( IOException eeeeee)
										    {
										    	eeeeee.printStackTrace();
										    }
										}
								    	
								    	btn_send.setEnabled(true);
								        if ( writer != null)
								        writer.close( );
									}
							    	
							    }
							    catch ( IOException ee)
							    { 
							    	File file = new File (PathHolder+"/conchat");
									if(file.createNewFile()){ 
									}else{ 
									}
							    }
							}
						}
						catch(Exception eee)		
						{
							
							TempPath = "res/src/startupmes";
							    	
						}
				
				}
			});
		}
		private void aboutdev()
		{
			JOptionPane.showMessageDialog(null,
			"Programmer : Arnold Elacion \nYear : 1st Year, 2nd Sem - Block A\nSchool : Gordon College");
		}
		private void createaccount()
		{
			try{ 
	            		String strdirectory = create_txt_ID.getText();
	            		Me = strdirectory;
	            		boolean success = (new File("res/acc/"+strdirectory).mkdir()); 
	            	File file = new File("res/acc/"+strdirectory+"/username");
					if(file.createNewFile())
					{
							mes = create_txt_user.getText();
						
							BufferedWriter writer = null;
							try
							{
								//writer path here
							    writer = new BufferedWriter( new FileWriter("res/acc/"+strdirectory+"/username"));
							    writer.write(mes);
							    writer.newLine();
							    
							}
							catch ( IOException e)
							{

JOptionPane.showMessageDialog(null,e);
                                try{

                               BufferedWriter writ= new BufferedWriter( new FileWriter("logs.txt"));
                                writ.write(e.getMessage());
                                writ.newLine();         
                                

                                }catch(Exception ef){

JOptionPane.showMessageDialog(null,ef);
                                }
							}    
							finally
							{
								try
								    {
								        if ( writer != null)
								        writer.close( );
								    }
								    catch ( IOException e)
								    {
								    	e.printStackTrace();
								    }
							}
					}
					File file1 = new File("res/acc/"+strdirectory+"/password");
					if(file1.createNewFile())
					{
							mes = create_txt_pass.getText();
						
							BufferedWriter writer = null;
							try
							{
								//writer path here
							    writer = new BufferedWriter( new FileWriter("res/acc/"+strdirectory+"/password"));
							    writer.write(mes);
							    writer.newLine();
  								menu_file_Private.setEnabled(true);
							    
							}
							catch ( IOException e)
							{
								
JOptionPane.showMessageDialog(null,e);
							}
							finally
							{
								try
								    {
								        if ( writer != null)
								        writer.close( );
								    }
								    catch ( IOException e)
								    {

JOptionPane.showMessageDialog(null,e);
								    }
							}
						menu_file_myacc.setText("My Account : "+Me);
						JOptionPane.showMessageDialog(null,"Account Successfully Created!"); 
						named = create_txt_ID.getText();
						create_frame.setVisible(false);
					}
					else
					{
						System.out.println("Failed");
					}
					}
					catch(Exception ERr)
					{

JOptionPane.showMessageDialog(null,ERr);
					}
		}
	//========================================================================================================================================
	private void signin()
	{          try
                    {
        
		String user,pass;
				user = login_txt_pass.getText();
		    	pass = login_txt_user.getText();
		    	File folder = new File("res/acc");
				File[] listOfFiles = folder.listFiles();
				String id [] = new String[1000];
		    	for(int a = 0 ; a < listOfFiles.length ; a++)
		    	{
				   id[a] = listOfFiles[a].getName();        
				}
				for(int a = 0 ; a < listOfFiles.length ; )
				{
						BufferedReader usernamebufferedReader = new BufferedReader(new FileReader("res/acc/"+id[a]+"/username"));
						String userline = usernamebufferedReader.readLine();
						
						BufferedReader passwordbufferedReader = new BufferedReader(new FileReader("res/acc/"+id[a]+"/password"));
						String passline = passwordbufferedReader.readLine();
						
						if(user.equals(userline) && pass.equals(passline))
						{
							Me = id[a];
							JOptionPane.showMessageDialog(null,"Welcome back "+id[a]+" !");
							menu_file_myacc.setText("My Account : "+id[a]);
							a = listOfFiles.length+2;
						    login_txt_pass.setText("");
						    login_txt_user.setText("");
						   	login_frame.setVisible(false);
						    menu_file_conn.setEnabled(true);
						    menu_file_Private.setEnabled(true);
						} 	
						else
						{
							
						    login_txt_pass.setText("");
						    login_txt_user.setText("");
							a++;
						}		
				}

                    }catch(Exception er)
                    {
         JOptionPane.showMessageDialog(null,er);                            
          
                //      er.printStackTrace();   
                    }
                            

    }	
    private void sender()
    {
    				if(txt_textArea.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null,"Message must not be blank ... ");
					}
					else
					{		
						mes = txt_chatarea.getText();
						txt_chatarea.setText("");		
						mes =  mes +""+" "+times+"\n "+Me+ " : " +txt_textArea.getText()+"";
						
						BufferedWriter writer = null;
						try
						{
							//writer path here
						    writer = new BufferedWriter( new FileWriter(PathHolder+"/conchat"));
						    writer.write(mes +"");
						    writer.newLine();
						    
						}
						catch ( IOException e)
						{
							JOptionPane.showMessageDialog(null,"Please verify your connection network!");
							    	
						}
						finally
						{
						    try
						    {
						        if ( writer != null)
						        writer.close( );
						        try 
								{
						            FileReader reader = new FileReader(PathHolder+"/conchat");
						            BufferedReader bufferedReader = new BufferedReader(new FileReader(PathHolder+"/conchat"));
						            String line = bufferedReader.readLine();
					 
					            while (line != null)
					            {
					            	
					                txt_chatarea.append(line+"\n");
					                line = bufferedReader.readLine();
					            }
					            txt_textArea.setText("");
					            reader.close();
					 
					        } 
					        catch (IOException e) 
					        {
				            	e.printStackTrace();
				            	
				      		}
						    }
						    catch ( IOException e)
						    {
						    }
						}
					}
    }
	private void logout()
	{
		int dialog = JOptionPane.showConfirmDialog(null,"Are you sure ?","Warning",JOptionPane.YES_NO_OPTION);	
						if(dialog == JOptionPane.YES_OPTION)
						{
		            	try
						{
							menu_file_myacc.setText("My Account");
							menu_file_conn.setEnabled(false);
							btn_send.setEnabled(false);
    						menu_file_export.setEnabled(false);
		        			mes = txt_chatarea.getText();
							txt_chatarea.setText("");		
							mes =  mes +"\n "+" "+times+"\n "+Me+ " has left the chat";
							
							BufferedWriter writer = null;
							try
							{
							    writer = new BufferedWriter( new FileWriter(PathHolder+"/conchat"));
							    writer.write(mes +"");
							    writer.newLine();
							    
							}
							catch ( IOException e)
							{
								JOptionPane.showMessageDialog(null,"Please login to continue");
								    	
							}
							finally
							{
								try
							    {
							        if ( writer != null)
							        writer.close( );
							     }
							     catch(Exception er)
							     {
							     }
							      
							}
							TempPath = "res/startupmes";
							
							FileReader reader = new FileReader(TempPath);
							BufferedReader bufferedReader = new BufferedReader(new FileReader(TempPath));
							String line = bufferedReader.readLine();
							while (line != null)
							{
								txt_chatarea.append(line+"\n");
								line = bufferedReader.readLine();
							}
						}
						catch(Exception er)
						{
							er.printStackTrace();
						}
		            }
		            else
		         {
		         	//do nothing for dialog no
		         }
	}
	private void priv_create()
	{  
		privFrame = new JFrame();
		privFrame.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
		priv_btn_go = new Button("Create");
		priv_ntn_path = new Button("Path");
		chatName = new TextField("Private Group Chat Name Here ...");
		privPath = new TextField("Private Chat Path here...");
		privPath.setEnabled(false);
		privPanel = new Panel();
		privPanel.setLayout(new GridLayout(4,1));
		privPanel.add(chatName);
		privPanel.add(privPath);
		privPanel.add(priv_ntn_path);
		privPanel.add(priv_btn_go);
		privFrame.add(privPanel);
		privFrame.setBounds(400,100,300,150);
		privFrame.setVisible(true);
		privFrame.setResizable(false);
		 
	        
		priv_btn_go.addActionListener(new ActionListener()
        {
        	@Override
	        public void actionPerformed(ActionEvent event)
	        {
	        	if(chatName.getText().equals("") && privPath.getText().equals(""))
	        	{
	        		JOptionPane.showMessageDialog(null,"Please fill up the form"); 
	        	}
	        	else
	        	{
	        		try
	        		{
	        		File file = new File(privChatPath + "/"+chatName.getText());
		        		if(file.createNewFile())
						{
							JOptionPane.showMessageDialog(null,"Group Chat Created !"); 
							String aftermat ="\n "+times+"\n "+ Me + " started group chat named "+chatName.getText();
							BufferedWriter writer = null;
							TempPath =privChatPath + "/"+chatName.getText();
							writer = new BufferedWriter( new FileWriter(TempPath));
							writer.write(aftermat);
							writer.newLine(); 
							writer.close( );
							PathHolder = TempPath;
							menu_file_export.setEnabled(true); 
    						toolkit.beep();
						}
						
	        		}
	        		catch(Exception er)
	        		{
	        		}
	     		}
	        }
	    });
	    priv_ntn_path.addActionListener(new ActionListener()
        {
        	@Override
	        public void actionPerformed(ActionEvent event)
	        {  
				final JFileChooser fileDialog = new JFileChooser();
	        	fileDialog.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int returnVal = fileDialog.showOpenDialog(mainframe);
				
				if(returnVal == JFileChooser.APPROVE_OPTION)
				{
					java.io.File file = fileDialog.getSelectedFile();
					privChatPath = fileDialog.getSelectedFile().getAbsolutePath();
					privPath.setText(privChatPath);
				}	
 			}
	    });
	}
	private void priv_join()
	{
		final JFileChooser fileDialog = new JFileChooser();
	    int returnVal = fileDialog.showOpenDialog(mainframe);		
		if(returnVal == JFileChooser.APPROVE_OPTION)
		{
			try
			{
				java.io.File file = fileDialog.getSelectedFile();
				privChatPath = file.getAbsolutePath(); 
				TempPath = privChatPath;
				PathHolder = privChatPath;
				String aftermat =txt_chatarea.getText()+"\n "+times+"\n "+ Me + " Joined the Private Chat ";
				txt_chatarea.setText("");
				BufferedWriter writer = null;
				TempPath =privChatPath + "/"+chatName.getText();
				writer = new BufferedWriter( new FileWriter(TempPath));
				writer.write(aftermat);
				writer.newLine(); 
				writer.close( );
				menu_file_export.setEnabled(true);
				toolkit = this.getToolkit();
    			toolkit.beep();
			}
			catch(Exception er)
			{
			}
		}
	}
}
