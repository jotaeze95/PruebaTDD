package prueba;

public class EvaluadorBoleano {

	public boolean eval(String expresion) {
		if( expresion.startsWith("(") &&  expresion.endsWith(")")){
            expresion = expresion.substring(1, expresion.length()-1);
        }
        return "verdadero".equals(expresion);
    }

}
