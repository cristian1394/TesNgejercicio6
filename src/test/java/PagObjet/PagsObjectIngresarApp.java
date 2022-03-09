package PagObjet;

import java.io.File;
import MapsObjet.MapsObjetIngresarApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PagsObjectIngresarApp extends MapsObjetIngresarApp {
	
	public PagsObjectIngresarApp(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
	}

	
	public void seleccionElements(String Evidencia,String Usuario,String Contrasena,File rutaCarpeta) throws Exception {
		
		try {
		
			tiempoEspera(20000);
			click(btnusucon, rutaCarpeta, Evidencia);
			tiempoEspera(5000);
			click(btncorreo, rutaCarpeta, Evidencia);
			tiempoEspera(1000);
			sendkey(Usuario,correo, rutaCarpeta, Evidencia);
			sendkey(Contrasena,contraseña, rutaCarpeta, Evidencia);
			click(btniniciar, rutaCarpeta, Evidencia);
			tiempoEspera(4000);
			click(cancelar, rutaCarpeta,Evidencia);
			
		} catch (Exception e) {
			System.out.println(e);
		}
     }	
}
