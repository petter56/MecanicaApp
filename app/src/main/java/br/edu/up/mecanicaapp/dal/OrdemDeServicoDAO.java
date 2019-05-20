package br.edu.up.mecanicaapp.dal;

import android.content.Context;

import java.util.ArrayList;

import br.edu.up.mecanicaapp.model.OrdemDeServico;

public class OrdemDeServicoDAO {

    public static boolean Cadastrar(OrdemDeServico ordemDeServico, Context context) {
        try {
            Banco b = new Banco(context);
            b.novaOrdemDeServico(ordemDeServico);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static OrdemDeServico Buscar(int id, Context context) {
        try {
            Banco b = new Banco(context);
            return b.buscarOrdemDeServico(id);
        } catch (Exception e) {
            return null;
        }
    }

    public static ArrayList<OrdemDeServico> Listar(Context context) {
        try {
            Banco b = new Banco(context);
            return b.retornarOrdensDeServico();
        } catch (Exception e) {
            return null;
        }
    }

    public static boolean AlterarOrdem(OrdemDeServico ordemDeServico) {
        return true;
    }

    public static boolean ExcluirOrdem(OrdemDeServico ordemDeServico) {
        return true;
    }

}
