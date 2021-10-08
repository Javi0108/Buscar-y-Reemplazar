package buscaryreemplazar;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscaryReemplazar extends Application {

	private Button buscarButton, reemplazarButton, reemplazarTodoButton, cerrarButton, ayudaButton;
	private CheckBox mayminCheck, atrasCheck, expresionCheck, resaltarCheck;
	private TextField buscarText, reemplazarText;

	@Override
	public void start(Stage primaryStage) throws Exception {

		buscarButton = new Button("Buscar");
		buscarButton.setMaxSize(2000.0, 2000.0);
		reemplazarButton = new Button("Reemplazar");
		reemplazarButton.setMaxSize(2000.0, 2000.0);
		reemplazarTodoButton = new Button("Reemplazar todo");
		reemplazarTodoButton.setMaxSize(2000.0, 2000.0);
		cerrarButton = new Button("Cerrar");
		cerrarButton.setMaxSize(2000.0, 2000.0);
		ayudaButton = new Button("Ayuda");
		ayudaButton.setMaxSize(2000.0, 2000.0);

		buscarText = new TextField();
		reemplazarText = new TextField();

		mayminCheck = new CheckBox();
		atrasCheck = new CheckBox();
		expresionCheck = new CheckBox();
		resaltarCheck = new CheckBox();

		VBox botonesBox = new VBox();
		botonesBox.setAlignment(Pos.TOP_RIGHT);
		botonesBox.setSpacing(5);
		botonesBox.getChildren().addAll(buscarButton, reemplazarButton, reemplazarTodoButton, cerrarButton,	ayudaButton);

		GridPane centro = new GridPane();
		centro.setPadding(new Insets(5));
		centro.addRow(0, new Label("Nombre: "), buscarText);
		centro.addRow(1, new Label("Reemplazar con: "), reemplazarText);

		ColumnConstraints[] cols = { new ColumnConstraints(), new ColumnConstraints(), };

		centro.getColumnConstraints().setAll(cols);
		cols[0].setHalignment(HPos.LEFT);

		cols[1].setHgrow(Priority.ALWAYS);
		cols[1].setFillWidth(true);

		GridPane Boxito = new GridPane();
		Boxito.setPadding(new Insets(5, 5, 0, 0));
		Boxito.setHgap(10);
		Boxito.setVgap(5);

		Boxito.addRow(0, mayminCheck, new Label("Mayúsculas y minúsculas"), atrasCheck,	new Label("Buscar hacia atrás"));
		Boxito.addRow(1, expresionCheck, new Label("Expresión regular"), resaltarCheck, new Label("Resaltar resultados"));

		centro.add(Boxito, 1, 2);

		BorderPane cabecera = new BorderPane();
		cabecera.setPadding(new Insets(5));
		cabecera.setCenter(centro);
		cabecera.setRight(botonesBox);

		Scene scene = new Scene(cabecera, 640, 480);

		primaryStage.setTitle("Buscar y Reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
