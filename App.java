import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

public class App extends Application{
    @Override
    public void start(Stage st) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        Scene scene = new Scene(root);

        st.setTitle("First Project");
        st.setScene(scene);
        st.show();

    }

    public static void main(String[] args) throws Exception{
        launch(args);
    }
}