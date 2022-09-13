package trainRacing;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Racing extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage s) throws Exception {
		Button b = new Button("Stopp!!");
		s.setTitle("train race");
		StackPane sp = new StackPane(); 
		sp.getChildren().add(b);
		Scene sc= new Scene( sp  ,200,200);
		s.setScene(sc);
		s.show();
		
		Train t = new Train("pågatåget",2000);
		Train t2 = new Train("öresundståget",1000);
		Train t3 = new Train("x2000",500);

			t.start();
			t2.start();
			t3.start();
			
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				System.out.println("\n------STOPP-----\n");
				t.interrupt();
				t2.interrupt();
				t3.interrupt();
			}
		};
			
		b.setOnAction(event);

	}

}
