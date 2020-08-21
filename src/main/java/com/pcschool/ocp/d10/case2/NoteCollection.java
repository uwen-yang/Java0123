package com.pcschool.ocp.d10.case2;

public class NoteCollection {
    public static void main(String[] args) {
        Note n3 = new Note(80);
        Note n2 = new Note(90);
        Note n1 = new Note(100);
        
        n3.setPreviousNote(n2);
        n2.setNexNote(n3);
        n2.setPreviousNote(n1);
        System.out.println(n1.getNexNote());
        System.out.println(n3.getPreviousNotes());
    }
}
