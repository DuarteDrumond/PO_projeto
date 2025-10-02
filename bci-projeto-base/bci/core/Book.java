package bci.core;

import java.io.Serializable;

public class Book implements Serializable {
  private static final long serialVersionUID = 1L;

  private String _title;
  private String _author;

  public Book(String title, String author) {
    _title = title;
    _author = author;
  }

  public String getTitle() { return _title; }
  public String getAuthor() { return _author; }

  @Override
  public String toString() {
    return _title + " (" + _author + ")";
  }
}

