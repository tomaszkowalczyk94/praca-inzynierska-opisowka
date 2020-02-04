public class MemoryController implements Initializable {

    @Inject private ValueFormatter valueFormatter;
    @Inject private DialogHelper dialogHelper;
    @Inject private Z80 z80;

    @FXML public TableView<MemoryRowModel> memoryTable;
    @FXML public TableColumn<MemoryRowModel, String> memoryColumnAddress;
    ...   
}