package prueba;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TESTEO {

	@Test
	public void testTrue() {
	        EvaluadorBoleano evaluador = new EvaluadorBoleano();
	        assert evaluador.evalua("verdadero") == true;
	    }

}
