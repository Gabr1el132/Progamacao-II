package prog2java.Bimestre_1.Trabalho1.maquina_de_coxinha;

public class MaquinaCoxinha {
    private int quantidadeCoxinha;
    
    public MaquinaCoxinha(){
        quantidadeCoxinha = 0;
    }
    
    public void setCoxinha(int quantidadeCoxinha){
        this.quantidadeCoxinha =  quantidadeCoxinha;
    }
    
    public int getCoxinha(){
        return quantidadeCoxinha;
    }
    
    public void abastecerMaquina(int quantidadeCoxinha){
        if(quantidadeCoxinha < 0){
            System.out.println("Nao é possível abastecer a maquina com números negativos.");
        }
        else{
            this.quantidadeCoxinha += quantidadeCoxinha;
            System.out.println("Maquina abastecida com "+ quantidadeCoxinha + " coxinhas!\nTotal de coxinhas: " + this.quantidadeCoxinha);
        }
    }
    
    public void venderCoxinha(){
        if(quantidadeCoxinha < 0){
            System.out.println("Sem coxinhas na maquina para vender!");
        }
        else{
            quantidadeCoxinha--;
            System.out.println("Coxinha vendida!\nQuantidade de coxinhas restante: " + quantidadeCoxinha);
        }
    }
    
    public void venderCoxinha(int quantidade){
        if(quantidade > quantidadeCoxinha){
            System.out.println("Pedido com mais coxinhas do que ha disponivel na maquina!");
        }
        else{
            quantidadeCoxinha -= quantidade;
            if(quantidade == 1){
                System.out.println("Coxinha vendida!\nQuantidade de coxinhas restante: " + quantidadeCoxinha);
            }
            else{
                System.out.println(quantidade + " Coxinhas vendidas!\nQuantidade de coxinhas restante: " + quantidadeCoxinha);
            }
        }
    }
    
    public void esvaziarMaquina(){
        quantidadeCoxinha = 0;
        System.out.println("Maquina esvaziada.");
    }
}
