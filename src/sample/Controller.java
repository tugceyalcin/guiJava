package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public Button btn;
    public Text u1;
    public Text p1;
    public TextField t1;
    public PasswordField ps1;


    @FXML
    private void btn2(){

      String username=t1.getText();
      String password=ps1.getText();

      System.out.println(username+"  "+password);





    }

}
