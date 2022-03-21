package lista_sencilla;

import objeto_nodo.nodo;

public class lista {
	private nodo inicio;
	private nodo fin;
	
	
	private boolean Isvacio() {
		return inicio==null?true:false;
	}
	
	public void insertar (int clave)
	{
		nodo n=new nodo (clave);
		if (Isvacio())
		{
			inicio=n;
			fin=n;
		}
			else 
				
				if(clave<inicio.getClave()){
					n.setSig(inicio);
					inicio=n;
					
				}
				else 
					
					if(clave>fin.getClave()) {
						fin.setSig(n);
						fin=n;
					}
					else {
						
						nodo aux=inicio;
						nodo aux2 =inicio;
						
						
						while(clave>aux.getClave())
						{
							aux2=aux;
							aux.setSig(aux);
						}
						aux2.setSig(n);
						n.setSig(aux);
				
					}	
			
			
	}
	public void Eliminar (int clave)
	{
		
		if (Isvacio() || !Existe(clave))
		{
			System.out.println("no hay nada para eliminar");
		
		}
			else 
				if(  inicio.getClave()==fin.getClave()  ){
				
					inicio=null;
					fin=null;
				

					}
					else 
						if(clave==inicio.getClave()){
							
							
						inicio.setSig(inicio);
					
						}
						else 
					
					  
					if(inicio.getSig().getSig() == null) {
					
						inicio.setSig(null);
					} 
		
						else 
							if(clave==fin.getClave()){
								nodo puntero = inicio;
								
								while(puntero.getSig() != null) {
									puntero.setSig(puntero);
								}
							
								puntero.setSig( null );
						}
						else
							if(clave>inicio.getClave()  && clave<fin.getClave() ) {
								
								nodo aux=inicio;
								nodo aux2 = null;
								
									while(clave>aux.getClave())
									{
										aux2=aux;
										aux.setSig(aux);
									
									}
									
								aux2.setSig(aux.getSig());
								aux.setSig(null);
							}
		
	}
		private boolean Existe(int clave) {
			
			nodo puntero=inicio;
			
			while( puntero!=null  && puntero.getClave()<=fin.getClave() )
				
			{
				
				if (puntero.getClave()==clave)
				{
					return true;
				}
				 puntero.setSig(puntero);
					
			}
			System.out.println("clave "+clave+" no existe");
				return false ;
		}
		
		public void Buscar(int clave) {
			
			if(  !Isvacio()     &&       Existe(clave) )
			{
			nodo puntero=inicio;
			while(clave!=puntero.getClave())
			{
				 puntero.setSig(puntero);
			}
				System.out.println(puntero.toString());
			}
			
		else
			System.out.println("no hay datos en : " +clave+ " a mostrar");
		}

		public void Mostrarlista() {
			nodo puntero=inicio;
			if(puntero!=null)
			{
				System.out.println(puntero.toString());
				 puntero.getSig();
					
			}
			
			}
	
		
	
}
