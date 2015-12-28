package code;

import java.util.ArrayList;
import java.util.List;

import numeros.MultiploVariosNumeros;
import numeros.TipoNumero;

public class InicializarEstrategia {

	public static List<TipoNumero>  inicializarEstrategia(){
		List<TipoNumero> tipos = new ArrayList<TipoNumero>();
		tipos.add(new MultiploVariosNumeros("FizzBuzz", 3,5));
		tipos.add(new MultiploVariosNumeros("Dos",2));
		tipos.add(new MultiploVariosNumeros("Fizz",3));
		tipos.add(new MultiploVariosNumeros("Buzz",5));
		tipos.add(new MultiploVariosNumeros("Multiplo Siete",7));
		return tipos;
	}
}
