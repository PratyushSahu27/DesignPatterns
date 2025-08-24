import models.ICaretaker;
import models.IMemento;

import java.util.ArrayList;
import java.util.List;

public class ConfigCaretaker implements ICaretaker {
    List<IMemento> history;

    public ConfigCaretaker() {
        history = new ArrayList<>();
    }

    @Override
    public void addMemento(IMemento memento) {
        history.add(memento);
    }

    @Override
    public IMemento undo() {
        return history.removeLast();
    }
}
