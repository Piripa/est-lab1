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
        for(int i = 0; i < contador; i++){
            if(this.elements[i] == chave){
                this.elements[i] = 0;
                for(int j =0; j<elements.length;j++){
                    int x = elements[i];
                    
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean search(int chave) {
        for(int i = 0; i < contador; i++){
            if(elements[i] == chave){
                return true;
            }
        }
        return false;
    }

    @Override
    public int minimum() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int maximum() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int sucessor(int chave) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int prodessor(int chave) {
        // TODO Auto-generated method stub
        return 0;
    }

    public static void main(String[] args) {
        ListaArray r = new ListaArray();
        r.insert(1);
        System.out.println(r.getElemento(0));
        r.search(1);
        
        
        
    }
}
