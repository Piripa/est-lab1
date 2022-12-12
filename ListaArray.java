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
                for(int j=i; j < elements.length;j++){
                    int x = elements[j];
                    if (elements[i] < x){
                        elements[i]=elements[j-1];
                        elements[j]= elements[j+1];
                    }    
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
        r.insert(2);
        r.insert(3);
        r.insert(4);
        System.out.println(r.getElemento(3));
        System.out.println(r.search(2));
        System.out.println(r.delete(2));
        System.out.println(r.search(2));



        
        
    }
}
