import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Principal {
    public static void main (String[] args) {
        ArrayList<String> product = new ArrayList<String>();

        Cadastrar.inserir(product, "Vassoura");
        Cadastrar.inserir(product, "Rodo");
        Cadastrar.inserir(product, "Pa");
        Cadastrar.atualizar(product, "Teste", 0);
        Cadastrar.remover(product, 2);

        criaArquivo();
        System.out.println(product);
    }

    static void criaArquivo() {
        try {
            File meuArquivo = new File("teste.txt");

            meuArquivo.createNewFile();
        } catch (Exception e) {
            System.out.println("Algo errado");
        }
    }
}

class Cadastrar {
    static void inserir( ArrayList<String> products, String productName ) {
        products.add(productName);
    }

    static void atualizar( ArrayList<String> products, String productName, int index ) {
        products.set(index, productName);
    }

    static void remover( ArrayList<String> products, int index ) {
        products.remove(index);
    }
} 

class Salvar {
    static void salvar() {};

    static void recuperar() {};
}


class CalcularPreco {}
