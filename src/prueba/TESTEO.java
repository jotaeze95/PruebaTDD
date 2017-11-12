package prueba;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TESTEO {

	@Test
	public void testTrue() {
	        EvaluadorBoleano evaluador = new EvaluadorBoleano();
	        assert evaluador.eval("verdadero") == true;
	    }
	
	@Test
	public void testFalse() {
	    EvaluadorBoleano evaluador = new EvaluadorBoleano();
	    assert evaluador.eval("falso") == false;
	}
	
	@Test
	public void testParentesis() {
	    EvaluadorBoleano evaluador = new EvaluadorBoleano();
	    assert evaluador.eval("(verdadero)") == true;        
	    assert evaluador.eval("(false)") == false;
	}

}
