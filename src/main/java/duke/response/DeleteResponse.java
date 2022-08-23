package duke.response;

import duke.DukeException;
import duke.DukeList;

public class DeleteResponse extends DukeResponse {
    protected DukeList list;
    protected String data;

    public DeleteResponse(DukeList list, String data) {
        this.list = list;
        this.data = data;
    }

    @Override
    public void run () throws DukeException {
        if (data.isEmpty()) {
            throw new DukeException("Please enter duke.task to delete.");
        }

        int index = Integer.parseInt(data.trim());
        super.message(list.delete(index));
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
