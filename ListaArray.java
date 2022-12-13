public class ListaArray implements EstruturaDeDados{

    private int[] elements;
    private int contador;

    public ListaArray(){
        elements = new int[1000];
        contador = 0;
    }

    public int getElemento(int valor){
        return elements[valor];
    }

    @Override
    public boolean insert(int chave){
        
        if(contador == 1000){
            return false;
        }
        this.elements[contador]=chave;
        contador++;
        return true;
    }

    @Override
    public boolean delete(int chave) {
        for ( int i = 0; i < elements.length; i++)
         {
            if(elements[i] == chave){
                elements[i] = 0;
                for (int j = i; j < elements.length; j++) {
                    int x = elements[i];
                    elements[i] = elements[i+1];
                    elements[i+1] = x;
                }
                return true;
            } 
        }
        return false;
    }

    @Override
    public boolean search(int chave) {
        for(int i = 0; i <elements.length; i++){
            if(elements[i] == chave){
                return true;
            }
        }
        return false;
    }

    @Override
    public int minimum() {
        int x = 0;
        for (int i = 0; i < contador; i++){
            if( elements[i]< elements[i+1]){
                x=elements[i];
            }      
        }
        return x;      
    }

    @Override
    public int maximum() {
        int x = 0;
        for(int i = 0; i < contador; i++){
            if(elements[i] > elements[i+1]){
                x = elements[i];
            }
        }
        return x;
    }

    @Override
    public int sucessor(int chave) {
        for(int i = 0; i < contador; i++){
            if(elements[i] == chave){
                return elements[i+1];
            }
        }
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int prodessor(int chave) {
        for(int i = 0; i < contador; i++){
            if(elements[i] == chave){
                return elements[i-1];
            }
        }
        // TODO Auto-generated method stub
        return 0;
    }

    public static void main(String[] args) {
        ListaArray r = new ListaArray();
        r.insert(35);
        r.insert(45);
        r.insert(3);
        r.insert(4);
        r.insert(25);
        System.out.println(r.search(2));
        System.out.println(r.delete(2));
        System.out.println(r.search(2));
        System.out.println(r.getElemento(1));
        System.out.println(r.maximum());
        System.out.println(r.minimum());
        System.out.println(r.prodessor(3));
        System.out.println(r.sucessor(3));
        


        
        
    }
}
