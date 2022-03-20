package arboles;

public class ArbolBinarioBusqueda<T> {
	private NodoABB<T> Raiz;
	public T 		   Dr;
	
	public ArbolBinarioBusqueda() {
		Raiz=null;
	}
	
	public NodoABB<T> getRaiz(){
		return Raiz;
	}
	
	public boolean Inserta(T dato){
		if(dato==null)
			return false;
		if(Raiz==null){
			Raiz=new NodoABB<T>(dato);
			return true;
		}
		return Inserta(Raiz,dato);
	}
	
	private boolean Inserta(NodoABB<T> R,T dato) {
		String IdDato=dato.toString();
		String IdRaiz=R.Info.toString();
		if(IdDato.compareToIgnoreCase(IdRaiz)==0)
			return false;
		if(IdDato.compareToIgnoreCase(IdRaiz)<0){
			if(R.getSubIzq()!=null)
				return Inserta(R.getSubIzq(),dato);
			R.setSubIzq(new NodoABB<T>(dato));
			return true;
		}
		if(R.getSubDer()!=null)
			return Inserta(R.getSubDer(),dato);
		R.setSubDer(new NodoABB<T>(dato));
		return true;
	}

	public boolean Retirar(T Dato){
		if(Raiz==null)
			return false;
		return Retirar(Raiz, Dato);
	}
	
	private boolean Retirar(NodoABB<T> R,T Infor){
		boolean b=true;
	  	NodoABB<T> Ant=null;
	  	String Llave=Infor.toString();
	  	while (R != null) {
	  	   if ( Llave.compareTo( R.Info.toString()  )  < 0 )
	  	   {
	  	      Ant=R;
	  	      R=R.getSubIzq();
	  	      b=false;
	  	   }
	  	   else
	 	          if ( Llave.compareTo( R.Info.toString()  )  > 0 )
	 	          {
	 	          	 Ant=R;
	  	         R=R.getSubDer();
	  	         b=true;
	  	      }
	  	      else
	  	         break;// Localizo el nodo
	  	}
	  	if (R==null)
	  	   return false;
	  	if (R.getSubIzq() != null && R.getSubDer() != null)  // Tiene dos hijos
	  	{
	  	    // Buscamos el nodo mas pequeño del subárbol derecho
	  		NodoABB<T> Temp=R.getSubDer();
	  		NodoABB<T> Aux=R;
	  		boolean RamaIzq=false;
	  		while (Temp.getSubIzq() != null)
	  		{
	  		   Aux=Temp;
	  		   Temp=Temp.getSubIzq();
	  		   RamaIzq=true;
	  		}
	  	    // sustituyo valor
	  	    Dr = R.Info;
	  		R.Info = Temp.Info;
	          // Elimino el nodo que sustituye
	  		if (RamaIzq)
	  		{
	  		   if (Temp.getSubIzq() == null)
	  		      Aux.setSubIzq(Temp.getSubDer());
	  		   else
	  		      Aux.setSubIzq(Temp.getSubIzq());
	  		}
	  		else
	  		{
	  		      Aux.setSubDer(Temp.getSubDer());
	  		}
	          return true;
	  	}
	  	else
	  	{
	  		if (R==Raiz)//Borrando la raiz y puede tener uno o cero hijos
	  		{
	  			Dr=R.Info;
	  			if (R.getSubIzq()==null)
	  			   Raiz=R.getSubDer();
	  			else
	  			   Raiz=R.getSubIzq();
	  	    }
	  	    else // Resto de nodos con cero o un hijo
	  	    {
	  	    	Dr=R.Info;
	  		   if (R.getSubIzq() == null)
	  		      if (b)
	  		         Ant.setSubDer(R.getSubDer());
	  		      else
	  		         Ant.setSubIzq(R.getSubDer());
	  		   else
	  		      if (b)
	  		         Ant.setSubDer(R.getSubIzq());
	  		      else
	  		         Ant.setSubIzq(R.getSubIzq());
	  		}
	  	}
	  	return true;		
		
		
	}
	
	int Alto;
	public int Altura(){
		if(Raiz==null)
			return 0;
		Alto=0;
		return Altura(Raiz,1);
	}
	
	private int Altura(NodoABB<T> Raiz,int Nivel){
		if(Raiz==null)
			return Nivel;

		Altura(Raiz.getSubIzq(),Nivel+1);
		if(Nivel>Alto)
			Alto=Nivel;
		Altura(Raiz.getSubDer(),Nivel+1);

		return Alto;
	}	
	
	public void InOrden(NodoABB<T> Raiz){
		if(Raiz==null)
			return;
		InOrden(Raiz.getSubIzq());
		System.out.println(Raiz.Info);
		InOrden(Raiz.getSubDer());
	}
	
	public void PreOrden(NodoABB<T> Raiz){
		if(Raiz==null)
			return;
		System.out.println(Raiz.Info);
		PreOrden(Raiz.getSubIzq());
		PreOrden(Raiz.getSubDer());
	}
	
	public void PostOrden(NodoABB<T> Raiz){
		if(Raiz==null)
			return;
		PostOrden(Raiz.getSubIzq());
		PostOrden(Raiz.getSubDer());
		System.out.println(Raiz.Info);
	}
	
	public int Length(){
		return Length(Raiz);
	}
	
	public int Length(NodoABB<T> Raiz ){
		if(Raiz==null)
			return 0;
		return Length(Raiz.getSubIzq())+1+Length(Raiz.getSubDer());
	}
	
	public boolean Buscar(T dato) {
		if(dato==null || Raiz==null)
			return false;
		return Buscar(Raiz,dato);
	}
	
	public boolean Buscar(NodoABB<T> R,T dato) {
		if(R==null)
			return false;
		String IdRaiz=R.Info.toString(),
			   IdDato=dato.toString();
		if(IdDato.compareTo(IdRaiz)==0)
			return true;
		if(IdDato.compareTo(IdRaiz)<0)
			return Buscar(R.getSubIzq(),dato);
		else
			return Buscar(R.getSubDer(),dato);
	}
	
	public NodoABB<T> BuscarNodo(T dato) {
		if(dato==null || Raiz==null)
			return null;
		return BuscarNodo(Raiz,dato);
	}
	
	public NodoABB<T> BuscarNodo(NodoABB<T> R,T dato) {
		if(R==null)
			return null;
		String IdRaiz=R.Info.toString(),
			   IdDato=dato.toString();
		if(IdDato.compareTo(IdRaiz)==0)
			return R;
		if(IdDato.compareTo(IdRaiz)<0)
			return BuscarNodo(R.getSubIzq(),dato);
		else
			return BuscarNodo(R.getSubDer(),dato);
	}
}
