package prog2java.Bimestre_1.robo;

public class Roboteste {
      public static void main(String[] args) {
          Ponto posicaoInicial = new Ponto();
          
          Robo robo = new Robo("Wall-E", posicaoInicial);
          robo.exibirPosicao();
          for(int i = 0; i < 10; i++){
              robo.moverDireita();
          }
          robo.exibirPosicao();
          robo.moverEsquerda();
          robo.exibirPosicao();
          robo.andarBaixo();
          robo.exibirPosicao();
          robo.andarBaixo();
          robo.exibirPosicao();
          robo.teleportar();
          robo.exibirPosicao();
      }
}
