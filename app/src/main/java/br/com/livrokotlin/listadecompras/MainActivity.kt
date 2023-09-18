package br.com.livrokotlin.listadecompras

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import br.com.livrokotlin.listadecompras.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Implementação do adaptador
        val produtosAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)
        binding.listViewProdutos.adapter = produtosAdapter

        // Definição do ouvinte no botão
        binding.btnInserir.setOnClickListener {
            // Pegando o valor digitado pelo usuário
            val produto = binding.txtProduto.text.toString()

            // Enviando o item para a lista
            produtosAdapter.add(produto)

            // Limpar o campo de texto após a inserção
            binding.txtProduto.text.clear()
        }
    }
}