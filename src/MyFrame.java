import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFrame extends JFrame {

    ImageIcon imageIcon = new ImageIcon("C:/Users/imoam/IdeaProjects/GradingSystem/src/gradingSystemIcon.png");
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    JLabel label8;
    JLabel label9;
    JLabel label10;
    JLabel label11;
    JLabel label12;
    JLabel label13;
    JLabel label14;
    JLabel label15;
    JLabel label16;
    JLabel label17;
    JLabel label18;
    JLabel label19;
    JLabel label20;
    JLabel label21;
    JLabel label22;
    JLabel label23;
    JLabel label24;


    MyFrame() {


        JPanel panel1 = new JPanel();
        panel1.setBounds(0,0,1930,80);
        panel1.setLayout(new BorderLayout());

        JPanel panel2 = new JPanel();
        panel2.setBounds(0,75,1930,80);
        panel2.setLayout(new BorderLayout());

        JPanel panel3 = new JPanel();
        panel3.setBounds(0,150,175,50);
        panel3.setLayout(new BorderLayout());

        JPanel panel4 = new JPanel();
        panel4.setBounds(175,155,175,35);
        panel4.setLayout(new BorderLayout());

        JPanel panel5 = new JPanel();
        panel5.setBounds(0,200,175,50);
        panel5.setLayout(new BorderLayout());

        JPanel panel6 = new JPanel();
        panel6.setBounds(175,205,175,35);
        panel6.setLayout(new BorderLayout());

        JPanel panel7 = new JPanel();
        panel7.setBounds(0,250,175,50);
        panel7.setLayout(new BorderLayout());

        JPanel panel8 = new JPanel();
        panel8.setBounds(175,255,175,35);
        panel8.setLayout(new BorderLayout());

        JPanel panel9 = new JPanel();
        panel9.setBounds(0,300,250,50);
        panel9.setLayout(new BorderLayout());

        JPanel panel10 = new JPanel();
        panel10.setBounds(0,350,175,45);
        panel10.setLayout(new BorderLayout());

        JPanel panel11 = new JPanel();
        panel11.setBounds(175,355,175,35);
        panel11.setLayout(new BorderLayout());

        JPanel panel12 = new JPanel();
        panel12.setBounds(0,390,175,45);
        panel12.setLayout(new BorderLayout());

        JPanel panel13 = new JPanel();
        panel13.setBounds(175,395,175,35);
        panel13.setLayout(new BorderLayout());

        JPanel panel14 = new JPanel();
        panel14.setBounds(0,430,175,45);
        panel14.setLayout(new BorderLayout());

        JPanel panel15 = new JPanel();
        panel15.setBounds(175,435,175,35);
        panel15.setLayout(new BorderLayout());

        JPanel panel16 = new JPanel();
        panel16.setBounds(0,470,175,45);
        panel16.setLayout(new BorderLayout());

        JPanel panel17 = new JPanel();
        panel17.setBounds(175,475,175,35);
        panel17.setLayout(new BorderLayout());

        JPanel panel18 = new JPanel();
        panel18.setBounds(0,510,175,45);
        panel18.setLayout(new BorderLayout());

        JPanel panel19 = new JPanel();
        panel19.setBounds(175,515,175,35);
        panel19.setLayout(new BorderLayout());

        JPanel panel20 = new JPanel();
        panel20.setBounds(0,550,175,45);
        panel20.setLayout(new BorderLayout());

        JPanel panel21 = new JPanel();
        panel21.setBounds(175,555,175,35);
        panel21.setLayout(new BorderLayout());

        JPanel panel22 = new JPanel();
        panel22.setBounds(0,590,175,45);
        panel22.setLayout(new BorderLayout());

        JPanel panel23 = new JPanel();
        panel23.setBounds(175,595,175,35);
        panel23.setLayout(new BorderLayout());

        JPanel panel24 = new JPanel();
        panel24.setBounds(0,630,175,45);
        panel24.setLayout(new BorderLayout());

        JPanel panel25 = new JPanel();
        panel25.setBounds(175,635,175,35);
        panel25.setLayout(new BorderLayout());

        JPanel panel26 = new JPanel();
        panel26.setBounds(0,670,175,45);
        panel26.setLayout(new BorderLayout());

        JPanel panel27 = new JPanel();
        panel27.setBounds(175,675,175,35);
        panel27.setLayout(new BorderLayout());

        JPanel panel28 = new JPanel();
        panel28.setBounds(0,715,175,45);
        panel28.setLayout(new BorderLayout());

        JPanel panel29 = new JPanel();
        panel29.setBounds(175,715,175,35);
        panel29.setLayout(new BorderLayout());

        JPanel panel30 = new JPanel();
        panel30.setBounds(0,760,175,45);
        panel30.setLayout(new BorderLayout());

        JPanel panel31 = new JPanel();
        panel31.setBounds(175,760,175,35);
        panel31.setLayout(new BorderLayout());

        JPanel panel32 = new JPanel();
        panel32.setBounds(0,800,175,45);
        panel32.setLayout(new BorderLayout());

        JPanel panel33 = new JPanel();
        panel33.setBounds(175,805,175,35);
        panel33.setLayout(new BorderLayout());

        JPanel panel34 = new JPanel();
        panel34.setBounds(0,840,175,45);
        panel34.setLayout(new BorderLayout());

        JPanel panel35 = new JPanel();
        panel35.setBounds(175,845,175,35);
        panel35.setLayout(new BorderLayout());

        JPanel panel36 = new JPanel();
        panel36.setBounds(0,880,175,45);
        panel36.setLayout(new BorderLayout());

        JPanel panel37 = new JPanel();
        panel37.setBounds(175,885,175,35);
        panel37.setLayout(new BorderLayout());

        JPanel panel38 = new JPanel();
        panel38.setBounds(400,350,175,45);
        panel38.setLayout(new BorderLayout());

        JPanel panel39 = new JPanel();
        panel39.setBounds(575,355,175,35);
        panel39.setLayout(new BorderLayout());

        JPanel panel40 = new JPanel();
        panel40.setBounds(400,390,175,45);
        panel40.setLayout(new BorderLayout());

        JPanel panel41 = new JPanel();
        panel41.setBounds(575,395,175,35);
        panel41.setLayout(new BorderLayout());

        JPanel panel42 = new JPanel();
        panel42.setBounds(400,430,175,45);
        panel42.setLayout(new BorderLayout());

        JPanel panel43 = new JPanel();
        panel43.setBounds(575,435,175,35);
        panel43.setLayout(new BorderLayout());

        JPanel panel44 = new JPanel();
        panel44.setBounds(1150,150,175,50);
        panel44.setLayout(new BorderLayout());

        JPanel panel45 = new JPanel();
        panel45.setBounds(575,730,200,35);
        panel45.setBackground(Color.RED);
        panel45.setLayout(new BorderLayout());
        
        JPanel panel46 = new JPanel();
        panel46.setBounds(800,200,1090,800);
        panel46.setLayout(new BorderLayout());
        
        JPanel panel47 = new JPanel();
        panel47.setBounds(575,830,200,35);
        panel47.setLayout(new BorderLayout());
        
        JPanel panel48 = new JPanel();
        panel48.setBounds(575,680,200,35);
        panel48.setLayout(new BorderLayout());
        
        JPanel panel49 = new JPanel();
        panel49.setBounds(575,880,200,35);
        panel49.setLayout(new BorderLayout());
        
        JPanel panel50 = new JPanel();
        panel50.setBounds(575,780,200,35);
        panel50.setLayout(new BorderLayout());


        JPanel panel51 = new JPanel();
        panel51.setBounds(575,630,200,35);
        panel51.setLayout(new BorderLayout());
        



        label1 = new JLabel();
        label1.setText("ALA HIGH SCHOOL");
        label1.setFont(new Font("MV Boli",Font.BOLD,50));
        label1.setVerticalAlignment(JLabel.TOP);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.TOP);
        label1.setHorizontalTextPosition(JLabel.CENTER);


        panel1.add(label1);


        label2 = new JLabel();
        label2.setText("Students' Grading System");
        label2.setFont(new Font("MV Boli",Font.PLAIN,40));
        label2.setVerticalAlignment(JLabel.TOP);
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setVerticalTextPosition(JLabel.TOP);
        label2.setHorizontalTextPosition(JLabel.CENTER);

        panel2.add(label2);

        label3 = new JLabel();
        label3.setText("Student ID");
        label3.setFont(new Font("MV Boli",Font.PLAIN,25));
        label3.setVerticalAlignment(JLabel.TOP);
        label3.setHorizontalAlignment(JLabel.LEFT);
        label3.setVerticalTextPosition(JLabel.TOP);
        label3.setHorizontalTextPosition(JLabel.LEFT);

        JTextField textField3 = new JTextField();
        textField3.setBounds(0,10,50,50);
        textField3.setFont(new Font("MV Boli",Font.PLAIN,20));

        panel3.add(label3);
        panel4.add(textField3);

        label4 = new JLabel();
        label4.setText("First Name");
        label4.setFont(new Font("MV Boli",Font.PLAIN,25));
        label4.setVerticalAlignment(JLabel.TOP);
        label4.setHorizontalAlignment(JLabel.LEFT);
        label4.setVerticalTextPosition(JLabel.TOP);
        label4.setHorizontalTextPosition(JLabel.LEFT);

        JTextField textField4 = new JTextField();
        textField4.setBounds(10,10,50,50);
        textField4.setFont(new Font("MV Boli",Font.PLAIN,20));

        panel5.add(label4);
        panel6.add(textField4);

        label5 = new JLabel();
        label5.setText("Last Name");
        label5.setFont(new Font("MV Boli",Font.PLAIN,25));
        label5.setVerticalAlignment(JLabel.TOP);
        label5.setHorizontalAlignment(JLabel.LEFT);
        label5.setVerticalTextPosition(JLabel.TOP);
        label5.setHorizontalTextPosition(JLabel.LEFT);

        JTextField textField5 = new JTextField();
        textField5.setBounds(10,10,50,50);
        textField5.setFont(new Font("MV Boli",Font.PLAIN,20));

        panel7.add(label5);
        panel8.add(textField5);

        label6 = new JLabel();
        label6.setText("Please enter marks");
        label6.setFont(new Font("MV Boli",Font.PLAIN,25));
        label6.setVerticalAlignment(JLabel.TOP);
        label6.setHorizontalAlignment(JLabel.LEFT);
        label6.setVerticalTextPosition(JLabel.TOP);
        label6.setHorizontalTextPosition(JLabel.LEFT);

        panel9.add(label6);

        label7 = new JLabel();
        label7.setText("Mathematics");
        label7.setFont(new Font("MV Boli",Font.PLAIN,25));
        label7.setVerticalAlignment(JLabel.TOP);
        label7.setHorizontalAlignment(JLabel.LEFT);
        label7.setVerticalTextPosition(JLabel.TOP);
        label7.setHorizontalTextPosition(JLabel.LEFT);

        JTextField textField6 = new JTextField();
        textField6.setBounds(10,10,50,50);
        textField6.setFont(new Font("MV Boli",Font.PLAIN,20));

        panel10.add(label7);
        panel11.add(textField6);

        label8 = new JLabel();
        label8.setText("English");
        label8.setFont(new Font("MV Boli",Font.PLAIN,25));
        label8.setVerticalAlignment(JLabel.TOP);
        label8.setHorizontalAlignment(JLabel.LEFT);
        label8.setVerticalTextPosition(JLabel.TOP);
        label8.setHorizontalTextPosition(JLabel.LEFT);

        JTextField textField7 = new JTextField();
        textField7.setBounds(10,10,50,50);
        textField7.setFont(new Font("MV Boli",Font.PLAIN,20));

        panel12.add(label8);
        panel13.add(textField7);

        label9 = new JLabel();
        label9.setText("Kiswahili");
        label9.setFont(new Font("MV Boli",Font.PLAIN,25));
        label9.setVerticalAlignment(JLabel.TOP);
        label9.setHorizontalAlignment(JLabel.LEFT);
        label9.setVerticalTextPosition(JLabel.TOP);
        label9.setHorizontalTextPosition(JLabel.LEFT);

        JTextField textField8 = new JTextField();
        textField8.setBounds(10,10,50,50);
        textField8.setFont(new Font("MV Boli",Font.PLAIN,20));

        panel14.add(label9);
        panel15.add(textField8);

        label10 = new JLabel();
        label10.setText("Physics");
        label10.setFont(new Font("MV Boli",Font.PLAIN,25));
        label10.setVerticalAlignment(JLabel.TOP);
        label10.setHorizontalAlignment(JLabel.LEFT);
        label10.setVerticalTextPosition(JLabel.TOP);
        label10.setHorizontalTextPosition(JLabel.LEFT);

        JTextField textField9 = new JTextField();
        textField9.setBounds(10,10,50,50);
        textField9.setFont(new Font("MV Boli",Font.PLAIN,20));

        panel16.add(label10);
        panel17.add(textField9);

        label11 = new JLabel();
        label11.setText("Chemistry");
        label11.setFont(new Font("MV Boli",Font.PLAIN,25));
        label11.setVerticalAlignment(JLabel.TOP);
        label11.setHorizontalAlignment(JLabel.LEFT);
        label11.setVerticalTextPosition(JLabel.TOP);
        label11.setHorizontalTextPosition(JLabel.LEFT);

        JTextField textField10 = new JTextField();
        textField10.setBounds(10,10,50,50);
        textField10.setFont(new Font("MV Boli",Font.PLAIN,20));

        panel18.add(label11);
        panel19.add(textField10);

        label12 = new JLabel();
        label12.setText("Biology");
        label12.setFont(new Font("MV Boli",Font.PLAIN,25));
        label12.setVerticalAlignment(JLabel.TOP);
        label12.setHorizontalAlignment(JLabel.LEFT);
        label12.setVerticalTextPosition(JLabel.TOP);
        label12.setHorizontalTextPosition(JLabel.LEFT);

        JTextField textField11 = new JTextField();
        textField11.setBounds(10,10,50,50);
        textField11.setFont(new Font("MV Boli",Font.PLAIN,20));

        panel20.add(label12);
        panel21.add(textField11);

        label13 = new JLabel();
        label13.setText("CRE");
        label13.setFont(new Font("MV Boli",Font.PLAIN,25));
        label13.setVerticalAlignment(JLabel.TOP);
        label13.setHorizontalAlignment(JLabel.LEFT);
        label13.setVerticalTextPosition(JLabel.TOP);
        label13.setHorizontalTextPosition(JLabel.LEFT);

        JTextField textField12 = new JTextField();
        textField12.setBounds(10,10,50,50);
        textField12.setFont(new Font("MV Boli",Font.PLAIN,20));

        panel22.add(label13);
        panel23.add(textField12);

        label14 = new JLabel();
        label14.setText("History");
        label14.setFont(new Font("MV Boli",Font.PLAIN,25));
        label14.setVerticalAlignment(JLabel.TOP);
        label14.setHorizontalAlignment(JLabel.LEFT);
        label14.setVerticalTextPosition(JLabel.TOP);
        label14.setHorizontalTextPosition(JLabel.LEFT);

        JTextField textField13 = new JTextField();
        textField13.setBounds(10,10,50,50);
        textField13.setFont(new Font("MV Boli",Font.PLAIN,20));

        panel24.add(label14);
        panel25.add(textField13);

        label15 = new JLabel();
        label15.setText("Geography");
        label15.setFont(new Font("MV Boli",Font.PLAIN,25));
        label15.setVerticalAlignment(JLabel.TOP);
        label15.setHorizontalAlignment(JLabel.LEFT);
        label15.setVerticalTextPosition(JLabel.TOP);
        label15.setHorizontalTextPosition(JLabel.LEFT);

        JTextField textField14 = new JTextField();
        textField14.setBounds(10,10,50,50);
        textField14.setFont(new Font("MV Boli",Font.PLAIN,20));

        panel26.add(label15);
        panel27.add(textField14);

        label16 = new JLabel();
        label16.setText("Computer");
        label16.setFont(new Font("MV Boli",Font.PLAIN,25));
        label16.setVerticalAlignment(JLabel.TOP);
        label16.setHorizontalAlignment(JLabel.LEFT);
        label16.setVerticalTextPosition(JLabel.TOP);
        label16.setHorizontalTextPosition(JLabel.LEFT);

        JTextField textField15 = new JTextField();
        textField15.setBounds(10,10,50,50);
        textField15.setFont(new Font("MV Boli",Font.PLAIN,20));

        panel28.add(label16);
        panel29.add(textField15);

        label17 = new JLabel();
        label17.setText("Home Science");
        label17.setFont(new Font("MV Boli",Font.PLAIN,25));
        label17.setVerticalAlignment(JLabel.TOP);
        label17.setHorizontalAlignment(JLabel.LEFT);
        label17.setVerticalTextPosition(JLabel.TOP);
        label17.setHorizontalTextPosition(JLabel.LEFT);

        JTextField textField16 = new JTextField();
        textField16.setBounds(10,10,50,50);
        textField16.setFont(new Font("MV Boli",Font.PLAIN,20));

        panel30.add(label17);
        panel31.add(textField16);

        label18 = new JLabel();
        label18.setText("Business");
        label18.setFont(new Font("MV Boli",Font.PLAIN,25));
        label18.setVerticalAlignment(JLabel.TOP);
        label18.setHorizontalAlignment(JLabel.LEFT);
        label18.setVerticalTextPosition(JLabel.TOP);
        label18.setHorizontalTextPosition(JLabel.LEFT);

        JTextField textField17 = new JTextField();
        textField17.setBounds(10,10,50,50);
        textField17.setFont(new Font("MV Boli",Font.PLAIN,20));

        panel32.add(label18);
        panel33.add(textField17);

        label19 = new JLabel();
        label19.setText("Agriculture");
        label19.setFont(new Font("MV Boli",Font.PLAIN,25));
        label19.setVerticalAlignment(JLabel.TOP);
        label19.setHorizontalAlignment(JLabel.LEFT);
        label19.setVerticalTextPosition(JLabel.TOP);
        label19.setHorizontalTextPosition(JLabel.LEFT);

        JTextField textField18 = new JTextField();
        textField18.setBounds(10,10,50,50);
        textField18.setFont(new Font("MV Boli",Font.PLAIN,20));

        panel34.add(label19);
        panel35.add(textField18);

        label20 = new JLabel();
        label20.setText("Music");
        label20.setFont(new Font("MV Boli",Font.PLAIN,25));
        label20.setVerticalAlignment(JLabel.TOP);
        label20.setHorizontalAlignment(JLabel.LEFT);
        label20.setVerticalTextPosition(JLabel.TOP);
        label20.setHorizontalTextPosition(JLabel.LEFT);

        JTextField textField19 = new JTextField();
        textField19.setBounds(10,10,50,50);
        textField19.setFont(new Font("MV Boli",Font.PLAIN,20));

        panel36.add(label20);
        panel37.add(textField19);

        label21 = new JLabel();
        label21.setText("Total Score");
        label21.setFont(new Font("MV Boli",Font.PLAIN,25));
        label21.setVerticalAlignment(JLabel.TOP);
        label21.setHorizontalAlignment(JLabel.LEFT);
        label21.setVerticalTextPosition(JLabel.TOP);
        label21.setHorizontalTextPosition(JLabel.LEFT);

        JTextField textField20 = new JTextField();
        textField20.setBounds(10,10,50,50);
        textField20.setFont(new Font("MV Boli",Font.PLAIN,20));

        panel38.add(label21);
        panel39.add(textField20);

        label21 = new JLabel();
        label21.setText("Average");
        label21.setFont(new Font("MV Boli",Font.PLAIN,25));
        label21.setVerticalAlignment(JLabel.TOP);
        label21.setHorizontalAlignment(JLabel.LEFT);
        label21.setVerticalTextPosition(JLabel.TOP);
        label21.setHorizontalTextPosition(JLabel.LEFT);

        JTextField textField21 = new JTextField();
        textField21.setBounds(10,10,50,50);
        textField21.setFont(new Font("MV Boli",Font.PLAIN,20));

        panel40.add(label21);
        panel41.add(textField21);

        label22 = new JLabel();
        label22.setText("Grade");
        label22.setFont(new Font("MV Boli",Font.PLAIN,25));
        label22.setVerticalAlignment(JLabel.TOP);
        label22.setHorizontalAlignment(JLabel.LEFT);
        label22.setVerticalTextPosition(JLabel.TOP);
        label22.setHorizontalTextPosition(JLabel.LEFT);

        JTextField textField22 = new JTextField();
        textField22.setBounds(10,10,50,50);
        textField22.setFont(new Font("MV Boli",Font.PLAIN,20));

        panel42.add(label22);
        panel43.add(textField22);

        label23 = new JLabel();
        label23.setText("Marklist");
        label23.setFont(new Font("MV Boli",Font.PLAIN,30));
        label23.setVerticalAlignment(JLabel.TOP);
        label23.setHorizontalAlignment(JLabel.LEFT);
        label23.setVerticalTextPosition(JLabel.TOP);
        label23.setHorizontalTextPosition(JLabel.LEFT);

        panel44.add(label23);

        JButton button1 = new JButton("ADD TO DB");
        button1.setBounds(0,0, 100, 100);
        button1.setBackground(Color.BLUE);
        button1.setFont(new Font("MV Boli", Font.PLAIN, 20));
        button1.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent e) {
                                          int studentID = Integer.parseInt(textField3.getText());
                                          String firstName = textField4.getText();
                                          String lastName = textField5.getText();
                                          int mathematics = Integer.parseInt(textField6.getText());
                                          int english = Integer.parseInt(textField7.getText());
                                          int kiswahili = Integer.parseInt(textField8.getText());
                                          int physics = Integer.parseInt(textField9.getText());
                                          int chemistry = Integer.parseInt(textField10.getText());
                                          int biology = Integer.parseInt(textField11.getText());
                                          int CRE = Integer.parseInt(textField12.getText());
                                          int history = Integer.parseInt(textField13.getText());
                                          int geography = Integer.parseInt(textField14.getText());
                                          int computer = Integer.parseInt(textField15.getText());
                                          int homeScience = Integer.parseInt(textField16.getText());
                                          int business = Integer.parseInt(textField17.getText());
                                          int agriculture = Integer.parseInt(textField18.getText());
                                          int music = Integer.parseInt(textField19.getText());
                                          int totalScore = Integer.parseInt(textField20.getText());
                                          int average = Integer.parseInt(textField21.getText());
                                          String grade = textField22.getText();

                                          try {
                                              Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/GradingSystem", "Amanda", "Bluejeans@001");

                                              String query = "INSERT INTO data VALUES('"+ studentID + "','" + firstName + "','" + lastName + "','" +
                                                      mathematics + "','" + english +"','"+kiswahili+"','"+physics+"','"+chemistry+"','"+biology+
                                                      "','"+CRE+"','"+history+"','"+geography+"','"+computer+"','"+homeScience+"','"+business+
                                                      "','"+agriculture+"','"+music+"','"+totalScore+"','"+average+"','"+grade+"')";

                                              Statement sta = connection.createStatement();
                                              int x = sta.executeUpdate(query);
                                              if (x == 0) {
                                                  JOptionPane.showMessageDialog(button1, "This already exists");
                                              } else {
                                                  JOptionPane.showMessageDialog(button1,
                                                          "Added to database");
                                                  
                                              }
                                              connection.close();
                                          } catch (Exception exception) {
                                              exception.printStackTrace();
                                          }
                                      }
                                  });

        panel45.add(button1);
        
        JTable table = new JTable();
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        table.setAutoResizeMode( JTable.AUTO_RESIZE_OFF );
        JScrollPane scroll = new JScrollPane(table);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setEnabled(true);
       
        
        panel46.add(scroll);
        
       
        
        JButton button2 = new JButton("SHOW DATA");
        button2.setBounds(0,0, 100, 100);
        button2.setBackground(Color.BLUE);
        button2.setFont(new Font("MV Boli", Font.PLAIN, 20));
        button2.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent e) {
                                    	  try {
											Class.forName("com.mysql.cj.jdbc.Driver");
											Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GradingSystem","Amanda","Bluejeans@001");
											Statement st = con.createStatement();
											String query = "select * from data";
											ResultSet rs = st.executeQuery(query);
											ResultSetMetaData rsmd = rs.getMetaData();
											DefaultTableModel model = (DefaultTableModel) table.getModel();
											
											int cols = rsmd.getColumnCount();
											String[]colName = new String[cols];
											for(int i = 0; i<cols; i++)
												colName[i] = rsmd.getColumnName(i+1);
											model.setColumnIdentifiers(colName);
											
											String studentID, firstName, lastName, mathematics, english, kiswahili, physics, chemistry, biology, CRE, history,
											geography, computer, homeScience, business, agriculture, music, totalScore, average, grade;
											while(rs.next()) {
												studentID = rs.getString(1);
												firstName = rs.getString(2);
												lastName = rs.getString(3);
												mathematics = rs.getString(4);
												english = rs.getString(5);
												kiswahili = rs.getString(6);
												physics = rs.getString(7);
												chemistry = rs.getString(8);
												biology = rs.getString(9);
												CRE = rs.getString(10);
												history = rs.getString(11);
												geography = rs.getString(12);
												computer = rs.getString(13);
												homeScience = rs.getString(14);
												business = rs.getString(15);
												agriculture = rs.getString(16);
												music = rs.getString(17);
												totalScore = rs.getString(18);
												average = rs.getString(19);
												grade = rs.getString(20);
												String[]row = {studentID, firstName, lastName, mathematics, english, kiswahili, physics, chemistry, biology,
														CRE, history, geography, computer, homeScience, business, agriculture, music, totalScore, average, grade};
												model.addRow(row);
											}
											st.close();
											con.close();
											
										} catch (ClassNotFoundException | SQLException e1) {
											e1.printStackTrace();
										}
                                      }
        });       
        
       panel47.add(button2);
       
       JButton button3 = new JButton("CALCULATE");
       button3.setBounds(0,0, 100, 100);
       button3.setBackground(Color.BLUE);
       button3.setFont(new Font("MV Boli", Font.PLAIN, 20));
       button3.addActionListener(new ActionListener() {
                                     public void actionPerformed(ActionEvent e) {
                                    	 int mathematics = Integer.parseInt(textField6.getText());
                                         int english = Integer.parseInt(textField7.getText());
                                         int kiswahili = Integer.parseInt(textField8.getText());
                                         int physics = Integer.parseInt(textField9.getText());
                                         int chemistry = Integer.parseInt(textField10.getText());
                                         int biology = Integer.parseInt(textField11.getText());
                                         int CRE = Integer.parseInt(textField12.getText());
                                         int history = Integer.parseInt(textField13.getText());
                                         int geography = Integer.parseInt(textField14.getText());
                                         int computer = Integer.parseInt(textField15.getText());
                                         int homeScience = Integer.parseInt(textField16.getText());
                                         int business = Integer.parseInt(textField17.getText());
                                         int agriculture = Integer.parseInt(textField18.getText());
                                         int music = Integer.parseInt(textField19.getText());
                                        int totalScore = mathematics+english+kiswahili+physics+chemistry+biology+CRE+history+geography+computer+
                                        		 homeScience+business+agriculture+music;
                                        int average = totalScore/8;
                                        String score = Integer.toString(totalScore);
                                        String ave = Integer.toString(average);
                                         textField20.setText(score);
                                         textField21.setText(ave);
                                         if(average >= 80 && average <= 100) {
                                        	 textField22.setText("A");
                                         }else if(average >= 75 && average <= 79) {
                                        	 textField22.setText("A-");
                                         }else if(average >= 70 && average <= 74) {
                                        	 textField22.setText("B+");
                                         }else if(average >= 65 && average <= 69) {
                                        	 textField22.setText("B");
                                         }else if(average >= 60 && average <= 64) {
                                        	 textField22.setText("B-");
                                         }else if(average >= 55 && average <= 59) {
                                        	 textField22.setText("C+");
                                         }else if(average >= 50 && average <= 54) {
                                        	 textField22.setText("C");
                                         }else if(average >= 45 && average <= 49) {
                                        	 textField22.setText("C-");
                                         }else if(average >= 40 && average <= 44) {
                                        	 textField22.setText("D+");
                                         }else if(average >= 35 && average <= 39) {
                                        	 textField22.setText("D");
                                         }else if(average >= 30 && average <= 34) {
                                        	 textField22.setText("D-");
                                         }else if(average<=29 && average >= 0) {
                                        	 textField22.setText("E");
                                         }else {
                                        	 textField22.setText("N/A");
                                         }
                                     }
       });
       
       panel48.add(button3);
       
       JButton button4 = new JButton("CLEAR TABLE");
       button4.setBounds(0,0, 100, 100);
       button4.setBackground(Color.BLUE);
       button4.setFont(new Font("MV Boli", Font.PLAIN, 20));
       button4.addActionListener(new ActionListener() {
                                     public void actionPerformed(ActionEvent e) {
                                    	 table.setModel(new DefaultTableModel());
                                     }
       });
       
       panel49.add(button4);
       
       JButton button5 = new JButton("CLEAR FIELDS");
       button5.setBounds(0,0, 100, 100);
       button5.setBackground(Color.BLUE);
       button5.setFont(new Font("MV Boli", Font.PLAIN, 20));
       button5.addActionListener(new ActionListener() {
                                     public void actionPerformed(ActionEvent e) {
                                    	 textField3.setText(null);
                                         textField4.setText(null);
                                         textField5.setText(null);
                                         textField6.setText(null);
                                         textField7.setText(null);
                                         textField8.setText(null);
                                         textField9.setText(null);
                                         textField10.setText(null);
                                         textField11.setText(null);
                                         textField12.setText(null);
                                         textField13.setText(null);
                                         textField14.setText(null);
                                         textField15.setText(null);
                                         textField16.setText(null);
                                         textField17.setText(null);
                                         textField18.setText(null);
                                         textField19.setText(null);
                                         textField20.setText(null);
                                         textField21.setText(null);
                                         textField22.setText(null);
                                     
                                     }
       });
       
       panel50.add(button5);
       
       JButton button6 = new JButton("DELETE RECORD");
       button6.setBounds(0,0, 100, 100);
       button6.setBackground(Color.BLUE);
       button6.setFont(new Font("MV Boli", Font.PLAIN, 20));
       button6.addActionListener(new ActionListener() {
                                     public void actionPerformed(ActionEvent e) {
                                   	  try {
											Class.forName("com.mysql.cj.jdbc.Driver");
											Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GradingSystem","Amanda","Bluejeans@001");
											Statement st = con.createStatement();
											String query = "DELETE from data WHERE Student_ID = ?";
											PreparedStatement statement = con.prepareStatement(query);
											String studentID = textField3.getText();
											statement.setString(1, studentID);
											int rows = statement.executeUpdate();
                                   	  }catch (ClassNotFoundException | SQLException e1) {
											e1.printStackTrace();
										}
                                     }
       });
       
       panel51.add(button6);
       
        

        this.setVisible(true);
        this.setSize(1930,1500);
        this.setTitle("Grading System");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(imageIcon.getImage());
        this.setLayout(null);
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.add(panel4);
        this.add(panel5);
        this.add(panel6);
        this.add(panel7);
        this.add(panel8);
        this.add(panel9);
        this.add(panel10);
        this.add(panel11);
        this.add(panel12);
        this.add(panel13);
        this.add(panel14);
        this.add(panel15);
        this.add(panel16);
        this.add(panel17);
        this.add(panel18);
        this.add(panel19);
        this.add(panel20);
        this.add(panel21);
        this.add(panel22);
        this.add(panel23);
        this.add(panel24);
        this.add(panel25);
        this.add(panel26);
        this.add(panel27);
        this.add(panel28);
        this.add(panel29);
        this.add(panel30);
        this.add(panel31);
        this.add(panel32);
        this.add(panel33);
        this.add(panel34);
        this.add(panel35);
        this.add(panel36);
        this.add(panel37);
        this.add(panel38);
        this.add(panel39);
        this.add(panel40);
        this.add(panel41);
        this.add(panel42);
        this.add(panel43);
        this.add(panel44);
        this.add(panel45);
        this.add(panel46);
        this.add(panel47);
        this.add(panel48);
        this.add(panel49);
        this.add(panel50);
        this.add(panel51);
    }
}
