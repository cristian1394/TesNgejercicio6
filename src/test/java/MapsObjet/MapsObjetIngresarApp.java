package MapsObjet;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.testNG.ClaseBaseFinalMobil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjetIngresarApp extends ClaseBaseFinalMobil 
{
	public MapsObjetIngresarApp (AppiumDriver<MobileElement> driver) 
	{
		super(driver);
		this.driver = driver;
		
	}
	
	protected By btnusucon = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btnLoginEmail']");
	protected By btncorreo = By.xpath("//android.widget.TextView[@text='Correo electrónico']");
	protected By correo = By.xpath("//android.widget.EditText[@resource-id='com.clarocolombia.miclaro.debug:id/edUsuario']");
	protected By contraseña = By.xpath("//android.widget.EditText[@resource-id='com.clarocolombia.miclaro.debug:id/edPassword']");
	protected By btniniciar = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btnLoginUsPass']34564324545");
	protected By cancelar = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btn31']");
    //
	protected By btnSelecEquipo = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");
	protected By continuar = By.xpath("//android.widget.Button[@text='Continuar']");
	protected By btnConfirmar= By.xpath("//android.widget.Button[@resource-id = 'com.clarocolombia.miclaro.debug:id/btn41']");
	
	
	
	protected By resultado =By.xpath("//android.widget.TextView[@text = '¡Hola!']");

}
