/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fvs.testes;

import br.com.luciano.introjenkins.Pessoa;
import static junit.framework.Assert.*;
import org.junit.Before;
import org.junit.Test;



/**
 *
 * @author Luciano
 */
public class PessoaTest {
   
    Pessoa p;
    
    @Before
    public void init(){
        p = new Pessoa();
    }
    
    @Test
    public void deveriaValidarNomePessoa(){
        p.setNome("José");
        assertTrue(p.getNome().length() > 1);
    }
    
    @Test
    public void cpfDeveriaConterOnzeDigitos(){
        p.setCpf("52369854123");
        assertEquals(11, p.getCpf().length());
    }
    
    
}
