package jp.sample.mybatis.entity;

import java.io.Serializable;
import java.util.List;

public class Person implements Serializable {

  private Long personId;

  private String name;

  private List<Book> books;

  public Long getPersonId() {
    return personId;
  }

  public void setPersonId(Long personId) {
    this.personId = personId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Person [personId=");
    builder.append(personId);
    builder.append(", name=");
    builder.append(name);
    builder.append(", books=");
    builder.append(books);
    builder.append("]");
    return builder.toString();
  }

}
