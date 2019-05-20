package br.edu.up.mecanicaapp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import br.edu.up.mecanicaapp.R;
import br.edu.up.mecanicaapp.dal.ClienteDAO;
import br.edu.up.mecanicaapp.model.Cliente;

public class DetalhesClienteActivity extends AppCompatActivity {

    private TextView txtNome, txtCpf, txtEmail;
    private Button btnAlterar, btnExcluir;
    private Cliente cliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_cliente);

        txtNome = findViewById(R.id.txtNome);
        txtCpf = findViewById(R.id.txtCpf);
        txtEmail = findViewById(R.id.txtEmail);
        btnAlterar = findViewById(R.id.btnAlterar);
        btnExcluir = findViewById(R.id.btnExcluir);

        cliente = ClienteDAO.Buscar(getIntent().getStringExtra("cpf"), this);

        txtNome.setText("Nome: " + cliente.getNome());
        txtCpf.setText("CPF: " + cliente.getCpf());
        txtEmail.setText("Email: " + cliente.getEmail());
    }

    public void btnAlterarClick(View view){

    }

    public void btnExcluirClick(View view){

    }

}
