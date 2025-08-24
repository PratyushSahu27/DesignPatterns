package models;

public interface ICaretaker {
    public void addMemento(IMemento memento);

    public IMemento undo();
}
