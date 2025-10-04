package modelandviewtwo.bookstore.domain;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Category {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int categoryid;
private String name;
@OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
private List<Book> books;
public Category(int categoryid, String name) {
this.categoryid = categoryid;
this.name = name;
}
public Category() {
this.categoryid = 0;
this.name = null;
}
public int getCategoryid() {
return categoryid;
}
public void setCategoryid(int categoryid) {
this.categoryid = categoryid;
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
return this.categoryid + this.name + this.books;
}
}
