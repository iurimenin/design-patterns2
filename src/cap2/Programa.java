package cap2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Iuri Menin on 22/09/17.
 */
public class Programa {

    public static void main(String[] args) {

        NotasMusicais notas = new NotasMusicais();

        List<Nota> musica = Arrays.asList(
                notas.pega("do"),
                notas.pega("re"),
                notas.pega("mi"),
                notas.pega("fa"),
                notas.pega("fa"),
                notas.pega("fa"));

        Piano piano = new Piano();
        piano.toca(musica);

    }
}
