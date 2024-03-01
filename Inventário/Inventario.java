public class Inventario {
  Item[] deposito = new Item[100];

    public static void main(String[] args) {
    }

    public void adicionarItem(Item item) {
        for (int i = 0; i < this.deposito.length; i++) {
            if (deposito[i] == null) {
                deposito[i] = item;
                break;
            }
        }
    }

    public void deleteItem(Item item) {
        //delete e reorganiza o array
    }

    public void checarNivel() {
        int i;
        for (i = 0;i < this.deposito.length; i++){
            if (deposito[i] == null) {
            break;
          }
        }
        
        System.out.println("There are currently " + (i + 1) + " in the inventory");
        System.out.println((this.deposito.length - i ) + " storage space left");
    }
}