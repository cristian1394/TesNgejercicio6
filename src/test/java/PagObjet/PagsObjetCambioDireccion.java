package PagObjet;

import java.io.File;

import org.testng.annotations.Test;

import MapsObjet.MapsObjectCambioDireccion;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PagsObjetCambioDireccion extends MapsObjectCambioDireccion

{
	
	public PagsObjetCambioDireccion(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	/*
	public void urlAcceso(String url) {
		driver.get(url);
		// busquedaInicial();
	}
	*/
	public void SelecBarraWidged(String Evidencia,File rutaCarpeta) throws Exception {
	
		try {
		click(btnlogo, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(btncorreo, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(btnactualizar, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(btnnumcelular, rutaCarpeta, Evidencia);
		tiempoEspera(5000);
		
		
		} catch (Exception e) {
			System.out.println(e);
		}
		//String valor = capturarValorSelenium(resultado);
		//return valor;
		
	}

}


