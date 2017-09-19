package test.matematica;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import matematica.BinomioNewton;

public class BinomioTest {

	BinomioNewton binomio ;
	BinomioNewton binomio1 ;
	BinomioNewton binomio2 ;
	BinomioNewton binomio3 ;
	@Before
	public void setUp() {
		binomio = new BinomioNewton(100,4664,1022);
		binomio1 = new BinomioNewton(1000 , 1212,4654);
		binomio2 = new BinomioNewton(3000,646,684);
		binomio3 = new BinomioNewton(8000,557,87);
	}

//	@Test
//	public void obtenerTerminosTartaTest() {
//	
//		BinomioNewton binom30 = new BinomioNewton(30,4,4);
//		long[]resultado = new long[binom30.getGrado()];
//		long[]esperado = {1,30,435,4060,27405,142506,593775,2035800,5852925,14307150,30045015,54627300,86493225,119759850,145422675,155117520,145422675,119759850,86493225,54627300,30045015,14307150,5852925,2035800,593775,142506,27405,4060,435,30,1};
//		resultado = BinomioNewton.obtenerTerminosTarta(binom30.getGrado() + 1);
//		long start = System.nanoTime();
//		
//		Assert.assertArrayEquals(esperado, resultado);
//		
//		long stop30 = System.nanoTime();
//		long tiempo = stop30 - start;
//		System.out.println("[Binomio]obtenerTerminosTartaTest: " + tiempo + " ns para grado 30");
//		/////////////////////////////////////////////////////////////////////////////////////////////
//		BinomioNewton binom20 = new BinomioNewton(20,4,4);
//		long []esperado2 = {1,20,190,1140,4845,15504,38760,77520,125970,167960,184756,167960,125970,77520,38760,15504,4845,1140,190,20,1};
//		resultado = BinomioNewton.obtenerTerminosTarta(binom20.getGrado() + 1);
//		long start20 = System.nanoTime();
//		
//		Assert.assertArrayEquals(esperado2, resultado);
//		
//		long stop20 = System.nanoTime();
//		long tiempo20 = stop20 - start20;
//		System.out.println("[Binomio]obtenerTerminosTartaTest: " + tiempo20 + " ns para grado 20");
//		/////////////////////////////////////////////////////////////////////////////////////////////	
//		BinomioNewton binom10 = new BinomioNewton(10,4,4);
//		long[]esperado1 = {1,10,45,120,210,252,210,120,45,10,1};
//		resultado = BinomioNewton.obtenerTerminosTarta(binom10.getGrado()+1);
//		long start10 = System.nanoTime();
//		
//		Assert.assertArrayEquals(esperado1, resultado);
//		
//		long stop10 = System.nanoTime();
//		long tiempo10 = stop10 - start10;
//		System.out.println("[Binomio]obtenerTerminosTartaTest: " + tiempo10 + " ns para grado 10");
//		
//		System.out.println();
//	}
//	
	
	@Test
	public void resolverBinomioTest() {
		long start = System.currentTimeMillis();
		
		Assert.assertTrue(binomio.resolverBinomio() != 0 );
		
		long stop = System.currentTimeMillis();
		long tiempo = stop - start;
		System.out.println("[Binomio]resolverBinomioTest: " + tiempo + " ms para grado 100");
		///////////////////////////////////////////////////////////////////////////////
		start = System.currentTimeMillis();
		
		Assert.assertTrue(binomio1.resolverBinomio() != 0 );
		
		stop = System.currentTimeMillis();
		tiempo = stop - start;
		System.out.println("[Binomio]resolverBinomioTest: " + tiempo + " ms para grado 1000");
		///////////////////////////////////////////////////////////////////////////////
		start = System.currentTimeMillis();
		
		Assert.assertTrue(binomio2.resolverBinomio() != 0 );
		
		stop = System.currentTimeMillis();
		tiempo = stop - start;
		System.out.println("[Binomio]resolverBinomioTest: " + tiempo + " ms para grado 3000");
		///////////////////////////////////////////////////////////////////////////////
		start = System.currentTimeMillis();
		
		Assert.assertTrue(binomio3.resolverBinomio() != 0 );
		
		stop = System.currentTimeMillis();
		tiempo = stop - start;
		System.out.println("[Binomio]resolverBinomioTest: " + tiempo + " ms para grado 8000");		
		
		System.out.println();
	}
	
//	@Test
//	public void resolverBinomioEstaticoTest() {
//		
//		long start = System.currentTimeMillis();
//		Assert.assertTrue(BinomioNewton.resolverBinomio(456, 3151, 100,2156) !=  0);
//		
//		long stop = System.currentTimeMillis();
//		long tiempo = stop - start;
//		System.out.println("[Binomio]resolverBinomioEstaticoTest: " + tiempo + " ms para grado 100");
//		/////////////////////////////////////////////////////////////////////////////////
//		start = System.currentTimeMillis();
//		Assert.assertTrue(BinomioNewton.resolverBinomio(456, 3151, 1000,2156) !=  0);
//		
//		stop = System.currentTimeMillis();
//		tiempo = stop - start;
//		System.out.println("[Binomio]resolverBinomioEstaticoTest: " + tiempo + " ms para grado 1.000" );
//		/////////////////////////////////////////////////////////////////////////////////
//		start = System.currentTimeMillis();
//		Assert.assertTrue(BinomioNewton.resolverBinomio(456, 3151, 2500,2156) !=  0);
//		
//		stop = System.currentTimeMillis();
//		tiempo = stop - start;
//		System.out.println("[Binomio]resolverBinomioEstaticoTest: " + tiempo + " ms para grado 2.500");
//		/////////////////////////////////////////////////////////////////////////////////
//		start = System.currentTimeMillis();
//		Assert.assertTrue(BinomioNewton.resolverBinomio(456, 3151, 5000,2156) !=  0);
//		
//		stop = System.currentTimeMillis();
//		tiempo = stop - start;
//		System.out.println("[Binomio]resolverBinomioEstaticoTest: " + tiempo + " ms para grado 5.000");
//		
//	}
	
	@Test
	public void mostrarBinomioTest() {
		BinomioNewton bin  =  new BinomioNewton(2, 4, -2);
		String resultado = "+16.0X2-16.0X1+4.0X0";
		long start = System.currentTimeMillis();
		Assert.assertEquals(resultado, bin.mostrarBinomioResuelto());
		
		long stop = System.currentTimeMillis();
		long tiempo = stop - start;
		System.out.println("[Binomio]mostrarBinomioTest: " + tiempo + " ms");
	}
	
	@Test
	public void queEvalueBienHornerGrado10(){
		long start = System.nanoTime();
		Assert.assertTrue(binomio.evaluarHorner(1)!=0);		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarHorner10: " + tiempo + " ns");
	}	
	
	@Test
	public void queEvalueBienHornerGrado20(){
		long start = System.nanoTime();
		Assert.assertTrue(binomio1.evaluarHorner(1)!=0);
		long tiempo = System.nanoTime() - start; 
		System.out.println("[BinomioEvaluarHorner20: " + tiempo + " ns");
	}
	
	@Test
	public void queEvalueBienHornerGrado30(){
		long start = System.nanoTime();
		Assert.assertTrue(binomio2.evaluarHorner(1) !=0);
		long tiempo = System.nanoTime() - start; 
		System.out.println("[BinomioEvaluarHorner30: " + tiempo + " ns");
		System.out.println("");
	}
	
	@Test
	public void queEvalueBienPowGrado10(){
		long start = System.nanoTime();
		
		Assert.assertTrue(binomio.evaluarPow(1)!=0);
		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarPowGrado10: " + tiempo + " ns");
	}
	
	@Test
	public void queEvalueBienPowGrado20(){
		long start = System.nanoTime();
		Assert.assertTrue(binomio1.evaluarPow(1)!=0);
		long tiempo = System.nanoTime() - start; 
		System.out.println("[BinomioEvaluarPowGrado20: " + tiempo + " ns");
	}
	
	
	@Test
	public void queEvalueBienPowGrado30(){
		long start = System.nanoTime();
		Assert.assertTrue(binomio2.evaluarPow(1)!=0);
		long tiempo = System.nanoTime() - start; 
		System.out.println("[BinomioEvaluarPowGrado30: " + tiempo + " ns");
		System.out.println("");
	}
	
	@Test
	public void queEvalueBienMSucesivasGrado10(){
		long start = System.nanoTime();
		
		Assert.assertTrue(binomio.evaluarMSucesivas(1)!=0);
		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarMsucesivasGrado10: " + tiempo + " ns");
	}
	
	@Test
	public void queEvalueBienMSucesivasGrado20(){
		long start = System.nanoTime();
		
		Assert.assertTrue(binomio1.evaluarMSucesivas(1)!=0);
		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarMsucesivasGrado20: " + tiempo + " ns");
	}	

	@Test
	public void queEvalueBienMSucesivasGrado30(){
		long start = System.nanoTime();
		
		Assert.assertTrue(binomio2.evaluarMSucesivas(1)!=0);
		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarMsucesivasGrado30: " + tiempo + " ns");
		System.out.println("");
	}	

	@Test
	public void queEvalueBienProgDinamicaGrado10(){
		long start = System.nanoTime();
		Assert.assertTrue(binomio.evaluarProgDinamica(1) !=0);		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarProgDinamica10: " + tiempo + " ns");
	}	

	@Test
	public void queEvalueBienProgDinamicaGrado20(){
		long start = System.nanoTime();
		Assert.assertTrue(binomio1.evaluarProgDinamica(1) !=0);		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarProgDinamica20: " + tiempo + " ns");
	}
	
	@Test
	public void queEvalueBienProgDinamicaGrado30(){
		long start = System.nanoTime();
		Assert.assertTrue(binomio2.evaluarProgDinamica(1) !=0);		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarProgDinamica30: " + tiempo + " ns");
		System.out.println("");
	}
	
	@Test
	public void queEvalueBienRecursivaParGrado10(){
		long start = System.nanoTime();
		
		Assert.assertTrue(binomio.evaluarRecursivaPar(1)!=0);
		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarRecursivaPar10: " + tiempo + " ns");
	}	
	
	@Test
	public void queEvalueBienRecursivaParGrado20(){
		long start = System.nanoTime();
		
		Assert.assertTrue(binomio1.evaluarRecursivaPar(1)!=0);
		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarRecursivaPar20: " + tiempo + " ns");
	}	
	
	@Test
	public void queEvalueBienRecursivaParGrado30(){
		long start = System.nanoTime();
		
		Assert.assertTrue(binomio2.evaluarRecursivaPar(1)!=0);
		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarRecursivaPar30: " + tiempo + " ns");
		System.out.println("");
	}	
	
	@Test
	public void queEvalueBienRecursivaGrado10(){
		long start = System.nanoTime();
		
		Assert.assertTrue(binomio.evaluarRecursiva(1)!=0);
		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarRecursiva10: " + tiempo + " ns");
	}	
	
	@Test
	public void queEvalueBienRecursivaGrado20(){
		long start = System.nanoTime();
		
		Assert.assertTrue(binomio1.evaluarRecursiva(1)!=0);
		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarRecursiva20: " + tiempo + " ns");
	}	
	
	@Test
	public void queEvalueBienRecursivaGrado30(){
		long start = System.nanoTime();
		
		Assert.assertTrue(binomio2.evaluarRecursiva(1)!=0);
		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarRecursiva30: " + tiempo + " ns");
		System.out.println("");
	}	
}