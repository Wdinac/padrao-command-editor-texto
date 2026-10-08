public class CopiarCommand implements Command {
    private EditorTexto editor;
    
    public CopiarCommand(EditorTexto editor) {
        this.editor = editor;
    }
    
    @Override
    public void execute() {
        editor.copiar();
    }
}
