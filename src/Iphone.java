import configIphone.AparelhoTelefonico;
import configIphone.NavegadorInternet;
import configIphone.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical  rpd = new ReprodutorMusical();
        NavegadorInternet  nvi = new NavegadorInternet();
        AparelhoTelefonico  apt = new AparelhoTelefonico();

        rpd.selecionarMusica();  
        rpd.tocar();
        rpd.pausar();

        nvi.exibirPagina();
        nvi.adicionarNovaAba();
        nvi.atualizarPagina();

        apt.ligar();
        apt.atender();
        apt.iniciaCorreioVoz();
    }
    
}
