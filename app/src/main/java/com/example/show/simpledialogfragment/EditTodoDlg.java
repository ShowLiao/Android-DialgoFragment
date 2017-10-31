package com.example.show.simpledialogfragment;

/**
 * Created by show on 8/8/17.
 */

public class EditTodoDlg {

    public interface EditTodoListener {
        public void onObjReady(String str);
        public void onDataLoaded(Item item);
    }

    private EditTodoListener listener;

    public EditTodoDlg() {
        this.listener = null;
    }

    public void setEditTodoListener(EditTodoListener listener) {
        this.listener = listener;
    }

    public void getInfo() {
        Item item = new Item();
        listener.onDataLoaded(item);
    }
}
