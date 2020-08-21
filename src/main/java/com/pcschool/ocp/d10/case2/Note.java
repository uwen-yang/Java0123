package com.pcschool.ocp.d10.case2;

public class Note {

    private Note previousNote;
    private int data;
    private Note nexNote;

    public Note(Note previousNote, int data, Note nexNote) {
        this.previousNote = previousNote;
        this.data = data;
        this.nexNote = nexNote;
    }

    public Note(int data) {
        this(null, data, null);
    }

    public Note getPreviousNote() {
        return previousNote;
    }

    public void setPreviousNote(Note previousNote) {
        this.previousNote = previousNote;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Note getNexNote() {
        return nexNote;
    }

    public void setNexNote(Note nexNote) {
        this.nexNote = nexNote;
    }

    public String printNextNotes() {
        return "Note{" + "data=" + data + ", nexNote=" + nexNote + '}';
    }

    public String printPreviousNotes() {
        return "Note{" + "data=" + data + ", nexNote=" + previousNote + '}';
    }
}
