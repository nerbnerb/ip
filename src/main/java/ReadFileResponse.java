public class ReadFileResponse extends DukeResponse {
    @Override
    public void run() throws DukeException {
        super.message("Loading...");
    }

    @Override
    public boolean isExit() {
        return false;
    }
}