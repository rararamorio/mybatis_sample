package jp.sample.mybatis.entity;

import java.io.Serializable;

public class Category implements Serializable {

  private Long categoryId;

  private String Name;

  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Category [categoryId=");
    builder.append(categoryId);
    builder.append(", Name=");
    builder.append(Name);
    builder.append("]");
    return builder.toString();
  }
}
