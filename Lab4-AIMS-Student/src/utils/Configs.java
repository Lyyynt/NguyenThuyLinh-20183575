package utils;

import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
/**
 * @author Nguyen Thuy Linh Contains the configs for AIMS Project
 */
public class Configs {

	// api constants
	public static final String GET_BALANCE_URL = "https://ecopark-system-api.herokuapp.com/api/card/balance/118609_group1_2020";
	public static final String GET_VEHICLECODE_URL = "https://ecopark-system-api.herokuapp.com/api/get-vehicle-code/1rjdfasdfas";
	public static final String PROCESS_TRANSACTION_URL = "https://ecopark-system-api.herokuapp.com/api/card/processTransaction";
	public static final String RESET_URL = "https://ecopark-system-api.herokuapp.com/api/card/reset";

	// demo data
	public static final String POST_DATA = "{"
			+ " \"secretKey\": \"BUXj/7/gHHI=\" ,"
			+ " \"transaction\": {"
			+ " \"command\": \"pay\" ,"
			+ " \"cardCode\": \"118609_group1_2020\" ,"
			+ " \"owner\": \"Group 1\" ,"
			+ " \"cvvCode\": \"185\" ,"
			+ " \"dateExpried\": \"1125\" ,"
			+ " \"transactionContent\": \"Pei debt\" ,"
			+ " \"amount\": 50000 "
			+ "}"
		+ "}";
	public static final String TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiIxMTg2MDlfZ3JvdXAxXzIwMjAiLCJpYXQiOjE1OTkxMTk5NDl9.y81pBkM0pVn31YDPFwMGXXkQRKW5RaPIJ5WW5r9OW-Y";

	// database Configs
	public static final String DB_NAME = "aims";
	public static final String DB_USERNAME = System.getenv("DB_USERNAME");
	public static final String DB_PASSWORD = System.getenv("DB_PASSWORD");

	public static String CURRENCY = "VND";
	public static float PERCENT_VAT = 10;

	// static resource
	public static final String IMAGE_PATH = "assets/images";
	public static final String INVOICE_SCREEN_PATH = "/views/fxml/invoice.fxml";
	public static final String INVOICE_MEDIA_SCREEN_PATH = "/views/fxml/media_invoice.fxml";
	public static final String PAYMENT_SCREEN_PATH = "/views/fxml/payment.fxml";
	public static final String RESULT_SCREEN_PATH = "/views/fxml/result.fxml";
	public static final String SPLASH_SCREEN_PATH = "/views/fxml/splash.fxml";
	public static final String CART_SCREEN_PATH = "/views/fxml/cart.fxml";
	public static final String SHIPPING_SCREEN_PATH = "/views/fxml/shipping.fxml";
	public static final String CART_MEDIA_PATH = "/views/fxml/media_cart.fxml";
	public static final String HOME_PATH  = "/views/fxml/home.fxml";
	public static final String HOME_MEDIA_PATH = "/views/fxml/media_home.fxml";
	public static final String POPUP_PATH = "/views/fxml/popup.fxml";

	public static Font REGULAR_FONT = Font.font("Segoe UI", FontWeight.NORMAL, FontPosture.REGULAR, 24);

	public static String[] PROVINCES = { "B???c Giang", "B???c K???n", "Cao B???ng", "H?? Giang", "L???ng S??n", "Ph?? Th???",
			"Qu???ng Ninh", "Th??i Nguy??n", "Tuy??n Quang", "Y??n B??i", "??i???n Bi??n", "H??a B??nh", "Lai Ch??u", "S??n La",
			"B???c Ninh", "H?? Nam", "H???i D????ng", "H??ng Y??n", "Nam ?????nh", "Ninh B??nh", "Th??i B??nh", "V??nh Ph??c", "H?? N???i",
			"H???i Ph??ng", "H?? T??nh", "Ngh??? An", "Qu???ng B??nh", "Qu???ng Tr???", "Thanh H??a", "Th???a Thi??n-Hu???", "?????k L???k",
			"?????k N??ng", "Gia Lai", "Kon Tum", "L??m ?????ng", "B??nh ?????nh", "B??nh Thu???n", "Kh??nh H??a", "Ninh Thu???n",
			"Ph?? Y??n", "Qu???ng Nam", "Qu???ng Ng??i", "???? N???ng", "B?? R???a-V??ng T??u", "B??nh D????ng", "B??nh Ph?????c", "?????ng Nai",
			"T??y Ninh", "H??? Ch?? Minh", "An Giang", "B???c Li??u", "B???n Tre", "C?? Mau", "?????ng Th??p", "H???u Giang",
			"Ki??n Giang", "Long An", "S??c Tr??ng", "Ti???n Giang", "Tr?? Vinh", "V??nh Long", "C???n Th??" };
}
