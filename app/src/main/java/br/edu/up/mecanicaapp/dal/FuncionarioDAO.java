package br.edu.up.mecanicaapp.dal;

import android.content.Context;

import java.util.ArrayList;

import br.edu.up.mecanicaapp.model.Funcionario;

public class FuncionarioDAO {

    public static boolean Cadastrar(Funcionario funcionario, Context context) {
        try {
            Banco b = new Banco(context);
            b.cadastrarFuncionario(funcionario);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Funcionario Buscar(String cpf, Context context) {
        try {
            Banco b = new Banco(context);
            return b.buscarFuncionario(cpf);
        } catch (Exception e) {
            return null;
        }
    }

    public static ArrayList<Funcionario> Listar(Context context) {
        try {
            Banco b = new Banco(context);
            return b.retornarFuncionarios();
        } catch (Exception e) {
            return null;
        }
    }

    public static boolean AlterarFuncionario(Funcionario funcionario) {
        return true;
    }

    public static boolean ExcluirFuncionario(Funcionario funcionario) {
        return true;
    }

}
