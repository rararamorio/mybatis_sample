package jp.sample.mybatis.entity;

import java.io.Serializable;

public class Book implements Serializable {

  private Long bookId;

  private String name;

  private Category category;

  public Long getBookId() {
    return bookId;
  }

  public void setBookId(Long bookId) {
    this.bookId = bookId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Book [bookId=");
    builder.append(bookId);
    builder.append(", name=");
    builder.append(name);
    builder.append(", category=");
    builder.append(category);
    builder.append("]");
    return builder.toString();
  }

}
