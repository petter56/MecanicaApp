package br.edu.up.mecanicaapp.dal;

import android.content.Context;

import java.util.ArrayList;

import br.edu.up.mecanicaapp.model.Servico;

public class ServicoDAO {

    public static boolean Cadastrar(Servico servico, Context context) {
        try {
            Banco b = new Banco(context);
            b.novoServico(servico);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Servico Buscar(int id, Context context) {
        try {
            Banco b = new Banco(context);
            return b.buscarServico(id);
        } catch (Exception e) {
            return null;
        }
    }

    public static ArrayList<Servico> Listar(Context context) {
        try {
            Banco b = new Banco(context);
            return b.retornarServico();
        } catch (Exception e) {
            return null;
        }
    }

    public static boolean AlterarServico(Servico servico) {
        return true;
    }

    public static boolean ExcluirServico(Servico servico) {
        return true;
    }
}
