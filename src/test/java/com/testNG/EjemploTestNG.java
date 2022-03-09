package com.testNG;

import org.testng.annotations.Test;
import com.Utilidades.ExcelUtilidades;
import com.Utilidades.GenerarReportePdf;
import PagObjet.PagsObjectIngresarApp;
import PagObjet.PagsObjetCambioDireccion;
import PagObjet.PagsObjetCerrarSesion;
import PagObjet.PagsObjetTarjeta;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import java.io.File;

import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterClass;

public class EjemploTestNG

{

	// comentario 
	
	
	PagsObjectIngresarApp selecObject;
	PagsObjetTarjeta tarjeta;
	PagsObjetCambioDireccion selectObjetWidged;
	PagsObjetCerrarSesion alerts;
	PagsObjetCerrarSesion paginasPp;
	ClaseBaseFinalMobil claseBase;

	File rutaCarpeta = null;
	GenerarReportePdf generarReportepdf;
	String valor;
	private AppiumDriver<MobileElement> driver;
	@SuppressWarnings("unchecked")
	@BeforeClass
	@Parameters({ "rutaImagenReporte", "rutaOutput", "platformName", "deviceName", "platfotmVersion", "appPackage",
			"appActivity", "noReset", "autoGrantPermissior" })

	public void beforeClass(@Optional("default") String rutaImagenReporte, @Optional("default") String rutaOutput,
			@Optional("default") String platformName, @Optional("default") String deviceName,
			@Optional("default") String platfotmVersion, @Optional("default") String appPackage,
			@Optional("default") String appActivity, @Optional("default") String noReset,
			@Optional("default") String autoGrantPermissior) {

		driver = ClaseBaseFinalMobil.appiumDriverConection(platformName, deviceName, platfotmVersion, appPackage,
				appActivity, noReset, autoGrantPermissior);

		claseBase = new ClaseBaseFinalMobil(driver);
		generarReportepdf = new GenerarReportePdf();
		paginasPp = new PagsObjetCerrarSesion(driver);
		selectObjetWidged = new PagsObjetCambioDireccion(driver);
		alerts = new PagsObjetCerrarSesion(driver);
		tarjeta = new PagsObjetTarjeta(driver);
		selecObject = new PagsObjectIngresarApp(driver);
		// InputStream entrada = null;
		generarReportepdf.setRutaImagen(rutaImagenReporte);
		claseBase.setrutaOutput(rutaOutput, driver);
	}
    
	@Test(dataProvider = "Tools", description = "CAMBIO DE DIRECCIÓN")
	public void Ingresar_Direccion(String Ejecutar, String Evidencia, String Usuario, String Contrasena,
			String Departamento, String Ciudad, String Barrio, String TipoCalle, String NumPrincipal, String Sufijo1,
			String NumSecundario, String Sufijo2, String NumComponente, String Complemento, String NumComplemento)
			throws Exception {

		
		if (Ejecutar.equals("SI")) {
			// OBTENER EL NOMBRE DEL MÉTODO A EJECUTAR
			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
			if (Evidencia.equals("SI")) {
				// CREAR CARPETA
				rutaCarpeta = claseBase.crearCarpeta(nomTest);
				// INICIA VIDEO
				claseBase.iniVideo();
				// INICIA CREACIÓN DE REPORTE PDF
				generarReportepdf.crearPlantilla(nomTest, rutaCarpeta);
				// INICIO DE ACCIONES
				// INICIO
				selecObject.seleccionElements(Evidencia, Usuario, Contrasena, rutaCarpeta);
				selectObjetWidged.SelecBarraWidged(Evidencia,rutaCarpeta);
				alerts.findAlerts(Evidencia, Departamento, Ciudad, Barrio, TipoCalle, NumPrincipal, rutaCarpeta);
				// AGREGAR DIRECCIÓN
				
				// CERRAR SESIÓN
				//cerrarSesion.CerrarClaro(Evidencia, rutaCarpeta);
				// FIN VIDEO
				claseBase.finVideo(rutaCarpeta);
				// FINALIZA CREACIÓN DE REPORTE PDF
				generarReportepdf.cerrarPlantilla();
			} else {
				// INICIO
				selecObject.seleccionElements(Evidencia, Usuario, Contrasena, rutaCarpeta);
				selectObjetWidged.SelecBarraWidged(Evidencia,rutaCarpeta);
				// AGREGAR DIRECCIÓN
				alerts.findAlerts(Evidencia, Departamento, Ciudad, Barrio, TipoCalle, NumPrincipal, rutaCarpeta);
				// CERRAR SESIÓN
				//cerrarSesion.CerrarClaro(Evidencia, rutaCarpeta);
			}
		}
			
	}
	
	@DataProvider(name = "Tools")
	public Object[][] primerPaso() throws Exception {
		Object[][] arreglo = ExcelUtilidades.getTableArray("./Data/Excel.xlsx", "Hoja1");

		return arreglo;
	}
	
   
	
	@Test(dataProvider = "Tools1", description = "PAGOS")
	public void Ingresar_Direccion12(String Ejecutar, String Evidencia, String Usuario, String Contrasena,
			String NumeroTarjeta, String CodigoSeguridad, String NombreImpreso, String NumeroDocumento, String Telefono, String Correo)
			throws Exception {
		
		
		if (Ejecutar.equals("SI")) {
			// OBTENER EL NOMBRE DEL MÉTODO A EJECUTAR
			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
			generarReportepdf.setImg(0);
			if (Evidencia.equals("SI")) {
				// CREAR CARPETA
				rutaCarpeta = claseBase.crearCarpeta(nomTest);
				// INICIA VIDEO
				claseBase.iniVideo();
				// INICIA CREACIÓN DE REPORTE PDF
				generarReportepdf.crearPlantilla(nomTest, rutaCarpeta);
				// INICIO DE ACCIONES
				// INICIO
				
				tarjeta.seleccionpagos(Evidencia, Usuario, Contrasena,NumeroTarjeta, CodigoSeguridad, NombreImpreso,NumeroDocumento,
						Telefono,Correo,rutaCarpeta);
				
				// CERRAR SESIÓN
				//cerrarSesion.CerrarClaro(Evidencia, rutaCarpeta);
				// FIN VIDEO
				claseBase.finVideo(rutaCarpeta);
				// FINALIZA CREACIÓN DE REPORTE PDF
				generarReportepdf.cerrarPlantilla();
			} else {
				// INICIO
				tarjeta.seleccionpagos(Evidencia, Usuario, Contrasena,NumeroTarjeta, CodigoSeguridad, NombreImpreso,NumeroDocumento,
						Telefono,Correo,rutaCarpeta);
				// CERRAR SESIÓN
				//cerrarSesion.CerrarClaro(Evidencia, rutaCarpeta);
			}
		}
	}

	@DataProvider(name = "Tools1")
	public Object[][] primerPaso1() throws Exception {
		Object[][] arreglo = ExcelUtilidades.getTableArray("./Data/Excel.xlsx", "Hoja2");

		return arreglo;
	}
	
      
	@AfterClass
	public void afterClass() {
		// driver.quit();
	}
}
