package com.breno.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.breno.calculadoraimc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupClick()
    }

    private fun setupClick() {
        //Click do botao
        binding.btnMakeCalc.setOnClickListener {
            val pesoTxt = binding.edtPeso.text.toString()
            val alturaTxt = binding.edtAltura.text.toString()

            //Verificação dos campos de string se estão vazios
            if (pesoTxt.isEmpty() && alturaTxt.isEmpty()) {
                binding.txtResultImc.text = emptyStringResult().result.label
            }
            else {
                val imcResult = getImcResult(pesoTxt, alturaTxt)
                binding.txtResultImc.text = imcResult.result.label
            }
        }
    }
}