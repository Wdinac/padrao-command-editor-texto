public class ColarCommand implements Command {
    private EditorTexto editor;
    
    public ColarCommand(EditorTexto editor) {
        this.editor = editor;
    }
    
    @Override
    public void execute() {
        editor.colar();
    }
}
