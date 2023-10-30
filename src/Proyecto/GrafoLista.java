/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import org.graphstream.ui.layout.Layout;
import org.graphstream.ui.layout.springbox.implementations.SpringBox;

import org.graphstream.ui.view.Viewer;



/**
 *
 * @author Samantha
 */
public class GrafoLista {
    private int numVerts;
    private int MaxVerts;
    VerticeUsuario [] TabAdy;  
/**
     * Constructor de GrafoLista
     * @param maxV , máximo de vertices para la tabla de adyacencias
     */
    public GrafoLista(int maxV) {
        TabAdy = new VerticeUsuario[maxV];
        this.numVerts = 0;
        this.MaxVerts =maxV; 
    }
    /**
     * Verifica si el grafo esta vacío
     *
     * @return, True si el nro de vertices es 0, false si ya hay vertices en el grafo.
     */
    public boolean isEmpty(){
        return numVerts == 0;
    }
    /**
     * busca la lista de adyacencia de un vertice especifico
     *@param numV, número de vertice
     * @return, retorna la lista de adyacencia de tal vertice, si el grafo esta vacio, o el vertice esta fuera de 
     * rango, retorna una lista vacia
     */
    public ListaArcos listaAdy(int numV){
       
        if (isEmpty()){
            System.out.println("Grafo vacio");
            return new ListaArcos();
        }else if(numV< 0 || numV >= numVerts){
            System.out.println("Vértice Fuera de Rango"); 
            return new ListaArcos();
        }
        
        return TabAdy[numV].getList_ady();
    }
    
    /**
     * Busca y devuelve el nro de vertice
     * @param Usuario , nombre del VerticeUsuario a buscar
     * @return, el nro de vertice, si no lo encuentra retorna -1
     */
    public int numVertice(String Usuario){
        if(this.isEmpty() && MaxVerts ==0){
        return -1;}
        for (int i = 0; i < numVerts; i++) {
            if(TabAdy[i].getUsuario().equalsIgnoreCase(Usuario)){
                return TabAdy[i].getNumVertice();
            
            }
        }
        return -1;
    }
    /**
     *   Crea un nuevo vertice usuario;
     * @param Usuario , nombre del nuevo VerticeUsuario a crear.
     * @return, true si el usuario fue creado correctamente y registrado, false si el usuario ya existía
     */
   
    public boolean NewUsuario(String Usuario){
       
        if (numVerts == MaxVerts) {
            // Si el array está lleno, creamos un nuevo array con el doble de tamaño
            VerticeUsuario[] nuevoArray = new VerticeUsuario[(MaxVerts+1) * 2];
            
            System.arraycopy(TabAdy, 0, nuevoArray, 0,MaxVerts );
            
            TabAdy = nuevoArray;
            MaxVerts = (MaxVerts+1)*2;
        }
        if (numVertice(Usuario) == -1){
            VerticeUsuario NewU= new VerticeUsuario(Usuario);
            NewU.setNumVertice(numVerts); // aqui le asigna el nro
            TabAdy[numVerts] = NewU;
            numVerts++;
            
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Dicho Usuario ya existe, use otro Nombre!");
            return false;
        }
    
    }
    /**
     * Crea un arco entre 2 verticesUsuario
     * @param A, Nombre del usuario que quiere seguir a B
     * @param B, Nombre del usuario a ser seguido por A.
     * @return, True, si ya se seguian o si se creo el arco correctamente, False si alguno de los 2 vertices no existe
     */
    public boolean  nuevoArco(String A, String B){
        int V1 = numVertice(A);
        int V2 = numVertice(B);
      
        
        if(V1 <0  || V2<0){
                JOptionPane.showMessageDialog(null, "Aun no ha registrado un Usuario!");
                return false;
            
        }else if(adyacente(A,B)){
            JOptionPane.showMessageDialog(null, "Ya se seguían!");
        }else{
                TabAdy[V1].getList_ady().InsertarFinal(V2);
                
            }
        return true;
        }
    /**
     * Verifica si dos VerticesUsuario son adyacentes
     * @param Usuario1, Nombre del VerticeUsuario1
     * @param Usuario2 , Nombre del VerticeUsuario2
     * @return, True si Usuario1 y Usuario2 son adyacentes, false en caso de lo contrario, o si alguno de los 2 vertices no existen.
     */
    public boolean adyacente(String Usuario1, String Usuario2){
        int vU1,vU2;
        vU1 = this.numVertice(Usuario1);
        vU2 = this.numVertice(Usuario2);
        if(vU1<0 || vU2<0){
           
            return false;
        }else if(TabAdy[vU1].getList_ady().Contains(vU2)){
            return true;
        }else{
            return false;
        }
        
        
    }
   /**
     * Elimina un VerticeUsuario de la tabla de adyacencias
     * @param Usuario , nombre del VerticeUsuario a ser eliminado

     */
    public void DeleteUsuario(String Usuario){
        int indexU_Todelete = numVertice(Usuario);
        
        if (indexU_Todelete == -1){
            JOptionPane.showMessageDialog(null, "El Usuario que ingresó No existe !");
        }else{
            for (int i = 0; i < numVerts; i++) {
                if( i != indexU_Todelete){
                    TabAdy[i].getList_ady().DeleteArconro(indexU_Todelete);
                }
            }
            VerticeUsuario newTab [] = new VerticeUsuario[MaxVerts-1];
            for (int i = 0; i < indexU_Todelete; i++) {
                newTab[i] = TabAdy[i];
                newTab[i].setNumVertice(i);
        }for (int i = indexU_Todelete; i < numVerts-1; i++) {
                newTab[i] = TabAdy[i + 1];
                newTab[i].setNumVertice(i);
        }
            TabAdy= newTab;
            numVerts -=1;
            JOptionPane.showMessageDialog(null, "USUARIO ELIMINADO");
        }
    }
 /**
     * Carga y actualiza el archivo txt, para guardar los datos del programa al cerrarlo
     * @param grafo, Objeto grafoLista a ser guardado
     */   
      public void Writetxt(GrafoLista grafo){
        String Usuarios = "usuarios";
        String Relaciones = "\nrelaciones\n"; //este string es el que se guardara en el txt
        if (!grafo.isEmpty()){ 
            
            for (int i = 0; i < grafo.getNumVerts(); i++) {  
                Usuarios += "\n"+grafo.TabAdy[i].getUsuario(); // guarda en txt separando por comas o slas
            }
            
            for (int i = 0; i < grafo.getNumVerts(); i++) {
                
                Arco aux = grafo.getTabAdy()[i].getList_ady().getFirst();
                for (int j = 0; j < grafo.TabAdy[i].getList_ady().getSize(); j++) {
                    
                    VerticeUsuario V = grafo.TabAdy[aux.getDestino()];
                    Relaciones += grafo.TabAdy[i].getUsuario()+", "+V.getUsuario()+"\n";
                    aux = aux.getNext();
                }
            }
            
        }
        try { 
            PrintWriter pw = new PrintWriter("test\\DATA.txt"); //asi es para escribir en el txt en windows
            pw.print(Usuarios+Relaciones);
            pw.close(); // cerrar txt
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    /**
     * Lee los datos del archivo txt y crea el grafo.
     */
       public static GrafoLista Readtxt(){
       
        String line;
        String Path = "test\\DATA.txt";
        boolean isRelaciones = false;
        int counterU = 0;
        int counterA= 0;
        String Usuarios= "";
        String Relaciones = "";
        File file = new File(Path);
        
        try{
            if (!file.exists()){
                file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null){
                    if (!line.isEmpty()){
                        if (line.equals("usuarios")){
                            isRelaciones = false;
                            continue;
                        }else if (line.equals("relaciones")){
                            isRelaciones = true;
                            continue;
                        }
                        if (isRelaciones){
                            Relaciones += line +"\n";
                            counterA +=1;
                        }else{
                            Usuarios += line + "\n";
                            counterU+=1;
                        }
                    }}
           
                
            br.close();
            
            
            }   
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        ///Creación del Grafo a partir de lo que se cargo del txt 
        GrafoLista grafo = new GrafoLista(counterU);
        if (!"".equals(Usuarios)){
            String [] Usuario= Usuarios.split("\n");
            for (int i = 0; i < counterU; i++) {
                grafo.NewUsuario(Usuario[i]);
            }
        }
        if(!"".equals(Relaciones)){
            String [] Relacion = Relaciones.split("\n");
            for (int i = 0; i < counterA; i++) {
                String A_B [] = Relacion[i].split(", ");
                grafo.nuevoArco(A_B[0], A_B[1]);
            }
            
        }
        return grafo; 
    }
/**
     * Realiza una busqueda profunda DFS en el grafo
     * @param v, el nro de vertice inicial
     * @param visited, arreglo booleanos de vertices visitados
     * @param stack, pila para almacenar el orden de los vertices visitados
     */
    public void DFS(int v, boolean visited[], Stack stack) {
        visited[v] = true;
        ListaArcos listaAdy = TabAdy[v].getList_ady();
        Arco aux = listaAdy.getFirst();
        while (aux != null) {
            int Arc_n = aux.getDestino();
            if (!visited[Arc_n]){
                DFS(Arc_n, visited, stack);
            }
            aux = aux.getNext();
        }
        stack.Push(v);
    }
/**
     * Obtiene el grafo transpuesto con respecto al original
     * @return  el grafo transpuesto
     */
    public GrafoLista getTranspose() {
        GrafoLista graphT = new GrafoLista(MaxVerts);
        for (int v = 0; v < numVerts; v++) {
            // Inicializa el vértice en graphT
            graphT.TabAdy[v] = new VerticeUsuario(TabAdy[v].getUsuario());
            
            ListaArcos listaAdy = TabAdy[v].getList_ady();
            Arco aux = listaAdy.getFirst();
            while (aux != null) {
                // Inicializa el vértice destino en graphT si aún no ha sido inicializado
                if (graphT.TabAdy[aux.getDestino()] == null) {
                    graphT.TabAdy[aux.getDestino()] = new VerticeUsuario(TabAdy[aux.getDestino()].getUsuario());
                }
                graphT.TabAdy[aux.getDestino()].getList_ady().InsertarFinal(v);
                aux = aux.getNext();
            }
        }
        return graphT;
    }
/**
     * Obtiene los componentes fuertemente conectados del grafo.
     * @return Lista de nros de vértices que forman los componentes fuertemente conectados.
     */
    public ListaS StrongConnected() {
        Stack stack = new Stack();

        boolean visited[] = new boolean[numVerts];
        for (int i = 0; i < numVerts; i++)
            visited[i] = false;

        for (int i = 0; i < numVerts; i++)
            if (!visited[i])
                DFS(i, visited, stack);

        GrafoLista gr = getTranspose();

        for (int i = 0; i < numVerts; i++)
            visited[i] = false;

        ListaS strongConnectedVertices = new ListaS();
    while (!stack.IsEmpty()) {
        int v = (Integer)stack.Pop().getData();

        if (!visited[v]) {
            Stack componentStack = new Stack();
            gr.DFS(v, visited, componentStack);

            while (!componentStack.IsEmpty()) {

                // inserta solo el número del vértice.
                strongConnectedVertices.InsertarFinal((Integer)componentStack.Pop().getData());
            }
        }
    }

    return strongConnectedVertices;
}

/**
     * Obtiene los componentes que no están fuertemente conectados en el grafo.
     * @param StrongConnectedVertices Lista de vértices que forman los componentes fuertemente conectados.
     * @return Lista de vértices que no están fuertemente conectados.
     */
public ListaS NotStrongConnectedComponents(ListaS StrongConnectedVertices) {
    ListaS strongConnectedVertices = StrongConnected();
    Nodo current = strongConnectedVertices.getFirst();
    ListaS Lreturn = new ListaS();
    while (current != null) {
        int v = (Integer)current.getData();
        // Verifica si el vértice es un componente fuertemente conectado por sí mismo
        if (TabAdy[v].getList_ady().isEmpty() && getTranspose().TabAdy[v].getList_ady().isEmpty()) {
            
            Lreturn.InsertarFinal(v);
        } else if (TabAdy[v].getList_ady().getFirst() != null && TabAdy[v].getList_ady().getFirst().getDestino() == v && getTranspose().TabAdy[v].getList_ady().getFirst() != null && getTranspose().TabAdy[v].getList_ady().getFirst().getDestino() == v) {
            
            
        }
        current = current.getNext();
    }
    return Lreturn;
}

  /**
     * A partir de la librería graphstream,crea el grafico del grafo y lo muestra en pantalla
     * @Author Samantha Rojas , Alexandra Padrón
     */  
    public void ShowGraph() {
    ListaS Fconnected = StrongConnected();
    ListaS Not_connected = NotStrongConnectedComponents(Fconnected);
    
    Graph graph = new SingleGraph("Graph");
    graph.setAttribute("ui.stylesheet", "node { size: 40px; fill-color: orange; }");
        for (int i = 0; i < numVerts; i++) {
            Node nodoi = graph.addNode(Integer.toString(i));
            
         if(Not_connected.Contains(i)){
                    nodoi.setAttribute("ui.style", "fill-color: gray;" );
                }
            // referencia de los nodos son su nro de vertice
          nodoi.setAttribute("ui.label", TabAdy[i].getUsuario());
        }
        for (int i = 0; i < numVerts; i++) {
            Arco aux = TabAdy[i].getList_ady().getFirst();
            for (int j = 0; j < TabAdy[i].getList_ady().getSize(); j++) {
                String arcofrom = Integer.toString(i);
                String arco_to = Integer.toString(aux.getDestino());
                String id = arcofrom+arco_to;
               
                if (graph.getEdge(id) == null) {
                Edge edgeAB = graph.addEdge(id, arcofrom, arco_to);
                }

               
                aux = aux.getNext();}
               
            
          
        }
 
       
        System.setProperty("org.graphstream.ui", "swing"); 
        
        Viewer viewer = graph.display();
        Layout layout  = new SpringBox();
         layout.setForce(10);
        viewer.enableAutoLayout(layout);
        Writetxt(this);
       

        

       
      
       
        
    }
    /**
     * Obtiene el número de vértices en el grafo.
     * @return El número de vértices en el grafo.
     */
    public int getNumVerts() {
        return numVerts;
    }
/**
     * Establece el número de vértices en el grafo.
     * @param numVerts El número de vértices a establecer.
     */
    public void setNumVerts(int numVerts) {
        this.numVerts = numVerts;
    }
/**
     * Obtiene el número máximo de vértices que puede tener el grafo.
     * @return El número máximo de vértices que puede tener el grafo.
     */
    public int getMaxVerts() {
        return MaxVerts;
    }
/**
     * Establece el número máximo de vértices que puede tener el grafo.
     * @param MaxVerts El número máximo de vértices a establecer.
     */
    public void setMaxVerts(int MaxVerts) {
        this.MaxVerts = MaxVerts;
    }
/**
     * Obtiene la tabla de adyacencia del grafo.
     * @return La tabla de adyacencia del grafo.
     */
    public VerticeUsuario[] getTabAdy() {
        return TabAdy;
    }
/**
     * Establece la tabla de adyacencia del grafo.
     * @param TabAdy La tabla de adyacencia a establecer.
     */
    public void setTabAdy(VerticeUsuario[] TabAdy) {
        this.TabAdy = TabAdy;
    }
    
    
    
    

}

