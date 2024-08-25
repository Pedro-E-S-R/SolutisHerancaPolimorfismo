import br.com.solutis.exercicio.questao1.Animal;
import br.com.solutis.exercicio.questao1.Cachorro;
import br.com.solutis.exercicio.questao1.Preguica;

public class Main {
    public static void main(String[] args) {

        Animal a = new Preguica("José",5);
        Animal c = new Cachorro("Toto",12);
        a.emitirSom();
        c.emitirSom();
        ((Cachorro) c).correr();
    }
}