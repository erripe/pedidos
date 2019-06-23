package controller;

import java.math.BigDecimal;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import model.Produto;
import service.MainService;

public class MainController {

	@FXML
	private Label codLabel;

	@FXML
	private Label descLabel;

	@FXML
	private TableView<Produto> tableView;

	@FXML
	private TableColumn<Produto, Long> codProd;

	@FXML
	private TableColumn<Produto, String> descProd;

	@FXML
	private TableColumn<Produto, BigDecimal> valorCompra;

	@FXML
	private TableColumn<Produto, Long> codFornecedor;

	@FXML
	private Button findBtn;

	@FXML
	private Button postBtn;

	@FXML
	private Button putBtn;

	@FXML
	private Button delBtn;

	@FXML
	private Button saveBtn;

	@FXML
	private Button putBackBtn;

	@FXML
	private TextField tfCodProd;

	@FXML
	private TextField tfDescProd;

	@FXML
	private TextField tfEditCodProd;

	@FXML
	private TextField tfEditDescProd;

	@FXML
	private TextField tfEditCodFornecedor;

	@FXML
	private TextField tfEditValue;

	@FXML
	private Pane putPanel;

	MainService service = new MainService();

	@FXML
	public void initialize() {
		assert tfCodProd != null : "fx:id=\"tfCodProd\" was not injected: check your FXML file 'Main.fxml'.";
		assert postBtn != null : "fx:id=\"postBtn\" was not injected: check your FXML file 'Main.fxml'.";
		assert tableView != null : "fx:id=\"listProd\" was not injected: check your FXML file 'Main.fxml'.";
		assert findBtn != null : "fx:id=\"findBtn\" was not injected: check your FXML file 'Main.fxml'.";
		assert delBtn != null : "fx:id=\"delBtn\" was not injected: check your FXML file 'Main.fxml'.";
		assert putBtn != null : "fx:id=\"putBtn\" was not injected: check your FXML file 'Main.fxml'.";
		assert tfDescProd != null : "fx:id=\"tfDescProd\" was not injected: check your FXML file 'Main.fxml'.";

		codProd.setCellValueFactory(new PropertyValueFactory<>("codProd"));
		descProd.setCellValueFactory(new PropertyValueFactory<>("descProd"));
		valorCompra.setCellValueFactory(new PropertyValueFactory<>("valorCompra"));
		codFornecedor.setCellValueFactory(new PropertyValueFactory<>("codFornecedor"));
	}

	@FXML
	private void teste(ActionEvent event) {
	}

	@FXML
	private void findBtn(ActionEvent event) throws Exception {
		tableView.getItems().clear();
		tableView.getItems().addAll(service.produtoFindList(tfCodProd.getText(), tfDescProd.getText()));
	}

	@FXML
	private void delBtn(ActionEvent event) throws Exception {
		boolean sucess;

		sucess = service.produtoDel(tableView.getSelectionModel().getSelectedItem());
		findBtn(event);

		if (sucess) {
			msgSucess();
		}
	}

	@FXML
	void putBackBtn(ActionEvent event) {
		putPanel.setVisible(false);

	}

	@FXML
	void postBtn(ActionEvent event) {
		cleanFields();
		putPanel.setVisible(true);
	}

	@FXML
	void putBtn(ActionEvent event) throws Exception {
		if (tableView.getSelectionModel().isEmpty()) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText(null);
			alert.setContentText("Selecione um registro para editar!");
			alert.showAndWait();
		} else {
			setBtnPut();
			fillProduto(tableView.getSelectionModel().getSelectedItem());
		}
	}

	@FXML
	void saveBtn(ActionEvent event) throws Exception {
		boolean sucess;

		Produto prd = new Produto();
		prd.setCodFornecedor(Long.parseLong(tfEditCodFornecedor.getText()));
		prd.setDescProd(tfEditDescProd.getText());
		prd.setValorCompra(new BigDecimal(Double.parseDouble(tfEditValue.getText())));

		if (tfEditCodProd.getText().equals("")) {
			sucess = service.produtoInsert(prd);
		} else {
			prd.setCodProd(Long.parseLong(tfEditCodProd.getText()));
			sucess = service.produtoEdit(prd);
		}

		cleanFields();
		putPanel.setVisible(false);

		if (sucess) {
			msgSucess();
		}

		findBtn(event);

	}

	// FUNÇÕES DE PAINEL E BOTÃO

	void setBtnPut() {
		putPanel.setVisible(true);
	}

	void fillProduto(Produto prd) {
		tfEditCodProd.setText("" + prd.getCodProd());
		tfEditDescProd.setText(prd.getDescProd());
		tfEditCodFornecedor.setText("" + prd.getCodFornecedor());
		tfEditValue.setText("" + prd.getValorCompra());
	}

	void cleanFields() {
		tfEditCodProd.setText("");
		tfEditDescProd.setText("");
		tfEditCodFornecedor.setText("");
		tfEditValue.setText("");
	}

	void msgSucess() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Sucesso");
		alert.setHeaderText(null);
		alert.setContentText("Operação executada com sucesso!");

		alert.showAndWait();
	}

	// VALIDANDO CAMPOS DE NÚMERO

	@FXML
	void verifNumCodPrd(KeyEvent event) {
		tfCodProd.textProperty().addListener(new ChangeListener<String>() {
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (!newValue.matches("\\d*")) {
					tfCodProd.setText(newValue.replaceAll("[^\\d]", ""));
				}
			}
		});
	}

	@FXML
	void verifNumCodFornecedor(KeyEvent event) {
		tfEditCodFornecedor.textProperty().addListener(new ChangeListener<String>() {
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (!newValue.matches("\\d*")) {
					tfEditCodFornecedor.setText(newValue.replaceAll("[^\\d]", ""));
				}
			}
		});
	}

	@FXML
	void verifNumValue(KeyEvent event) {
		tfEditValue.textProperty().addListener(new ChangeListener<String>() {
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (!newValue.matches("\\d*")) {
					tfEditValue.setText(newValue.replaceAll("[^.\\d]", ""));
				}
			}
		});
	}

}