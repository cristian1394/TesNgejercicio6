package MapsObjet;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.testNG.ClaseBaseFinalMobil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapObjectTarjeta  extends ClaseBaseFinalMobil{
	
	public MapObjectTarjeta(AppiumDriver<MobileElement> driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	protected By btnusucon = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btnLoginEmail']");
	protected By btncorreo1 = By.xpath("//android.widget.TextView[@text='Correo electrónico']");
	protected By correo = By.xpath("//android.widget.EditText[@resource-id='com.clarocolombia.miclaro.debug:id/edUsuario']");
	protected By contraseña = By.xpath("//android.widget.EditText[@resource-id='com.clarocolombia.miclaro.debug:id/edPassword']");
	protected By btniniciar = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btnLoginUsPass']");
	protected By cancelar = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btn31']");
    //
	protected By btnSelecEquipo = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");
	protected By continuar = By.xpath("//android.widget.Button[@text='Continuar']");
	protected By btnConfirmar= By.xpath("//android.widget.Button[@resource-id = 'com.clarocolombia.miclaro.debug:id/btn41']");
	
	
	protected By btnpagos = By.xpath("//android.widget.FrameLayout[@content-desc=\"Pagos\"]/android.widget.ImageView");
	protected By btnfactura = By.xpath("//android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button");
	protected By btndeseofactura = By.xpath("//android.view.ViewGroup/android.widget.Button[2]");
	protected By btnbarra = By.xpath("//android.view.View/android.view.View/android.view.View/android.view.View[11]");
	protected By btntarjeta = By.xpath("//android.view.View[@content-desc=\"Tarjeta de Crédito - Débito Tarjeta de Crédito - Débito\"]");
	protected By btncontinuar = By.xpath("//android.widget.Button[@content-desc=\"Continuar\"]");
	protected By btnnumtarjeta = By.xpath("//android.view.View[6]/android.widget.EditText");
	protected By btnmm = By.xpath("//android.widget.Spinner[@content-desc=\"MM\"]");
	protected By btnmm2 = By.xpath("//android.widget.ListView/android.widget.CheckedTextView[3]");
	protected By btnaaaa = By.xpath("//android.widget.Spinner[@content-desc=\"AAAA\"]");
	protected By btnaaaa2 = By.xpath("//android.widget.ListView/android.widget.CheckedTextView[3]");
	protected By btncodigoseg = By.xpath("//android.view.View/android.view.View/android.view.View[6]/android.view.View[6]/android.widget.EditText");
	protected By btncoutas = By.xpath("//android.widget.Spinner[@resource-id='CUOTAS']");
	protected By btncoutas2 = By.xpath("//android.widget.CheckedTextView[@text='6']");
	protected By btnnombreape = By.xpath("//android.widget.EditText[@resource-id='NOMBRE_TARJETA']");
	protected By btndocumentacion = By.xpath("//android.widget.Spinner[@resource-id='TIPO_DOCUMENTO']");
	protected By btncc = By.xpath("//android.widget.CheckedTextView[@text='C.C. (Cédula de Ciudadanía)']");
	protected By btncc2 = By.xpath("//android.widget.EditText[@resource-id='NUMERO_DOCUMENTO']");
	protected By btntelefono = By.xpath("//android.widget.EditText[@resource-id='TELEFONO']");
	protected By btncorreo = By.xpath("//android.widget.EditText[@resource-id='EMAIL']");
	protected By btncancelar = By.xpath("//android.widget.Button[@resource-id='btnCancelar']");
	protected By btnclickdevolver = By.xpath("//android.widget.ImageButton[@content-desc='Desplazarse hacia arriba']");
	protected By btnpersona = By.xpath("//android.widget.ImageView[@resource-id='com.clarocolombia.miclaro.debug:id/imgPerfil']");
	protected By btncerrarsesion = By.xpath("//android.widget.TextView[@resource-id='com.clarocolombia.miclaro.debug:id/tvCerrarSesion']");
	protected By btnsalir = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btn_aceptar']");
	protected By resultado =By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td");
}
