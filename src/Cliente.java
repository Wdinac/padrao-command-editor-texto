public class Cliente {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        
        // Botões
        Botao btnCopiar = new Botao(new CopiarCommand(editor));
        Botao btnColar = new Botao(new ColarCommand(editor));
        
        // Simulando interações
        System.out.println("Usando os botoes: ");
        btnColar.clicar(); // Botão dispara colar
        btnCopiar.clicar(); // Botão dispara copiar
        
        // Menu
        MenuItem copiarMenu = new MenuItem("Copiar", new CopiarCommand(editor));
        MenuItem colarMenu = new MenuItem("Colar", new ColarCommand(editor));
        
        System.out.println("\nUsando os menus: ");
        copiarMenu.selecionar(); // Menu dispara copiar
        colarMenu.selecionar(); // Menu dispara colar
    }
}
