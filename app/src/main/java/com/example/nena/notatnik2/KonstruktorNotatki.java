package com.example.nena.notatnik2;

public class KonstruktorNotatki {


    private String title,
            content;

    public KonstruktorNotatki() {
    }

    public KonstruktorNotatki(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
