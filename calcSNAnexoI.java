public class calcSNAnexoI {

    public static void calculoReceitaBrutaTotal(String[] args) {

        float mes01;
        float mes02;
        float mes03;
        float mes04;
        float mes05;
        float mes06;
        float mes07;
        float mes08;
        float mes09;
        float mes10;
        float mes11;
        float mes12;
        float fatmes; //faturamento no mês corrente
        float RBT12; //receita bruta ultimos 12 meses
        float ALIQ; //aliquota aplicavel
        int PD; //parcela dedutivel
        float DAS; //valor devido guia de DAS

        System.out.print("dos mês 01 a 12 deverá ser o faturamento dos 12 ultimos meses anteriores ao mês para a simulaçao do calculo")

        mes01 = System.out.print("Digite faturamento mes 1:");
        mes02 = System.out.print("Digite faturamento mes 2:");
        mes03 = System.out.print("Digite faturamento mes 3:");
        mes04 = System.out.print("Digite faturamento mes 4:");
        mes05 = System.out.print("Digite faturamento mes 5:");
        mes06 = System.out.print("Digite faturamento mes 6:");
        mes07 = System.out.print("Digite faturamento mes 7:");
        mes08 = System.out.print("Digite faturamento mes 8:");
        mes09 = System.out.print("Digite faturamento mes 9:");
        mes10 = System.out.print("Digite faturamento mes 10:");
        mes11 = System.out.print("Digite faturamento mes 11:");
        mes12 = System.out.print("Digite faturamento mes 12:");
        fatmes = System.out.print("Digite faturamento do mês corrente:");

        RBT12 = + mes01 + mes02 + mes03 + mes04 + mes05 + mes06 + mes07 + mes08 + mes09 + mes10 + mes11 + mes12;

        if (RBT12 <= 18000) {
            aliq = 0.04;
        } else if (RBT <= 360000) {
            aliq = 0.073;
        } else if (RBT12 <= 720000) {
            aliq = 0.095;
        } else if (RBT12 <= 1800000) {
            aliq = 0.107;
        } else if (RBT12 <= 3600000) {
            aliq = 0.143;
        } else if (RBT12 <= 4800000) {
            aliq = 0.19;
        }else if (RBT12 > 4800000) {
            System.out.print("empresa não pertence ao SN");
        }

        System.out.print(null, aliq);

    }

    }

    }

    }

    }
}
