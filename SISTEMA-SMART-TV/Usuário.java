public class Usuário {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.volume);
        System.out.println("Volume Atual : " + smartTv.volume);

       
        
        smartTv.ligar();
        System.out.println("Novo Status ->TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status ->TV Ligada ? " + smartTv.ligada);
    }
}
