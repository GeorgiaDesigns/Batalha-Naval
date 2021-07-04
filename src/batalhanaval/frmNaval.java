package batalhanaval;

import java.awt.Component;
import javax.swing.JButton;

public class frmNaval extends javax.swing.JFrame
{
    private GerenciamentoDoJogo gerenciador = new GerenciamentoDoJogo();
    private Tabuleiro tabuleiro = new Tabuleiro();
    
    public frmNaval() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        pnl1 = new javax.swing.JPanel();
        btn11 = new javax.swing.JButton();
        btn61 = new javax.swing.JButton();
        btn51 = new javax.swing.JButton();
        btn71 = new javax.swing.JButton();
        btn81 = new javax.swing.JButton();
        btn91 = new javax.swing.JButton();
        btn101 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn41 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn42 = new javax.swing.JButton();
        btn52 = new javax.swing.JButton();
        btn62 = new javax.swing.JButton();
        btn72 = new javax.swing.JButton();
        btn82 = new javax.swing.JButton();
        btn102 = new javax.swing.JButton();
        btn92 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn43 = new javax.swing.JButton();
        btn53 = new javax.swing.JButton();
        btn63 = new javax.swing.JButton();
        btn73 = new javax.swing.JButton();
        btn83 = new javax.swing.JButton();
        btn93 = new javax.swing.JButton();
        btn103 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn34 = new javax.swing.JButton();
        btn44 = new javax.swing.JButton();
        btn54 = new javax.swing.JButton();
        btn64 = new javax.swing.JButton();
        btn74 = new javax.swing.JButton();
        btn84 = new javax.swing.JButton();
        btn94 = new javax.swing.JButton();
        btn104 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn35 = new javax.swing.JButton();
        btn45 = new javax.swing.JButton();
        btn55 = new javax.swing.JButton();
        btn65 = new javax.swing.JButton();
        btn75 = new javax.swing.JButton();
        btn85 = new javax.swing.JButton();
        btn95 = new javax.swing.JButton();
        btn105 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        btn36 = new javax.swing.JButton();
        btn46 = new javax.swing.JButton();
        btn56 = new javax.swing.JButton();
        btn66 = new javax.swing.JButton();
        btn76 = new javax.swing.JButton();
        btn86 = new javax.swing.JButton();
        btn96 = new javax.swing.JButton();
        btn106 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn27 = new javax.swing.JButton();
        btn37 = new javax.swing.JButton();
        btn47 = new javax.swing.JButton();
        btn57 = new javax.swing.JButton();
        btn67 = new javax.swing.JButton();
        btn77 = new javax.swing.JButton();
        btn87 = new javax.swing.JButton();
        btn97 = new javax.swing.JButton();
        btn107 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn28 = new javax.swing.JButton();
        btn38 = new javax.swing.JButton();
        btn48 = new javax.swing.JButton();
        btn58 = new javax.swing.JButton();
        btn68 = new javax.swing.JButton();
        btn78 = new javax.swing.JButton();
        btn88 = new javax.swing.JButton();
        btn98 = new javax.swing.JButton();
        btn108 = new javax.swing.JButton();
        btn29 = new javax.swing.JButton();
        btn39 = new javax.swing.JButton();
        btn49 = new javax.swing.JButton();
        btn59 = new javax.swing.JButton();
        btn69 = new javax.swing.JButton();
        btn79 = new javax.swing.JButton();
        btn89 = new javax.swing.JButton();
        btn99 = new javax.swing.JButton();
        btn109 = new javax.swing.JButton();
        btn110 = new javax.swing.JButton();
        btn210 = new javax.swing.JButton();
        btn310 = new javax.swing.JButton();
        btn410 = new javax.swing.JButton();
        btn510 = new javax.swing.JButton();
        btn610 = new javax.swing.JButton();
        btn710 = new javax.swing.JButton();
        btn810 = new javax.swing.JButton();
        btn910 = new javax.swing.JButton();
        btn1010 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        pnl2 = new javax.swing.JPanel();
        btn70 = new javax.swing.JButton();
        btn80 = new javax.swing.JButton();
        btn90 = new javax.swing.JButton();
        btn100 = new javax.swing.JButton();
        btn111 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        btn40 = new javax.swing.JButton();
        btn50 = new javax.swing.JButton();
        btn60 = new javax.swing.JButton();
        btn112 = new javax.swing.JButton();
        btn113 = new javax.swing.JButton();
        btn114 = new javax.swing.JButton();
        btn115 = new javax.swing.JButton();
        btn116 = new javax.swing.JButton();
        btn117 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn118 = new javax.swing.JButton();
        btn119 = new javax.swing.JButton();
        btn120 = new javax.swing.JButton();
        btn121 = new javax.swing.JButton();
        btn122 = new javax.swing.JButton();
        btn123 = new javax.swing.JButton();
        btn124 = new javax.swing.JButton();
        btn125 = new javax.swing.JButton();
        btn126 = new javax.swing.JButton();
        btn211 = new javax.swing.JButton();
        btn311 = new javax.swing.JButton();
        btn411 = new javax.swing.JButton();
        btn511 = new javax.swing.JButton();
        btn611 = new javax.swing.JButton();
        btn711 = new javax.swing.JButton();
        btn811 = new javax.swing.JButton();
        btn911 = new javax.swing.JButton();
        btn1011 = new javax.swing.JButton();
        btn127 = new javax.swing.JButton();
        btn128 = new javax.swing.JButton();
        btn129 = new javax.swing.JButton();
        btn130 = new javax.swing.JButton();
        btn131 = new javax.swing.JButton();
        btn132 = new javax.swing.JButton();
        btn133 = new javax.swing.JButton();
        btn134 = new javax.swing.JButton();
        btn135 = new javax.swing.JButton();
        btn136 = new javax.swing.JButton();
        btn137 = new javax.swing.JButton();
        btn138 = new javax.swing.JButton();
        btn139 = new javax.swing.JButton();
        btn140 = new javax.swing.JButton();
        btn141 = new javax.swing.JButton();
        btn142 = new javax.swing.JButton();
        btn143 = new javax.swing.JButton();
        btn144 = new javax.swing.JButton();
        btn145 = new javax.swing.JButton();
        btn146 = new javax.swing.JButton();
        btn147 = new javax.swing.JButton();
        btn148 = new javax.swing.JButton();
        btn149 = new javax.swing.JButton();
        btn150 = new javax.swing.JButton();
        btn151 = new javax.swing.JButton();
        btn152 = new javax.swing.JButton();
        btn153 = new javax.swing.JButton();
        btn154 = new javax.swing.JButton();
        btn155 = new javax.swing.JButton();
        btn156 = new javax.swing.JButton();
        btn157 = new javax.swing.JButton();
        btn158 = new javax.swing.JButton();
        btn159 = new javax.swing.JButton();
        btn160 = new javax.swing.JButton();
        btn161 = new javax.swing.JButton();
        btn162 = new javax.swing.JButton();
        btn163 = new javax.swing.JButton();
        btn164 = new javax.swing.JButton();
        btn165 = new javax.swing.JButton();
        btn166 = new javax.swing.JButton();
        btn167 = new javax.swing.JButton();
        btn168 = new javax.swing.JButton();
        btn169 = new javax.swing.JButton();
        btn170 = new javax.swing.JButton();
        btn171 = new javax.swing.JButton();
        btn172 = new javax.swing.JButton();
        btn173 = new javax.swing.JButton();
        btn174 = new javax.swing.JButton();
        btn175 = new javax.swing.JButton();
        btn176 = new javax.swing.JButton();
        btn177 = new javax.swing.JButton();
        btn178 = new javax.swing.JButton();
        btn179 = new javax.swing.JButton();
        btn180 = new javax.swing.JButton();
        btn181 = new javax.swing.JButton();
        btn182 = new javax.swing.JButton();
        btn183 = new javax.swing.JButton();
        btn184 = new javax.swing.JButton();
        btn185 = new javax.swing.JButton();
        btn186 = new javax.swing.JButton();
        btn187 = new javax.swing.JButton();
        btn188 = new javax.swing.JButton();
        btn189 = new javax.swing.JButton();
        btn190 = new javax.swing.JButton();
        btn191 = new javax.swing.JButton();
        btn192 = new javax.swing.JButton();
        lblPlayer = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("3");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("4");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("5");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("6");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("7");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("8");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("9");

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 153, 255));
        jLabel41.setText("Batalha Naval");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("10");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel42.setText("10");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel43.setText("9");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel44.setText("10");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel45.setText("1");

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel46.setText("2");

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel47.setText("3");

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel48.setText("4");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel49.setText("5");

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel50.setText("6");
        jLabel50.setName("6"); // NOI18N

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel51.setText("7");

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel52.setText("1");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel53.setText("2");

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel54.setText("3");

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel55.setText("4");

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel56.setText("5");

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel57.setText("6");

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel58.setText("7");

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel59.setText("8");

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel60.setText("8");

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel61.setText("9");

        pnl1.setBackground(new java.awt.Color(204, 255, 255));
        pnl1.setName("6"); // NOI18N
        pnl1.setPreferredSize(new java.awt.Dimension(230, 271));

        btn11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn11.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn11.setName("00"); // NOI18N
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn61.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn61.setName("50"); // NOI18N
        btn61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn51.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn51.setName("40"); // NOI18N
        btn51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn71.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn71.setName("60"); // NOI18N
        btn71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn81.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn81.setName("70"); // NOI18N
        btn81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn91.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn91.setName("80"); // NOI18N
        btn91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn101.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn101.setName("90"); // NOI18N
        btn101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn21.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn21.setName("10"); // NOI18N
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn41.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn41.setName("30"); // NOI18N
        btn41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn12.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn12.setName("01"); // NOI18N
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn32.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn32.setName("21"); // NOI18N
        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn22.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn22.setName("11"); // NOI18N
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn42.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn42.setName("31"); // NOI18N
        btn42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn52.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn52.setName("41"); // NOI18N
        btn52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn62.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn62.setName("51"); // NOI18N
        btn62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn72.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn72.setName("61"); // NOI18N
        btn72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn82.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn82.setName("71"); // NOI18N
        btn82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn102.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn102.setName("91"); // NOI18N
        btn102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn92.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn92.setName("81"); // NOI18N
        btn92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn13.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn13.setName("02"); // NOI18N
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn23.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn23.setName("12"); // NOI18N
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn33.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn33.setName("22"); // NOI18N
        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn43.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn43.setName("32"); // NOI18N
        btn43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn53.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn53.setName("42"); // NOI18N
        btn53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn63.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn63.setName("52"); // NOI18N
        btn63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn73.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn73.setName("62"); // NOI18N
        btn73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn83.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn83.setName("72"); // NOI18N
        btn83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn93.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn93.setName("82"); // NOI18N
        btn93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn103.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn103.setName("92"); // NOI18N
        btn103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn14.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn14.setName("03"); // NOI18N
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn24.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn24.setName("13"); // NOI18N
        btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn34.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn34.setName("23"); // NOI18N
        btn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn44.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn44.setName("33"); // NOI18N
        btn44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn54.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn54.setName("43"); // NOI18N
        btn54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn64.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn64.setName("53"); // NOI18N
        btn64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn74.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn74.setName("63"); // NOI18N
        btn74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn84.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn84.setName("73"); // NOI18N
        btn84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn94.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn94.setName("83"); // NOI18N
        btn94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn104.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn104.setName("93"); // NOI18N
        btn104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn15.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn15.setName("04"); // NOI18N
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn25.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn25.setName("14"); // NOI18N
        btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn35.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn35.setName("24"); // NOI18N
        btn35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn45.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn45.setName("34"); // NOI18N
        btn45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn55.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn55.setName("44"); // NOI18N
        btn55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn65.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn65.setName("54"); // NOI18N
        btn65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn75.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn75.setName("64"); // NOI18N
        btn75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn85.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn85.setName("74"); // NOI18N
        btn85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn95.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn95.setName("84"); // NOI18N
        btn95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn105.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn105.setName("94"); // NOI18N
        btn105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn16.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn16.setName("05"); // NOI18N
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn26.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn26.setName("15"); // NOI18N
        btn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn36.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn36.setName("25"); // NOI18N
        btn36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn46.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn46.setName("35"); // NOI18N
        btn46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn56.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn56.setName("45"); // NOI18N
        btn56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn66.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn66.setName("55"); // NOI18N
        btn66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn76.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn76.setName("65"); // NOI18N
        btn76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn86.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn86.setName("75"); // NOI18N
        btn86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn96.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn96.setName("85"); // NOI18N
        btn96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn106.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn106.setName("95"); // NOI18N
        btn106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn17.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn17.setName("06"); // NOI18N
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn27.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn27.setName("16"); // NOI18N
        btn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn37.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn37.setName("26"); // NOI18N
        btn37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn47.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn47.setName("36"); // NOI18N
        btn47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn57.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn57.setName("46"); // NOI18N
        btn57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn67.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn67.setName("56"); // NOI18N
        btn67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn77.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn77.setName("66"); // NOI18N
        btn77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn87.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn87.setName("76"); // NOI18N
        btn87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn97.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn97.setName("86"); // NOI18N
        btn97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn107.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn107.setName("96"); // NOI18N
        btn107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn18.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn18.setName("07"); // NOI18N
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn28.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn28.setName("17"); // NOI18N
        btn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn38.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn38.setName("27"); // NOI18N
        btn38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn48.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn48.setName("37"); // NOI18N
        btn48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn58.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn58.setName("47"); // NOI18N
        btn58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn68.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn68.setName("57"); // NOI18N
        btn68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn78.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn78.setName("67"); // NOI18N
        btn78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn88.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn88.setName("77"); // NOI18N
        btn88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn98.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn98.setName("87"); // NOI18N
        btn98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn108.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn108.setName("97"); // NOI18N
        btn108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn29.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn29.setName("18"); // NOI18N
        btn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn39.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn39.setName("28"); // NOI18N
        btn39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn49.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn49.setName("38"); // NOI18N
        btn49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn59.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn59.setName("48"); // NOI18N
        btn59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn69.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn69.setName("58"); // NOI18N
        btn69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn79.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn79.setName("68"); // NOI18N
        btn79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn89.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn89.setName("78"); // NOI18N
        btn89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn99.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn99.setName("88"); // NOI18N
        btn99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn109.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn109.setName("98"); // NOI18N
        btn109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn110.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn110.setName("09"); // NOI18N
        btn110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn210.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn210.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn210.setName("19"); // NOI18N
        btn210.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn310.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn310.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn310.setName("29"); // NOI18N
        btn310.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn410.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn410.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn410.setName("39"); // NOI18N
        btn410.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn510.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn510.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn510.setName("49"); // NOI18N
        btn510.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn610.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn610.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn610.setName("59"); // NOI18N
        btn610.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn710.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn710.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn710.setName("69"); // NOI18N
        btn710.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn810.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn810.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn810.setName("79"); // NOI18N
        btn810.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn910.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn910.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn910.setName("89"); // NOI18N
        btn910.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn1010.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn1010.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn1010.setName("99"); // NOI18N
        btn1010.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn31.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn31.setName("20"); // NOI18N
        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        btn19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn19.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn19.setName("08"); // NOI18N
        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clique(evt);
            }
        });

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1Layout.createSequentialGroup()
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn81, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn91, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn101, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn72, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn82, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn92, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn102, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn83, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn93, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn103, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn84, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn94, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn104, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn85, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn95, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn105, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn86, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn96, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn106, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn77, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn87, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn97, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn107, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn78, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn88, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn98, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn108, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn79, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn89, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn99, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn109, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn210, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn310, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn510, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn610, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn710, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn810, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn910, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1010, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn410, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn110, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn83, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn93, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn103, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnl1Layout.createSequentialGroup()
                .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn84, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn94, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn104, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnl1Layout.createSequentialGroup()
                .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn85, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn95, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn105, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnl1Layout.createSequentialGroup()
                .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn86, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn96, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn106, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnl1Layout.createSequentialGroup()
                .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn77, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn87, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn97, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn107, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnl1Layout.createSequentialGroup()
                .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn78, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn88, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn98, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn108, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnl1Layout.createSequentialGroup()
                .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn79, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn89, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn99, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn109, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnl1Layout.createSequentialGroup()
                .addComponent(btn110, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn210, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn310, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn410, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn510, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn610, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn710, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn810, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn910, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn1010, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1Layout.createSequentialGroup()
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl1Layout.createSequentialGroup()
                        .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl1Layout.createSequentialGroup()
                        .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl1Layout.createSequentialGroup()
                        .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn81, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn91, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn101, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl1Layout.createSequentialGroup()
                        .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn72, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn82, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn92, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn102, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        btn11.getAccessibleContext().setAccessibleName("btn11");

        pnl2.setBackground(new java.awt.Color(204, 255, 255));
        pnl2.setName("6"); // NOI18N
        pnl2.setPreferredSize(new java.awt.Dimension(230, 271));

        btn70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn70.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn70.setName("55p"); // NOI18N
        btn70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn70clique(evt);
            }
        });

        btn80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn80.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn80.setName("65p"); // NOI18N
        btn80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn80clique(evt);
            }
        });

        btn90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn90.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn90.setName("77p"); // NOI18N
        btn90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn90clique(evt);
            }
        });

        btn100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn100.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn100.setName("87p"); // NOI18N
        btn100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100clique(evt);
            }
        });

        btn111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn111.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn111.setName("97p"); // NOI18N
        btn111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn111clique(evt);
            }
        });

        btn30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn30.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn30.setName("18p"); // NOI18N
        btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn30clique(evt);
            }
        });

        btn40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn40.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn40.setName("28p"); // NOI18N
        btn40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn40clique(evt);
            }
        });

        btn50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn50.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn50.setName("38p"); // NOI18N
        btn50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn50clique(evt);
            }
        });

        btn60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn60.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn60.setName("48p"); // NOI18N
        btn60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn60clique(evt);
            }
        });

        btn112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn112.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn112.setName("75p"); // NOI18N
        btn112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn112clique(evt);
            }
        });

        btn113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn113.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn113.setName("58p"); // NOI18N
        btn113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn113clique(evt);
            }
        });

        btn114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn114.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn114.setName("85p"); // NOI18N
        btn114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn114clique(evt);
            }
        });

        btn115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn115.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn115.setName("68p"); // NOI18N
        btn115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn115clique(evt);
            }
        });

        btn116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn116.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn116.setName("95p"); // NOI18N
        btn116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn116clique(evt);
            }
        });

        btn117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn117.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn117.setName("78p"); // NOI18N
        btn117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn117clique(evt);
            }
        });

        btn20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn20.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn20.setName("06p"); // NOI18N
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20clique(evt);
            }
        });

        btn118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn118.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn118.setName("16p"); // NOI18N
        btn118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn118clique(evt);
            }
        });

        btn119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn119.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn119.setName("26p"); // NOI18N
        btn119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn119clique(evt);
            }
        });

        btn120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn120.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn120.setName("36p"); // NOI18N
        btn120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn120clique(evt);
            }
        });

        btn121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn121.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn121.setName("46p"); // NOI18N
        btn121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn121clique(evt);
            }
        });

        btn122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn122.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn122.setName("56p"); // NOI18N
        btn122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn122clique(evt);
            }
        });

        btn123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn123.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn123.setName("66p"); // NOI18N
        btn123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn123clique(evt);
            }
        });

        btn124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn124.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn124.setName("88p"); // NOI18N
        btn124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn124clique(evt);
            }
        });

        btn125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn125.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn125.setName("98p"); // NOI18N
        btn125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn125clique(evt);
            }
        });

        btn126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn126.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn126.setName("09p"); // NOI18N
        btn126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn126clique(evt);
            }
        });

        btn211.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn211.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn211.setName("19p"); // NOI18N
        btn211.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn211clique(evt);
            }
        });

        btn311.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn311.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn311.setName("29p"); // NOI18N
        btn311.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn311clique(evt);
            }
        });

        btn411.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn411.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn411.setName("39p"); // NOI18N
        btn411.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn411clique(evt);
            }
        });

        btn511.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn511.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn511.setName("49p"); // NOI18N
        btn511.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn511clique(evt);
            }
        });

        btn611.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn611.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn611.setName("59p"); // NOI18N
        btn611.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn611clique(evt);
            }
        });

        btn711.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn711.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn711.setName("69p"); // NOI18N
        btn711.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn711clique(evt);
            }
        });

        btn811.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn811.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn811.setName("79p"); // NOI18N
        btn811.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn811clique(evt);
            }
        });

        btn911.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn911.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn911.setName("89p"); // NOI18N
        btn911.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn911clique(evt);
            }
        });

        btn1011.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn1011.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn1011.setName("99p"); // NOI18N
        btn1011.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1011clique(evt);
            }
        });

        btn127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn127.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn127.setName("20p"); // NOI18N
        btn127.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn127clique(evt);
            }
        });

        btn128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn128.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn128.setName("08p"); // NOI18N
        btn128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn128clique(evt);
            }
        });

        btn129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn129.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn129.setName("00p"); // NOI18N
        btn129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn129clique(evt);
            }
        });

        btn130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn130.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn130.setName("50p"); // NOI18N
        btn130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn130clique(evt);
            }
        });

        btn131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn131.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn131.setName("40p"); // NOI18N
        btn131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn131clique(evt);
            }
        });

        btn132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn132.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn132.setName("60p"); // NOI18N
        btn132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn132clique(evt);
            }
        });

        btn133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn133.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn133.setName("70p"); // NOI18N
        btn133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn133clique(evt);
            }
        });

        btn134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn134.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn134.setName("80p"); // NOI18N
        btn134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn134clique(evt);
            }
        });

        btn135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn135.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn135.setName("90p"); // NOI18N
        btn135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn135clique(evt);
            }
        });

        btn136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn136.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn136.setName("10p"); // NOI18N
        btn136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn136clique(evt);
            }
        });

        btn137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn137.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn137.setName("30p"); // NOI18N
        btn137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn137clique(evt);
            }
        });

        btn138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn138.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn138.setName("01p"); // NOI18N
        btn138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn138clique(evt);
            }
        });

        btn139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn139.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn139.setName("21p"); // NOI18N
        btn139.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn139clique(evt);
            }
        });

        btn140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn140.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn140.setName("11p"); // NOI18N
        btn140.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn140clique(evt);
            }
        });

        btn141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn141.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn141.setName("31p"); // NOI18N
        btn141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn141clique(evt);
            }
        });

        btn142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn142.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn142.setName("41p"); // NOI18N
        btn142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn142clique(evt);
            }
        });

        btn143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn143.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn143.setName("51p"); // NOI18N
        btn143.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn143clique(evt);
            }
        });

        btn144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn144.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn144.setName("61p"); // NOI18N
        btn144.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn144clique(evt);
            }
        });

        btn145.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn145.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn145.setName("71p"); // NOI18N
        btn145.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn145clique(evt);
            }
        });

        btn146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn146.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn146.setName("91p"); // NOI18N
        btn146.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn146clique(evt);
            }
        });

        btn147.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn147.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn147.setName("81p"); // NOI18N
        btn147.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn147clique(evt);
            }
        });

        btn148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn148.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn148.setName("02p"); // NOI18N
        btn148.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn148clique(evt);
            }
        });

        btn149.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn149.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn149.setName("12p"); // NOI18N
        btn149.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn149clique(evt);
            }
        });

        btn150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn150.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn150.setName("22p"); // NOI18N
        btn150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn150clique(evt);
            }
        });

        btn151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn151.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn151.setName("32p"); // NOI18N
        btn151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn151clique(evt);
            }
        });

        btn152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn152.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn152.setName("42p"); // NOI18N
        btn152.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn152clique(evt);
            }
        });

        btn153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn153.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn153.setName("52p"); // NOI18N
        btn153.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn153clique(evt);
            }
        });

        btn154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn154.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn154.setName("62p"); // NOI18N
        btn154.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn154clique(evt);
            }
        });

        btn155.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn155.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn155.setName("72p"); // NOI18N
        btn155.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn155clique(evt);
            }
        });

        btn156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn156.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn156.setName("82p"); // NOI18N
        btn156.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn156clique(evt);
            }
        });

        btn157.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn157.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn157.setName("92p"); // NOI18N
        btn157.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn157clique(evt);
            }
        });

        btn158.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn158.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn158.setName("03p"); // NOI18N
        btn158.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn158clique(evt);
            }
        });

        btn159.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn159.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn159.setName("13p"); // NOI18N
        btn159.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn159clique(evt);
            }
        });

        btn160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn160.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn160.setName("23p"); // NOI18N
        btn160.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn160clique(evt);
            }
        });

        btn161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn161.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn161.setName("33p"); // NOI18N
        btn161.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn161clique(evt);
            }
        });

        btn162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn162.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn162.setName("43p"); // NOI18N
        btn162.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn162clique(evt);
            }
        });

        btn163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn163.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn163.setName("53p"); // NOI18N
        btn163.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn163clique(evt);
            }
        });

        btn164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn164.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn164.setName("63p"); // NOI18N
        btn164.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn164clique(evt);
            }
        });

        btn165.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn165.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn165.setName("73p"); // NOI18N
        btn165.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn165clique(evt);
            }
        });

        btn166.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn166.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn166.setName("83p"); // NOI18N
        btn166.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn166clique(evt);
            }
        });

        btn167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn167.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn167.setName("93p"); // NOI18N
        btn167.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn167clique(evt);
            }
        });

        btn168.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn168.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn168.setName("04p"); // NOI18N
        btn168.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn168clique(evt);
            }
        });

        btn169.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn169.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn169.setName("14p"); // NOI18N
        btn169.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn169clique(evt);
            }
        });

        btn170.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn170.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn170.setName("24p"); // NOI18N
        btn170.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn170clique(evt);
            }
        });

        btn171.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn171.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn171.setName("34p"); // NOI18N
        btn171.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn171clique(evt);
            }
        });

        btn172.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn172.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn172.setName("44p"); // NOI18N
        btn172.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn172clique(evt);
            }
        });

        btn173.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn173.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn173.setName("54p"); // NOI18N
        btn173.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn173clique(evt);
            }
        });

        btn174.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn174.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn174.setName("64p"); // NOI18N
        btn174.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn174clique(evt);
            }
        });

        btn175.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn175.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn175.setName("76p"); // NOI18N
        btn175.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn175clique(evt);
            }
        });

        btn176.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn176.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn176.setName("86p"); // NOI18N
        btn176.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn176clique(evt);
            }
        });

        btn177.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn177.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn177.setName("96p"); // NOI18N
        btn177.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn177clique(evt);
            }
        });

        btn178.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn178.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn178.setName("07p"); // NOI18N
        btn178.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn178clique(evt);
            }
        });

        btn179.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn179.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn179.setName("17p"); // NOI18N
        btn179.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn179clique(evt);
            }
        });

        btn180.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn180.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn180.setName("27p"); // NOI18N
        btn180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn180clique(evt);
            }
        });

        btn181.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn181.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn181.setName("37p"); // NOI18N
        btn181.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn181clique(evt);
            }
        });

        btn182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn182.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn182.setName("74p"); // NOI18N
        btn182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn182clique(evt);
            }
        });

        btn183.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn183.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn183.setName("47p"); // NOI18N
        btn183.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn183clique(evt);
            }
        });

        btn184.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn184.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn184.setName("84p"); // NOI18N
        btn184.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn184clique(evt);
            }
        });

        btn185.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn185.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn185.setName("57p"); // NOI18N
        btn185.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn185clique(evt);
            }
        });

        btn186.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn186.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn186.setName("94p"); // NOI18N
        btn186.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn186clique(evt);
            }
        });

        btn187.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn187.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn187.setName("67p"); // NOI18N
        btn187.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn187clique(evt);
            }
        });

        btn188.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn188.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn188.setName("05p"); // NOI18N
        btn188.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn188clique(evt);
            }
        });

        btn189.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn189.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn189.setName("15p"); // NOI18N
        btn189.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn189clique(evt);
            }
        });

        btn190.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn190.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn190.setName("25p"); // NOI18N
        btn190.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn190clique(evt);
            }
        });

        btn191.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn191.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn191.setName("35p"); // NOI18N
        btn191.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn191clique(evt);
            }
        });

        btn192.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batalhanaval/oceano1.jpg"))); // NOI18N
        btn192.setMargin(new java.awt.Insets(2, 23, 2, 23));
        btn192.setName("45p"); // NOI18N
        btn192.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn192clique(evt);
            }
        });

        javax.swing.GroupLayout pnl2Layout = new javax.swing.GroupLayout(pnl2);
        pnl2.setLayout(pnl2Layout);
        pnl2Layout.setHorizontalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2Layout.createSequentialGroup()
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn136, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn137, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn130, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn132, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn133, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn134, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn135, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn131, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn127, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn129, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn140, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn139, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn142, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn143, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn144, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn145, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn147, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn146, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn141, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn138, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn149, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn150, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn152, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn153, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn154, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn155, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn156, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn157, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn151, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn148, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn159, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn160, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn162, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn163, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn164, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn165, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn166, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn167, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn161, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn158, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn169, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn170, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn172, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn173, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn174, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn182, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn184, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn186, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn171, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn168, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn189, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn190, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn192, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn70, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn80, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn112, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn114, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn116, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn191, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn188, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn118, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn119, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn121, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn122, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn123, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn175, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn176, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn177, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn120, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn179, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn180, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn183, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn185, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn187, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn90, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn100, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn111, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn181, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn178, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn113, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn115, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn117, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn124, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn125, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn128, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn211, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn311, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn511, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn611, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn711, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn811, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn911, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1011, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn411, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn126, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        pnl2Layout.setVerticalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addComponent(btn148, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn149, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addComponent(btn158, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn159, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addComponent(btn168, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn169, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addComponent(btn188, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn189, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn118, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addComponent(btn178, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn179, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addComponent(btn128, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addComponent(btn126, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn211, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addComponent(btn138, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn140, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addComponent(btn129, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn136, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addComponent(btn150, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn151, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn152, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn153, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn154, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn155, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn156, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn157, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addComponent(btn160, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn161, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn162, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn163, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn164, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn165, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn166, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn167, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addComponent(btn170, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn171, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn172, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn173, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn174, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn182, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn184, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn186, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addComponent(btn190, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn191, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn192, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn70, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn80, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn112, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn114, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn116, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addComponent(btn119, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn120, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn121, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn122, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn123, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn175, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn176, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn177, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addComponent(btn180, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn181, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn183, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn185, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn187, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn90, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn100, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn111, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addComponent(btn40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn113, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn115, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn117, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn124, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn125, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addComponent(btn311, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn411, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn511, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn611, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn711, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn811, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn911, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn1011, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl2Layout.createSequentialGroup()
                            .addComponent(btn127, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn137, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn131, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn130, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn132, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn133, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn134, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn135, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl2Layout.createSequentialGroup()
                            .addComponent(btn139, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn141, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn142, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn143, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn144, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn145, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn147, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn146, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        lblPlayer.setFont(new java.awt.Font("Broadway", 1, 18)); // NOI18N
        lblPlayer.setForeground(new java.awt.Color(0, 153, 255));
        lblPlayer.setText("PLAYER: 0");
        lblPlayer.setName(""); // NOI18N

        jLabel22.setFont(new java.awt.Font("Broadway", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 153, 255));
        jLabel22.setText("CPU");
        jLabel22.setName("lblCPU"); // NOI18N

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel62.setText("10");

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel63.setText("1");

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel64.setText("2");

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel65.setText("3");

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel66.setText("4");

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel67.setText("5");

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel68.setText("6");

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel69.setText("7");

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel70.setText("8");

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel71.setText("9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel70)
                                    .addComponent(jLabel71)
                                    .addComponent(jLabel63)
                                    .addComponent(jLabel64)
                                    .addComponent(jLabel65)
                                    .addComponent(jLabel66)
                                    .addComponent(jLabel68)
                                    .addComponent(jLabel69)
                                    .addComponent(jLabel67))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlayer)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel6)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel7)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel8)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel9)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel10)))
                        .addGap(14, 14, 14)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel45)
                            .addComponent(jLabel60)
                            .addComponent(jLabel61)
                            .addComponent(jLabel46)
                            .addComponent(jLabel47)
                            .addComponent(jLabel48)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51)
                            .addComponent(jLabel49)
                            .addComponent(jLabel42))
                        .addGap(10, 10, 10)
                        .addComponent(pnl2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel53)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel54)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel55)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel56)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel57))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(14, 14, 14)))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel58)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel59)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel43)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel44)
                        .addGap(29, 29, 29))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel41)
                .addGap(298, 298, 298))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel59))
                                .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(11, 11, 11)
                            .addComponent(jLabel45)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel46)
                            .addGap(27, 27, 27)
                            .addComponent(jLabel47)
                            .addGap(31, 31, 31)
                            .addComponent(jLabel48)
                            .addGap(33, 33, 33)
                            .addComponent(jLabel49)
                            .addGap(29, 29, 29)
                            .addComponent(jLabel50)
                            .addGap(34, 34, 34)
                            .addComponent(jLabel51)
                            .addGap(27, 27, 27)
                            .addComponent(jLabel60)
                            .addGap(32, 32, 32)
                            .addComponent(jLabel61)
                            .addGap(31, 31, 31)
                            .addComponent(jLabel42)
                            .addGap(27, 27, 27))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPlayer)
                                        .addComponent(jLabel22))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addComponent(jLabel52)
                                    .addGap(5, 5, 5)
                                    .addComponent(pnl2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap()))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel63)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel64)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel65)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel66)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel67)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel68)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel69)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel70)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel71)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel62)
                        .addGap(14, 14, 14))))
        );

        pnl1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clique
        gerenciador.cliqueMatriz((JButton)evt.getSource(), tabuleiro, QuemClicou.Player);
        
        String btnName = gerenciador.vezCPU(tabuleiro);
        JButton b = null;
        for (Component c : pnl2.getComponents())
            if (c instanceof JButton)
                if (((JButton)c).getName().equals(btnName))
                    b = (JButton)c;
        
        gerenciador.cliqueMatriz(b, tabuleiro, QuemClicou.CPU);
        lblPlayer.setText("PLAYER: " + gerenciador.getPontosPlayer());
        jLabel22.setText("CPU: " + gerenciador.getPontosCPU());
    }//GEN-LAST:event_clique

    private void btn70clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn70clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn70clique

    private void btn80clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn80clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn80clique

    private void btn90clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn90clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn90clique

    private void btn100clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn100clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn100clique

    private void btn111clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn111clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn111clique

    private void btn30clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn30clique

    private void btn40clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn40clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn40clique

    private void btn50clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn50clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn50clique

    private void btn60clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn60clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn60clique

    private void btn112clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn112clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn112clique

    private void btn113clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn113clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn113clique

    private void btn114clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn114clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn114clique

    private void btn115clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn115clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn115clique

    private void btn116clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn116clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn116clique

    private void btn117clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn117clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn117clique

    private void btn20clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn20clique

    private void btn118clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn118clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn118clique

    private void btn119clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn119clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn119clique

    private void btn120clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn120clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn120clique

    private void btn121clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn121clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn121clique

    private void btn122clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn122clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn122clique

    private void btn123clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn123clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn123clique

    private void btn124clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn124clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn124clique

    private void btn125clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn125clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn125clique

    private void btn126clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn126clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn126clique

    private void btn211clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn211clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn211clique

    private void btn311clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn311clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn311clique

    private void btn411clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn411clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn411clique

    private void btn511clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn511clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn511clique

    private void btn611clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn611clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn611clique

    private void btn711clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn711clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn711clique

    private void btn811clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn811clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn811clique

    private void btn911clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn911clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn911clique

    private void btn1011clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1011clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1011clique

    private void btn127clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn127clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn127clique

    private void btn128clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn128clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn128clique

    private void btn129clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn129clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn129clique

    private void btn130clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn130clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn130clique

    private void btn131clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn131clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn131clique

    private void btn132clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn132clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn132clique

    private void btn133clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn133clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn133clique

    private void btn134clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn134clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn134clique

    private void btn135clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn135clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn135clique

    private void btn136clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn136clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn136clique

    private void btn137clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn137clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn137clique

    private void btn138clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn138clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn138clique

    private void btn139clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn139clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn139clique

    private void btn140clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn140clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn140clique

    private void btn141clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn141clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn141clique

    private void btn142clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn142clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn142clique

    private void btn143clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn143clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn143clique

    private void btn144clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn144clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn144clique

    private void btn145clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn145clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn145clique

    private void btn146clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn146clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn146clique

    private void btn147clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn147clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn147clique

    private void btn148clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn148clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn148clique

    private void btn149clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn149clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn149clique

    private void btn150clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn150clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn150clique

    private void btn151clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn151clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn151clique

    private void btn152clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn152clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn152clique

    private void btn153clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn153clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn153clique

    private void btn154clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn154clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn154clique

    private void btn155clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn155clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn155clique

    private void btn156clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn156clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn156clique

    private void btn157clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn157clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn157clique

    private void btn158clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn158clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn158clique

    private void btn159clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn159clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn159clique

    private void btn160clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn160clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn160clique

    private void btn161clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn161clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn161clique

    private void btn162clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn162clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn162clique

    private void btn163clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn163clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn163clique

    private void btn164clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn164clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn164clique

    private void btn165clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn165clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn165clique

    private void btn166clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn166clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn166clique

    private void btn167clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn167clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn167clique

    private void btn168clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn168clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn168clique

    private void btn169clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn169clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn169clique

    private void btn170clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn170clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn170clique

    private void btn171clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn171clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn171clique

    private void btn172clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn172clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn172clique

    private void btn173clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn173clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn173clique

    private void btn174clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn174clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn174clique

    private void btn175clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn175clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn175clique

    private void btn176clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn176clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn176clique

    private void btn177clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn177clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn177clique

    private void btn178clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn178clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn178clique

    private void btn179clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn179clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn179clique

    private void btn180clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn180clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn180clique

    private void btn181clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn181clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn181clique

    private void btn182clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn182clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn182clique

    private void btn183clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn183clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn183clique

    private void btn184clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn184clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn184clique

    private void btn185clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn185clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn185clique

    private void btn186clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn186clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn186clique

    private void btn187clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn187clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn187clique

    private void btn188clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn188clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn188clique

    private void btn189clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn189clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn189clique

    private void btn190clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn190clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn190clique

    private void btn191clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn191clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn191clique

    private void btn192clique(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn192clique
        // TODO add your handling code here:
    }//GEN-LAST:event_btn192clique

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
            java.util.logging.Logger.getLogger(frmNaval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNaval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNaval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNaval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNaval().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn100;
    private javax.swing.JButton btn101;
    private javax.swing.JButton btn1010;
    private javax.swing.JButton btn1011;
    private javax.swing.JButton btn102;
    private javax.swing.JButton btn103;
    private javax.swing.JButton btn104;
    private javax.swing.JButton btn105;
    private javax.swing.JButton btn106;
    private javax.swing.JButton btn107;
    private javax.swing.JButton btn108;
    private javax.swing.JButton btn109;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn110;
    private javax.swing.JButton btn111;
    private javax.swing.JButton btn112;
    private javax.swing.JButton btn113;
    private javax.swing.JButton btn114;
    private javax.swing.JButton btn115;
    private javax.swing.JButton btn116;
    private javax.swing.JButton btn117;
    private javax.swing.JButton btn118;
    private javax.swing.JButton btn119;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn120;
    private javax.swing.JButton btn121;
    private javax.swing.JButton btn122;
    private javax.swing.JButton btn123;
    private javax.swing.JButton btn124;
    private javax.swing.JButton btn125;
    private javax.swing.JButton btn126;
    private javax.swing.JButton btn127;
    private javax.swing.JButton btn128;
    private javax.swing.JButton btn129;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn130;
    private javax.swing.JButton btn131;
    private javax.swing.JButton btn132;
    private javax.swing.JButton btn133;
    private javax.swing.JButton btn134;
    private javax.swing.JButton btn135;
    private javax.swing.JButton btn136;
    private javax.swing.JButton btn137;
    private javax.swing.JButton btn138;
    private javax.swing.JButton btn139;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn140;
    private javax.swing.JButton btn141;
    private javax.swing.JButton btn142;
    private javax.swing.JButton btn143;
    private javax.swing.JButton btn144;
    private javax.swing.JButton btn145;
    private javax.swing.JButton btn146;
    private javax.swing.JButton btn147;
    private javax.swing.JButton btn148;
    private javax.swing.JButton btn149;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn150;
    private javax.swing.JButton btn151;
    private javax.swing.JButton btn152;
    private javax.swing.JButton btn153;
    private javax.swing.JButton btn154;
    private javax.swing.JButton btn155;
    private javax.swing.JButton btn156;
    private javax.swing.JButton btn157;
    private javax.swing.JButton btn158;
    private javax.swing.JButton btn159;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn160;
    private javax.swing.JButton btn161;
    private javax.swing.JButton btn162;
    private javax.swing.JButton btn163;
    private javax.swing.JButton btn164;
    private javax.swing.JButton btn165;
    private javax.swing.JButton btn166;
    private javax.swing.JButton btn167;
    private javax.swing.JButton btn168;
    private javax.swing.JButton btn169;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn170;
    private javax.swing.JButton btn171;
    private javax.swing.JButton btn172;
    private javax.swing.JButton btn173;
    private javax.swing.JButton btn174;
    private javax.swing.JButton btn175;
    private javax.swing.JButton btn176;
    private javax.swing.JButton btn177;
    private javax.swing.JButton btn178;
    private javax.swing.JButton btn179;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn180;
    private javax.swing.JButton btn181;
    private javax.swing.JButton btn182;
    private javax.swing.JButton btn183;
    private javax.swing.JButton btn184;
    private javax.swing.JButton btn185;
    private javax.swing.JButton btn186;
    private javax.swing.JButton btn187;
    private javax.swing.JButton btn188;
    private javax.swing.JButton btn189;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn190;
    private javax.swing.JButton btn191;
    private javax.swing.JButton btn192;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn210;
    private javax.swing.JButton btn211;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn29;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn310;
    private javax.swing.JButton btn311;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btn34;
    private javax.swing.JButton btn35;
    private javax.swing.JButton btn36;
    private javax.swing.JButton btn37;
    private javax.swing.JButton btn38;
    private javax.swing.JButton btn39;
    private javax.swing.JButton btn40;
    private javax.swing.JButton btn41;
    private javax.swing.JButton btn410;
    private javax.swing.JButton btn411;
    private javax.swing.JButton btn42;
    private javax.swing.JButton btn43;
    private javax.swing.JButton btn44;
    private javax.swing.JButton btn45;
    private javax.swing.JButton btn46;
    private javax.swing.JButton btn47;
    private javax.swing.JButton btn48;
    private javax.swing.JButton btn49;
    private javax.swing.JButton btn50;
    private javax.swing.JButton btn51;
    private javax.swing.JButton btn510;
    private javax.swing.JButton btn511;
    private javax.swing.JButton btn52;
    private javax.swing.JButton btn53;
    private javax.swing.JButton btn54;
    private javax.swing.JButton btn55;
    private javax.swing.JButton btn56;
    private javax.swing.JButton btn57;
    private javax.swing.JButton btn58;
    private javax.swing.JButton btn59;
    private javax.swing.JButton btn60;
    private javax.swing.JButton btn61;
    private javax.swing.JButton btn610;
    private javax.swing.JButton btn611;
    private javax.swing.JButton btn62;
    private javax.swing.JButton btn63;
    private javax.swing.JButton btn64;
    private javax.swing.JButton btn65;
    private javax.swing.JButton btn66;
    private javax.swing.JButton btn67;
    private javax.swing.JButton btn68;
    private javax.swing.JButton btn69;
    private javax.swing.JButton btn70;
    private javax.swing.JButton btn71;
    private javax.swing.JButton btn710;
    private javax.swing.JButton btn711;
    private javax.swing.JButton btn72;
    private javax.swing.JButton btn73;
    private javax.swing.JButton btn74;
    private javax.swing.JButton btn75;
    private javax.swing.JButton btn76;
    private javax.swing.JButton btn77;
    private javax.swing.JButton btn78;
    private javax.swing.JButton btn79;
    private javax.swing.JButton btn80;
    private javax.swing.JButton btn81;
    private javax.swing.JButton btn810;
    private javax.swing.JButton btn811;
    private javax.swing.JButton btn82;
    private javax.swing.JButton btn83;
    private javax.swing.JButton btn84;
    private javax.swing.JButton btn85;
    private javax.swing.JButton btn86;
    private javax.swing.JButton btn87;
    private javax.swing.JButton btn88;
    private javax.swing.JButton btn89;
    private javax.swing.JButton btn90;
    private javax.swing.JButton btn91;
    private javax.swing.JButton btn910;
    private javax.swing.JButton btn911;
    private javax.swing.JButton btn92;
    private javax.swing.JButton btn93;
    private javax.swing.JButton btn94;
    private javax.swing.JButton btn95;
    private javax.swing.JButton btn96;
    private javax.swing.JButton btn97;
    private javax.swing.JButton btn98;
    private javax.swing.JButton btn99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblPlayer;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    // End of variables declaration//GEN-END:variables
   
}
