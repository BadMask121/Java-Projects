 package shop;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Cms extends javax.swing.JFrame {
    
Color c,active;
Font overfont,outfont;

public makepurchasemain make; 
public viewpage view;
  private Container contain;
    JLabel openclose;
    /**
     * Creates new form shopacemain
     */
    public Cms() {
   
     c = new  Color(66, 22, 60);
     active = new Color(98,55,92);
     overfont= new Font("Gill Sans MT", Font.PLAIN,20);
     outfont = new Font("Gill Sans MT", Font.PLAIN,18);
        initComponents();
        
                this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);  

prop.setPreferredSize(getMaximumSize());
closemenu.setVisible(false);

    }
    
    public void Slideshow(){
        new Thread(){
    int count;
@Override
public void run(){
    try {
      for( double i = 0; i<=210;i++){
         appmenu.setVisible(true);
          appmenu.setSize((int)i, 900);
          
          dashboard.setText("Account Overview");
          makepurchase.setText("Add Sales");
          additem.setText("Insert Activity");
           viewsales.setText("View Sales");
           
           jLabel4.setVisible(true);
           jSeparator1.setVisible(true);
           jSeparator2.setVisible(true);
           jSeparator3.setVisible(true);
          
           
           dashboard.setSize(210, 46);
           makepurchase.setSize(210, 46);
           additem.setSize(210, 46);
           viewsales.setSize(210, 46);
    
           prop.setLocation((int)i, prop.getY());
            
            openclosepanel.setSize(50, openclosepanel.getY());
           
            Thread.sleep(2);
  mainpanel.updateUI();
      }
        
    } catch (Exception e) {
    }
}
}.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        mainpanel = new javax.swing.JLayeredPane();
        appmenu = new javax.swing.JPanel();
        dashboard = new javax.swing.JLabel();
        viewsales = new javax.swing.JLabel();
        additem = new javax.swing.JLabel();
        makepurchase = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        toolbar = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        prop = new javax.swing.JPanel();
        count2 = new javax.swing.JLabel();
        count3 = new javax.swing.JLabel();
        count1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        openclosepanel = new javax.swing.JPanel();
        closemenu = new javax.swing.JLabel();
        openmenu = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newitem = new javax.swing.JMenuItem();
        openfile = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenuItem();
        exitpage = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Covenant Plus CMS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1386, 1000));
        setSize(new java.awt.Dimension(1386, 1000));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        mainpanel.setBackground(new java.awt.Color(255, 255, 255));
        mainpanel.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        mainpanel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mainpanelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mainpanelFocusLost(evt);
            }
        });

        appmenu.setBackground(new java.awt.Color(70, 23, 70));
        appmenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 1, 1));
        appmenu.setToolTipText("");
        appmenu.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        appmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                appmenuMouseEntered(evt);
            }
        });
        appmenu.setLayout(null);

        dashboard.setBackground(new java.awt.Color(70, 23, 70));
        dashboard.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        dashboard.setForeground(new java.awt.Color(195, 195, 196));
        dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/account.png"))); // NOI18N
        dashboard.setLabelFor(appmenu);
        dashboard.setToolTipText("Dashboard");
        dashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboard.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        dashboard.setNextFocusableComponent(mainpanel);
        dashboard.setOpaque(true);
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardMouseExited(evt);
            }
        });
        appmenu.add(dashboard);
        dashboard.setBounds(2, 2, 50, 40);

        viewsales.setBackground(new java.awt.Color(70, 23, 70));
        viewsales.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        viewsales.setForeground(new java.awt.Color(195, 195, 196));
        viewsales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewsales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/view.png"))); // NOI18N
        viewsales.setLabelFor(appmenu);
        viewsales.setToolTipText("remove products from product list");
        viewsales.setAlignmentY(0.0F);
        viewsales.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        viewsales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewsales.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        viewsales.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        viewsales.setIconTextGap(10);
        viewsales.setNextFocusableComponent(mainpanel);
        viewsales.setOpaque(true);
        viewsales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewsalesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewsalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewsalesMouseExited(evt);
            }
        });
        appmenu.add(viewsales);
        viewsales.setBounds(0, 220, 50, 40);

        additem.setBackground(new java.awt.Color(70, 23, 70));
        additem.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        additem.setForeground(new java.awt.Color(195, 195, 196));
        additem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        additem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trolley.png"))); // NOI18N
        additem.setLabelFor(appmenu);
        additem.setToolTipText("Add product to list");
        additem.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        additem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        additem.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        additem.setNextFocusableComponent(mainpanel);
        additem.setOpaque(true);
        additem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                additemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                additemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                additemMouseExited(evt);
            }
        });
        appmenu.add(additem);
        additem.setBounds(2, 88, 50, 40);

        makepurchase.setBackground(new java.awt.Color(70, 23, 70));
        makepurchase.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        makepurchase.setForeground(new java.awt.Color(195, 195, 196));
        makepurchase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        makepurchase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cash-register (1).png"))); // NOI18N
        makepurchase.setLabelFor(appmenu);
        makepurchase.setToolTipText("Make Purchase");
        makepurchase.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        makepurchase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        makepurchase.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        makepurchase.setNextFocusableComponent(mainpanel);
        makepurchase.setOpaque(true);
        makepurchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                makepurchaseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                makepurchaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                makepurchaseMouseExited(evt);
            }
        });
        appmenu.add(makepurchase);
        makepurchase.setBounds(2, 45, 50, 40);

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 110));
        jLabel4.setText("Copyright Ace Corps Inc. All Right Reserved.");
        appmenu.add(jLabel4);
        jLabel4.setBounds(2, 547, 239, 16);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setRequestFocusEnabled(false);
        jSeparator1.setVerifyInputWhenFocusTarget(false);
        appmenu.add(jSeparator1);
        jSeparator1.setBounds(8, 42, 244, 3);
        jSeparator1.getAccessibleContext().setAccessibleName("");
        jSeparator1.getAccessibleContext().setAccessibleDescription("");

        appmenu.add(jSeparator2);
        jSeparator2.setBounds(28, 85, 201, 3);
        jSeparator2.getAccessibleContext().setAccessibleName("");
        jSeparator2.getAccessibleContext().setAccessibleDescription("");

        appmenu.add(jSeparator3);
        jSeparator3.setBounds(59, 128, 139, 2);
        jSeparator3.getAccessibleContext().setAccessibleName("");
        jSeparator3.getAccessibleContext().setAccessibleDescription("");

        toolbar.setBackground(new java.awt.Color(125, 65, 65));
        toolbar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(149, 83, 83), new java.awt.Color(149, 83, 83)));

        login.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        login.setForeground(new java.awt.Color(23, 56, 19));
        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/account (1).png"))); // NOI18N
        login.setToolTipText("");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        login.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/shop/users.png"))); // NOI18N
        login.setIconTextGap(10);
        login.setInheritsPopupMenu(false);
        login.setNextFocusableComponent(dashboard);
        login.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginFocusLost(evt);
            }
        });
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 204));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/content logo.png"))); // NOI18N
        jLabel9.setText("Covenant Plus Enterise (MIMI Purified Water)");

        javax.swing.GroupLayout toolbarLayout = new javax.swing.GroupLayout(toolbar);
        toolbar.setLayout(toolbarLayout);
        toolbarLayout.setHorizontalGroup(
            toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolbarLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 697, Short.MAX_VALUE)
                .addComponent(login)
                .addGap(163, 163, 163))
        );
        toolbarLayout.setVerticalGroup(
            toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        prop.setBackground(new java.awt.Color(255, 255, 255));
        prop.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 245, 254), new java.awt.Color(255, 255, 255)));
        prop.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                propFocusLost(evt);
            }
        });

        count2.setBackground(new java.awt.Color(30, 156, 219));
        count2.setOpaque(true);

        count3.setBackground(new java.awt.Color(241, 249, 11));
        count3.setOpaque(true);

        count1.setBackground(new java.awt.Color(102, 242, 125));
        count1.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        count1.setForeground(new java.awt.Color(102, 102, 102));
        count1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/percentage (2).png"))); // NOI18N
        count1.setText("Sales");
        count1.setOpaque(true);
        count1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                count1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                count1MouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Account");
        jLabel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel2.setIconTextGap(10);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Activities");
        jLabel3.setToolTipText("");
        jLabel3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel3.setIconTextGap(10);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout propLayout = new javax.swing.GroupLayout(prop);
        prop.setLayout(propLayout);
        propLayout.setHorizontalGroup(
            propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(propLayout.createSequentialGroup()
                .addGroup(propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(propLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(propLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(count1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(count2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(count3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(propLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(propLayout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(218, 218, 218))
        );
        propLayout.setVerticalGroup(
            propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(propLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(count1)
                    .addComponent(count2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(propLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(count3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        openclosepanel.setBackground(new java.awt.Color(102, 0, 102));

        closemenu.setForeground(new java.awt.Color(255, 255, 255));
        closemenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/multiply.png"))); // NOI18N
        closemenu.setText(".");
        closemenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closemenu.setIconTextGap(20);
        closemenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closemenuMouseClicked(evt);
            }
        });

        openmenu.setForeground(new java.awt.Color(255, 255, 255));
        openmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu (4).png"))); // NOI18N
        openmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        openmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openmenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                openmenuMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout openclosepanelLayout = new javax.swing.GroupLayout(openclosepanel);
        openclosepanel.setLayout(openclosepanelLayout);
        openclosepanelLayout.setHorizontalGroup(
            openclosepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(openclosepanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(closemenu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(openmenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        openclosepanelLayout.setVerticalGroup(
            openclosepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, openclosepanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(openclosepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closemenu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        openclosepanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {closemenu, openmenu});

        mainpanel.setLayer(appmenu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainpanel.setLayer(toolbar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainpanel.setLayer(prop, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainpanel.setLayer(openclosepanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(openclosepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(prop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanelLayout.createSequentialGroup()
                .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addComponent(openclosepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(appmenu, javax.swing.GroupLayout.DEFAULT_SIZE, 1806, Short.MAX_VALUE))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addComponent(prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 600;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(mainpanel, gridBagConstraints);

        jMenuBar1.setBackground(new java.awt.Color(51, 153, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenuBar1.setForeground(new java.awt.Color(102, 51, 255));
        jMenuBar1.setToolTipText("");
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jMenuBar1.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N

        jMenu1.setText("File");

        newitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newitem.setBackground(new java.awt.Color(0, 0, 204));
        newitem.setText("New Purchase");
        newitem.setOpaque(false);
        jMenu1.add(newitem);

        openfile.setText("Open file");
        openfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openfileActionPerformed(evt);
            }
        });
        jMenu1.add(openfile);

        logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout (3).png"))); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenu1.add(logout);

        exitpage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        exitpage.setText("Exit");
        exitpage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitpageActionPerformed(evt);
            }
        });
        jMenu1.add(exitpage);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseEntered
   
   //dashboard.setFont(this.overfont);
   
   if(dashboard.getBackground()==active){
   dashboard.setBackground(this.active);
   }else{
   dashboard.setBackground(this.c);
   }

    }//GEN-LAST:event_dashboardMouseEntered

    private void dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseExited
   //dashboard.setFont( this.outfont);
if( dashboard.getBackground()==active){
 dashboard.setBackground(active);
}else{
dashboard.setBackground(null);
}
    }//GEN-LAST:event_dashboardMouseExited

    private void makepurchaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_makepurchaseMouseEntered
//       makepurchase.setFont( new Font("Gill Sans MT", Font.PLAIN,20));
//       jSeparator2.setPreferredSize(jSeparator1.getPreferredSize());
   if(makepurchase.getBackground()==active){
   makepurchase.setBackground(this.active);
   }else{
   makepurchase.setBackground(this.c);
   }
    }//GEN-LAST:event_makepurchaseMouseEntered

    private void makepurchaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_makepurchaseMouseExited
  //     makepurchase.setFont( new Font("Gill Sans MT", Font.PLAIN,18));
if( makepurchase.getBackground()==active){
 makepurchase.setBackground(active);
}else{
makepurchase.setBackground(null);
}
    }//GEN-LAST:event_makepurchaseMouseExited

    private void additemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_additemMouseEntered
    //     additem.setFont( new Font("Gill Sans MT", Font.PLAIN,20));
          additem.setBackground(this.c);
    }//GEN-LAST:event_additemMouseEntered

    private void additemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_additemMouseExited
      //      additem.setFont( new Font("Gill Sans MT", Font.PLAIN,18));
             additem.setBackground(null);
    }//GEN-LAST:event_additemMouseExited

    private void viewsalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewsalesMouseEntered
        //      viewsales.setFont( new Font("Gill Sans MT", Font.PLAIN,20));
   
   if(viewsales.getBackground()==active){
   viewsales.setBackground(this.active);
   }else{
   viewsales.setBackground(c);
   }
    }//GEN-LAST:event_viewsalesMouseEntered

    private void viewsalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewsalesMouseExited
          //     viewsales.setFont( new Font("Gill Sans MT", Font.PLAIN,18));
            //   viewsales.setBackground(null);
            if( viewsales.getBackground()==active){
 viewsales.setBackground(active);
}else{
viewsales.setBackground(null);
}
    }//GEN-LAST:event_viewsalesMouseExited

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
 
        this.Slideshow();
prop.setVisible(true);
prop.removeAll();
if(prop.getComponentCount() <=0){

    prop.setLayout( new BorderLayout());
prop.add(count1);
prop.add(count2);
prop.add(count3);
prop.add(jLabel2);
prop.add(jLabel3);
prop.add(jTextField1);
prop.add(jTable1,BorderLayout.SOUTH);

repaint();
}else{

new makepurchasemain().setVisible(false);
dashboard.setBackground(this.active);
makepurchase.setBackground(null);
viewsales.setBackground(null);

    }

        repaint();
    
        mainpanel.updateUI();
//view.setVisible(false);
    }//GEN-LAST:event_dashboardMouseClicked

    private void makepurchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_makepurchaseMouseClicked
       
        this.Slideshow();
        prop.setVisible(true);  
        
        dashboard.setBackground(null);
        additem.setBackground(null);
        viewsales.setBackground(null);
        makepurchase.setBackground(this.active);  

        prop.removeAll();
   
        if(prop.getComponentCount() <=0){
           this.make = new makepurchasemain();
          prop.setLayout(new BorderLayout());
             prop.add(make,BorderLayout.CENTER);
        }     
        mainpanel.updateUI();
        repaint();
    }//GEN-LAST:event_makepurchaseMouseClicked

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged

    }//GEN-LAST:event_formWindowStateChanged

    private void additemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_additemMouseClicked
  new makepurchasemain().setVisible(false);
  new viewpage().setVisible(false);
  mainpanel.updateUI();
    }//GEN-LAST:event_additemMouseClicked

    private void viewsalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewsalesMouseClicked
 
prop.removeAll();
if(prop.getComponentCount() <=0)
{
 view = new viewpage();        
 view.setBackground(prop.getBackground());
prop.setLayout( new BorderLayout());
prop.add(view,BorderLayout.CENTER);

}else{
  makepurchase.setBackground(null);
        dashboard.setBackground(null);
        additem.setBackground(null);    
        viewsales.setBackground(this.active);
       new makepurchasemain().setVisible(false);
}
            
    }//GEN-LAST:event_viewsalesMouseClicked

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered

        if(!login.getText().isEmpty()){
                Font font = new Font("Candara", 0, 15);

Map attributes = font.getAttributes();
attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
login.setFont(font.deriveFont(attributes));
        }
        
mainpanel.updateUI();     
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited

        if(!login.getText().isEmpty()){
        
        Font font = new Font("Candara", 0, 15);
Map attributes = font.getAttributes();
attributes.clear();
login.setFont(font.deriveFont(attributes));   
        }
mainpanel.updateUI();

    }//GEN-LAST:event_loginMouseExited

    private void propFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_propFocusLost

    }//GEN-LAST:event_propFocusLost

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
    }//GEN-LAST:event_formFocusLost

    private void openfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openfileActionPerformed

    private void exitpageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitpageActionPerformed
       int h =JOptionPane.showConfirmDialog(null, "Exiting Covenant Plus CMS?","Exiting...",JOptionPane.INFORMATION_MESSAGE,JOptionPane.YES_NO_OPTION);
       
       if(h==JOptionPane.YES_OPTION){
       System.exit(0);
       }else if(h==JOptionPane.NO_OPTION){
    //do nothing
    }
    }//GEN-LAST:event_exitpageActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
     this.dispose();
     new login().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void closemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closemenuMouseClicked

     try {
        
      for( double i = 0; i<=56;i++){
         appmenu.setVisible(true);
          appmenu.setSize((int)i++, 900);
//jPanel1.setSize(1140, jPanel1.getHeight());     
          
          dashboard.setText("");
          makepurchase.setText("");
          additem.setText("");
           viewsales.setText("");
           
           jLabel4.setVisible(true);
           jSeparator1.setVisible(true);
           jSeparator2.setVisible(true);
           jSeparator3.setVisible(true);
                 
           dashboard.setSize(50, 46);
           makepurchase.setSize(50, 46);
           additem.setSize(50, 46);
           viewsales.setSize(50, 46);
           
           openclosepanel.setSize(56, openclosepanel.getY());
           prop.setLocation(50, prop.getY());
           openmenu.setLocation(8, openmenu.getY());

count1.setLocation(211, count1.getY());
count2.setLocation(537, count2.getY());
count3.setLocation(863, count3.getY());
    
Thread.sleep(6);
      }
        
    } catch (Exception e) {
    }
        //appmenu.setVisible(false);        
//closemenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back-arrow.png")));
closemenu.setVisible(false);
openmenu.setVisible(true);

mainpanel.updateUI();
//openclosepanel.setBackground(Color.white);
    }//GEN-LAST:event_closemenuMouseClicked

    private void openmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openmenuMouseClicked

this.Slideshow();

//closemenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back-arrow.png")));
closemenu.setVisible(true);
openmenu.setVisible(false);
//openclosepanel.setBackground(new Color(153,153,153));

count1.setLocation(180, count1.getY());
count2.setLocation(490, count2.getY());
count3.setLocation(790, count3.getY());
    }//GEN-LAST:event_openmenuMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
   
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        if(isVisible()){
        ImageIcon icon = new ImageIcon(getClass().getResource("/ico/Shutdown_25px.png"));
        int h =JOptionPane.showConfirmDialog(null, "Exiting Covenant Plus CMS?","Exiting...",JOptionPane.INFORMATION_MESSAGE,JOptionPane.YES_NO_OPTION,icon);
       
       if(h==JOptionPane.YES_OPTION){
       System.exit(0);
       }else if(h==JOptionPane.NO_OPTION){
   
    }
        }
        
      
    }//GEN-LAST:event_formWindowClosing

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        
    }//GEN-LAST:event_loginMouseClicked

    private void loginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginFocusGained

    }//GEN-LAST:event_loginFocusGained

    private void loginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginFocusLost


    }//GEN-LAST:event_loginFocusLost

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void openmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openmenuMouseEntered

    }//GEN-LAST:event_openmenuMouseEntered

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
this.setFocusable(true);
this.setFocusableWindowState(true);

            
    }//GEN-LAST:event_formMouseEntered

    private void count1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_count1MouseEntered
        try {
            Thread.sleep(200);

            count1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/percentage (1).png")));
            count1.setBackground(new Color(96,225,118));
        } catch (InterruptedException ex) {
        }
    }//GEN-LAST:event_count1MouseEntered

    private void count1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_count1MouseExited
        try {
            Thread.sleep(200);
            count1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/percentage (2).png")));
            count1.setBackground(new Color(102,242,125));
        } catch (InterruptedException ex) {
        }
    }//GEN-LAST:event_count1MouseExited

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
    }//GEN-LAST:event_formFocusGained

    private void appmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appmenuMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_appmenuMouseEntered

    private void mainpanelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mainpanelFocusGained
    }//GEN-LAST:event_mainpanelFocusGained

    private void mainpanelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mainpanelFocusLost
    }//GEN-LAST:event_mainpanelFocusLost

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel additem;
    private javax.swing.JPanel appmenu;
    private javax.swing.JLabel closemenu;
    private javax.swing.JLabel count1;
    private javax.swing.JLabel count2;
    private javax.swing.JLabel count3;
    private javax.swing.JLabel dashboard;
    private javax.swing.JMenuItem exitpage;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JLabel login;
    private javax.swing.JMenuItem logout;
    protected javax.swing.JLayeredPane mainpanel;
    private javax.swing.JLabel makepurchase;
    private javax.swing.JMenuItem newitem;
    private javax.swing.JPanel openclosepanel;
    private javax.swing.JMenuItem openfile;
    private javax.swing.JLabel openmenu;
    private javax.swing.JPanel prop;
    private javax.swing.JPanel toolbar;
    private javax.swing.JLabel viewsales;
    // End of variables declaration//GEN-END:variables
}
