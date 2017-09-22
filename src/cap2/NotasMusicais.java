package cap2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Iuri Menin on 22/09/17.
 */
public class NotasMusicais {

    private static Map<String, Nota> notas = new HashMap<>();
    private static List<Class<? extends Nota>> clazzes;

    static {
        clazzes = Arrays.asList(
                Do.class, Re.class, Mi.class, Fa.class,
                Sol.class, La.class, Si.class, DoSustenido.class,
                ReSustenido.class);
    }

    public Nota pega(String nome) {
        try {
            if(!notas.containsKey(nome)) {
                for(Class<? extends Nota> clazz : clazzes) {
                    if(clazz.getSimpleName().toLowerCase().equals(nome)) {
                        notas.put(nome, clazz.newInstance());
                        break;
                    }
                }
            }

            return notas.get(nome);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
