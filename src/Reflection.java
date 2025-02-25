import java.lang.annotation.*;

public class Reflection {
    public static void main(String[] args) {
        try {
            Class<?> clazz = TabelaAnotacao.class;
            if (clazz.isAnnotationPresent(Tabela.class)) {
                Tabela tabelaAnotacao = clazz.getAnnotation(Tabela.class);
                System.out.println("Nome da Tabela: " + tabelaAnotacao.nomeDaTabela());
            } else {
                System.out.println("Anotação Tabela não encontrada na classe.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
