package PagObjet;

import java.io.File;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import MapsObjet.MapsObjetCerrarSesion;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PagsObjetCerrarSesion extends MapsObjetCerrarSesion {
	
	
	public PagsObjetCerrarSesion(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	/*
	public void urlAcceso(String url) {
		driver.get(url);
		// busquedaInicial();
	}
	*/
	
	public void findAlerts(String Evidencia,String NumComponente,String Departamento,String  Barrio,String TipoCalle,String Complemento,
			File rutaCarpeta) throws Exception {
	
		try {
		tiempoEspera(5000);
		click(esfero, rutaCarpeta, Evidencia);
		tiempoEspera(7000);
		click(departamento, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(bogota, rutaCarpeta, Evidencia);
		tiempoEspera(5000);
		click(cuidad, rutaCarpeta, Evidencia);
		tiempoEspera(3000);
		click(bogota2, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		sendkey(Barrio,barrio,rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(tipo, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(tipo2, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		scrollVertical(rutaCarpeta, 330, 930, 430, 2, Evidencia);
		tiempoEspera(2000);
		sendkey(TipoCalle,principal,rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(sufijo, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(sufijo2, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		sendkey(Complemento,secundario,rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(sufijo3, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(sufijo4, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		sendkey(Complemento,compu,rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(complemento, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(complemento2, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		sendkey(Departamento,numero,rutaCarpeta, Evidencia);
		scrollVertical(rutaCarpeta,330, 930, 430, 1, Evidencia );
		click(validar, rutaCarpeta, Evidencia);
		tiempoEspera(5000);
		click(guardar, rutaCarpeta, Evidencia);
		tiempoEspera(10000);
		click(cerrar, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(btnclickdevolver, rutaCarpeta, Evidencia);
		tiempoEspera(1000);
		click(btnclickdevolver, rutaCarpeta, Evidencia);
		tiempoEspera(1000);
		click(btnclickdevolver, rutaCarpeta, Evidencia);
		tiempoEspera(1000);
		click(btnclickdevolver, rutaCarpeta, Evidencia);
		tiempoEspera(1000);
		click(btnpersona, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(btncerrarsesion, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(btnsalir, rutaCarpeta, Evidencia);
		tiempoEspera(5000);
		
		
		} catch (Exception e) {
			System.out.println(e);
		}
		//String valor = capturarValorSelenium(resultado);
		//return valor;
		
	  }

   }

