import javax.swing.*;

public class calcAnexoI {

    public static void main(String[] args) {

        String m01, m02, m03, m04, m05, m06, m07, m08, m09, m10, m11, m12;
        float mes01, mes02, mes03, mes04, mes05, mes06, mes07, mes08, mes09, mes10, mes11, mes12; //variaveis para receber o faturamento das competêncais


        String fatmes; //faturamento no mês corrente
        float recmes;

        float aliq, aliqEfetiva, RBT12, imposto, PD;
        /*
        aliq é a aliquot a ser aplicada no cálculo do imposto.
        aliqEfetiva é a aliquta a ser aplica no faturamento do mês para definir qual o valor correto de imposto.
        RBT12 essa é a soma do 12 ultimos faturamento para saber qual faixa de aliquota e parcela dedutivel vai ser aplocada.
        PD é a parcela dedutive que vai ser aplicada no calculo do imposto
         */


        m01 = JOptionPane.showInputDialog("Digite faturamento mes 1:");
        mes01 = Float.parseFloat(m01);
        m02 = JOptionPane.showInputDialog("Digite faturamento mes 2:");
        mes02 = Float.parseFloat(m02);
        m03 = JOptionPane.showInputDialog("Digite faturamento mes 3:");
        mes03 = Float.parseFloat(m03);
        m04 = JOptionPane.showInputDialog("Digite faturamento mes 4:");
        mes04 = Float.parseFloat(m04);
        m05 = JOptionPane.showInputDialog("Digite faturamento mes 5:");
        mes05 = Float.parseFloat(m05);
        m06 = JOptionPane.showInputDialog("Digite faturamento mes 6:");
        mes06 = Float.parseFloat(m06);
        m07 = JOptionPane.showInputDialog("Digite faturamento mes 7:");
        mes07 = Float.parseFloat(m07);
        m08 = JOptionPane.showInputDialog("Digite faturamento mes 8:");
        mes08 = Float.parseFloat(m08);
        m09 = JOptionPane.showInputDialog("Digite faturamento mes 9:");
        mes09 = Float.parseFloat(m09);
        m10 = JOptionPane.showInputDialog("Digite faturamento mes 10:");
        mes10 = Float.parseFloat(m10);
        m11 = JOptionPane.showInputDialog("Digite faturamento mes 11:");
        mes11 = Float.parseFloat(m11);
        m12 = JOptionPane.showInputDialog("Digite faturamento mes 12:");
        mes12 = Float.parseFloat(m12);
        fatmes = JOptionPane.showInputDialog("Digite faturamento do mês corrente:");
        recmes = Float.parseFloat(fatmes); //nessa variável recebe qual o valor foi faturado pela empresa naquele mês é em cima desse valor que vai se aplicar a aliquota efeitiva

        RBT12 = mes01 + mes02 + mes03 + mes04 + mes05 + mes06 + mes07 + mes08 + mes09 + mes10 + mes11 + mes12;

        aliq = 0;

        if (RBT12 <= 180000) {
            aliq = (float) 0.04; //faixa 1 do anexo I do Simples Nacional
        } else if (RBT12 <= 360000) {
            aliq = (float)0.073; //faixa 2 do anexo I do Simples Nacional
        } else if (RBT12 <= 720000) {
            aliq = (float) 0.095;//faixa 3 do anexo I do Simples Nacional
        } else if (RBT12 <= 1800000) {
            aliq = (float) 0.103;//faixa 4 do anexo I do Simples Nacional
        } else if (RBT12 <= 3600000) {
            aliq = (float) 0.14;//faixa 5 do anexo I do Simples Nacional
        } else if (RBT12 <= 4800000) {
            aliq = (float) 0.19;//faixa 6 do anexo I do Simples Nacional
        } else if (RBT12 >= 4800000) {//se a empresa faturar acima desse valor ela não faz mais parte do simples nacional
            JOptionPane.showInputDialog(null, aliq);
        }

        PD = 0;

        if (RBT12 <= 180000) {
            PD = 0; //faixa 1 do anexo I do Simples Nacional
        } else if (RBT12 <= 360000) {
            PD = 5940;//faixa 2 do anexo I do Simples Nacional
        } else if (RBT12 <= 720000) {
            PD = 13860;//faixa 3 do anexo I do Simples Nacional
        } else if (RBT12 <= 1800000) {
            PD = 22500;//faixa 4 do anexo I do Simples Nacional
        } else if (RBT12 <= 3600000) {
            PD = 87300;//faixa 5 do anexo I do Simples Nacional
        } else if (RBT12 <= 4800000) {
            PD = 378000;}//faixa 6 do anexo I do Simples Nacional

        aliqEfetiva  = (((RBT12 * aliq) - PD) / RBT12); // formula para o calculo da aliquota efeitva do imposto

        imposto = recmes * aliqEfetiva; //calculo do valor devido de imposto para o faturamento.

        JOptionPane.showInputDialog(null, "o valor devido de imposto é: " + imposto);
        JOptionPane.showInputDialog(null, "aliquota efetiva do imposto é: "+ aliqEfetiva*100);




    }
}




