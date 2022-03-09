package MapsObjet;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.testNG.ClaseBaseFinalMobil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjectCambioDireccion extends ClaseBaseFinalMobil

{
	public MapsObjectCambioDireccion(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    
	protected By btnlogo = By.xpath("//android.widget.ImageView[@resource-id='com.clarocolombia.miclaro.debug:id/imgPerfil']");
	protected By btncorreo = By.xpath("//android.widget.TextView[@resource-id='com.clarocolombia.miclaro.debug:id/tvConfiguracion']");
	protected By btnactualizar = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btnimgActualizarDatos']");
	protected By btnnumcelular = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btnimgActualizarDatos']");
	 protected By resultado =By.xpath("//android.widget.TextView[@text = '¡Hola!']");
 
}
