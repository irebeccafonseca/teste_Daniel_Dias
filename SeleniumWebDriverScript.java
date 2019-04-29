import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.AfterClass;

public class BuscarFilmes{

    private ChromeDrive driver;	

    @Test
     public void test() {
      System.setProperty("webdrive.chome.drive","C:/Filmes/filmes.exe");	
      drive = new ChomeDrive();

      driver.get("http://www.google.com.br");	
		boolean i = driver.getPageSource().contains("NomeFilme","AnoLancamento","DiretorNome","DiretorNasc");
		System.out.println(i); 
    

driver.close(); 
	 		
	}

    @AfterClass
      public static void tearDownTest(){
        driver.quit();
    }

}
