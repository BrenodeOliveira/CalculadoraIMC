package com.breno.calculadoraimc

import org.junit.Assert
import org.junit.Test

class UtilTest {

    //Testes que estão sendo feito na parte de testes unitários

    @Test
    fun testGetImcResult_90_180_sobrepeso() {
        val result = getImcResult("90", "1.80")
        Assert.assertEquals(result.result, Result.SOBREPESO)
    }

    @Test
    fun testGetImcResult_embranco_aviso() {
        val semPeso = emptyStringResult()
        Assert.assertEquals(semPeso.result, Result.BLANK)

        val semAltura = emptyStringResult()
        Assert.assertEquals(semAltura.result, Result.BLANK)
    }
}