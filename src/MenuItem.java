public class MenuItem {
    private Command command;
    private String label;
    
    public MenuItem(String label, Command command) {
        this.label = label;
        this.command = command;
    }
    
    public void selecionar() {
        System.out.println("Executando opcao de menu: " + label);
        command.execute();
    }
}
