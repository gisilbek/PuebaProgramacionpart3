package MazoCarta;

//package cartasdepoker;
import java.util.Random;

public class MazoCarta extends Card {


	//import javax.smartcardio.Card;

	public MazoCarta(String string, String string2) {
		super(string, string2);
		// TODO Auto-generated constructor stub
	}

	public class MazoCartas {

	    private Card mazo[]; 
	    private int cartaActual; 
	    private final int NUMERO_DE_CARTAS = 52;
	    private Random numeroAleatorio;
	    
	    public MazoCartas(){
	    
	    	String valor[] = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Jack", "Queen", "King"};
	        String figura[] = {"Corazones", "Diamantes", "Picas", "Trebol"};

	        mazo = new Card[NUMERO_DE_CARTAS]; 

	        cartaActual = 0; 
	        numeroAleatorio = new Random(); 
	       
	        
	        for( int contador = 0; contador < mazo.length; contador++){
	            mazo[contador] = new Card ( valor[ contador % 13 ], figura[ contador/13 ] );
	          
	        }
	    } //Fin del Constructor

	    public void barajar(){
	        //Antes de barajar el repartidor debe iniciar en mazo[0] nuevamente
	        cartaActual = 0;
	        
	        for( int primera = 0; primera < mazo.length; primera++ ){

	            //Seleccionar una carta de manera aleatoria entre 0 y 51
	            int segunda = numeroAleatorio.nextInt( NUMERO_DE_CARTAS );

	            //Intercambiar carta actual por la seleccionada aleatoriamente
	            Card temporal = mazo[ primera ];
	            mazo[ primera ] = mazo[ segunda ];
	            mazo[ segunda ] = temporal;
	        }
	    }

	    public Card repartirCartas(){
	        //Determinar si la carta pertenece al mazo
	        if( cartaActual < mazo.length )
	            return mazo[ cartaActual++ ]; //Retorna carta actual en el array
	        else
	            return null; //Indica que todas las cartas han sido repartidas
	    }
	} //Fin de la Clase
}
