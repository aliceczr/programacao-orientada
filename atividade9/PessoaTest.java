package teste.poo;

import org.junit.Test;
import static org.junit.Assert.*;

public class PessoaTest {

    @Test
    public void tentefalarTchau() {
        Pessoa pessoa = new Pessoa();
        assertEquals("Tchau mundo", pessoa.falarTchau());
    }
}