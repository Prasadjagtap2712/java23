/*
15) Write Java AWT code to accept Student information form.
*/

import java.awt.*;
import java.awt.event.*;
class StudentForm extends Frame implements ActionListener {
Label nameLabel, ageLabel, genderLabel, courseLabel;
TextField nameText, ageText, courseText;
CheckboxGroup genderGroup;
Checkbox maleCheckBox, femaleCheckBox;
Button submitButton;
StudentForm() {
nameLabel = new Label("Name:");
ageLabel = new Label("Age:");
genderLabel = new Label("Gender:");
courseLabel = new Label("Course:");
nameText = new TextField();
ageText = new TextField();
courseText = new TextField();
genderGroup = new CheckboxGroup();
maleCheckBox = new Checkbox("Male", genderGroup, true);
femaleCheckBox = new Checkbox("Female", genderGroup, false);
submitButton = new Button("Submit");
submitButton.addActionListener(this);
add(nameLabel);
add(nameText);
add(ageLabel);
add(ageText);
add(genderLabel);
add(maleCheckBox);
add(femaleCheckBox);
add(courseLabel);
add(courseText);
add(submitButton);
setTitle("Student Information Form");
setSize(300, 200);
setLayout(new GridLayout(6, 2));
setVisible(true);
}
public void actionPerformed(ActionEvent e) {
if (e.getSource() == submitButton) {
String name = nameText.getText();
int age = Integer.parseInt(ageText.getText());
String gender = maleCheckBox.getState() ? "Male" : "Female";
String course = courseText.getText();
System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Gender: " + gender);
System.out.println("Course: " + course);
nameText.setText("");
ageText.setText("");
courseText.setText("");
}
}
public static void main(String[] args) {
new StudentForm();
}
}
