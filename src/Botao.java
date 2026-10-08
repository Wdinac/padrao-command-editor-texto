public class Botao {
    private Command command;
    
    public Botao(Command command) {
        this.command = command;
    }
    
    public void clicar() {
        command.execute();
    }
}
