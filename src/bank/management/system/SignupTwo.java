package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    JLabel additionalDetails, religion, category, qualification, income, education, occupation, pan, har, senior, exit;
    JTextField panTextField, harTextField;
    JRadioButton syes, sno, eyes, eno;
    JButton next;
    ButtonGroup sengroup, exitgroup;
    JComboBox reli, cate, inco, educa, occupa;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 140, 100, 30);
        add(religion);
        
        String valReli[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        reli = new JComboBox(valReli);
        reli.setBounds(300, 140, 400, 30);
        reli.setBackground(Color.WHITE);
        add(reli);
        
        category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 190, 200, 30);
        add(category);
        
        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
        cate = new JComboBox(valCategory);
        cate.setBounds(300, 190, 400, 30);
        cate.setBackground(Color.WHITE);
        add(cate);
        
        income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        add(income);
        
        String incomeCategory[] = {"Null", "< 10,000,000", "< 20,000,000", "< 50,000,000", "Upto 100,000,000"};
        inco = new JComboBox(incomeCategory);
        inco.setBounds(300, 240, 400, 30);
        inco.setBackground(Color.WHITE);
        add(inco);
        
        education = new JLabel("Education");
        education.setFont(new Font("Raleway", Font.BOLD, 20));
        education.setBounds(100, 290, 200, 30);
        add(education);
        
        qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);
        
        String valEducation[] = {"Non Graduation", "Gradute", "Post Graduation", "Doctrate", "Others"};
        educa = new JComboBox(valEducation);
        educa.setBounds(300, 315, 400, 30);
        educa.setBackground(Color.WHITE);
        add(educa);
        
        occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 390, 200, 30);
        add(occupation);
        
        String valOccupation[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Others"};
        occupa = new JComboBox(valOccupation);
        occupa.setBounds(300, 390, 400, 30);
        occupa.setBackground(Color.WHITE);
        add(occupa);
        
        pan = new JLabel("PAN number:");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 440, 200, 30);
        add(pan);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);
        
        har = new JLabel("Aadhar Number:");
        har.setFont(new Font("Raleway", Font.BOLD, 20));
        har.setBounds(100, 490, 200, 30);
        add(har);
        
        harTextField = new JTextField();
        harTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        harTextField.setBounds(300, 490, 400, 30);
        add(harTextField);
        
        senior = new JLabel("Senior Citizen:");
        senior.setFont(new Font("Raleway", Font.BOLD, 20));
        senior.setBounds(100, 540, 200, 30);
        add(senior);
        
        syes = new JRadioButton("YES");
        syes.setBounds(300, 540, 120, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 120 , 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        sengroup = new ButtonGroup();
        sengroup.add(syes);
        sengroup.add(sno);
        
        exit = new JLabel("Exisiting Account:");
        exit.setFont(new Font("Raleway", Font.BOLD, 20));
        exit.setBounds(100, 590, 200, 30);
        add(exit);
        
        eyes = new JRadioButton("YES");
        eyes.setBounds(300, 590, 120, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 120 , 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        exitgroup = new ButtonGroup();
        exitgroup.add(eyes);
        exitgroup.add(eno);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350, 10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String sreligion = (String) reli.getSelectedItem();
        String scategory = (String) cate.getSelectedItem();
        String sincome = (String) inco.getSelectedItem();
        String seduction = (String) educa.getSelectedItem();
        String soccupation = (String) occupa.getSelectedItem();
        String seniorcitizen = null;
        if (syes.isSelected()){
            seniorcitizen = "Yes";
        }else if (sno.isSelected()){
            seniorcitizen = "No";
        }
        
        String exisitingaccount = null;
        if (eyes.isSelected()){
            exisitingaccount = "Yes";
        } else if (eno.isSelected()){
            exisitingaccount = "No";
        }
        
        String span = panTextField.getText();
        String saahar = harTextField.getText();
        
        try {
                Conn c = new Conn();
                String query = "insert into signuptwo values ('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seduction+"', '"+soccupation+"', '"+span+"', '"+saahar+"', '"+seniorcitizen+"', '"+exisitingaccount+"') ";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main (String arg[]){
        new SignupTwo("");
    }
}
