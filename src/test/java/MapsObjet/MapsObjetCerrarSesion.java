package MapsObjet;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.testNG.ClaseBaseFinalMobil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjetCerrarSesion extends ClaseBaseFinalMobil {

	public MapsObjetCerrarSesion(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	protected By esfero = By.xpath("//android.widget.ImageView[@resource-id='com.clarocolombia.miclaro.debug:id/imgEditarDir']");
	protected By departamento = By.xpath("//android.widget.LinearLayout/android.widget.Spinner[1]");
	protected By bogota = By.xpath("//android.widget.CheckedTextView[6]");
	protected By cuidad = By.xpath("//android.widget.LinearLayout/android.widget.Spinner[2]");
	protected By bogota2 = By.xpath("//android.widget.CheckedTextView[@text='BOGOTÁ, D.C.']");
	protected By barrio = By.xpath("//android.widget.EditText[@resource-id='com.clarocolombia.miclaro.debug:id/edtBarrio']");
	protected By tipo = By.xpath("//android.widget.Spinner[3]/android.widget.CheckedTextView");
	protected By tipo2 = By.xpath("//android.widget.ListView/android.widget.CheckedTextView[5]");
	protected By principal = By.xpath("//android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.EditText");
	protected By sufijo = By.xpath("//android.widget.CheckedTextView[@text='Selecciona']");
	protected By sufijo2 = By.xpath("//android.widget.ListView/android.widget.CheckedTextView[2]");
	protected By secundario = By.xpath("//android.view.ViewGroup[2]/android.widget.EditText[1]");
	protected By sufijo3 = By.xpath("//android.view.ViewGroup[2]/android.widget.Spinner/android.widget.CheckedTextView");
	protected By sufijo4 = By.xpath("//android.widget.ListView/android.widget.CheckedTextView[7]");
	protected By compu = By.xpath("//android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.EditText[2]");
	protected By complemento = By.xpath("//android.view.ViewGroup[3]/android.widget.Spinner/android.widget.CheckedTextView");
	protected By complemento2 = By.xpath("//android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
	protected By numero = By.xpath("//android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.EditText");
	protected By validar = By.xpath("//android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.Button[2]");
	protected By guardar = By.xpath("//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]");
	protected By cerrar = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button");
	protected By btnclickdevolver = By.xpath("//android.widget.ImageButton[@content-desc='Desplazarse hacia arriba']");
	protected By btnpersona = By.xpath("//android.widget.ImageView[@resource-id='com.clarocolombia.miclaro.debug:id/imgPerfil']");
	protected By btncerrarsesion = By.xpath("//android.widget.TextView[@resource-id='com.clarocolombia.miclaro.debug:id/tvCerrarSesion']");
	protected By btnsalir = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btn_aceptar']");
	protected By resultado =By.xpath("//android.widget.TextView[@text = '¡Hola!']");
}
